/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.Expression;
import it.xtypes.typesystem.Quantification;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgment;
import it.xtypes.typesystem.VariableSimpleDeclaration;

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
 * An implementation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.QuantificationImpl#getError <em>Error</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.QuantificationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.QuantificationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.QuantificationImpl#getJudgments <em>Judgments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantificationImpl extends TypingJudgmentImpl implements Quantification
{
  /**
   * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError()
   * @generated
   * @ordered
   */
  protected ErrorSpecification error;

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
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableSimpleDeclaration variable;

  /**
   * The cached value of the '{@link #getJudgments() <em>Judgments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgments()
   * @generated
   * @ordered
   */
  protected EList<TypingJudgment> judgments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantificationImpl()
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
    return TypesystemPackage.Literals.QUANTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorSpecification getError()
  {
    return error;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetError(ErrorSpecification newError, NotificationChain msgs)
  {
    ErrorSpecification oldError = error;
    error = newError;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__ERROR, oldError, newError);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setError(ErrorSpecification newError)
  {
    if (newError != error)
    {
      NotificationChain msgs = null;
      if (error != null)
        msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__ERROR, null, msgs);
      if (newError != null)
        msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__ERROR, null, msgs);
      msgs = basicSetError(newError, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__ERROR, newError, newError));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableSimpleDeclaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VariableSimpleDeclaration newVariable, NotificationChain msgs)
  {
    VariableSimpleDeclaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableSimpleDeclaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.QUANTIFICATION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.QUANTIFICATION__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypingJudgment> getJudgments()
  {
    if (judgments == null)
    {
      judgments = new EObjectContainmentEList<TypingJudgment>(TypingJudgment.class, this, TypesystemPackage.QUANTIFICATION__JUDGMENTS);
    }
    return judgments;
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
      case TypesystemPackage.QUANTIFICATION__ERROR:
        return basicSetError(null, msgs);
      case TypesystemPackage.QUANTIFICATION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case TypesystemPackage.QUANTIFICATION__VARIABLE:
        return basicSetVariable(null, msgs);
      case TypesystemPackage.QUANTIFICATION__JUDGMENTS:
        return ((InternalEList<?>)getJudgments()).basicRemove(otherEnd, msgs);
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
      case TypesystemPackage.QUANTIFICATION__ERROR:
        return getError();
      case TypesystemPackage.QUANTIFICATION__EXPRESSION:
        return getExpression();
      case TypesystemPackage.QUANTIFICATION__VARIABLE:
        return getVariable();
      case TypesystemPackage.QUANTIFICATION__JUDGMENTS:
        return getJudgments();
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
      case TypesystemPackage.QUANTIFICATION__ERROR:
        setError((ErrorSpecification)newValue);
        return;
      case TypesystemPackage.QUANTIFICATION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case TypesystemPackage.QUANTIFICATION__VARIABLE:
        setVariable((VariableSimpleDeclaration)newValue);
        return;
      case TypesystemPackage.QUANTIFICATION__JUDGMENTS:
        getJudgments().clear();
        getJudgments().addAll((Collection<? extends TypingJudgment>)newValue);
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
      case TypesystemPackage.QUANTIFICATION__ERROR:
        setError((ErrorSpecification)null);
        return;
      case TypesystemPackage.QUANTIFICATION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case TypesystemPackage.QUANTIFICATION__VARIABLE:
        setVariable((VariableSimpleDeclaration)null);
        return;
      case TypesystemPackage.QUANTIFICATION__JUDGMENTS:
        getJudgments().clear();
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
      case TypesystemPackage.QUANTIFICATION__ERROR:
        return error != null;
      case TypesystemPackage.QUANTIFICATION__EXPRESSION:
        return expression != null;
      case TypesystemPackage.QUANTIFICATION__VARIABLE:
        return variable != null;
      case TypesystemPackage.QUANTIFICATION__JUDGMENTS:
        return judgments != null && !judgments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QuantificationImpl
