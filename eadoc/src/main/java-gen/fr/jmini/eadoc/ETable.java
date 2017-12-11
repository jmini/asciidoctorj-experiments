/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Column; import org.asciidoctor.ast.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ETable#isHeaderOption <em>Header Option</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getFooter <em>Footer</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getBody <em>Body</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getFrame <em>Frame</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETable#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getETable()
 * @model superTypes="fr.jmini.eadoc.EStructuralNode fr.jmini.eadoc.Table"
 * @generated
 */
public interface ETable extends EStructuralNode, Table {
	/**
	 * Returns the value of the '<em><b>Header Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Option</em>' attribute.
	 * @see #setHeaderOption(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getETable_HeaderOption()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHeaderOption();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETable#isHeaderOption <em>Header Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Option</em>' attribute.
	 * @see #isHeaderOption()
	 * @generated
	 */
	void setHeaderOption(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EColumn}.
	 * It is bidirectional and its opposite is '{@link fr.jmini.eadoc.EColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Columns()
	 * @see fr.jmini.eadoc.EColumn#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.asciidoctor.ast.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Header()
	 * @model type="fr.jmini.eadoc.Row" containment="true"
	 * @generated
	 */
	EList<Row> getHeader();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference list.
	 * The list contents are of type {@link org.asciidoctor.ast.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Footer()
	 * @model type="fr.jmini.eadoc.Row" containment="true"
	 * @generated
	 */
	EList<Row> getFooter();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.asciidoctor.ast.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Body()
	 * @model type="fr.jmini.eadoc.Row" containment="true"
	 * @generated
	 */
	EList<Row> getBody();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(String)
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Frame()
	 * @model unique="false"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETable#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' attribute.
	 * @see #setGrid(String)
	 * @see fr.jmini.eadoc.EadocPackage#getETable_Grid()
	 * @model unique="false"
	 * @generated
	 */
	String getGrid();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETable#getGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isHeaderOption();'"
	 * @generated
	 */
	boolean hasHeaderOption();

} // ETable
