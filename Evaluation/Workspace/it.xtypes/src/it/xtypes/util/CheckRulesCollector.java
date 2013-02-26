/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.StringConstant;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class CheckRulesCollector extends TypesystemSwitch<Boolean> {

	public List<Rule> collectCheckRules(
			TypeSystemDefinition typeSystemDefinition) {
		return collectCheckRules(typeSystemDefinition.getRules());
	}

	public List<Rule> collectCheckRules(List<Rule> rules) {
		List<Rule> checkRules = new LinkedList<Rule>();
		for (Rule rule : rules) {
			if (isCheckRule(rule))
				checkRules.add(rule);
		}
		return checkRules;
	}

	public boolean isCheckRule(Rule rule) {
		return isCheckStatement(rule.getTypejudgment().getTypingstatement());
	}

	public boolean isCheckStatement(TypingStatement typingstatement) {
		return isCheckExpression(typingstatement.getRight());
	}

	public boolean isCheckExpression(TypingStatementExpression expression) {
		return doSwitch(expression);
	}

	@Override
	public Boolean caseStringConstant(StringConstant object) {
		return object.getValue().equalsIgnoreCase("ok");
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}

}
