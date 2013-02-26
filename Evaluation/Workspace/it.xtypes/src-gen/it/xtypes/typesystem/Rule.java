/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.Rule#getName <em>Name</em>}</li>
 *   <li>{@link it.xtypes.typesystem.Rule#getTypejudgment <em>Typejudgment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.Rule#getContainingTypeSystem <em>Containing Type System</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
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
   * @see it.xtypes.typesystem.TypesystemPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Typejudgment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typejudgment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typejudgment</em>' containment reference.
   * @see #setTypejudgment(TypingJudgmentWithEnvironment)
   * @see it.xtypes.typesystem.TypesystemPackage#getRule_Typejudgment()
   * @model containment="true"
   * @generated
   */
  TypingJudgmentWithEnvironment getTypejudgment();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Rule#getTypejudgment <em>Typejudgment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typejudgment</em>' containment reference.
   * @see #getTypejudgment()
   * @generated
   */
  void setTypejudgment(TypingJudgmentWithEnvironment value);

  /**
   * Returns the value of the '<em><b>Containing Type System</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link it.xtypes.typesystem.TypeSystemDefinition#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containing Type System</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containing Type System</em>' container reference.
   * @see #setContainingTypeSystem(TypeSystemDefinition)
   * @see it.xtypes.typesystem.TypesystemPackage#getRule_ContainingTypeSystem()
   * @see it.xtypes.typesystem.TypeSystemDefinition#getRules
   * @model opposite="rules" transient="false"
   * @generated
   */
  TypeSystemDefinition getContainingTypeSystem();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Rule#getContainingTypeSystem <em>Containing Type System</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containing Type System</em>' container reference.
   * @see #getContainingTypeSystem()
   * @generated
   */
  void setContainingTypeSystem(TypeSystemDefinition value);

} // Rule
