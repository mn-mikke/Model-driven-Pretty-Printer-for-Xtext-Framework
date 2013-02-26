/**
 * 
 */
package it.xtypes.typing;

import it.xtypes.typesystem.ArrayIndex;
import it.xtypes.typesystem.CastTo;
import it.xtypes.typesystem.Clone;
import it.xtypes.typesystem.CompoundExpression;
import it.xtypes.typesystem.Container;
import it.xtypes.typesystem.EnvironmentAccess;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.GetAll;
import it.xtypes.typesystem.Indexed;
import it.xtypes.typesystem.IndexedVariable;
import it.xtypes.typesystem.IntegerConstant;
import it.xtypes.typesystem.Length;
import it.xtypes.typesystem.NewName;
import it.xtypes.typesystem.Null;
import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.StringConstant;
import it.xtypes.typesystem.SubExpression;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typesystem.VariableReference;
import it.xtypes.typesystem.util.TypesystemSwitch;
import it.xtypes.util.AuxiliaryFunctions;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

/**
 * Infers the type (ExpressionType) of expressions
 * 
 * @author bettini
 * 
 */
public class ExpressionTypingSystem extends TypesystemSwitch<ExpressionType> {

	public static final String INT_TYPE = "Integer";

	public static final String STRING_TYPE = "String";

	ExpressionType intType;

	ExpressionType stringType;

	ExpressionType topType;

	ExpressionType nullType;

	@Inject
	protected MultiTypeMatcher multiTypeMatcher;

	@Inject
	protected RemoveMultiType removeMultiType;
	
	@Inject
	protected TypeOfMultiType typeOfMultiType;

	/**
	 * 
	 */
	public ExpressionTypingSystem() {
		intType = AuxiliaryFunctions.createBasicType(INT_TYPE);
		stringType = AuxiliaryFunctions.createBasicType(STRING_TYPE);
		topType = AuxiliaryFunctions.createBasicType("Object");
		nullType = AuxiliaryFunctions.createBasicType("null");
	}

	public ExpressionType getNullType() {
		return nullType;
	}

	@Override
	public ExpressionType caseCompoundExpression(CompoundExpression object) {
		// it's crucial to check also the main expression:
		// if it cannot be typed we must not access sub expressions
		// otherwise we have another scoping invocation, which invokes
		// the type system again and we get a cyclic resolution of lazy links
		if (getExpressionType(object.getMainExpression()) == null)
			return null;
		SubExpression subExpression = object.getSubExpression();
		return doSwitch(subExpression);
	}

	@Override
	public ExpressionType caseSubExpression(SubExpression object) {
		return getExpressionType(object.getFeature());
	}

	@Override
	public ExpressionType caseVariableReference(VariableReference object) {
		return doSwitch(object.getVarRef());
	}

	@Override
	public ExpressionType caseIndexedVariable(IndexedVariable object) {
		return getTypeOfMultiType(getExpressionType(object.getVarRef()));
	}

	@Override
	public ExpressionType caseIndexed(Indexed object) {
		return getTypeOfMultiType(getExpressionType(object.getFeature()));
	}

	@Override
	public ExpressionType caseVariableDeclaration(VariableDeclaration object) {
		EObject eContainer = object.eContainer();
		if (eContainer == null)
			return null;
		return doSwitch(eContainer);
	}

	@Override
	public ExpressionType caseVariableDeclarationWithType(
			VariableDeclarationWithType object) {
		return object.getExpressionType();
	}

	/**
	 * The type of a quantification is the type of its expression (without the
	 * multi feature)
	 * 
	 * @see it.xtypes.typesystem.util.TypesystemSwitch#caseLoop(it.xtypes.typesystem.Quantification)
	 */
	@Override
	public ExpressionType caseQuantification(Quantification object) {
		return removeMulti(getExpressionType(object.getExpression()));
	}

	@Override
	public ExpressionType caseIntegerConstant(IntegerConstant object) {
		return intType;
	}

	@Override
	public ExpressionType caseLength(Length object) {
		return intType;
	}

