/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.util;

import it.xtypes.typesystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.xtypes.typesystem.TypesystemPackage
 * @generated
 */
public class TypesystemAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TypesystemPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesystemAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TypesystemPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesystemSwitch<Adapter> modelSwitch =
    new TypesystemSwitch<Adapter>()
    {
      @Override
      public Adapter caseTypeSystemDefinition(TypeSystemDefinition object)
      {
        return createTypeSystemDefinitionAdapter();
      }
      @Override
      public Adapter caseJudgmentDescription(JudgmentDescription object)
      {
        return createJudgmentDescriptionAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseAxiom(Axiom object)
      {
        return createAxiomAdapter();
      }
      @Override
      public Adapter caseRuleWithPremises(RuleWithPremises object)
      {
        return createRuleWithPremisesAdapter();
      }
      @Override
      public Adapter caseTypingJudgment(TypingJudgment object)
      {
        return createTypingJudgmentAdapter();
      }
      @Override
      public Adapter caseOrTypingJudgment(OrTypingJudgment object)
      {
        return createOrTypingJudgmentAdapter();
      }
      @Override
      public Adapter caseOrBranch(OrBranch object)
      {
        return createOrBranchAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclarationWithType(VariableDeclarationWithType object)
      {
        return createVariableDeclarationWithTypeAdapter();
      }
      @Override
      public Adapter caseExpressionType(ExpressionType object)
      {
        return createExpressionTypeAdapter();
      }
      @Override
      public Adapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeAdapter();
      }
      @Override
      public Adapter caseEClassifierType(EClassifierType object)
      {
        return createEClassifierTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseVariableSimpleDeclaration(VariableSimpleDeclaration object)
      {
        return createVariableSimpleDeclarationAdapter();
      }
      @Override
      public Adapter caseQuantification(Quantification object)
      {
        return createQuantificationAdapter();
      }
      @Override
      public Adapter caseForEach(ForEach object)
      {
        return createForEachAdapter();
      }
      @Override
      public Adapter caseForAll(ForAll object)
      {
        return createForAllAdapter();
      }
      @Override
      public Adapter caseExists(Exists object)
      {
        return createExistsAdapter();
      }
      @Override
      public Adapter caseStandardOperation(StandardOperation object)
      {
        return createStandardOperationAdapter();
      }
      @Override
      public Adapter caseEnvironmentOperation(EnvironmentOperation object)
      {
        return createEnvironmentOperationAdapter();
      }
      @Override
      public Adapter caseListOperation(ListOperation object)
      {
        return createListOperationAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseEquals(Equals object)
      {
        return createEqualsAdapter();
      }
      @Override
      public Adapter caseFail(Fail object)
      {
        return createFailAdapter();
      }
      @Override
      public Adapter caseSuccess(Success object)
      {
        return createSuccessAdapter();
      }
      @Override
      public Adapter caseTypingJudgmentWithEnvironment(TypingJudgmentWithEnvironment object)
      {
        return createTypingJudgmentWithEnvironmentAdapter();
      }
      @Override
      public Adapter caseErrorSpecification(ErrorSpecification object)
      {
        return createErrorSpecificationAdapter();
      }
      @Override
      public Adapter caseFailureError(FailureError object)
      {
        return createFailureErrorAdapter();
      }
      @Override
      public Adapter caseTypingStatement(TypingStatement object)
      {
        return createTypingStatementAdapter();
      }
      @Override
      public Adapter caseTypingStatementExpression(TypingStatementExpression object)
      {
        return createTypingStatementExpressionAdapter();
      }
      @Override
      public Adapter caseEnvironment(Environment object)
      {
        return createEnvironmentAdapter();
      }
      @Override
      public Adapter caseEnvironmentId(EnvironmentId object)
      {
        return createEnvironmentIdAdapter();
      }
      @Override
      public Adapter caseEnvironmentStatement(EnvironmentStatement object)
      {
        return createEnvironmentStatementAdapter();
      }
      @Override
      public Adapter caseEmptyEnvironment(EmptyEnvironment object)
      {
        return createEmptyEnvironmentAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseIntegerConstant(IntegerConstant object)
      {
        return createIntegerConstantAdapter();
      }
      @Override
      public Adapter caseVariableAccess(VariableAccess object)
      {
        return createVariableAccessAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseIndexedVariable(IndexedVariable object)
      {
        return createIndexedVariableAdapter();
      }
      @Override
      public Adapter caseSubExpression(SubExpression object)
      {
        return createSubExpressionAdapter();
      }
      @Override
      public Adapter caseArrayIndex(ArrayIndex object)
      {
        return createArrayIndexAdapter();
      }
      @Override
      public Adapter caseEnvironmentAssignment(EnvironmentAssignment object)
      {
        return createEnvironmentAssignmentAdapter();
      }
      @Override
      public Adapter caseEnvironmentIncrement(EnvironmentIncrement object)
      {
        return createEnvironmentIncrementAdapter();
      }
      @Override
      public Adapter caseEnvironmentDecrement(EnvironmentDecrement object)
      {
        return createEnvironmentDecrementAdapter();
      }
      @Override
      public Adapter caseListIncrement(ListIncrement object)
      {
        return createListIncrementAdapter();
      }
      @Override
      public Adapter caseListDecrement(ListDecrement object)
      {
        return createListDecrementAdapter();
      }
      @Override
      public Adapter caseComposedError(ComposedError object)
      {
        return createComposedErrorAdapter();
      }
      @Override
      public Adapter caseErrorString(ErrorString object)
      {
        return createErrorStringAdapter();
      }
      @Override
      public Adapter caseErrorExpression(ErrorExpression object)
      {
        return createErrorExpressionAdapter();
      }
      @Override
      public Adapter caseEnvironmentComposition(EnvironmentComposition object)
      {
        return createEnvironmentCompositionAdapter();
      }
      @Override
      public Adapter caseEnvironmentAccess(EnvironmentAccess object)
      {
        return createEnvironmentAccessAdapter();
      }
      @Override
      public Adapter caseLength(Length object)
      {
        return createLengthAdapter();
      }
      @Override
      public Adapter caseGetAll(GetAll object)
      {
        return createGetAllAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseCastTo(CastTo object)
      {
        return createCastToAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseNewName(NewName object)
      {
        return createNewNameAdapter();
      }
      @Override
      public Adapter caseClone(Clone object)
      {
        return createCloneAdapter();
      }
      @Override
      public Adapter caseCompoundExpression(CompoundExpression object)
      {
        return createCompoundExpressionAdapter();
      }
      @Override
      public Adapter caseIndexed(Indexed object)
      {
        return createIndexedAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.TypeSystemDefinition <em>Type System Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.TypeSystemDefinition
   * @generated
   */
  public Adapter createTypeSystemDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.JudgmentDescription <em>Judgment Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.JudgmentDescription
   * @generated
   */
  public Adapter createJudgmentDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Axiom
   * @generated
   */
  public Adapter createAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.RuleWithPremises <em>Rule With Premises</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.RuleWithPremises
   * @generated
   */
  public Adapter createRuleWithPremisesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.TypingJudgment <em>Typing Judgment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.TypingJudgment
   * @generated
   */
  public Adapter createTypingJudgmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.OrTypingJudgment <em>Or Typing Judgment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.OrTypingJudgment
   * @generated
   */
  public Adapter createOrTypingJudgmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.OrBranch <em>Or Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.OrBranch
   * @generated
   */
  public Adapter createOrBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.VariableDeclarationWithType <em>Variable Declaration With Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.VariableDeclarationWithType
   * @generated
   */
  public Adapter createVariableDeclarationWithTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ExpressionType <em>Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ExpressionType
   * @generated
   */
  public Adapter createExpressionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.CollectionType
   * @generated
   */
  public Adapter createCollectionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EClassifierType <em>EClassifier Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EClassifierType
   * @generated
   */
  public Adapter createEClassifierTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.VariableSimpleDeclaration <em>Variable Simple Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.VariableSimpleDeclaration
   * @generated
   */
  public Adapter createVariableSimpleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Quantification <em>Quantification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Quantification
   * @generated
   */
  public Adapter createQuantificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ForEach <em>For Each</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ForEach
   * @generated
   */
  public Adapter createForEachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ForAll <em>For All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ForAll
   * @generated
   */
  public Adapter createForAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Exists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Exists
   * @generated
   */
  public Adapter createExistsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.StandardOperation <em>Standard Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.StandardOperation
   * @generated
   */
  public Adapter createStandardOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentOperation <em>Environment Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentOperation
   * @generated
   */
  public Adapter createEnvironmentOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ListOperation <em>List Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ListOperation
   * @generated
   */
  public Adapter createListOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Equals
   * @generated
   */
  public Adapter createEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Fail
   * @generated
   */
  public Adapter createFailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Success <em>Success</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Success
   * @generated
   */
  public Adapter createSuccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment <em>Typing Judgment With Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment
   * @generated
   */
  public Adapter createTypingJudgmentWithEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ErrorSpecification <em>Error Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ErrorSpecification
   * @generated
   */
  public Adapter createErrorSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.FailureError <em>Failure Error</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.FailureError
   * @generated
   */
  public Adapter createFailureErrorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.TypingStatement <em>Typing Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.TypingStatement
   * @generated
   */
  public Adapter createTypingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.TypingStatementExpression <em>Typing Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.TypingStatementExpression
   * @generated
   */
  public Adapter createTypingStatementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Environment
   * @generated
   */
  public Adapter createEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentId <em>Environment Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentId
   * @generated
   */
  public Adapter createEnvironmentIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentStatement <em>Environment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentStatement
   * @generated
   */
  public Adapter createEnvironmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EmptyEnvironment <em>Empty Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EmptyEnvironment
   * @generated
   */
  public Adapter createEmptyEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.IntegerConstant <em>Integer Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.IntegerConstant
   * @generated
   */
  public Adapter createIntegerConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.VariableAccess <em>Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.VariableAccess
   * @generated
   */
  public Adapter createVariableAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.IndexedVariable <em>Indexed Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.IndexedVariable
   * @generated
   */
  public Adapter createIndexedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.SubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.SubExpression
   * @generated
   */
  public Adapter createSubExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ArrayIndex <em>Array Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ArrayIndex
   * @generated
   */
  public Adapter createArrayIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentAssignment <em>Environment Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentAssignment
   * @generated
   */
  public Adapter createEnvironmentAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentIncrement <em>Environment Increment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentIncrement
   * @generated
   */
  public Adapter createEnvironmentIncrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentDecrement <em>Environment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentDecrement
   * @generated
   */
  public Adapter createEnvironmentDecrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ListIncrement <em>List Increment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ListIncrement
   * @generated
   */
  public Adapter createListIncrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ListDecrement <em>List Decrement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ListDecrement
   * @generated
   */
  public Adapter createListDecrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ComposedError <em>Composed Error</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ComposedError
   * @generated
   */
  public Adapter createComposedErrorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ErrorString <em>Error String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ErrorString
   * @generated
   */
  public Adapter createErrorStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.ErrorExpression <em>Error Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.ErrorExpression
   * @generated
   */
  public Adapter createErrorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentComposition <em>Environment Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentComposition
   * @generated
   */
  public Adapter createEnvironmentCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.EnvironmentAccess <em>Environment Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.EnvironmentAccess
   * @generated
   */
  public Adapter createEnvironmentAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Length
   * @generated
   */
  public Adapter createLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.GetAll <em>Get All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.GetAll
   * @generated
   */
  public Adapter createGetAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.CastTo <em>Cast To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.CastTo
   * @generated
   */
  public Adapter createCastToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.NewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.NewName
   * @generated
   */
  public Adapter createNewNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Clone <em>Clone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Clone
   * @generated
   */
  public Adapter createCloneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.CompoundExpression <em>Compound Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.CompoundExpression
   * @generated
   */
  public Adapter createCompoundExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Indexed <em>Indexed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Indexed
   * @generated
   */
  public Adapter createIndexedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.xtypes.typesystem.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.xtypes.typesystem.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TypesystemAdapterFactory
