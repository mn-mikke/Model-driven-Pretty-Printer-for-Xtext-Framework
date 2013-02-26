/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration With Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.VariableDeclarationWithType#getExpressionType <em>Expression Type</em>}</li>
 *   <li>{@link it.xtypes.typesystem.VariableDeclarationWithType#getOp <em>Op</em>}</li>
 *   <li>{@link it.xtypes.typesystem.VariableDeclarationWithType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getVariableDeclarationWithType()
 * @model
 * @generated
 */
public interface VariableDeclarationWithType extends TypingJudgment, VariableDeclaration, Expression
{
  /**
   * Returns the value of the '<em><b>Expression Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Type</em>' containment reference.
   * @see #setExpressionType(ExpressionType)
   * @see it.xtypes.typesystem.TypesystemPackage#getVariableDeclarationWithType_ExpressionType()
   * @model containment="true"
   * @generated
   */
  ExpressionType getExpressionType();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.VariableDeclarationWithType#getExpressionType <em>Expression Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Type</em>' containment reference.
   * @see #getExpressionType()
   * @generated
   */
  void setExpressionType(ExpressionType value);

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
   * @see it.xtypes.typesystem.TypesystemPackage#getVariableDeclarationWithType_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.VariableDeclarationWithType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see it.xtypes.typesystem.TypesystemPackage#getVariableDeclarationWithType_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.VariableDeclarationWithType#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // VariableDeclarationWithType