	/**
	 * we get the type of the main feature (if it's a list of T, we consider T)
	 * and then create a collection type of T
	 * 
	 * @see it.xtypes.typesystem.util.TypesystemSwitch#caseGetAll(it.xtypes.typesystem.GetAll)
	 */
	@Override
	public ExpressionType caseGetAll(GetAll object) {
		return AuxiliaryFunctions.createCollectionType(removeMultiType
				.removeMulti(getExpressionType(object.getMainfeature())));
	}

	@Override
	public ExpressionType caseStringConstant(StringConstant object) {
		return stringType;
	}

	/**
	 * the result of env(...) is the top type
	 * 
	 * @see it.xtypes.typesystem.util.TypesystemSwitch#caseEnvironmentAccess(it.xtypes.typesystem.EnvironmentAccess)
	 */
	@Override
	public ExpressionType caseEnvironmentAccess(EnvironmentAccess object) {
		if (getExpressionType(object.getArgument()) != null)
			return topType;
		return null;
	}

	@Override
	public ExpressionType caseContainer(Container object) {
		return topType;
	}

	@Override
	public ExpressionType caseNull(Null object) {
		return nullType;
	}

	@Override
	public ExpressionType caseCastTo(CastTo object) {
		return object.getType();
	}

	@Override
	public ExpressionType caseNewName(NewName object) {
		return stringType;
	}

	@Override
	public ExpressionType caseClone(Clone object) {
		return getExpressionType(object.getArgument());
	}

	/**
	 * Computes the ExpressionType of the passed Expression (or null if the type
	 * cannot be found)
	 * 
	 * @param expression
	 * @return
	 */
	public ExpressionType getExpressionType(Expression expression) {
		return doSwitch(expression);
	}

	public ExpressionType getExpressionType(
			TypingStatementExpression typingStatementExpression) {
		return doSwitch(typingStatementExpression);
	}

	public ExpressionType getExpressionType(
			VariableDeclaration variableDeclaration) {
		return doSwitch(variableDeclaration);
	}

	public ExpressionType getExpressionType(
			VariableDeclarationWithType variableDeclaration) {
		return doSwitch(variableDeclaration);
	}

	public ExpressionType getExpressionType(ArrayIndex index) {
		return doSwitch(index);
	}

	public ExpressionType getExpressionType(ENamedElement feature) {
		return AuxiliaryFunctions.getFeatureType(feature);
	}

	public boolean isInt(ExpressionType expressionType) {
		return expressionType == intType
				|| INT_TYPE.equals(AuxiliaryFunctions.getBasic(expressionType));
	}

	public boolean isString(ExpressionType expressionType) {
		return expressionType == stringType
				|| STRING_TYPE.equals(AuxiliaryFunctions
						.getBasic(expressionType));
	}

	public boolean isBasicType(ExpressionType expressionType) {
		return (expressionType != null)
				&& (isString(expressionType) || isInt(expressionType) || isTop(expressionType));
	}

	public boolean isMulti(ExpressionType expressionType) {
		return multiTypeMatcher.isMulti(expressionType);
	}

	public boolean isMulti(Expression expression) {
		return isMulti(getExpressionType(expression));
	}

	public boolean isMulti(VariableDeclaration variableDeclaration) {
		return isMulti(getExpressionType(variableDeclaration));
	}

	public boolean isMulti(VariableDeclarationWithType variableDeclaration) {
		return isMulti(getExpressionType(variableDeclaration));
	}

	public boolean isTop(ExpressionType expressionType) {
		return expressionType == topType;
	}

	public boolean isNull(ExpressionType expressionType) {
		return expressionType == nullType;
	}

	public ExpressionType removeMulti(ExpressionType expressionType) {
		return removeMultiType.removeMulti(expressionType);
	}

	public ExpressionType removeMulti(Expression expression) {
		return removeMultiType.removeMulti(getExpressionType(expression));
	}

	public ExpressionType getTypeOfMultiType(ExpressionType expressionType) {
		return typeOfMultiType.getTypeOfMultiType(expressionType);
	}
}
