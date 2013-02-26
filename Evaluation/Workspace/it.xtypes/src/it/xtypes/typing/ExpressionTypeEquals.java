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
public class ExpressionTypeEquals {

	@Inject
	protected EClassifierEquals eClassifierEquals;

	private PolymorphicDispatcher<Boolean> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("equalCase", 2, 2, this);

	public boolean equal(ExpressionType type1, ExpressionType type2) {
		if (type1 == null || type2 == null)
			return false;
		return dispatcher.invoke(type1, type2);
	}

	protected boolean equalCase(ExpressionType type1, ExpressionType type2) {
		return false;
	}

	protected boolean equalCase(EClassifierType t1, EClassifierType t2) {
		return eClassifierEquals
				.equal(t1.getEclassifier(), t2.getEclassifier());
	}

	protected boolean equalCase(CollectionType t1, CollectionType t2) {
		return t1.getCollection().equals(t2.getCollection())
				&& equal(t1.getType(), t2.getType());
	}

	protected boolean equalCase(BasicType t1, BasicType t2) {
		return t1.getBasic().equals(t2.getBasic());
	}

}
