/**
 */
package fr.jmini.sciid;

import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.DocumentHeader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDocument Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SDocumentHeader#getAuthors <em>Authors</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocumentHeader#getDocumentTitle <em>Document Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocumentHeader#getPageTitle <em>Page Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocumentHeader#getRevisionInfo <em>Revision Info</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocumentHeader#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader()
 * @model superTypes="fr.jmini.sciid.DocumentHeader"
 * @generated
 */
public interface SDocumentHeader extends EObject, DocumentHeader {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Author> getAuthors();

	/**
	 * Returns the value of the '<em><b>Document Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Title</em>' containment reference.
	 * @see #setDocumentTitle(STitle)
	 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader_DocumentTitle()
	 * @model containment="true"
	 * @generated
	 */
	STitle getDocumentTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocumentHeader#getDocumentTitle <em>Document Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Title</em>' containment reference.
	 * @see #getDocumentTitle()
	 * @generated
	 */
	void setDocumentTitle(STitle value);

	/**
	 * Returns the value of the '<em><b>Page Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Title</em>' attribute.
	 * @see #setPageTitle(String)
	 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader_PageTitle()
	 * @model unique="false"
	 * @generated
	 */
	String getPageTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocumentHeader#getPageTitle <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Title</em>' attribute.
	 * @see #getPageTitle()
	 * @generated
	 */
	void setPageTitle(String value);

	/**
	 * Returns the value of the '<em><b>Revision Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Info</em>' containment reference.
	 * @see #setRevisionInfo(SRevisionInfo)
	 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader_RevisionInfo()
	 * @model containment="true"
	 * @generated
	 */
	SRevisionInfo getRevisionInfo();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocumentHeader#getRevisionInfo <em>Revision Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Info</em>' containment reference.
	 * @see #getRevisionInfo()
	 * @generated
	 */
	void setRevisionInfo(SRevisionInfo value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute.
	 * @see #setAttributes(Map)
	 * @see fr.jmini.sciid.SciidPackage#getSDocumentHeader_Attributes()
	 * @model unique="false" dataType="fr.jmini.sciid.StringObjectMap"
	 * @generated
	 */
	Map<String, Object> getAttributes();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocumentHeader#getAttributes <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' attribute.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Map<String, Object> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="fr.jmini.sciid.Author" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isEmpty = this.getAuthors().isEmpty();\nif (_isEmpty)\n{\n\treturn <%fr.jmini.sciid.SciidFactory%>.eINSTANCE.createSAuthor();\n}\nelse\n{\n\treturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.sciid.SAuthor%>>head(this.getAuthors());\n}'"
	 * @generated
	 */
	Author getAuthor();

} // SDocumentHeader
