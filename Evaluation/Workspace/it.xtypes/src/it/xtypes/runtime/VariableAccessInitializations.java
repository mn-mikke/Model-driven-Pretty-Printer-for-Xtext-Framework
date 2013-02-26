/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.typesystem.Assignment;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.VariableAccess;
import it.xtypes.typesystem.VariableReference;
import it.xtypes.util.PreviousTypingJudgmentCollector;

import java.util.List;

import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.inject.Inject;

/**
 * Maps a variable access to the initialization
 * 
 * @author Lorenzo Bettini
 * 
 */
public class VariableAccessInitializations {

	@Inject
	protected PreviousTypingJudgmentCollector previousTypingJudgmentCollector;

	private PolymorphicDispatcher<Expression> processDispatcher = PolymorphicDispatcher
			.createForSingleTarget("processJudgment", 2, 3, this);

	public Expression getInitializationExpression(VariableAccess variableAccess) {
		List<TypingJudgment> previousTypingJudgments = previousTypingJudgmentCollector
				.getPreviousJudgments(variableAccess);
		
		return processJudgments(variableAccess, previousTypingJudgments);
	}

	/**
	 * @param typingJudgments
	 */
	public Expression processJudgments(VariableAccess variableAccess,
			List<TypingJudgment> typingJudgments) {
		for (TypingJudgment typingJudgment : typingJudgments) {
			Expression expression = process(variableAccess, typingJudgment);
			if (expression != null)
				return expression;
		}
		return null;
	}

	protected Expression process(VariableAccess variableAccess,
			TypingJudgment typingJudgment) {
		return processDispatcher.invoke(variableAccess, typingJudgment);
	}

	protected Expression processJudgment(VariableAccess variableAccess,
			TypingJudgment typingJudgment) {
		return null;
	}

	protected Expression processJudgment(VariableAccess variableAccess,
			Quantification quantification) {
		if (variableAccess.getVarRef() == quantification.getVariable())
			return quantification.getExpression();
		return null;
	}

	protected Expression processJudgment(VariableAccess variableAccess,
			Assignment assignment) {
		return processDispatcher.invoke(variableAccess, assignment.getLeft(),
				assignment.getRight());
	}

	protected Expression processJudgment(VariableAccess variableAccess,
			Expression left, Expression right) {
		return null;
	}

	protected Expression processJudgment(VariableAccess variableAccess, VariableReference variableReference,
			Expression right) {
		if (variableAccess.getVarRef() == variableReference.getVarRef())
			return right;
		return null;
	}
}
