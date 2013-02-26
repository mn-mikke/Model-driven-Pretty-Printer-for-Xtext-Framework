/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.CompoundExpression;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.SubExpression;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.CompoundExpressionImpl#getMainExpression <em>Main Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.CompoundExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.CompoundExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundExpressionImpl extends ExpressionImpl implements CompoundExpression
{
  /**
   * The cached value of the '{@link #getMainExpression() <em>Main Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainExpression()
   * @generated
   * @ordered
   */
  protected Expression mainExpression;

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
   * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubExpression()
   * @generated
   * @ordered
   */
  protected SubExpression subExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompoundExpressionImpl()
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
    return TypesystemPackage.Literals.COMPOUND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMainExpression()
  {
    return mainExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainExpression(Expression newMainExpression, NotificationChain msgs)
  {
    Expression oldMainExpression = mainExpression;
    mainExpression = newMainExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION, oldMainExpression, newMainExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainExpression(Expression newMainExpression)
  {
    if (newMainExpression != mainExpression)
    {
      NotificationChain msgs = null;
      if (mainExpression != null)
        msgs = ((InternalEObject)mainExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION, null, msgs);
      if (newMainExpression != null)
        msgs = ((InternalEObject)newMainExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION, null, msgs);
      msgs = basicSetMainExpression(newMainExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION, newMainExpression, newMainExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.COMPOUND_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubExpression getSubExpression()
  {
    return subExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubExpression(SubExpression newSubExpression, NotificationChain msgs)
  {
    SubExpression oldSubExpression = subExpression;
    subExpression = newSubExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION, oldSubExpression, newSubExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubExpression(SubExpression newSubExpression)
  {
    if (newSubExpression != subExpression)
    {
      NotificationChain msgs = null;
      if (subExpression != null)
        msgs = ((InternalEObject)subExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION, null, msgs);
      if (newSubExpression != null)
        msgs = ((InternalEObject)newSubExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION, null, msgs);
      msgs = basicSetSubExpression(newSubExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION, newSubExpression, newSubExpression));
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
      case TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION:
        return basicSetMainExpression(null, msgs);
      case TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION:
        return basicSetSubExpression(null, msgs);
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
      case TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION:
        return getMainExpression();
      case TypesystemPackage.COMPOUND_EXPRESSION__OP:
        return getOp();
      case TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION:
        return getSubExpression();
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
      case TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION:
        setMainExpression((Expression)newValue);
        return;
      case TypesystemPackage.COMPOUND_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION:
        setSubExpression((SubExpression)newValue);
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
      case TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION:
        setMainExpression((Expression)null);
        return;
      case TypesystemPackage.COMPOUND_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION:
        setSubExpression((SubExpression)null);
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
      case TypesystemPackage.COMPOUND_EXPRESSION__MAIN_EXPRESSION:
        return mainExpression != null;
      case TypesystemPackage.COMPOUND_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case TypesystemPackage.COMPOUND_EXPRESSION__SUB_EXPRESSION:
        return subExpression != null;
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

} //CompoundExpressionImpl
