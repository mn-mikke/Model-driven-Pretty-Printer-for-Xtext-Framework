/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.FailureError;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.ErrorSpecificationImpl#getFailureError <em>Failure Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorSpecificationImpl extends MinimalEObjectImpl.Container implements ErrorSpecification
{
  /**
   * The cached value of the '{@link #getFailureError() <em>Failure Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailureError()
   * @generated
   * @ordered
   */
  protected FailureError failureError;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorSpecificationImpl()
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
    return TypesystemPackage.Literals.ERROR_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailureError getFailureError()
  {
    return failureError;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFailureError(FailureError newFailureError, NotificationChain msgs)
  {
    FailureError oldFailureError = failureError;
    failureError = newFailureError;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR, oldFailureError, newFailureError);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailureError(FailureError newFailureError)
  {
    if (newFailureError != failureError)
    {
      NotificationChain msgs = null;
      if (failureError != null)
        msgs = ((InternalEObject)failureError).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR, null, msgs);
      if (newFailureError != null)
        msgs = ((InternalEObject)newFailureError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR, null, msgs);
      msgs = basicSetFailureError(newFailureError, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR, newFailureError, newFailureError));
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
      case TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR:
        return basicSetFailureError(null, msgs);
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
      case TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR:
        return getFailureError();
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
      case TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR:
        setFailureError((FailureError)newValue);
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
      case TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR:
        setFailureError((FailureError)null);
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
      case TypesystemPackage.ERROR_SPECIFICATION__FAILURE_ERROR:
        return failureError != null;
    }
    return super.eIsSet(featureID);
  }

} //ErrorSpecificationImpl
