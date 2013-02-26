/**
 * 
 */
package it.xtypes.runtime;

/**
 * Represents the result of the application of a TypeSystem rule.
 * 
 * If the failure is null then the application succeded, and the value can be
 * inspected (it might be null depending on the type of the applied rule).
 * 
 * If the application succeeds we also have the instance rule that was applied
 * (for instance, to get the application trace).
 * 
 * @author Lorenzo Bettini
 * 
 * @param <T>
 *            the type of the contained value
 */
public class TypeSystemResult<T> {
	protected T value = null;

	protected RuntimeRule rule = null;

	protected RuleFailedException failure = null;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public RuntimeRule getRule() {
		return rule;
	}

	public void setRule(RuntimeRule rule) {
		this.rule = rule;
	}

	public RuleFailedException getFailure() {
		return failure;
	}

	public void setFailure(RuleFailedException failure) {
		this.failure = failure;
	}

}
