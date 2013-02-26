/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.BoxModelOperators;
import gpp.tests.operators.operatorsTest.GlobalEnum;
import gpp.tests.operators.operatorsTest.Import;
import gpp.tests.operators.operatorsTest.IntConstant;
import gpp.tests.operators.operatorsTest.OperatorDefinition;
import gpp.tests.operators.operatorsTest.OperatorsTestPackage;
import gpp.tests.operators.operatorsTest.StringConstant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box Model Operators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl#getOperatorDefinitions <em>Operator Definitions</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl#getIntConstants <em>Int Constants</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.BoxModelOperatorsImpl#getStringConstants <em>String Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoxModelOperatorsImpl extends MinimalEObjectImpl.Container implements BoxModelOperators
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getOperatorDefinitions() <em>Operator Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatorDefinitions()
   * @generated
   * @ordered
   */
  protected EList<OperatorDefinition> operatorDefinitions;

  /**
   * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerations()
   * @generated
   * @ordered
   */
  protected EList<GlobalEnum> enumerations;

  /**
   * The cached value of the '{@link #getIntConstants() <em>Int Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntConstants()
   * @generated
   * @ordered
   */
  protected EList<IntConstant> intConstants;

  /**
   * The cached value of the '{@link #getStringConstants() <em>String Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringConstants()
   * @generated
   * @ordered
   */
  protected EList<StringConstant> stringConstants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoxModelOperatorsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OperatorsTestPackage.Literals.BOX_MODEL_OPERATORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperatorDefinition> getOperatorDefinitions()
  {
    if (operatorDefinitions == null)
    {
      operatorDefinitions = new EObjectContainmentEList<OperatorDefinition>(OperatorDefinition.class, this, OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS);
    }
    return operatorDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlobalEnum> getEnumerations()
  {
    if (enumerations == null)
    {
      enumerations = new EObjectContainmentEList<GlobalEnum>(GlobalEnum.class, this, OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS);
    }
    return enumerations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntConstant> getIntConstants()
  {
    if (intConstants == null)
    {
      intConstants = new EObjectContainmentEList<IntConstant>(IntConstant.class, this, OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS);
    }
    return intConstants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StringConstant> getStringConstants()
  {
    if (stringConstants == null)
    {
      stringConstants = new EObjectContainmentEList<StringConstant>(StringConstant.class, this, OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS);
    }
    return stringConstants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS:
        return ((InternalEList<?>)getOperatorDefinitions()).basicRemove(otherEnd, msgs);
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS:
        return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS:
        return ((InternalEList<?>)getIntConstants()).basicRemove(otherEnd, msgs);
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS:
        return ((InternalEList<?>)getStringConstants()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS:
        return getImports();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS:
        return getOperatorDefinitions();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS:
        return getEnumerations();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS:
        return getIntConstants();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS:
        return getStringConstants();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS:
        getOperatorDefinitions().clear();
        getOperatorDefinitions().addAll((Collection<? extends OperatorDefinition>)newValue);
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS:
        getEnumerations().clear();
        getEnumerations().addAll((Collection<? extends GlobalEnum>)newValue);
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS:
        getIntConstants().clear();
        getIntConstants().addAll((Collection<? extends IntConstant>)newValue);
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS:
        getStringConstants().clear();
        getStringConstants().addAll((Collection<? extends StringConstant>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS:
        getImports().clear();
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS:
        getOperatorDefinitions().clear();
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS:
        getEnumerations().clear();
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS:
        getIntConstants().clear();
        return;
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS:
        getStringConstants().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__OPERATOR_DEFINITIONS:
        return operatorDefinitions != null && !operatorDefinitions.isEmpty();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__ENUMERATIONS:
        return enumerations != null && !enumerations.isEmpty();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__INT_CONSTANTS:
        return intConstants != null && !intConstants.isEmpty();
      case OperatorsTestPackage.BOX_MODEL_OPERATORS__STRING_CONSTANTS:
        return stringConstants != null && !stringConstants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BoxModelOperatorsImpl
