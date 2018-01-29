/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SColumn;
import fr.jmini.sciid.STable;
import fr.jmini.sciid.SciidPackage;

import org.asciidoctor.ast.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SColumn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SColumnImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SColumnImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SColumnImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SColumnImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SColumnImpl extends SContentNodeImpl implements SColumn {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Table.HorizontalAlignment HORIZONTAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Table.HorizontalAlignment horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Table.VerticalAlignment VERTICAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Table.VerticalAlignment verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SCOLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCOLUMN__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STable getTable() {
		if (eContainerFeatureID() != SciidPackage.SCOLUMN__TABLE) return null;
		return (STable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STable basicGetTable() {
		if (eContainerFeatureID() != SciidPackage.SCOLUMN__TABLE) return null;
		return (STable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(STable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, SciidPackage.SCOLUMN__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(STable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != SciidPackage.SCOLUMN__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, SciidPackage.STABLE__COLUMNS, STable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCOLUMN__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCOLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table.HorizontalAlignment getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(Table.HorizontalAlignment newHorizontalAlignment) {
		Table.HorizontalAlignment oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCOLUMN__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table.VerticalAlignment getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(Table.VerticalAlignment newVerticalAlignment) {
		Table.VerticalAlignment oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCOLUMN__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnNumber() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SCOLUMN__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((STable)otherEnd, msgs);
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
			case SciidPackage.SCOLUMN__TABLE:
				return basicSetTable(null, msgs);
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
			case SciidPackage.SCOLUMN__TABLE:
				return eInternalContainer().eInverseRemove(this, SciidPackage.STABLE__COLUMNS, STable.class, msgs);
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
			case SciidPackage.SCOLUMN__STYLE:
				return getStyle();
			case SciidPackage.SCOLUMN__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case SciidPackage.SCOLUMN__WIDTH:
				return getWidth();
			case SciidPackage.SCOLUMN__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case SciidPackage.SCOLUMN__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SciidPackage.SCOLUMN__STYLE:
				setStyle((String)newValue);
				return;
			case SciidPackage.SCOLUMN__TABLE:
				setTable((STable)newValue);
				return;
			case SciidPackage.SCOLUMN__WIDTH:
				setWidth((Integer)newValue);
				return;
			case SciidPackage.SCOLUMN__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Table.HorizontalAlignment)newValue);
				return;
			case SciidPackage.SCOLUMN__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Table.VerticalAlignment)newValue);
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
			case SciidPackage.SCOLUMN__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SciidPackage.SCOLUMN__TABLE:
				setTable((STable)null);
				return;
			case SciidPackage.SCOLUMN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SciidPackage.SCOLUMN__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case SciidPackage.SCOLUMN__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
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
			case SciidPackage.SCOLUMN__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SciidPackage.SCOLUMN__TABLE:
				return basicGetTable() != null;
			case SciidPackage.SCOLUMN__WIDTH:
				return width != WIDTH_EDEFAULT;
			case SciidPackage.SCOLUMN__HORIZONTAL_ALIGNMENT:
				return HORIZONTAL_ALIGNMENT_EDEFAULT == null ? horizontalAlignment != null : !HORIZONTAL_ALIGNMENT_EDEFAULT.equals(horizontalAlignment);
			case SciidPackage.SCOLUMN__VERTICAL_ALIGNMENT:
				return VERTICAL_ALIGNMENT_EDEFAULT == null ? verticalAlignment != null : !VERTICAL_ALIGNMENT_EDEFAULT.equals(verticalAlignment);
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
		result.append(" (style: ");
		result.append(style);
		result.append(", width: ");
		result.append(width);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(')');
		return result.toString();
	}

} //SColumnImpl
