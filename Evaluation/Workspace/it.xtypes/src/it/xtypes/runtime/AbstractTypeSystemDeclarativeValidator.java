/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.runtime.util.TraceFailureExceptionCollector;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

import com.google.inject.Inject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class AbstractTypeSystemDeclarativeValidator extends
		AbstractDeclarativeValidator {

	@Inject
	protected TraceFailureExceptionCollector traceFailureExceptionCollector;

	protected <T> void generateErrors(TypeSystemResult<T> result,
			EObject eObject, String issueCode) {
		RuleFailedException failure = result.getFailure();
		if (failure == null)
			return;
		generateErrors(failure, eObject, issueCode);
		List<RuleFailedException> failures = traceFailureExceptionCollector
				.getFailures(failure);
		for (RuleFailedException ruleFailedException : failures) {
			generateErrors(ruleFailedException, eObject, null);
		}
	}

	protected void generateErrors(RuleFailedException failure, EObject eObject,
			String issueCode) {
		EObject left = failure.getLeft();
		EObject right = failure.getRight();
		if (left == null && right == null) {
			generateErrorsForEObject(failure, eObject, issueCode);
		} else {
			generateErrorsForEObject(failure, left, issueCode);
			generateErrorsForEObject(failure, right, issueCode);
		}
	}

	protected void generateErrorsForEObject(RuleFailedException failure,
			EObject eObject, String issueCode) {
		if (eObject != null)
			error(failure.getMessage(), eObject, eObject.eClass()
					.getEIDAttribute(), issueCode);
	}

	/**
	 * Generates a default typing judgment environment (an empty one). Derived
	 * classes can override this, or the generated methods for getting the
	 * environment for a specific language element.
	 * 
	 * @param object
	 * @return
	 */
	protected TypingJudgmentEnvironment getDefaultTypingJudgmentEnvironmentFor(
			Object object) {
		return new TypingJudgmentEnvironment();
	}
}
