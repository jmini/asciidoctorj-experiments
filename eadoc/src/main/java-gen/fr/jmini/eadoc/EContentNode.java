/**
 */
package fr.jmini.eadoc;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.Document;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EContent Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getId <em>Id</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getContext <em>Context</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getDocument <em>Document</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#isInline <em>Inline</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#isBlock <em>Block</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EContentNode#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEContentNode()
 * @model superTypes="fr.jmini.eadoc.ContentNode"
 * @generated
 */
public interface EContentNode extends EObject, ContentNode {
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
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_NodeName()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ContentNode)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Parent()
	 * @model type="fr.jmini.eadoc.ContentNode"
	 * @generated
	 */
	ContentNode getParent();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ContentNode value);

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
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Context()
	 * @model unique="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Document()
	 * @model type="fr.jmini.eadoc.Document"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline</em>' attribute.
	 * @see #setInline(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Inline()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInline();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#isInline <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' attribute.
	 * @see #isInline()
	 * @generated
	 */
	void setInline(boolean value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Block()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBlock();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#isBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #isBlock()
	 * @generated
	 */
	void setBlock(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute.
	 * @see #setAttributes(Map)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Attributes()
	 * @model unique="false" dataType="fr.jmini.eadoc.StringObjectMap"
	 * @generated
	 */
	Map<String, Object> getAttributes();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getAttributes <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' attribute.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Map<String, Object> value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute.
	 * @see #setRoles(List)
	 * @see fr.jmini.eadoc.EadocPackage#getEContentNode_Roles()
	 * @model unique="false" dataType="fr.jmini.eadoc.StringList"
	 * @generated
	 */
	List<String> getRoles();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EContentNode#getRoles <em>Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' attribute.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(List<String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getId()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getId();'"
	 * @generated
	 */
	String id();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@linkplain #getParent()} instead.
	 * <!-- end-model-doc -->
	 * @model type="fr.jmini.eadoc.ContentNode" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getParent();'"
	 * @generated
	 */
	ContentNode parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@linkplain #getContext()}  instead.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getContext();'"
	 * @generated
	 */
	String context();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@linkplain #getDocument()}  instead.
	 * <!-- end-model-doc -->
	 * @model type="fr.jmini.eadoc.Document" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDocument();'"
	 * @generated
	 */
	Document document();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #getAttribute(Object, Object, boolean)} instead
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" defaultValueUnique="false" inheritUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAttribute(name, defaultValue, inherit);'"
	 * @generated
	 */
	Object getAttr(Object name, Object defaultValue, boolean inherit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #getAttribute(Object, Object)} instead
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" defaultValueUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAttribute(name, defaultValue);'"
	 * @generated
	 */
	Object getAttr(Object name, Object defaultValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #getAttribute(Object)} instead
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAttribute(name);'"
	 * @generated
	 */
	Object getAttr(Object name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" defaultValueUnique="false" inheritUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	Object getAttribute(Object name, Object defaultValue, boolean inherit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" defaultValueUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.Object%> _xifexpression = null;\nboolean _containsKey = this.getAttributes().containsKey(name);\nif (_containsKey)\n{\n\t_xifexpression = this.getAttributes().get(name);\n}\nelse\n{\n\t_xifexpression = defaultValue;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	Object getAttribute(Object name, Object defaultValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAttributes().get(name);'"
	 * @generated
	 */
	Object getAttribute(Object name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #hasAttribute(Object)} instead
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.hasAttribute(name);'"
	 * @generated
	 */
	boolean hasAttr(Object name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #hasAttribute(Object, boolean)} instead
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" inheritedUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.hasAttribute(name, inherited);'"
	 * @generated
	 */
	boolean hasAttr(Object name, boolean inherited);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAttributes().containsKey(name);'"
	 * @generated
	 */
	boolean hasAttribute(Object name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" inheritedUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean hasAttribute(Object name, boolean inherited);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #isAttribute(Object, Object)} instead.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" expectedUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isAttribute(name, expected);'"
	 * @generated
	 */
	boolean isAttr(Object name, Object expected);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #isAttribute(Object, Object, boolean)} instead.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" expectedUnique="false" inheritUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isAttr(Object name, Object expected, boolean inherit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" expectedUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return expected.equals(this.getAttribute(name));'"
	 * @generated
	 */
	boolean isAttribute(Object name, Object expected);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" expectedUnique="false" inheritUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isAttribute(Object name, Object expected, boolean inherit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@link #setAttribute(Object, Object, boolean)} instead.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false" valueUnique="false" overwriteUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.setAttribute(name, value, overwrite);'"
	 * @generated
	 */
	boolean setAttr(Object name, Object value, boolean overwrite);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" valueUnique="false" overwriteUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean setAttribute(Object name, Object value, boolean overwrite);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isOption(Object name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" roleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getRoles().contains(role);'"
	 * @generated
	 */
	boolean hasRole(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String getRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Use {@linkplain #getRole()}  instead.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getRole();'"
	 * @generated
	 */
	String role();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getRoles().add(role);'"
	 * @generated
	 */
	void addRole(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getRoles().remove(role);'"
	 * @generated
	 */
	void removeRole(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	boolean isReftext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String getReftext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String iconUri(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" targetUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String mediaUri(String target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" targetImageUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String imageUri(String targetImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" targetImageUnique="false" assetDirKeyUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String imageUri(String targetImage, String assetDirKey);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" optsDataType="fr.jmini.eadoc.ObjectObjectMap" optsUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String readAsset(String path, Map<Object, Object> opts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" startUnique="false" preserveUriTargetUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new <%java.lang.UnsupportedOperationException%>(\"Not implemented\");'"
	 * @generated
	 */
	String normalizeWebPath(String path, String start, boolean preserveUriTarget);

} // EContentNode
