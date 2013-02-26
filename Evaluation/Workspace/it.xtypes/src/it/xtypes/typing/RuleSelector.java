/**
 * 
 */
package it.xtypes.typing;

import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.util.ConstantMatcher;

import java.util.LinkedList;
import java.util.List;

import com.google.inject.Inject;


/**
 * finds rules that match given specifications
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuleSelector {
	@Inject
	ExpressionTypeSubtyping expressionTypeSubtyping;

	@Inject
	ConstantMatcher constantMatcher;

	@Inject
	ExpressionTypingSystem typingSystem;

	@Inject
	ExpressionTypeEquals expressionTypeEquals;

	public List<Rule> findRules(List<Rule> rules, String typingJudgmentSymbol,
			String typeStatementRelation, ExpressionType left,
			ExpressionType right) {
		List<Rule> result = new LinkedList<Rule>();

		if (left == null || right == null)
			return result;

		// prefilter using typingJudgmentSymbol and typeStatementRelation
		rules = findRules(rules, typingJudgmentSymbol, typeStatementRelation);

		for (Rule rule : rules) {
			TypingJudgmentWithEnvironment typejudgment = rule.getTypejudgment();
			TypingStatement typingstatement = typejudgment.getTypingstatement();
			ExpressionType leftType = typingSystem
					.getExpressionType(typingstatement.getLeft());
			ExpressionType rightType = typingSystem
					.getExpressionType(typingstatement.getRight());
			if (leftType == null || rightType == null)
				continue;
			if (expressionTypeSubtyping.subtype(leftType, left)
					&& expressionTypeSubtyping.subtype(rightType, right))
				result.add(rule);
		}

		return result;
	}

	public List<Rule> findRules(List<Rule> rules, String typingJudgmentSymbol,
			String typeStatementRelation) {
		List<Rule> result = new LinkedList<Rule>();

		for (Rule rule : rules) {
			TypingJudgmentWithEnvironment typejudgment = rule.getTypejudgment();
			TypingStatement typingstatement = typejudgment.getTypingstatement();
			if (typejudgment.getTypejudgmentsymbol().equals(
					typingJudgmentSymbol)
					&& typingstatement.getRelation().equals(
							typeStatementRelation)) {
				result.add(rule);
			}
		}

		return result;
	}

	public List<Rule> findRules(List<Rule> rules, String typejudgmentsymbol,
			String relation, TypingStatementExpression left,
			TypingStatementExpression right) {
		List<Rule> result = findRules(rules, typejudgmentsymbol, relation,
				typingSystem.getExpressionType(left),
				typingSystem.getExpressionType(right));

		List<Rule> filtered = new LinkedList<Rule>();

		for (Rule rule : result) {
			TypingJudgmentWithEnvironment typejudgment = rule.getTypejudgment();
			TypingStatement typingstatement = typejudgment.getTypingstatement();
			if (constantMatcher.matchExp(typingstatement.getLeft(), left)
					&& constantMatcher.matchExp(typingstatement.getRight(),
							right)) {
				filtered.add(rule);
			}
		}

		return filtered;
	}

	public List<Rule> findRulesWithSameJudgment(Rule rule) {
		TypeSystemDefinition typeSystemDefinition = rule
				.getContainingTypeSystem();
		TypingJudgmentWithEnvironment typingJudgment = rule.getTypejudgment();
		List<Rule> rules = typeSystemDefinition.getRules();
		TypingStatement typingstatement = typingJudgment.getTypingstatement();
		TypingStatementExpression left = typingstatement.getLeft();
		ExpressionType leftType = typingSystem.getExpressionType(left);
		TypingStatementExpression right = typingstatement.getRight();
		ExpressionType rightType = typingSystem.getExpressionType(right);
		String typejudgmentsymbol = typingJudgment.getTypejudgmentsymbol();
		String relation = typingstatement.getRelation();
		List<Rule> result = findRules(rules, typejudgmentsymbol, relation);

		List<Rule> filtered = new LinkedList<Rule>();

		for (Rule otherRule : result) {
			if (otherRule == rule)
				continue;
			TypingJudgmentWithEnvironment typejudgment = otherRule
					.getTypejudgment();
			TypingStatement typestatement = typejudgment.getTypingstatement();
			TypingStatementExpression otherLeft = typestatement.getLeft();
			TypingStatementExpression otherRight = typestatement.getRight();
			if (expressionTypeEquals.equal(leftType,
					typingSystem.getExpressionType(otherLeft))
					&& expressionTypeEquals.equal(rightType,
							typingSystem.getExpressionType(otherRight))
					&& constantMatcher.matchExp(otherLeft, left)
					&& constantMatcher.matchExp(otherRight, right)) {
				filtered.add(otherRule);
			}
		}

		return filtered;
	}
}
