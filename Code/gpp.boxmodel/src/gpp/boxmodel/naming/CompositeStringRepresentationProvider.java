package gpp.boxmodel.naming;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

public abstract class CompositeStringRepresentationProvider implements IStringRepresentationProvider 
{
	protected final HashMap<String,IStringRepresentationProvider> specificProviders = new HashMap<String,IStringRepresentationProvider>();
	
	protected IStringRepresentationProvider getStringRepresentationProvider(EObject obj)
	{
		String elementName = obj.eClass().getName();
		return specificProviders.get(elementName);
	}
}