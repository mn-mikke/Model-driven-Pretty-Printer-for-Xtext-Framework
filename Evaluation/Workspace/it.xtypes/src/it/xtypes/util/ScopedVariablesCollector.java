/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

/**
 * @author bettini
 * 
 */
public class ScopedVariablesCollector extends
		TypesystemSwitch<List<VariableDeclaration>> {

	@Inject
	protected PreviousTypingJudgmentCollector previousTypingJudgmentCollector;

	public List<VariableDeclaration> collectVariablesInScope(EObject eObject) {
		List<TypingJudgment> previousJudgments = previousTypingJudgmentCollector
				.getPreviousJudgments(eObject);

		List<VariableDeclaration> result = AuxiliaryFunctions
				.selectVariableDeclarations(previousJudgments);

		Rule containingRule = AuxiliaryFunctions.getContainingRule(eObject);
		result.addAll(AuxiliaryFunctions
				.selectVariableDeclarations(containingRule.getTypejudgment()));

		result.addAll(collectVariablesOfContainer(eObject.eContainer()));

		return result;
	}

	protected List<VariableDeclaration> collectVariablesOfContainer(
			EObject container) {
		List<VariableDeclaration> variables = new LinkedList<VariableDeclaration>();

		if (container == null)
			return variables;

		if (container instanceof Quantification) {
			Quantification quantification = (Quantification) container;
			variables.add((VariableDeclaration) quantification
							.getVariable());
		}

		variables.addAll(collectVariablesOfContainer(container.eContainer()));
		return variables;
	}
}
