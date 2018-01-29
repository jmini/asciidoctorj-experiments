/**
 */
package fr.jmini.sciid;

import java.util.Map;

import org.asciidoctor.ast.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDocument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SDocument#getStructuredDoctitle <em>Structured Doctitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocument#getDoctitle <em>Doctitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.SDocument#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSDocument()
 * @model superTypes="fr.jmini.sciid.SStructuralNode fr.jmini.sciid.Document"
 * @generated
 */
public interface SDocument extends SStructuralNode, Document {
	/**
	 * Returns the value of the '<em><b>Structured Doctitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Doctitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Doctitle</em>' containment reference.
	 * @see #setStructuredDoctitle(STitle)
	 * @see fr.jmini.sciid.SciidPackage#getSDocument_StructuredDoctitle()
	 * @model containment="true"
	 * @generated
	 */
	STitle getStructuredDoctitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocument#getStructuredDoctitle <em>Structured Doctitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Doctitle</em>' containment reference.
	 * @see #getStructuredDoctitle()
	 * @generated
	 */
	void setStructuredDoctitle(STitle value);

	/**
	 * Returns the value of the '<em><b>Doctitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doctitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctitle</em>' attribute.
	 * @see #setDoctitle(String)
	 * @see fr.jmini.sciid.SciidPackage#getSDocument_Doctitle()
	 * @model unique="false"
	 * @generated
	 */
	String getDoctitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocument#getDoctitle <em>Doctitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctitle</em>' attribute.
	 * @see #getDoctitle()
	 * @generated
	 */
	void setDoctitle(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(Map)
	 * @see fr.jmini.sciid.SciidPackage#getSDocument_Options()
	 * @model unique="false" dataType="fr.jmini.sciid.ObjectObjectMap"
	 * @generated
	 */
	Map<Object, Object> getOptions();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SDocument#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Map<Object, Object> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getDoctitle()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDoctitle();'"
	 * @generated
	 */
	String doctitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" backendUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isBasebackend(String backend);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #isBasebackend(String)}
	 * <!-- end-model-doc -->
	 * @model unique="false" backendUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isBasebackend(backend);'"
	 * @generated
	 */
	boolean basebackend(String backend);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	int getAndIncrementCounter(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" initialValueUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	int getAndIncrementCounter(String name, int initialValue);

} // SDocument
