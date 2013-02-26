/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link expr.exprDemo.Model#isIsTested <em>Is Tested</em>}</li>
 *   <li>{@link expr.exprDemo.Model#getName <em>Name</em>}</li>
 *   <li>{@link expr.exprDemo.Model#getUsings <em>Usings</em>}</li>
 *   <li>{@link expr.exprDemo.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link expr.exprDemo.Model#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see expr.exprDemo.ExprDemoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Tested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Tested</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Tested</em>' attribute.
   * @see #setIsTested(boolean)
   * @see expr.exprDemo.ExprDemoPackage#getModel_IsTested()
   * @model
   * @generated
   */
  boolean isIsTested();

  /**
   * Sets the value of the '{@link expr.exprDemo.Model#isIsTested <em>Is Tested</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Tested</em>' attribute.
   * @see #isIsTested()
   * @generated
   */
  void setIsTested(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see expr.exprDemo.ExprDemoPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link expr.exprDemo.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Using}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getModel_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using> getUsings();

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
   * @see expr.exprDemo.ExprDemoPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link expr.exprDemo.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see expr.exprDemo.ExprDemoPackage#getModel_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getFunctions();

} // Model
