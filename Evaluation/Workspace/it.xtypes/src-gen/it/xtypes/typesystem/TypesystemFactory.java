/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.xtypes.typesystem.TypesystemPackage
 * @generated
 */
public interface TypesystemFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypesystemFactory eINSTANCE = it.xtypes.typesystem.impl.TypesystemFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Type System Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type System Definition</em>'.
   * @generated
   */
  TypeSystemDefinition createTypeSystemDefinition();

  /**
   * Returns a new object of class '<em>Judgment Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Judgment Description</em>'.
   * @generated
   */
  JudgmentDescription createJudgmentDescription();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axiom</em>'.
   * @generated
   */
  Axiom createAxiom();

  /**
   * Returns a new object of class '<em>Rule With Premises</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule With Premises</em>'.
   * @generated
   */
  RuleWithPremises createRuleWithPremises();

  /**
   * Returns a new object of class '<em>Typing Judgment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typing Judgment</em>'.
   * @generated
   */
  TypingJudgment createTypingJudgment();

  /**
   * Returns a new object of class '<em>Or Typing Judgment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Typing Judgment</em>'.
   * @generated
   */
  OrTypingJudgment createOrTypingJudgment();

  /**
   * Returns a new object of class '<em>Or Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Branch</em>'.
   * @generated
   */
  OrBranch createOrBranch();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declaration With Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration With Type</em>'.
   * @generated
   */
  VariableDeclarationWithType createVariableDeclarationWithType();

  /**
   * Returns a new object of class '<em>Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Type</em>'.
   * @generated
   */
  ExpressionType createExpressionType();

  /**
   * Returns a new object of class '<em>Collection Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Type</em>'.
   * @generated
   */
  CollectionType createCollectionType();

  /**
   * Returns a new object of class '<em>EClassifier Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClassifier Type</em>'.
   * @generated
   */
  EClassifierType createEClassifierType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>Variable Simple Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Simple Declaration</em>'.
   * @generated
   */
  VariableSimpleDeclaration createVariableSimpleDeclaration();

  /**
   * Returns a new object of class '<em>Quantification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantification</em>'.
   * @generated
   */
  Quantification createQuantification();

  /**
   * Returns a new object of class '<em>For Each</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Each</em>'.
   * @generated
   */
  ForEach createForEach();

  /**
   * Returns a new object of class '<em>For All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For All</em>'.
   * @generated
   */
  ForAll createForAll();

  /**
   * Returns a new object of class '<em>Exists</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists</em>'.
   * @generated
   */
  Exists createExists();

  /**
   * Returns a new object of class '<em>Standard Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Operation</em>'.
   * @generated
   */
  StandardOperation createStandardOperation();

  /**
   * Returns a new object of class '<em>Environment Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Operation</em>'.
   * @generated
   */
  EnvironmentOperation createEnvironmentOperation();

  /**
   * Returns a new object of class '<em>List Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Operation</em>'.
   * @generated
   */
  ListOperation createListOperation();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equals</em>'.
   * @generated
   */
  Equals createEquals();

  /**
   * Returns a new object of class '<em>Fail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fail</em>'.
   * @generated
   */
  Fail createFail();

  /**
   * Returns a new object of class '<em>Success</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Success</em>'.
   * @generated
   */
  Success createSuccess();

  /**
   * Returns a new object of class '<em>Typing Judgment With Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typing Judgment With Environment</em>'.
   * @generated
   */
  TypingJudgmentWithEnvironment createTypingJudgmentWithEnvironment();

  /**
   * Returns a new object of class '<em>Error Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Specification</em>'.
   * @generated
   */
  ErrorSpecification createErrorSpecification();

  /**
   * Returns a new object of class '<em>Failure Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Failure Error</em>'.
   * @generated
   */
  FailureError createFailureError();

  /**
   * Returns a new object of class '<em>Typing Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typing Statement</em>'.
   * @generated
   */
  TypingStatement createTypingStatement();

  /**
   * Returns a new object of class '<em>Typing Statement Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typing Statement Expression</em>'.
   * @generated
   */
  TypingStatementExpression createTypingStatementExpression();

  /**
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns a new object of class '<em>Environment Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Id</em>'.
   * @generated
   */
  EnvironmentId createEnvironmentId();

  /**
   * Returns a new object of class '<em>Environment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Statement</em>'.
   * @generated
   */
  EnvironmentStatement createEnvironmentStatement();

  /**
   * Returns a new object of class '<em>Empty Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Environment</em>'.
   * @generated
   */
  EmptyEnvironment createEmptyEnvironment();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Integer Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Constant</em>'.
   * @generated
   */
  IntegerConstant createIntegerConstant();

  /**
   * Returns a new object of class '<em>Variable Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Access</em>'.
   * @generated
   */
  VariableAccess createVariableAccess();

  /**
   * Returns a new object of class '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Reference</em>'.
   * @generated
   */
  VariableReference createVariableReference();

  /**
   * Returns a new object of class '<em>Indexed Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed Variable</em>'.
   * @generated
   */
  IndexedVariable createIndexedVariable();

  /**
   * Returns a new object of class '<em>Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Expression</em>'.
   * @generated
   */
  SubExpression createSubExpression();

  /**
   * Returns a new object of class '<em>Array Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Index</em>'.
   * @generated
   */
  ArrayIndex createArrayIndex();

  /**
   * Returns a new object of class '<em>Environment Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Assignment</em>'.
   * @generated
   */
  EnvironmentAssignment createEnvironmentAssignment();

  /**
   * Returns a new object of class '<em>Environment Increment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Increment</em>'.
   * @generated
   */
  EnvironmentIncrement createEnvironmentIncrement();

  /**
   * Returns a new object of class '<em>Environment Decrement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Decrement</em>'.
   * @generated
   */
  EnvironmentDecrement createEnvironmentDecrement();

  /**
   * Returns a new object of class '<em>List Increment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Increment</em>'.
   * @generated
   */
  ListIncrement createListIncrement();

  /**
   * Returns a new object of class '<em>List Decrement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Decrement</em>'.
   * @generated
   */
  ListDecrement createListDecrement();

  /**
   * Returns a new object of class '<em>Composed Error</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composed Error</em>'.
   * @generated
   */
  ComposedError createComposedError();

  /**
   * Returns a new object of class '<em>Error String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error String</em>'.
   * @generated
   */
  ErrorString createErrorString();

  /**
   * Returns a new object of class '<em>Error Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Expression</em>'.
   * @generated
   */
  ErrorExpression createErrorExpression();

  /**
   * Returns a new object of class '<em>Environment Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Composition</em>'.
   * @generated
   */
  EnvironmentComposition createEnvironmentComposition();

  /**
   * Returns a new object of class '<em>Environment Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Access</em>'.
   * @generated
   */
  EnvironmentAccess createEnvironmentAccess();

  /**
   * Returns a new object of class '<em>Length</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length</em>'.
   * @generated
   */
  Length createLength();

  /**
   * Returns a new object of class '<em>Get All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get All</em>'.
   * @generated
   */
  GetAll createGetAll();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Cast To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast To</em>'.
   * @generated
   */
  CastTo createCastTo();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns a new object of class '<em>New Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Name</em>'.
   * @generated
   */
  NewName createNewName();

  /**
   * Returns a new object of class '<em>Clone</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clone</em>'.
   * @generated
   */
  Clone createClone();

  /**
   * Returns a new object of class '<em>Compound Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound Expression</em>'.
   * @generated
   */
  CompoundExpression createCompoundExpression();

  /**
   * Returns a new object of class '<em>Indexed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indexed</em>'.
   * @generated
   */
  Indexed createIndexed();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TypesystemPackage getTypesystemPackage();

} //TypesystemFactory
