/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ArrayIndex;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingStatementExpression;
import it.xtypes.typesystem.VariableDeclaration;
import it.xtypes.typesystem.VariableDeclarationWithType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration With Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.VariableDeclarationWithTypeImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationWithTypeImpl extends TypingJudgmentImpl implements VariableDeclarationWithType
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
   * The cached value of the '{@link #getExpressionType() <em>Expression Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionType()
   * @generated
   * @ordered
   */
  protected ExpressionType expressionType;

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
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationWithTypeImpl()
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
    return TypesystemPackage.Literals.VARIABLE_DECLARATION_WITH_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionType getExpressionType()
  {
    return expressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionType(ExpressionType newExpressionType, NotificationChain msgs)
  {
    ExpressionType oldExpressionType = expressionType;
    expressionType = newExpressionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE, oldExpressionType, newExpressionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionType(ExpressionType newExpressionType)
  {
    if (newExpressionType != expressionType)
    {
      NotificationChain msgs = null;
      if (expressionType != null)
        msgs = ((InternalEObject)expressionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE, null, msgs);
      if (newExpressionType != null)
        msgs = ((InternalEObject)newExpressionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE, null, msgs);
      msgs = basicSetExpressionType(newExpressionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE, newExpressionType, newExpressionType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT, newRight, newRight));
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
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE:
        return basicSetExpressionType(null, msgs);
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT:
        return basicSetRight(null, msgs);
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
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME:
        return getName();
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE:
        return getExpressionType();
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__OP:
        return getOp();
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT:
        return getRight();
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
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME:
        setName((String)newValue);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE:
        setExpressionType((ExpressionType)newValue);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__OP:
        setOp((String)newValue);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT:
        setRight((Expression)newValue);
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
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE:
        setExpressionType((ExpressionType)null);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__OP:
        setOp(OP_EDEFAULT);
        return;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT:
        setRight((Expression)null);
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
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__EXPRESSION_TYPE:
        return expressionType != null;
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == VariableDeclaration.class)
    {
      switch (derivedFeatureID)
      {
        case TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME: return TypesystemPackage.VARIABLE_DECLARATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypingStatementExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ArrayIndex.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == VariableDeclaration.class)
    {
      switch (baseFeatureID)
      {
        case TypesystemPackage.VARIABLE_DECLARATION__NAME: return TypesystemPackage.VARIABLE_DECLARATION_WITH_TYPE__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypingStatementExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ArrayIndex.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationWithTypeImpl
