/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.Cell; import org.asciidoctor.ast.Row;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSRow()
 * @model superTypes="fr.jmini.sciid.Row"
 * @generated
 */
public interface SRow extends EObject, Row {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SCell}.
	 * It is bidirectional and its opposite is '{@link fr.jmini.sciid.SCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSRow_Cells()
	 * @see fr.jmini.sciid.SCell#getRow
	 * @model opposite="row" containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // SRow
