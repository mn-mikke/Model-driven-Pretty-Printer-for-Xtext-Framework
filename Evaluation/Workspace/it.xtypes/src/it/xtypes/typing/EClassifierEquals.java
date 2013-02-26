/**
 * 
 */
package it.xtypes.typing;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Lorenzo Bettini
 * 
 */
public class EClassifierEquals {
	/**
	 * Is type2 a subtype of type1
	 * 
	 * @param type1
	 * @param type2
	 * @return
	 */
	public boolean equal(EClassifier type1, EClassifier type2) {
		if (type1 == null || type2 == null)
			return false;
		if (!type1.getName().equals(type2.getName()))
			return false;
		EPackage ePackage1 = type1.getEPackage();
		EPackage ePackage2 = type2.getEPackage();
		if (ePackage1 == null && ePackage2 == null)
			return true; // should be true only in tests?
		if (ePackage1 == null || ePackage2 == null)
			return false;
		return ePackage1.getNsURI().equals(ePackage2.getNsURI());
	}

}
