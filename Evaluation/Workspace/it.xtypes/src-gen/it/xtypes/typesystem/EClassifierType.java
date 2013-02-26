/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.EClassifierType#getEclassifier <em>Eclassifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getEClassifierType()
 * @model
 * @generated
 */
public interface EClassifierType extends ExpressionType
{
  /**
   * Returns the value of the '<em><b>Eclassifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eclassifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eclassifier</em>' reference.
   * @see #setEclassifier(EClassifier)
   * @see it.xtypes.typesystem.TypesystemPackage#getEClassifierType_Eclassifier()
   * @model
   * @generated
   */
  EClassifier getEclassifier();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.EClassifierType#getEclassifier <em>Eclassifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eclassifier</em>' reference.
   * @see #getEclassifier()
   * @generated
   */
  void setEclassifier(EClassifier value);

} // EClassifierType
