/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.BasicType#getBasic <em>Basic</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getBasicType()
 * @model
 * @generated
 */
public interface BasicType extends ExpressionType
{
  /**
   * Returns the value of the '<em><b>Basic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' attribute.
   * @see #setBasic(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getBasicType_Basic()
   * @model
   * @generated
   */
  String getBasic();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.BasicType#getBasic <em>Basic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' attribute.
   * @see #getBasic()
   * @generated
   */
  void setBasic(String value);

} // BasicType
