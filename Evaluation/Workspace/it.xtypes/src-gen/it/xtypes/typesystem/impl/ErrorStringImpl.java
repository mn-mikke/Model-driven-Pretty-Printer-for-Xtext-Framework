/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ErrorString;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.ErrorStringImpl#getErrString <em>Err String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorStringImpl extends FailureErrorImpl implements ErrorString
{
  /**
   * The default value of the '{@link #getErrString() <em>Err String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrString()
   * @generated
   * @ordered
   */
  protected static final String ERR_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getErrString() <em>Err String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrString()
   * @generated
   * @ordered
   */
  protected String errString = ERR_STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorStringImpl()
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
    return TypesystemPackage.Literals.ERROR_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getErrString()
  {
    return errString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrString(String newErrString)
  {
    String oldErrString = errString;
    errString = newErrString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ERROR_STRING__ERR_STRING, oldErrString, errString));
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
      case TypesystemPackage.ERROR_STRING__ERR_STRING:
        return getErrString();
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
      case TypesystemPackage.ERROR_STRING__ERR_STRING:
        setErrString((String)newValue);
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
      case TypesystemPackage.ERROR_STRING__ERR_STRING:
        setErrString(ERR_STRING_EDEFAULT);
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
      case TypesystemPackage.ERROR_STRING__ERR_STRING:
        return ERR_STRING_EDEFAULT == null ? errString != null : !ERR_STRING_EDEFAULT.equals(errString);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (errString: ");
    result.append(errString);
    result.append(')');
    return result.toString();
  }

} //ErrorStringImpl
