/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.ECell;
import fr.jmini.eadoc.EColumn;
import fr.jmini.eadoc.ERow;
import fr.jmini.eadoc.EadocPackage;

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
 * An implementation of the model object '<em><b>ECell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getRow <em>Row</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ECellImpl#getInnerDocument <em>Inner Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECellImpl extends EContentNodeImpl implements ECell {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EColumn column;

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
	protected ECellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.ECELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERow getRow() {
		if (eContainerFeatureID() != EadocPackage.ECELL__ROW) return null;
		return (ERow)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERow basicGetRow() {
		if (eContainerFeatureID() != EadocPackage.ECELL__ROW) return null;
		return (ERow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(ERow newRow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRow, EadocPackage.ECELL__ROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(ERow newRow) {
		if (newRow != eInternalContainer() || (eContainerFeatureID() != EadocPackage.ECELL__ROW && newRow != null)) {
			if (EcoreUtil.isAncestor(this, newRow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRow != null)
				msgs = ((InternalEObject)newRow).eInverseAdd(this, EadocPackage.EROW__CELLS, ERow.class, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EColumn getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (EColumn)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ECELL__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EColumn basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(EColumn newColumn) {
		EColumn oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__COLUMN, oldColumn, column));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__COLSPAN, oldColspan, colspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__ROWSPAN, oldRowspan, rowspan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__INNER_DOCUMENT, oldInnerDocument, newInnerDocument);
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
				msgs = ((InternalEObject)innerDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EadocPackage.ECELL__INNER_DOCUMENT, null, msgs);
			if (newInnerDocument != null)
				msgs = ((InternalEObject)newInnerDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EadocPackage.ECELL__INNER_DOCUMENT, null, msgs);
			msgs = basicSetInnerDocument(newInnerDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ECELL__INNER_DOCUMENT, newInnerDocument, newInnerDocument));
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
			case EadocPackage.ECELL__ROW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRow((ERow)otherEnd, msgs);
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
			case EadocPackage.ECELL__ROW:
				return basicSetRow(null, msgs);
			case EadocPackage.ECELL__INNER_DOCUMENT:
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
			case EadocPackage.ECELL__ROW:
				return eInternalContainer().eInverseRemove(this, EadocPackage.EROW__CELLS, ERow.class, msgs);
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
			case EadocPackage.ECELL__ROW:
				if (resolve) return getRow();
				return basicGetRow();
			case EadocPackage.ECELL__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case EadocPackage.ECELL__COLSPAN:
				return getColspan();
			case EadocPackage.ECELL__ROWSPAN:
				return getRowspan();
			case EadocPackage.ECELL__SOURCE:
				return getSource();
			case EadocPackage.ECELL__STYLE:
				return getStyle();
			case EadocPackage.ECELL__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case EadocPackage.ECELL__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case EadocPackage.ECELL__INNER_DOCUMENT:
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
			case EadocPackage.ECELL__ROW:
				setRow((ERow)newValue);
				return;
			case EadocPackage.ECELL__COLUMN:
				setColumn((EColumn)newValue);
				return;
			case EadocPackage.ECELL__COLSPAN:
				setColspan((Integer)newValue);
				return;
			case EadocPackage.ECELL__ROWSPAN:
				setRowspan((Integer)newValue);
				return;
			case EadocPackage.ECELL__SOURCE:
				setSource((String)newValue);
				return;
			case EadocPackage.ECELL__STYLE:
				setStyle((String)newValue);
				return;
			case EadocPackage.ECELL__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Table.HorizontalAlignment)newValue);
				return;
			case EadocPackage.ECELL__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Table.VerticalAlignment)newValue);
				return;
			case EadocPackage.ECELL__INNER_DOCUMENT:
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
			case EadocPackage.ECELL__ROW:
				setRow((ERow)null);
				return;
			case EadocPackage.ECELL__COLUMN:
				setColumn((EColumn)null);
				return;
			case EadocPackage.ECELL__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case EadocPackage.ECELL__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case EadocPackage.ECELL__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EadocPackage.ECELL__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EadocPackage.ECELL__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case EadocPackage.ECELL__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case EadocPackage.ECELL__INNER_DOCUMENT:
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
			case EadocPackage.ECELL__ROW:
				return basicGetRow() != null;
			case EadocPackage.ECELL__COLUMN:
				return column != null;
			case EadocPackage.ECELL__COLSPAN:
				return colspan != COLSPAN_EDEFAULT;
			case EadocPackage.ECELL__ROWSPAN:
				return rowspan != ROWSPAN_EDEFAULT;
			case EadocPackage.ECELL__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EadocPackage.ECELL__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case EadocPackage.ECELL__HORIZONTAL_ALIGNMENT:
				return HORIZONTAL_ALIGNMENT_EDEFAULT == null ? horizontalAlignment != null : !HORIZONTAL_ALIGNMENT_EDEFAULT.equals(horizontalAlignment);
			case EadocPackage.ECELL__VERTICAL_ALIGNMENT:
				return VERTICAL_ALIGNMENT_EDEFAULT == null ? verticalAlignment != null : !VERTICAL_ALIGNMENT_EDEFAULT.equals(verticalAlignment);
			case EadocPackage.ECELL__INNER_DOCUMENT:
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

} //ECellImpl
