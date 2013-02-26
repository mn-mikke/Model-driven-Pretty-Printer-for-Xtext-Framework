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
 * A representation of the model object '<em><b>Box Model Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getImports <em>Imports</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getOperatorDefinitions <em>Operator Definitions</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getIntConstants <em>Int Constants</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.BoxModelOperators#getStringConstants <em>String Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators()
 * @model
 * @generated
 */
public interface BoxModelOperators extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Operator Definitions</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.OperatorDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator Definitions</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators_OperatorDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<OperatorDefinition> getOperatorDefinitions();

  /**
   * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.GlobalEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerations</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators_Enumerations()
   * @model containment="true"
   * @generated
   */
  EList<GlobalEnum> getEnumerations();

  /**
   * Returns the value of the '<em><b>Int Constants</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.IntConstant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Constants</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators_IntConstants()
   * @model containment="true"
   * @generated
   */
  EList<IntConstant> getIntConstants();

  /**
   * Returns the value of the '<em><b>String Constants</b></em>' containment reference list.
   * The list contents are of type {@link gpp.tests.operators.operatorsTest.StringConstant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Constants</em>' containment reference list.
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getBoxModelOperators_StringConstants()
   * @model containment="true"
   * @generated
   */
  EList<StringConstant> getStringConstants();

} // BoxModelOperators
