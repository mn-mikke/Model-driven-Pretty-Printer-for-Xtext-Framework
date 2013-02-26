/**
 * 
 */
package it.xtypes.linker;

import it.xtypes.typesystem.TypeSystemDefinition;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * Loads the GenModel of the corresponding grammar ecore
 * 
 * @author Lorenzo Bettini
 * 
 */
public class GenModelLoader {
	/**
	 * @param model
	 * @param genmodel
	 * @return
	 */
	public GenModel getGenModel(TypeSystemDefinition model) {
		String genmodel = getGenModelUri(model);

		return loadGenModel(model, genmodel);
	}

	/**
	 * @param model
	 * @param genmodelURI
	 * @return
	 */
	public GenModel loadGenModel(TypeSystemDefinition model, String genmodelURI) {
		if (genmodelURI == null)
			return null;

		// System.out.println("*** genmodel URI: " + genmodel);

		URI uri = URI.createURI(genmodelURI);

		ResourceSet resourceSet = model.eResource().getResourceSet();
		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();

		// make sure not to load it twice?
		if (!extensionToFactoryMap.containsKey("genmodel")) {
			EcoreResourceFactoryImpl ecoreFactory = new EcoreResourceFactoryImpl();
			extensionToFactoryMap.put("genmodel", ecoreFactory);
			GenModelPackage.eINSTANCE.eClass();
		}

		Resource resource = resourceSet.getResource(uri, true);

		/**
		 * ALTERNATIVE: ResourceSet resourceSet = new ResourceSetImpl();
		 * 
		 * Map<String, Object> extensionToFactoryMap = resourceSet
		 * .getResourceFactoryRegistry().getExtensionToFactoryMap();
		 * 
		 * EcoreResourceFactoryImpl ecoreFactory = new
		 * EcoreResourceFactoryImpl(); extensionToFactoryMap.put("genmodel",
		 * ecoreFactory); GenModelPackage.eINSTANCE.eClass();
		 * 
		 * Resource resource = resourceSet.getResource(uri, true); GenModel
		 * genModel = (GenModel) resource.getContents().get(0);
		 */

		GenModel genModel = (GenModel) resource.getContents().get(0);
		return genModel;
	}

	public String getGenModelUri(TypeSystemDefinition model) {
		String genModel = model.getGenModel();
		if (genModel != null)
			return genModel;

		String uri = getGenModelUriFromOriginalNsUri(model);

		if (uri == null)
			uri = getGenModelUriFromEPackage(model);

		return uri;
	}

	/**
	 * Tries to get the URI of the genmodel using the EPackage nsURI
	 * 
	 * @param model
	 * @return
	 */
	public String getGenModelUriFromEPackage(TypeSystemDefinition model) {
		EPackage ePackage = model.getEPackage();
		Map<String, URI> ePackageNsURIToGenModelLocationMap = EcorePlugin
				.getEPackageNsURIToGenModelLocationMap();
		String nsURI = ePackage.getNsURI();
		URI uri = ePackageNsURIToGenModelLocationMap.get(nsURI);
		if (uri != null)
			return uri.toString();
		return null;
	}

	/**
	 * Tries to get the URI of the genmodel using the original URI specified in
	 * the typesystem file: it appends the .genmodel extension to the original
	 * URI (removing the file extension from it)
	 * 
	 * @param model
	 * @return
	 */
	public String getGenModelUriFromOriginalNsUri(TypeSystemDefinition model) {
		String nsURI = model.getEPackageURI();
		URI uri = URI.createURI(nsURI);
		if (uri != null)
			return uri.trimFileExtension().toString() + ".genmodel";
		return null;
	}

}
