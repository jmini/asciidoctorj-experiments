/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Author;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAuthor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getEmail <em>Email</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getLastName <em>Last Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EAuthor#getInitials <em>Initials</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEAuthor()
 * @model superTypes="fr.jmini.eadoc.Author"
 * @generated
 */
public interface EAuthor extends EObject, Author {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_FullName()
	 * @model unique="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_FirstName()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_LastName()
	 * @model unique="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_MiddleName()
	 * @model unique="false"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Initials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initials</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initials</em>' attribute.
	 * @see #setInitials(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEAuthor_Initials()
	 * @model unique="false"
	 * @generated
	 */
	String getInitials();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EAuthor#getInitials <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initials</em>' attribute.
	 * @see #getInitials()
	 * @generated
	 */
	void setInitials(String value);

} // EAuthor
