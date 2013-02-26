/**
 * 
 */
package it.xtypes.runtime.util;

import it.xtypes.runtime.Variable;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Gets the desired object from the passed one, for instance given a variable
 * retrieves its value
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ObjectResolver {
	/**
	 * If the passed object is a Variable returns its value otherwise it returns
	 * the object itself.
	 * 
	 * @param object
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Object getValue(Object object) {
		if (object instanceof Variable) {
			Variable var = (Variable) object;
			return var.getValue();
		}
		return object;
	}

	public EObject getEObject(Object object) {
		if (object instanceof EObject) {
			return (EObject) object;
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List getList(Object object) {
		if (object instanceof List) {
			return (List) object;
		}
		return null;
	}
}
