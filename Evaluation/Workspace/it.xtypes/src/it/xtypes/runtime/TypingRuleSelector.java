/**
 * 
 */
package it.xtypes.runtime;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 * 
 *         Selects the typing rule with the matching typing judgment
 */
public class TypingRuleSelector {

	@Inject
	RuntimeMatcher runtimeMatcher;

	/**
	 * Selects the typing rule
	 * 
	 * @param rules
	 * @param typeJudgmentSymbol
	 * @param typeStatementRelation
	 * @param left
	 * @param right
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public RuntimeRule select(RuntimeRules rules, String typeJudgmentSymbol,
			String typeStatementRelation, Object left, Object right) {
		if (left == null || right == null)
			return null;

		RuntimeRule candidate = null;

		for (RuntimeRule rule : rules) {
			if (typeJudgmentSymbol.equals(rule.getTypeJudgmentSymbol())
					&& typeStatementRelation.equals(rule
							.getTypeStatementSymbol())) {
				Variable leftVar = rule.getLeft();
				Variable rightVar = rule.getRight();
				if (variablesMatch(leftVar, left, rightVar, right)) {
					if (candidate == null) {
						candidate = rule;
					} else {
						Variable candidateLeftVar = candidate.getLeft();
						// Variable candidateRightVar = candidate.getRight();
						// let's see if this one is better than the candidate
						if (match(candidateLeftVar, leftVar))
							candidate = rule;
					}
				}
			}
		}

		return candidate;
	}

	@SuppressWarnings("rawtypes")
	public boolean variablesMatch(Variable leftVar, Object left,
			Variable rightVar, Object right) {
		return match(leftVar, left) && match(rightVar, right);
	}

	@SuppressWarnings("rawtypes")
	protected boolean match(Variable variable, Object object) {
		return runtimeMatcher.matchValue(variable, object);
	}

}
