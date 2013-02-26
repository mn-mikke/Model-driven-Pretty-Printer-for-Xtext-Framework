/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.RuleWithPremises;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule With Premises</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.RuleWithPremisesImpl#getPremises <em>Premises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleWithPremisesImpl extends RuleImpl implements RuleWithPremises
{
  /**
   * The cached value of the '{@link #getPremises() <em>Premises</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPremises()
   * @generated
   * @ordered
   */
  protected EList<TypingJudgment> premises;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleWithPremisesImpl()
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
    return TypesystemPackage.Literals.RULE_WITH_PREMISES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypingJudgment> getPremises()
  {
    if (premises == null)
    {
      premises = new EObjectContainmentEList<TypingJudgment>(TypingJudgment.class, this, TypesystemPackage.RULE_WITH_PREMISES__PREMISES);
    }
    return premises;
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
      case TypesystemPackage.RULE_WITH_PREMISES__PREMISES:
        return ((InternalEList<?>)getPremises()).basicRemove(otherEnd, msgs);
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
      case TypesystemPackage.RULE_WITH_PREMISES__PREMISES:
        return getPremises();
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
      case TypesystemPackage.RULE_WITH_PREMISES__PREMISES:
        getPremises().clear();
        getPremises().addAll((Collection<? extends TypingJudgment>)newValue);
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
      case TypesystemPackage.RULE_WITH_PREMISES__PREMISES:
        getPremises().clear();
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
      case TypesystemPackage.RULE_WITH_PREMISES__PREMISES:
        return premises != null && !premises.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleWithPremisesImpl
