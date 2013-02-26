/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.OrBranch;
import it.xtypes.typesystem.OrTypingJudgment;
import it.xtypes.typesystem.TypesystemPackage;

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
 * An implementation of the model object '<em><b>Or Typing Judgment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.OrTypingJudgmentImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.OrTypingJudgmentImpl#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrTypingJudgmentImpl extends TypingJudgmentImpl implements OrTypingJudgment
{
  /**
   * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranches()
   * @generated
   * @ordered
   */
  protected EList<OrBranch> branches;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrTypingJudgmentImpl()
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
    return TypesystemPackage.Literals.OR_TYPING_JUDGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrBranch> getBranches()
  {
    if (branches == null)
    {
      branches = new EObjectContainmentEList<OrBranch>(OrBranch.class, this, TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES);
    }
    return branches;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.OR_TYPING_JUDGMENT__ERROR, oldError, newError);
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
        msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.OR_TYPING_JUDGMENT__ERROR, null, msgs);
      if (newError != null)
        msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.OR_TYPING_JUDGMENT__ERROR, null, msgs);
      msgs = basicSetError(newError, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.OR_TYPING_JUDGMENT__ERROR, newError, newError));
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
      case TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES:
        return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
      case TypesystemPackage.OR_TYPING_JUDGMENT__ERROR:
        return basicSetError(null, msgs);
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
      case TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES:
        return getBranches();
      case TypesystemPackage.OR_TYPING_JUDGMENT__ERROR:
        return getError();
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
      case TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES:
        getBranches().clear();
        getBranches().addAll((Collection<? extends OrBranch>)newValue);
        return;
      case TypesystemPackage.OR_TYPING_JUDGMENT__ERROR:
        setError((ErrorSpecification)newValue);
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
      case TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES:
        getBranches().clear();
        return;
      case TypesystemPackage.OR_TYPING_JUDGMENT__ERROR:
        setError((ErrorSpecification)null);
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
      case TypesystemPackage.OR_TYPING_JUDGMENT__BRANCHES:
        return branches != null && !branches.isEmpty();
      case TypesystemPackage.OR_TYPING_JUDGMENT__ERROR:
        return error != null;
    }
    return super.eIsSet(featureID);
  }

} //OrTypingJudgmentImpl
