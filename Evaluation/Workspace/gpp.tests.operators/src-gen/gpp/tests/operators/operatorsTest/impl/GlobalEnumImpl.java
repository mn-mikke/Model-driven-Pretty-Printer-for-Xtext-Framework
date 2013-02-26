/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.EnumAlternative;
import gpp.tests.operators.operatorsTest.GlobalEnum;
import gpp.tests.operators.operatorsTest.OperatorsTestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl#getName <em>Name</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.GlobalEnumImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalEnumImpl extends MinimalEObjectImpl.Container implements GlobalEnum
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternatives()
   * @generated
   * @ordered
   */
  protected EList<EnumAlternative> alternatives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalEnumImpl()
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
    return OperatorsTestPackage.Literals.GLOBAL_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.GLOBAL_ENUM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumAlternative> getAlternatives()
  {
    if (alternatives == null)
    {
      alternatives = new EObjectContainmentEList<EnumAlternative>(EnumAlternative.class, this, OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES);
    }
    return alternatives;
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
      case OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES:
        return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
      case OperatorsTestPackage.GLOBAL_ENUM__NAME:
        return getName();
      case OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES:
        return getAlternatives();
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
      case OperatorsTestPackage.GLOBAL_ENUM__NAME:
        setName((String)newValue);
        return;
      case OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES:
        getAlternatives().clear();
        getAlternatives().addAll((Collection<? extends EnumAlternative>)newValue);
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
      case OperatorsTestPackage.GLOBAL_ENUM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES:
        getAlternatives().clear();
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
      case OperatorsTestPackage.GLOBAL_ENUM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OperatorsTestPackage.GLOBAL_ENUM__ALTERNATIVES:
        return alternatives != null && !alternatives.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GlobalEnumImpl
