/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getEnumParameterDefinition()
 * @model
 * @generated
 */
public interface EnumParameterDefinition extends ParameterDefinition
{
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
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getEnumParameterDefinition_Alternatives()
   * @model containment="true"
   * @generated
   */
  EList<EnumAlternative> getAlternatives();

  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' reference.
   * @see #setEnumeration(GlobalEnum)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getEnumParameterDefinition_Enumeration()
   * @model
   * @generated
   */
  GlobalEnum getEnumeration();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getEnumeration <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(GlobalEnum value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EnumAlternative)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getEnumParameterDefinition_Value()
   * @model
   * @generated
   */
  EnumAlternative getValue();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.EnumParameterDefinition#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EnumAlternative value);

} // EnumParameterDefinition
