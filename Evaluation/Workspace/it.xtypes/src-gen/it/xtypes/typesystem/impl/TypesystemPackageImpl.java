/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ArrayIndex;
import it.xtypes.typesystem.Assignment;
import it.xtypes.typesystem.Axiom;
import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CastTo;
import it.xtypes.typesystem.Clone;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.ComposedError;
import it.xtypes.typesystem.CompoundExpression;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.EmptyEnvironment;
import it.xtypes.typesystem.Environment;
import it.xtypes.typesystem.EnvironmentAccess;
import it.xtypes.typesystem.EnvironmentAssignment;
import it.xtypes.typesystem.EnvironmentComposition;
import it.xtypes.typesystem.EnvironmentDecrement;
import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.EnvironmentIncrement;
import it.xtypes.typesystem.EnvironmentOperation;
import it.xtypes.typesystem.EnvironmentStatement;
import it.xtypes.typesystem.Equals;
import it.xtypes.typesystem.ErrorExpression;
import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.ErrorString;
import it.xtypes.typesystem.Exists;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.Fail;
import it.xtypes.typesystem.FailureError;
import it.xtypes.typesystem.Feature;
import it.xtypes.typesystem.ForAll;
import it.xtypes.typesystem.ForEach;
import it.xtypes.typesystem.GetAll;
import it.xtypes.typesystem.Indexed;
import it.xtypes.typesystem.IndexedVariable;
import it.xtypes.typesystem.IntegerConstant;
import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Length;
import it.xtypes.typesystem.ListDecrement;
import it.xtypes.typesystem.ListIncrement;
import it.xtypes.typesystem.ListOperation;
import it.xtypes.typesystem.NewName;
import it.xtypes.typesystem.Null;
import it.xtypes.typesystem.OrBranch;
import it.xtypes.typesystem.OrTypingJudgment;
import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.StandardOperation;
import it.xtypes.typesystem.StringConstant;
import it.xtypes.typesystem.SubExpression;
import it.xtypes.typesystem.Success;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemFactory;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableAccess;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;
import it.xtypes.typesystem.VariableReference;
import it.xtypes.typesystem.VariableSimpleDeclaration;

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
public class TypesystemPackageImpl extends EPackageImpl implements TypesystemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSystemDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass judgmentDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass axiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleWithPremisesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typingJudgmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orTypingJudgmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationWithTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassifierTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableSimpleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass failEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass successEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typingJudgmentWithEnvironmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass failureErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typingStatementExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyEnvironmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

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
  private EClass integerConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayIndexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentIncrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentDecrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listIncrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listDecrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass composedErrorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentCompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

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
   * @see it.xtypes.typesystem.TypesystemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TypesystemPackageImpl()
  {
    super(eNS_URI, TypesystemFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TypesystemPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TypesystemPackage init()
  {
    if (isInited) return (TypesystemPackage)EPackage.Registry.INSTANCE.getEPackage(TypesystemPackage.eNS_URI);

    // Obtain or create and register package
    TypesystemPackageImpl theTypesystemPackage = (TypesystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesystemPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTypesystemPackage.createPackageContents();

    // Initialize created meta-data
    theTypesystemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTypesystemPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TypesystemPackage.eNS_URI, theTypesystemPackage);
    return theTypesystemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSystemDefinition()
  {
    return typeSystemDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSystemDefinition_Name()
  {
    return (EAttribute)typeSystemDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeSystemDefinition_EPackage()
  {
    return (EReference)typeSystemDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSystemDefinition_GenModel()
  {
    return (EAttribute)typeSystemDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeSystemDefinition_JudgmentDescriptions()
  {
    return (EReference)typeSystemDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeSystemDefinition_Rules()
  {
    return (EReference)typeSystemDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSystemDefinition_EPackageURI()
  {
    return (EAttribute)typeSystemDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJudgmentDescription()
  {
    return judgmentDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Judgmentsymbol()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Relation()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Kind()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Success()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Fail()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Nomatch()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJudgmentDescription_Binary()
  {
    return (EAttribute)judgmentDescriptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Typejudgment()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_ContainingTypeSystem()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAxiom()
  {
    return axiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleWithPremises()
  {
    return ruleWithPremisesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleWithPremises_Premises()
  {
    return (EReference)ruleWithPremisesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypingJudgment()
  {
    return typingJudgmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrTypingJudgment()
  {
    return orTypingJudgmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrTypingJudgment_Branches()
  {
    return (EReference)orTypingJudgmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrTypingJudgment_Error()
  {
    return (EReference)orTypingJudgmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrBranch()
  {
    return orBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrBranch_Judgments()
  {
    return (EReference)orBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclarationWithType()
  {
    return variableDeclarationWithTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarationWithType_ExpressionType()
  {
    return (EReference)variableDeclarationWithTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclarationWithType_Op()
  {
    return (EAttribute)variableDeclarationWithTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarationWithType_Right()
  {
    return (EReference)variableDeclarationWithTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionType()
  {
    return expressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionType()
  {
    return collectionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollectionType_Collection()
  {
    return (EAttribute)collectionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionType_Type()
  {
    return (EReference)collectionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClassifierType()
  {
    return eClassifierTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassifierType_Eclassifier()
  {
    return (EReference)eClassifierTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicType_Basic()
  {
    return (EAttribute)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableSimpleDeclaration()
  {
    return variableSimpleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantification()
  {
    return quantificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantification_Error()
  {
    return (EReference)quantificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantification_Expression()
  {
    return (EReference)quantificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantification_Variable()
  {
    return (EReference)quantificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantification_Judgments()
  {
    return (EReference)quantificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForEach()
  {
    return forEachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAll()
  {
    return forAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExists()
  {
    return existsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExists_Not()
  {
    return (EAttribute)existsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStandardOperation()
  {
    return standardOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentOperation()
  {
    return environmentOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentOperation_Left()
  {
    return (EReference)environmentOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListOperation()
  {
    return listOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListOperation_Left()
  {
    return (EReference)listOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListOperation_Right()
  {
    return (EReference)listOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Left()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Right()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquals()
  {
    return equalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquals_Left()
  {
    return (EReference)equalsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquals_Op()
  {
    return (EAttribute)equalsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquals_Right()
  {
    return (EReference)equalsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquals_Error()
  {
    return (EReference)equalsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFail()
  {
    return failEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFail_Error()
  {
    return (EReference)failEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuccess()
  {
    return successEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypingJudgmentWithEnvironment()
  {
    return typingJudgmentWithEnvironmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypingJudgmentWithEnvironment_Environment()
  {
    return (EReference)typingJudgmentWithEnvironmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypingJudgmentWithEnvironment_Typejudgmentsymbol()
  {
    return (EAttribute)typingJudgmentWithEnvironmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypingJudgmentWithEnvironment_Typingstatement()
  {
    return (EReference)typingJudgmentWithEnvironmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypingJudgmentWithEnvironment_Error()
  {
    return (EReference)typingJudgmentWithEnvironmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorSpecification()
  {
    return errorSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorSpecification_FailureError()
  {
    return (EReference)errorSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFailureError()
  {
    return failureErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypingStatement()
  {
    return typingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypingStatement_Left()
  {
    return (EReference)typingStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypingStatement_Relation()
  {
    return (EAttribute)typingStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypingStatement_Right()
  {
    return (EReference)typingStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypingStatementExpression()
  {
    return typingStatementExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironment()
  {
    return environmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentId()
  {
    return environmentIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentId_EnvironmentId()
  {
    return (EAttribute)environmentIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentStatement()
  {
    return environmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentStatement_Left()
  {
    return (EReference)environmentStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentStatement_Relation()
  {
    return (EAttribute)environmentStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentStatement_Right()
  {
    return (EReference)environmentStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyEnvironment()
  {
    return emptyEnvironmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmptyEnvironment_Empty()
  {
    return (EAttribute)emptyEnvironmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
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
  public EClass getIntegerConstant()
  {
    return integerConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerConstant_Value()
  {
    return (EAttribute)integerConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAccess()
  {
    return variableAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAccess_VarRef()
  {
    return (EReference)variableAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableReference()
  {
    return variableReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexedVariable()
  {
    return indexedVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexedVariable_Index()
  {
    return (EReference)indexedVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubExpression()
  {
    return subExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubExpression_Feature()
  {
    return (EReference)subExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayIndex()
  {
    return arrayIndexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentAssignment()
  {
    return environmentAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentAssignment_Right()
  {
    return (EReference)environmentAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentIncrement()
  {
    return environmentIncrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentIncrement_Right()
  {
    return (EReference)environmentIncrementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentDecrement()
  {
    return environmentDecrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentDecrement_Right()
  {
    return (EReference)environmentDecrementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListIncrement()
  {
    return listIncrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListDecrement()
  {
    return listDecrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComposedError()
  {
    return composedErrorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComposedError_Left()
  {
    return (EReference)composedErrorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComposedError_Op()
  {
    return (EAttribute)composedErrorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComposedError_Right()
  {
    return (EReference)composedErrorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorString()
  {
    return errorStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorString_ErrString()
  {
    return (EAttribute)errorStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorExpression()
  {
    return errorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorExpression_Expression()
  {
    return (EReference)errorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentComposition()
  {
    return environmentCompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentComposition_CurrentEnvironment()
  {
    return (EReference)environmentCompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentComposition_Op()
  {
    return (EAttribute)environmentCompositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentComposition_SubEnvironment()
  {
    return (EReference)environmentCompositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentAccess()
  {
    return environmentAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentAccess_EnvId()
  {
    return (EReference)environmentAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvironmentAccess_Argument()
  {
    return (EReference)environmentAccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLength()
  {
    return lengthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLength_Argument()
  {
    return (EReference)lengthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetAll()
  {
    return getAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetAll_Expression()
  {
    return (EReference)getAllEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetAll_Mainfeature()
  {
    return (EReference)getAllEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetAll_Extendfeature()
  {
    return (EReference)getAllEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Argument()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastTo()
  {
    return castToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastTo_Type()
  {
    return (EReference)castToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastTo_Expression()
  {
    return (EReference)castToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull()
  {
    return nullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewName()
  {
    return newNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewName_Argument()
  {
    return (EAttribute)newNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClone()
  {
    return cloneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClone_Argument()
  {
    return (EReference)cloneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundExpression()
  {
    return compoundExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundExpression_MainExpression()
  {
    return (EReference)compoundExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompoundExpression_Op()
  {
    return (EAttribute)compoundExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundExpression_SubExpression()
  {
    return (EReference)compoundExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexed()
  {
    return indexedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexed_Index()
  {
    return (EReference)indexedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesystemFactory getTypesystemFactory()
  {
    return (TypesystemFactory)getEFactoryInstance();
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
    typeSystemDefinitionEClass = createEClass(TYPE_SYSTEM_DEFINITION);
    createEAttribute(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__NAME);
    createEReference(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__EPACKAGE);
    createEAttribute(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__GEN_MODEL);
    createEReference(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS);
    createEReference(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__RULES);
    createEAttribute(typeSystemDefinitionEClass, TYPE_SYSTEM_DEFINITION__EPACKAGE_URI);

    judgmentDescriptionEClass = createEClass(JUDGMENT_DESCRIPTION);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__RELATION);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__KIND);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__SUCCESS);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__FAIL);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__NOMATCH);
    createEAttribute(judgmentDescriptionEClass, JUDGMENT_DESCRIPTION__BINARY);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__TYPEJUDGMENT);
    createEReference(ruleEClass, RULE__CONTAINING_TYPE_SYSTEM);

    axiomEClass = createEClass(AXIOM);

    ruleWithPremisesEClass = createEClass(RULE_WITH_PREMISES);
    createEReference(ruleWithPremisesEClass, RULE_WITH_PREMISES__PREMISES);

    typingJudgmentEClass = createEClass(TYPING_JUDGMENT);

    orTypingJudgmentEClass = createEClass(OR_TYPING_JUDGMENT);
    createEReference(orTypingJudgmentEClass, OR_TYPING_JUDGMENT__BRANCHES);
    createEReference(orTypingJudgmentEClass, OR_TYPING_JUDGMENT__ERROR);

    orBranchEClass = createEClass(OR_BRANCH);
    createEReference(orBranchEClass, OR_BRANCH__JUDGMENTS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

    variableDeclarationWithTypeEClass = createEClass(VARIABLE_DECLARATION_WITH_TYPE);
    createEReference(variableDeclarationWithTypeEClass, VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE);
    createEAttribute(variableDeclarationWithTypeEClass, VARIABLE_DECLARATION_WITH_TYPE__OP);
    createEReference(variableDeclarationWithTypeEClass, VARIABLE_DECLARATION_WITH_TYPE__RIGHT);

    expressionTypeEClass = createEClass(EXPRESSION_TYPE);

    collectionTypeEClass = createEClass(COLLECTION_TYPE);
    createEAttribute(collectionTypeEClass, COLLECTION_TYPE__COLLECTION);
    createEReference(collectionTypeEClass, COLLECTION_TYPE__TYPE);

    eClassifierTypeEClass = createEClass(ECLASSIFIER_TYPE);
    createEReference(eClassifierTypeEClass, ECLASSIFIER_TYPE__ECLASSIFIER);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEAttribute(basicTypeEClass, BASIC_TYPE__BASIC);

    variableSimpleDeclarationEClass = createEClass(VARIABLE_SIMPLE_DECLARATION);

    quantificationEClass = createEClass(QUANTIFICATION);
    createEReference(quantificationEClass, QUANTIFICATION__ERROR);
    createEReference(quantificationEClass, QUANTIFICATION__EXPRESSION);
    createEReference(quantificationEClass, QUANTIFICATION__VARIABLE);
    createEReference(quantificationEClass, QUANTIFICATION__JUDGMENTS);

    forEachEClass = createEClass(FOR_EACH);

    forAllEClass = createEClass(FOR_ALL);

    existsEClass = createEClass(EXISTS);
    createEAttribute(existsEClass, EXISTS__NOT);

    standardOperationEClass = createEClass(STANDARD_OPERATION);

    environmentOperationEClass = createEClass(ENVIRONMENT_OPERATION);
    createEReference(environmentOperationEClass, ENVIRONMENT_OPERATION__LEFT);

    listOperationEClass = createEClass(LIST_OPERATION);
    createEReference(listOperationEClass, LIST_OPERATION__LEFT);
    createEReference(listOperationEClass, LIST_OPERATION__RIGHT);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__LEFT);
    createEReference(assignmentEClass, ASSIGNMENT__RIGHT);

    equalsEClass = createEClass(EQUALS);
    createEReference(equalsEClass, EQUALS__LEFT);
    createEAttribute(equalsEClass, EQUALS__OP);
    createEReference(equalsEClass, EQUALS__RIGHT);
    createEReference(equalsEClass, EQUALS__ERROR);

    failEClass = createEClass(FAIL);
    createEReference(failEClass, FAIL__ERROR);

    successEClass = createEClass(SUCCESS);

    typingJudgmentWithEnvironmentEClass = createEClass(TYPING_JUDGMENT_WITH_ENVIRONMENT);
    createEReference(typingJudgmentWithEnvironmentEClass, TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT);
    createEAttribute(typingJudgmentWithEnvironmentEClass, TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL);
    createEReference(typingJudgmentWithEnvironmentEClass, TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT);
    createEReference(typingJudgmentWithEnvironmentEClass, TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR);

    errorSpecificationEClass = createEClass(ERROR_SPECIFICATION);
    createEReference(errorSpecificationEClass, ERROR_SPECIFICATION__FAILURE_ERROR);

    failureErrorEClass = createEClass(FAILURE_ERROR);

    typingStatementEClass = createEClass(TYPING_STATEMENT);
    createEReference(typingStatementEClass, TYPING_STATEMENT__LEFT);
    createEAttribute(typingStatementEClass, TYPING_STATEMENT__RELATION);
    createEReference(typingStatementEClass, TYPING_STATEMENT__RIGHT);

    typingStatementExpressionEClass = createEClass(TYPING_STATEMENT_EXPRESSION);

    environmentEClass = createEClass(ENVIRONMENT);

    environmentIdEClass = createEClass(ENVIRONMENT_ID);
    createEAttribute(environmentIdEClass, ENVIRONMENT_ID__ENVIRONMENT_ID);

    environmentStatementEClass = createEClass(ENVIRONMENT_STATEMENT);
    createEReference(environmentStatementEClass, ENVIRONMENT_STATEMENT__LEFT);
    createEAttribute(environmentStatementEClass, ENVIRONMENT_STATEMENT__RELATION);
    createEReference(environmentStatementEClass, ENVIRONMENT_STATEMENT__RIGHT);

    emptyEnvironmentEClass = createEClass(EMPTY_ENVIRONMENT);
    createEAttribute(emptyEnvironmentEClass, EMPTY_ENVIRONMENT__EMPTY);

    expressionEClass = createEClass(EXPRESSION);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

    integerConstantEClass = createEClass(INTEGER_CONSTANT);
    createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

    variableAccessEClass = createEClass(VARIABLE_ACCESS);
    createEReference(variableAccessEClass, VARIABLE_ACCESS__VAR_REF);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

    indexedVariableEClass = createEClass(INDEXED_VARIABLE);
    createEReference(indexedVariableEClass, INDEXED_VARIABLE__INDEX);

    subExpressionEClass = createEClass(SUB_EXPRESSION);
    createEReference(subExpressionEClass, SUB_EXPRESSION__FEATURE);

    arrayIndexEClass = createEClass(ARRAY_INDEX);

    environmentAssignmentEClass = createEClass(ENVIRONMENT_ASSIGNMENT);
    createEReference(environmentAssignmentEClass, ENVIRONMENT_ASSIGNMENT__RIGHT);

    environmentIncrementEClass = createEClass(ENVIRONMENT_INCREMENT);
    createEReference(environmentIncrementEClass, ENVIRONMENT_INCREMENT__RIGHT);

    environmentDecrementEClass = createEClass(ENVIRONMENT_DECREMENT);
    createEReference(environmentDecrementEClass, ENVIRONMENT_DECREMENT__RIGHT);

    listIncrementEClass = createEClass(LIST_INCREMENT);

    listDecrementEClass = createEClass(LIST_DECREMENT);

    composedErrorEClass = createEClass(COMPOSED_ERROR);
    createEReference(composedErrorEClass, COMPOSED_ERROR__LEFT);
    createEAttribute(composedErrorEClass, COMPOSED_ERROR__OP);
    createEReference(composedErrorEClass, COMPOSED_ERROR__RIGHT);

    errorStringEClass = createEClass(ERROR_STRING);
    createEAttribute(errorStringEClass, ERROR_STRING__ERR_STRING);

    errorExpressionEClass = createEClass(ERROR_EXPRESSION);
    createEReference(errorExpressionEClass, ERROR_EXPRESSION__EXPRESSION);

    environmentCompositionEClass = createEClass(ENVIRONMENT_COMPOSITION);
    createEReference(environmentCompositionEClass, ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT);
    createEAttribute(environmentCompositionEClass, ENVIRONMENT_COMPOSITION__OP);
    createEReference(environmentCompositionEClass, ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT);

    environmentAccessEClass = createEClass(ENVIRONMENT_ACCESS);
    createEReference(environmentAccessEClass, ENVIRONMENT_ACCESS__ENV_ID);
    createEReference(environmentAccessEClass, ENVIRONMENT_ACCESS__ARGUMENT);

    lengthEClass = createEClass(LENGTH);
    createEReference(lengthEClass, LENGTH__ARGUMENT);

    getAllEClass = createEClass(GET_ALL);
    createEReference(getAllEClass, GET_ALL__EXPRESSION);
    createEReference(getAllEClass, GET_ALL__MAINFEATURE);
    createEReference(getAllEClass, GET_ALL__EXTENDFEATURE);

    containerEClass = createEClass(CONTAINER);
    createEReference(containerEClass, CONTAINER__ARGUMENT);

    castToEClass = createEClass(CAST_TO);
    createEReference(castToEClass, CAST_TO__TYPE);
    createEReference(castToEClass, CAST_TO__EXPRESSION);

    nullEClass = createEClass(NULL);

    newNameEClass = createEClass(NEW_NAME);
    createEAttribute(newNameEClass, NEW_NAME__ARGUMENT);

    cloneEClass = createEClass(CLONE);
    createEReference(cloneEClass, CLONE__ARGUMENT);

    compoundExpressionEClass = createEClass(COMPOUND_EXPRESSION);
    createEReference(compoundExpressionEClass, COMPOUND_EXPRESSION__MAIN_EXPRESSION);
    createEAttribute(compoundExpressionEClass, COMPOUND_EXPRESSION__OP);
    createEReference(compoundExpressionEClass, COMPOUND_EXPRESSION__SUB_EXPRESSION);

    indexedEClass = createEClass(INDEXED);
    createEReference(indexedEClass, INDEXED__INDEX);

    featureEClass = createEClass(FEATURE);
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
    axiomEClass.getESuperTypes().add(this.getRule());
    ruleWithPremisesEClass.getESuperTypes().add(this.getRule());
    orTypingJudgmentEClass.getESuperTypes().add(this.getTypingJudgment());
    variableDeclarationWithTypeEClass.getESuperTypes().add(this.getTypingJudgment());
    variableDeclarationWithTypeEClass.getESuperTypes().add(this.getVariableDeclaration());
    variableDeclarationWithTypeEClass.getESuperTypes().add(this.getExpression());
    collectionTypeEClass.getESuperTypes().add(this.getExpressionType());
    eClassifierTypeEClass.getESuperTypes().add(this.getExpressionType());
    basicTypeEClass.getESuperTypes().add(this.getExpressionType());
    variableSimpleDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
    quantificationEClass.getESuperTypes().add(this.getTypingJudgment());
    forEachEClass.getESuperTypes().add(this.getQuantification());
    forAllEClass.getESuperTypes().add(this.getQuantification());
    existsEClass.getESuperTypes().add(this.getQuantification());
    standardOperationEClass.getESuperTypes().add(this.getTypingJudgment());
    environmentOperationEClass.getESuperTypes().add(this.getStandardOperation());
    listOperationEClass.getESuperTypes().add(this.getStandardOperation());
    assignmentEClass.getESuperTypes().add(this.getStandardOperation());
    equalsEClass.getESuperTypes().add(this.getStandardOperation());
    failEClass.getESuperTypes().add(this.getStandardOperation());
    successEClass.getESuperTypes().add(this.getStandardOperation());
    typingJudgmentWithEnvironmentEClass.getESuperTypes().add(this.getTypingJudgment());
    environmentIdEClass.getESuperTypes().add(this.getEnvironment());
    environmentStatementEClass.getESuperTypes().add(this.getEnvironment());
    emptyEnvironmentEClass.getESuperTypes().add(this.getEnvironment());
    expressionEClass.getESuperTypes().add(this.getTypingStatementExpression());
    expressionEClass.getESuperTypes().add(this.getArrayIndex());
    stringConstantEClass.getESuperTypes().add(this.getExpression());
    integerConstantEClass.getESuperTypes().add(this.getExpression());
    integerConstantEClass.getESuperTypes().add(this.getArrayIndex());
    variableAccessEClass.getESuperTypes().add(this.getExpression());
    variableReferenceEClass.getESuperTypes().add(this.getVariableAccess());
    indexedVariableEClass.getESuperTypes().add(this.getVariableAccess());
    environmentAssignmentEClass.getESuperTypes().add(this.getEnvironmentOperation());
    environmentIncrementEClass.getESuperTypes().add(this.getEnvironmentOperation());
    environmentDecrementEClass.getESuperTypes().add(this.getEnvironmentOperation());
    listIncrementEClass.getESuperTypes().add(this.getListOperation());
    listDecrementEClass.getESuperTypes().add(this.getListOperation());
    composedErrorEClass.getESuperTypes().add(this.getFailureError());
    errorStringEClass.getESuperTypes().add(this.getFailureError());
    errorExpressionEClass.getESuperTypes().add(this.getFailureError());
    environmentCompositionEClass.getESuperTypes().add(this.getEnvironment());
    environmentAccessEClass.getESuperTypes().add(this.getExpression());
    lengthEClass.getESuperTypes().add(this.getExpression());
    getAllEClass.getESuperTypes().add(this.getExpression());
    containerEClass.getESuperTypes().add(this.getExpression());
    castToEClass.getESuperTypes().add(this.getExpression());
    nullEClass.getESuperTypes().add(this.getExpression());
    newNameEClass.getESuperTypes().add(this.getExpression());
    cloneEClass.getESuperTypes().add(this.getExpression());
    compoundExpressionEClass.getESuperTypes().add(this.getExpression());
    indexedEClass.getESuperTypes().add(this.getSubExpression());
    featureEClass.getESuperTypes().add(this.getSubExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(typeSystemDefinitionEClass, TypeSystemDefinition.class, "TypeSystemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeSystemDefinition_Name(), ecorePackage.getEString(), "name", "", 0, 1, TypeSystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeSystemDefinition_EPackage(), ecorePackage.getEPackage(), null, "ePackage", null, 0, 1, TypeSystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeSystemDefinition_GenModel(), ecorePackage.getEString(), "genModel", null, 0, 1, TypeSystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeSystemDefinition_JudgmentDescriptions(), this.getJudgmentDescription(), null, "judgmentDescriptions", null, 0, -1, TypeSystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeSystemDefinition_Rules(), this.getRule(), this.getRule_ContainingTypeSystem(), "rules", null, 0, -1, TypeSystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeSystemDefinition_EPackageURI(), ecorePackage.getEString(), "ePackageURI", "", 0, 1, TypeSystemDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(judgmentDescriptionEClass, JudgmentDescription.class, "JudgmentDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJudgmentDescription_Judgmentsymbol(), ecorePackage.getEString(), "judgmentsymbol", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Success(), ecorePackage.getEString(), "success", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Fail(), ecorePackage.getEString(), "fail", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Nomatch(), ecorePackage.getEString(), "nomatch", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJudgmentDescription_Binary(), ecorePackage.getEBoolean(), "binary", null, 0, 1, JudgmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Typejudgment(), this.getTypingJudgmentWithEnvironment(), null, "typejudgment", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_ContainingTypeSystem(), this.getTypeSystemDefinition(), this.getTypeSystemDefinition_Rules(), "containingTypeSystem", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(axiomEClass, Axiom.class, "Axiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ruleWithPremisesEClass, RuleWithPremises.class, "RuleWithPremises", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleWithPremises_Premises(), this.getTypingJudgment(), null, "premises", null, 0, -1, RuleWithPremises.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typingJudgmentEClass, TypingJudgment.class, "TypingJudgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orTypingJudgmentEClass, OrTypingJudgment.class, "OrTypingJudgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrTypingJudgment_Branches(), this.getOrBranch(), null, "branches", null, 0, -1, OrTypingJudgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrTypingJudgment_Error(), this.getErrorSpecification(), null, "error", null, 0, 1, OrTypingJudgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orBranchEClass, OrBranch.class, "OrBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrBranch_Judgments(), this.getTypingJudgment(), null, "judgments", null, 0, -1, OrBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationWithTypeEClass, VariableDeclarationWithType.class, "VariableDeclarationWithType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclarationWithType_ExpressionType(), this.getExpressionType(), null, "expressionType", null, 0, 1, VariableDeclarationWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclarationWithType_Op(), ecorePackage.getEString(), "op", null, 0, 1, VariableDeclarationWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclarationWithType_Right(), this.getExpression(), null, "right", null, 0, 1, VariableDeclarationWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionTypeEClass, ExpressionType.class, "ExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectionType_Collection(), ecorePackage.getEString(), "collection", null, 0, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectionType_Type(), this.getExpressionType(), null, "type", null, 0, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eClassifierTypeEClass, EClassifierType.class, "EClassifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEClassifierType_Eclassifier(), ecorePackage.getEClassifier(), null, "eclassifier", null, 0, 1, EClassifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicType_Basic(), ecorePackage.getEString(), "basic", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableSimpleDeclarationEClass, VariableSimpleDeclaration.class, "VariableSimpleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quantificationEClass, Quantification.class, "Quantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantification_Error(), this.getErrorSpecification(), null, "error", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantification_Expression(), this.getExpression(), null, "expression", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantification_Variable(), this.getVariableSimpleDeclaration(), null, "variable", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantification_Judgments(), this.getTypingJudgment(), null, "judgments", null, 0, -1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEachEClass, ForEach.class, "ForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forAllEClass, ForAll.class, "ForAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(existsEClass, Exists.class, "Exists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExists_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, Exists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardOperationEClass, StandardOperation.class, "StandardOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(environmentOperationEClass, EnvironmentOperation.class, "EnvironmentOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentOperation_Left(), this.getEnvironmentId(), null, "left", null, 0, 1, EnvironmentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listOperationEClass, ListOperation.class, "ListOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListOperation_Left(), this.getExpression(), null, "left", null, 0, 1, ListOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListOperation_Right(), this.getExpression(), null, "right", null, 0, 1, ListOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Left(), this.getExpression(), null, "left", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Right(), this.getExpression(), null, "right", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquals_Left(), this.getExpression(), null, "left", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquals_Op(), ecorePackage.getEString(), "op", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquals_Right(), this.getExpression(), null, "right", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquals_Error(), this.getErrorSpecification(), null, "error", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(failEClass, Fail.class, "Fail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFail_Error(), this.getErrorSpecification(), null, "error", null, 0, 1, Fail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(successEClass, Success.class, "Success", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typingJudgmentWithEnvironmentEClass, TypingJudgmentWithEnvironment.class, "TypingJudgmentWithEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypingJudgmentWithEnvironment_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, TypingJudgmentWithEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypingJudgmentWithEnvironment_Typejudgmentsymbol(), ecorePackage.getEString(), "typejudgmentsymbol", null, 0, 1, TypingJudgmentWithEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypingJudgmentWithEnvironment_Typingstatement(), this.getTypingStatement(), null, "typingstatement", null, 0, 1, TypingJudgmentWithEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypingJudgmentWithEnvironment_Error(), this.getErrorSpecification(), null, "error", null, 0, 1, TypingJudgmentWithEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(errorSpecificationEClass, ErrorSpecification.class, "ErrorSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getErrorSpecification_FailureError(), this.getFailureError(), null, "failureError", null, 0, 1, ErrorSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(failureErrorEClass, FailureError.class, "FailureError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typingStatementEClass, TypingStatement.class, "TypingStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypingStatement_Left(), this.getTypingStatementExpression(), null, "left", null, 0, 1, TypingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypingStatement_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, TypingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypingStatement_Right(), this.getTypingStatementExpression(), null, "right", null, 0, 1, TypingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typingStatementExpressionEClass, TypingStatementExpression.class, "TypingStatementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(environmentIdEClass, EnvironmentId.class, "EnvironmentId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnvironmentId_EnvironmentId(), ecorePackage.getEString(), "environmentId", null, 0, 1, EnvironmentId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentStatementEClass, EnvironmentStatement.class, "EnvironmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentStatement_Left(), this.getTypingStatementExpression(), null, "left", null, 0, 1, EnvironmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironmentStatement_Relation(), ecorePackage.getEString(), "relation", null, 0, 1, EnvironmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironmentStatement_Right(), this.getTypingStatementExpression(), null, "right", null, 0, 1, EnvironmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyEnvironmentEClass, EmptyEnvironment.class, "EmptyEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmptyEnvironment_Empty(), ecorePackage.getEString(), "empty", null, 0, 1, EmptyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAccessEClass, VariableAccess.class, "VariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableAccess_VarRef(), this.getVariableDeclaration(), null, "varRef", null, 0, 1, VariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indexedVariableEClass, IndexedVariable.class, "IndexedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexedVariable_Index(), this.getArrayIndex(), null, "index", null, 0, 1, IndexedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subExpressionEClass, SubExpression.class, "SubExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubExpression_Feature(), ecorePackage.getENamedElement(), null, "feature", null, 0, 1, SubExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayIndexEClass, ArrayIndex.class, "ArrayIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(environmentAssignmentEClass, EnvironmentAssignment.class, "EnvironmentAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentAssignment_Right(), this.getEnvironment(), null, "right", null, 0, 1, EnvironmentAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentIncrementEClass, EnvironmentIncrement.class, "EnvironmentIncrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentIncrement_Right(), this.getEnvironmentStatement(), null, "right", null, 0, 1, EnvironmentIncrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentDecrementEClass, EnvironmentDecrement.class, "EnvironmentDecrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentDecrement_Right(), this.getTypingStatementExpression(), null, "right", null, 0, 1, EnvironmentDecrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listIncrementEClass, ListIncrement.class, "ListIncrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listDecrementEClass, ListDecrement.class, "ListDecrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(composedErrorEClass, ComposedError.class, "ComposedError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComposedError_Left(), this.getFailureError(), null, "left", null, 0, 1, ComposedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComposedError_Op(), ecorePackage.getEString(), "op", null, 0, 1, ComposedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComposedError_Right(), this.getFailureError(), null, "right", null, 0, 1, ComposedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(errorStringEClass, ErrorString.class, "ErrorString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getErrorString_ErrString(), ecorePackage.getEString(), "errString", null, 0, 1, ErrorString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(errorExpressionEClass, ErrorExpression.class, "ErrorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getErrorExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, ErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentCompositionEClass, EnvironmentComposition.class, "EnvironmentComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentComposition_CurrentEnvironment(), this.getEnvironment(), null, "currentEnvironment", null, 0, 1, EnvironmentComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironmentComposition_Op(), ecorePackage.getEString(), "op", null, 0, 1, EnvironmentComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironmentComposition_SubEnvironment(), this.getEnvironment(), null, "subEnvironment", null, 0, 1, EnvironmentComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentAccessEClass, EnvironmentAccess.class, "EnvironmentAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvironmentAccess_EnvId(), this.getEnvironmentId(), null, "envId", null, 0, 1, EnvironmentAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnvironmentAccess_Argument(), this.getExpression(), null, "argument", null, 0, 1, EnvironmentAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLength_Argument(), this.getExpression(), null, "argument", null, 0, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getAllEClass, GetAll.class, "GetAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGetAll_Expression(), this.getExpression(), null, "expression", null, 0, 1, GetAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGetAll_Mainfeature(), ecorePackage.getEStructuralFeature(), null, "mainfeature", null, 0, 1, GetAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGetAll_Extendfeature(), ecorePackage.getEStructuralFeature(), null, "extendfeature", null, 0, 1, GetAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerEClass, it.xtypes.typesystem.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainer_Argument(), this.getExpression(), null, "argument", null, 0, 1, it.xtypes.typesystem.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castToEClass, CastTo.class, "CastTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastTo_Type(), this.getExpressionType(), null, "type", null, 0, 1, CastTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastTo_Expression(), this.getExpression(), null, "expression", null, 0, 1, CastTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newNameEClass, NewName.class, "NewName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNewName_Argument(), ecorePackage.getEString(), "argument", null, 0, 1, NewName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cloneEClass, Clone.class, "Clone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClone_Argument(), this.getExpression(), null, "argument", null, 0, 1, Clone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundExpressionEClass, CompoundExpression.class, "CompoundExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundExpression_MainExpression(), this.getExpression(), null, "mainExpression", null, 0, 1, CompoundExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompoundExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, CompoundExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompoundExpression_SubExpression(), this.getSubExpression(), null, "subExpression", null, 0, 1, CompoundExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedEClass, Indexed.class, "Indexed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexed_Index(), this.getArrayIndex(), null, "index", null, 0, 1, Indexed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //TypesystemPackageImpl
