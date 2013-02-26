package gpp.boxmodel.defaultboxmodel.utils;

import java.util.List;

import gpp.boxmodel.defaultboxmodel.defaultBoxModelDefinition.DefaultBoxModelDefinition;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class DefaultBoxModelDefinitionProvider {
	
	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	public DefaultBoxModelDefinition getDefaultBoxModelDefinition(URI fileURI, Issues issues)
	{
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		LazyLinkingResource resource = (LazyLinkingResource)set.getResource(fileURI, true);
		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {

			for (Issue issue : list) {
				issues.addError(issue.getMessage());
			}
		}
		return (DefaultBoxModelDefinition)resource.getContents().get(0);
	}
	
	public DefaultBoxModelDefinition getDefaultBoxModelDefinition(String fileURI, Issues issues)
	{
		return getDefaultBoxModelDefinition(URI.createURI(fileURI), issues);
	}

}
