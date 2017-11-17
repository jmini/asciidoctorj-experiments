/**
 */
package fr.jmini.eadoc;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.StructuralNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuralNode#getSubstitutions <em>Substitutions</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode()
 * @model superTypes="fr.jmini.eadoc.EContentNode fr.jmini.eadoc.StructuralNode"
 * @generated
 */
public interface EStructuralNode extends EContentNode, StructuralNode {
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
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EStructuralNode#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EStructuralNode#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EStructuralNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<EStructuralNode> getBlocks();

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
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_Level()
	 * @model unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EStructuralNode#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Location</em>' containment reference.
	 * @see #setSourceLocation(ECursor)
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_SourceLocation()
	 * @model containment="true"
	 * @generated
	 */
	ECursor getSourceLocation();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EStructuralNode#getSourceLocation <em>Source Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location</em>' containment reference.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(ECursor value);

	/**
	 * Returns the value of the '<em><b>Substitutions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutions</em>' attribute list.
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuralNode_Substitutions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubstitutions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@linkplain #getTitle()} instead
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTitle();'"
	 * @generated
	 */
	String title();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@linkplain #getStyle()} instead
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStyle();'"
	 * @generated
	 */
	String style();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @return The list of child blocks of this block
	 * @deprecated Please use {@linkplain #getBlocks()} instead
	 * <!-- end-model-doc -->
	 * @model dataType="fr.jmini.eadoc.StructuralNodeList" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBlocks();'"
	 * @generated
	 */
	List<? extends StructuralNode> blocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model blockType="fr.jmini.eadoc.StructuralNode" blockUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getBlocks().add(<%fr.jmini.eadoc.EadocUtility%>.convertStructuralNode(block));'"
	 * @generated
	 */
	void append(StructuralNode block);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@linkplain #getContent()} instead
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getContent();'"
	 * @generated
	 */
	Object content();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	Object getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String convert();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.jmini.eadoc.StructuralNodeList" unique="false" selectorDataType="fr.jmini.eadoc.ObjectObjectMap" selectorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	List<? extends StructuralNode> findBy(Map<Object, Object> selector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String getContentModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" substitutionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isSubstitutionEnabled(String substitution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substitutionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	void removeSubstitution(String substitution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substitutionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getSubstitutions().add(substitution);'"
	 * @generated
	 */
	void addSubstitution(String substitution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substitutionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getSubstitutions().add(0, substitution);'"
	 * @generated
	 */
	void prependSubstitution(String substitution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model substitutionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	void setSubstitutions(String... substitution);

} // EStructuralNode
