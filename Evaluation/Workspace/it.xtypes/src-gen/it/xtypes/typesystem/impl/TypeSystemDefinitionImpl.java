/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.Rule;
import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.typesystem.TypesystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type System Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getJudgmentDescriptions <em>Judgment Descriptions</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.TypeSystemDefinitionImpl#getEPackageURI <em>EPackage URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSystemDefinitionImpl extends MinimalEObjectImpl.Container implements TypeSystemDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";

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
   * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEPackage()
   * @generated
   * @ordered
   */
  protected EPackage ePackage;

  /**
   * The default value of the '{@link #getGenModel() <em>Gen Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenModel()
   * @generated
   * @ordered
   */
  protected static final String GEN_MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenModel()
   * @generated
   * @ordered
   */
  protected String genModel = GEN_MODEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getJudgmentDescriptions() <em>Judgment Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgmentDescriptions()
   * @generated
   * @ordered
   */
  protected EList<JudgmentDescription> judgmentDescriptions;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The default value of the '{@link #getEPackageURI() <em>EPackage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEPackageURI()
   * @generated
   * @ordered
   */
  protected static final String EPACKAGE_URI_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getEPackageURI() <em>EPackage URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEPackageURI()
   * @generated
   * @ordered
   */
  protected String ePackageURI = EPACKAGE_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeSystemDefinitionImpl()
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
    return TypesystemPackage.Literals.TYPE_SYSTEM_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPE_SYSTEM_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getEPackage()
  {
    if (ePackage != null && ePackage.eIsProxy())
    {
      InternalEObject oldEPackage = (InternalEObject)ePackage;
      ePackage = (EPackage)eResolveProxy(oldEPackage);
      if (ePackage != oldEPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE, oldEPackage, ePackage));
      }
    }
    return ePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetEPackage()
  {
    return ePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEPackage(EPackage newEPackage)
  {
    EPackage oldEPackage = ePackage;
    ePackage = newEPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE, oldEPackage, ePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenModel()
  {
    return genModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenModel(String newGenModel)
  {
    String oldGenModel = genModel;
    genModel = newGenModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPE_SYSTEM_DEFINITION__GEN_MODEL, oldGenModel, genModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JudgmentDescription> getJudgmentDescriptions()
  {
    if (judgmentDescriptions == null)
    {
      judgmentDescriptions = new EObjectContainmentEList<JudgmentDescription>(JudgmentDescription.class, this, TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS);
    }
    return judgmentDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES, TypesystemPackage.RULE__CONTAINING_TYPE_SYSTEM);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEPackageURI()
  {
    return ePackageURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEPackageURI(String newEPackageURI)
  {
    String oldEPackageURI = ePackageURI;
    ePackageURI = newEPackageURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE_URI, oldEPackageURI, ePackageURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
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
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS:
        return ((InternalEList<?>)getJudgmentDescriptions()).basicRemove(otherEnd, msgs);
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__NAME:
        return getName();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE:
        if (resolve) return getEPackage();
        return basicGetEPackage();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__GEN_MODEL:
        return getGenModel();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS:
        return getJudgmentDescriptions();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        return getRules();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE_URI:
        return getEPackageURI();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE:
        setEPackage((EPackage)newValue);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__GEN_MODEL:
        setGenModel((String)newValue);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS:
        getJudgmentDescriptions().clear();
        getJudgmentDescriptions().addAll((Collection<? extends JudgmentDescription>)newValue);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE_URI:
        setEPackageURI((String)newValue);
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
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE:
        setEPackage((EPackage)null);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__GEN_MODEL:
        setGenModel(GEN_MODEL_EDEFAULT);
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS:
        getJudgmentDescriptions().clear();
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        getRules().clear();
        return;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE_URI:
        setEPackageURI(EPACKAGE_URI_EDEFAULT);
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
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE:
        return ePackage != null;
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__GEN_MODEL:
        return GEN_MODEL_EDEFAULT == null ? genModel != null : !GEN_MODEL_EDEFAULT.equals(genModel);
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__JUDGMENT_DESCRIPTIONS:
        return judgmentDescriptions != null && !judgmentDescriptions.isEmpty();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__RULES:
        return rules != null && !rules.isEmpty();
      case TypesystemPackage.TYPE_SYSTEM_DEFINITION__EPACKAGE_URI:
        return EPACKAGE_URI_EDEFAULT == null ? ePackageURI != null : !EPACKAGE_URI_EDEFAULT.equals(ePackageURI);
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
    result.append(", genModel: ");
    result.append(genModel);
    result.append(", ePackageURI: ");
    result.append(ePackageURI);
    result.append(')');
    return result.toString();
  }

} //TypeSystemDefinitionImpl
