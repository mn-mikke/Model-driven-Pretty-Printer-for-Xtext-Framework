/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.util;

import it.xtypes.typesystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.xtypes.typesystem.TypesystemPackage
 * @generated
 */
public class TypesystemSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TypesystemPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesystemSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TypesystemPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION:
      {
        TypeSystemDefinition typeSystemDefinition = (TypeSystemDefinition)theEObject;
        T result = caseTypeSystemDefinition(typeSystemDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.JUDGMENT_DESCRIPTION:
      {
        JudgmentDescription judgmentDescription = (JudgmentDescription)theEObject;
        T result = caseJudgmentDescription(judgmentDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.AXIOM:
      {
        Axiom axiom = (Axiom)theEObject;
        T result = caseAxiom(axiom);
        if (result == null) result = caseRule(axiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.RULE_WITH_PREMISES:
      {
        RuleWithPremises ruleWithPremises = (RuleWithPremises)theEObject;
        T result = caseRuleWithPremises(ruleWithPremises);
        if (result == null) result = caseRule(ruleWithPremises);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.TYPING_JUDGMENT:
      {
        TypingJudgment typingJudgment = (TypingJudgment)theEObject;
        T result = caseTypingJudgment(typingJudgment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.OR_TYPING_JUDGMENT:
      {
        OrTypingJudgment orTypingJudgment = (OrTypingJudgment)theEObject;
        T result = caseOrTypingJudgment(orTypingJudgment);
        if (result == null) result = caseTypingJudgment(orTypingJudgment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.OR_BRANCH:
      {
        OrBranch orBranch = (OrBranch)theEObject;
        T result = caseOrBranch(orBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE:
      {
        VariableDeclarationWithType variableDeclarationWithType = (VariableDeclarationWithType)theEObject;
        T result = caseVariableDeclarationWithType(variableDeclarationWithType);
        if (result == null) result = caseTypingJudgment(variableDeclarationWithType);
        if (result == null) result = caseVariableDeclaration(variableDeclarationWithType);
        if (result == null) result = caseExpression(variableDeclarationWithType);
        if (result == null) result = caseTypingStatementExpression(variableDeclarationWithType);
        if (result == null) result = caseArrayIndex(variableDeclarationWithType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.EXPRESSION_TYPE:
      {
        ExpressionType expressionType = (ExpressionType)theEObject;
        T result = caseExpressionType(expressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.COLLECTION_TYPE:
      {
        CollectionType collectionType = (CollectionType)theEObject;
        T result = caseCollectionType(collectionType);
        if (result == null) result = caseExpressionType(collectionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ECLASSIFIER_TYPE:
      {
        EClassifierType eClassifierType = (EClassifierType)theEObject;
        T result = caseEClassifierType(eClassifierType);
        if (result == null) result = caseExpressionType(eClassifierType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseExpressionType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.VARIABLE_SIMPLE_DECLARATION:
      {
        VariableSimpleDeclaration variableSimpleDeclaration = (VariableSimpleDeclaration)theEObject;
        T result = caseVariableSimpleDeclaration(variableSimpleDeclaration);
        if (result == null) result = caseVariableDeclaration(variableSimpleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.QUANTIFICATION:
      {
        Quantification quantification = (Quantification)theEObject;
        T result = caseQuantification(quantification);
        if (result == null) result = caseTypingJudgment(quantification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.FOR_EACH:
      {
        ForEach forEach = (ForEach)theEObject;
        T result = caseForEach(forEach);
        if (result == null) result = caseQuantification(forEach);
        if (result == null) result = caseTypingJudgment(forEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.FOR_ALL:
      {
        ForAll forAll = (ForAll)theEObject;
        T result = caseForAll(forAll);
        if (result == null) result = caseQuantification(forAll);
        if (result == null) result = caseTypingJudgment(forAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.EXISTS:
      {
        Exists exists = (Exists)theEObject;
        T result = caseExists(exists);
        if (result == null) result = caseQuantification(exists);
        if (result == null) result = caseTypingJudgment(exists);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.STANDARD_OPERATION:
      {
        StandardOperation standardOperation = (StandardOperation)theEObject;
        T result = caseStandardOperation(standardOperation);
        if (result == null) result = caseTypingJudgment(standardOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_OPERATION:
      {
        EnvironmentOperation environmentOperation = (EnvironmentOperation)theEObject;
        T result = caseEnvironmentOperation(environmentOperation);
        if (result == null) result = caseStandardOperation(environmentOperation);
        if (result == null) result = caseTypingJudgment(environmentOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.LIST_OPERATION:
      {
        ListOperation listOperation = (ListOperation)theEObject;
        T result = caseListOperation(listOperation);
        if (result == null) result = caseStandardOperation(listOperation);
        if (result == null) result = caseTypingJudgment(listOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseStandardOperation(assignment);
        if (result == null) result = caseTypingJudgment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.EQUALS:
      {
        Equals equals = (Equals)theEObject;
        T result = caseEquals(equals);
        if (result == null) result = caseStandardOperation(equals);
        if (result == null) result = caseTypingJudgment(equals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.FAIL:
      {
        Fail fail = (Fail)theEObject;
        T result = caseFail(fail);
        if (result == null) result = caseStandardOperation(fail);
        if (result == null) result = caseTypingJudgment(fail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.SUCCESS:
      {
        Success success = (Success)theEObject;
        T result = caseSuccess(success);
        if (result == null) result = caseStandardOperation(success);
        if (result == null) result = caseTypingJudgment(success);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT:
      {
        TypingJudgmentWithEnvironment typingJudgmentWithEnvironment = (TypingJudgmentWithEnvironment)theEObject;
        T result = caseTypingJudgmentWithEnvironment(typingJudgmentWithEnvironment);
        if (result == null) result = caseTypingJudgment(typingJudgmentWithEnvironment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ERROR_SPECIFICATION:
      {
        ErrorSpecification errorSpecification = (ErrorSpecification)theEObject;
        T result = caseErrorSpecification(errorSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.FAILURE_ERROR:
      {
        FailureError failureError = (FailureError)theEObject;
        T result = caseFailureError(failureError);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.TYPING_STATEMENT:
      {
        TypingStatement typingStatement = (TypingStatement)theEObject;
        T result = caseTypingStatement(typingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.TYPING_STATEMENT_EXPRESSION:
      {
        TypingStatementExpression typingStatementExpression = (TypingStatementExpression)theEObject;
        T result = caseTypingStatementExpression(typingStatementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_ID:
      {
        EnvironmentId environmentId = (EnvironmentId)theEObject;
        T result = caseEnvironmentId(environmentId);
        if (result == null) result = caseEnvironment(environmentId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_STATEMENT:
      {
        EnvironmentStatement environmentStatement = (EnvironmentStatement)theEObject;
        T result = caseEnvironmentStatement(environmentStatement);
        if (result == null) result = caseEnvironment(environmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.EMPTY_ENVIRONMENT:
      {
        EmptyEnvironment emptyEnvironment = (EmptyEnvironment)theEObject;
        T result = caseEmptyEnvironment(emptyEnvironment);
        if (result == null) result = caseEnvironment(emptyEnvironment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseTypingStatementExpression(expression);
        if (result == null) result = caseArrayIndex(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseExpression(stringConstant);
        if (result == null) result = caseTypingStatementExpression(stringConstant);
        if (result == null) result = caseArrayIndex(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.INTEGER_CONSTANT:
      {
        IntegerConstant integerConstant = (IntegerConstant)theEObject;
        T result = caseIntegerConstant(integerConstant);
        if (result == null) result = caseExpression(integerConstant);
        if (result == null) result = caseTypingStatementExpression(integerConstant);
        if (result == null) result = caseArrayIndex(integerConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.VARIABLE_ACCESS:
      {
        VariableAccess variableAccess = (VariableAccess)theEObject;
        T result = caseVariableAccess(variableAccess);
        if (result == null) result = caseExpression(variableAccess);
        if (result == null) result = caseTypingStatementExpression(variableAccess);
        if (result == null) result = caseArrayIndex(variableAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.VARIABLE_REFERENCE:
      {
        VariableReference variableReference = (VariableReference)theEObject;
        T result = caseVariableReference(variableReference);
        if (result == null) result = caseVariableAccess(variableReference);
        if (result == null) result = caseExpression(variableReference);
        if (result == null) result = caseTypingStatementExpression(variableReference);
        if (result == null) result = caseArrayIndex(variableReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.INDEXED_VARIABLE:
      {
        IndexedVariable indexedVariable = (IndexedVariable)theEObject;
        T result = caseIndexedVariable(indexedVariable);
        if (result == null) result = caseVariableAccess(indexedVariable);
        if (result == null) result = caseExpression(indexedVariable);
        if (result == null) result = caseTypingStatementExpression(indexedVariable);
        if (result == null) result = caseArrayIndex(indexedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.SUB_EXPRESSION:
      {
        SubExpression subExpression = (SubExpression)theEObject;
        T result = caseSubExpression(subExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ARRAY_INDEX:
      {
        ArrayIndex arrayIndex = (ArrayIndex)theEObject;
        T result = caseArrayIndex(arrayIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_ASSIGNMENT:
      {
        EnvironmentAssignment environmentAssignment = (EnvironmentAssignment)theEObject;
        T result = caseEnvironmentAssignment(environmentAssignment);
        if (result == null) result = caseEnvironmentOperation(environmentAssignment);
        if (result == null) result = caseStandardOperation(environmentAssignment);
        if (result == null) result = caseTypingJudgment(environmentAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_INCREMENT:
      {
        EnvironmentIncrement environmentIncrement = (EnvironmentIncrement)theEObject;
        T result = caseEnvironmentIncrement(environmentIncrement);
        if (result == null) result = caseEnvironmentOperation(environmentIncrement);
        if (result == null) result = caseStandardOperation(environmentIncrement);
        if (result == null) result = caseTypingJudgment(environmentIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_DECREMENT:
      {
        EnvironmentDecrement environmentDecrement = (EnvironmentDecrement)theEObject;
        T result = caseEnvironmentDecrement(environmentDecrement);
        if (result == null) result = caseEnvironmentOperation(environmentDecrement);
        if (result == null) result = caseStandardOperation(environmentDecrement);
        if (result == null) result = caseTypingJudgment(environmentDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.LIST_INCREMENT:
      {
        ListIncrement listIncrement = (ListIncrement)theEObject;
        T result = caseListIncrement(listIncrement);
        if (result == null) result = caseListOperation(listIncrement);
        if (result == null) result = caseStandardOperation(listIncrement);
        if (result == null) result = caseTypingJudgment(listIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.LIST_DECREMENT:
      {
        ListDecrement listDecrement = (ListDecrement)theEObject;
        T result = caseListDecrement(listDecrement);
        if (result == null) result = caseListOperation(listDecrement);
        if (result == null) result = caseStandardOperation(listDecrement);
        if (result == null) result = caseTypingJudgment(listDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.COMPOSED_ERROR:
      {
        ComposedError composedError = (ComposedError)theEObject;
        T result = caseComposedError(composedError);
        if (result == null) result = caseFailureError(composedError);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ERROR_STRING:
      {
        ErrorString errorString = (ErrorString)theEObject;
        T result = caseErrorString(errorString);
        if (result == null) result = caseFailureError(errorString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ERROR_EXPRESSION:
      {
        ErrorExpression errorExpression = (ErrorExpression)theEObject;
        T result = caseErrorExpression(errorExpression);
        if (result == null) result = caseFailureError(errorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_COMPOSITION:
      {
        EnvironmentComposition environmentComposition = (EnvironmentComposition)theEObject;
        T result = caseEnvironmentComposition(environmentComposition);
        if (result == null) result = caseEnvironment(environmentComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.ENVIRONMENT_ACCESS:
      {
        EnvironmentAccess environmentAccess = (EnvironmentAccess)theEObject;
        T result = caseEnvironmentAccess(environmentAccess);
        if (result == null) result = caseExpression(environmentAccess);
        if (result == null) result = caseTypingStatementExpression(environmentAccess);
        if (result == null) result = caseArrayIndex(environmentAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.LENGTH:
      {
        Length length = (Length)theEObject;
        T result = caseLength(length);
        if (result == null) result = caseExpression(length);
        if (result == null) result = caseTypingStatementExpression(length);
        if (result == null) result = caseArrayIndex(length);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.GET_ALL:
      {
        GetAll getAll = (GetAll)theEObject;
        T result = caseGetAll(getAll);
        if (result == null) result = caseExpression(getAll);
        if (result == null) result = caseTypingStatementExpression(getAll);
        if (result == null) result = caseArrayIndex(getAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = caseExpression(container);
        if (result == null) result = caseTypingStatementExpression(container);
        if (result == null) result = caseArrayIndex(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.CAST_TO:
      {
        CastTo castTo = (CastTo)theEObject;
        T result = caseCastTo(castTo);
        if (result == null) result = caseExpression(castTo);
        if (result == null) result = caseTypingStatementExpression(castTo);
        if (result == null) result = caseArrayIndex(castTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.NULL:
      {
        Null null_ = (Null)theEObject;
        T result = caseNull(null_);
        if (result == null) result = caseExpression(null_);
        if (result == null) result = caseTypingStatementExpression(null_);
        if (result == null) result = caseArrayIndex(null_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.NEW_NAME:
      {
        NewName newName = (NewName)theEObject;
        T result = caseNewName(newName);
        if (result == null) result = caseExpression(newName);
        if (result == null) result = caseTypingStatementExpression(newName);
        if (result == null) result = caseArrayIndex(newName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.CLONE:
      {
        Clone clone = (Clone)theEObject;
        T result = caseClone(clone);
        if (result == null) result = caseExpression(clone);
        if (result == null) result = caseTypingStatementExpression(clone);
        if (result == null) result = caseArrayIndex(clone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.COMPOUND_EXPRESSION:
      {
        CompoundExpression compoundExpression = (CompoundExpression)theEObject;
        T result = caseCompoundExpression(compoundExpression);
        if (result == null) result = caseExpression(compoundExpression);
        if (result == null) result = caseTypingStatementExpression(compoundExpression);
        if (result == null) result = caseArrayIndex(compoundExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.INDEXED:
      {
        Indexed indexed = (Indexed)theEObject;
        T result = caseIndexed(indexed);
        if (result == null) result = caseSubExpression(indexed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesystemPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = caseSubExpression(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type System Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type System Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSystemDefinition(TypeSystemDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Judgment Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Judgment Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJudgmentDescription(JudgmentDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxiom(Axiom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule With Premises</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule With Premises</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleWithPremises(RuleWithPremises object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typing Judgment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typing Judgment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypingJudgment(TypingJudgment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Typing Judgment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Typing Judgment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrTypingJudgment(OrTypingJudgment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrBranch(OrBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration With Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration With Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclarationWithType(VariableDeclarationWithType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionType(ExpressionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionType(CollectionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifierType(EClassifierType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Simple Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Simple Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableSimpleDeclaration(VariableSimpleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantification(Quantification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEach(ForEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForAll(ForAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExists(Exists object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardOperation(StandardOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentOperation(EnvironmentOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOperation(ListOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquals(Equals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFail(Fail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Success</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Success</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuccess(Success object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typing Judgment With Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typing Judgment With Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypingJudgmentWithEnvironment(TypingJudgmentWithEnvironment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorSpecification(ErrorSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Failure Error</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Failure Error</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFailureError(FailureError object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typing Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typing Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypingStatement(TypingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typing Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typing Statement Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypingStatementExpression(TypingStatementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentId(EnvironmentId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentStatement(EnvironmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyEnvironment(EmptyEnvironment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerConstant(IntegerConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAccess(VariableAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableReference(VariableReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedVariable(IndexedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubExpression(SubExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayIndex(ArrayIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentAssignment(EnvironmentAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentIncrement(EnvironmentIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentDecrement(EnvironmentDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListIncrement(ListIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListDecrement(ListDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composed Error</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composed Error</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposedError(ComposedError object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorString(ErrorString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorExpression(ErrorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentComposition(EnvironmentComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentAccess(EnvironmentAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLength(Length object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetAll(GetAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastTo(CastTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNull(Null object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewName(NewName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClone(Clone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundExpression(CompoundExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexed(Indexed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TypesystemSwitch
