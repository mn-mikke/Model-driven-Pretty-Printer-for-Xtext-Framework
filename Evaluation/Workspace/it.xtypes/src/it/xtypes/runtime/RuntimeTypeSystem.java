package it.xtypes.runtime;

import it.xtypes.runtime.operations.JudgmentOperations;
import it.xtypes.runtime.util.AuxiliaryFunctionsRuntime;
import it.xtypes.runtime.util.ObjectResolver;
import it.xtypes.typesystem.ExpressionType;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

/**
 * A Runtime representation of the typing system
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuntimeTypeSystem {

	protected RuntimeRules rules = new RuntimeRules();

	@Inject
	protected JudgmentOperations judgmentOperations;

	@Inject
	protected TypingRuleSelector typingRuleSelector;

	@Inject
	protected ObjectResolver objectResolver;

	@Inject
	protected RuntimeMatcher runtimeMatcher;

	protected int newNameUID = 0;

	@Inject
	protected StringProvider stringProvider;

	public RuntimeTypeSystem(RuntimeRules rules) {
		setRules(rules);
	}

	public RuntimeTypeSystem() {
	}

	public StringProvider getStringProvider() {
		return stringProvider;
	}

	public void setStringProvider(StringProvider stringProvider) {
		this.stringProvider = stringProvider;
	}

	/**
	 * @param rules
	 */
	public void setRules(RuntimeRules rules) {
		this.rules = rules;
		for (RuntimeRule runtimeRule : rules) {
			runtimeRule.setRuntimeTypeSystem(this);
		}
	}

	public JudgmentOperations getStandardOperations() {
		return judgmentOperations;
	}

	public TypingRuleSelector getTypingRuleSelector() {
		return typingRuleSelector;
	}

	public ExpressionType createBasicType(String basic) {
		return AuxiliaryFunctionsRuntime.createBasicType(basic);
	}

	public ExpressionType createEClassifierType(EClassifier eClassifier) {
		return AuxiliaryFunctionsRuntime.createEClassifierType(eClassifier);
	}

	public ExpressionType createCollectionType(ExpressionType expressionType) {
		return AuxiliaryFunctionsRuntime.createCollectionType(expressionType);
	}

	public boolean equals(Object left, Object right) throws RuleFailedException {
		if (!judgmentOperations.equals(left, right))
			throw new RuleFailedException("comparison failed: "
					+ stringRep(left) + " and " + stringRep(right)
					+ " are not equal", left, right);
		return true;
	}

	public boolean notEquals(Object left, Object right)
			throws RuleFailedException {
		if (!judgmentOperations.notEquals(left, right))
			throw new RuleFailedException("comparison failed: "
					+ stringRep(left) + " and " + stringRep(right)
					+ " are equal", left, right);
		return true;
	}

	@SuppressWarnings("unchecked")
	public <T> T castto(Object exp, Class<T> clazz) throws RuleFailedException {
		if (!judgmentOperations.checkCast(exp, clazz))
			throw new RuleFailedException(stringRep(exp)
					+ " cannot be cast to " + stringRep(clazz), exp, null);
		return (T) objectResolver.getValue(exp);
	}

	@SuppressWarnings("rawtypes")
	public void assignment(Variable var, Object right) {
		judgmentOperations.assignment(var, right);
	}

	public int length(Object object) throws RuleFailedException {
		int len = 0;

		try {
			len = judgmentOperations.length(object);
		} catch (NullPointerException e) {
			throw new RuleFailedException(stringRep(object) + " is null");
		} catch (ClassCastException e) {
			throw new RuleFailedException(stringRep(object) + " is not a list");
		}

		return len;
	}

	public <T> List<T> getAll(EObject eObject, String mainFeature,
			String extendFeature) throws RuleFailedException {
		return judgmentOperations.getAll(eObject, mainFeature, extendFeature);
	}

	public TypingJudgmentEnvironment union(TypingJudgmentEnvironment e1,
			TypingJudgmentEnvironment e2) throws RuleFailedException {
		TypingJudgmentEnvironment union = judgmentOperations.union(e1, e2);
		if (union == null) {
			throw new RuleFailedException("environment union failed");
		}
		return union;
	}

	public TypingJudgmentEnvironment union(TypingJudgmentEnvironment e1,
			RuntimeEnvironmentEntry e2) throws RuleFailedException {
		TypingJudgmentEnvironment union = judgmentOperations.union(e1, e2);
		if (union == null) {
			throw new RuleFailedException("environment union failed");
		}
		return union;
	}

	public TypingJudgmentEnvironment union(RuntimeEnvironmentEntry e1,
			RuntimeEnvironmentEntry e2) throws RuleFailedException {
		TypingJudgmentEnvironment union = judgmentOperations.union(e1, e2);
		if (union == null) {
			throw new RuleFailedException("environment union failed");
		}
		return union;
	}

	public Object env(TypingJudgmentEnvironment environment, Object key)
			throws RuleFailedException {
		Object result = judgmentOperations.env(environment, key);
		if (result == null) {
			throw new RuleFailedException("cannot find mapping for "
					+ stringRep(key) + " in environment");
		}
		return result;
	}

	public TypingJudgmentEnvironment envListCons(
			TypingJudgmentEnvironment head, TypingJudgmentEnvironment tail) {
		return judgmentOperations.envListCons(head, tail);
	}

	public TypingJudgmentEnvironment envListCons(
			TypingJudgmentEnvironment head, RuntimeEnvironmentEntry tail) {
		return judgmentOperations.envListCons(head, tail);
	}

	public TypingJudgmentEnvironment envListCons(RuntimeEnvironmentEntry head,
			TypingJudgmentEnvironment tail) {
		return judgmentOperations.envListCons(head, tail);
	}

	public String newName(String value) {
		return value + (++newNameUID);
	}

	public EObject container(EObject object) throws RuleFailedException {
		if (object == null) {
			throw new RuleFailedException("null container argument");
		}
		return object.eContainer();
	}

	public <T> T clone(T object) {
		return judgmentOperations.clone(object);
	}

	public <T> List<T> clone(List<T> list) {
		return judgmentOperations.clone(list);
	}

	public RuntimeRule select(String typeJudgmentSymbol,
			String typeStatementRelation, Object left, Object right)
			throws RuleFailedException {
		RuntimeRule select = typingRuleSelector.select(rules,
				typeJudgmentSymbol, typeStatementRelation, left, right);

		if (select == null) {
			throw new RuleFailedException("cannot find a rule for "
					+ typeJudgmentSymbol + " " + stringRep(left) + " "
					+ typeStatementRelation + " " + stringRep(right));
		}

		return select;
	}

	public RuntimeRule applyRule(TypingJudgmentEnvironment environment,
			String typeJudgmentSymbol, String typeStatementRelation,
			Object left, Object right) throws RuleFailedException {
		RuntimeRule rule = select(typeJudgmentSymbol, typeStatementRelation,
				left, right);

		return applyRule(rule, environment, left, right);
	}

	/**
	 * @param rule
	 * @param environment
	 * @param left
	 * @param right
	 * @return the instance rule applied
	 * @throws RuleFailedException
	 */
	public RuntimeRule applyRule(RuntimeRule rule,
			TypingJudgmentEnvironment environment, Object left, Object right)
			throws RuleFailedException {
		RuntimeRule newInstance = rule.newInstance();
		newInstance.setEnvironment(environment);
		newInstance.setRuntimeTypeSystem(rule.getRuntimeTypeSystem());
		setValue(newInstance.getLeft(), left);
		setValue(newInstance.getRight(), right);
		try {
			newInstance.apply();
		} catch (RuleFailedException e) {
			e.setFailedRule(newInstance);
			throw e;
		}
		updateVariable(newInstance.getLeft(), left);
		updateVariable(newInstance.getRight(), right);
		return newInstance;
	}

	/**
	 * Tries to apply a rule for the specified typingJudgmentSymbol (and
	 * typingStatementRelation), and the passed left object, and stores the
	 * result of the right value (or failure) in the returned TypeSystemResult.
	 * 
	 * Note: this will be used by the derived RuntimeTypeSystem automatically
	 * generated.
	 * 
	 * @param <RightType>
	 *            the type of the right object
	 * @param <LeftType>
	 *            the type of the left object
	 * @param environment
	 * @param typingJudgmentSymbol
	 * @param typingStatementRelation
	 * @param leftExpressionType
	 * @param rightExpressionType
	 * @param leftObject
	 *            the actual object that is passed to the rule as the left part
	 * @return
	 */
	public <RightType, LeftType> TypeSystemResult<RightType> tryToApply(
			TypingJudgmentEnvironment environment, String typingJudgmentSymbol,
			String typingStatementRelation, ExpressionType leftExpressionType,
			ExpressionType rightExpressionType, LeftType leftObject) {
		TypeSystemResult<RightType> result = new TypeSystemResult<RightType>();

		try {
			Variable<RightType> rightVar = new Variable<RightType>(
					rightExpressionType);
			Variable<LeftType> leftVar = new Variable<LeftType>(
					leftExpressionType);
			leftVar.setValue(leftObject);
			RuntimeRule rule = applyRule(environment, typingJudgmentSymbol,
					typingStatementRelation, leftVar, rightVar);
			result.setValue(rightVar.getValue());
			result.setRule(rule);
		} catch (RuleFailedException e) {
			result.setFailure(e);
		}

		return result;
	}

	public <RightType, LeftType> TypeSystemResultPair<LeftType, RightType> tryToApplyPair(
			TypingJudgmentEnvironment environment, String typingJudgmentSymbol,
			String typingStatementRelation, ExpressionType leftExpressionType,
			ExpressionType rightExpressionType, LeftType leftObject,
			RightType rightObject) {
		TypeSystemResultPair<LeftType, RightType> result = new TypeSystemResultPair<LeftType, RightType>();

		try {
			Variable<RightType> rightVar = new Variable<RightType>(
					rightExpressionType);
			rightVar.setValue(rightObject);
			Variable<LeftType> leftVar = new Variable<LeftType>(
					leftExpressionType);
			leftVar.setValue(leftObject);
			RuntimeRule rule = applyRule(environment, typingJudgmentSymbol,
					typingStatementRelation, leftVar, rightVar);
			result.setLeft(leftVar.getValue());
			result.setRight(rightVar.getValue());
			result.setRule(rule);
		} catch (RuleFailedException e) {
			result.setFailure(e);
		}

		return result;
	}

	/**
	 * Tries to apply a rule for the specified typingJudgmentSymbol (and
	 * typingStatementRelation), to the leftObject and rightObject, and stores
	 * the result (true in case of success or failure) in the returned
	 * TypeSystemResult.
	 * 
	 * Note: this will be used by the derived RuntimeTypeSystem automatically
	 * generated.
	 * 
	 * @param <RightType>
	 * @param <LeftType>
	 * @param environment
	 * @param typingJudgmentSymbol
	 * @param typingStatementRelation
	 * @param leftExpressionType
	 * @param rightExpressionType
	 * @param leftObject
	 * @param rightObject
	 * @return
	 */
	public <RightType, LeftType> TypeSystemResult<Boolean> tryToApply(
			TypingJudgmentEnvironment environment, String typingJudgmentSymbol,
			String typingStatementRelation, ExpressionType leftExpressionType,
			ExpressionType rightExpressionType, LeftType leftObject,
			RightType rightObject) {
		TypeSystemResult<Boolean> result = new TypeSystemResult<Boolean>();

		try {
			Variable<RightType> rightVar = new Variable<RightType>(
					rightExpressionType);
			rightVar.setValue(rightObject);
			Variable<LeftType> leftVar = new Variable<LeftType>(
					leftExpressionType);
			leftVar.setValue(leftObject);
			RuntimeRule rule = applyRule(environment, typingJudgmentSymbol,
					typingStatementRelation, leftVar, rightVar);
			result.setValue(true);
			result.setRule(rule);
		} catch (RuleFailedException e) {
			result.setFailure(e);
		}

		return result;
	}

	/**
	 * @param variable
	 * @param object
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void setValue(Variable variable, Object object) {
		if (variable.getValue() == null) {
			variable.setValue(objectResolver.getValue(object));
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void updateVariable(Variable source, Object dest)
			throws RuleFailedException {
		if (dest instanceof Variable) {
			Variable destVar = (Variable) dest;

			Object value = source.getValue();

			if (value != null && !runtimeMatcher.matchType(destVar, value)) {
				throw new RuleFailedException(stringRep(value)
						+ " cannot be assigned to " + stringRep(dest));
			}

			destVar.setValue(value);
		}
	}

	/**
	 * @param object
	 * @return
	 */
	public String stringRep(Object object) {
		return stringProvider.string(object);
	}
}
