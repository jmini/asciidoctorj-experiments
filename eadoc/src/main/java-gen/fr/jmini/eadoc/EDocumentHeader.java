/**
 */
package fr.jmini.eadoc;

import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.DocumentHeader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDocument Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EDocumentHeader#getAuthors <em>Authors</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EDocumentHeader#getDocumentTitle <em>Document Title</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EDocumentHeader#getPageTitle <em>Page Title</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EDocumentHeader#getRevisionInfo <em>Revision Info</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EDocumentHeader#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader()
 * @model superTypes="fr.jmini.eadoc.DocumentHeader"
 * @generated
 */
public interface EDocumentHeader extends EObject, DocumentHeader {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader_Authors()
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
	 * @see #setDocumentTitle(ETitle)
	 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader_DocumentTitle()
	 * @model containment="true"
	 * @generated
	 */
	ETitle getDocumentTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EDocumentHeader#getDocumentTitle <em>Document Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Title</em>' containment reference.
	 * @see #getDocumentTitle()
	 * @generated
	 */
	void setDocumentTitle(ETitle value);

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
	 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader_PageTitle()
	 * @model unique="false"
	 * @generated
	 */
	String getPageTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EDocumentHeader#getPageTitle <em>Page Title</em>}' attribute.
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
	 * @see #setRevisionInfo(ERevisionInfo)
	 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader_RevisionInfo()
	 * @model containment="true"
	 * @generated
	 */
	ERevisionInfo getRevisionInfo();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EDocumentHeader#getRevisionInfo <em>Revision Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Info</em>' containment reference.
	 * @see #getRevisionInfo()
	 * @generated
	 */
	void setRevisionInfo(ERevisionInfo value);

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
	 * @see fr.jmini.eadoc.EadocPackage#getEDocumentHeader_Attributes()
	 * @model unique="false" dataType="fr.jmini.eadoc.StringObjectMap"
	 * @generated
	 */
	Map<String, Object> getAttributes();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EDocumentHeader#getAttributes <em>Attributes</em>}' attribute.
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
	 * @model kind="operation" type="fr.jmini.eadoc.Author" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isEmpty = this.getAuthors().isEmpty();\nif (_isEmpty)\n{\n\treturn <%fr.jmini.eadoc.EadocFactory%>.eINSTANCE.createEAuthor();\n}\nelse\n{\n\treturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EAuthor%>>head(this.getAuthors());\n}'"
	 * @generated
	 */
	Author getAuthor();

} // EDocumentHeader
