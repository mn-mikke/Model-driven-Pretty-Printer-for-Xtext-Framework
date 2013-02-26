/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.StringConstant;

import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * Matcher for expressions (after their types has already been matched); this
 * makes sense only for constant expressions, otherwise it always returns true.
 * 
 * @author Lorenzo Bettini
 * 
 */
public class ConstantMatcher {

	private PolymorphicDispatcher<Boolean> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("match", 2, 2, this);

	public boolean matchExp(Object o1, Object o2) {
		return dispatcher.invoke(o1, o2);
	}

	protected boolean match(Object o1, Object o2) {
		return true;
	}
	
	protected boolean match(StringConstant o1, StringConstant o2) {
		return o1.getValue().equals(o2.getValue());
	}
}
