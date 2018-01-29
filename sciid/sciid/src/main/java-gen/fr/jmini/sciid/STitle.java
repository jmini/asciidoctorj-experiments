/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.Title;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STitle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.STitle#getMain <em>Main</em>}</li>
 *   <li>{@link fr.jmini.sciid.STitle#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.STitle#getCombined <em>Combined</em>}</li>
 *   <li>{@link fr.jmini.sciid.STitle#isSanitized <em>Sanitized</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSTitle()
 * @model superTypes="fr.jmini.sciid.Title"
 * @generated
 */
public interface STitle extends EObject, Title {
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
	 * @see fr.jmini.sciid.SciidPackage#getSTitle_Main()
	 * @model unique="false"
	 * @generated
	 */
	String getMain();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STitle#getMain <em>Main</em>}' attribute.
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
	 * @see fr.jmini.sciid.SciidPackage#getSTitle_Subtitle()
	 * @model unique="false"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STitle#getSubtitle <em>Subtitle</em>}' attribute.
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
	 * @see fr.jmini.sciid.SciidPackage#getSTitle_Combined()
	 * @model unique="false"
	 * @generated
	 */
	String getCombined();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STitle#getCombined <em>Combined</em>}' attribute.
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
	 * @see fr.jmini.sciid.SciidPackage#getSTitle_Sanitized()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSanitized();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.STitle#isSanitized <em>Sanitized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sanitized</em>' attribute.
	 * @see #isSanitized()
	 * @generated
	 */
	void setSanitized(boolean value);

} // STitle
