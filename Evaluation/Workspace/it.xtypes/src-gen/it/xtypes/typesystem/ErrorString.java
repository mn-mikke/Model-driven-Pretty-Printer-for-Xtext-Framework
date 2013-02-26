/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.ErrorString#getErrString <em>Err String</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getErrorString()
 * @model
 * @generated
 */
public interface ErrorString extends FailureError
{
  /**
   * Returns the value of the '<em><b>Err String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Err String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Err String</em>' attribute.
   * @see #setErrString(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getErrorString_ErrString()
   * @model
   * @generated
   */
  String getErrString();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.ErrorString#getErrString <em>Err String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Err String</em>' attribute.
   * @see #getErrString()
   * @generated
   */
  void setErrString(String value);

} // ErrorString
