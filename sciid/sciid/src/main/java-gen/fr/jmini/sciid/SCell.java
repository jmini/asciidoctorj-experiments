/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SCell#getRow <em>Row</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getColspan <em>Colspan</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getSource <em>Source</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCell#getInnerDocument <em>Inner Document</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSCell()
 * @model superTypes="fr.jmini.sciid.SContentNode fr.jmini.sciid.Cell"
 * @generated
 */
public interface SCell extends SContentNode, Cell {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.jmini.sciid.SRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(SRow)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Row()
	 * @see fr.jmini.sciid.SRow#getCells
	 * @model opposite="cells" transient="false"
	 * @generated
	 */
	SRow getRow();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(SRow value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(SColumn)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Column()
	 * @model
	 * @generated
	 */
	SColumn getColumn();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(SColumn value);

	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #setColspan(int)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Colspan()
	 * @model unique="false"
	 * @generated
	 */
	int getColspan();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(int value);

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #setRowspan(int)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Rowspan()
	 * @model unique="false"
	 * @generated
	 */
	int getRowspan();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(int value);

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
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #setHorizontalAlignment(Table.HorizontalAlignment)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_HorizontalAlignment()
	 * @model unique="false" dataType="fr.jmini.sciid.HorizontalAlignment"
	 * @generated
	 */
	Table.HorizontalAlignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(Table.HorizontalAlignment value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #setVerticalAlignment(Table.VerticalAlignment)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_VerticalAlignment()
	 * @model unique="false" dataType="fr.jmini.sciid.VerticalAlignment"
	 * @generated
	 */
	Table.VerticalAlignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(Table.VerticalAlignment value);

	/**
	 * Returns the value of the '<em><b>Inner Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Document</em>' containment reference.
	 * @see #setInnerDocument(Document)
	 * @see fr.jmini.sciid.SciidPackage#getSCell_InnerDocument()
	 * @model type="fr.jmini.sciid.Document" containment="true"
	 * @generated
	 */
	Document getInnerDocument();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCell#getInnerDocument <em>Inner Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Document</em>' containment reference.
	 * @see #getInnerDocument()
	 * @generated
	 */
	void setInnerDocument(Document value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	String getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	Object getContent();

} // SCell
