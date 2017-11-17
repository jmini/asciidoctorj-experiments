/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ECell#getRow <em>Row</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getColspan <em>Colspan</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getSource <em>Source</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ECell#getInnerDocument <em>Inner Document</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getECell()
 * @model superTypes="fr.jmini.eadoc.EContentNode fr.jmini.eadoc.Cell"
 * @generated
 */
public interface ECell extends EContentNode, Cell {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.jmini.eadoc.ERow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(ERow)
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Row()
	 * @see fr.jmini.eadoc.ERow#getCells
	 * @model opposite="cells" transient="false"
	 * @generated
	 */
	ERow getRow();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(ERow value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(EColumn)
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Column()
	 * @model
	 * @generated
	 */
	EColumn getColumn();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(EColumn value);

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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Colspan()
	 * @model unique="false"
	 * @generated
	 */
	int getColspan();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getColspan <em>Colspan</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Rowspan()
	 * @model unique="false"
	 * @generated
	 */
	int getRowspan();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getRowspan <em>Rowspan</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getSource <em>Source</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getStyle <em>Style</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_HorizontalAlignment()
	 * @model unique="false" dataType="fr.jmini.eadoc.HorizontalAlignment"
	 * @generated
	 */
	Table.HorizontalAlignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_VerticalAlignment()
	 * @model unique="false" dataType="fr.jmini.eadoc.VerticalAlignment"
	 * @generated
	 */
	Table.VerticalAlignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getECell_InnerDocument()
	 * @model type="fr.jmini.eadoc.Document" containment="true"
	 * @generated
	 */
	Document getInnerDocument();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ECell#getInnerDocument <em>Inner Document</em>}' containment reference.
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

} // ECell
