/**
 */
package fr.jmini.eadoc;

import java.util.Map;

import org.asciidoctor.ast.ContentPart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EContent Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getId <em>Id</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getContext <em>Context</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getRole <em>Role</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getParts <em>Parts</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentPart#getParentPart <em>Parent Part</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEContentPart()
 * @model superTypes="fr.jmini.eadoc.ContentPart"
 * @generated
 */
public interface EContentPart extends EObject, ContentPart {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Level()
	 * @model unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Context()
	 * @model unique="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Map<String, Object>)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Attributes()
	 * @model type="fr.jmini.eadoc.StringObjectMap"
	 * @generated
	 */
	Map<String, Object> getAttributes();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Map<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EContentPart}.
	 * It is bidirectional and its opposite is '{@link fr.jmini.eadoc.EContentPart#getParentPart <em>Parent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_Parts()
	 * @see fr.jmini.eadoc.EContentPart#getParentPart
	 * @model opposite="parentPart" containment="true"
	 * @generated
	 */
	EList<EContentPart> getParts();

	/**
	 * Returns the value of the '<em><b>Parent Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.jmini.eadoc.EContentPart#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Part</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Part</em>' container reference.
	 * @see #setParentPart(EContentPart)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentPart_ParentPart()
	 * @see fr.jmini.eadoc.EContentPart#getParts
	 * @model opposite="parts" transient="false"
	 * @generated
	 */
	EContentPart getParentPart();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentPart#getParentPart <em>Parent Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Part</em>' container reference.
	 * @see #getParentPart()
	 * @generated
	 */
	void setParentPart(EContentPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getContent();

} // EContentPart
