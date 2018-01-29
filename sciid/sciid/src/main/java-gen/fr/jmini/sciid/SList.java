/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.List; import org.asciidoctor.ast.StructuralNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SList</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SList#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSList()
 * @model superTypes="fr.jmini.sciid.SStructuralNode fr.jmini.sciid.AstList"
 * @generated
 */
public interface SList extends SStructuralNode, List {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SStructuralNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralNode> getItems();

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

} // SList
