/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Row;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ERow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getERow()
 * @model superTypes="fr.jmini.eadoc.Row"
 * @generated
 */
public interface ERow extends EObject, Row {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.ECell}.
	 * It is bidirectional and its opposite is '{@link fr.jmini.eadoc.ECell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getERow_Cells()
	 * @see fr.jmini.eadoc.ECell#getRow
	 * @model opposite="row" containment="true"
	 * @generated
	 */
	EList<ECell> getCells();

} // ERow
