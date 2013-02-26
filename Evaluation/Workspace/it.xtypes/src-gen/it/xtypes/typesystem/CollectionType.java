/**
 * <copyright>
 * </copyright>
 *

 */
package it.xtypes.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.xtypes.typesystem.CollectionType#getCollection <em>Collection</em>}</li>
 *   <li>{@link it.xtypes.typesystem.CollectionType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.xtypes.typesystem.TypesystemPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends ExpressionType
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(String)
   * @see it.xtypes.typesystem.TypesystemPackage#getCollectionType_Collection()
   * @model
   * @generated
   */
  String getCollection();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CollectionType#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #getCollection()
   * @generated
   */
  void setCollection(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ExpressionType)
   * @see it.xtypes.typesystem.TypesystemPackage#getCollectionType_Type()
   * @model containment="true"
   * @generated
   */
  ExpressionType getType();

  /**
   * Sets the value of the '{@link it.xtypes.typesystem.CollectionType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ExpressionType value);

} // CollectionType
