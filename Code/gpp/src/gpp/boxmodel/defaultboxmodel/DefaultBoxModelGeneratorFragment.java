package gpp.boxmodel.defaultboxmodel;

import gpp.boxmodel.boxModel.BoxModel;
import gpp.boxmodel.defaultboxmodel.defaultBoxModelDefinition.DefaultBoxModelDefinition;
import gpp.boxmodel.defaultboxmodel.utils.DefaultBoxModelDefinitionProvider;
import gpp.boxmodel.utils.BoxModelSerializer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.Naming;

import com.google.inject.Injector;

public class DefaultBoxModelGeneratorFragment extends AbstractGeneratorFragment
{
	
	private static final String BOXMODEL_FILE_EXTENSION = "ppf";
	
	private String defaultBoxModelDefinitionFileURI = null;
	
	private String outputBoxModelFileName = null;
	
	private DefaultBoxModelDefinition defaultBoxModelDefinition;
	
	public void setDefaultBoxModelDefinitionFileURI(String defaultBoxModelDefinitionFileURI)
	{
		this.defaultBoxModelDefinitionFileURI = defaultBoxModelDefinitionFileURI;
	}
	
	public void setOutputBoxModelFileNameh(String outputBoxModelFileURI)
	{
		this.outputBoxModelFileName = outputBoxModelFileURI;
	}
	
	@Override
	public void checkConfiguration(Issues issues)
	{
		if(defaultBoxModelDefinitionFileURI == null)
		{
			issues.addError("The 'defaultBoxModelDefinitionFileURI' is mandatory.");
		}
		else
		{
			Injector injector = new DefaultBoxModelDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration();
			DefaultBoxModelDefinitionProvider defaultBoxModelDefinitionProvider = injector.getInstance(DefaultBoxModelDefinitionProvider.class);
			this.defaultBoxModelDefinition = defaultBoxModelDefinitionProvider.getDefaultBoxModelDefinition(defaultBoxModelDefinitionFileURI, issues);
		}
	}		
	
	protected List<Object> getParameters(Grammar grammar)
	{
		List<Object> returnValue = new ArrayList<Object>();
		String parameter = getBoxModelFileContent(grammar);
		returnValue.add(parameter);
		String outputBoxModelFilePath = getBoxModelFilePath(grammar, getNaming());
		returnValue.add(outputBoxModelFilePath);
		return returnValue;
	}
	
	protected String getBoxModelFileContent(Grammar grammar)
	{
		Xtext2PlainBoxModelTransformer transformer = new Xtext2PlainBoxModelTransformer();
		BoxModel model = transformer.transformToModel(grammar);
		DefaultBoxModelInjector dInjector = new DefaultBoxModelInjector();
		dInjector.inject(model, grammar, defaultBoxModelDefinition);
		model.getXtextFile().setImportURI(transformClapathURI(grammar, model.getXtextFile().getImportURI()));
		BoxModelSerializer serializer = new BoxModelSerializer();
		return serializer.generate(model);
	}
	
	protected String transformClapathURI(Grammar grammar, String uri)
	{
		if(uri.startsWith("classpath:"))
		{
			String projectName = grammar.eResource().getURI().trimFileExtension().trimSegments(1).toString().substring("classpath:/".length()).replace('/', '.');
			return "platform:/resource/" + projectName  + "/src" + uri.substring("classpath:".length());
		}
		return uri;
	}
	
	public String getBoxModelFilePath(Grammar grammar, Naming naming) {
		String boxModelFileName = null;
		if(outputBoxModelFileName == null)
		{
			boxModelFileName = GrammarUtil.getName(grammar);
		}
		else
		{
			boxModelFileName = outputBoxModelFileName;
		}
		return  grammar.eResource().getURI().trimFileExtension().trimSegments(1).appendSegment(boxModelFileName).appendFileExtension(BOXMODEL_FILE_EXTENSION).toString().substring("classpath:/".length());
	}
}
