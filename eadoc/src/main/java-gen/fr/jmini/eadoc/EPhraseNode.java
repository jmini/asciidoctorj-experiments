/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.PhraseNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPhrase Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EPhraseNode#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EPhraseNode#getText <em>Text</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EPhraseNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEPhraseNode()
 * @model superTypes="fr.jmini.eadoc.EContentNode fr.jmini.eadoc.PhraseNode"
 * @generated
 */
public interface EPhraseNode extends EContentNode, PhraseNode {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEPhraseNode_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EPhraseNode#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEPhraseNode_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EPhraseNode#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEPhraseNode_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EPhraseNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String render();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String convert();

} // EPhraseNode
