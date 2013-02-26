/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo.impl;

import expr.exprDemo.Assert;
import expr.exprDemo.Expr;
import expr.exprDemo.ExprDemoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expr.exprDemo.impl.AssertImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link expr.exprDemo.impl.AssertImpl#getExpected <em>Expected</em>}</li>
 *   <li>{@link expr.exprDemo.impl.AssertImpl#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertImpl extends ElementImpl implements Assert
{
  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected Expr actual;

  /**
   * The cached value of the '{@link #getExpected() <em>Expected</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpected()
   * @generated
   * @ordered
   */
  protected Expr expected;

  /**
   * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsg()
   * @generated
   * @ordered
   */
  protected Expr msg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertImpl()
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
    return ExprDemoPackage.Literals.ASSERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(Expr newActual, NotificationChain msgs)
  {
    Expr oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(Expr newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__ACTUAL, newActual, newActual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpected()
  {
    return expected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpected(Expr newExpected, NotificationChain msgs)
  {
    Expr oldExpected = expected;
    expected = newExpected;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__EXPECTED, oldExpected, newExpected);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpected(Expr newExpected)
  {
    if (newExpected != expected)
    {
      NotificationChain msgs = null;
      if (expected != null)
        msgs = ((InternalEObject)expected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__EXPECTED, null, msgs);
      if (newExpected != null)
        msgs = ((InternalEObject)newExpected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__EXPECTED, null, msgs);
      msgs = basicSetExpected(newExpected, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__EXPECTED, newExpected, newExpected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getMsg()
  {
    return msg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMsg(Expr newMsg, NotificationChain msgs)
  {
    Expr oldMsg = msg;
    msg = newMsg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__MSG, oldMsg, newMsg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMsg(Expr newMsg)
  {
    if (newMsg != msg)
    {
      NotificationChain msgs = null;
      if (msg != null)
        msgs = ((InternalEObject)msg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__MSG, null, msgs);
      if (newMsg != null)
        msgs = ((InternalEObject)newMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExprDemoPackage.ASSERT__MSG, null, msgs);
      msgs = basicSetMsg(newMsg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.ASSERT__MSG, newMsg, newMsg));
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
      case ExprDemoPackage.ASSERT__ACTUAL:
        return basicSetActual(null, msgs);
      case ExprDemoPackage.ASSERT__EXPECTED:
        return basicSetExpected(null, msgs);
      case ExprDemoPackage.ASSERT__MSG:
        return basicSetMsg(null, msgs);
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
      case ExprDemoPackage.ASSERT__ACTUAL:
        return getActual();
      case ExprDemoPackage.ASSERT__EXPECTED:
        return getExpected();
      case ExprDemoPackage.ASSERT__MSG:
        return getMsg();
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
      case ExprDemoPackage.ASSERT__ACTUAL:
        setActual((Expr)newValue);
        return;
      case ExprDemoPackage.ASSERT__EXPECTED:
        setExpected((Expr)newValue);
        return;
      case ExprDemoPackage.ASSERT__MSG:
        setMsg((Expr)newValue);
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
      case ExprDemoPackage.ASSERT__ACTUAL:
        setActual((Expr)null);
        return;
      case ExprDemoPackage.ASSERT__EXPECTED:
        setExpected((Expr)null);
        return;
      case ExprDemoPackage.ASSERT__MSG:
        setMsg((Expr)null);
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
      case ExprDemoPackage.ASSERT__ACTUAL:
        return actual != null;
      case ExprDemoPackage.ASSERT__EXPECTED:
        return expected != null;
      case ExprDemoPackage.ASSERT__MSG:
        return msg != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertImpl
