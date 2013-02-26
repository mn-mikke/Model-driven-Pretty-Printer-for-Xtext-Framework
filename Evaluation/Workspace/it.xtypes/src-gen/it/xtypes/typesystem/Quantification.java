/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.Quantification#getError <em>Error</em>}</li>
 *   <li>{@link it.xtypes.typesystem.Quantification#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.xtypes.typesystem.Quantification#getVariable <em>Variable</em>}</li>
 *   <li>{@link it.xtypes.typesystem.Quantification#getJudgments <em>Judgments</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getQuantification()
 * @model
 * @generated
 */
public interface Quantification extends TypingJudgment
{
  /**
   * Returns the value of the '<em><b>Error</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error</em>' containment reference.
   * @see #setError(ErrorSpecification)
   * @see it.xtypes.typesystem.TypesystemPackage#getQuantification_Error()
   * @model containment="true"
   * @generated
   */
  ErrorSpecification getError();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Quantification#getError <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' containment reference.
   * @see #getError()
   * @generated
   */
  void setError(ErrorSpecification value);

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
   * @see it.xtypes.typesystem.TypesystemPackage#getQuantification_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Quantification#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableSimpleDeclaration)
   * @see it.xtypes.typesystem.TypesystemPackage#getQuantification_Variable()
   * @model containment="true"
   * @generated
   */
  VariableSimpleDeclaration getVariable();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.Quantification#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableSimpleDeclaration value);

  /**
   * Returns the value of the '<em><b>Judgments</b></em>' containment reference list.
   * The list contents are of type {@link it.xtypes.typesystem.TypingJudgment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Judgments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Judgments</em>' containment reference list.
   * @see it.xtypes.typesystem.TypesystemPackage#getQuantification_Judgments()
   * @model containment="true"
   * @generated
   */
  EList<TypingJudgment> getJudgments();

} // Quantification
