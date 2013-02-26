/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.Assert#getActual <em>Actual</em>}</li>
 *   <li>{@link expr.exprDemo.Assert#getExpected <em>Expected</em>}</li>
 *   <li>{@link expr.exprDemo.Assert#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends Element
{
  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference.
   * @see #setActual(Expr)
   * @see expr.exprDemo.ExprDemoPackage#getAssert_Actual()
   * @model containment="true"
   * @generated
   */
  Expr getActual();

  /**
   * Sets the value of the '{@link expr.exprDemo.Assert#getActual <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' containment reference.
   * @see #getActual()
   * @generated
   */
  void setActual(Expr value);

  /**
   * Returns the value of the '<em><b>Expected</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected</em>' containment reference.
   * @see #setExpected(Expr)
   * @see expr.exprDemo.ExprDemoPackage#getAssert_Expected()
   * @model containment="true"
   * @generated
   */
  Expr getExpected();

  /**
   * Sets the value of the '{@link expr.exprDemo.Assert#getExpected <em>Expected</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected</em>' containment reference.
   * @see #getExpected()
   * @generated
   */
  void setExpected(Expr value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference.
   * @see #setMsg(Expr)
   * @see expr.exprDemo.ExprDemoPackage#getAssert_Msg()
   * @model containment="true"
   * @generated
   */
  Expr getMsg();

  /**
   * Sets the value of the '{@link expr.exprDemo.Assert#getMsg <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' containment reference.
   * @see #getMsg()
   * @generated
   */
  void setMsg(Expr value);

} // Assert
