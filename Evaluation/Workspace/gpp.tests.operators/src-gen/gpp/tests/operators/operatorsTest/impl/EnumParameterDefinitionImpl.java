/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest.impl;

import gpp.tests.operators.operatorsTest.EnumAlternative;
import gpp.tests.operators.operatorsTest.EnumParameterDefinition;
import gpp.tests.operators.operatorsTest.GlobalEnum;
import gpp.tests.operators.operatorsTest.OperatorsTestPackage;

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
 * An implementation of the model object '<em><b>Enum Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.impl.EnumParameterDefinitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumParameterDefinitionImpl extends ParameterDefinitionImpl implements EnumParameterDefinition
{
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
   * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeration()
   * @generated
   * @ordered
   */
  protected GlobalEnum enumeration;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EnumAlternative value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumParameterDefinitionImpl()
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
    return OperatorsTestPackage.Literals.ENUM_PARAMETER_DEFINITION;
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
      alternatives = new EObjectContainmentEList<EnumAlternative>(EnumAlternative.class, this, OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES);
    }
    return alternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalEnum getEnumeration()
  {
    if (enumeration != null && enumeration.eIsProxy())
    {
      InternalEObject oldEnumeration = (InternalEObject)enumeration;
      enumeration = (GlobalEnum)eResolveProxy(oldEnumeration);
      if (enumeration != oldEnumeration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION, oldEnumeration, enumeration));
      }
    }
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalEnum basicGetEnumeration()
  {
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeration(GlobalEnum newEnumeration)
  {
    GlobalEnum oldEnumeration = enumeration;
    enumeration = newEnumeration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION, oldEnumeration, enumeration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAlternative getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (EnumAlternative)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAlternative basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(EnumAlternative newValue)
  {
    EnumAlternative oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE, oldValue, value));
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
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES:
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
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES:
        return getAlternatives();
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION:
        if (resolve) return getEnumeration();
        return basicGetEnumeration();
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES:
        getAlternatives().clear();
        getAlternatives().addAll((Collection<? extends EnumAlternative>)newValue);
        return;
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION:
        setEnumeration((GlobalEnum)newValue);
        return;
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE:
        setValue((EnumAlternative)newValue);
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
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES:
        getAlternatives().clear();
        return;
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION:
        setEnumeration((GlobalEnum)null);
        return;
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE:
        setValue((EnumAlternative)null);
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
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ALTERNATIVES:
        return alternatives != null && !alternatives.isEmpty();
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__ENUMERATION:
        return enumeration != null;
      case OperatorsTestPackage.ENUM_PARAMETER_DEFINITION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumParameterDefinitionImpl
