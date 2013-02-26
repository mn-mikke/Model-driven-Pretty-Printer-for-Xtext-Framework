/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.util;

import gpp.tests.operators.operatorsTest.*;

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
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage
 * @generated
 */
public class OperatorsTestSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OperatorsTestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorsTestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OperatorsTestPackage.eINSTANCE;
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
      case OperatorsTestPackage.BOX_MODEL_OPERATORS:
      {
        BoxModelOperators boxModelOperators = (BoxModelOperators)theEObject;
        T result = caseBoxModelOperators(boxModelOperators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseConstant(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseConstant(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.OPERATOR_DEFINITION:
      {
        OperatorDefinition operatorDefinition = (OperatorDefinition)theEObject;
        T result = caseOperatorDefinition(operatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.BASIC_OPERATOR_DEFINITION:
      {
        BasicOperatorDefinition basicOperatorDefinition = (BasicOperatorDefinition)theEObject;
        T result = caseBasicOperatorDefinition(basicOperatorDefinition);
        if (result == null) result = caseOperatorDefinition(basicOperatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.POSITIONAL_OPERATOR_DEFINITION:
      {
        PositionalOperatorDefinition positionalOperatorDefinition = (PositionalOperatorDefinition)theEObject;
        T result = casePositionalOperatorDefinition(positionalOperatorDefinition);
        if (result == null) result = caseBasicOperatorDefinition(positionalOperatorDefinition);
        if (result == null) result = caseOperatorDefinition(positionalOperatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.HIGHLIGHT_OPERATOR_DEFINITION:
      {
        HighlightOperatorDefinition highlightOperatorDefinition = (HighlightOperatorDefinition)theEObject;
        T result = caseHighlightOperatorDefinition(highlightOperatorDefinition);
        if (result == null) result = caseBasicOperatorDefinition(highlightOperatorDefinition);
        if (result == null) result = caseOperatorDefinition(highlightOperatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.TRANSFORMING_OPERATOR_DEFINITION:
      {
        TransformingOperatorDefinition transformingOperatorDefinition = (TransformingOperatorDefinition)theEObject;
        T result = caseTransformingOperatorDefinition(transformingOperatorDefinition);
        if (result == null) result = caseBasicOperatorDefinition(transformingOperatorDefinition);
        if (result == null) result = caseOperatorDefinition(transformingOperatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION:
      {
        AliasOperatorDefinition aliasOperatorDefinition = (AliasOperatorDefinition)theEObject;
        T result = caseAliasOperatorDefinition(aliasOperatorDefinition);
        if (result == null) result = caseOperatorDefinition(aliasOperatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.PARAMETER_APPLICATION:
      {
        ParameterApplication parameterApplication = (ParameterApplication)theEObject;
        T result = caseParameterApplication(parameterApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.PARAMETER_DEFINITION:
      {
        ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
        T result = caseParameterDefinition(parameterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.STRING_PARAMETER_DEFINITION:
      {
        StringParameterDefinition stringParameterDefinition = (StringParameterDefinition)theEObject;
        T result = caseStringParameterDefinition(stringParameterDefinition);
        if (result == null) result = caseParameterDefinition(stringParameterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.INT_PARAMETER_DEFINITION:
      {
        IntParameterDefinition intParameterDefinition = (IntParameterDefinition)theEObject;
        T result = caseIntParameterDefinition(intParameterDefinition);
        if (result == null) result = caseParameterDefinition(intParameterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION:
      {
        EnumParameterDefinition enumParameterDefinition = (EnumParameterDefinition)theEObject;
        T result = caseEnumParameterDefinition(enumParameterDefinition);
        if (result == null) result = caseParameterDefinition(enumParameterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.GLOBAL_ENUM:
      {
        GlobalEnum globalEnum = (GlobalEnum)theEObject;
        T result = caseGlobalEnum(globalEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.ENUM_ALTERNATIVE:
      {
        EnumAlternative enumAlternative = (EnumAlternative)theEObject;
        T result = caseEnumAlternative(enumAlternative);
        if (result == null) result = caseConstant(enumAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.STRING_PARAMETER_VALUE:
      {
        StringParameterValue stringParameterValue = (StringParameterValue)theEObject;
        T result = caseStringParameterValue(stringParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.PARAMETER_APPLICATION_VALUE:
      {
        ParameterApplicationValue parameterApplicationValue = (ParameterApplicationValue)theEObject;
        T result = caseParameterApplicationValue(parameterApplicationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.CONSTANT_REFERENCE_VALUE:
      {
        ConstantReferenceValue constantReferenceValue = (ConstantReferenceValue)theEObject;
        T result = caseConstantReferenceValue(constantReferenceValue);
        if (result == null) result = caseParameterApplicationValue(constantReferenceValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseStringParameterValue(stringValue);
        if (result == null) result = caseParameterApplicationValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.STRING_CONSTANT_APPLICATION:
      {
        StringConstantApplication stringConstantApplication = (StringConstantApplication)theEObject;
        T result = caseStringConstantApplication(stringConstantApplication);
        if (result == null) result = caseStringParameterValue(stringConstantApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.INT_PARAMETER_VALUE:
      {
        IntParameterValue intParameterValue = (IntParameterValue)theEObject;
        T result = caseIntParameterValue(intParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseParameterApplicationValue(intValue);
        if (result == null) result = caseIntParameterValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OperatorsTestPackage.INT_CONSTANT_APPLICATION:
      {
        IntConstantApplication intConstantApplication = (IntConstantApplication)theEObject;
        T result = caseIntConstantApplication(intConstantApplication);
        if (result == null) result = caseIntParameterValue(intConstantApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Box Model Operators</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Box Model Operators</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxModelOperators(BoxModelOperators object)
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
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorDefinition(OperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicOperatorDefinition(BasicOperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Positional Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Positional Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionalOperatorDefinition(PositionalOperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Highlight Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Highlight Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighlightOperatorDefinition(HighlightOperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transforming Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transforming Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransformingOperatorDefinition(TransformingOperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasOperatorDefinition(AliasOperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterApplication(ParameterApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDefinition(ParameterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Parameter Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Parameter Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringParameterDefinition(StringParameterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Parameter Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Parameter Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntParameterDefinition(IntParameterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Parameter Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Parameter Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumParameterDefinition(EnumParameterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalEnum(GlobalEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumAlternative(EnumAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringParameterValue(StringParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Application Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Application Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterApplicationValue(ParameterApplicationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Reference Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Reference Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantReferenceValue(ConstantReferenceValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstantApplication(StringConstantApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntParameterValue(IntParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstantApplication(IntConstantApplication object)
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

} //OperatorsTestSwitch
