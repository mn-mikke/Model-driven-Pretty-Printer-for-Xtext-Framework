/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.SymbolRef#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link expr.exprDemo.SymbolRef#getActuals <em>Actuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getSymbolRef()
 * @model
 * @generated
 */
public interface SymbolRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' reference.
   * @see #setSymbol(Symbol)
   * @see expr.exprDemo.ExprDemoPackage#getSymbolRef_Symbol()
   * @model
   * @generated
   */
  Symbol getSymbol();

  /**
   * Sets the value of the '{@link expr.exprDemo.SymbolRef#getSymbol <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(Symbol value);

  /**
   * Returns the value of the '<em><b>Actuals</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuals</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getSymbolRef_Actuals()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getActuals();

} // SymbolRef
