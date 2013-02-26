package it.xtypes.runtime;

/**
 * This will be used to store the runtime representation of a TypingStatement
 * into an environment
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuntimeEnvironmentEntry {
	Object left;

	Object right;

	public RuntimeEnvironmentEntry(Object left, Object right) {
		super();
		this.left = left;
		this.right = right;
	}

	public Object getLeft() {
		return left;
	}

	public Object getRight() {
		return right;
	}

}
