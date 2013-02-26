/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.ParameterApplication#getReferencedParameter <em>Referenced Parameter</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.ParameterApplication#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getParameterApplication()
 * @model
 * @generated
 */
public interface ParameterApplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Referenced Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Parameter</em>' reference.
   * @see #setReferencedParameter(ParameterDefinition)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getParameterApplication_ReferencedParameter()
   * @model
   * @generated
   */
  ParameterDefinition getReferencedParameter();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.ParameterApplication#getReferencedParameter <em>Referenced Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Parameter</em>' reference.
   * @see #getReferencedParameter()
   * @generated
   */
  void setReferencedParameter(ParameterDefinition value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ParameterApplicationValue)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getParameterApplication_Value()
   * @model containment="true"
   * @generated
   */
  ParameterApplicationValue getValue();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.ParameterApplication#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ParameterApplicationValue value);

} // ParameterApplication
