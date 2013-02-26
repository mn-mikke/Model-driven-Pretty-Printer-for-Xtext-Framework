/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.CompoundExpression#getMainExpression <em>Main Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.CompoundExpression#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.CompoundExpression#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getCompoundExpression()
 * @model
 * @generated
 */
public interface CompoundExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Main Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Expression</em>' containment reference.
   * @see #setMainExpression(Expression)
   * @see it.xtypes.typesystem.TypesystemPackage#getCompoundExpression_MainExpression()
   * @model containment="true"
   * @generated
   */
  Expression getMainExpression();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CompoundExpression#getMainExpression <em>Main Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Expression</em>' containment reference.
   * @see #getMainExpression()
   * @generated
   */
  void setMainExpression(Expression value);

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
   * @see it.xtypes.typesystem.TypesystemPackage#getCompoundExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CompoundExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Expression</em>' containment reference.
   * @see #setSubExpression(SubExpression)
   * @see it.xtypes.typesystem.TypesystemPackage#getCompoundExpression_SubExpression()
   * @model containment="true"
   * @generated
   */
  SubExpression getSubExpression();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CompoundExpression#getSubExpression <em>Sub Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Expression</em>' containment reference.
   * @see #getSubExpression()
   * @generated
   */
  void setSubExpression(SubExpression value);

} // CompoundExpression
