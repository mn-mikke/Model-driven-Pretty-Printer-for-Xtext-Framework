/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.NewName#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getNewName()
 * @model
 * @generated
 */
public interface NewName extends Expression
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute.
   * @see #setArgument(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getNewName_Argument()
   * @model
   * @generated
   */
  String getArgument();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.NewName#getArgument <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' attribute.
   * @see #getArgument()
   * @generated
   */
  void setArgument(String value);

} // NewName
