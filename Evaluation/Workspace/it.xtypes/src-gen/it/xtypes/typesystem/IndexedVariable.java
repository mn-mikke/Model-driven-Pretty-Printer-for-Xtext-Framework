/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.IndexedVariable#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getIndexedVariable()
 * @model
 * @generated
 */
public interface IndexedVariable extends VariableAccess
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(ArrayIndex)
   * @see it.xtypes.typesystem.TypesystemPackage#getIndexedVariable_Index()
   * @model containment="true"
   * @generated
   */
  ArrayIndex getIndex();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.IndexedVariable#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(ArrayIndex value);

} // IndexedVariable
