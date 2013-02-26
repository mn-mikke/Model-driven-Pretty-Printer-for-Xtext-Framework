package gpp.boxmodel.naming;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

@ImplementedBy(GppXtextStringRepresentationProvider.class)
public interface IStringRepresentationProvider {
	String getStringRepresentation(final EObject obj);
	
}
