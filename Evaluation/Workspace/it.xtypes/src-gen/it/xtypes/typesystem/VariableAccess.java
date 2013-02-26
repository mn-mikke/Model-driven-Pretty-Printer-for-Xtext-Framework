/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.VariableAccess#getVarRef <em>Var Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getVariableAccess()
 * @model
 * @generated
 */
public interface VariableAccess extends Expression
{
  /**
   * Returns the value of the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Ref</em>' reference.
   * @see #setVarRef(VariableDeclaration)
   * @see it.xtypes.typesystem.TypesystemPackage#getVariableAccess_VarRef()
   * @model
   * @generated
   */
  VariableDeclaration getVarRef();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.VariableAccess#getVarRef <em>Var Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Ref</em>' reference.
   * @see #getVarRef()
   * @generated
   */
  void setVarRef(VariableDeclaration value);

} // VariableAccess
