/**
 * 
 */
package it.xtypes.typing;

import it.xtypes.typesystem.EClassifierType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class EClassifierTypeSubtyping {

	@Inject
	protected EClassifierEquals eClassifierEquals;

	private PolymorphicDispatcher<Boolean> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("subtypeCase", 2, 2, this);

	/**
	 * Is type2 a subtype of type1
	 * 
	 * @param type1
	 * @param type2
	 * @return
	 */
	public boolean subtype(EClassifierType type1, EClassifierType type2) {
		if (type1 == null || type2 == null)
			return false;
		return subtype(type1.getEclassifier(), type2.getEclassifier());
	}

	/**
	 * Is type2 a subtype of type1
	 * 
	 * @param type1
	 * @param type2
	 * @return
	 */
	public boolean subtype(EClassifier type1, EClassifier type2) {
		return dispatcher.invoke(type1, type2);
	}

	/**
	 * Whether t2 EClass is a subtype of t1 EClassifier
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	protected boolean subtypeCase(EClassifier t1, EClass t2) {
		if (baseCase(t1, t2))
			return true;

		EList<EClass> superTypes = t2.getEAllSuperTypes();
		for (EClass superType : superTypes) {
			if (eClassifierEquals.equal(superType, t1))
				return true;
		}

		return false;
	}

	/**
	 * Whether t2 EClass is a subtype of t1 EClassifier
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	protected boolean subtypeCase(EClassifier t1, EClassifier t2) {
		return baseCase(t1, t2);
	}

	protected boolean baseCase(EClassifier t1, EClassifier t2) {
		return eClassifierEquals.equal(t1, t2);
	}
}
