/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.ListItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SList Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SListItem#getMarker <em>Marker</em>}</li>
 *   <li>{@link fr.jmini.sciid.SListItem#getText <em>Text</em>}</li>
 *   <li>{@link fr.jmini.sciid.SListItem#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSListItem()
 * @model superTypes="fr.jmini.sciid.SStructuralNode fr.jmini.sciid.ListItem"
 * @generated
 */
public interface SListItem extends SStructuralNode, ListItem {
	/**
	 * Returns the value of the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' attribute.
	 * @see #setMarker(String)
	 * @see fr.jmini.sciid.SciidPackage#getSListItem_Marker()
	 * @model unique="false"
	 * @generated
	 */
	String getMarker();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SListItem#getMarker <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' attribute.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fr.jmini.sciid.SciidPackage#getSListItem_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SListItem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see fr.jmini.sciid.SciidPackage#getSListItem_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SListItem#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.StringExtensions%>.isNullOrEmpty(this.getText());\nreturn (!_isNullOrEmpty);'"
	 * @generated
	 */
	boolean hasText();

} // SListItem
