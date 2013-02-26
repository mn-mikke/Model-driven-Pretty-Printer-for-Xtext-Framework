/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo.impl;

import expr.exprDemo.EnumDecl;
import expr.exprDemo.EnumType;
import expr.exprDemo.ExprDemoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expr.exprDemo.impl.EnumTypeImpl#getEnumRef <em>Enum Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumTypeImpl extends PrimitiveTypeImpl implements EnumType
{
  /**
   * The cached value of the '{@link #getEnumRef() <em>Enum Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumRef()
   * @generated
   * @ordered
   */
  protected EnumDecl enumRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumTypeImpl()
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
    return ExprDemoPackage.Literals.ENUM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDecl getEnumRef()
  {
    if (enumRef != null && enumRef.eIsProxy())
    {
      InternalEObject oldEnumRef = (InternalEObject)enumRef;
      enumRef = (EnumDecl)eResolveProxy(oldEnumRef);
      if (enumRef != oldEnumRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExprDemoPackage.ENUM_TYPE__ENUM_REF, oldEnumRef, enumRef));
      }
    }
    return enumRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDecl basicGetEnumRef()
  {
    return enumRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumRef(EnumDecl newEnumRef)
  {
    EnumDecl oldEnumRef = enumRef;
    enumRef = newEnumRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ENUM_TYPE__ENUM_REF, oldEnumRef, enumRef));
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
      case ExprDemoPackage.ENUM_TYPE__ENUM_REF:
        if (resolve) return getEnumRef();
        return basicGetEnumRef();
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
      case ExprDemoPackage.ENUM_TYPE__ENUM_REF:
        setEnumRef((EnumDecl)newValue);
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
      case ExprDemoPackage.ENUM_TYPE__ENUM_REF:
        setEnumRef((EnumDecl)null);
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
      case ExprDemoPackage.ENUM_TYPE__ENUM_REF:
        return enumRef != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumTypeImpl
