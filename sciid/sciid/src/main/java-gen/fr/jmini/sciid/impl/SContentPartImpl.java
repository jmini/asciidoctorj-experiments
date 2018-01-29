/**
 */
package fr.jmini.sciid.impl;

import org.asciidoctor.ast.ContentPart; import fr.jmini.sciid.SContentPart;
import fr.jmini.sciid.SciidPackage;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SContent Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getRole <em>Role</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SContentPartImpl#getParentPart <em>Parent Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SContentPartImpl extends MinimalEObjectImpl.Container implements SContentPart {
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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> attributes;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentPart> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SContentPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SCONTENT_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> getAttributes() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentPart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<ContentPart>(SContentPart.class, this, SciidPackage.SCONTENT_PART__PARTS, SciidPackage.SCONTENT_PART__PARENT_PART);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SContentPart getParentPart() {
		if (eContainerFeatureID() != SciidPackage.SCONTENT_PART__PARENT_PART) return null;
		return (SContentPart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SContentPart basicGetParentPart() {
		if (eContainerFeatureID() != SciidPackage.SCONTENT_PART__PARENT_PART) return null;
		return (SContentPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPart(SContentPart newParentPart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPart, SciidPackage.SCONTENT_PART__PARENT_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPart(SContentPart newParentPart) {
		if (newParentPart != eInternalContainer() || (eContainerFeatureID() != SciidPackage.SCONTENT_PART__PARENT_PART && newParentPart != null)) {
			if (EcoreUtil.isAncestor(this, newParentPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPart != null)
				msgs = ((InternalEObject)newParentPart).eInverseAdd(this, SciidPackage.SCONTENT_PART__PARTS, SContentPart.class, msgs);
			msgs = basicSetParentPart(newParentPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCONTENT_PART__PARENT_PART, newParentPart, newParentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SCONTENT_PART__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPart((SContentPart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SCONTENT_PART__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				return basicSetParentPart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				return eInternalContainer().eInverseRemove(this, SciidPackage.SCONTENT_PART__PARTS, SContentPart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SciidPackage.SCONTENT_PART__ID:
				return getId();
			case SciidPackage.SCONTENT_PART__LEVEL:
				return getLevel();
			case SciidPackage.SCONTENT_PART__CONTEXT:
				return getContext();
			case SciidPackage.SCONTENT_PART__STYLE:
				return getStyle();
			case SciidPackage.SCONTENT_PART__ROLE:
				return getRole();
			case SciidPackage.SCONTENT_PART__TITLE:
				return getTitle();
			case SciidPackage.SCONTENT_PART__ATTRIBUTES:
				return getAttributes();
			case SciidPackage.SCONTENT_PART__PARTS:
				return getParts();
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				if (resolve) return getParentPart();
				return basicGetParentPart();
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
			case SciidPackage.SCONTENT_PART__ID:
				setId((String)newValue);
				return;
			case SciidPackage.SCONTENT_PART__LEVEL:
				setLevel((Integer)newValue);
				return;
			case SciidPackage.SCONTENT_PART__CONTEXT:
				setContext((String)newValue);
				return;
			case SciidPackage.SCONTENT_PART__STYLE:
				setStyle((String)newValue);
				return;
			case SciidPackage.SCONTENT_PART__ROLE:
				setRole((String)newValue);
				return;
			case SciidPackage.SCONTENT_PART__TITLE:
				setTitle((String)newValue);
				return;
			case SciidPackage.SCONTENT_PART__ATTRIBUTES:
				setAttributes((Map<String, Object>)newValue);
				return;
			case SciidPackage.SCONTENT_PART__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends SContentPart>)newValue);
				return;
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				setParentPart((SContentPart)newValue);
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
			case SciidPackage.SCONTENT_PART__ID:
				setId(ID_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SciidPackage.SCONTENT_PART__ATTRIBUTES:
				setAttributes((Map<String, Object>)null);
				return;
			case SciidPackage.SCONTENT_PART__PARTS:
				getParts().clear();
				return;
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				setParentPart((SContentPart)null);
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
			case SciidPackage.SCONTENT_PART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SciidPackage.SCONTENT_PART__LEVEL:
				return level != LEVEL_EDEFAULT;
			case SciidPackage.SCONTENT_PART__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case SciidPackage.SCONTENT_PART__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SciidPackage.SCONTENT_PART__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SciidPackage.SCONTENT_PART__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SciidPackage.SCONTENT_PART__ATTRIBUTES:
				return attributes != null;
			case SciidPackage.SCONTENT_PART__PARTS:
				return parts != null && !parts.isEmpty();
			case SciidPackage.SCONTENT_PART__PARENT_PART:
				return basicGetParentPart() != null;
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
		result.append(", level: ");
		result.append(level);
		result.append(", context: ");
		result.append(context);
		result.append(", style: ");
		result.append(style);
		result.append(", role: ");
		result.append(role);
		result.append(", title: ");
		result.append(title);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(')');
		return result.toString();
	}

} //SContentPartImpl
