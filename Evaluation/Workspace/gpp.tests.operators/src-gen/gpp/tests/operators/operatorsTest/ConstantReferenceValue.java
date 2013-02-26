/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.ConstantReferenceValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getConstantReferenceValue()
 * @model
 * @generated
 */
public interface ConstantReferenceValue extends ParameterApplicationValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Constant)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getConstantReferenceValue_Value()
   * @model
   * @generated
   */
  Constant getValue();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.ConstantReferenceValue#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Constant value);

} // ConstantReferenceValue
