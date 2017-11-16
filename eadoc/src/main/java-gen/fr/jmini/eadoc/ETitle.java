/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Title;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETitle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ETitle#getMain <em>Main</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETitle#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETitle#getCombined <em>Combined</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ETitle#isSanitized <em>Sanitized</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getETitle()
 * @model superTypes="fr.jmini.eadoc.Title"
 * @generated
 */
public interface ETitle extends EObject, Title {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(String)
	 * @see fr.jmini.eadoc.EadocPackage#getETitle_Main()
	 * @model unique="false"
	 * @generated
	 */
	String getMain();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETitle#getMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see fr.jmini.eadoc.EadocPackage#getETitle_Subtitle()
	 * @model unique="false"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETitle#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined</em>' attribute.
	 * @see #setCombined(String)
	 * @see fr.jmini.eadoc.EadocPackage#getETitle_Combined()
	 * @model unique="false"
	 * @generated
	 */
	String getCombined();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETitle#getCombined <em>Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined</em>' attribute.
	 * @see #getCombined()
	 * @generated
	 */
	void setCombined(String value);

	/**
	 * Returns the value of the '<em><b>Sanitized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sanitized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sanitized</em>' attribute.
	 * @see #setSanitized(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getETitle_Sanitized()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSanitized();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ETitle#isSanitized <em>Sanitized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sanitized</em>' attribute.
	 * @see #isSanitized()
	 * @generated
	 */
	void setSanitized(boolean value);

} // ETitle
