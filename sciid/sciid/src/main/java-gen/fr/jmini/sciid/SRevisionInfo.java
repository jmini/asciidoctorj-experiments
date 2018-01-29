/**
 */
package fr.jmini.sciid;

import org.asciidoctor.ast.RevisionInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRevision Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SRevisionInfo#getDate <em>Date</em>}</li>
 *   <li>{@link fr.jmini.sciid.SRevisionInfo#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.jmini.sciid.SRevisionInfo#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSRevisionInfo()
 * @model superTypes="fr.jmini.sciid.RevisionInfo"
 * @generated
 */
public interface SRevisionInfo extends EObject, RevisionInfo {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see fr.jmini.sciid.SciidPackage#getSRevisionInfo_Date()
	 * @model unique="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SRevisionInfo#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see fr.jmini.sciid.SciidPackage#getSRevisionInfo_Number()
	 * @model unique="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SRevisionInfo#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see fr.jmini.sciid.SciidPackage#getSRevisionInfo_Remark()
	 * @model unique="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SRevisionInfo#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

} // SRevisionInfo
