package gpp.boxmodel.scoping;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;

import com.google.inject.Inject;

public class GppLoadOnDemandResourceDescriptions extends LoadOnDemandResourceDescriptions{
	
	private IResourceDescriptions delegate;
	private Resource context;
	
	@Inject
	private  GppXtextResourceDescriptionManager xtextResourceDescriptionManager;
	
	@Override
	public void initialize(IResourceDescriptions delegate, Collection<URI> validUris, Resource context) {
		super.initialize(delegate, validUris, context);
		this.delegate = delegate;
		this.context = context;
	}
	
	@Override
	public IResourceDescription getResourceDescription(URI uri) {
		if(uri.fileExtension().equals("xtext"))
		{
			IResourceDescription result = null;
			Resource resource = EcoreUtil2.getResource(context, uri.toString());
			if (resource != null) {
				result = xtextResourceDescriptionManager.getResourceDescription(resource);
			}
			return result;
		}
		else 
		{
			return super.getResourceDescription(uri);
		}
		
	}

}
