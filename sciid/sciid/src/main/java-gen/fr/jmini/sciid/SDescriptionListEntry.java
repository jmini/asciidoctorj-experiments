/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.ListItem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDescription List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SDescriptionListEntry#getTerms <em>Terms</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDescriptionListEntry#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSDescriptionListEntry()
 * @model superTypes="fr.jmini.sciid.DescriptionListEntry"
 * @generated
 */
public interface SDescriptionListEntry extends EObject, DescriptionListEntry {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSDescriptionListEntry_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getTerms();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(SListItem)
	 * @see fr.jmini.sciid.SciidPackage#getSDescriptionListEntry_Description()
	 * @model containment="true"
	 * @generated
	 */
	SListItem getDescription();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDescriptionListEntry#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(SListItem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemType="fr.jmini.sciid.ListItem" itemUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setDescription(<%fr.jmini.sciid.SciidUtility%>.convertListItem(item));'"
	 * @generated
	 */
	void setDescription(ListItem item);

} // SDescriptionListEntry
