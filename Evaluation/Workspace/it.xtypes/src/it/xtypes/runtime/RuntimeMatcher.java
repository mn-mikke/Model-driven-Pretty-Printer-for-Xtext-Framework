/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.typing.ExpressionTypeSubtyping;
import it.xtypes.typing.MultiTypeMatcher;

import java.util.List;

import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.inject.Inject;

/**
 * Matches variables and objects
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuntimeMatcher {

	@Inject
	protected ExpressionTypeSubtyping expressionTypeSubtyping;

	@Inject
	protected RuntimeTypeCreator runtimeTypeCreator;

	@Inject
	protected MultiTypeMatcher multiTypeMatcher;

	private PolymorphicDispatcher<Boolean> matchTypeDispatcher = PolymorphicDispatcher
			.createForSingleTarget("matchTypeCase", 2, 2, this);

	private PolymorphicDispatcher<Boolean> matchValueDispatcher = PolymorphicDispatcher
			.createForSingleTarget("matchValueCase", 2, 2, this);

	@SuppressWarnings("rawtypes")
	public boolean matchValue(Variable v, Object o) {
		if (o == null)
			return false;
		return matchValueDispatcher.invoke(v, o);
	}

	/**
	 * If the right variable has a value, we should use the value's type for
	 * checking the subtyping.
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	protected boolean matchValueCase(Variable v1, Variable v2) {
		if (v2.getValue() != null)
			return matchValueCase(v1, v2.getValue());
		return matchType(v1, v2);
	}

	@SuppressWarnings("rawtypes")
	protected boolean matchValueCase(Variable v, Object o) {
		if (!matchType(v, o))
			return false;
		return matchObjects(v.getValue(), o);
	}

	@SuppressWarnings("rawtypes")
	public boolean matchType(Variable v, Object o) {
		return matchTypeDispatcher.invoke(v, o);
	}

	@SuppressWarnings("rawtypes")
	public boolean matchTypeCase(Variable v1, Variable v2) {
		if (expressionTypeSubtyping.subtype(v1.getExpressionType(),
				v2.getExpressionType()))
			return true;
		return false;
	}

	@SuppressWarnings("rawtypes")
	public boolean matchTypeCase(Variable v1, Object o) {
		return matchVariableAndObject(v1, o);
	}

	@SuppressWarnings("rawtypes")
	public boolean matchTypeCase(Variable v1, List list) {
		if (list.size() == 0) {
			// otherwise we could not build a CollectionType with the
			// type of list elements (due to type erasure)
			return multiTypeMatcher.isMulti(v1.getExpressionType());
		}

		return matchVariableAndObject(v1, list);
	}

	@SuppressWarnings("rawtypes")
	protected boolean matchVariableAndObject(Variable v1, Object o) {
		if (expressionTypeSubtyping.subtype(v1.getExpressionType(),
				runtimeTypeCreator.createExpressionType(o)))
			return true;
		return false;
	}

	protected boolean matchObjects(Object object1, Object object2) {
		if (object1 == null || object2 == null) {
			return true;
		} else {
			return object1.equals(object2);
		}
	}

}
