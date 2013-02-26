/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.Environment;
import it.xtypes.typesystem.ErrorSpecification;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;
import it.xtypes.typesystem.TypingStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typing Judgment With Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl#getTypejudgmentsymbol <em>Typejudgmentsymbol</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl#getTypingstatement <em>Typingstatement</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypingJudgmentWithEnvironmentImpl#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypingJudgmentWithEnvironmentImpl extends TypingJudgmentImpl implements TypingJudgmentWithEnvironment
{
  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected Environment environment;

  /**
   * The default value of the '{@link #getTypejudgmentsymbol() <em>Typejudgmentsymbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypejudgmentsymbol()
   * @generated
   * @ordered
   */
  protected static final String TYPEJUDGMENTSYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypejudgmentsymbol() <em>Typejudgmentsymbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypejudgmentsymbol()
   * @generated
   * @ordered
   */
  protected String typejudgmentsymbol = TYPEJUDGMENTSYMBOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypingstatement() <em>Typingstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypingstatement()
   * @generated
   * @ordered
   */
  protected TypingStatement typingstatement;

  /**
   * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError()
   * @generated
   * @ordered
   */
  protected ErrorSpecification error;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypingJudgmentWithEnvironmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TypesystemPackage.Literals.TYPING_JUDGMENT_WITH_ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
    Environment oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT, oldEnvironment, newEnvironment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironment(Environment newEnvironment)
  {
    if (newEnvironment != environment)
    {
      NotificationChain msgs = null;
      if (environment != null)
        msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT, null, msgs);
      if (newEnvironment != null)
        msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT, null, msgs);
      msgs = basicSetEnvironment(newEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT, newEnvironment, newEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypejudgmentsymbol()
  {
    return typejudgmentsymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypejudgmentsymbol(String newTypejudgmentsymbol)
  {
    String oldTypejudgmentsymbol = typejudgmentsymbol;
    typejudgmentsymbol = newTypejudgmentsymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL, oldTypejudgmentsymbol, typejudgmentsymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingStatement getTypingstatement()
  {
    return typingstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypingstatement(TypingStatement newTypingstatement, NotificationChain msgs)
  {
    TypingStatement oldTypingstatement = typingstatement;
    typingstatement = newTypingstatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT, oldTypingstatement, newTypingstatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypingstatement(TypingStatement newTypingstatement)
  {
    if (newTypingstatement != typingstatement)
    {
      NotificationChain msgs = null;
      if (typingstatement != null)
        msgs = ((InternalEObject)typingstatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT, null, msgs);
      if (newTypingstatement != null)
        msgs = ((InternalEObject)newTypingstatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT, null, msgs);
      msgs = basicSetTypingstatement(newTypingstatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT, newTypingstatement, newTypingstatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorSpecification getError()
  {
    return error;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetError(ErrorSpecification newError, NotificationChain msgs)
  {
    ErrorSpecification oldError = error;
    error = newError;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR, oldError, newError);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setError(ErrorSpecification newError)
  {
    if (newError != error)
    {
      NotificationChain msgs = null;
      if (error != null)
        msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR, null, msgs);
      if (newError != null)
        msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR, null, msgs);
      msgs = basicSetError(newError, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR, newError, newError));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT:
        return basicSetEnvironment(null, msgs);
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT:
        return basicSetTypingstatement(null, msgs);
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR:
        return basicSetError(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT:
        return getEnvironment();
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL:
        return getTypejudgmentsymbol();
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT:
        return getTypingstatement();
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR:
        return getError();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT:
        setEnvironment((Environment)newValue);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL:
        setTypejudgmentsymbol((String)newValue);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT:
        setTypingstatement((TypingStatement)newValue);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR:
        setError((ErrorSpecification)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT:
        setEnvironment((Environment)null);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL:
        setTypejudgmentsymbol(TYPEJUDGMENTSYMBOL_EDEFAULT);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT:
        setTypingstatement((TypingStatement)null);
        return;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR:
        setError((ErrorSpecification)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ENVIRONMENT:
        return environment != null;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPEJUDGMENTSYMBOL:
        return TYPEJUDGMENTSYMBOL_EDEFAULT == null ? typejudgmentsymbol != null : !TYPEJUDGMENTSYMBOL_EDEFAULT.equals(typejudgmentsymbol);
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__TYPINGSTATEMENT:
        return typingstatement != null;
      case TypesystemPackage.TYPING_JUDGMENT_WITH_ENVIRONMENT__ERROR:
        return error != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (typejudgmentsymbol: ");
    result.append(typejudgmentsymbol);
    result.append(')');
    return result.toString();
  }

} //TypingJudgmentWithEnvironmentImpl
