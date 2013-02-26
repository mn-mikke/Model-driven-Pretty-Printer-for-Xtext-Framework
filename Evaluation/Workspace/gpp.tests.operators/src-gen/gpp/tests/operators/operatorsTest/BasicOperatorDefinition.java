/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBasicOperatorDefinition()
 * @model
 * @generated
 */
public interface BasicOperatorDefinition extends OperatorDefinition
{
  /**
   * Returns the value of the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' attribute.
   * @see #setImplementation(String)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBasicOperatorDefinition_Implementation()
   * @model
   * @generated
   */
  String getImplementation();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.BasicOperatorDefinition#getImplementation <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' attribute.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.ParameterDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBasicOperatorDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDefinition> getParameters();

} // BasicOperatorDefinition
