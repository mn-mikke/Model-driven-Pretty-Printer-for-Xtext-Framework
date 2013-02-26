/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.GetAll#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.GetAll#getMainfeature <em>Mainfeature</em>}</li>
 *   <li>{@link it.xtypes.typesystem.GetAll#getExtendfeature <em>Extendfeature</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getGetAll()
 * @model
 * @generated
 */
public interface GetAll extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see it.xtypes.typesystem.TypesystemPackage#getGetAll_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.GetAll#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Mainfeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainfeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainfeature</em>' reference.
   * @see #setMainfeature(EStructuralFeature)
   * @see it.xtypes.typesystem.TypesystemPackage#getGetAll_Mainfeature()
   * @model
   * @generated
   */
  EStructuralFeature getMainfeature();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.GetAll#getMainfeature <em>Mainfeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mainfeature</em>' reference.
   * @see #getMainfeature()
   * @generated
   */
  void setMainfeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Extendfeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extendfeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extendfeature</em>' reference.
   * @see #setExtendfeature(EStructuralFeature)
   * @see it.xtypes.typesystem.TypesystemPackage#getGetAll_Extendfeature()
   * @model
   * @generated
   */
  EStructuralFeature getExtendfeature();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.GetAll#getExtendfeature <em>Extendfeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extendfeature</em>' reference.
   * @see #getExtendfeature()
   * @generated
   */
  void setExtendfeature(EStructuralFeature value);

} // GetAll
