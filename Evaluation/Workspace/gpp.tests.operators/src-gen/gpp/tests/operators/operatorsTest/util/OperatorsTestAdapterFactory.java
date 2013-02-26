/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.util;

import gpp.tests.operators.operatorsTest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage
 * @generated
 */
public class OperatorsTestAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OperatorsTestPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorsTestAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OperatorsTestPackage.eINSTANCE;
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
  protected OperatorsTestSwitch<Adapter> modelSwitch =
    new OperatorsTestSwitch<Adapter>()
    {
      @Override
      public Adapter caseBoxModelOperators(BoxModelOperators object)
      {
        return createBoxModelOperatorsAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseOperatorDefinition(OperatorDefinition object)
      {
        return createOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseBasicOperatorDefinition(BasicOperatorDefinition object)
      {
        return createBasicOperatorDefinitionAdapter();
      }
      @Override
      public Adapter casePositionalOperatorDefinition(PositionalOperatorDefinition object)
      {
        return createPositionalOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseHighlightOperatorDefinition(HighlightOperatorDefinition object)
      {
        return createHighlightOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseTransformingOperatorDefinition(TransformingOperatorDefinition object)
      {
        return createTransformingOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseAliasOperatorDefinition(AliasOperatorDefinition object)
      {
        return createAliasOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterApplication(ParameterApplication object)
      {
        return createParameterApplicationAdapter();
      }
      @Override
      public Adapter caseParameterDefinition(ParameterDefinition object)
      {
        return createParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseStringParameterDefinition(StringParameterDefinition object)
      {
        return createStringParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseIntParameterDefinition(IntParameterDefinition object)
      {
        return createIntParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumParameterDefinition(EnumParameterDefinition object)
      {
        return createEnumParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseGlobalEnum(GlobalEnum object)
      {
        return createGlobalEnumAdapter();
      }
      @Override
      public Adapter caseEnumAlternative(EnumAlternative object)
      {
        return createEnumAlternativeAdapter();
      }
      @Override
      public Adapter caseStringParameterValue(StringParameterValue object)
      {
        return createStringParameterValueAdapter();
      }
      @Override
      public Adapter caseParameterApplicationValue(ParameterApplicationValue object)
      {
        return createParameterApplicationValueAdapter();
      }
      @Override
      public Adapter caseConstantReferenceValue(ConstantReferenceValue object)
      {
        return createConstantReferenceValueAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseStringConstantApplication(StringConstantApplication object)
      {
        return createStringConstantApplicationAdapter();
      }
      @Override
      public Adapter caseIntParameterValue(IntParameterValue object)
      {
        return createIntParameterValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseIntConstantApplication(IntConstantApplication object)
      {
        return createIntConstantApplicationAdapter();
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
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.BoxModelOperators <em>Box Model Operators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators
   * @generated
   */
  public Adapter createBoxModelOperatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.OperatorDefinition <em>Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.OperatorDefinition
   * @generated
   */
  public Adapter createOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition <em>Basic Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.BasicOperatorDefinition
   * @generated
   */
  public Adapter createBasicOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.PositionalOperatorDefinition <em>Positional Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.PositionalOperatorDefinition
   * @generated
   */
  public Adapter createPositionalOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.HighlightOperatorDefinition <em>Highlight Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.HighlightOperatorDefinition
   * @generated
   */
  public Adapter createHighlightOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.TransformingOperatorDefinition <em>Transforming Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.TransformingOperatorDefinition
   * @generated
   */
  public Adapter createTransformingOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition <em>Alias Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.AliasOperatorDefinition
   * @generated
   */
  public Adapter createAliasOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.ParameterApplication <em>Parameter Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.ParameterApplication
   * @generated
   */
  public Adapter createParameterApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.ParameterDefinition <em>Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.ParameterDefinition
   * @generated
   */
  public Adapter createParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.StringParameterDefinition <em>String Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.StringParameterDefinition
   * @generated
   */
  public Adapter createStringParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.IntParameterDefinition <em>Int Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.IntParameterDefinition
   * @generated
   */
  public Adapter createIntParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition <em>Enum Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.EnumParameterDefinition
   * @generated
   */
  public Adapter createEnumParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.GlobalEnum <em>Global Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.GlobalEnum
   * @generated
   */
  public Adapter createGlobalEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.EnumAlternative <em>Enum Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.EnumAlternative
   * @generated
   */
  public Adapter createEnumAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.StringParameterValue <em>String Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.StringParameterValue
   * @generated
   */
  public Adapter createStringParameterValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.ParameterApplicationValue <em>Parameter Application Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.ParameterApplicationValue
   * @generated
   */
  public Adapter createParameterApplicationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.ConstantReferenceValue <em>Constant Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.ConstantReferenceValue
   * @generated
   */
  public Adapter createConstantReferenceValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.StringConstantApplication <em>String Constant Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.StringConstantApplication
   * @generated
   */
  public Adapter createStringConstantApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.IntParameterValue <em>Int Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.IntParameterValue
   * @generated
   */
  public Adapter createIntParameterValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gpp.tests.operators.operatorsTest.IntConstantApplication <em>Int Constant Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gpp.tests.operators.operatorsTest.IntConstantApplication
   * @generated
   */
  public Adapter createIntConstantApplicationAdapter()
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

} //OperatorsTestAdapterFactory
