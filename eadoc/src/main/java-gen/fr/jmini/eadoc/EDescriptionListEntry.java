/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.ListItem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDescription List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EDescriptionListEntry#getTerms <em>Terms</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EDescriptionListEntry#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEDescriptionListEntry()
 * @model superTypes="fr.jmini.eadoc.DescriptionListEntry"
 * @generated
 */
public interface EDescriptionListEntry extends EObject, DescriptionListEntry {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEDescriptionListEntry_Terms()
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
	 * @see #setDescription(EListItem)
	 * @see fr.jmini.eadoc.EadocPackage#getEDescriptionListEntry_Description()
	 * @model containment="true"
	 * @generated
	 */
	EListItem getDescription();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EDescriptionListEntry#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(EListItem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemType="fr.jmini.eadoc.ListItem" itemUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setDescription(<%fr.jmini.eadoc.EadocUtility%>.convertListItem(item));'"
	 * @generated
	 */
	void setDescription(ListItem item);

} // EDescriptionListEntry
