/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EContentNode;
import fr.jmini.eadoc.EadocPackage;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.Document;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EContent Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#isInline <em>Inline</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#isBlock <em>Block</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EContentNodeImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EContentNodeImpl extends MinimalEObjectImpl.Container implements EContentNode {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ContentNode parent;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * The default value of the '{@link #isInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInline()
	 * @generated
	 * @ordered
	 */
	protected boolean inline = INLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean block = BLOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> attributes;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected List<String> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EContentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.ECONTENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeName(String newNodeName) {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__NODE_NAME, oldNodeName, nodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentNode getParent() {
		if (parent != null && ((EObject)parent).eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ContentNode)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ECONTENT_NODE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentNode basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ContentNode newParent) {
		ContentNode oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && ((EObject)document).eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ECONTENT_NODE__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__DOCUMENT, oldDocument, document));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInline() {
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInline(boolean newInline) {
		boolean oldInline = inline;
		inline = newInline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__INLINE, oldInline, inline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(boolean newBlock) {
		boolean oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> getAttributes() {
		if (attributes != null && ((EObject)attributes).eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject)attributes;
			attributes = (Map<String, Object>)eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ECONTENT_NODE__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> basicGetAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Map<String, Object> newAttributes) {
		Map<String, Object> oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<String> getRoles() {
		if (roles != null && ((EObject)roles).eIsProxy()) {
			InternalEObject oldRoles = (InternalEObject)roles;
			roles = (List<String>)eResolveProxy(oldRoles);
			if (roles != oldRoles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ECONTENT_NODE__ROLES, oldRoles, roles));
			}
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> basicGetRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(List<String> newRoles) {
		List<String> oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECONTENT_NODE__ROLES, oldRoles, roles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String id() {
		return this.getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentNode parent() {
		return this.getParent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String context() {
		return this.getContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document document() {
		return this.getDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttr(final Object name, final Object defaultValue, final boolean inherit) {
		return this.getAttribute(name, defaultValue, inherit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttr(final Object name, final Object defaultValue) {
		return this.getAttribute(name, defaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttr(final Object name) {
		return this.getAttribute(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttribute(final Object name, final Object defaultValue, final boolean inherit) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttribute(final Object name, final Object defaultValue) {
		Object _xifexpression = null;
		boolean _containsKey = this.getAttributes().containsKey(name);
		if (_containsKey) {
			_xifexpression = this.getAttributes().get(name);
		}
		else {
			_xifexpression = defaultValue;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttribute(final Object name) {
		return this.getAttributes().get(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttr(final Object name) {
		return this.hasAttribute(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttr(final Object name, final boolean inherited) {
		return this.hasAttribute(name, inherited);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttribute(final Object name) {
		return this.getAttributes().containsKey(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAttribute(final Object name, final boolean inherited) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttr(final Object name, final Object expected) {
		return this.isAttribute(name, expected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttr(final Object name, final Object expected, final boolean inherit) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute(final Object name, final Object expected) {
		return expected.equals(this.getAttribute(name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute(final Object name, final Object expected, final boolean inherit) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean setAttr(final Object name, final Object value, final boolean overwrite) {
		return this.setAttribute(name, value, overwrite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean setAttribute(final Object name, final Object value, final boolean overwrite) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOption(final Object name) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRole() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRole(final String role) {
		return this.getRoles().contains(role);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String role() {
		return this.getRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRole(final String role) {
		this.getRoles().add(role);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRole(final String role) {
		this.getRoles().remove(role);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReftext() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReftext() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String iconUri(final String name) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String mediaUri(final String target) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String imageUri(final String targetImage) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String imageUri(final String targetImage, final String assetDirKey) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String readAsset(final String path, final Map<Object, Object> opts) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeWebPath(final String path, final String start, final boolean preserveUriTarget) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EadocPackage.ECONTENT_NODE__ID:
				return getId();
			case EadocPackage.ECONTENT_NODE__NODE_NAME:
				return getNodeName();
			case EadocPackage.ECONTENT_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case EadocPackage.ECONTENT_NODE__CONTEXT:
				return getContext();
			case EadocPackage.ECONTENT_NODE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case EadocPackage.ECONTENT_NODE__INLINE:
				return isInline();
			case EadocPackage.ECONTENT_NODE__BLOCK:
				return isBlock();
			case EadocPackage.ECONTENT_NODE__ATTRIBUTES:
				if (resolve) return getAttributes();
				return basicGetAttributes();
			case EadocPackage.ECONTENT_NODE__ROLES:
				if (resolve) return getRoles();
				return basicGetRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EadocPackage.ECONTENT_NODE__ID:
				setId((String)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__PARENT:
				setParent((ContentNode)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__CONTEXT:
				setContext((String)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__INLINE:
				setInline((Boolean)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__BLOCK:
				setBlock((Boolean)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__ATTRIBUTES:
				setAttributes((Map<String, Object>)newValue);
				return;
			case EadocPackage.ECONTENT_NODE__ROLES:
				setRoles((List<String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EadocPackage.ECONTENT_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case EadocPackage.ECONTENT_NODE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case EadocPackage.ECONTENT_NODE__PARENT:
				setParent((ContentNode)null);
				return;
			case EadocPackage.ECONTENT_NODE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case EadocPackage.ECONTENT_NODE__DOCUMENT:
				setDocument((Document)null);
				return;
			case EadocPackage.ECONTENT_NODE__INLINE:
				setInline(INLINE_EDEFAULT);
				return;
			case EadocPackage.ECONTENT_NODE__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case EadocPackage.ECONTENT_NODE__ATTRIBUTES:
				setAttributes((Map<String, Object>)null);
				return;
			case EadocPackage.ECONTENT_NODE__ROLES:
				setRoles((List<String>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EadocPackage.ECONTENT_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EadocPackage.ECONTENT_NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case EadocPackage.ECONTENT_NODE__PARENT:
				return parent != null;
			case EadocPackage.ECONTENT_NODE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case EadocPackage.ECONTENT_NODE__DOCUMENT:
				return document != null;
			case EadocPackage.ECONTENT_NODE__INLINE:
				return inline != INLINE_EDEFAULT;
			case EadocPackage.ECONTENT_NODE__BLOCK:
				return block != BLOCK_EDEFAULT;
			case EadocPackage.ECONTENT_NODE__ATTRIBUTES:
				return attributes != null;
			case EadocPackage.ECONTENT_NODE__ROLES:
				return roles != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", nodeName: ");
		result.append(nodeName);
		result.append(", context: ");
		result.append(context);
		result.append(", inline: ");
		result.append(inline);
		result.append(", block: ");
		result.append(block);
		result.append(')');
		return result.toString();
	}

} //EContentNodeImpl
