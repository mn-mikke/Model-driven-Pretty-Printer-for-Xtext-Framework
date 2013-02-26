package gpp.boxmodel.provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.ResourceEntityHandlerImpl;

public class ResourceEntityHandlerWithUriConvertor extends ResourceEntityHandlerImpl {

	private URIConverter uriConverter;
	
	public ResourceEntityHandlerWithUriConvertor(String entityName, URIConverter uriConverter) {
		super(entityName);
		this.uriConverter = uriConverter;
	}
	
	public String getEntityName(String entityValue)
	{	  
		entityValue = uriConverter.normalize(URI.createURI(entityValue)).toString();
		return super.getEntityName(entityValue);
	}

}
