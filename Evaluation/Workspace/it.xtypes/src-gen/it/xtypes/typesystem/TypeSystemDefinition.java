/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type System Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getName <em>Name</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getJudgmentDescriptions <em>Judgment Descriptions</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getRules <em>Rules</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackageURI <em>EPackage URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition()
 * @model
 * @generated
 */
public interface TypeSystemDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypeSystemDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>EPackage</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EPackage</em>' reference.
   * @see #setEPackage(EPackage)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_EPackage()
   * @model
   * @generated
   */
  EPackage getEPackage();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackage <em>EPackage</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EPackage</em>' reference.
   * @see #getEPackage()
   * @generated
   */
  void setEPackage(EPackage value);

  /**
   * Returns the value of the '<em><b>Gen Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Model</em>' attribute.
   * @see #setGenModel(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_GenModel()
   * @model
   * @generated
   */
  String getGenModel();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypeSystemDefinition#getGenModel <em>Gen Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Model</em>' attribute.
   * @see #getGenModel()
   * @generated
   */
  void setGenModel(String value);

  /**
   * Returns the value of the '<em><b>Judgment Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.JudgmentDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Judgment Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Judgment Descriptions</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_JudgmentDescriptions()
   * @model containment="true"
   * @generated
   */
  EList<JudgmentDescription> getJudgmentDescriptions();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.Rule}.
   * It is bidirectional and its opposite is '{@link it.xtypes.typesystem.Rule#getContainingTypeSystem <em>Containing Type System</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_Rules()
   * @see it.xtypes.typesystem.Rule#getContainingTypeSystem
   * @model opposite="containingTypeSystem" containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>EPackage URI</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EPackage URI</em>' attribute.
   * @see #setEPackageURI(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypeSystemDefinition_EPackageURI()
   * @model default="" transient="true"
   * @generated
   */
  String getEPackageURI();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypeSystemDefinition#getEPackageURI <em>EPackage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EPackage URI</em>' attribute.
   * @see #getEPackageURI()
   * @generated
   */
  void setEPackageURI(String value);

} // TypeSystemDefinition
