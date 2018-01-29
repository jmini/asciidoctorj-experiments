/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Column; import org.asciidoctor.ast.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.STable#isHeaderOption <em>Header Option</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getFooter <em>Footer</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getBody <em>Body</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getFrame <em>Frame</em>}</li>
 *   <li>{@link fr.jmini.sciid.STable#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSTable()
 * @model superTypes="fr.jmini.sciid.SStructuralNode fr.jmini.sciid.Table"
 * @generated
 */
public interface STable extends SStructuralNode, Table {
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_HeaderOption()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHeaderOption();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STable#isHeaderOption <em>Header Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Option</em>' attribute.
	 * @see #isHeaderOption()
	 * @generated
	 */
	void setHeaderOption(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SColumn}.
	 * It is bidirectional and its opposite is '{@link fr.jmini.sciid.SColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Columns()
	 * @see fr.jmini.sciid.SColumn#getTable
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Header()
	 * @model type="fr.jmini.sciid.Row" containment="true"
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Footer()
	 * @model type="fr.jmini.sciid.Row" containment="true"
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Body()
	 * @model type="fr.jmini.sciid.Row" containment="true"
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Frame()
	 * @model unique="false"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STable#getFrame <em>Frame</em>}' attribute.
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
	 * @see fr.jmini.sciid.SciidPackage#getSTable_Grid()
	 * @model unique="false"
	 * @generated
	 */
	String getGrid();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STable#getGrid <em>Grid</em>}' attribute.
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

} // STable
