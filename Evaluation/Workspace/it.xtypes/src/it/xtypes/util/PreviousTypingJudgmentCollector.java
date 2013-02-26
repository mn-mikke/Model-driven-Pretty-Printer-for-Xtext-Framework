/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.Axiom;
import it.xtypes.typesystem.OrBranch;
import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.util.TypesystemSwitch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * Collects judgments which occurs before a given one (including the ones of the
 * containers)
 * 
 * @author bettini
 * 
 */
public class PreviousTypingJudgmentCollector extends
		TypesystemSwitch<List<TypingJudgment>> {

	private PolymorphicDispatcher<List<TypingJudgment>> processDispatcher = PolymorphicDispatcher
			.createForSingleTarget("processJudgment", 2, 2, this);

	public List<TypingJudgment> getPreviousJudgments(EObject eObject) {
		TypingJudgment containingTypingJudgment = AuxiliaryFunctions
				.getContainingTypingJudgment(eObject);
		return getPreviousJudgments(containingTypingJudgment);
	}

	public List<TypingJudgment> getPreviousJudgments(
			TypingJudgment typingJudgment) {
		return getPreviousJudgments(typingJudgment, typingJudgment.eContainer());
	}

	protected List<TypingJudgment> getPreviousJudgments(EObject eObject,
			EObject eContainer) {
		if (eContainer == null)
			return new LinkedList<TypingJudgment>();
		return processDispatcher.invoke(eObject, eContainer);
	}

	protected List<TypingJudgment> processJudgment(
			TypingJudgment typingJudgment, Axiom rule) {
		return new LinkedList<TypingJudgment>();
	}

	protected List<TypingJudgment> processJudgment(
			TypingJudgment typingJudgment, RuleWithPremises rule) {
		return processJudgments(typingJudgment, rule.getPremises());
	}

	protected List<TypingJudgment> processJudgment(
			TypingJudgment typingJudgment, Quantification quantification) {
		List<TypingJudgment> previousJudgments = processJudgments(
				typingJudgment, quantification.getJudgments());
		previousJudgments.add(quantification);
		previousJudgments.addAll(getPreviousJudgments(quantification));
		return previousJudgments;
	}

	protected List<TypingJudgment> processJudgment(
			TypingJudgment typingJudgment, OrBranch orBranch) {
		List<TypingJudgment> previousJudgments = new LinkedList<TypingJudgment>();
		previousJudgments.addAll(processJudgments(typingJudgment,
				orBranch.getJudgments()));
		previousJudgments.addAll(getPreviousJudgments(orBranch.eContainer()));
		return previousJudgments;
	}

	protected List<TypingJudgment> processJudgments(
			TypingJudgment typingJudgment, EList<TypingJudgment> judgments) {
		int position = judgments.indexOf(typingJudgment);
		if (position != -1) {
			List<TypingJudgment> previousJudgments = new LinkedList<TypingJudgment>(
					judgments.subList(0, position));
			Collections.reverse(previousJudgments);
			return previousJudgments;
		}
		return new LinkedList<TypingJudgment>();
	}

}
