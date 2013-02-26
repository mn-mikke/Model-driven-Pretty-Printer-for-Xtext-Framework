/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EnvironmentStatement#getLeft <em>Left</em>}</li>
 *   <li>{@link it.xtypes.typesystem.EnvironmentStatement#getRelation <em>Relation</em>}</li>
 *   <li>{@link it.xtypes.typesystem.EnvironmentStatement#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentStatement()
 * @model
 * @generated
 */
public interface EnvironmentStatement extends Environment
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
   * @see #setLeft(TypingStatementExpression)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentStatement_Left()
   * @model containment="true"
   * @generated
   */
  TypingStatementExpression getLeft();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentStatement#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TypingStatementExpression value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute.
   * @see #setRelation(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentStatement_Relation()
   * @model
   * @generated
   */
  String getRelation();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentStatement#getRelation <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' attribute.
   * @see #getRelation()
   * @generated
   */
  void setRelation(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(TypingStatementExpression)
   * @see it.xtypes.typesystem.TypesystemPackage#getEnvironmentStatement_Right()
   * @model containment="true"
   * @generated
   */
  TypingStatementExpression getRight();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EnvironmentStatement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(TypingStatementExpression value);

} // EnvironmentStatement
