/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EnvironmentOperation#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentOperation()
 * @model
 * @generated
 */
public interface EnvironmentOperation extends StandardOperation
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EnvironmentId)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentOperation_Left()
   * @model containment="true"
   * @generated
   */
  EnvironmentId getLeft();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentOperation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EnvironmentId value);

} // EnvironmentOperation
