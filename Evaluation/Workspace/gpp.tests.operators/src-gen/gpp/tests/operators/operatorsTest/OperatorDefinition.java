/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.OperatorDefinition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getOperatorDefinition()
 * @model
 * @generated
 */
public interface OperatorDefinition extends EObject
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
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getOperatorDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.OperatorDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // OperatorDefinition
