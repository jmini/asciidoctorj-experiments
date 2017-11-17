/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAdoc List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EAdocList#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEAdocList()
 * @model superTypes="fr.jmini.eadoc.EStructuralNode fr.jmini.eadoc.AstList"
 * @generated
 */
public interface EAdocList extends EStructuralNode, List {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EStructuralNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEAdocList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<EStructuralNode> getItems();

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

} // EAdocList
