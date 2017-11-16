/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.RevisionInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERevision Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ERevisionInfo#getDate <em>Date</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ERevisionInfo#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ERevisionInfo#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getERevisionInfo()
 * @model superTypes="fr.jmini.eadoc.RevisionInfo"
 * @generated
 */
public interface ERevisionInfo extends EObject, RevisionInfo {
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
	 * @see fr.jmini.eadoc.EadocPackage#getERevisionInfo_Date()
	 * @model unique="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ERevisionInfo#getDate <em>Date</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getERevisionInfo_Number()
	 * @model unique="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ERevisionInfo#getNumber <em>Number</em>}' attribute.
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
	 * @see fr.jmini.eadoc.EadocPackage#getERevisionInfo_Remark()
	 * @model unique="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ERevisionInfo#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

} // ERevisionInfo
