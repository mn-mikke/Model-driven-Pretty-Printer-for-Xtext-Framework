package it.xtypes.typing;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;

import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * known cases for subtyping.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class KnownCasesTypeMatcher {

	private PolymorphicDispatcher<Boolean> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("subtypeCase", 2, 2, this);

	public boolean subtype(ExpressionType t1, ExpressionType t2) {
		if (t1 == null || t2 == null)
			return false;
		return dispatcher.invoke(t1, t2);
	}

	protected boolean subtypeCase(BasicType t1, ExpressionType t2) {
		return isObject(t1);
	}

	protected boolean isObject(BasicType t1) {
		return t1.getBasic().equals("Object");
	}

	protected boolean subtypeCase(EClassifierType t1, BasicType t2) {
		String eclassifierName = t1.getEclassifier().getName();
		String basicName = t2.getBasic();
		return subtypeTypeStrings(eclassifierName, basicName);
	}

	protected boolean subtypeCase(BasicType t1, EClassifierType t2) {
		if (isObject(t1))
			return true;
		String eclassifierName = t2.getEclassifier().getName();
		String basicName = t1.getBasic();
		return subtypeTypeStrings(eclassifierName, basicName);
	}

	/**
	 * Generic case which always returns false
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	protected boolean subtypeCase(ExpressionType t1, ExpressionType t2) {
		return false;
	}

	protected boolean subtypeTypeStrings(String eclassifierName,
			String basicName) {
		return (eclassifierName.equals("EString") && basicName
				.equals(ExpressionTypingSystem.STRING_TYPE))
				|| (eclassifierName.equals("EInt") && basicName
						.equals(ExpressionTypingSystem.INT_TYPE));
	}

}
