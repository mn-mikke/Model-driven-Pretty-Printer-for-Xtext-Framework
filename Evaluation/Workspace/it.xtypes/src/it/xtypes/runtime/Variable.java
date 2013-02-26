/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.typesystem.ExpressionType;

/**
 * Runtime representation of a variable in the TypeSystem
 * 
 * @author Lorenzo Bettini
 * 
 */
public class Variable<T> {
	protected ExpressionType expressionType;

	protected T value = null;

	public Variable(ExpressionType expressionType, T value) {
		super();
		this.expressionType = expressionType;
		this.value = value;
	}

	public Variable(ExpressionType expressionType) {
		super();
		this.expressionType = expressionType;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public ExpressionType getExpressionType() {
		return expressionType;
	}
}
