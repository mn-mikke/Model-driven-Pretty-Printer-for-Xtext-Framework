/**
 * 
 */
package it.xtypes.generator.util;

import it.xtypes.typesystem.TypeSystemDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author Lorenzo Bettini
 * 
 */
public class TypeSystemLoader {

	public static TypeSystemDefinition loadFromFile(String file) {
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(URI.createURI(file));
			InputStream in = new FileInputStream(file);
			resource.load(in, null);
			EcoreUtil.resolveAll(resource);
			EObject eobject = resource.getContents().get(0);
			return (TypeSystemDefinition) eobject;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
