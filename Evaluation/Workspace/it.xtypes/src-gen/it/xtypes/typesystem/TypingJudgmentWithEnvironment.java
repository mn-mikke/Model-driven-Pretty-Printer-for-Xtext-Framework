/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typing Judgment With Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypejudgmentsymbol <em>Typejudgmentsymbol</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypingstatement <em>Typingstatement</em>}</li>
 *   <li>{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getTypingJudgmentWithEnvironment()
 * @model
 * @generated
 */
public interface TypingJudgmentWithEnvironment extends TypingJudgment
{
  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference.
   * @see #setEnvironment(Environment)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypingJudgmentWithEnvironment_Environment()
   * @model containment="true"
   * @generated
   */
  Environment getEnvironment();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getEnvironment <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment</em>' containment reference.
   * @see #getEnvironment()
   * @generated
   */
  void setEnvironment(Environment value);

  /**
   * Returns the value of the '<em><b>Typejudgmentsymbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typejudgmentsymbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typejudgmentsymbol</em>' attribute.
   * @see #setTypejudgmentsymbol(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypingJudgmentWithEnvironment_Typejudgmentsymbol()
   * @model
   * @generated
   */
  String getTypejudgmentsymbol();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypejudgmentsymbol <em>Typejudgmentsymbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typejudgmentsymbol</em>' attribute.
   * @see #getTypejudgmentsymbol()
   * @generated
   */
  void setTypejudgmentsymbol(String value);

  /**
   * Returns the value of the '<em><b>Typingstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typingstatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typingstatement</em>' containment reference.
   * @see #setTypingstatement(TypingStatement)
   * @see it.xtypes.typesystem.TypesystemPackage#getTypingJudgmentWithEnvironment_Typingstatement()
   * @model containment="true"
   * @generated
   */
  TypingStatement getTypingstatement();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getTypingstatement <em>Typingstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typingstatement</em>' containment reference.
   * @see #getTypingstatement()
   * @generated
   */
  void setTypingstatement(TypingStatement value);

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
   * @see it.xtypes.typesystem.TypesystemPackage#getTypingJudgmentWithEnvironment_Error()
   * @model containment="true"
   * @generated
   */
  ErrorSpecification getError();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.TypingJudgmentWithEnvironment#getError <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' containment reference.
   * @see #getError()
   * @generated
   */
  void setError(ErrorSpecification value);

} // TypingJudgmentWithEnvironment
