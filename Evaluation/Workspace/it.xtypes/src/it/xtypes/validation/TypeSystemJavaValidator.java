package it.xtypes.validation;

import it.xtypes.typesystem.Assignment;
import it.xtypes.typesystem.CastTo;
import it.xtypes.typesystem.Container;
import it.xtypes.typesystem.Environment;
import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.Exists;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.ForAll;
import it.xtypes.typesystem.ForEach;
import it.xtypes.typesystem.Indexed;
import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Length;
import it.xtypes.typesystem.ListOperation;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typing.ExpressionTypeSubtyping;
import it.xtypes.typing.ExpressionTypingSystem;
import it.xtypes.typing.RuleSelector;
import it.xtypes.util.AuxiliaryFunctions;
import it.xtypes.util.CheckRulesCollector;
import it.xtypes.util.ExpToString;
import it.xtypes.util.TypeToString;
import it.xtypes.validation.AbstractTypeSystemJavaValidator;

import java.util.List;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class TypeSystemJavaValidator extends AbstractTypeSystemJavaValidator {

	@Inject
	protected ExpressionTypingSystem typingSystem;

	@Inject
	protected ExpressionTypeSubtyping subtyping;

	@Inject
	protected TypeToString typeToString;

	@Inject
	protected ExpToString expToString;

	@Inject
	protected RuleSelector ruleSelector;

	@Inject
	protected CheckRulesCollector checkRulesCollector;

	protected boolean useRuleSelector = true;

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
	// }
	// }

	/**
	 * Represents the situation when a multi feature is expected
	 */
	public static final String NOT_MULTI_FEATURE = "it.xtypes.NotMultiFeature";

	/**
	 * Represents the situation when an expression is not an integer
	 */
	public static final String NOT_NUMERIC_EXPRESSION = "it.xtypes.NotNumericExpression";

	/**
	 * Represents the situation when a variable declaration appears in the
	 * typing statement of a premise
	 */
	public static final String VAR_DECL_IN_TYPING_STATEMENT = "it.xtypes.VarDeclInTypingStatement";

	/**
	 * The final judgment does not contain a variable declaration
	 */
	public static final String VAR_DECL_MISSING = "it.xtypes.VarDeclMissing";

	/**
	 * The final judgment must not contain a variable declaration with an
	 * assignment
	 */
	public static final String VAR_DECL_WITH_ASSIGNMENT_IN_FINAL_JUDGMENT = "it.xtypes.VarDeclWithAssignInFinalJudgment";

	/**
	 * The type of the right expression does not match the type of the left
	 * expression in a Assignment
	 */
	public static final String TYPES_DONT_MATCH = "it.xtypes.TypesDontMatch";

	public static final String WRONG_CAST = "it.xtypes.WrongCast";

	public static final String WRONG_CONTAINER_ARG = "it.xtypes.WrongContainerArgument";

	public static final String WRONG_DERIVES_ENVIRONMENT = "it.xtypes.WrongDerivesEnvironment";

	public static final String RULE_NOT_FOUND = "it.xtypes.RuleNotFound";

	public static final String RULE_NOT_UNIQUE = "it.xtypes.RuleNotUnique";

	public static final String NO_RULE_FOR_JUDGMENT_DESCRIPTION = "it.xtypes.NoRuleForJudgmentDescription";

	public static final String LIST_IN_OK_RULE = "it.xtypes.ListInOkRule";

	public static final String DUPLICATE_JUDGMENT_DESCRIPTION = "it.xtypes.DuplicateJudgmentDescription";

	public void disableRuleSelector() {
		useRuleSelector = false;
	}

	public void enableRuleSelector() {
		useRuleSelector = true;
	}

	/**
	 * The accessed feature must be multiple
	 * 
	 * @param indexed
	 */
	@Check
	public void checkIndexed(Indexed indexed) {
		// the expression must be multiple
		isExpressionMultiFeature(indexed.getFeature());

		// the index must be numeric
		if (!typingSystem.isInt(typingSystem.getExpressionType(indexed
				.getIndex()))) {
			error("array index must be an integer expression",
					TypesystemPackage.Literals.INDEXED__INDEX,
					NOT_NUMERIC_EXPRESSION);
		}
	}

	/**
	 * The accessed feature must be multiple
	 * 
	 * @param indexed
	 */
	@Check
	public void checkLenght(Length length) {
		isExpressionMultiFeature(length.getArgument());
	}

	/**
	 * The expression of foreach must be multiple
	 * 
	 * @param forEach
	 */
	@Check
	public void checkForEach(ForEach forEach) {
		isExpressionMultiFeature(forEach.getExpression());
	}

	/**
	 * The expression of exists must be multiple
	 * 
	 * @param forEach
	 */
	@Check
	public void checkExists(Exists exists) {
		isExpressionMultiFeature(exists.getExpression());
	}

	/**
	 * The expression of forall must be numeric
	 * 
	 * @param forEach
	 */
	@Check
	public void checkForAll(ForAll forAll) {
		Expression exp = forAll.getExpression();
		if (!isNumeric(exp)) {
			error("forall expression must be an integer",
					TypesystemPackage.Literals.QUANTIFICATION__EXPRESSION,
					NOT_NUMERIC_EXPRESSION);
		}
	}

	/**
	 * Check whether the given expression is multi
	 * 
	 * @param exp
	 */
	private boolean isExpressionMultiFeature(Expression exp) {
		if (!isMulti(exp)) {
			error("not a multi feature expression",
					TypesystemPackage.Literals.EXPRESSION.getEIDAttribute(),
					NOT_MULTI_FEATURE);
			return false;
		}
		return true;
	}

	/**
	 * Check whether the given expression is multi
	 * 
	 * @param element
	 */
	private void isExpressionMultiFeature(ENamedElement element) {
		if (!isMulti(element)) {
			error("not a multi feature expression",
					TypesystemPackage.Literals.EXPRESSION.getEIDAttribute(),
					NOT_MULTI_FEATURE);
		}
	}

	/**
	 * Variable declarations can appear in a TypingStatement only if it's the
	 * final judgment, and also checks that there is a rule for the judgment
	 * 
	 * @param typingJudgment
	 */
	@Check
	public void checkTypingJudgmentWithEnvironment(
			TypingJudgmentWithEnvironment typingJudgment) {
		EObject container = typingJudgment.eContainer();

		// no check for the final judgment
		if (container instanceof Rule
				&& ((Rule) container).getTypejudgment() == typingJudgment) {
			return;
		}

		List<VariableDeclarationWithType> variableDeclarationWithTypes = AuxiliaryFunctions
				.getAllVariableDeclarationsWithType(typingJudgment);
		for (VariableDeclarationWithType variableDeclarationWithType : variableDeclarationWithTypes) {
			error("variable declaration cannot appear in a typing statement of a premise",
					variableDeclarationWithType,
					TypesystemPackage.Literals.VARIABLE_DECLARATION_WITH_TYPE
							.getEIDAttribute(), VAR_DECL_IN_TYPING_STATEMENT);

		}

		if (!useRuleSelector)
			return;

		Rule ruleContainer = getContainingRule(typingJudgment);
		if (ruleContainer == null)
			return;

		TypeSystemDefinition typeSystemDefinition = ruleContainer
				.getContainingTypeSystem();

		List<Rule> rules = typeSystemDefinition.getRules();

		TypingStatement typingstatement = typingJudgment.getTypingstatement();
		TypingStatementExpression left = typingstatement.getLeft();
		TypingStatementExpression right = typingstatement.getRight();

		String typejudgmentsymbol = typingJudgment.getTypejudgmentsymbol();
		String relation = typingstatement.getRelation();
		List<Rule> selected = ruleSelector.findRules(rules, typejudgmentsymbol,
				relation, left, right);

		String judgmentRepresentation = typejudgmentsymbol + " "
				+ expToString(left) + " " + relation + " " + expToString(right);
		if (selected.size() == 0) {
			error("no rule declared for " + judgmentRepresentation,
					typingJudgment,
					TypesystemPackage.Literals.TYPING_JUDGMENT_WITH_ENVIRONMENT
							.getEIDAttribute(), RULE_NOT_FOUND);
		}

	}

	protected Rule getContainingRule(
			TypingJudgmentWithEnvironment typingJudgment) {
		EObject containerIterator = typingJudgment.eContainer();
		while (containerIterator != null) {
			if (containerIterator instanceof Rule) {
				return (Rule) containerIterator;
			}
			containerIterator = containerIterator.eContainer();
		}

		return null;
	}

	/**
	 * The final (derives) judgment must have at least a variable
	 * 
	 * @param rule
	 */
	@Check
	public void checkRule(Rule rule) {
		TypingJudgmentWithEnvironment typingJudgment = rule.getTypejudgment();
		if (AuxiliaryFunctions.getAllVariableDeclarationsWithType(
				typingJudgment).size() == 0) {
			error("must define at least one variable", rule,
					TypesystemPackage.Literals.RULE__TYPEJUDGMENT,
					VAR_DECL_MISSING);
		}

		Environment environment = typingJudgment.getEnvironment();
		if (!(environment instanceof EnvironmentId)) {
			error("the environment of the final judgment must be an ID",
					environment,
					TypesystemPackage.Literals.ENVIRONMENT.getEIDAttribute(),
					WRONG_DERIVES_ENVIRONMENT);
		}

		List<VariableDeclarationWithType> variableDeclarations = AuxiliaryFunctions
				.getAllVariableDeclarationsWithType(typingJudgment);
		for (VariableDeclarationWithType variableDeclarationWithType : variableDeclarations) {
			if (variableDeclarationWithType.getRight() != null) {
				error("variable declaration in derives cannot contain an assignment",
						variableDeclarationWithType,
						TypesystemPackage.Literals.VARIABLE_DECLARATION_WITH_TYPE__RIGHT,
						VAR_DECL_WITH_ASSIGNMENT_IN_FINAL_JUDGMENT);
			}
		}

		checkForOtherRulesWithSameJudgment(rule);
		checkNoListForOkRule(rule);
	}

	protected void checkForOtherRulesWithSameJudgment(Rule rule) {
		List<Rule> otherRules = ruleSelector.findRulesWithSameJudgment(rule);
		if (otherRules.size() > 0) {
			String judgmentRepresentation = ruleJudgmentRepresentation(rule);
			error("duplicate rule with the same judgment "
					+ judgmentRepresentation, rule,
					TypesystemPackage.Literals.RULE__TYPEJUDGMENT,
					RULE_NOT_UNIQUE);
			for (Rule rule2 : otherRules) {
				error("duplicate rule with the same judgment "
						+ judgmentRepresentation, rule2,
						TypesystemPackage.Literals.RULE__TYPEJUDGMENT,
						RULE_NOT_UNIQUE);
			}
		}
	}

	protected void checkNoListForOkRule(Rule rule) {
		if (!checkRulesCollector.isCheckRule(rule))
			return;

		VariableDeclarationWithType leftVariableDeclaration = AuxiliaryFunctions
				.getLeftVariableDeclaration(rule);
		if (typingSystem.isMulti(leftVariableDeclaration)) {
			error("lists cannot appear in an 'OK' rule",
					leftVariableDeclaration,
					TypesystemPackage.Literals.VARIABLE_DECLARATION_WITH_TYPE
							.getEIDAttribute(), LIST_IN_OK_RULE);
		}
	}

	protected String ruleJudgmentRepresentation(Rule rule) {
		TypingStatement typingstatement = rule.getTypejudgment()
				.getTypingstatement();
		return rule.getTypejudgment().getTypejudgmentsymbol() + " "
				+ expToString(typingstatement.getLeft()) + " "
				+ typingstatement.getRelation() + " "
				+ expToString(typingstatement.getRight());
	}

	/**
	 * Right must have a subtype of left
	 * 
	 * @param assignment
	 */
	@Check
	public void checkAssignment(Assignment assignment) {
		Expression left = assignment.getLeft();
		Expression right = assignment.getRight();
		if (!matchTypes(left, right)) {
			error("right expression " + expToString(right)
					+ " must be a subtype of left expression "
					+ expToString(left), assignment,
					TypesystemPackage.Literals.ASSIGNMENT__RIGHT,
					TYPES_DONT_MATCH);
		}
	}

	@Check
	public void checkVariableDeclarationWithType(
			VariableDeclarationWithType variableDeclarationWithType) {
		Expression left = variableDeclarationWithType;
		Expression right = variableDeclarationWithType.getRight();
		if (right != null && !matchTypes(left, right)) {
			error("right expression " + expToString(right)
					+ " must be a subtype of left expression "
					+ expToString(left),
					variableDeclarationWithType,
					TypesystemPackage.Literals.VARIABLE_DECLARATION_WITH_TYPE__RIGHT,
					TYPES_DONT_MATCH);
		}
	}

	/**
	 * We must cast to a subtype
	 * 
	 * @param castTo
	 */
	@Check
	public void checkCastTo(CastTo castTo) {
		ExpressionType expType = typingSystem.getExpressionType(castTo
				.getExpression());
		if (expType == null) {
			error("cannot type cast expression "
					+ expToString(castTo.getExpression()), castTo,
					TypesystemPackage.Literals.CAST_TO__EXPRESSION, WRONG_CAST);
		}

		if (!matchTypes(castTo.getType(), expType)
				&& !matchTypes(expType, castTo.getType())) {
			error("cannot cast " + typeToString(expType)
					+ " to incompatible type " + typeToString(castTo.getType()),
					castTo, TypesystemPackage.Literals.CAST_TO__TYPE,
					WRONG_CAST);
		}
	}

	/**
	 * the argument of container must not be multi
	 * 
	 * @param castTo
	 */
	@Check
	public void checkContainer(Container container) {
		if (isMulti(container.getArgument())) {
			error("container argument must be an object", container,
					TypesystemPackage.Literals.CONTAINER__ARGUMENT,
					WRONG_CONTAINER_ARG);
		}
	}

	/**
	 * check that there's at least one rule for the specified judgment
	 * description
	 * 
	 * @param castTo
	 */
	@Check
	public void checkJudgmentDescription(JudgmentDescription judgmentDescription) {
		String judgmentsymbol = judgmentDescription.getJudgmentsymbol();
		String relation = judgmentDescription.getRelation();
		if (ruleSelector.findRules(
				AuxiliaryFunctions.getTypeSystemDefinition(judgmentDescription)
						.getRules(), judgmentsymbol, relation).size() == 0) {
			warning("no rule for judgment " + judgmentsymbol + " and "
					+ relation, judgmentDescription,
					TypesystemPackage.Literals.JUDGMENT_DESCRIPTION
							.getEIDAttribute(),
					NO_RULE_FOR_JUDGMENT_DESCRIPTION);
		}

		TypeSystemDefinition typeSystemDefinition = AuxiliaryFunctions
				.getTypeSystemDefinition(judgmentDescription);
		List<JudgmentDescription> judgmentDescriptions = typeSystemDefinition
				.getJudgmentDescriptions();
		for (JudgmentDescription judgmentDescription2 : judgmentDescriptions) {
			if (judgmentDescription2 != judgmentDescription
					&& judgmentDescription2.getJudgmentsymbol().equals(
							judgmentDescription.getJudgmentsymbol())
					&& judgmentDescription2.getRelation().equals(
							judgmentDescription.getRelation())) {
				error("duplicate judgment description", judgmentDescription,
						TypesystemPackage.Literals.JUDGMENT_DESCRIPTION
								.getEIDAttribute(),
						DUPLICATE_JUDGMENT_DESCRIPTION);
			}
		}
	}

	/**
	 * The expression of exists must be multiple
	 * 
	 * @param forEach
	 */
	@Check
	public void checkListOperation(ListOperation listOperation) {
		Expression left = listOperation.getLeft();
		if (!isExpressionMultiFeature(left))
			return;

		Expression right = listOperation.getRight();
		if (!matchTypes(typingSystem.removeMulti(left),
				typingSystem.getExpressionType(right))) {
			error("right expression " + expToString(right)
					+ " must be a subtype of elements of list type "
					+ expToString(left), listOperation,
					TypesystemPackage.Literals.LIST_OPERATION__RIGHT,
					TYPES_DONT_MATCH);
		}
	}

	protected boolean matchTypes(Expression left, Expression right) {
		return matchTypes(typingSystem.getExpressionType(left),
				typingSystem.getExpressionType(right));
	}

	protected boolean matchTypes(ExpressionType type, ExpressionType expType) {
		return typingSystem.isNull(expType)
				|| subtyping.subtype(type, expType);
	}

	private boolean isMulti(Expression expression) {
		return typingSystem.isMulti(expression);
	}

	private boolean isMulti(ENamedElement element) {
		return typingSystem.isMulti(typingSystem.getExpressionType(element));
	}

	private boolean isNumeric(Expression expression) {
		ExpressionType expressionType = typingSystem
				.getExpressionType(expression);
		if (expressionType == null || !typingSystem.isInt(expressionType))
			return false;
		return true;
	}

	public boolean isBasicType(ExpressionType expressionType) {
		return typingSystem.isBasicType(expressionType);
	}

	protected String typeToString(ExpressionType expressionType) {
		return typeToString.stringRep(expressionType);
	}

	protected String expToString(TypingStatementExpression expression) {
		String s = expToString.stringRep(expression);

		return typeToString.stringRep(typingSystem
				.getExpressionType(expression))
				+ (s != null ? " '" + s + "' " : "");
	}
}
