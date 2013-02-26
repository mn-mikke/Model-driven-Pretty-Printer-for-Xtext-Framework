/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Typing Judgment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.OrTypingJudgment#getBranches <em>Branches</em>}</li>
 *   <li>{@link it.xtypes.typesystem.OrTypingJudgment#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getOrTypingJudgment()
 * @model
 * @generated
 */
public interface OrTypingJudgment extends TypingJudgment
{
  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.OrBranch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getOrTypingJudgment_Branches()
   * @model containment="true"
   * @generated
   */
  EList<OrBranch> getBranches();

  /**
   * Returns the value of the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error</em>' containment reference.
   * @see #setError(ErrorSpecification)
   * @see it.xtypes.typesystem.TypesystemPackage#getOrTypingJudgment_Error()
   * @model containment="true"
   * @generated
   */
  ErrorSpecification getError();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.OrTypingJudgment#getError <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' containment reference.
   * @see #getError()
   * @generated
   */
  void setError(ErrorSpecification value);

} // OrTypingJudgment
