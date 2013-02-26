/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EnvironmentAccess#getEnvId <em>Env Id</em>}</li>
 *   <li>{@link it.xtypes.typesystem.EnvironmentAccess#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentAccess()
 * @model
 * @generated
 */
public interface EnvironmentAccess extends Expression
{
  /**
   * Returns the value of the '<em><b>Env Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env Id</em>' containment reference.
   * @see #setEnvId(EnvironmentId)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentAccess_EnvId()
   * @model containment="true"
   * @generated
   */
  EnvironmentId getEnvId();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentAccess#getEnvId <em>Env Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Env Id</em>' containment reference.
   * @see #getEnvId()
   * @generated
   */
  void setEnvId(EnvironmentId value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentAccess_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentAccess#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

} // EnvironmentAccess
