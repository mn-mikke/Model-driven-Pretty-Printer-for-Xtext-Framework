/**
 * <copyright>
 * </copyright>
 *

 */
package expr.exprDemo.impl;

import expr.exprDemo.Expr;
import expr.exprDemo.ExprDemoPackage;
import expr.exprDemo.Symbol;
import expr.exprDemo.SymbolRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expr.exprDemo.impl.SymbolRefImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link expr.exprDemo.impl.SymbolRefImpl#getActuals <em>Actuals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolRefImpl extends ExpressionImpl implements SymbolRef
{
  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected Symbol symbol;

  /**
   * The cached value of the '{@link #getActuals() <em>Actuals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuals()
   * @generated
   * @ordered
   */
  protected EList<Expr> actuals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolRefImpl()
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
    return ExprDemoPackage.Literals.SYMBOL_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol getSymbol()
  {
    if (symbol != null && symbol.eIsProxy())
    {
      InternalEObject oldSymbol = (InternalEObject)symbol;
      symbol = (Symbol)eResolveProxy(oldSymbol);
      if (symbol != oldSymbol)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExprDemoPackage.SYMBOL_REF__SYMBOL, oldSymbol, symbol));
      }
    }
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol basicGetSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(Symbol newSymbol)
  {
    Symbol oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExprDemoPackage.SYMBOL_REF__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getActuals()
  {
    if (actuals == null)
    {
      actuals = new EObjectContainmentEList<Expr>(Expr.class, this, ExprDemoPackage.SYMBOL_REF__ACTUALS);
    }
    return actuals;
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
      case ExprDemoPackage.SYMBOL_REF__ACTUALS:
        return ((InternalEList<?>)getActuals()).basicRemove(otherEnd, msgs);
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
      case ExprDemoPackage.SYMBOL_REF__SYMBOL:
        if (resolve) return getSymbol();
        return basicGetSymbol();
      case ExprDemoPackage.SYMBOL_REF__ACTUALS:
        return getActuals();
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
      case ExprDemoPackage.SYMBOL_REF__SYMBOL:
        setSymbol((Symbol)newValue);
        return;
      case ExprDemoPackage.SYMBOL_REF__ACTUALS:
        getActuals().clear();
        getActuals().addAll((Collection<? extends Expr>)newValue);
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
      case ExprDemoPackage.SYMBOL_REF__SYMBOL:
        setSymbol((Symbol)null);
        return;
      case ExprDemoPackage.SYMBOL_REF__ACTUALS:
        getActuals().clear();
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
      case ExprDemoPackage.SYMBOL_REF__SYMBOL:
        return symbol != null;
      case ExprDemoPackage.SYMBOL_REF__ACTUALS:
        return actuals != null && !actuals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SymbolRefImpl
