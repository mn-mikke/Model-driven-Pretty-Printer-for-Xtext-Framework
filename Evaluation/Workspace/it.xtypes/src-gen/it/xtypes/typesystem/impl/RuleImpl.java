/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemPackage;
import it.xtypes.typesystem.TypingJudgmentWithEnvironment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.RuleImpl#getTypejudgment <em>Typejudgment</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.RuleImpl#getContainingTypeSystem <em>Containing Type System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypejudgment() <em>Typejudgment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypejudgment()
   * @generated
   * @ordered
   */
  protected TypingJudgmentWithEnvironment typejudgment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return TypesystemPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingJudgmentWithEnvironment getTypejudgment()
  {
    return typejudgment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypejudgment(TypingJudgmentWithEnvironment newTypejudgment, NotificationChain msgs)
  {
    TypingJudgmentWithEnvironment oldTypejudgment = typejudgment;
    typejudgment = newTypejudgment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesystemPackage.RULE__TYPEJUDGMENT, oldTypejudgment, newTypejudgment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypejudgment(TypingJudgmentWithEnvironment newTypejudgment)
  {
    if (newTypejudgment != typejudgment)
    {
      NotificationChain msgs = null;
      if (typejudgment != null)
        msgs = ((InternalEObject)typejudgment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.RULE__TYPEJUDGMENT, null, msgs);
      if (newTypejudgment != null)
        msgs = ((InternalEObject)newTypejudgment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesystemPackage.RULE__TYPEJUDGMENT, null, msgs);
      msgs = basicSetTypejudgment(newTypejudgment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.RULE__TYPEJUDGMENT, newTypejudgment, newTypejudgment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSystemDefinition getContainingTypeSystem()
  {
    if (eContainerFeatureID() != TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM) return null;
    return (TypeSystemDefinition)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainingTypeSystem(TypeSystemDefinition newContainingTypeSystem, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newContainingTypeSystem, TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainingTypeSystem(TypeSystemDefinition newContainingTypeSystem)
  {
    if (newContainingTypeSystem != eInternalContainer() || (eContainerFeatureID() != TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM && newContainingTypeSystem != null))
    {
      if (EcoreUtil.isAncestor(this, newContainingTypeSystem))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newContainingTypeSystem != null)
        msgs = ((InternalEObject)newContainingTypeSystem).eInverseAdd(this, TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES, TypeSystemDefinition.class, msgs);
      msgs = basicSetContainingTypeSystem(newContainingTypeSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM, newContainingTypeSystem, newContainingTypeSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetContainingTypeSystem((TypeSystemDefinition)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case TypesystemPackage.RULE__TYPEJUDGMENT:
        return basicSetTypejudgment(null, msgs);
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        return basicSetContainingTypeSystem(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        return eInternalContainer().eInverseRemove(this, TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES, TypeSystemDefinition.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case TypesystemPackage.RULE__NAME:
        return getName();
      case TypesystemPackage.RULE__TYPEJUDGMENT:
        return getTypejudgment();
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        return getContainingTypeSystem();
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
      case TypesystemPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case TypesystemPackage.RULE__TYPEJUDGMENT:
        setTypejudgment((TypingJudgmentWithEnvironment)newValue);
        return;
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        setContainingTypeSystem((TypeSystemDefinition)newValue);
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
      case TypesystemPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesystemPackage.RULE__TYPEJUDGMENT:
        setTypejudgment((TypingJudgmentWithEnvironment)null);
        return;
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        setContainingTypeSystem((TypeSystemDefinition)null);
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
      case TypesystemPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesystemPackage.RULE__TYPEJUDGMENT:
        return typejudgment != null;
      case TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM:
        return getContainingTypeSystem() != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
