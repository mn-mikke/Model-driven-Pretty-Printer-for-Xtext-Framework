/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gpp.tests.operators.operatorsTest.OperatorsTestFactory
 * @model kind="package"
 * @generated
 */
public interface OperatorsTestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "operatorsTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tests.gpp/operators/OperatorsTest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "operatorsTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OperatorsTestPackage eINSTANCE = gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl.init();

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl <em>Box Model Operators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getBoxModelOperators()
   * @generated
   */
  int BOX_MODEL_OPERATORS = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Operator Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS = 1;

  /**
   * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS__ENUMERATIONS = 2;

  /**
   * The feature id for the '<em><b>Int Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS__INT_CONSTANTS = 3;

  /**
   * The feature id for the '<em><b>String Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS__STRING_CONSTANTS = 4;

  /**
   * The number of structural features of the '<em>Box Model Operators</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOX_MODEL_OPERATORS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ConstantImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.StringConstantImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__NAME = CONSTANT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.IntConstantImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__NAME = CONSTANT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ImportImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.OperatorDefinitionImpl <em>Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.OperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getOperatorDefinition()
   * @generated
   */
  int OPERATOR_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.BasicOperatorDefinitionImpl <em>Basic Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.BasicOperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getBasicOperatorDefinition()
   * @generated
   */
  int BASIC_OPERATOR_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_OPERATOR_DEFINITION__NAME = OPERATOR_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_OPERATOR_DEFINITION__IMPLEMENTATION = OPERATOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_OPERATOR_DEFINITION__PARAMETERS = OPERATOR_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_OPERATOR_DEFINITION_FEATURE_COUNT = OPERATOR_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.PositionalOperatorDefinitionImpl <em>Positional Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.PositionalOperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getPositionalOperatorDefinition()
   * @generated
   */
  int POSITIONAL_OPERATOR_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_OPERATOR_DEFINITION__NAME = BASIC_OPERATOR_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_OPERATOR_DEFINITION__IMPLEMENTATION = BASIC_OPERATOR_DEFINITION__IMPLEMENTATION;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_OPERATOR_DEFINITION__PARAMETERS = BASIC_OPERATOR_DEFINITION__PARAMETERS;

  /**
   * The number of structural features of the '<em>Positional Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_OPERATOR_DEFINITION_FEATURE_COUNT = BASIC_OPERATOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.HighlightOperatorDefinitionImpl <em>Highlight Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.HighlightOperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getHighlightOperatorDefinition()
   * @generated
   */
  int HIGHLIGHT_OPERATOR_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHLIGHT_OPERATOR_DEFINITION__NAME = BASIC_OPERATOR_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHLIGHT_OPERATOR_DEFINITION__IMPLEMENTATION = BASIC_OPERATOR_DEFINITION__IMPLEMENTATION;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHLIGHT_OPERATOR_DEFINITION__PARAMETERS = BASIC_OPERATOR_DEFINITION__PARAMETERS;

  /**
   * The number of structural features of the '<em>Highlight Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGHLIGHT_OPERATOR_DEFINITION_FEATURE_COUNT = BASIC_OPERATOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.TransformingOperatorDefinitionImpl <em>Transforming Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.TransformingOperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getTransformingOperatorDefinition()
   * @generated
   */
  int TRANSFORMING_OPERATOR_DEFINITION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMING_OPERATOR_DEFINITION__NAME = BASIC_OPERATOR_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMING_OPERATOR_DEFINITION__IMPLEMENTATION = BASIC_OPERATOR_DEFINITION__IMPLEMENTATION;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMING_OPERATOR_DEFINITION__PARAMETERS = BASIC_OPERATOR_DEFINITION__PARAMETERS;

  /**
   * The number of structural features of the '<em>Transforming Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMING_OPERATOR_DEFINITION_FEATURE_COUNT = BASIC_OPERATOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl <em>Alias Operator Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getAliasOperatorDefinition()
   * @generated
   */
  int ALIAS_OPERATOR_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_OPERATOR_DEFINITION__NAME = OPERATOR_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_OPERATOR_DEFINITION__OPERATOR = OPERATOR_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_OPERATOR_DEFINITION__PARAMETERS = OPERATOR_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alias Operator Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_OPERATOR_DEFINITION_FEATURE_COUNT = OPERATOR_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl <em>Parameter Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterApplication()
   * @generated
   */
  int PARAMETER_APPLICATION = 10;

  /**
   * The feature id for the '<em><b>Referenced Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_APPLICATION__REFERENCED_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_APPLICATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ParameterDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterDefinition()
   * @generated
   */
  int PARAMETER_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.StringParameterDefinitionImpl <em>String Parameter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.StringParameterDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringParameterDefinition()
   * @generated
   */
  int STRING_PARAMETER_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER_DEFINITION__NAME = PARAMETER_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER_DEFINITION__VALUE = PARAMETER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Parameter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER_DEFINITION_FEATURE_COUNT = PARAMETER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.IntParameterDefinitionImpl <em>Int Parameter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.IntParameterDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntParameterDefinition()
   * @generated
   */
  int INT_PARAMETER_DEFINITION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_PARAMETER_DEFINITION__NAME = PARAMETER_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_PARAMETER_DEFINITION__VALUE = PARAMETER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Parameter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_PARAMETER_DEFINITION_FEATURE_COUNT = PARAMETER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl <em>Enum Parameter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getEnumParameterDefinition()
   * @generated
   */
  int ENUM_PARAMETER_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PARAMETER_DEFINITION__NAME = PARAMETER_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PARAMETER_DEFINITION__ALTERNATIVES = PARAMETER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PARAMETER_DEFINITION__ENUMERATION = PARAMETER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PARAMETER_DEFINITION__VALUE = PARAMETER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Parameter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PARAMETER_DEFINITION_FEATURE_COUNT = PARAMETER_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl <em>Global Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getGlobalEnum()
   * @generated
   */
  int GLOBAL_ENUM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ENUM__NAME = 0;

  /**
   * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ENUM__ALTERNATIVES = 1;

  /**
   * The number of structural features of the '<em>Global Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ENUM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.EnumAlternativeImpl <em>Enum Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.EnumAlternativeImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getEnumAlternative()
   * @generated
   */
  int ENUM_ALTERNATIVE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ALTERNATIVE__NAME = CONSTANT__NAME;

  /**
   * The number of structural features of the '<em>Enum Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ALTERNATIVE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.StringParameterValueImpl <em>String Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.StringParameterValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringParameterValue()
   * @generated
   */
  int STRING_PARAMETER_VALUE = 17;

  /**
   * The number of structural features of the '<em>String Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationValueImpl <em>Parameter Application Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ParameterApplicationValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterApplicationValue()
   * @generated
   */
  int PARAMETER_APPLICATION_VALUE = 18;

  /**
   * The number of structural features of the '<em>Parameter Application Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_APPLICATION_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.ConstantReferenceValueImpl <em>Constant Reference Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.ConstantReferenceValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getConstantReferenceValue()
   * @generated
   */
  int CONSTANT_REFERENCE_VALUE = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_REFERENCE_VALUE__VALUE = PARAMETER_APPLICATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Reference Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_REFERENCE_VALUE_FEATURE_COUNT = PARAMETER_APPLICATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.StringValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = STRING_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = STRING_PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.StringConstantApplicationImpl <em>String Constant Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.StringConstantApplicationImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringConstantApplication()
   * @generated
   */
  int STRING_CONSTANT_APPLICATION = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_APPLICATION__VALUE = STRING_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_APPLICATION_FEATURE_COUNT = STRING_PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.IntParameterValueImpl <em>Int Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.IntParameterValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntParameterValue()
   * @generated
   */
  int INT_PARAMETER_VALUE = 23;

  /**
   * The number of structural features of the '<em>Int Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_PARAMETER_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.IntValueImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = PARAMETER_APPLICATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = PARAMETER_APPLICATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gpp.tests.operators.operatorsTest.impl.IntConstantApplicationImpl <em>Int Constant Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gpp.tests.operators.operatorsTest.impl.IntConstantApplicationImpl
   * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntConstantApplication()
   * @generated
   */
  int INT_CONSTANT_APPLICATION = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_APPLICATION__VALUE = INT_PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_APPLICATION_FEATURE_COUNT = INT_PARAMETER_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.BoxModelOperators <em>Box Model Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Box Model Operators</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators
   * @generated
   */
  EClass getBoxModelOperators();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators#getImports()
   * @see #getBoxModelOperators()
   * @generated
   */
  EReference getBoxModelOperators_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getOperatorDefinitions <em>Operator Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operator Definitions</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators#getOperatorDefinitions()
   * @see #getBoxModelOperators()
   * @generated
   */
  EReference getBoxModelOperators_OperatorDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getEnumerations <em>Enumerations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumerations</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators#getEnumerations()
   * @see #getBoxModelOperators()
   * @generated
   */
  EReference getBoxModelOperators_Enumerations();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getIntConstants <em>Int Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Int Constants</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators#getIntConstants()
   * @see #getBoxModelOperators()
   * @generated
   */
  EReference getBoxModelOperators_IntConstants();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getStringConstants <em>String Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>String Constants</em>'.
   * @see gpp.tests.operators.operatorsTest.BoxModelOperators#getStringConstants()
   * @see #getBoxModelOperators()
   * @generated
   */
  EReference getBoxModelOperators_StringConstants();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see gpp.tests.operators.operatorsTest.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.StringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringConstant#getValue()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see gpp.tests.operators.operatorsTest.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.IntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntConstant#getValue()
   * @see #getIntConstant()
   * @generated
   */
  EAttribute getIntConstant_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see gpp.tests.operators.operatorsTest.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see gpp.tests.operators.operatorsTest.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.OperatorDefinition <em>Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.OperatorDefinition
   * @generated
   */
  EClass getOperatorDefinition();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.OperatorDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gpp.tests.operators.operatorsTest.OperatorDefinition#getName()
   * @see #getOperatorDefinition()
   * @generated
   */
  EAttribute getOperatorDefinition_Name();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition <em>Basic Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.BasicOperatorDefinition
   * @generated
   */
  EClass getBasicOperatorDefinition();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getImplementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implementation</em>'.
   * @see gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getImplementation()
   * @see #getBasicOperatorDefinition()
   * @generated
   */
  EAttribute getBasicOperatorDefinition_Implementation();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getParameters()
   * @see #getBasicOperatorDefinition()
   * @generated
   */
  EReference getBasicOperatorDefinition_Parameters();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.PositionalOperatorDefinition <em>Positional Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positional Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.PositionalOperatorDefinition
   * @generated
   */
  EClass getPositionalOperatorDefinition();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.HighlightOperatorDefinition <em>Highlight Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Highlight Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.HighlightOperatorDefinition
   * @generated
   */
  EClass getHighlightOperatorDefinition();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.TransformingOperatorDefinition <em>Transforming Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transforming Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.TransformingOperatorDefinition
   * @generated
   */
  EClass getTransformingOperatorDefinition();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition <em>Alias Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias Operator Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.AliasOperatorDefinition
   * @generated
   */
  EClass getAliasOperatorDefinition();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operator</em>'.
   * @see gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getOperator()
   * @see #getAliasOperatorDefinition()
   * @generated
   */
  EReference getAliasOperatorDefinition_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getParameters()
   * @see #getAliasOperatorDefinition()
   * @generated
   */
  EReference getAliasOperatorDefinition_Parameters();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.ParameterApplication <em>Parameter Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Application</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterApplication
   * @generated
   */
  EClass getParameterApplication();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.ParameterApplication#getReferencedParameter <em>Referenced Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Parameter</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterApplication#getReferencedParameter()
   * @see #getParameterApplication()
   * @generated
   */
  EReference getParameterApplication_ReferencedParameter();

  /**
   * Returns the meta object for the containment reference '{@link gpp.tests.operators.operatorsTest.ParameterApplication#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterApplication#getValue()
   * @see #getParameterApplication()
   * @generated
   */
  EReference getParameterApplication_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.ParameterDefinition <em>Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterDefinition
   * @generated
   */
  EClass getParameterDefinition();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.ParameterDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterDefinition#getName()
   * @see #getParameterDefinition()
   * @generated
   */
  EAttribute getParameterDefinition_Name();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.StringParameterDefinition <em>String Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Parameter Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.StringParameterDefinition
   * @generated
   */
  EClass getStringParameterDefinition();

  /**
   * Returns the meta object for the containment reference '{@link gpp.tests.operators.operatorsTest.StringParameterDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringParameterDefinition#getValue()
   * @see #getStringParameterDefinition()
   * @generated
   */
  EReference getStringParameterDefinition_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.IntParameterDefinition <em>Int Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Parameter Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.IntParameterDefinition
   * @generated
   */
  EClass getIntParameterDefinition();

  /**
   * Returns the meta object for the containment reference '{@link gpp.tests.operators.operatorsTest.IntParameterDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntParameterDefinition#getValue()
   * @see #getIntParameterDefinition()
   * @generated
   */
  EReference getIntParameterDefinition_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition <em>Enum Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Parameter Definition</em>'.
   * @see gpp.tests.operators.operatorsTest.EnumParameterDefinition
   * @generated
   */
  EClass getEnumParameterDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getAlternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternatives</em>'.
   * @see gpp.tests.operators.operatorsTest.EnumParameterDefinition#getAlternatives()
   * @see #getEnumParameterDefinition()
   * @generated
   */
  EReference getEnumParameterDefinition_Alternatives();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getEnumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enumeration</em>'.
   * @see gpp.tests.operators.operatorsTest.EnumParameterDefinition#getEnumeration()
   * @see #getEnumParameterDefinition()
   * @generated
   */
  EReference getEnumParameterDefinition_Enumeration();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.EnumParameterDefinition#getValue()
   * @see #getEnumParameterDefinition()
   * @generated
   */
  EReference getEnumParameterDefinition_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.GlobalEnum <em>Global Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Enum</em>'.
   * @see gpp.tests.operators.operatorsTest.GlobalEnum
   * @generated
   */
  EClass getGlobalEnum();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.GlobalEnum#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gpp.tests.operators.operatorsTest.GlobalEnum#getName()
   * @see #getGlobalEnum()
   * @generated
   */
  EAttribute getGlobalEnum_Name();

  /**
   * Returns the meta object for the containment reference list '{@link gpp.tests.operators.operatorsTest.GlobalEnum#getAlternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternatives</em>'.
   * @see gpp.tests.operators.operatorsTest.GlobalEnum#getAlternatives()
   * @see #getGlobalEnum()
   * @generated
   */
  EReference getGlobalEnum_Alternatives();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.EnumAlternative <em>Enum Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Alternative</em>'.
   * @see gpp.tests.operators.operatorsTest.EnumAlternative
   * @generated
   */
  EClass getEnumAlternative();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.StringParameterValue <em>String Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Parameter Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringParameterValue
   * @generated
   */
  EClass getStringParameterValue();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.ParameterApplicationValue <em>Parameter Application Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Application Value</em>'.
   * @see gpp.tests.operators.operatorsTest.ParameterApplicationValue
   * @generated
   */
  EClass getParameterApplicationValue();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.ConstantReferenceValue <em>Constant Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Reference Value</em>'.
   * @see gpp.tests.operators.operatorsTest.ConstantReferenceValue
   * @generated
   */
  EClass getConstantReferenceValue();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.ConstantReferenceValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.ConstantReferenceValue#getValue()
   * @see #getConstantReferenceValue()
   * @generated
   */
  EReference getConstantReferenceValue_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see gpp.tests.operators.operatorsTest.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gpp.tests.operators.operatorsTest.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.StringConstantApplication <em>String Constant Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant Application</em>'.
   * @see gpp.tests.operators.operatorsTest.StringConstantApplication
   * @generated
   */
  EClass getStringConstantApplication();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.StringConstantApplication#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.StringConstantApplication#getValue()
   * @see #getStringConstantApplication()
   * @generated
   */
  EReference getStringConstantApplication_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.IntParameterValue <em>Int Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Parameter Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntParameterValue
   * @generated
   */
  EClass getIntParameterValue();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link gpp.tests.operators.operatorsTest.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link gpp.tests.operators.operatorsTest.IntConstantApplication <em>Int Constant Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant Application</em>'.
   * @see gpp.tests.operators.operatorsTest.IntConstantApplication
   * @generated
   */
  EClass getIntConstantApplication();

  /**
   * Returns the meta object for the reference '{@link gpp.tests.operators.operatorsTest.IntConstantApplication#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see gpp.tests.operators.operatorsTest.IntConstantApplication#getValue()
   * @see #getIntConstantApplication()
   * @generated
   */
  EReference getIntConstantApplication_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OperatorsTestFactory getOperatorsTestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl <em>Box Model Operators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getBoxModelOperators()
     * @generated
     */
    EClass BOX_MODEL_OPERATORS = eINSTANCE.getBoxModelOperators();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_MODEL_OPERATORS__IMPORTS = eINSTANCE.getBoxModelOperators_Imports();

    /**
     * The meta object literal for the '<em><b>Operator Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS = eINSTANCE.getBoxModelOperators_OperatorDefinitions();

    /**
     * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_MODEL_OPERATORS__ENUMERATIONS = eINSTANCE.getBoxModelOperators_Enumerations();

    /**
     * The meta object literal for the '<em><b>Int Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_MODEL_OPERATORS__INT_CONSTANTS = eINSTANCE.getBoxModelOperators_IntConstants();

    /**
     * The meta object literal for the '<em><b>String Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOX_MODEL_OPERATORS__STRING_CONSTANTS = eINSTANCE.getBoxModelOperators_StringConstants();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.StringConstantImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringConstant()
     * @generated
     */
    EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.IntConstantImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ImportImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.OperatorDefinitionImpl <em>Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.OperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getOperatorDefinition()
     * @generated
     */
    EClass OPERATOR_DEFINITION = eINSTANCE.getOperatorDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR_DEFINITION__NAME = eINSTANCE.getOperatorDefinition_Name();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.BasicOperatorDefinitionImpl <em>Basic Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.BasicOperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getBasicOperatorDefinition()
     * @generated
     */
    EClass BASIC_OPERATOR_DEFINITION = eINSTANCE.getBasicOperatorDefinition();

    /**
     * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_OPERATOR_DEFINITION__IMPLEMENTATION = eINSTANCE.getBasicOperatorDefinition_Implementation();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_OPERATOR_DEFINITION__PARAMETERS = eINSTANCE.getBasicOperatorDefinition_Parameters();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.PositionalOperatorDefinitionImpl <em>Positional Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.PositionalOperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getPositionalOperatorDefinition()
     * @generated
     */
    EClass POSITIONAL_OPERATOR_DEFINITION = eINSTANCE.getPositionalOperatorDefinition();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.HighlightOperatorDefinitionImpl <em>Highlight Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.HighlightOperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getHighlightOperatorDefinition()
     * @generated
     */
    EClass HIGHLIGHT_OPERATOR_DEFINITION = eINSTANCE.getHighlightOperatorDefinition();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.TransformingOperatorDefinitionImpl <em>Transforming Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.TransformingOperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getTransformingOperatorDefinition()
     * @generated
     */
    EClass TRANSFORMING_OPERATOR_DEFINITION = eINSTANCE.getTransformingOperatorDefinition();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl <em>Alias Operator Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getAliasOperatorDefinition()
     * @generated
     */
    EClass ALIAS_OPERATOR_DEFINITION = eINSTANCE.getAliasOperatorDefinition();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS_OPERATOR_DEFINITION__OPERATOR = eINSTANCE.getAliasOperatorDefinition_Operator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS_OPERATOR_DEFINITION__PARAMETERS = eINSTANCE.getAliasOperatorDefinition_Parameters();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl <em>Parameter Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterApplication()
     * @generated
     */
    EClass PARAMETER_APPLICATION = eINSTANCE.getParameterApplication();

    /**
     * The meta object literal for the '<em><b>Referenced Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_APPLICATION__REFERENCED_PARAMETER = eINSTANCE.getParameterApplication_ReferencedParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_APPLICATION__VALUE = eINSTANCE.getParameterApplication_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ParameterDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterDefinition()
     * @generated
     */
    EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.StringParameterDefinitionImpl <em>String Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.StringParameterDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringParameterDefinition()
     * @generated
     */
    EClass STRING_PARAMETER_DEFINITION = eINSTANCE.getStringParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_PARAMETER_DEFINITION__VALUE = eINSTANCE.getStringParameterDefinition_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.IntParameterDefinitionImpl <em>Int Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.IntParameterDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntParameterDefinition()
     * @generated
     */
    EClass INT_PARAMETER_DEFINITION = eINSTANCE.getIntParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_PARAMETER_DEFINITION__VALUE = eINSTANCE.getIntParameterDefinition_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl <em>Enum Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getEnumParameterDefinition()
     * @generated
     */
    EClass ENUM_PARAMETER_DEFINITION = eINSTANCE.getEnumParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_PARAMETER_DEFINITION__ALTERNATIVES = eINSTANCE.getEnumParameterDefinition_Alternatives();

    /**
     * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_PARAMETER_DEFINITION__ENUMERATION = eINSTANCE.getEnumParameterDefinition_Enumeration();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_PARAMETER_DEFINITION__VALUE = eINSTANCE.getEnumParameterDefinition_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl <em>Global Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getGlobalEnum()
     * @generated
     */
    EClass GLOBAL_ENUM = eINSTANCE.getGlobalEnum();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_ENUM__NAME = eINSTANCE.getGlobalEnum_Name();

    /**
     * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_ENUM__ALTERNATIVES = eINSTANCE.getGlobalEnum_Alternatives();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.EnumAlternativeImpl <em>Enum Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.EnumAlternativeImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getEnumAlternative()
     * @generated
     */
    EClass ENUM_ALTERNATIVE = eINSTANCE.getEnumAlternative();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.StringParameterValueImpl <em>String Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.StringParameterValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringParameterValue()
     * @generated
     */
    EClass STRING_PARAMETER_VALUE = eINSTANCE.getStringParameterValue();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationValueImpl <em>Parameter Application Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ParameterApplicationValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getParameterApplicationValue()
     * @generated
     */
    EClass PARAMETER_APPLICATION_VALUE = eINSTANCE.getParameterApplicationValue();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ConstantReferenceValueImpl <em>Constant Reference Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ConstantReferenceValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getConstantReferenceValue()
     * @generated
     */
    EClass CONSTANT_REFERENCE_VALUE = eINSTANCE.getConstantReferenceValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_REFERENCE_VALUE__VALUE = eINSTANCE.getConstantReferenceValue_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.ConstantImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.StringValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.StringConstantApplicationImpl <em>String Constant Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.StringConstantApplicationImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getStringConstantApplication()
     * @generated
     */
    EClass STRING_CONSTANT_APPLICATION = eINSTANCE.getStringConstantApplication();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_CONSTANT_APPLICATION__VALUE = eINSTANCE.getStringConstantApplication_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.IntParameterValueImpl <em>Int Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.IntParameterValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntParameterValue()
     * @generated
     */
    EClass INT_PARAMETER_VALUE = eINSTANCE.getIntParameterValue();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.IntValueImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link gpp.tests.operators.operatorsTest.impl.IntConstantApplicationImpl <em>Int Constant Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gpp.tests.operators.operatorsTest.impl.IntConstantApplicationImpl
     * @see gpp.tests.operators.operatorsTest.impl.OperatorsTestPackageImpl#getIntConstantApplication()
     * @generated
     */
    EClass INT_CONSTANT_APPLICATION = eINSTANCE.getIntConstantApplication();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_CONSTANT_APPLICATION__VALUE = eINSTANCE.getIntConstantApplication_Value();

  }

} //OperatorsTestPackage
