/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.CastTo#getType <em>Type</em>}</li>
 *   <li>{@link it.xtypes.typesystem.CastTo#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getCastTo()
 * @model
 * @generated
 */
public interface CastTo extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ExpressionType)
   * @see it.xtypes.typesystem.TypesystemPackage#getCastTo_Type()
   * @model containment="true"
   * @generated
   */
  ExpressionType getType();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CastTo#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ExpressionType value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see it.xtypes.typesystem.TypesystemPackage#getCastTo_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CastTo#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // CastTo
