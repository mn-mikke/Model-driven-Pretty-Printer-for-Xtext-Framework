/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentIdImpl#getEnvironmentId <em>Environment Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentIdImpl extends EnvironmentImpl implements EnvironmentId
{
  /**
   * The default value of the '{@link #getEnvironmentId() <em>Environment Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironmentId()
   * @generated
   * @ordered
   */
  protected static final String ENVIRONMENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnvironmentId() <em>Environment Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironmentId()
   * @generated
   * @ordered
   */
  protected String environmentId = ENVIRONMENT_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentIdImpl()
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
    return TypesystemPackage.Literals.ENVIRONMENT_ID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnvironmentId()
  {
    return environmentId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironmentId(String newEnvironmentId)
  {
    String oldEnvironmentId = environmentId;
    environmentId = newEnvironmentId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_ID__ENVIRONMENT_ID, oldEnvironmentId, environmentId));
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
      case TypesystemPackage.ENVIRONMENT_ID__ENVIRONMENT_ID:
        return getEnvironmentId();
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
      case TypesystemPackage.ENVIRONMENT_ID__ENVIRONMENT_ID:
        setEnvironmentId((String)newValue);
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
      case TypesystemPackage.ENVIRONMENT_ID__ENVIRONMENT_ID:
        setEnvironmentId(ENVIRONMENT_ID_EDEFAULT);
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
      case TypesystemPackage.ENVIRONMENT_ID__ENVIRONMENT_ID:
        return ENVIRONMENT_ID_EDEFAULT == null ? environmentId != null : !ENVIRONMENT_ID_EDEFAULT.equals(environmentId);
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
    result.append(" (environmentId: ");
    result.append(environmentId);
    result.append(')');
    return result.toString();
  }

} //EnvironmentIdImpl
