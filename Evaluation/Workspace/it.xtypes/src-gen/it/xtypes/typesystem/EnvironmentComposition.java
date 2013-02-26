/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EnvironmentComposition#getCurrentEnvironment <em>Current Environment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.EnvironmentComposition#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.EnvironmentComposition#getSubEnvironment <em>Sub Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentComposition()
 * @model
 * @generated
 */
public interface EnvironmentComposition extends Environment
{
  /**
   * Returns the value of the '<em><b>Current Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Environment</em>' containment reference.
   * @see #setCurrentEnvironment(Environment)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentComposition_CurrentEnvironment()
   * @model containment="true"
   * @generated
   */
  Environment getCurrentEnvironment();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentComposition#getCurrentEnvironment <em>Current Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Environment</em>' containment reference.
   * @see #getCurrentEnvironment()
   * @generated
   */
  void setCurrentEnvironment(Environment value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentComposition_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentComposition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Sub Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Environment</em>' containment reference.
   * @see #setSubEnvironment(Environment)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentComposition_SubEnvironment()
   * @model containment="true"
   * @generated
   */
  Environment getSubEnvironment();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentComposition#getSubEnvironment <em>Sub Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Environment</em>' containment reference.
   * @see #getSubEnvironment()
   * @generated
   */
  void setSubEnvironment(Environment value);

} // EnvironmentComposition
