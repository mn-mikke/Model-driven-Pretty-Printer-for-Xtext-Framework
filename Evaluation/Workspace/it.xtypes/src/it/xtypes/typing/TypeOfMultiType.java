package it.xtypes.typing;

import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.util.TypesystemSwitch;

/**
 * If the type is a multi type (for instance, CollectionType) returns the inner
 * type, for instance, given List[Class] returns Class otherwise it returns
 * null.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class TypeOfMultiType extends TypesystemSwitch<ExpressionType> {
	@Override
	public ExpressionType caseCollectionType(CollectionType object) {
		return object.getType();
	}

	public ExpressionType getTypeOfMultiType(ExpressionType expressionType) {
		if (expressionType == null)
			return null;
		return doSwitch(expressionType);
	}
}