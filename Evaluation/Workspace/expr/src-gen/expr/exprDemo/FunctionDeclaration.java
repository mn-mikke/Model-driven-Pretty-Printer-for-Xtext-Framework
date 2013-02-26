/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.FunctionDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link expr.exprDemo.FunctionDeclaration#getParams <em>Params</em>}</li>
 *   <li>{@link expr.exprDemo.FunctionDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Symbol
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
   * @see #setType(Type)
   * @see expr.exprDemo.ExprDemoPackage#getFunctionDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link expr.exprDemo.FunctionDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getFunctionDeclaration_Params()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getParams();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getFunctionDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // FunctionDeclaration
