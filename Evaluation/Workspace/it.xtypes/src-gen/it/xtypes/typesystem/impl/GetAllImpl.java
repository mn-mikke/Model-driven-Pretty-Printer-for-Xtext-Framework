/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.GetAll;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.GetAllImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.GetAllImpl#getMainfeature <em>Mainfeature</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.GetAllImpl#getExtendfeature <em>Extendfeature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetAllImpl extends ExpressionImpl implements GetAll
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getMainfeature() <em>Mainfeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainfeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature mainfeature;

  /**
   * The cached value of the '{@link #getExtendfeature() <em>Extendfeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendfeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature extendfeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetAllImpl()
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
    return TypesystemPackage.Literals.GET_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.GET_ALL__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.GET_ALL__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.GET_ALL__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.GET_ALL__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getMainfeature()
  {
    if (mainfeature != null && mainfeature.eIsProxy())
    {
      InternalEObject oldMainfeature = (InternalEObject)mainfeature;
      mainfeature = (EStructuralFeature)eResolveProxy(oldMainfeature);
      if (mainfeature != oldMainfeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesystemPackage.GET_ALL__MAINFEATURE, oldMainfeature, mainfeature));
      }
    }
    return mainfeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetMainfeature()
  {
    return mainfeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainfeature(EStructuralFeature newMainfeature)
  {
    EStructuralFeature oldMainfeature = mainfeature;
    mainfeature = newMainfeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.GET_ALL__MAINFEATURE, oldMainfeature, mainfeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getExtendfeature()
  {
    if (extendfeature != null && extendfeature.eIsProxy())
    {
      InternalEObject oldExtendfeature = (InternalEObject)extendfeature;
      extendfeature = (EStructuralFeature)eResolveProxy(oldExtendfeature);
      if (extendfeature != oldExtendfeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesystemPackage.GET_ALL__EXTENDFEATURE, oldExtendfeature, extendfeature));
      }
    }
    return extendfeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetExtendfeature()
  {
    return extendfeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendfeature(EStructuralFeature newExtendfeature)
  {
    EStructuralFeature oldExtendfeature = extendfeature;
    extendfeature = newExtendfeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.GET_ALL__EXTENDFEATURE, oldExtendfeature, extendfeature));
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
      case TypesystemPackage.GET_ALL__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case TypesystemPackage.GET_ALL__EXPRESSION:
        return getExpression();
      case TypesystemPackage.GET_ALL__MAINFEATURE:
        if (resolve) return getMainfeature();
        return basicGetMainfeature();
      case TypesystemPackage.GET_ALL__EXTENDFEATURE:
        if (resolve) return getExtendfeature();
        return basicGetExtendfeature();
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
      case TypesystemPackage.GET_ALL__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case TypesystemPackage.GET_ALL__MAINFEATURE:
        setMainfeature((EStructuralFeature)newValue);
        return;
      case TypesystemPackage.GET_ALL__EXTENDFEATURE:
        setExtendfeature((EStructuralFeature)newValue);
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
      case TypesystemPackage.GET_ALL__EXPRESSION:
        setExpression((Expression)null);
        return;
      case TypesystemPackage.GET_ALL__MAINFEATURE:
        setMainfeature((EStructuralFeature)null);
        return;
      case TypesystemPackage.GET_ALL__EXTENDFEATURE:
        setExtendfeature((EStructuralFeature)null);
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
      case TypesystemPackage.GET_ALL__EXPRESSION:
        return expression != null;
      case TypesystemPackage.GET_ALL__MAINFEATURE:
        return mainfeature != null;
      case TypesystemPackage.GET_ALL__EXTENDFEATURE:
        return extendfeature != null;
    }
    return super.eIsSet(featureID);
  }

} //GetAllImpl
