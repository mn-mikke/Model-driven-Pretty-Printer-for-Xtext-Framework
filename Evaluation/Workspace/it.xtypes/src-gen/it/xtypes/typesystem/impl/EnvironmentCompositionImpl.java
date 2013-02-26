/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.Environment;
import it.xtypes.typesystem.EnvironmentComposition;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentCompositionImpl#getCurrentEnvironment <em>Current Environment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentCompositionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.EnvironmentCompositionImpl#getSubEnvironment <em>Sub Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentCompositionImpl extends EnvironmentImpl implements EnvironmentComposition
{
  /**
   * The cached value of the '{@link #getCurrentEnvironment() <em>Current Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentEnvironment()
   * @generated
   * @ordered
   */
  protected Environment currentEnvironment;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubEnvironment() <em>Sub Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubEnvironment()
   * @generated
   * @ordered
   */
  protected Environment subEnvironment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentCompositionImpl()
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
    return TypesystemPackage.Literals.ENVIRONMENT_COMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getCurrentEnvironment()
  {
    return currentEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentEnvironment(Environment newCurrentEnvironment, NotificationChain msgs)
  {
    Environment oldCurrentEnvironment = currentEnvironment;
    currentEnvironment = newCurrentEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT, oldCurrentEnvironment, newCurrentEnvironment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentEnvironment(Environment newCurrentEnvironment)
  {
    if (newCurrentEnvironment != currentEnvironment)
    {
      NotificationChain msgs = null;
      if (currentEnvironment != null)
        msgs = ((InternalEObject)currentEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT, null, msgs);
      if (newCurrentEnvironment != null)
        msgs = ((InternalEObject)newCurrentEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT, null, msgs);
      msgs = basicSetCurrentEnvironment(newCurrentEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT, newCurrentEnvironment, newCurrentEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_COMPOSITION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getSubEnvironment()
  {
    return subEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubEnvironment(Environment newSubEnvironment, NotificationChain msgs)
  {
    Environment oldSubEnvironment = subEnvironment;
    subEnvironment = newSubEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT, oldSubEnvironment, newSubEnvironment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubEnvironment(Environment newSubEnvironment)
  {
    if (newSubEnvironment != subEnvironment)
    {
      NotificationChain msgs = null;
      if (subEnvironment != null)
        msgs = ((InternalEObject)subEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT, null, msgs);
      if (newSubEnvironment != null)
        msgs = ((InternalEObject)newSubEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT, null, msgs);
      msgs = basicSetSubEnvironment(newSubEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT, newSubEnvironment, newSubEnvironment));
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
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT:
        return basicSetCurrentEnvironment(null, msgs);
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT:
        return basicSetSubEnvironment(null, msgs);
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
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT:
        return getCurrentEnvironment();
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__OP:
        return getOp();
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT:
        return getSubEnvironment();
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
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT:
        setCurrentEnvironment((Environment)newValue);
        return;
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__OP:
        setOp((String)newValue);
        return;
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT:
        setSubEnvironment((Environment)newValue);
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
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT:
        setCurrentEnvironment((Environment)null);
        return;
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__OP:
        setOp(OP_EDEFAULT);
        return;
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT:
        setSubEnvironment((Environment)null);
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
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__CURRENT_ENVIRONMENT:
        return currentEnvironment != null;
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case TypesystemPackage.ENVIRONMENT_COMPOSITION__SUB_ENVIRONMENT:
        return subEnvironment != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //EnvironmentCompositionImpl
