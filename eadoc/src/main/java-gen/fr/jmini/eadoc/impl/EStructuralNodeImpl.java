/**
 */
package fr.jmini.eadoc.impl;

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

import fr.jmini.eadoc.ECursor;
import fr.jmini.eadoc.EStructuralNode;
import fr.jmini.eadoc.EadocPackage;
import fr.jmini.eadoc.EadocUtility;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>EStructural Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getTitle
 * <em>Title</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getStyle
 * <em>Style</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getBlocks
 * <em>Blocks</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getLevel
 * <em>Level</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getSourceLocation
 * <em>Source Location</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EStructuralNodeImpl#getSubstitutions
 * <em>Substitutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStructuralNodeImpl extends EContentNodeImpl implements EStructuralNode {
    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final String STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected String style = STYLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBlocks()
     * @generated
     * @ordered
     */
    protected EList<EStructuralNode> blocks;

    /**
     * The default value of the '{@link #getLevel() <em>Level</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected static final int LEVEL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected int level = LEVEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getSourceLocation() <em>Source
     * Location</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getSourceLocation()
     * @generated
     * @ordered
     */
    protected ECursor sourceLocation;

    /**
     * The cached value of the '{@link #getSubstitutions() <em>Substitutions</em>}'
     * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSubstitutions()
     * @generated
     * @ordered
     */
    protected EList<String> substitutions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EStructuralNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EadocPackage.Literals.ESTRUCTURAL_NODE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURAL_NODE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setStyle(String newStyle) {
        String oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURAL_NODE__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<EStructuralNode> getBlocks() {
        if (blocks == null) {
            blocks = new EObjectContainmentEList<EStructuralNode>(EStructuralNode.class, this, EadocPackage.ESTRUCTURAL_NODE__BLOCKS);
        }
        return blocks;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getLevel() {
        return level;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLevel(int newLevel) {
        int oldLevel = level;
        level = newLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURAL_NODE__LEVEL, oldLevel, level));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ECursor getSourceLocation() {
        return sourceLocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSourceLocation(ECursor newSourceLocation, NotificationChain msgs) {
        ECursor oldSourceLocation = sourceLocation;
        sourceLocation = newSourceLocation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION, oldSourceLocation, newSourceLocation);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSourceLocation(ECursor newSourceLocation) {
        if (newSourceLocation != sourceLocation) {
            NotificationChain msgs = null;
            if (sourceLocation != null)
                msgs = ((InternalEObject) sourceLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION, null, msgs);
            if (newSourceLocation != null)
                msgs = ((InternalEObject) newSourceLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION, null, msgs);
            msgs = basicSetSourceLocation(newSourceLocation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION, newSourceLocation, newSourceLocation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<String> getSubstitutions() {
        if (substitutions == null) {
            substitutions = new EDataTypeEList<String>(String.class, this, EadocPackage.ESTRUCTURAL_NODE__SUBSTITUTIONS);
        }
        return substitutions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String title() {
        return this.getTitle();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String style() {
        return this.getStyle();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public List<? extends StructuralNode> blocks() {
        return this.getBlocks();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void append(final StructuralNode block) {
        this.getBlocks().add(EadocUtility.convertStructuralNode(block));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object content() {
        return this.getContent();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object getContent() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convert() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public List<? extends StructuralNode> findBy(final Map<Object, Object> selector) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getContentModel() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSubstitutionEnabled(final String substitution) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void removeSubstitution(final String substitution) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void addSubstitution(final String substitution) {
        this.getSubstitutions().add(substitution);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void prependSubstitution(final String substitution) {
        this.getSubstitutions().add(0, substitution);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSubstitutions(final String... substitution) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EadocPackage.ESTRUCTURAL_NODE__BLOCKS:
            return ((InternalEList<?>) getBlocks()).basicRemove(otherEnd, msgs);
        case EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION:
            return basicSetSourceLocation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EadocPackage.ESTRUCTURAL_NODE__TITLE:
            return getTitle();
        case EadocPackage.ESTRUCTURAL_NODE__STYLE:
            return getStyle();
        case EadocPackage.ESTRUCTURAL_NODE__BLOCKS:
            return getBlocks();
        case EadocPackage.ESTRUCTURAL_NODE__LEVEL:
            return getLevel();
        case EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION:
            return getSourceLocation();
        case EadocPackage.ESTRUCTURAL_NODE__SUBSTITUTIONS:
            return getSubstitutions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EadocPackage.ESTRUCTURAL_NODE__TITLE:
            setTitle((String) newValue);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__STYLE:
            setStyle((String) newValue);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__BLOCKS:
            getBlocks().clear();
            getBlocks().addAll((Collection<? extends EStructuralNode>) newValue);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__LEVEL:
            setLevel((Integer) newValue);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION:
            setSourceLocation((ECursor) newValue);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__SUBSTITUTIONS:
            getSubstitutions().clear();
            getSubstitutions().addAll((Collection<? extends String>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case EadocPackage.ESTRUCTURAL_NODE__TITLE:
            setTitle(TITLE_EDEFAULT);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__STYLE:
            setStyle(STYLE_EDEFAULT);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__BLOCKS:
            getBlocks().clear();
            return;
        case EadocPackage.ESTRUCTURAL_NODE__LEVEL:
            setLevel(LEVEL_EDEFAULT);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION:
            setSourceLocation((ECursor) null);
            return;
        case EadocPackage.ESTRUCTURAL_NODE__SUBSTITUTIONS:
            getSubstitutions().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case EadocPackage.ESTRUCTURAL_NODE__TITLE:
            return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
        case EadocPackage.ESTRUCTURAL_NODE__STYLE:
            return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
        case EadocPackage.ESTRUCTURAL_NODE__BLOCKS:
            return blocks != null && !blocks.isEmpty();
        case EadocPackage.ESTRUCTURAL_NODE__LEVEL:
            return level != LEVEL_EDEFAULT;
        case EadocPackage.ESTRUCTURAL_NODE__SOURCE_LOCATION:
            return sourceLocation != null;
        case EadocPackage.ESTRUCTURAL_NODE__SUBSTITUTIONS:
            return substitutions != null && !substitutions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (title: ");
        result.append(title);
        result.append(", style: ");
        result.append(style);
        result.append(", level: ");
        result.append(level);
        result.append(", substitutions: ");
        result.append(substitutions);
        result.append(')');
        return result.toString();
    }
} // EStructuralNodeImpl
