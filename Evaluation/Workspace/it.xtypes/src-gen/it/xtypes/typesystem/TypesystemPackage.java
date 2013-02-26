/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

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
 * @see it.xtypes.typesystem.TypesystemFactory
 * @model kind="package"
 * @generated
 */
public interface TypesystemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "typesystem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://xtypes.sf.net/TypeSystem";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "typesystem";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypesystemPackage eINSTANCE = it.xtypes.typesystem.impl.TypesystemPackageImpl.init();

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl <em>Type System Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.TypeSystemDefinitionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypeSystemDefinition()
   * @generated
   */
  int TYPE_SYSTEM_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__EPACKAGE = 1;

  /**
   * The feature id for the '<em><b>Gen Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__GEN_MODEL = 2;

  /**
   * The feature id for the '<em><b>Judgment Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__RULES = 4;

  /**
   * The feature id for the '<em><b>EPackage URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION__EPACKAGE_URI = 5;

  /**
   * The number of structural features of the '<em>Type System Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SYSTEM_DEFINITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl <em>Judgment Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.JudgmentDescriptionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getJudgmentDescription()
   * @generated
   */
  int JUDGMENT_DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Judgmentsymbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__RELATION = 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__KIND = 2;

  /**
   * The feature id for the '<em><b>Success</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__SUCCESS = 3;

  /**
   * The feature id for the '<em><b>Fail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__FAIL = 4;

  /**
   * The feature id for the '<em><b>Nomatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__NOMATCH = 5;

  /**
   * The feature id for the '<em><b>Binary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION__BINARY = 6;

  /**
   * The number of structural features of the '<em>Judgment Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUDGMENT_DESCRIPTION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.RuleImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Typejudgment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__TYPEJUDGMENT = 1;

  /**
   * The feature id for the '<em><b>Containing Type System</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONTAINING_TYPE_SYSTEM = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.AxiomImpl <em>Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.AxiomImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getAxiom()
   * @generated
   */
  int AXIOM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Typejudgment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM__TYPEJUDGMENT = RULE__TYPEJUDGMENT;

  /**
   * The feature id for the '<em><b>Containing Type System</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM__CONTAINING_TYPE_SYSTEM = RULE__CONTAINING_TYPE_SYSTEM;

  /**
   * The number of structural features of the '<em>Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.RuleWithPremisesImpl <em>Rule With Premises</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.RuleWithPremisesImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getRuleWithPremises()
   * @generated
   */
  int RULE_WITH_PREMISES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PREMISES__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Typejudgment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PREMISES__TYPEJUDGMENT = RULE__TYPEJUDGMENT;

  /**
   * The feature id for the '<em><b>Containing Type System</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PREMISES__CONTAINING_TYPE_SYSTEM = RULE__CONTAINING_TYPE_SYSTEM;

  /**
   * The feature id for the '<em><b>Premises</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PREMISES__PREMISES = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rule With Premises</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PREMISES_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.TypingJudgmentImpl <em>Typing Judgment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.TypingJudgmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingJudgment()
   * @generated
   */
  int TYPING_JUDGMENT = 5;

  /**
   * The number of structural features of the '<em>Typing Judgment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.OrTypingJudgmentImpl <em>Or Typing Judgment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.OrTypingJudgmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getOrTypingJudgment()
   * @generated
   */
  int OR_TYPING_JUDGMENT = 6;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_TYPING_JUDGMENT__BRANCHES = TYPING_JUDGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_TYPING_JUDGMENT__ERROR = TYPING_JUDGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Typing Judgment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_TYPING_JUDGMENT_FEATURE_COUNT = TYPING_JUDGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.OrBranchImpl <em>Or Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.OrBranchImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getOrBranch()
   * @generated
   */
  int OR_BRANCH = 7;

  /**
   * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_BRANCH__JUDGMENTS = 0;

  /**
   * The number of structural features of the '<em>Or Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_BRANCH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.VariableDeclarationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl <em>Variable Declaration With Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableDeclarationWithType()
   * @generated
   */
  int VARIABLE_DECLARATION_WITH_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_WITH_TYPE__NAME = TYPING_JUDGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE = TYPING_JUDGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_WITH_TYPE__OP = TYPING_JUDGMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_WITH_TYPE__RIGHT = TYPING_JUDGMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable Declaration With Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_WITH_TYPE_FEATURE_COUNT = TYPING_JUDGMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ExpressionTypeImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExpressionType()
   * @generated
   */
  int EXPRESSION_TYPE = 10;

  /**
   * The number of structural features of the '<em>Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.CollectionTypeImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 11;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__COLLECTION = EXPRESSION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__TYPE = EXPRESSION_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EClassifierTypeImpl <em>EClassifier Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EClassifierTypeImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEClassifierType()
   * @generated
   */
  int ECLASSIFIER_TYPE = 12;

  /**
   * The feature id for the '<em><b>Eclassifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER_TYPE__ECLASSIFIER = EXPRESSION_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EClassifier Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASSIFIER_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.BasicTypeImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 13;

  /**
   * The feature id for the '<em><b>Basic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BASIC = EXPRESSION_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.VariableSimpleDeclarationImpl <em>Variable Simple Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.VariableSimpleDeclarationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableSimpleDeclaration()
   * @generated
   */
  int VARIABLE_SIMPLE_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_SIMPLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Variable Simple Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_SIMPLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.QuantificationImpl <em>Quantification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.QuantificationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getQuantification()
   * @generated
   */
  int QUANTIFICATION = 15;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFICATION__ERROR = TYPING_JUDGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFICATION__EXPRESSION = TYPING_JUDGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFICATION__VARIABLE = TYPING_JUDGMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFICATION__JUDGMENTS = TYPING_JUDGMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Quantification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFICATION_FEATURE_COUNT = TYPING_JUDGMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ForEachImpl <em>For Each</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ForEachImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getForEach()
   * @generated
   */
  int FOR_EACH = 16;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH__ERROR = QUANTIFICATION__ERROR;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH__EXPRESSION = QUANTIFICATION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH__VARIABLE = QUANTIFICATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH__JUDGMENTS = QUANTIFICATION__JUDGMENTS;

  /**
   * The number of structural features of the '<em>For Each</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ForAllImpl <em>For All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ForAllImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getForAll()
   * @generated
   */
  int FOR_ALL = 17;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__ERROR = QUANTIFICATION__ERROR;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__EXPRESSION = QUANTIFICATION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__VARIABLE = QUANTIFICATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__JUDGMENTS = QUANTIFICATION__JUDGMENTS;

  /**
   * The number of structural features of the '<em>For All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ExistsImpl <em>Exists</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ExistsImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExists()
   * @generated
   */
  int EXISTS = 18;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS__ERROR = QUANTIFICATION__ERROR;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS__EXPRESSION = QUANTIFICATION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS__VARIABLE = QUANTIFICATION__VARIABLE;

  /**
   * The feature id for the '<em><b>Judgments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS__JUDGMENTS = QUANTIFICATION__JUDGMENTS;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS__NOT = QUANTIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exists</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.StandardOperationImpl <em>Standard Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.StandardOperationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getStandardOperation()
   * @generated
   */
  int STANDARD_OPERATION = 19;

  /**
   * The number of structural features of the '<em>Standard Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_OPERATION_FEATURE_COUNT = TYPING_JUDGMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentOperationImpl <em>Environment Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentOperationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentOperation()
   * @generated
   */
  int ENVIRONMENT_OPERATION = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_OPERATION__LEFT = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_OPERATION_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ListOperationImpl <em>List Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ListOperationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListOperation()
   * @generated
   */
  int LIST_OPERATION = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OPERATION__LEFT = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OPERATION__RIGHT = STANDARD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OPERATION_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.AssignmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LEFT = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RIGHT = STANDARD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EqualsImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP = STANDARD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = STANDARD_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__ERROR = STANDARD_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.FailImpl <em>Fail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.FailImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFail()
   * @generated
   */
  int FAIL = 24;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL__ERROR = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.SuccessImpl <em>Success</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.SuccessImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getSuccess()
   * @generated
   */
  int SUCCESS = 25;

  /**
   * The number of structural features of the '<em>Success</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS_FEATURE_COUNT = STANDARD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl <em>Typing Judgment With Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingJudgmentWithEnvironment()
   * @generated
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT = 26;

  /**
   * The feature id for the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT = TYPING_JUDGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typejudgmentsymbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL = TYPING_JUDGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Typingstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT = TYPING_JUDGMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR = TYPING_JUDGMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Typing Judgment With Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_JUDGMENT_WITH_ENVIRONMENT_FEATURE_COUNT = TYPING_JUDGMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ErrorSpecificationImpl <em>Error Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ErrorSpecificationImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorSpecification()
   * @generated
   */
  int ERROR_SPECIFICATION = 27;

  /**
   * The feature id for the '<em><b>Failure Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SPECIFICATION__FAILURE_ERROR = 0;

  /**
   * The number of structural features of the '<em>Error Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.FailureErrorImpl <em>Failure Error</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.FailureErrorImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFailureError()
   * @generated
   */
  int FAILURE_ERROR = 28;

  /**
   * The number of structural features of the '<em>Failure Error</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE_ERROR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.TypingStatementImpl <em>Typing Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.TypingStatementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingStatement()
   * @generated
   */
  int TYPING_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_STATEMENT__LEFT = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_STATEMENT__RELATION = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_STATEMENT__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Typing Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.TypingStatementExpressionImpl <em>Typing Statement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.TypingStatementExpressionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingStatementExpression()
   * @generated
   */
  int TYPING_STATEMENT_EXPRESSION = 30;

  /**
   * The number of structural features of the '<em>Typing Statement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPING_STATEMENT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 31;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentIdImpl <em>Environment Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentIdImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentId()
   * @generated
   */
  int ENVIRONMENT_ID = 32;

  /**
   * The feature id for the '<em><b>Environment Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ID__ENVIRONMENT_ID = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ID_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentStatementImpl <em>Environment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentStatementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentStatement()
   * @generated
   */
  int ENVIRONMENT_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_STATEMENT__LEFT = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_STATEMENT__RELATION = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_STATEMENT__RIGHT = ENVIRONMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Environment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EmptyEnvironmentImpl <em>Empty Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EmptyEnvironmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEmptyEnvironment()
   * @generated
   */
  int EMPTY_ENVIRONMENT = 34;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ENVIRONMENT__EMPTY = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Empty Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ENVIRONMENT_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ExpressionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 35;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = TYPING_STATEMENT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.StringConstantImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.IntegerConstantImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIntegerConstant()
   * @generated
   */
  int INTEGER_CONSTANT = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.VariableAccessImpl <em>Variable Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.VariableAccessImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableAccess()
   * @generated
   */
  int VARIABLE_ACCESS = 38;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS__VAR_REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.VariableReferenceImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 39;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR_REF = VARIABLE_ACCESS__VAR_REF;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = VARIABLE_ACCESS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.IndexedVariableImpl <em>Indexed Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.IndexedVariableImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIndexedVariable()
   * @generated
   */
  int INDEXED_VARIABLE = 40;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_VARIABLE__VAR_REF = VARIABLE_ACCESS__VAR_REF;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_VARIABLE__INDEX = VARIABLE_ACCESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indexed Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_VARIABLE_FEATURE_COUNT = VARIABLE_ACCESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.SubExpressionImpl <em>Sub Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.SubExpressionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getSubExpression()
   * @generated
   */
  int SUB_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EXPRESSION__FEATURE = 0;

  /**
   * The number of structural features of the '<em>Sub Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ArrayIndexImpl <em>Array Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ArrayIndexImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getArrayIndex()
   * @generated
   */
  int ARRAY_INDEX = 42;

  /**
   * The number of structural features of the '<em>Array Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentAssignmentImpl <em>Environment Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentAssignmentImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentAssignment()
   * @generated
   */
  int ENVIRONMENT_ASSIGNMENT = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ASSIGNMENT__LEFT = ENVIRONMENT_OPERATION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ASSIGNMENT__RIGHT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ASSIGNMENT_FEATURE_COUNT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentIncrementImpl <em>Environment Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentIncrementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentIncrement()
   * @generated
   */
  int ENVIRONMENT_INCREMENT = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_INCREMENT__LEFT = ENVIRONMENT_OPERATION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_INCREMENT__RIGHT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_INCREMENT_FEATURE_COUNT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentDecrementImpl <em>Environment Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentDecrementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentDecrement()
   * @generated
   */
  int ENVIRONMENT_DECREMENT = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_DECREMENT__LEFT = ENVIRONMENT_OPERATION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_DECREMENT__RIGHT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Environment Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_DECREMENT_FEATURE_COUNT = ENVIRONMENT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ListIncrementImpl <em>List Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ListIncrementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListIncrement()
   * @generated
   */
  int LIST_INCREMENT = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_INCREMENT__LEFT = LIST_OPERATION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_INCREMENT__RIGHT = LIST_OPERATION__RIGHT;

  /**
   * The number of structural features of the '<em>List Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_INCREMENT_FEATURE_COUNT = LIST_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ListDecrementImpl <em>List Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ListDecrementImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListDecrement()
   * @generated
   */
  int LIST_DECREMENT = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECREMENT__LEFT = LIST_OPERATION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECREMENT__RIGHT = LIST_OPERATION__RIGHT;

  /**
   * The number of structural features of the '<em>List Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECREMENT_FEATURE_COUNT = LIST_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ComposedErrorImpl <em>Composed Error</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ComposedErrorImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getComposedError()
   * @generated
   */
  int COMPOSED_ERROR = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_ERROR__LEFT = FAILURE_ERROR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_ERROR__OP = FAILURE_ERROR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_ERROR__RIGHT = FAILURE_ERROR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Composed Error</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSED_ERROR_FEATURE_COUNT = FAILURE_ERROR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ErrorStringImpl <em>Error String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ErrorStringImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorString()
   * @generated
   */
  int ERROR_STRING = 49;

  /**
   * The feature id for the '<em><b>Err String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STRING__ERR_STRING = FAILURE_ERROR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Error String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STRING_FEATURE_COUNT = FAILURE_ERROR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ErrorExpressionImpl <em>Error Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ErrorExpressionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorExpression()
   * @generated
   */
  int ERROR_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EXPRESSION__EXPRESSION = FAILURE_ERROR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Error Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EXPRESSION_FEATURE_COUNT = FAILURE_ERROR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentCompositionImpl <em>Environment Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentCompositionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentComposition()
   * @generated
   */
  int ENVIRONMENT_COMPOSITION = 51;

  /**
   * The feature id for the '<em><b>Current Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPOSITION__OP = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT = ENVIRONMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Environment Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_COMPOSITION_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.EnvironmentAccessImpl <em>Environment Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.EnvironmentAccessImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentAccess()
   * @generated
   */
  int ENVIRONMENT_ACCESS = 52;

  /**
   * The feature id for the '<em><b>Env Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ACCESS__ENV_ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ACCESS__ARGUMENT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Environment Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.LengthImpl <em>Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.LengthImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getLength()
   * @generated
   */
  int LENGTH = 53;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__ARGUMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.GetAllImpl <em>Get All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.GetAllImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getGetAll()
   * @generated
   */
  int GET_ALL = 54;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ALL__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mainfeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ALL__MAINFEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extendfeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ALL__EXTENDFEATURE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Get All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.ContainerImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 55;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ARGUMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.CastToImpl <em>Cast To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.CastToImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCastTo()
   * @generated
   */
  int CAST_TO = 56;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_TO__TYPE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_TO__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cast To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_TO_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.NullImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getNull()
   * @generated
   */
  int NULL = 57;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.NewNameImpl <em>New Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.NewNameImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getNewName()
   * @generated
   */
  int NEW_NAME = 58;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_NAME__ARGUMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_NAME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.CloneImpl <em>Clone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.CloneImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getClone()
   * @generated
   */
  int CLONE = 59;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLONE__ARGUMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Clone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLONE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.CompoundExpressionImpl <em>Compound Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.CompoundExpressionImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCompoundExpression()
   * @generated
   */
  int COMPOUND_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPRESSION__MAIN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPRESSION__SUB_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compound Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.IndexedImpl <em>Indexed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.IndexedImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIndexed()
   * @generated
   */
  int INDEXED = 61;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED__FEATURE = SUB_EXPRESSION__FEATURE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED__INDEX = SUB_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indexed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_FEATURE_COUNT = SUB_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.xtypes.typesystem.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.xtypes.typesystem.impl.FeatureImpl
   * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 62;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE = SUB_EXPRESSION__FEATURE;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = SUB_EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.TypeSystemDefinition <em>Type System Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type System Definition</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition
   * @generated
   */
  EClass getTypeSystemDefinition();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.TypeSystemDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getName()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EAttribute getTypeSystemDefinition_Name();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EPackage</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getEPackage()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EReference getTypeSystemDefinition_EPackage();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.TypeSystemDefinition#getGenModel <em>Gen Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen Model</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getGenModel()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EAttribute getTypeSystemDefinition_GenModel();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.TypeSystemDefinition#getJudgmentDescriptions <em>Judgment Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Judgment Descriptions</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getJudgmentDescriptions()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EReference getTypeSystemDefinition_JudgmentDescriptions();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.TypeSystemDefinition#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getRules()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EReference getTypeSystemDefinition_Rules();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackageURI <em>EPackage URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EPackage URI</em>'.
   * @see it.xtypes.typesystem.TypeSystemDefinition#getEPackageURI()
   * @see #getTypeSystemDefinition()
   * @generated
   */
  EAttribute getTypeSystemDefinition_EPackageURI();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.JudgmentDescription <em>Judgment Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Judgment Description</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription
   * @generated
   */
  EClass getJudgmentDescription();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getJudgmentsymbol <em>Judgmentsymbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Judgmentsymbol</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getJudgmentsymbol()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Judgmentsymbol();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getRelation()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Relation();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getKind()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Kind();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getSuccess <em>Success</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Success</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getSuccess()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Success();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getFail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getFail()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Fail();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#getNomatch <em>Nomatch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nomatch</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#getNomatch()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Nomatch();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.JudgmentDescription#isBinary <em>Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Binary</em>'.
   * @see it.xtypes.typesystem.JudgmentDescription#isBinary()
   * @see #getJudgmentDescription()
   * @generated
   */
  EAttribute getJudgmentDescription_Binary();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see it.xtypes.typesystem.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.xtypes.typesystem.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Rule#getTypejudgment <em>Typejudgment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typejudgment</em>'.
   * @see it.xtypes.typesystem.Rule#getTypejudgment()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Typejudgment();

  /**
   * Returns the meta object for the container reference '{@link it.xtypes.typesystem.Rule#getContainingTypeSystem <em>Containing Type System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Containing Type System</em>'.
   * @see it.xtypes.typesystem.Rule#getContainingTypeSystem()
   * @see #getRule()
   * @generated
   */
  EReference getRule_ContainingTypeSystem();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axiom</em>'.
   * @see it.xtypes.typesystem.Axiom
   * @generated
   */
  EClass getAxiom();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.RuleWithPremises <em>Rule With Premises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule With Premises</em>'.
   * @see it.xtypes.typesystem.RuleWithPremises
   * @generated
   */
  EClass getRuleWithPremises();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.RuleWithPremises#getPremises <em>Premises</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Premises</em>'.
   * @see it.xtypes.typesystem.RuleWithPremises#getPremises()
   * @see #getRuleWithPremises()
   * @generated
   */
  EReference getRuleWithPremises_Premises();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.TypingJudgment <em>Typing Judgment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typing Judgment</em>'.
   * @see it.xtypes.typesystem.TypingJudgment
   * @generated
   */
  EClass getTypingJudgment();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.OrTypingJudgment <em>Or Typing Judgment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Typing Judgment</em>'.
   * @see it.xtypes.typesystem.OrTypingJudgment
   * @generated
   */
  EClass getOrTypingJudgment();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.OrTypingJudgment#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see it.xtypes.typesystem.OrTypingJudgment#getBranches()
   * @see #getOrTypingJudgment()
   * @generated
   */
  EReference getOrTypingJudgment_Branches();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.OrTypingJudgment#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see it.xtypes.typesystem.OrTypingJudgment#getError()
   * @see #getOrTypingJudgment()
   * @generated
   */
  EReference getOrTypingJudgment_Error();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.OrBranch <em>Or Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Branch</em>'.
   * @see it.xtypes.typesystem.OrBranch
   * @generated
   */
  EClass getOrBranch();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.OrBranch#getJudgments <em>Judgments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Judgments</em>'.
   * @see it.xtypes.typesystem.OrBranch#getJudgments()
   * @see #getOrBranch()
   * @generated
   */
  EReference getOrBranch_Judgments();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see it.xtypes.typesystem.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.xtypes.typesystem.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.VariableDeclarationWithType <em>Variable Declaration With Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration With Type</em>'.
   * @see it.xtypes.typesystem.VariableDeclarationWithType
   * @generated
   */
  EClass getVariableDeclarationWithType();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.VariableDeclarationWithType#getExpressionType <em>Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Type</em>'.
   * @see it.xtypes.typesystem.VariableDeclarationWithType#getExpressionType()
   * @see #getVariableDeclarationWithType()
   * @generated
   */
  EReference getVariableDeclarationWithType_ExpressionType();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.VariableDeclarationWithType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.xtypes.typesystem.VariableDeclarationWithType#getOp()
   * @see #getVariableDeclarationWithType()
   * @generated
   */
  EAttribute getVariableDeclarationWithType_Op();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.VariableDeclarationWithType#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.VariableDeclarationWithType#getRight()
   * @see #getVariableDeclarationWithType()
   * @generated
   */
  EReference getVariableDeclarationWithType_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ExpressionType <em>Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Type</em>'.
   * @see it.xtypes.typesystem.ExpressionType
   * @generated
   */
  EClass getExpressionType();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see it.xtypes.typesystem.CollectionType
   * @generated
   */
  EClass getCollectionType();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.CollectionType#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see it.xtypes.typesystem.CollectionType#getCollection()
   * @see #getCollectionType()
   * @generated
   */
  EAttribute getCollectionType_Collection();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.CollectionType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see it.xtypes.typesystem.CollectionType#getType()
   * @see #getCollectionType()
   * @generated
   */
  EReference getCollectionType_Type();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EClassifierType <em>EClassifier Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClassifier Type</em>'.
   * @see it.xtypes.typesystem.EClassifierType
   * @generated
   */
  EClass getEClassifierType();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.EClassifierType#getEclassifier <em>Eclassifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Eclassifier</em>'.
   * @see it.xtypes.typesystem.EClassifierType#getEclassifier()
   * @see #getEClassifierType()
   * @generated
   */
  EReference getEClassifierType_Eclassifier();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see it.xtypes.typesystem.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.BasicType#getBasic <em>Basic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Basic</em>'.
   * @see it.xtypes.typesystem.BasicType#getBasic()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_Basic();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.VariableSimpleDeclaration <em>Variable Simple Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Simple Declaration</em>'.
   * @see it.xtypes.typesystem.VariableSimpleDeclaration
   * @generated
   */
  EClass getVariableSimpleDeclaration();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Quantification <em>Quantification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantification</em>'.
   * @see it.xtypes.typesystem.Quantification
   * @generated
   */
  EClass getQuantification();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Quantification#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see it.xtypes.typesystem.Quantification#getError()
   * @see #getQuantification()
   * @generated
   */
  EReference getQuantification_Error();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Quantification#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.xtypes.typesystem.Quantification#getExpression()
   * @see #getQuantification()
   * @generated
   */
  EReference getQuantification_Expression();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Quantification#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see it.xtypes.typesystem.Quantification#getVariable()
   * @see #getQuantification()
   * @generated
   */
  EReference getQuantification_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link it.xtypes.typesystem.Quantification#getJudgments <em>Judgments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Judgments</em>'.
   * @see it.xtypes.typesystem.Quantification#getJudgments()
   * @see #getQuantification()
   * @generated
   */
  EReference getQuantification_Judgments();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ForEach <em>For Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each</em>'.
   * @see it.xtypes.typesystem.ForEach
   * @generated
   */
  EClass getForEach();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ForAll <em>For All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All</em>'.
   * @see it.xtypes.typesystem.ForAll
   * @generated
   */
  EClass getForAll();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Exists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists</em>'.
   * @see it.xtypes.typesystem.Exists
   * @generated
   */
  EClass getExists();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.Exists#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see it.xtypes.typesystem.Exists#isNot()
   * @see #getExists()
   * @generated
   */
  EAttribute getExists_Not();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.StandardOperation <em>Standard Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Standard Operation</em>'.
   * @see it.xtypes.typesystem.StandardOperation
   * @generated
   */
  EClass getStandardOperation();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentOperation <em>Environment Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Operation</em>'.
   * @see it.xtypes.typesystem.EnvironmentOperation
   * @generated
   */
  EClass getEnvironmentOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.EnvironmentOperation#getLeft()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EReference getEnvironmentOperation_Left();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ListOperation <em>List Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Operation</em>'.
   * @see it.xtypes.typesystem.ListOperation
   * @generated
   */
  EClass getListOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ListOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.ListOperation#getLeft()
   * @see #getListOperation()
   * @generated
   */
  EReference getListOperation_Left();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ListOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.ListOperation#getRight()
   * @see #getListOperation()
   * @generated
   */
  EReference getListOperation_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see it.xtypes.typesystem.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Assignment#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.Assignment#getLeft()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Left();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Assignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.Assignment#getRight()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see it.xtypes.typesystem.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.Equals#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.xtypes.typesystem.Equals#getOp()
   * @see #getEquals()
   * @generated
   */
  EAttribute getEquals_Op();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Equals#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see it.xtypes.typesystem.Equals#getError()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Error();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fail</em>'.
   * @see it.xtypes.typesystem.Fail
   * @generated
   */
  EClass getFail();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Fail#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see it.xtypes.typesystem.Fail#getError()
   * @see #getFail()
   * @generated
   */
  EReference getFail_Error();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Success <em>Success</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Success</em>'.
   * @see it.xtypes.typesystem.Success
   * @generated
   */
  EClass getSuccess();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment <em>Typing Judgment With Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typing Judgment With Environment</em>'.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment
   * @generated
   */
  EClass getTypingJudgmentWithEnvironment();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getEnvironment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Environment</em>'.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment#getEnvironment()
   * @see #getTypingJudgmentWithEnvironment()
   * @generated
   */
  EReference getTypingJudgmentWithEnvironment_Environment();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypejudgmentsymbol <em>Typejudgmentsymbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typejudgmentsymbol</em>'.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypejudgmentsymbol()
   * @see #getTypingJudgmentWithEnvironment()
   * @generated
   */
  EAttribute getTypingJudgmentWithEnvironment_Typejudgmentsymbol();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypingstatement <em>Typingstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typingstatement</em>'.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypingstatement()
   * @see #getTypingJudgmentWithEnvironment()
   * @generated
   */
  EReference getTypingJudgmentWithEnvironment_Typingstatement();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getError <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error</em>'.
   * @see it.xtypes.typesystem.TypingJudgmentWithEnvironment#getError()
   * @see #getTypingJudgmentWithEnvironment()
   * @generated
   */
  EReference getTypingJudgmentWithEnvironment_Error();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ErrorSpecification <em>Error Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Specification</em>'.
   * @see it.xtypes.typesystem.ErrorSpecification
   * @generated
   */
  EClass getErrorSpecification();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ErrorSpecification#getFailureError <em>Failure Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Failure Error</em>'.
   * @see it.xtypes.typesystem.ErrorSpecification#getFailureError()
   * @see #getErrorSpecification()
   * @generated
   */
  EReference getErrorSpecification_FailureError();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.FailureError <em>Failure Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Failure Error</em>'.
   * @see it.xtypes.typesystem.FailureError
   * @generated
   */
  EClass getFailureError();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.TypingStatement <em>Typing Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typing Statement</em>'.
   * @see it.xtypes.typesystem.TypingStatement
   * @generated
   */
  EClass getTypingStatement();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.TypingStatement#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.TypingStatement#getLeft()
   * @see #getTypingStatement()
   * @generated
   */
  EReference getTypingStatement_Left();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.TypingStatement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see it.xtypes.typesystem.TypingStatement#getRelation()
   * @see #getTypingStatement()
   * @generated
   */
  EAttribute getTypingStatement_Relation();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.TypingStatement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.TypingStatement#getRight()
   * @see #getTypingStatement()
   * @generated
   */
  EReference getTypingStatement_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.TypingStatementExpression <em>Typing Statement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typing Statement Expression</em>'.
   * @see it.xtypes.typesystem.TypingStatementExpression
   * @generated
   */
  EClass getTypingStatementExpression();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see it.xtypes.typesystem.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentId <em>Environment Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Id</em>'.
   * @see it.xtypes.typesystem.EnvironmentId
   * @generated
   */
  EClass getEnvironmentId();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.EnvironmentId#getEnvironmentId <em>Environment Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Environment Id</em>'.
   * @see it.xtypes.typesystem.EnvironmentId#getEnvironmentId()
   * @see #getEnvironmentId()
   * @generated
   */
  EAttribute getEnvironmentId_EnvironmentId();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentStatement <em>Environment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Statement</em>'.
   * @see it.xtypes.typesystem.EnvironmentStatement
   * @generated
   */
  EClass getEnvironmentStatement();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentStatement#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.EnvironmentStatement#getLeft()
   * @see #getEnvironmentStatement()
   * @generated
   */
  EReference getEnvironmentStatement_Left();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.EnvironmentStatement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation</em>'.
   * @see it.xtypes.typesystem.EnvironmentStatement#getRelation()
   * @see #getEnvironmentStatement()
   * @generated
   */
  EAttribute getEnvironmentStatement_Relation();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentStatement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.EnvironmentStatement#getRight()
   * @see #getEnvironmentStatement()
   * @generated
   */
  EReference getEnvironmentStatement_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EmptyEnvironment <em>Empty Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Environment</em>'.
   * @see it.xtypes.typesystem.EmptyEnvironment
   * @generated
   */
  EClass getEmptyEnvironment();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.EmptyEnvironment#getEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see it.xtypes.typesystem.EmptyEnvironment#getEmpty()
   * @see #getEmptyEnvironment()
   * @generated
   */
  EAttribute getEmptyEnvironment_Empty();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see it.xtypes.typesystem.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see it.xtypes.typesystem.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.StringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see it.xtypes.typesystem.StringConstant#getValue()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Value();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.IntegerConstant <em>Integer Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Constant</em>'.
   * @see it.xtypes.typesystem.IntegerConstant
   * @generated
   */
  EClass getIntegerConstant();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.IntegerConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see it.xtypes.typesystem.IntegerConstant#getValue()
   * @see #getIntegerConstant()
   * @generated
   */
  EAttribute getIntegerConstant_Value();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.VariableAccess <em>Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Access</em>'.
   * @see it.xtypes.typesystem.VariableAccess
   * @generated
   */
  EClass getVariableAccess();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.VariableAccess#getVarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var Ref</em>'.
   * @see it.xtypes.typesystem.VariableAccess#getVarRef()
   * @see #getVariableAccess()
   * @generated
   */
  EReference getVariableAccess_VarRef();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see it.xtypes.typesystem.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.IndexedVariable <em>Indexed Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Variable</em>'.
   * @see it.xtypes.typesystem.IndexedVariable
   * @generated
   */
  EClass getIndexedVariable();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.IndexedVariable#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see it.xtypes.typesystem.IndexedVariable#getIndex()
   * @see #getIndexedVariable()
   * @generated
   */
  EReference getIndexedVariable_Index();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.SubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Expression</em>'.
   * @see it.xtypes.typesystem.SubExpression
   * @generated
   */
  EClass getSubExpression();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.SubExpression#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see it.xtypes.typesystem.SubExpression#getFeature()
   * @see #getSubExpression()
   * @generated
   */
  EReference getSubExpression_Feature();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ArrayIndex <em>Array Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Index</em>'.
   * @see it.xtypes.typesystem.ArrayIndex
   * @generated
   */
  EClass getArrayIndex();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentAssignment <em>Environment Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Assignment</em>'.
   * @see it.xtypes.typesystem.EnvironmentAssignment
   * @generated
   */
  EClass getEnvironmentAssignment();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentAssignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.EnvironmentAssignment#getRight()
   * @see #getEnvironmentAssignment()
   * @generated
   */
  EReference getEnvironmentAssignment_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentIncrement <em>Environment Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Increment</em>'.
   * @see it.xtypes.typesystem.EnvironmentIncrement
   * @generated
   */
  EClass getEnvironmentIncrement();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentIncrement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.EnvironmentIncrement#getRight()
   * @see #getEnvironmentIncrement()
   * @generated
   */
  EReference getEnvironmentIncrement_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentDecrement <em>Environment Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Decrement</em>'.
   * @see it.xtypes.typesystem.EnvironmentDecrement
   * @generated
   */
  EClass getEnvironmentDecrement();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentDecrement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.EnvironmentDecrement#getRight()
   * @see #getEnvironmentDecrement()
   * @generated
   */
  EReference getEnvironmentDecrement_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ListIncrement <em>List Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Increment</em>'.
   * @see it.xtypes.typesystem.ListIncrement
   * @generated
   */
  EClass getListIncrement();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ListDecrement <em>List Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Decrement</em>'.
   * @see it.xtypes.typesystem.ListDecrement
   * @generated
   */
  EClass getListDecrement();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ComposedError <em>Composed Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composed Error</em>'.
   * @see it.xtypes.typesystem.ComposedError
   * @generated
   */
  EClass getComposedError();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ComposedError#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see it.xtypes.typesystem.ComposedError#getLeft()
   * @see #getComposedError()
   * @generated
   */
  EReference getComposedError_Left();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.ComposedError#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.xtypes.typesystem.ComposedError#getOp()
   * @see #getComposedError()
   * @generated
   */
  EAttribute getComposedError_Op();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ComposedError#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see it.xtypes.typesystem.ComposedError#getRight()
   * @see #getComposedError()
   * @generated
   */
  EReference getComposedError_Right();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ErrorString <em>Error String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error String</em>'.
   * @see it.xtypes.typesystem.ErrorString
   * @generated
   */
  EClass getErrorString();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.ErrorString#getErrString <em>Err String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Err String</em>'.
   * @see it.xtypes.typesystem.ErrorString#getErrString()
   * @see #getErrorString()
   * @generated
   */
  EAttribute getErrorString_ErrString();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.ErrorExpression <em>Error Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Expression</em>'.
   * @see it.xtypes.typesystem.ErrorExpression
   * @generated
   */
  EClass getErrorExpression();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.ErrorExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.xtypes.typesystem.ErrorExpression#getExpression()
   * @see #getErrorExpression()
   * @generated
   */
  EReference getErrorExpression_Expression();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentComposition <em>Environment Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Composition</em>'.
   * @see it.xtypes.typesystem.EnvironmentComposition
   * @generated
   */
  EClass getEnvironmentComposition();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentComposition#getCurrentEnvironment <em>Current Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Current Environment</em>'.
   * @see it.xtypes.typesystem.EnvironmentComposition#getCurrentEnvironment()
   * @see #getEnvironmentComposition()
   * @generated
   */
  EReference getEnvironmentComposition_CurrentEnvironment();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.EnvironmentComposition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.xtypes.typesystem.EnvironmentComposition#getOp()
   * @see #getEnvironmentComposition()
   * @generated
   */
  EAttribute getEnvironmentComposition_Op();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentComposition#getSubEnvironment <em>Sub Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Environment</em>'.
   * @see it.xtypes.typesystem.EnvironmentComposition#getSubEnvironment()
   * @see #getEnvironmentComposition()
   * @generated
   */
  EReference getEnvironmentComposition_SubEnvironment();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.EnvironmentAccess <em>Environment Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Access</em>'.
   * @see it.xtypes.typesystem.EnvironmentAccess
   * @generated
   */
  EClass getEnvironmentAccess();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentAccess#getEnvId <em>Env Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Env Id</em>'.
   * @see it.xtypes.typesystem.EnvironmentAccess#getEnvId()
   * @see #getEnvironmentAccess()
   * @generated
   */
  EReference getEnvironmentAccess_EnvId();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.EnvironmentAccess#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see it.xtypes.typesystem.EnvironmentAccess#getArgument()
   * @see #getEnvironmentAccess()
   * @generated
   */
  EReference getEnvironmentAccess_Argument();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length</em>'.
   * @see it.xtypes.typesystem.Length
   * @generated
   */
  EClass getLength();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Length#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see it.xtypes.typesystem.Length#getArgument()
   * @see #getLength()
   * @generated
   */
  EReference getLength_Argument();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.GetAll <em>Get All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get All</em>'.
   * @see it.xtypes.typesystem.GetAll
   * @generated
   */
  EClass getGetAll();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.GetAll#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.xtypes.typesystem.GetAll#getExpression()
   * @see #getGetAll()
   * @generated
   */
  EReference getGetAll_Expression();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.GetAll#getMainfeature <em>Mainfeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mainfeature</em>'.
   * @see it.xtypes.typesystem.GetAll#getMainfeature()
   * @see #getGetAll()
   * @generated
   */
  EReference getGetAll_Mainfeature();

  /**
   * Returns the meta object for the reference '{@link it.xtypes.typesystem.GetAll#getExtendfeature <em>Extendfeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extendfeature</em>'.
   * @see it.xtypes.typesystem.GetAll#getExtendfeature()
   * @see #getGetAll()
   * @generated
   */
  EReference getGetAll_Extendfeature();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see it.xtypes.typesystem.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Container#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see it.xtypes.typesystem.Container#getArgument()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Argument();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.CastTo <em>Cast To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast To</em>'.
   * @see it.xtypes.typesystem.CastTo
   * @generated
   */
  EClass getCastTo();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.CastTo#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see it.xtypes.typesystem.CastTo#getType()
   * @see #getCastTo()
   * @generated
   */
  EReference getCastTo_Type();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.CastTo#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see it.xtypes.typesystem.CastTo#getExpression()
   * @see #getCastTo()
   * @generated
   */
  EReference getCastTo_Expression();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see it.xtypes.typesystem.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.NewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Name</em>'.
   * @see it.xtypes.typesystem.NewName
   * @generated
   */
  EClass getNewName();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.NewName#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see it.xtypes.typesystem.NewName#getArgument()
   * @see #getNewName()
   * @generated
   */
  EAttribute getNewName_Argument();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Clone <em>Clone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clone</em>'.
   * @see it.xtypes.typesystem.Clone
   * @generated
   */
  EClass getClone();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Clone#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see it.xtypes.typesystem.Clone#getArgument()
   * @see #getClone()
   * @generated
   */
  EReference getClone_Argument();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.CompoundExpression <em>Compound Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Expression</em>'.
   * @see it.xtypes.typesystem.CompoundExpression
   * @generated
   */
  EClass getCompoundExpression();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.CompoundExpression#getMainExpression <em>Main Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Expression</em>'.
   * @see it.xtypes.typesystem.CompoundExpression#getMainExpression()
   * @see #getCompoundExpression()
   * @generated
   */
  EReference getCompoundExpression_MainExpression();

  /**
   * Returns the meta object for the attribute '{@link it.xtypes.typesystem.CompoundExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.xtypes.typesystem.CompoundExpression#getOp()
   * @see #getCompoundExpression()
   * @generated
   */
  EAttribute getCompoundExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.CompoundExpression#getSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Expression</em>'.
   * @see it.xtypes.typesystem.CompoundExpression#getSubExpression()
   * @see #getCompoundExpression()
   * @generated
   */
  EReference getCompoundExpression_SubExpression();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Indexed <em>Indexed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed</em>'.
   * @see it.xtypes.typesystem.Indexed
   * @generated
   */
  EClass getIndexed();

  /**
   * Returns the meta object for the containment reference '{@link it.xtypes.typesystem.Indexed#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see it.xtypes.typesystem.Indexed#getIndex()
   * @see #getIndexed()
   * @generated
   */
  EReference getIndexed_Index();

  /**
   * Returns the meta object for class '{@link it.xtypes.typesystem.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see it.xtypes.typesystem.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypesystemFactory getTypesystemFactory();

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
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl <em>Type System Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.TypeSystemDefinitionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypeSystemDefinition()
     * @generated
     */
    EClass TYPE_SYSTEM_DEFINITION = eINSTANCE.getTypeSystemDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SYSTEM_DEFINITION__NAME = eINSTANCE.getTypeSystemDefinition_Name();

    /**
     * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SYSTEM_DEFINITION__EPACKAGE = eINSTANCE.getTypeSystemDefinition_EPackage();

    /**
     * The meta object literal for the '<em><b>Gen Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SYSTEM_DEFINITION__GEN_MODEL = eINSTANCE.getTypeSystemDefinition_GenModel();

    /**
     * The meta object literal for the '<em><b>Judgment Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS = eINSTANCE.getTypeSystemDefinition_JudgmentDescriptions();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SYSTEM_DEFINITION__RULES = eINSTANCE.getTypeSystemDefinition_Rules();

    /**
     * The meta object literal for the '<em><b>EPackage URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SYSTEM_DEFINITION__EPACKAGE_URI = eINSTANCE.getTypeSystemDefinition_EPackageURI();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl <em>Judgment Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.JudgmentDescriptionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getJudgmentDescription()
     * @generated
     */
    EClass JUDGMENT_DESCRIPTION = eINSTANCE.getJudgmentDescription();

    /**
     * The meta object literal for the '<em><b>Judgmentsymbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL = eINSTANCE.getJudgmentDescription_Judgmentsymbol();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__RELATION = eINSTANCE.getJudgmentDescription_Relation();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__KIND = eINSTANCE.getJudgmentDescription_Kind();

    /**
     * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__SUCCESS = eINSTANCE.getJudgmentDescription_Success();

    /**
     * The meta object literal for the '<em><b>Fail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__FAIL = eINSTANCE.getJudgmentDescription_Fail();

    /**
     * The meta object literal for the '<em><b>Nomatch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__NOMATCH = eINSTANCE.getJudgmentDescription_Nomatch();

    /**
     * The meta object literal for the '<em><b>Binary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUDGMENT_DESCRIPTION__BINARY = eINSTANCE.getJudgmentDescription_Binary();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.RuleImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Typejudgment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__TYPEJUDGMENT = eINSTANCE.getRule_Typejudgment();

    /**
     * The meta object literal for the '<em><b>Containing Type System</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__CONTAINING_TYPE_SYSTEM = eINSTANCE.getRule_ContainingTypeSystem();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.AxiomImpl <em>Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.AxiomImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getAxiom()
     * @generated
     */
    EClass AXIOM = eINSTANCE.getAxiom();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.RuleWithPremisesImpl <em>Rule With Premises</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.RuleWithPremisesImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getRuleWithPremises()
     * @generated
     */
    EClass RULE_WITH_PREMISES = eINSTANCE.getRuleWithPremises();

    /**
     * The meta object literal for the '<em><b>Premises</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_WITH_PREMISES__PREMISES = eINSTANCE.getRuleWithPremises_Premises();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.TypingJudgmentImpl <em>Typing Judgment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.TypingJudgmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingJudgment()
     * @generated
     */
    EClass TYPING_JUDGMENT = eINSTANCE.getTypingJudgment();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.OrTypingJudgmentImpl <em>Or Typing Judgment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.OrTypingJudgmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getOrTypingJudgment()
     * @generated
     */
    EClass OR_TYPING_JUDGMENT = eINSTANCE.getOrTypingJudgment();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_TYPING_JUDGMENT__BRANCHES = eINSTANCE.getOrTypingJudgment_Branches();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_TYPING_JUDGMENT__ERROR = eINSTANCE.getOrTypingJudgment_Error();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.OrBranchImpl <em>Or Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.OrBranchImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getOrBranch()
     * @generated
     */
    EClass OR_BRANCH = eINSTANCE.getOrBranch();

    /**
     * The meta object literal for the '<em><b>Judgments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_BRANCH__JUDGMENTS = eINSTANCE.getOrBranch_Judgments();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.VariableDeclarationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl <em>Variable Declaration With Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableDeclarationWithType()
     * @generated
     */
    EClass VARIABLE_DECLARATION_WITH_TYPE = eINSTANCE.getVariableDeclarationWithType();

    /**
     * The meta object literal for the '<em><b>Expression Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE = eINSTANCE.getVariableDeclarationWithType_ExpressionType();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION_WITH_TYPE__OP = eINSTANCE.getVariableDeclarationWithType_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_WITH_TYPE__RIGHT = eINSTANCE.getVariableDeclarationWithType_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ExpressionTypeImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExpressionType()
     * @generated
     */
    EClass EXPRESSION_TYPE = eINSTANCE.getExpressionType();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.CollectionTypeImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCollectionType()
     * @generated
     */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_TYPE__COLLECTION = eINSTANCE.getCollectionType_Collection();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TYPE__TYPE = eINSTANCE.getCollectionType_Type();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EClassifierTypeImpl <em>EClassifier Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EClassifierTypeImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEClassifierType()
     * @generated
     */
    EClass ECLASSIFIER_TYPE = eINSTANCE.getEClassifierType();

    /**
     * The meta object literal for the '<em><b>Eclassifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASSIFIER_TYPE__ECLASSIFIER = eINSTANCE.getEClassifierType_Eclassifier();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.BasicTypeImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__BASIC = eINSTANCE.getBasicType_Basic();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.VariableSimpleDeclarationImpl <em>Variable Simple Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.VariableSimpleDeclarationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableSimpleDeclaration()
     * @generated
     */
    EClass VARIABLE_SIMPLE_DECLARATION = eINSTANCE.getVariableSimpleDeclaration();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.QuantificationImpl <em>Quantification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.QuantificationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getQuantification()
     * @generated
     */
    EClass QUANTIFICATION = eINSTANCE.getQuantification();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFICATION__ERROR = eINSTANCE.getQuantification_Error();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFICATION__EXPRESSION = eINSTANCE.getQuantification_Expression();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFICATION__VARIABLE = eINSTANCE.getQuantification_Variable();

    /**
     * The meta object literal for the '<em><b>Judgments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFICATION__JUDGMENTS = eINSTANCE.getQuantification_Judgments();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ForEachImpl <em>For Each</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ForEachImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getForEach()
     * @generated
     */
    EClass FOR_EACH = eINSTANCE.getForEach();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ForAllImpl <em>For All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ForAllImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getForAll()
     * @generated
     */
    EClass FOR_ALL = eINSTANCE.getForAll();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ExistsImpl <em>Exists</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ExistsImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExists()
     * @generated
     */
    EClass EXISTS = eINSTANCE.getExists();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTS__NOT = eINSTANCE.getExists_Not();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.StandardOperationImpl <em>Standard Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.StandardOperationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getStandardOperation()
     * @generated
     */
    EClass STANDARD_OPERATION = eINSTANCE.getStandardOperation();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentOperationImpl <em>Environment Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentOperationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentOperation()
     * @generated
     */
    EClass ENVIRONMENT_OPERATION = eINSTANCE.getEnvironmentOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_OPERATION__LEFT = eINSTANCE.getEnvironmentOperation_Left();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ListOperationImpl <em>List Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ListOperationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListOperation()
     * @generated
     */
    EClass LIST_OPERATION = eINSTANCE.getListOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_OPERATION__LEFT = eINSTANCE.getListOperation_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_OPERATION__RIGHT = eINSTANCE.getListOperation_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.AssignmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__LEFT = eINSTANCE.getAssignment_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__RIGHT = eINSTANCE.getAssignment_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EqualsImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS__OP = eINSTANCE.getEquals_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__ERROR = eINSTANCE.getEquals_Error();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.FailImpl <em>Fail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.FailImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFail()
     * @generated
     */
    EClass FAIL = eINSTANCE.getFail();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAIL__ERROR = eINSTANCE.getFail_Error();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.SuccessImpl <em>Success</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.SuccessImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getSuccess()
     * @generated
     */
    EClass SUCCESS = eINSTANCE.getSuccess();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl <em>Typing Judgment With Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingJudgmentWithEnvironment()
     * @generated
     */
    EClass TYPING_JUDGMENT_WITH_ENVIRONMENT = eINSTANCE.getTypingJudgmentWithEnvironment();

    /**
     * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT = eINSTANCE.getTypingJudgmentWithEnvironment_Environment();

    /**
     * The meta object literal for the '<em><b>Typejudgmentsymbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL = eINSTANCE.getTypingJudgmentWithEnvironment_Typejudgmentsymbol();

    /**
     * The meta object literal for the '<em><b>Typingstatement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT = eINSTANCE.getTypingJudgmentWithEnvironment_Typingstatement();

    /**
     * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR = eINSTANCE.getTypingJudgmentWithEnvironment_Error();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ErrorSpecificationImpl <em>Error Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ErrorSpecificationImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorSpecification()
     * @generated
     */
    EClass ERROR_SPECIFICATION = eINSTANCE.getErrorSpecification();

    /**
     * The meta object literal for the '<em><b>Failure Error</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_SPECIFICATION__FAILURE_ERROR = eINSTANCE.getErrorSpecification_FailureError();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.FailureErrorImpl <em>Failure Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.FailureErrorImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFailureError()
     * @generated
     */
    EClass FAILURE_ERROR = eINSTANCE.getFailureError();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.TypingStatementImpl <em>Typing Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.TypingStatementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingStatement()
     * @generated
     */
    EClass TYPING_STATEMENT = eINSTANCE.getTypingStatement();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPING_STATEMENT__LEFT = eINSTANCE.getTypingStatement_Left();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPING_STATEMENT__RELATION = eINSTANCE.getTypingStatement_Relation();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPING_STATEMENT__RIGHT = eINSTANCE.getTypingStatement_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.TypingStatementExpressionImpl <em>Typing Statement Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.TypingStatementExpressionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getTypingStatementExpression()
     * @generated
     */
    EClass TYPING_STATEMENT_EXPRESSION = eINSTANCE.getTypingStatementExpression();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentIdImpl <em>Environment Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentIdImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentId()
     * @generated
     */
    EClass ENVIRONMENT_ID = eINSTANCE.getEnvironmentId();

    /**
     * The meta object literal for the '<em><b>Environment Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_ID__ENVIRONMENT_ID = eINSTANCE.getEnvironmentId_EnvironmentId();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentStatementImpl <em>Environment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentStatementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentStatement()
     * @generated
     */
    EClass ENVIRONMENT_STATEMENT = eINSTANCE.getEnvironmentStatement();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_STATEMENT__LEFT = eINSTANCE.getEnvironmentStatement_Left();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_STATEMENT__RELATION = eINSTANCE.getEnvironmentStatement_Relation();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_STATEMENT__RIGHT = eINSTANCE.getEnvironmentStatement_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EmptyEnvironmentImpl <em>Empty Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EmptyEnvironmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEmptyEnvironment()
     * @generated
     */
    EClass EMPTY_ENVIRONMENT = eINSTANCE.getEmptyEnvironment();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPTY_ENVIRONMENT__EMPTY = eINSTANCE.getEmptyEnvironment_Empty();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ExpressionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.StringConstantImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getStringConstant()
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
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.IntegerConstantImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIntegerConstant()
     * @generated
     */
    EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.VariableAccessImpl <em>Variable Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.VariableAccessImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableAccess()
     * @generated
     */
    EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

    /**
     * The meta object literal for the '<em><b>Var Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ACCESS__VAR_REF = eINSTANCE.getVariableAccess_VarRef();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.VariableReferenceImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.IndexedVariableImpl <em>Indexed Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.IndexedVariableImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIndexedVariable()
     * @generated
     */
    EClass INDEXED_VARIABLE = eINSTANCE.getIndexedVariable();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXED_VARIABLE__INDEX = eINSTANCE.getIndexedVariable_Index();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.SubExpressionImpl <em>Sub Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.SubExpressionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getSubExpression()
     * @generated
     */
    EClass SUB_EXPRESSION = eINSTANCE.getSubExpression();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_EXPRESSION__FEATURE = eINSTANCE.getSubExpression_Feature();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ArrayIndexImpl <em>Array Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ArrayIndexImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getArrayIndex()
     * @generated
     */
    EClass ARRAY_INDEX = eINSTANCE.getArrayIndex();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentAssignmentImpl <em>Environment Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentAssignmentImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentAssignment()
     * @generated
     */
    EClass ENVIRONMENT_ASSIGNMENT = eINSTANCE.getEnvironmentAssignment();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_ASSIGNMENT__RIGHT = eINSTANCE.getEnvironmentAssignment_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentIncrementImpl <em>Environment Increment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentIncrementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentIncrement()
     * @generated
     */
    EClass ENVIRONMENT_INCREMENT = eINSTANCE.getEnvironmentIncrement();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_INCREMENT__RIGHT = eINSTANCE.getEnvironmentIncrement_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentDecrementImpl <em>Environment Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentDecrementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentDecrement()
     * @generated
     */
    EClass ENVIRONMENT_DECREMENT = eINSTANCE.getEnvironmentDecrement();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_DECREMENT__RIGHT = eINSTANCE.getEnvironmentDecrement_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ListIncrementImpl <em>List Increment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ListIncrementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListIncrement()
     * @generated
     */
    EClass LIST_INCREMENT = eINSTANCE.getListIncrement();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ListDecrementImpl <em>List Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ListDecrementImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getListDecrement()
     * @generated
     */
    EClass LIST_DECREMENT = eINSTANCE.getListDecrement();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ComposedErrorImpl <em>Composed Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ComposedErrorImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getComposedError()
     * @generated
     */
    EClass COMPOSED_ERROR = eINSTANCE.getComposedError();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSED_ERROR__LEFT = eINSTANCE.getComposedError_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSED_ERROR__OP = eINSTANCE.getComposedError_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSED_ERROR__RIGHT = eINSTANCE.getComposedError_Right();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ErrorStringImpl <em>Error String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ErrorStringImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorString()
     * @generated
     */
    EClass ERROR_STRING = eINSTANCE.getErrorString();

    /**
     * The meta object literal for the '<em><b>Err String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_STRING__ERR_STRING = eINSTANCE.getErrorString_ErrString();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ErrorExpressionImpl <em>Error Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ErrorExpressionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getErrorExpression()
     * @generated
     */
    EClass ERROR_EXPRESSION = eINSTANCE.getErrorExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_EXPRESSION__EXPRESSION = eINSTANCE.getErrorExpression_Expression();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentCompositionImpl <em>Environment Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentCompositionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentComposition()
     * @generated
     */
    EClass ENVIRONMENT_COMPOSITION = eINSTANCE.getEnvironmentComposition();

    /**
     * The meta object literal for the '<em><b>Current Environment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT = eINSTANCE.getEnvironmentComposition_CurrentEnvironment();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_COMPOSITION__OP = eINSTANCE.getEnvironmentComposition_Op();

    /**
     * The meta object literal for the '<em><b>Sub Environment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT = eINSTANCE.getEnvironmentComposition_SubEnvironment();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.EnvironmentAccessImpl <em>Environment Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.EnvironmentAccessImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getEnvironmentAccess()
     * @generated
     */
    EClass ENVIRONMENT_ACCESS = eINSTANCE.getEnvironmentAccess();

    /**
     * The meta object literal for the '<em><b>Env Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_ACCESS__ENV_ID = eINSTANCE.getEnvironmentAccess_EnvId();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_ACCESS__ARGUMENT = eINSTANCE.getEnvironmentAccess_Argument();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.LengthImpl <em>Length</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.LengthImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getLength()
     * @generated
     */
    EClass LENGTH = eINSTANCE.getLength();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LENGTH__ARGUMENT = eINSTANCE.getLength_Argument();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.GetAllImpl <em>Get All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.GetAllImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getGetAll()
     * @generated
     */
    EClass GET_ALL = eINSTANCE.getGetAll();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ALL__EXPRESSION = eINSTANCE.getGetAll_Expression();

    /**
     * The meta object literal for the '<em><b>Mainfeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ALL__MAINFEATURE = eINSTANCE.getGetAll_Mainfeature();

    /**
     * The meta object literal for the '<em><b>Extendfeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ALL__EXTENDFEATURE = eINSTANCE.getGetAll_Extendfeature();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.ContainerImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__ARGUMENT = eINSTANCE.getContainer_Argument();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.CastToImpl <em>Cast To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.CastToImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCastTo()
     * @generated
     */
    EClass CAST_TO = eINSTANCE.getCastTo();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_TO__TYPE = eINSTANCE.getCastTo_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_TO__EXPRESSION = eINSTANCE.getCastTo_Expression();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.NullImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.NewNameImpl <em>New Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.NewNameImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getNewName()
     * @generated
     */
    EClass NEW_NAME = eINSTANCE.getNewName();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_NAME__ARGUMENT = eINSTANCE.getNewName_Argument();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.CloneImpl <em>Clone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.CloneImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getClone()
     * @generated
     */
    EClass CLONE = eINSTANCE.getClone();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLONE__ARGUMENT = eINSTANCE.getClone_Argument();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.CompoundExpressionImpl <em>Compound Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.CompoundExpressionImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getCompoundExpression()
     * @generated
     */
    EClass COMPOUND_EXPRESSION = eINSTANCE.getCompoundExpression();

    /**
     * The meta object literal for the '<em><b>Main Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_EXPRESSION__MAIN_EXPRESSION = eINSTANCE.getCompoundExpression_MainExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOUND_EXPRESSION__OP = eINSTANCE.getCompoundExpression_Op();

    /**
     * The meta object literal for the '<em><b>Sub Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_EXPRESSION__SUB_EXPRESSION = eINSTANCE.getCompoundExpression_SubExpression();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.IndexedImpl <em>Indexed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.IndexedImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getIndexed()
     * @generated
     */
    EClass INDEXED = eINSTANCE.getIndexed();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEXED__INDEX = eINSTANCE.getIndexed_Index();

    /**
     * The meta object literal for the '{@link it.xtypes.typesystem.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.xtypes.typesystem.impl.FeatureImpl
     * @see it.xtypes.typesystem.impl.TypesystemPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

  }

} //TypesystemPackage
