package gpp.boxmodel.utils;

import java.io.IOException;
import java.util.List;

import gpp.boxmodel.operators.boxModelOperators.Import;

import gpp.boxmodel.utils.ParserRuleOperatorApplicationNameInjector;
import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.boxModel.KeywordTerminalRuleFormatting;
import gpp.boxmodel.boxModel.TerminalRuleOperatorApplication;

import gpp.boxmodel.boxModel.TerminalRuleFormatting;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class BoxModelFromDslProvider implements IBoxModelProvider 
{
	
	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	private URI fileURI;
	
	private Issues outErrors;
	
	private boolean initialized = false;
	
	public void initialize(String fileURI, Issues outErrors)
	{
		this.fileURI = URI.createURI(fileURI);
		this.outErrors = outErrors;
		this.initialized = true;
	}
	
	public void initialize(URI fileURI, Issues outErrors)
	{
		this.fileURI = fileURI;
		this.outErrors = outErrors;
		this.initialized = true;
	}
	
	public ResourceSet getResourceSet()
	{
		return resourceSetProvider.get();
	}
	
	public BoxModel getBoxModel()
	{
		if(!this.initialized)
		{
			throw new IllegalStateException("The object is not initialized.");
		}
		// load the resource
		ResourceSet set = getResourceSet();
		LazyLinkingResource resource = (LazyLinkingResource)set.getResource(fileURI, true);
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new WrappedException(e);
		}
		EcoreUtil.resolveAll(resource);
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if(!list.isEmpty())
		{
			for(Issue issue : list)
			{
				outErrors.addError(issue.getMessage());
			}
			return null;
		}
		// TODO : Check situation with malformed uri.
		BoxModel returnValue = (BoxModel)resource.getContents().get(0);
		postProcessModel(returnValue);
		return returnValue;
	}
	
	private void postProcessModel(BoxModel boxModel)
	{
		addNameToTerminalRuleOperatorApplications(boxModel);
		addNameToParserRuleOperatorApplications(boxModel);
		normalizeTerminalRuleOperatorApplicationName(boxModel);
		convertUris(boxModel);
	}
	
	private void convertUris(BoxModel boxModel)
	{
		URIConverter converter = URIConverter.INSTANCE;
		converter.getURIMap().put(URI.createURI("platform:/resource/"),URI.createURI("platform:/plugin/"));
		boxModel.getXtextFile().setImportURI(converter.normalize(URI.createURI(boxModel.getXtextFile().getImportURI())).toString());
		for(Import imp : boxModel.getOperatorsSection().getImports())
		{
			imp.setImportURI(converter.normalize(URI.createURI(imp.getImportURI())).toString());
		}
	}
	
	private void normalizeTerminalRuleOperatorApplicationName(BoxModel boxModel) {
		String name = boxModel.getFormatting().getDefaultTerminalRuleFormatting().getName();
		boxModel.getFormatting().getDefaultTerminalRuleFormatting().setName(org.eclipse.xtext.util.Strings.toFirstUpper(name));
	}

	private void addNameToTerminalRuleOperatorApplications(BoxModel boxModel)
	{
		for(TerminalRuleFormatting formatting : boxModel.getFormatting().getTerminalRuleFormattings())
		{
			String name = org.eclipse.xtext.util.Strings.toFirstUpper(formatting.getRule().getName());
			for(TerminalRuleOperatorApplication op : formatting.getContent())
			{
				op.setName(name);
			}
		}
		for(KeywordTerminalRuleFormatting formatting : boxModel.getFormatting().getKeywordTerminalRuleFormattings())
		{
			String name = org.eclipse.xtext.util.Strings.toFirstUpper(formatting.getName());
			for(TerminalRuleOperatorApplication op : formatting.getContent())
			{
				op.setName(name);
			}
		}
		String name = org.eclipse.xtext.util.Strings.toFirstUpper(boxModel.getFormatting().getDefaultTerminalRuleFormatting().getName());
		for(TerminalRuleOperatorApplication op : boxModel.getFormatting().getDefaultTerminalRuleFormatting().getContent())
		{
			op.setName(name);
		}
	}
	
	private void addNameToParserRuleOperatorApplications(BoxModel boxModel)
	{
		ParserRuleOperatorApplicationNameInjector injector = new ParserRuleOperatorApplicationNameInjector();
		injector.injectNames(boxModel);
	}
	
	
}
