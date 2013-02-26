/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getOperator <em>Operator</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getAliasOperatorDefinition()
 * @model
 * @generated
 */
public interface AliasOperatorDefinition extends OperatorDefinition
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' reference.
   * @see #setOperator(OperatorDefinition)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getAliasOperatorDefinition_Operator()
   * @model
   * @generated
   */
  OperatorDefinition getOperator();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.AliasOperatorDefinition#getOperator <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(OperatorDefinition value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.ParameterApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getAliasOperatorDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParameterApplication> getParameters();

} // AliasOperatorDefinition
