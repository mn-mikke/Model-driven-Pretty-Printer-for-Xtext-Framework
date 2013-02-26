/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.OperatorsTestPackage;
import gpp.tests.operators.operatorsTest.ParameterApplication;
import gpp.tests.operators.operatorsTest.ParameterApplicationValue;
import gpp.tests.operators.operatorsTest.ParameterDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl#getReferencedParameter <em>Referenced Parameter</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.ParameterApplicationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterApplicationImpl extends MinimalEObjectImpl.Container implements ParameterApplication
{
  /**
   * The cached value of the '{@link #getReferencedParameter() <em>Referenced Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedParameter()
   * @generated
   * @ordered
   */
  protected ParameterDefinition referencedParameter;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ParameterApplicationValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterApplicationImpl()
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
    return OperatorsTestPackage.Literals.PARAMETER_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition getReferencedParameter()
  {
    if (referencedParameter != null && referencedParameter.eIsProxy())
    {
      InternalEObject oldReferencedParameter = (InternalEObject)referencedParameter;
      referencedParameter = (ParameterDefinition)eResolveProxy(oldReferencedParameter);
      if (referencedParameter != oldReferencedParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER, oldReferencedParameter, referencedParameter));
      }
    }
    return referencedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition basicGetReferencedParameter()
  {
    return referencedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedParameter(ParameterDefinition newReferencedParameter)
  {
    ParameterDefinition oldReferencedParameter = referencedParameter;
    referencedParameter = newReferencedParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER, oldReferencedParameter, referencedParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterApplicationValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ParameterApplicationValue newValue, NotificationChain msgs)
  {
    ParameterApplicationValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.PARAMETER_APPLICATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ParameterApplicationValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperatorsTestPackage.PARAMETER_APPLICATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperatorsTestPackage.PARAMETER_APPLICATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.PARAMETER_APPLICATION__VALUE, newValue, newValue));
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
      case OperatorsTestPackage.PARAMETER_APPLICATION__VALUE:
        return basicSetValue(null, msgs);
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
      case OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER:
        if (resolve) return getReferencedParameter();
        return basicGetReferencedParameter();
      case OperatorsTestPackage.PARAMETER_APPLICATION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER:
        setReferencedParameter((ParameterDefinition)newValue);
        return;
      case OperatorsTestPackage.PARAMETER_APPLICATION__VALUE:
        setValue((ParameterApplicationValue)newValue);
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
      case OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER:
        setReferencedParameter((ParameterDefinition)null);
        return;
      case OperatorsTestPackage.PARAMETER_APPLICATION__VALUE:
        setValue((ParameterApplicationValue)null);
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
      case OperatorsTestPackage.PARAMETER_APPLICATION__REFERENCED_PARAMETER:
        return referencedParameter != null;
      case OperatorsTestPackage.PARAMETER_APPLICATION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterApplicationImpl
