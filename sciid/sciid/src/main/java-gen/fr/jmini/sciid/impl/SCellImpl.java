/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SCell;
import fr.jmini.sciid.SColumn;
import fr.jmini.sciid.SRow;
import fr.jmini.sciid.SciidPackage;

import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getRow <em>Row</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SCellImpl#getInnerDocument <em>Inner Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCellImpl extends SContentNodeImpl implements SCell {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected SColumn column;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final int COLSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected int colspan = COLSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected int rowspan = ROWSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

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
	 * The cached value of the '{@link #getInnerDocument() <em>Inner Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDocument()
	 * @generated
	 * @ordered
	 */
	protected Document innerDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SCELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRow getRow() {
		if (eContainerFeatureID() != SciidPackage.SCELL__ROW) return null;
		return (SRow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRow basicGetRow() {
		if (eContainerFeatureID() != SciidPackage.SCELL__ROW) return null;
		return (SRow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(SRow newRow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRow, SciidPackage.SCELL__ROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(SRow newRow) {
		if (newRow != eInternalContainer() || (eContainerFeatureID() != SciidPackage.SCELL__ROW && newRow != null)) {
			if (EcoreUtil.isAncestor(this, newRow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRow != null)
				msgs = ((InternalEObject)newRow).eInverseAdd(this, SciidPackage.SROW__CELLS, SRow.class, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SColumn getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (SColumn)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SciidPackage.SCELL__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SColumn basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(SColumn newColumn) {
		SColumn oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(int newColspan) {
		int oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__COLSPAN, oldColspan, colspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(int newRowspan) {
		int oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getInnerDocument() {
		return innerDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerDocument(Document newInnerDocument, NotificationChain msgs) {
		Document oldInnerDocument = innerDocument;
		innerDocument = newInnerDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__INNER_DOCUMENT, oldInnerDocument, newInnerDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerDocument(Document newInnerDocument) {
		if (newInnerDocument != innerDocument) {
			NotificationChain msgs = null;
			if (innerDocument != null)
				msgs = ((InternalEObject)innerDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SCELL__INNER_DOCUMENT, null, msgs);
			if (newInnerDocument != null)
				msgs = ((InternalEObject)newInnerDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SCELL__INNER_DOCUMENT, null, msgs);
			msgs = basicSetInnerDocument(newInnerDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SCELL__INNER_DOCUMENT, newInnerDocument, newInnerDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContent() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SCELL__ROW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRow((SRow)otherEnd, msgs);
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
			case SciidPackage.SCELL__ROW:
				return basicSetRow(null, msgs);
			case SciidPackage.SCELL__INNER_DOCUMENT:
				return basicSetInnerDocument(null, msgs);
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
			case SciidPackage.SCELL__ROW:
				return eInternalContainer().eInverseRemove(this, SciidPackage.SROW__CELLS, SRow.class, msgs);
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
			case SciidPackage.SCELL__ROW:
				if (resolve) return getRow();
				return basicGetRow();
			case SciidPackage.SCELL__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case SciidPackage.SCELL__COLSPAN:
				return getColspan();
			case SciidPackage.SCELL__ROWSPAN:
				return getRowspan();
			case SciidPackage.SCELL__SOURCE:
				return getSource();
			case SciidPackage.SCELL__STYLE:
				return getStyle();
			case SciidPackage.SCELL__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case SciidPackage.SCELL__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case SciidPackage.SCELL__INNER_DOCUMENT:
				return getInnerDocument();
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
			case SciidPackage.SCELL__ROW:
				setRow((SRow)newValue);
				return;
			case SciidPackage.SCELL__COLUMN:
				setColumn((SColumn)newValue);
				return;
			case SciidPackage.SCELL__COLSPAN:
				setColspan((Integer)newValue);
				return;
			case SciidPackage.SCELL__ROWSPAN:
				setRowspan((Integer)newValue);
				return;
			case SciidPackage.SCELL__SOURCE:
				setSource((String)newValue);
				return;
			case SciidPackage.SCELL__STYLE:
				setStyle((String)newValue);
				return;
			case SciidPackage.SCELL__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Table.HorizontalAlignment)newValue);
				return;
			case SciidPackage.SCELL__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Table.VerticalAlignment)newValue);
				return;
			case SciidPackage.SCELL__INNER_DOCUMENT:
				setInnerDocument((Document)newValue);
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
			case SciidPackage.SCELL__ROW:
				setRow((SRow)null);
				return;
			case SciidPackage.SCELL__COLUMN:
				setColumn((SColumn)null);
				return;
			case SciidPackage.SCELL__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case SciidPackage.SCELL__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case SciidPackage.SCELL__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case SciidPackage.SCELL__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SciidPackage.SCELL__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case SciidPackage.SCELL__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case SciidPackage.SCELL__INNER_DOCUMENT:
				setInnerDocument((Document)null);
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
			case SciidPackage.SCELL__ROW:
				return basicGetRow() != null;
			case SciidPackage.SCELL__COLUMN:
				return column != null;
			case SciidPackage.SCELL__COLSPAN:
				return colspan != COLSPAN_EDEFAULT;
			case SciidPackage.SCELL__ROWSPAN:
				return rowspan != ROWSPAN_EDEFAULT;
			case SciidPackage.SCELL__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case SciidPackage.SCELL__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SciidPackage.SCELL__HORIZONTAL_ALIGNMENT:
				return HORIZONTAL_ALIGNMENT_EDEFAULT == null ? horizontalAlignment != null : !HORIZONTAL_ALIGNMENT_EDEFAULT.equals(horizontalAlignment);
			case SciidPackage.SCELL__VERTICAL_ALIGNMENT:
				return VERTICAL_ALIGNMENT_EDEFAULT == null ? verticalAlignment != null : !VERTICAL_ALIGNMENT_EDEFAULT.equals(verticalAlignment);
			case SciidPackage.SCELL__INNER_DOCUMENT:
				return innerDocument != null;
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
		result.append(" (colspan: ");
		result.append(colspan);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", source: ");
		result.append(source);
		result.append(", style: ");
		result.append(style);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(')');
		return result.toString();
	}

} //SCellImpl
