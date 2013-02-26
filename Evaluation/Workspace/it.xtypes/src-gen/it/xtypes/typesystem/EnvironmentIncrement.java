/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Increment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EnvironmentIncrement#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentIncrement()
 * @model
 * @generated
 */
public interface EnvironmentIncrement extends EnvironmentOperation
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EnvironmentStatement)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentIncrement_Right()
   * @model containment="true"
   * @generated
   */
  EnvironmentStatement getRight();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentIncrement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EnvironmentStatement value);

} // EnvironmentIncrement
