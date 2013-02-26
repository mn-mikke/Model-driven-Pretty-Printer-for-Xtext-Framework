/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.GlobalEnum#getName <em>Name</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.GlobalEnum#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getGlobalEnum()
 * @model
 * @generated
 */
public interface GlobalEnum extends EObject
{
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
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getGlobalEnum_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.GlobalEnum#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.EnumAlternative}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternatives</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getGlobalEnum_Alternatives()
   * @model containment="true"
   * @generated
   */
  EList<EnumAlternative> getAlternatives();

} // GlobalEnum
