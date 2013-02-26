/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesystemFactoryImpl extends EFactoryImpl implements TypesystemFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypesystemFactory init()
  {
    try
    {
      TypesystemFactory theTypesystemFactory = (TypesystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://xtypes.sf.net/TypeSystem"); 
      if (theTypesystemFactory != null)
      {
        return theTypesystemFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TypesystemFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesystemFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION: return createTypeSystemDefinition();
      case TypesystemPackage.JUDGMENT_DESCRIPTION: return createJudgmentDescription();
      case TypesystemPackage.RULE: return createRule();
      case TypesystemPackage.AXIOM: return createAxiom();
      case TypesystemPackage.RULE_WITH_PREMISES: return createRuleWithPremises();
      case TypesystemPackage.TYPING_JUDGMENT: return createTypingJudgment();
      case TypesystemPackage.OR_TYPING_JUDGMENT: return createOrTypingJudgment();
      case TypesystemPackage.OR_BRANCH: return createOrBranch();
      case TypesystemPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE: return createVariableDeclarationWithType();
      case TypesystemPackage.EXPRESSION_TYPE: return createExpressionType();
      case TypesystemPackage.COLLECTION_TYPE: return createCollectionType();
      case TypesystemPackage.ECLASSIFIER_TYPE: return createEClassifierType();
      case TypesystemPackage.BASIC_TYPE: return createBasicType();
      case TypesystemPackage.VARIABLE_SIMPLE_DECLARATION: return createVariableSimpleDeclaration();
      case TypesystemPackage.QUANTIFICATION: return createQuantification();
      case TypesystemPackage.FOR_EACH: return createForEach();
      case TypesystemPackage.FOR_ALL: return createForAll();
      case TypesystemPackage.EXISTS: return createExists();
      case TypesystemPackage.STANDARD_OPERATION: return createStandardOperation();
      case TypesystemPackage.ENVIRONMENT_OPERATION: return createEnvironmentOperation();
      case TypesystemPackage.LIST_OPERATION: return createListOperation();
      case TypesystemPackage.ASSIGNMENT: return createAssignment();
      case TypesystemPackage.EQUALS: return createEquals();
      case TypesystemPackage.FAIL: return createFail();
      case TypesystemPackage.SUCCESS: return createSuccess();
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT: return createTypingJudgmentWithEnvironment();
      case TypesystemPackage.ERROR_SPECIFICATION: return createErrorSpecification();
      case TypesystemPackage.FAILURE_ERROR: return createFailureError();
      case TypesystemPackage.TYPING_STATEMENT: return createTypingStatement();
      case TypesystemPackage.TYPING_STATEMENT_EXPRESSION: return createTypingStatementExpression();
      case TypesystemPackage.ENVIRONMENT: return createEnvironment();
      case TypesystemPackage.ENVIRONMENT_ID: return createEnvironmentId();
      case TypesystemPackage.ENVIRONMENT_STATEMENT: return createEnvironmentStatement();
      case TypesystemPackage.EMPTY_ENVIRONMENT: return createEmptyEnvironment();
      case TypesystemPackage.EXPRESSION: return createExpression();
      case TypesystemPackage.STRING_CONSTANT: return createStringConstant();
      case TypesystemPackage.INTEGER_CONSTANT: return createIntegerConstant();
      case TypesystemPackage.VARIABLE_ACCESS: return createVariableAccess();
      case TypesystemPackage.VARIABLE_REFERENCE: return createVariableReference();
      case TypesystemPackage.INDEXED_VARIABLE: return createIndexedVariable();
      case TypesystemPackage.SUB_EXPRESSION: return createSubExpression();
      case TypesystemPackage.ARRAY_INDEX: return createArrayIndex();
      case TypesystemPackage.ENVIRONMENT_ASSIGNMENT: return createEnvironmentAssignment();
      case TypesystemPackage.ENVIRONMENT_INCREMENT: return createEnvironmentIncrement();
      case TypesystemPackage.ENVIRONMENT_DECREMENT: return createEnvironmentDecrement();
      case TypesystemPackage.LIST_INCREMENT: return createListIncrement();
      case TypesystemPackage.LIST_DECREMENT: return createListDecrement();
      case TypesystemPackage.COMPOSED_ERROR: return createComposedError();
      case TypesystemPackage.ERROR_STRING: return createErrorString();
      case TypesystemPackage.ERROR_EXPRESSION: return createErrorExpression();
      case TypesystemPackage.ENVIRONMENT_COMPOSITION: return createEnvironmentComposition();
      case TypesystemPackage.ENVIRONMENT_ACCESS: return createEnvironmentAccess();
      case TypesystemPackage.LENGTH: return createLength();
      case TypesystemPackage.GET_ALL: return createGetAll();
      case TypesystemPackage.CONTAINER: return createContainer();
      case TypesystemPackage.CAST_TO: return createCastTo();
      case TypesystemPackage.NULL: return createNull();
      case TypesystemPackage.NEW_NAME: return createNewName();
      case TypesystemPackage.CLONE: return createClone();
      case TypesystemPackage.COMPOUND_EXPRESSION: return createCompoundExpression();
      case TypesystemPackage.INDEXED: return createIndexed();
      case TypesystemPackage.FEATURE: return createFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSystemDefinition createTypeSystemDefinition()
  {
    TypeSystemDefinitionImpl typeSystemDefinition = new TypeSystemDefinitionImpl();
    return typeSystemDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JudgmentDescription createJudgmentDescription()
  {
    JudgmentDescriptionImpl judgmentDescription = new JudgmentDescriptionImpl();
    return judgmentDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axiom createAxiom()
  {
    AxiomImpl axiom = new AxiomImpl();
    return axiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleWithPremises createRuleWithPremises()
  {
    RuleWithPremisesImpl ruleWithPremises = new RuleWithPremisesImpl();
    return ruleWithPremises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingJudgment createTypingJudgment()
  {
    TypingJudgmentImpl typingJudgment = new TypingJudgmentImpl();
    return typingJudgment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrTypingJudgment createOrTypingJudgment()
  {
    OrTypingJudgmentImpl orTypingJudgment = new OrTypingJudgmentImpl();
    return orTypingJudgment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrBranch createOrBranch()
  {
    OrBranchImpl orBranch = new OrBranchImpl();
    return orBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarationWithType createVariableDeclarationWithType()
  {
    VariableDeclarationWithTypeImpl variableDeclarationWithType = new VariableDeclarationWithTypeImpl();
    return variableDeclarationWithType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionType createExpressionType()
  {
    ExpressionTypeImpl expressionType = new ExpressionTypeImpl();
    return expressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifierType createEClassifierType()
  {
    EClassifierTypeImpl eClassifierType = new EClassifierTypeImpl();
    return eClassifierType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableSimpleDeclaration createVariableSimpleDeclaration()
  {
    VariableSimpleDeclarationImpl variableSimpleDeclaration = new VariableSimpleDeclarationImpl();
    return variableSimpleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantification createQuantification()
  {
    QuantificationImpl quantification = new QuantificationImpl();
    return quantification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEach createForEach()
  {
    ForEachImpl forEach = new ForEachImpl();
    return forEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAll createForAll()
  {
    ForAllImpl forAll = new ForAllImpl();
    return forAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exists createExists()
  {
    ExistsImpl exists = new ExistsImpl();
    return exists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardOperation createStandardOperation()
  {
    StandardOperationImpl standardOperation = new StandardOperationImpl();
    return standardOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentOperation createEnvironmentOperation()
  {
    EnvironmentOperationImpl environmentOperation = new EnvironmentOperationImpl();
    return environmentOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOperation createListOperation()
  {
    ListOperationImpl listOperation = new ListOperationImpl();
    return listOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fail createFail()
  {
    FailImpl fail = new FailImpl();
    return fail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Success createSuccess()
  {
    SuccessImpl success = new SuccessImpl();
    return success;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingJudgmentWithEnvironment createTypingJudgmentWithEnvironment()
  {
    TypingJudgmentWithEnvironmentImpl typingJudgmentWithEnvironment = new TypingJudgmentWithEnvironmentImpl();
    return typingJudgmentWithEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorSpecification createErrorSpecification()
  {
    ErrorSpecificationImpl errorSpecification = new ErrorSpecificationImpl();
    return errorSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailureError createFailureError()
  {
    FailureErrorImpl failureError = new FailureErrorImpl();
    return failureError;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingStatement createTypingStatement()
  {
    TypingStatementImpl typingStatement = new TypingStatementImpl();
    return typingStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingStatementExpression createTypingStatementExpression()
  {
    TypingStatementExpressionImpl typingStatementExpression = new TypingStatementExpressionImpl();
    return typingStatementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentId createEnvironmentId()
  {
    EnvironmentIdImpl environmentId = new EnvironmentIdImpl();
    return environmentId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentStatement createEnvironmentStatement()
  {
    EnvironmentStatementImpl environmentStatement = new EnvironmentStatementImpl();
    return environmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyEnvironment createEmptyEnvironment()
  {
    EmptyEnvironmentImpl emptyEnvironment = new EmptyEnvironmentImpl();
    return emptyEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerConstant createIntegerConstant()
  {
    IntegerConstantImpl integerConstant = new IntegerConstantImpl();
    return integerConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAccess createVariableAccess()
  {
    VariableAccessImpl variableAccess = new VariableAccessImpl();
    return variableAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedVariable createIndexedVariable()
  {
    IndexedVariableImpl indexedVariable = new IndexedVariableImpl();
    return indexedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubExpression createSubExpression()
  {
    SubExpressionImpl subExpression = new SubExpressionImpl();
    return subExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayIndex createArrayIndex()
  {
    ArrayIndexImpl arrayIndex = new ArrayIndexImpl();
    return arrayIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentAssignment createEnvironmentAssignment()
  {
    EnvironmentAssignmentImpl environmentAssignment = new EnvironmentAssignmentImpl();
    return environmentAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentIncrement createEnvironmentIncrement()
  {
    EnvironmentIncrementImpl environmentIncrement = new EnvironmentIncrementImpl();
    return environmentIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentDecrement createEnvironmentDecrement()
  {
    EnvironmentDecrementImpl environmentDecrement = new EnvironmentDecrementImpl();
    return environmentDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListIncrement createListIncrement()
  {
    ListIncrementImpl listIncrement = new ListIncrementImpl();
    return listIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListDecrement createListDecrement()
  {
    ListDecrementImpl listDecrement = new ListDecrementImpl();
    return listDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposedError createComposedError()
  {
    ComposedErrorImpl composedError = new ComposedErrorImpl();
    return composedError;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorString createErrorString()
  {
    ErrorStringImpl errorString = new ErrorStringImpl();
    return errorString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorExpression createErrorExpression()
  {
    ErrorExpressionImpl errorExpression = new ErrorExpressionImpl();
    return errorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentComposition createEnvironmentComposition()
  {
    EnvironmentCompositionImpl environmentComposition = new EnvironmentCompositionImpl();
    return environmentComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentAccess createEnvironmentAccess()
  {
    EnvironmentAccessImpl environmentAccess = new EnvironmentAccessImpl();
    return environmentAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Length createLength()
  {
    LengthImpl length = new LengthImpl();
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetAll createGetAll()
  {
    GetAllImpl getAll = new GetAllImpl();
    return getAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.xtypes.typesystem.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastTo createCastTo()
  {
    CastToImpl castTo = new CastToImpl();
    return castTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewName createNewName()
  {
    NewNameImpl newName = new NewNameImpl();
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clone createClone()
  {
    CloneImpl clone = new CloneImpl();
    return clone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundExpression createCompoundExpression()
  {
    CompoundExpressionImpl compoundExpression = new CompoundExpressionImpl();
    return compoundExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Indexed createIndexed()
  {
    IndexedImpl indexed = new IndexedImpl();
    return indexed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesystemPackage getTypesystemPackage()
  {
    return (TypesystemPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TypesystemPackage getPackage()
  {
    return TypesystemPackage.eINSTANCE;
  }

} //TypesystemFactoryImpl
