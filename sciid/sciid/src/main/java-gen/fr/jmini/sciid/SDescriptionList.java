/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.DescriptionList; import org.asciidoctor.ast.DescriptionListEntry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDescription List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SDescriptionList#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSDescriptionList()
 * @model superTypes="fr.jmini.sciid.SStructuralNode fr.jmini.sciid.DescriptionList"
 * @generated
 */
public interface SDescriptionList extends SStructuralNode, DescriptionList {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SDescriptionListEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSDescriptionList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DescriptionListEntry> getItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isEmpty = this.getItems().isEmpty();\nreturn (!_isEmpty);'"
	 * @generated
	 */
	boolean hasItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String render();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String convert();

} // SDescriptionList
