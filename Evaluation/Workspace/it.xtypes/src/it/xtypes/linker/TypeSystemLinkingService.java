/**
 * 
 */
package it.xtypes.linker;

import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemPackage;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Inject;

/**
 * @author bettini
 * 
 */
public class TypeSystemLinkingService extends DefaultLinkingService {

	private static final Logger log = Logger
			.getLogger(TypeSystemLinkingService.class);

	@Inject
	private IValueConverterService valueConverterService;

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			INode node) throws IllegalNodeException {
		//System.out.println("LINKER: " + ref);
		//System.out.println("LINKER: " + context);
		//System.out.println("LINKER: " + node);
		if (ref == TypesystemPackage.eINSTANCE.getTypeSystemDefinition_EPackage()) {
			return getPackage((TypeSystemDefinition) context, (ILeafNode) node);
		}
		return super.getLinkedObjects(context, ref, node);
	}

	private List<EObject> getPackage(TypeSystemDefinition context, ILeafNode text) {
		String nsUri = getMetamodelNsURI(text);
		if (nsUri == null) {
			return Collections.emptyList();
		}
		EPackage ePackage = loadEPackage(nsUri, context.eResource()
				.getResourceSet());
		if (ePackage != null) {
			// store the nsURI in TypeSystemDefinition
			context.setEPackageURI(nsUri);
			return Collections.<EObject> singletonList(ePackage);
		}
		return Collections.emptyList();
	}

	/**
	 * Converts the passed string (which includes " ") into
	 * a valid URI
	 * 
	 * @param text
	 * @return
	 */
	private String getMetamodelNsURI(ILeafNode text) {
		try {
			return (String) valueConverterService.toValue(text.getText(),
					getLinkingHelper()
							.getRuleNameFrom(text.getGrammarElement()), text);
		} catch (ValueConverterException e) {
			log.debug("Exception on leaf '" + text.getText() + "'", e);
			return null;
		}
	}

	private EPackage loadEPackage(String resourceOrNsURI,
			ResourceSet resourceSet) {
		if (EPackage.Registry.INSTANCE.containsKey(resourceOrNsURI))
			return EPackage.Registry.INSTANCE.getEPackage(resourceOrNsURI);
		try {
			URI uri = URI.createURI(resourceOrNsURI);
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				EPackage result = (EPackage) resource.getContents().get(0);
				return result;
			}
			return (EPackage) resourceSet.getEObject(uri, true);

		} catch (RuntimeException ex) {
			log.trace("Cannot load package with URI '" + resourceOrNsURI + "'",
					ex);
			System.out.println("LINKER: " + "Cannot load package with URI '"
					+ resourceOrNsURI + "', " + ex);
		}
		return null;
	}

}
