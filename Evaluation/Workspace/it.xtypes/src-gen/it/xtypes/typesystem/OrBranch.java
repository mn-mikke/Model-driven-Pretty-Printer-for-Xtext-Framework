/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.OrBranch#getJudgments <em>Judgments</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getOrBranch()
 * @model
 * @generated
 */
public interface OrBranch extends EObject
{
  /**
   * Returns the value of the '<em><b>Judgments</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.TypingJudgment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Judgments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Judgments</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getOrBranch_Judgments()
   * @model containment="true"
   * @generated
   */
  EList<TypingJudgment> getJudgments();

} // OrBranch
