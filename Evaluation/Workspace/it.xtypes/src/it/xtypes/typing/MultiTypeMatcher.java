/**
 * 
 */
package it.xtypes.typing;

import it.xtypes.typesystem.ExpressionType;

import com.google.inject.Inject;

/**
 * Whether a type can be considered multi
 * 
 * @author Lorenzo Bettini
 * 
 */
public class MultiTypeMatcher {

	@Inject
	protected TypeOfMultiType typeOfMultiType;

	public boolean isMulti(ExpressionType expressionType) {
		return typeOfMultiType.getTypeOfMultiType(expressionType) != null;
	}
}
