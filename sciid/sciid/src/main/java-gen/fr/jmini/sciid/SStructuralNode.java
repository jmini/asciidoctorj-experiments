/**
 */
package fr.jmini.sciid;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.StructuralNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SStructural Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getCaption <em>Caption</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getContentModel <em>Content Model</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link fr.jmini.sciid.SStructuralNode#getSubstitutions <em>Substitutions</em>}</li>
 * </ul>
 *
 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode()
 * @model superTypes="fr.jmini.sciid.SContentNode fr.jmini.sciid.StructuralNode"
 * @generated
 */
public interface SStructuralNode extends SContentNode, StructuralNode {
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
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Caption()
	 * @model unique="false"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

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
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.sciid.SStructuralNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuralNode> getBlocks();

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
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Level()
	 * @model unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Model</em>' attribute.
	 * @see #setContentModel(String)
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_ContentModel()
	 * @model unique="false"
	 * @generated
	 */
	String getContentModel();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getContentModel <em>Content Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Model</em>' attribute.
	 * @see #getContentModel()
	 * @generated
	 */
	void setContentModel(String value);

	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Location</em>' containment reference.
	 * @see #setSourceLocation(SCursor)
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_SourceLocation()
	 * @model containment="true"
	 * @generated
	 */
	SCursor getSourceLocation();

	/**
	 * Sets the value of the '{@link fr.jmini.sciid.SStructuralNode#getSourceLocation <em>Source Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location</em>' containment reference.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(SCursor value);

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
	 * @see fr.jmini.sciid.SciidPackage#getSStructuralNode_Substitutions()
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
	 * @model dataType="fr.jmini.sciid.StructuralNodeList" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBlocks();'"
	 * @generated
	 */
	List<StructuralNode> blocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model blockType="fr.jmini.sciid.StructuralNode" blockUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getBlocks().add(<%fr.jmini.sciid.SciidUtility%>.convertStructuralNode(block));'"
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
	 * @model dataType="fr.jmini.sciid.StructuralNodeList" unique="false" selectorDataType="fr.jmini.sciid.ObjectObjectMap" selectorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	List<StructuralNode> findBy(Map<Object, Object> selector);

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

} // SStructuralNode
