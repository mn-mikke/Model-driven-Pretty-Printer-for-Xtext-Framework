/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.*;

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
public class OperatorsTestFactoryImpl extends EFactoryImpl implements OperatorsTestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperatorsTestFactory init()
  {
    try
    {
      OperatorsTestFactory theOperatorsTestFactory = (OperatorsTestFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tests.gpp/operators/OperatorsTest"); 
      if (theOperatorsTestFactory != null)
      {
        return theOperatorsTestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OperatorsTestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorsTestFactoryImpl()
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
      case OperatorsTestPackage.BOX_MODEL_OPERATORS: return createBoxModelOperators();
      case OperatorsTestPackage.STRING_CONSTANT: return createStringConstant();
      case OperatorsTestPackage.INT_CONSTANT: return createIntConstant();
      case OperatorsTestPackage.IMPORT: return createImport();
      case OperatorsTestPackage.OPERATOR_DEFINITION: return createOperatorDefinition();
      case OperatorsTestPackage.BASIC_OPERATOR_DEFINITION: return createBasicOperatorDefinition();
      case OperatorsTestPackage.POSITIONAL_OPERATOR_DEFINITION: return createPositionalOperatorDefinition();
      case OperatorsTestPackage.HIGHLIGHT_OPERATOR_DEFINITION: return createHighlightOperatorDefinition();
      case OperatorsTestPackage.TRANSFORMING_OPERATOR_DEFINITION: return createTransformingOperatorDefinition();
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION: return createAliasOperatorDefinition();
      case OperatorsTestPackage.PARAMETER_APPLICATION: return createParameterApplication();
      case OperatorsTestPackage.PARAMETER_DEFINITION: return createParameterDefinition();
      case OperatorsTestPackage.STRING_PARAMETER_DEFINITION: return createStringParameterDefinition();
      case OperatorsTestPackage.INT_PARAMETER_DEFINITION: return createIntParameterDefinition();
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION: return createEnumParameterDefinition();
      case OperatorsTestPackage.GLOBAL_ENUM: return createGlobalEnum();
      case OperatorsTestPackage.ENUM_ALTERNATIVE: return createEnumAlternative();
      case OperatorsTestPackage.STRING_PARAMETER_VALUE: return createStringParameterValue();
      case OperatorsTestPackage.PARAMETER_APPLICATION_VALUE: return createParameterApplicationValue();
      case OperatorsTestPackage.CONSTANT_REFERENCE_VALUE: return createConstantReferenceValue();
      case OperatorsTestPackage.CONSTANT: return createConstant();
      case OperatorsTestPackage.STRING_VALUE: return createStringValue();
      case OperatorsTestPackage.STRING_CONSTANT_APPLICATION: return createStringConstantApplication();
      case OperatorsTestPackage.INT_PARAMETER_VALUE: return createIntParameterValue();
      case OperatorsTestPackage.INT_VALUE: return createIntValue();
      case OperatorsTestPackage.INT_CONSTANT_APPLICATION: return createIntConstantApplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxModelOperators createBoxModelOperators()
  {
    BoxModelOperatorsImpl boxModelOperators = new BoxModelOperatorsImpl();
    return boxModelOperators;
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
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDefinition createOperatorDefinition()
  {
    OperatorDefinitionImpl operatorDefinition = new OperatorDefinitionImpl();
    return operatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicOperatorDefinition createBasicOperatorDefinition()
  {
    BasicOperatorDefinitionImpl basicOperatorDefinition = new BasicOperatorDefinitionImpl();
    return basicOperatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionalOperatorDefinition createPositionalOperatorDefinition()
  {
    PositionalOperatorDefinitionImpl positionalOperatorDefinition = new PositionalOperatorDefinitionImpl();
    return positionalOperatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HighlightOperatorDefinition createHighlightOperatorDefinition()
  {
    HighlightOperatorDefinitionImpl highlightOperatorDefinition = new HighlightOperatorDefinitionImpl();
    return highlightOperatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformingOperatorDefinition createTransformingOperatorDefinition()
  {
    TransformingOperatorDefinitionImpl transformingOperatorDefinition = new TransformingOperatorDefinitionImpl();
    return transformingOperatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasOperatorDefinition createAliasOperatorDefinition()
  {
    AliasOperatorDefinitionImpl aliasOperatorDefinition = new AliasOperatorDefinitionImpl();
    return aliasOperatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterApplication createParameterApplication()
  {
    ParameterApplicationImpl parameterApplication = new ParameterApplicationImpl();
    return parameterApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition createParameterDefinition()
  {
    ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
    return parameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringParameterDefinition createStringParameterDefinition()
  {
    StringParameterDefinitionImpl stringParameterDefinition = new StringParameterDefinitionImpl();
    return stringParameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntParameterDefinition createIntParameterDefinition()
  {
    IntParameterDefinitionImpl intParameterDefinition = new IntParameterDefinitionImpl();
    return intParameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumParameterDefinition createEnumParameterDefinition()
  {
    EnumParameterDefinitionImpl enumParameterDefinition = new EnumParameterDefinitionImpl();
    return enumParameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalEnum createGlobalEnum()
  {
    GlobalEnumImpl globalEnum = new GlobalEnumImpl();
    return globalEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAlternative createEnumAlternative()
  {
    EnumAlternativeImpl enumAlternative = new EnumAlternativeImpl();
    return enumAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringParameterValue createStringParameterValue()
  {
    StringParameterValueImpl stringParameterValue = new StringParameterValueImpl();
    return stringParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterApplicationValue createParameterApplicationValue()
  {
    ParameterApplicationValueImpl parameterApplicationValue = new ParameterApplicationValueImpl();
    return parameterApplicationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantReferenceValue createConstantReferenceValue()
  {
    ConstantReferenceValueImpl constantReferenceValue = new ConstantReferenceValueImpl();
    return constantReferenceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstantApplication createStringConstantApplication()
  {
    StringConstantApplicationImpl stringConstantApplication = new StringConstantApplicationImpl();
    return stringConstantApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntParameterValue createIntParameterValue()
  {
    IntParameterValueImpl intParameterValue = new IntParameterValueImpl();
    return intParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstantApplication createIntConstantApplication()
  {
    IntConstantApplicationImpl intConstantApplication = new IntConstantApplicationImpl();
    return intConstantApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorsTestPackage getOperatorsTestPackage()
  {
    return (OperatorsTestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OperatorsTestPackage getPackage()
  {
    return OperatorsTestPackage.eINSTANCE;
  }

} //OperatorsTestFactoryImpl
