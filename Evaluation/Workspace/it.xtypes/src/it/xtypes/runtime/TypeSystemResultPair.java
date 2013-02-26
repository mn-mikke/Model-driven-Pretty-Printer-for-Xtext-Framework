/**
 * 
 */
package it.xtypes.runtime;

/**
 * @author Lorenzo Bettini
 * @param <LeftT>
 * @param <RightT>
 * 
 */
public class TypeSystemResultPair<LeftT, RightT> extends
		TypeSystemResult<LeftRightPair<LeftT, RightT>> {

	public LeftT getLeft() {
		if (getValue() != null)
			return getValue().getLeft();
		return null;
	}

	public RightT getRight() {
		if (getValue() != null)
			return getValue().getRight();
		return null;
	}

	public void setLeft(LeftT left) {
		if (getValue() == null)
			setValue(new LeftRightPair<LeftT, RightT>());
		getValue().setLeft(left);
	}

	public void setRight(RightT right) {
		if (getValue() == null)
			setValue(new LeftRightPair<LeftT, RightT>());
		getValue().setRight(right);
	}
}
