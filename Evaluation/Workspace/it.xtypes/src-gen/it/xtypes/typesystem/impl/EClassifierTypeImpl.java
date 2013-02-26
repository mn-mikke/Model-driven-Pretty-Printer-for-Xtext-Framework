/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClassifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.EClassifierTypeImpl#getEclassifier <em>Eclassifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassifierTypeImpl extends ExpressionTypeImpl implements EClassifierType
{
  /**
   * The cached value of the '{@link #getEclassifier() <em>Eclassifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEclassifier()
   * @generated
   * @ordered
   */
  protected EClassifier eclassifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClassifierTypeImpl()
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
    return TypesystemPackage.Literals.ECLASSIFIER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier getEclassifier()
  {
    if (eclassifier != null && eclassifier.eIsProxy())
    {
      InternalEObject oldEclassifier = (InternalEObject)eclassifier;
      eclassifier = (EClassifier)eResolveProxy(oldEclassifier);
      if (eclassifier != oldEclassifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER, oldEclassifier, eclassifier));
      }
    }
    return eclassifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier basicGetEclassifier()
  {
    return eclassifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEclassifier(EClassifier newEclassifier)
  {
    EClassifier oldEclassifier = eclassifier;
    eclassifier = newEclassifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER, oldEclassifier, eclassifier));
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
      case TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER:
        if (resolve) return getEclassifier();
        return basicGetEclassifier();
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
      case TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER:
        setEclassifier((EClassifier)newValue);
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
      case TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER:
        setEclassifier((EClassifier)null);
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
      case TypesystemPackage.ECLASSIFIER_TYPE__ECLASSIFIER:
        return eclassifier != null;
    }
    return super.eIsSet(featureID);
  }

} //EClassifierTypeImpl
