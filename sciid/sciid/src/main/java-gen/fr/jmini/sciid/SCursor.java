/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.Cursor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCursor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SCursor#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCursor#getPath <em>Path</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCursor#getDir <em>Dir</em>}</li>
 *   <li>{@link fr.jmini.sciid.SCursor#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSCursor()
 * @model superTypes="fr.jmini.sciid.Cursor"
 * @generated
 */
public interface SCursor extends EObject, Cursor {
	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see fr.jmini.sciid.SciidPackage#getSCursor_LineNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getLineNumber();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCursor#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.jmini.sciid.SciidPackage#getSCursor_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCursor#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see #setDir(String)
	 * @see fr.jmini.sciid.SciidPackage#getSCursor_Dir()
	 * @model unique="false"
	 * @generated
	 */
	String getDir();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCursor#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see fr.jmini.sciid.SciidPackage#getSCursor_File()
	 * @model unique="false"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SCursor#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

} // SCursor
