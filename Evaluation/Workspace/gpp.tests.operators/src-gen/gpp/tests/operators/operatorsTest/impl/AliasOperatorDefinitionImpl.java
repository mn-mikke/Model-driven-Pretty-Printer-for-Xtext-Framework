/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.AliasOperatorDefinition;
import gpp.tests.operators.operatorsTest.OperatorDefinition;
import gpp.tests.operators.operatorsTest.OperatorsTestPackage;
import gpp.tests.operators.operatorsTest.ParameterApplication;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.AliasOperatorDefinitionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasOperatorDefinitionImpl extends OperatorDefinitionImpl implements AliasOperatorDefinition
{
  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OperatorDefinition operator;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterApplication> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasOperatorDefinitionImpl()
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
    return OperatorsTestPackage.Literals.ALIAS_OPERATOR_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDefinition getOperator()
  {
    if (operator != null && operator.eIsProxy())
    {
      InternalEObject oldOperator = (InternalEObject)operator;
      operator = (OperatorDefinition)eResolveProxy(oldOperator);
      if (operator != oldOperator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR, oldOperator, operator));
      }
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorDefinition basicGetOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(OperatorDefinition newOperator)
  {
    OperatorDefinition oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterApplication> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterApplication>(ParameterApplication.class, this, OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS);
    }
    return parameters;
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
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR:
        if (resolve) return getOperator();
        return basicGetOperator();
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS:
        return getParameters();
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
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR:
        setOperator((OperatorDefinition)newValue);
        return;
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterApplication>)newValue);
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
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR:
        setOperator((OperatorDefinition)null);
        return;
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS:
        getParameters().clear();
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
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__OPERATOR:
        return operator != null;
      case OperatorsTestPackage.ALIAS_OPERATOR_DEFINITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AliasOperatorDefinitionImpl
