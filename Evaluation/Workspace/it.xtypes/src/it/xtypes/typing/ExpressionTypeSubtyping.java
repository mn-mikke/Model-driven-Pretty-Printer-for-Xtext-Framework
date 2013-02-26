/**
 * 
 */
package it.xtypes.typing;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;

import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ExpressionTypeSubtyping {

	@Inject
	protected KnownCasesTypeMatcher knownCasesTypeMatcher;

	@Inject
	protected EClassifierTypeSubtyping eClassifierTypeSubtyping;

	private PolymorphicDispatcher<Boolean> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("subtypeCase", 2, 2, this);

	public boolean subtype(ExpressionType type1, ExpressionType type2) {
		if (type1 == null || type2 == null)
			return false;
		if (knownCasesTypeMatcher.subtype(type1, type2))
			return true;
		return dispatcher.invoke(type1, type2);
	}

	protected boolean subtypeCase(EClassifierType t1, EClassifierType t2) {
		return eClassifierTypeSubtyping.subtype(t1, t2);
	}

	protected boolean subtypeCase(CollectionType t1, CollectionType t2) {
		return t1.getCollection().equals(t2.getCollection())
				&& subtype(t1.getType(), t2.getType());
	}

	protected boolean subtypeCase(BasicType t1, BasicType t2) {
		return subtypeForBasic(t1.getBasic(), t2.getBasic());
	}

	protected boolean subtypeCase(ExpressionType t1, ExpressionType t2) {
		// all other cases are incompatible
		return false;
	}

	private boolean subtypeForBasic(String basic, String basic2) {
		return basic.equals(basic2);
	}

}
