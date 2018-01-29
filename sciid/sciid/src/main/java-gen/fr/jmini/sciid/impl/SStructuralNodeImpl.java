/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SCursor;
import fr.jmini.sciid.SStructuralNode;
import fr.jmini.sciid.SciidPackage;
import fr.jmini.sciid.SciidUtility;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.StructuralNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SStructural Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getContentModel <em>Content Model</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SStructuralNodeImpl#getSubstitutions <em>Substitutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SStructuralNodeImpl extends SContentNodeImpl implements SStructuralNode {
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
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralNode> blocks;

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
	 * The default value of the '{@link #getContentModel() <em>Content Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentModel()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentModel() <em>Content Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentModel()
	 * @generated
	 * @ordered
	 */
	protected String contentModel = CONTENT_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceLocation() <em>Source Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected SCursor sourceLocation;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> substitutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SStructuralNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SSTRUCTURAL_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__CAPTION, oldCaption, caption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralNode> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<StructuralNode>(SStructuralNode.class, this, SciidPackage.SSTRUCTURAL_NODE__BLOCKS);
		}
		return blocks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentModel() {
		return contentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentModel(String newContentModel) {
		String oldContentModel = contentModel;
		contentModel = newContentModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__CONTENT_MODEL, oldContentModel, contentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCursor getSourceLocation() {
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLocation(SCursor newSourceLocation, NotificationChain msgs) {
		SCursor oldSourceLocation = sourceLocation;
		sourceLocation = newSourceLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION, oldSourceLocation, newSourceLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLocation(SCursor newSourceLocation) {
		if (newSourceLocation != sourceLocation) {
			NotificationChain msgs = null;
			if (sourceLocation != null)
				msgs = ((InternalEObject)sourceLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION, null, msgs);
			if (newSourceLocation != null)
				msgs = ((InternalEObject)newSourceLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION, null, msgs);
			msgs = basicSetSourceLocation(newSourceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION, newSourceLocation, newSourceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EDataTypeEList<String>(String.class, this, SciidPackage.SSTRUCTURAL_NODE__SUBSTITUTIONS);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String title() {
		return this.getTitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String style() {
		return this.getStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<StructuralNode> blocks() {
		return this.getBlocks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void append(final StructuralNode block) {
		this.getBlocks().add(SciidUtility.convertStructuralNode(block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object content() {
		return this.getContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContent() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convert() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<StructuralNode> findBy(final Map<Object, Object> selector) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutionEnabled(final String substitution) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSubstitution(final String substitution) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSubstitution(final String substitution) {
		this.getSubstitutions().add(substitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prependSubstitution(final String substitution) {
		this.getSubstitutions().add(0, substitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutions(final String... substitution) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SSTRUCTURAL_NODE__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION:
				return basicSetSourceLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SciidPackage.SSTRUCTURAL_NODE__TITLE:
				return getTitle();
			case SciidPackage.SSTRUCTURAL_NODE__CAPTION:
				return getCaption();
			case SciidPackage.SSTRUCTURAL_NODE__STYLE:
				return getStyle();
			case SciidPackage.SSTRUCTURAL_NODE__BLOCKS:
				return getBlocks();
			case SciidPackage.SSTRUCTURAL_NODE__LEVEL:
				return getLevel();
			case SciidPackage.SSTRUCTURAL_NODE__CONTENT_MODEL:
				return getContentModel();
			case SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION:
				return getSourceLocation();
			case SciidPackage.SSTRUCTURAL_NODE__SUBSTITUTIONS:
				return getSubstitutions();
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
			case SciidPackage.SSTRUCTURAL_NODE__TITLE:
				setTitle((String)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__CAPTION:
				setCaption((String)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__STYLE:
				setStyle((String)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends SStructuralNode>)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__LEVEL:
				setLevel((Integer)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__CONTENT_MODEL:
				setContentModel((String)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION:
				setSourceLocation((SCursor)newValue);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__SUBSTITUTIONS:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection<? extends String>)newValue);
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
			case SciidPackage.SSTRUCTURAL_NODE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__BLOCKS:
				getBlocks().clear();
				return;
			case SciidPackage.SSTRUCTURAL_NODE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__CONTENT_MODEL:
				setContentModel(CONTENT_MODEL_EDEFAULT);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION:
				setSourceLocation((SCursor)null);
				return;
			case SciidPackage.SSTRUCTURAL_NODE__SUBSTITUTIONS:
				getSubstitutions().clear();
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
			case SciidPackage.SSTRUCTURAL_NODE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SciidPackage.SSTRUCTURAL_NODE__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case SciidPackage.SSTRUCTURAL_NODE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SciidPackage.SSTRUCTURAL_NODE__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case SciidPackage.SSTRUCTURAL_NODE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case SciidPackage.SSTRUCTURAL_NODE__CONTENT_MODEL:
				return CONTENT_MODEL_EDEFAULT == null ? contentModel != null : !CONTENT_MODEL_EDEFAULT.equals(contentModel);
			case SciidPackage.SSTRUCTURAL_NODE__SOURCE_LOCATION:
				return sourceLocation != null;
			case SciidPackage.SSTRUCTURAL_NODE__SUBSTITUTIONS:
				return substitutions != null && !substitutions.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", caption: ");
		result.append(caption);
		result.append(", style: ");
		result.append(style);
		result.append(", level: ");
		result.append(level);
		result.append(", contentModel: ");
		result.append(contentModel);
		result.append(", substitutions: ");
		result.append(substitutions);
		result.append(')');
		return result.toString();
	}

} //SStructuralNodeImpl
