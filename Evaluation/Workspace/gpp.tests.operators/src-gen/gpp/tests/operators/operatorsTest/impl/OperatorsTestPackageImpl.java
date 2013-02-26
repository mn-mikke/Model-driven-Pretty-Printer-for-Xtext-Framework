/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.AliasOperatorDefinition;
import gpp.tests.operators.operatorsTest.BasicOperatorDefinition;
import gpp.tests.operators.operatorsTest.BoxModelOperators;
import gpp.tests.operators.operatorsTest.Constant;
import gpp.tests.operators.operatorsTest.ConstantReferenceValue;
import gpp.tests.operators.operatorsTest.EnumAlternative;
import gpp.tests.operators.operatorsTest.EnumParameterDefinition;
import gpp.tests.operators.operatorsTest.GlobalEnum;
import gpp.tests.operators.operatorsTest.HighlightOperatorDefinition;
import gpp.tests.operators.operatorsTest.Import;
import gpp.tests.operators.operatorsTest.IntConstant;
import gpp.tests.operators.operatorsTest.IntConstantApplication;
import gpp.tests.operators.operatorsTest.IntParameterDefinition;
import gpp.tests.operators.operatorsTest.IntParameterValue;
import gpp.tests.operators.operatorsTest.IntValue;
import gpp.tests.operators.operatorsTest.OperatorDefinition;
import gpp.tests.operators.operatorsTest.OperatorsTestFactory;
import gpp.tests.operators.operatorsTest.OperatorsTestPackage;
import gpp.tests.operators.operatorsTest.ParameterApplication;
import gpp.tests.operators.operatorsTest.ParameterApplicationValue;
import gpp.tests.operators.operatorsTest.ParameterDefinition;
import gpp.tests.operators.operatorsTest.PositionalOperatorDefinition;
import gpp.tests.operators.operatorsTest.StringConstant;
import gpp.tests.operators.operatorsTest.StringConstantApplication;
import gpp.tests.operators.operatorsTest.StringParameterDefinition;
import gpp.tests.operators.operatorsTest.StringParameterValue;
import gpp.tests.operators.operatorsTest.StringValue;
import gpp.tests.operators.operatorsTest.TransformingOperatorDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsTestPackageImpl extends EPackageImpl implements OperatorsTestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxModelOperatorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicOperatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionalOperatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass highlightOperatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformingOperatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasOperatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringParameterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intParameterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumParameterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumAlternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterApplicationValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantReferenceValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantApplicationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OperatorsTestPackageImpl()
  {
    super(eNS_URI, OperatorsTestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OperatorsTestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OperatorsTestPackage init()
  {
    if (isInited) return (OperatorsTestPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsTestPackage.eNS_URI);

    // Obtain or create and register package
    OperatorsTestPackageImpl theOperatorsTestPackage = (OperatorsTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatorsTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatorsTestPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOperatorsTestPackage.createPackageContents();

    // Initialize created meta-data
    theOperatorsTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOperatorsTestPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OperatorsTestPackage.eNS_URI, theOperatorsTestPackage);
    return theOperatorsTestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxModelOperators()
  {
    return boxModelOperatorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxModelOperators_Imports()
  {
    return (EReference)boxModelOperatorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxModelOperators_OperatorDefinitions()
  {
    return (EReference)boxModelOperatorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxModelOperators_Enumerations()
  {
    return (EReference)boxModelOperatorsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxModelOperators_IntConstants()
  {
    return (EReference)boxModelOperatorsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxModelOperators_StringConstants()
  {
    return (EReference)boxModelOperatorsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstant()
  {
    return stringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstant_Value()
  {
    return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntConstant_Value()
  {
    return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorDefinition()
  {
    return operatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorDefinition_Name()
  {
    return (EAttribute)operatorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicOperatorDefinition()
  {
    return basicOperatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicOperatorDefinition_Implementation()
  {
    return (EAttribute)basicOperatorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicOperatorDefinition_Parameters()
  {
    return (EReference)basicOperatorDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionalOperatorDefinition()
  {
    return positionalOperatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHighlightOperatorDefinition()
  {
    return highlightOperatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransformingOperatorDefinition()
  {
    return transformingOperatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAliasOperatorDefinition()
  {
    return aliasOperatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAliasOperatorDefinition_Operator()
  {
    return (EReference)aliasOperatorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAliasOperatorDefinition_Parameters()
  {
    return (EReference)aliasOperatorDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterApplication()
  {
    return parameterApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterApplication_ReferencedParameter()
  {
    return (EReference)parameterApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterApplication_Value()
  {
    return (EReference)parameterApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDefinition()
  {
    return parameterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDefinition_Name()
  {
    return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringParameterDefinition()
  {
    return stringParameterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringParameterDefinition_Value()
  {
    return (EReference)stringParameterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntParameterDefinition()
  {
    return intParameterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntParameterDefinition_Value()
  {
    return (EReference)intParameterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumParameterDefinition()
  {
    return enumParameterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumParameterDefinition_Alternatives()
  {
    return (EReference)enumParameterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumParameterDefinition_Enumeration()
  {
    return (EReference)enumParameterDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumParameterDefinition_Value()
  {
    return (EReference)enumParameterDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalEnum()
  {
    return globalEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalEnum_Name()
  {
    return (EAttribute)globalEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalEnum_Alternatives()
  {
    return (EReference)globalEnumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumAlternative()
  {
    return enumAlternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringParameterValue()
  {
    return stringParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterApplicationValue()
  {
    return parameterApplicationValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantReferenceValue()
  {
    return constantReferenceValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantReferenceValue_Value()
  {
    return (EReference)constantReferenceValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstantApplication()
  {
    return stringConstantApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringConstantApplication_Value()
  {
    return (EReference)stringConstantApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntParameterValue()
  {
    return intParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstantApplication()
  {
    return intConstantApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntConstantApplication_Value()
  {
    return (EReference)intConstantApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorsTestFactory getOperatorsTestFactory()
  {
    return (OperatorsTestFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    boxModelOperatorsEClass = createEClass(BOX_MODEL_OPERATORS);
    createEReference(boxModelOperatorsEClass, BOX_MODEL_OPERATORS__IMPORTS);
    createEReference(boxModelOperatorsEClass, BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS);
    createEReference(boxModelOperatorsEClass, BOX_MODEL_OPERATORS__ENUMERATIONS);
    createEReference(boxModelOperatorsEClass, BOX_MODEL_OPERATORS__INT_CONSTANTS);
    createEReference(boxModelOperatorsEClass, BOX_MODEL_OPERATORS__STRING_CONSTANTS);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    operatorDefinitionEClass = createEClass(OPERATOR_DEFINITION);
    createEAttribute(operatorDefinitionEClass, OPERATOR_DEFINITION__NAME);

    basicOperatorDefinitionEClass = createEClass(BASIC_OPERATOR_DEFINITION);
    createEAttribute(basicOperatorDefinitionEClass, BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
    createEReference(basicOperatorDefinitionEClass, BASIC_OPERATOR_DEFINITION__PARAMETERS);

    positionalOperatorDefinitionEClass = createEClass(POSITIONAL_OPERATOR_DEFINITION);

    highlightOperatorDefinitionEClass = createEClass(HIGHLIGHT_OPERATOR_DEFINITION);

    transformingOperatorDefinitionEClass = createEClass(TRANSFORMING_OPERATOR_DEFINITION);

    aliasOperatorDefinitionEClass = createEClass(ALIAS_OPERATOR_DEFINITION);
    createEReference(aliasOperatorDefinitionEClass, ALIAS_OPERATOR_DEFINITION__OPERATOR);
    createEReference(aliasOperatorDefinitionEClass, ALIAS_OPERATOR_DEFINITION__PARAMETERS);

    parameterApplicationEClass = createEClass(PARAMETER_APPLICATION);
    createEReference(parameterApplicationEClass, PARAMETER_APPLICATION__REFERENCED_PARAMETER);
    createEReference(parameterApplicationEClass, PARAMETER_APPLICATION__VALUE);

    parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
    createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);

    stringParameterDefinitionEClass = createEClass(STRING_PARAMETER_DEFINITION);
    createEReference(stringParameterDefinitionEClass, STRING_PARAMETER_DEFINITION__VALUE);

    intParameterDefinitionEClass = createEClass(INT_PARAMETER_DEFINITION);
    createEReference(intParameterDefinitionEClass, INT_PARAMETER_DEFINITION__VALUE);

    enumParameterDefinitionEClass = createEClass(ENUM_PARAMETER_DEFINITION);
    createEReference(enumParameterDefinitionEClass, ENUM_PARAMETER_DEFINITION__ALTERNATIVES);
    createEReference(enumParameterDefinitionEClass, ENUM_PARAMETER_DEFINITION__ENUMERATION);
    createEReference(enumParameterDefinitionEClass, ENUM_PARAMETER_DEFINITION__VALUE);

    globalEnumEClass = createEClass(GLOBAL_ENUM);
    createEAttribute(globalEnumEClass, GLOBAL_ENUM__NAME);
    createEReference(globalEnumEClass, GLOBAL_ENUM__ALTERNATIVES);

    enumAlternativeEClass = createEClass(ENUM_ALTERNATIVE);

    stringParameterValueEClass = createEClass(STRING_PARAMETER_VALUE);

    parameterApplicationValueEClass = createEClass(PARAMETER_APPLICATION_VALUE);

    constantReferenceValueEClass = createEClass(CONSTANT_REFERENCE_VALUE);
    createEReference(constantReferenceValueEClass, CONSTANT_REFERENCE_VALUE__VALUE);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__NAME);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    stringConstantApplicationEClass = createEClass(STRING_CONSTANT_APPLICATION);
    createEReference(stringConstantApplicationEClass, STRING_CONSTANT_APPLICATION__VALUE);

    intParameterValueEClass = createEClass(INT_PARAMETER_VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    intConstantApplicationEClass = createEClass(INT_CONSTANT_APPLICATION);
    createEReference(intConstantApplicationEClass, INT_CONSTANT_APPLICATION__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stringConstantEClass.getESuperTypes().add(this.getConstant());
    intConstantEClass.getESuperTypes().add(this.getConstant());
    basicOperatorDefinitionEClass.getESuperTypes().add(this.getOperatorDefinition());
    positionalOperatorDefinitionEClass.getESuperTypes().add(this.getBasicOperatorDefinition());
    highlightOperatorDefinitionEClass.getESuperTypes().add(this.getBasicOperatorDefinition());
    transformingOperatorDefinitionEClass.getESuperTypes().add(this.getBasicOperatorDefinition());
    aliasOperatorDefinitionEClass.getESuperTypes().add(this.getOperatorDefinition());
    stringParameterDefinitionEClass.getESuperTypes().add(this.getParameterDefinition());
    intParameterDefinitionEClass.getESuperTypes().add(this.getParameterDefinition());
    enumParameterDefinitionEClass.getESuperTypes().add(this.getParameterDefinition());
    enumAlternativeEClass.getESuperTypes().add(this.getConstant());
    constantReferenceValueEClass.getESuperTypes().add(this.getParameterApplicationValue());
    stringValueEClass.getESuperTypes().add(this.getStringParameterValue());
    stringValueEClass.getESuperTypes().add(this.getParameterApplicationValue());
    stringConstantApplicationEClass.getESuperTypes().add(this.getStringParameterValue());
    intValueEClass.getESuperTypes().add(this.getParameterApplicationValue());
    intValueEClass.getESuperTypes().add(this.getIntParameterValue());
    intConstantApplicationEClass.getESuperTypes().add(this.getIntParameterValue());

    // Initialize classes and features; add operations and parameters
    initEClass(boxModelOperatorsEClass, BoxModelOperators.class, "BoxModelOperators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxModelOperators_Imports(), this.getImport(), null, "imports", null, 0, -1, BoxModelOperators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxModelOperators_OperatorDefinitions(), this.getOperatorDefinition(), null, "operatorDefinitions", null, 0, -1, BoxModelOperators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxModelOperators_Enumerations(), this.getGlobalEnum(), null, "enumerations", null, 0, -1, BoxModelOperators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxModelOperators_IntConstants(), this.getIntConstant(), null, "intConstants", null, 0, -1, BoxModelOperators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBoxModelOperators_StringConstants(), this.getStringConstant(), null, "stringConstants", null, 0, -1, BoxModelOperators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorDefinitionEClass, OperatorDefinition.class, "OperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperatorDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, OperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicOperatorDefinitionEClass, BasicOperatorDefinition.class, "BasicOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicOperatorDefinition_Implementation(), ecorePackage.getEString(), "implementation", null, 0, 1, BasicOperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicOperatorDefinition_Parameters(), this.getParameterDefinition(), null, "parameters", null, 0, -1, BasicOperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionalOperatorDefinitionEClass, PositionalOperatorDefinition.class, "PositionalOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(highlightOperatorDefinitionEClass, HighlightOperatorDefinition.class, "HighlightOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transformingOperatorDefinitionEClass, TransformingOperatorDefinition.class, "TransformingOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aliasOperatorDefinitionEClass, AliasOperatorDefinition.class, "AliasOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAliasOperatorDefinition_Operator(), this.getOperatorDefinition(), null, "operator", null, 0, 1, AliasOperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAliasOperatorDefinition_Parameters(), this.getParameterApplication(), null, "parameters", null, 0, -1, AliasOperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterApplicationEClass, ParameterApplication.class, "ParameterApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterApplication_ReferencedParameter(), this.getParameterDefinition(), null, "referencedParameter", null, 0, 1, ParameterApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterApplication_Value(), this.getParameterApplicationValue(), null, "value", null, 0, 1, ParameterApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringParameterDefinitionEClass, StringParameterDefinition.class, "StringParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringParameterDefinition_Value(), this.getStringParameterValue(), null, "value", null, 0, 1, StringParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intParameterDefinitionEClass, IntParameterDefinition.class, "IntParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntParameterDefinition_Value(), this.getIntParameterValue(), null, "value", null, 0, 1, IntParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumParameterDefinitionEClass, EnumParameterDefinition.class, "EnumParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumParameterDefinition_Alternatives(), this.getEnumAlternative(), null, "alternatives", null, 0, -1, EnumParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumParameterDefinition_Enumeration(), this.getGlobalEnum(), null, "enumeration", null, 0, 1, EnumParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumParameterDefinition_Value(), this.getEnumAlternative(), null, "value", null, 0, 1, EnumParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalEnumEClass, GlobalEnum.class, "GlobalEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, GlobalEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalEnum_Alternatives(), this.getEnumAlternative(), null, "alternatives", null, 0, -1, GlobalEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumAlternativeEClass, EnumAlternative.class, "EnumAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringParameterValueEClass, StringParameterValue.class, "StringParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterApplicationValueEClass, ParameterApplicationValue.class, "ParameterApplicationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantReferenceValueEClass, ConstantReferenceValue.class, "ConstantReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantReferenceValue_Value(), this.getConstant(), null, "value", null, 0, 1, ConstantReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstantApplicationEClass, StringConstantApplication.class, "StringConstantApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringConstantApplication_Value(), this.getStringConstant(), null, "value", null, 0, 1, StringConstantApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intParameterValueEClass, IntParameterValue.class, "IntParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantApplicationEClass, IntConstantApplication.class, "IntConstantApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntConstantApplication_Value(), this.getIntConstant(), null, "value", null, 0, 1, IntConstantApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //OperatorsTestPackageImpl
