/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.StringConstant;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.util.TypesystemSwitch;

/**
 * @author Lorenzo Bettini
 * 
 */
public class ExpToString extends TypesystemSwitch<String> {

	public String stringRep(TypingStatementExpression typingStatementExpression) {
		return doSwitch(typingStatementExpression);
	}

	@Override
	public String caseStringConstant(StringConstant object) {
		return object.getValue();
	}

}
