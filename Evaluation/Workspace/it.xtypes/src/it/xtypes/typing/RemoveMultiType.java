package it.xtypes.typing;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.util.TypesystemSwitch;

/**
 * If the type is a multi type (for instance, CollectionType) returns the
 * inner type, for instance, given List[Class] returns Class; if it's not a multi
 * type then returns the type itself.
 * 
 * @author Lorenzo Bettini
 *
 */
public class RemoveMultiType extends TypesystemSwitch<ExpressionType> {
	@Override
	public ExpressionType caseCollectionType(CollectionType object) {
		return object.getType();
	}

	@Override
	public ExpressionType caseEClassifierType(EClassifierType object) {
		return object;
	}

	@Override
	public ExpressionType caseBasicType(BasicType object) {
		return object;
	}

	public ExpressionType removeMulti(ExpressionType expressionType) {
		if (expressionType == null)
			return null;
		return doSwitch(expressionType);
	}
}