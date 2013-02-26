/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem.impl;

import it.xtypes.typesystem.JudgmentDescription;
import it.xtypes.typesystem.TypesystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Judgment Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getJudgmentsymbol <em>Judgmentsymbol</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#getNomatch <em>Nomatch</em>}</li>
 *   <li>{@link it.xtypes.typesystem.impl.JudgmentDescriptionImpl#isBinary <em>Binary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JudgmentDescriptionImpl extends MinimalEObjectImpl.Container implements JudgmentDescription
{
  /**
   * The default value of the '{@link #getJudgmentsymbol() <em>Judgmentsymbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgmentsymbol()
   * @generated
   * @ordered
   */
  protected static final String JUDGMENTSYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJudgmentsymbol() <em>Judgmentsymbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgmentsymbol()
   * @generated
   * @ordered
   */
  protected String judgmentsymbol = JUDGMENTSYMBOL_EDEFAULT;

  /**
   * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected static final String RELATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected String relation = RELATION_EDEFAULT;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final String KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected String kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getSuccess() <em>Success</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccess()
   * @generated
   * @ordered
   */
  protected static final String SUCCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuccess() <em>Success</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccess()
   * @generated
   * @ordered
   */
  protected String success = SUCCESS_EDEFAULT;

  /**
   * The default value of the '{@link #getFail() <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFail()
   * @generated
   * @ordered
   */
  protected static final String FAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFail() <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFail()
   * @generated
   * @ordered
   */
  protected String fail = FAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getNomatch() <em>Nomatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomatch()
   * @generated
   * @ordered
   */
  protected static final String NOMATCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomatch() <em>Nomatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomatch()
   * @generated
   * @ordered
   */
  protected String nomatch = NOMATCH_EDEFAULT;

  /**
   * The default value of the '{@link #isBinary() <em>Binary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBinary()
   * @generated
   * @ordered
   */
  protected static final boolean BINARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBinary() <em>Binary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBinary()
   * @generated
   * @ordered
   */
  protected boolean binary = BINARY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JudgmentDescriptionImpl()
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
    return TypesystemPackage.Literals.JUDGMENT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJudgmentsymbol()
  {
    return judgmentsymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJudgmentsymbol(String newJudgmentsymbol)
  {
    String oldJudgmentsymbol = judgmentsymbol;
    judgmentsymbol = newJudgmentsymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL, oldJudgmentsymbol, judgmentsymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(String newRelation)
  {
    String oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(String newKind)
  {
    String oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuccess()
  {
    return success;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuccess(String newSuccess)
  {
    String oldSuccess = success;
    success = newSuccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__SUCCESS, oldSuccess, success));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFail()
  {
    return fail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFail(String newFail)
  {
    String oldFail = fail;
    fail = newFail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__FAIL, oldFail, fail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomatch()
  {
    return nomatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomatch(String newNomatch)
  {
    String oldNomatch = nomatch;
    nomatch = newNomatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__NOMATCH, oldNomatch, nomatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBinary()
  {
    return binary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinary(boolean newBinary)
  {
    boolean oldBinary = binary;
    binary = newBinary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesystemPackage.JUDGMENT_DESCRIPTION__BINARY, oldBinary, binary));
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
      case TypesystemPackage.JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL:
        return getJudgmentsymbol();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__RELATION:
        return getRelation();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__KIND:
        return getKind();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__SUCCESS:
        return getSuccess();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__FAIL:
        return getFail();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__NOMATCH:
        return getNomatch();
      case TypesystemPackage.JUDGMENT_DESCRIPTION__BINARY:
        return isBinary();
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
      case TypesystemPackage.JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL:
        setJudgmentsymbol((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__RELATION:
        setRelation((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__KIND:
        setKind((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__SUCCESS:
        setSuccess((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__FAIL:
        setFail((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__NOMATCH:
        setNomatch((String)newValue);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__BINARY:
        setBinary((Boolean)newValue);
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
      case TypesystemPackage.JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL:
        setJudgmentsymbol(JUDGMENTSYMBOL_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__RELATION:
        setRelation(RELATION_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__SUCCESS:
        setSuccess(SUCCESS_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__FAIL:
        setFail(FAIL_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__NOMATCH:
        setNomatch(NOMATCH_EDEFAULT);
        return;
      case TypesystemPackage.JUDGMENT_DESCRIPTION__BINARY:
        setBinary(BINARY_EDEFAULT);
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
      case TypesystemPackage.JUDGMENT_DESCRIPTION__JUDGMENTSYMBOL:
        return JUDGMENTSYMBOL_EDEFAULT == null ? judgmentsymbol != null : !JUDGMENTSYMBOL_EDEFAULT.equals(judgmentsymbol);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__RELATION:
        return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__SUCCESS:
        return SUCCESS_EDEFAULT == null ? success != null : !SUCCESS_EDEFAULT.equals(success);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__FAIL:
        return FAIL_EDEFAULT == null ? fail != null : !FAIL_EDEFAULT.equals(fail);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__NOMATCH:
        return NOMATCH_EDEFAULT == null ? nomatch != null : !NOMATCH_EDEFAULT.equals(nomatch);
      case TypesystemPackage.JUDGMENT_DESCRIPTION__BINARY:
        return binary != BINARY_EDEFAULT;
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
    result.append(" (judgmentsymbol: ");
    result.append(judgmentsymbol);
    result.append(", relation: ");
    result.append(relation);
    result.append(", kind: ");
    result.append(kind);
    result.append(", success: ");
    result.append(success);
    result.append(", fail: ");
    result.append(fail);
    result.append(", nomatch: ");
    result.append(nomatch);
    result.append(", binary: ");
    result.append(binary);
    result.append(')');
    return result.toString();
  }

} //JudgmentDescriptionImpl
