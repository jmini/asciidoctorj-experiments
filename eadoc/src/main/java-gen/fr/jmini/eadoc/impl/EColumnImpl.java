/**
 */
package fr.jmini.eadoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.jmini.eadoc.EColumn;
import fr.jmini.eadoc.EHorizontalAlignment;
import fr.jmini.eadoc.ETable;
import fr.jmini.eadoc.EVerticalAlignment;
import fr.jmini.eadoc.EadocPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>EColumn</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.jmini.eadoc.impl.EColumnImpl#getStyle <em>Style</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EColumnImpl#getTable <em>Table</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EColumnImpl#getWidth <em>Width</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EColumnImpl#getHAlignment
 * <em>HAlignment</em>}</li>
 * <li>{@link fr.jmini.eadoc.impl.EColumnImpl#getVAlignment
 * <em>VAlignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EColumnImpl extends EContentNodeImpl implements EColumn {
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
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final int WIDTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected int width = WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #getHAlignment() <em>HAlignment</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getHAlignment()
     * @generated
     * @ordered
     */
    protected static final EHorizontalAlignment HALIGNMENT_EDEFAULT = EHorizontalAlignment.LEFT;

    /**
     * The cached value of the '{@link #getHAlignment() <em>HAlignment</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getHAlignment()
     * @generated
     * @ordered
     */
    protected EHorizontalAlignment hAlignment = HALIGNMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getVAlignment() <em>VAlignment</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVAlignment()
     * @generated
     * @ordered
     */
    protected static final EVerticalAlignment VALIGNMENT_EDEFAULT = EVerticalAlignment.TOP;

    /**
     * The cached value of the '{@link #getVAlignment() <em>VAlignment</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVAlignment()
     * @generated
     * @ordered
     */
    protected EVerticalAlignment vAlignment = VALIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EColumnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EadocPackage.Literals.ECOLUMN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECOLUMN__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ETable getTable() {
        if (eContainerFeatureID() != EadocPackage.ECOLUMN__TABLE)
            return null;
        return (ETable) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ETable basicGetTable() {
        if (eContainerFeatureID() != EadocPackage.ECOLUMN__TABLE)
            return null;
        return (ETable) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetTable(ETable newTable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newTable, EadocPackage.ECOLUMN__TABLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTable(ETable newTable) {
        if (newTable != eInternalContainer() || (eContainerFeatureID() != EadocPackage.ECOLUMN__TABLE && newTable != null)) {
            if (EcoreUtil.isAncestor(this, newTable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTable != null)
                msgs = ((InternalEObject) newTable).eInverseAdd(this, EadocPackage.ETABLE__COLUMNS, ETable.class, msgs);
            msgs = basicSetTable(newTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECOLUMN__TABLE, newTable, newTable));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setWidth(int newWidth) {
        int oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECOLUMN__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EHorizontalAlignment getHAlignment() {
        return hAlignment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setHAlignment(EHorizontalAlignment newHAlignment) {
        EHorizontalAlignment oldHAlignment = hAlignment;
        hAlignment = newHAlignment == null ? HALIGNMENT_EDEFAULT : newHAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECOLUMN__HALIGNMENT, oldHAlignment, hAlignment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EVerticalAlignment getVAlignment() {
        return vAlignment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setVAlignment(EVerticalAlignment newVAlignment) {
        EVerticalAlignment oldVAlignment = vAlignment;
        vAlignment = newVAlignment == null ? VALIGNMENT_EDEFAULT : newVAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECOLUMN__VALIGNMENT, oldVAlignment, vAlignment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getColumnNumber() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EadocPackage.ECOLUMN__TABLE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTable((ETable) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EadocPackage.ECOLUMN__TABLE:
            return basicSetTable(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case EadocPackage.ECOLUMN__TABLE:
            return eInternalContainer().eInverseRemove(this, EadocPackage.ETABLE__COLUMNS, ETable.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case EadocPackage.ECOLUMN__STYLE:
            return getStyle();
        case EadocPackage.ECOLUMN__TABLE:
            if (resolve)
                return getTable();
            return basicGetTable();
        case EadocPackage.ECOLUMN__WIDTH:
            return getWidth();
        case EadocPackage.ECOLUMN__HALIGNMENT:
            return getHAlignment();
        case EadocPackage.ECOLUMN__VALIGNMENT:
            return getVAlignment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case EadocPackage.ECOLUMN__STYLE:
            setStyle((String) newValue);
            return;
        case EadocPackage.ECOLUMN__TABLE:
            setTable((ETable) newValue);
            return;
        case EadocPackage.ECOLUMN__WIDTH:
            setWidth((Integer) newValue);
            return;
        case EadocPackage.ECOLUMN__HALIGNMENT:
            setHAlignment((EHorizontalAlignment) newValue);
            return;
        case EadocPackage.ECOLUMN__VALIGNMENT:
            setVAlignment((EVerticalAlignment) newValue);
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
        case EadocPackage.ECOLUMN__STYLE:
            setStyle(STYLE_EDEFAULT);
            return;
        case EadocPackage.ECOLUMN__TABLE:
            setTable((ETable) null);
            return;
        case EadocPackage.ECOLUMN__WIDTH:
            setWidth(WIDTH_EDEFAULT);
            return;
        case EadocPackage.ECOLUMN__HALIGNMENT:
            setHAlignment(HALIGNMENT_EDEFAULT);
            return;
        case EadocPackage.ECOLUMN__VALIGNMENT:
            setVAlignment(VALIGNMENT_EDEFAULT);
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
        case EadocPackage.ECOLUMN__STYLE:
            return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
        case EadocPackage.ECOLUMN__TABLE:
            return basicGetTable() != null;
        case EadocPackage.ECOLUMN__WIDTH:
            return width != WIDTH_EDEFAULT;
        case EadocPackage.ECOLUMN__HALIGNMENT:
            return hAlignment != HALIGNMENT_EDEFAULT;
        case EadocPackage.ECOLUMN__VALIGNMENT:
            return vAlignment != VALIGNMENT_EDEFAULT;
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
        result.append(" (style: ");
        result.append(style);
        result.append(", width: ");
        result.append(width);
        result.append(", hAlignment: ");
        result.append(hAlignment);
        result.append(", vAlignment: ");
        result.append(vAlignment);
        result.append(')');
        return result.toString();
    }
    @Override
    public org.asciidoctor.ast.Table.HorizontalAlignment getHorizontalAlignment() {
        return fr.jmini.eadoc.EadocUtility.convertEHorizontalAlignment(getHAlignment());
    }

    @Override
    public org.asciidoctor.ast.Table.VerticalAlignment getVerticalAlignment() {
        return fr.jmini.eadoc.EadocUtility.convertEVerticalAlignment(getVAlignment());
    }

    @Override
    public void setHorizontalAlignment(org.asciidoctor.ast.Table.HorizontalAlignment a) {
        setHAlignment(fr.jmini.eadoc.EadocUtility.convertHorizontalAlignment(a));
    }

    @Override
    public void setVerticalAlignment(org.asciidoctor.ast.Table.VerticalAlignment a) {
        setVAlignment(fr.jmini.eadoc.EadocUtility.convertVerticalAlignment(a));
    }

    @Override
    public org.asciidoctor.ast.Table.HorizontalAlignment getHorizontalAlignment() {
        return fr.jmini.eadoc.EadocUtility.convertEHorizontalAlignment(getHAlignment());
    }

    @Override
    public org.asciidoctor.ast.Table.VerticalAlignment getVerticalAlignment() {
        return fr.jmini.eadoc.EadocUtility.convertEVerticalAlignment(getVAlignment());
    }

    @Override
    public void setHorizontalAlignment(org.asciidoctor.ast.Table.HorizontalAlignment a) {
        setHAlignment(fr.jmini.eadoc.EadocUtility.convertHorizontalAlignment(a));
    }

    @Override
    public void setVerticalAlignment(org.asciidoctor.ast.Table.VerticalAlignment a) {
        setVAlignment(fr.jmini.eadoc.EadocUtility.convertVerticalAlignment(a));
    }
} // EColumnImpl
