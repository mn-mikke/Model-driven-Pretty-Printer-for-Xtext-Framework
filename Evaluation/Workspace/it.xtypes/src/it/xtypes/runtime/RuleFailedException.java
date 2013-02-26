/**
 * 
 */
package it.xtypes.runtime;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Represents the failure of a rule application
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuleFailedException extends Exception {

	/**
	 * The left element that caused problem in a rule application
	 */
	protected EObject left = null;

	/**
	 * The right element that caused problem in a rule application
	 */
	protected EObject right = null;

	/**
	 * the previous exception in the trace of failures
	 */
	protected RuleFailedException previous;

	protected RuntimeRule failedRule;

	protected String customMessage = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuleFailedException() {
		super();
	}

	public RuleFailedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		if (arg1 instanceof RuleFailedException) {
			this.previous = (RuleFailedException) arg1;
		}
	}

	public RuleFailedException(String arg0) {
		super(arg0);
	}

	public RuleFailedException(String arg0, Object left, Object right) {
		this(arg0, left, right, null);
	}

	public RuleFailedException(String arg0, Object left, Object right,
			RuleFailedException previous) {
		this(arg0);
		setLeft(left);
		setRight(right);
		this.previous = previous;
	}

	public RuleFailedException(String arg0, RuleFailedException previous) {
		this(arg0);
		this.previous = previous;
	}

	@SuppressWarnings("rawtypes")
	protected EObject getEObject(Object object) {
		if (object instanceof EObject) {
			return (EObject) object;
		} else if (object instanceof Variable) {
			return getEObject(((Variable) object).getValue());
		}
		return null;
	}

	public RuleFailedException(Throwable arg0) {
		super(arg0);
	}

	public EObject getLeft() {
		return left;
	}

	public EObject getRight() {
		return right;
	}

	public void setLeft(Object left) {
		this.left = getEObject(left);
	}

	public void setRight(Object right) {
		this.right = getEObject(right);
	}

	public void setObjectWithProblems(EObject objectWithProblems) {
		this.left = objectWithProblems;
	}

	public RuleFailedException getPrevious() {
		return previous;
	}

	public List<RuleFailedException> getFailureTrace() {
		LinkedList<RuleFailedException> list = new LinkedList<RuleFailedException>();
		list.add(this);
		RuleFailedException prev = previous;
		while (prev != null) {
			list.add(prev);
			prev = prev.getPrevious();
		}
		return list;
	}

	public RuntimeRule getFailedRule() {
		return failedRule;
	}

	public void setFailedRule(RuntimeRule failedRule) {
		this.failedRule = failedRule;
	}

	public RuleApplicationTrace getRuleApplicationTrace() {
		if (failedRule != null)
			return failedRule.getRuleApplicationTrace();
		return new RuleApplicationTrace();
	}

	public void setMessage(String string) {
		customMessage = string;
	}

	@Override
	public String getMessage() {
		if (customMessage != null)
			return customMessage;
		return super.getMessage();
	}

}
