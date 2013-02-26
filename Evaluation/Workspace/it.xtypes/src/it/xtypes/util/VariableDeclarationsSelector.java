/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author bettini
 * 
 */
public class VariableDeclarationsSelector extends
		TypesystemSwitch<List<VariableDeclaration>> {

	public List<VariableDeclaration> selectVariableDeclarations(
			List<TypingJudgment> typingJudgments) {
		List<VariableDeclaration> variableDeclarations = new LinkedList<VariableDeclaration>();
		for (TypingJudgment typingJudgment : typingJudgments) {
			variableDeclarations
					.addAll(selectVariableDeclarations(typingJudgment));
		}
		return variableDeclarations;
	}

	public List<VariableDeclaration> selectVariableDeclarations(
			TypingJudgment typingJudgment) {
		return doSwitch(typingJudgment);
	}

	public List<VariableDeclaration> selectVariableDeclarations(
			TypingStatement typingStatement) {
		LinkedList<VariableDeclaration> result = new LinkedList<VariableDeclaration>();
		result.addAll(doSwitch(typingStatement.getLeft()));
		result.addAll(doSwitch(typingStatement.getRight()));
		return result;
	}

	@Override
	public List<VariableDeclaration> defaultCase(EObject object) {
		return new LinkedList<VariableDeclaration>();
	}

	@Override
	public List<VariableDeclaration> caseVariableDeclarationWithType(
			VariableDeclarationWithType object) {
		return newList(object);
	}

	@Override
	public List<VariableDeclaration> caseTypingJudgmentWithEnvironment(
			TypingJudgmentWithEnvironment object) {
		return selectVariableDeclarations(object.getTypingstatement());
	}

	private List<VariableDeclaration> newList(
			VariableDeclaration variableDeclaration) {
		LinkedList<VariableDeclaration> result = new LinkedList<VariableDeclaration>();
		result.add(variableDeclaration);
		return result;
	}

}
