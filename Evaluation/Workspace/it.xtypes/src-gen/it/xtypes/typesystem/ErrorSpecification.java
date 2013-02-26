/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.ErrorSpecification#getFailureError <em>Failure Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getErrorSpecification()
 * @model
 * @generated
 */
public interface ErrorSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Failure Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Failure Error</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Failure Error</em>' containment reference.
   * @see #setFailureError(FailureError)
   * @see it.xtypes.typesystem.TypesystemPackage#getErrorSpecification_FailureError()
   * @model containment="true"
   * @generated
   */
  FailureError getFailureError();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.ErrorSpecification#getFailureError <em>Failure Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Failure Error</em>' containment reference.
   * @see #getFailureError()
   * @generated
   */
  void setFailureError(FailureError value);

} // ErrorSpecification
