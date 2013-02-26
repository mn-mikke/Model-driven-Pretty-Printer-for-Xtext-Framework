/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.EnvironmentAccess;
import it.xtypes.typesystem.EnvironmentId;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentAccessImpl#getEnvId <em>Env Id</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentAccessImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentAccessImpl extends ExpressionImpl implements EnvironmentAccess
{
  /**
   * The cached value of the '{@link #getEnvId() <em>Env Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvId()
   * @generated
   * @ordered
   */
  protected EnvironmentId envId;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected Expression argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentAccessImpl()
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
    return TypesystemPackage.Literals.ENVIRONMENT_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentId getEnvId()
  {
    return envId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvId(EnvironmentId newEnvId, NotificationChain msgs)
  {
    EnvironmentId oldEnvId = envId;
    envId = newEnvId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID, oldEnvId, newEnvId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvId(EnvironmentId newEnvId)
  {
    if (newEnvId != envId)
    {
      NotificationChain msgs = null;
      if (envId != null)
        msgs = ((InternalEObject)envId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID, null, msgs);
      if (newEnvId != null)
        msgs = ((InternalEObject)newEnvId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID, null, msgs);
      msgs = basicSetEnvId(newEnvId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID, newEnvId, newEnvId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(Expression newArgument, NotificationChain msgs)
  {
    Expression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(Expression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT, newArgument, newArgument));
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
      case TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID:
        return basicSetEnvId(null, msgs);
      case TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT:
        return basicSetArgument(null, msgs);
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
      case TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID:
        return getEnvId();
      case TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT:
        return getArgument();
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
      case TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID:
        setEnvId((EnvironmentId)newValue);
        return;
      case TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT:
        setArgument((Expression)newValue);
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
      case TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID:
        setEnvId((EnvironmentId)null);
        return;
      case TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT:
        setArgument((Expression)null);
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
      case TypesystemPackage.ENVIRONMENT_ACCESS__ENV_ID:
        return envId != null;
      case TypesystemPackage.ENVIRONMENT_ACCESS__ARGUMENT:
        return argument != null;
    }
    return super.eIsSet(featureID);
  }

} //EnvironmentAccessImpl
