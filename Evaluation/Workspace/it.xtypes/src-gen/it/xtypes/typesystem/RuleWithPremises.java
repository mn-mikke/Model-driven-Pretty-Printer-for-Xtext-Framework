/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule With Premises</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.RuleWithPremises#getPremises <em>Premises</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getRuleWithPremises()
 * @model
 * @generated
 */
public interface RuleWithPremises extends Rule
{
  /**
   * Returns the value of the '<em><b>Premises</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.TypingJudgment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Premises</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Premises</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getRuleWithPremises_Premises()
   * @model containment="true"
   * @generated
   */
  EList<TypingJudgment> getPremises();

} // RuleWithPremises
