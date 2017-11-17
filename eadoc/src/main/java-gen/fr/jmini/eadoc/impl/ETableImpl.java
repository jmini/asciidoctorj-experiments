/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EColumn;
import fr.jmini.eadoc.ETable;
import fr.jmini.eadoc.EadocPackage;

import java.util.Collection;

import org.asciidoctor.ast.Row;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#isHeaderOption <em>Header Option</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ETableImpl#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETableImpl extends EStructuralNodeImpl implements ETable {
	/**
	 * The default value of the '{@link #isHeaderOption() <em>Header Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeaderOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeaderOption() <em>Header Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeaderOption()
	 * @generated
	 * @ordered
	 */
	protected boolean headerOption = HEADER_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<EColumn> columns;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> header;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> footer;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> body;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected String frame = FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected static final String GRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected String grid = GRID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.ETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeaderOption() {
		return headerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderOption(boolean newHeaderOption) {
		boolean oldHeaderOption = headerOption;
		headerOption = newHeaderOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ETABLE__HEADER_OPTION, oldHeaderOption, headerOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<EColumn>(EColumn.class, this, EadocPackage.ETABLE__COLUMNS, EadocPackage.ECOLUMN__TABLE);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<Row>(Row.class, this, EadocPackage.ETABLE__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getFooter() {
		if (footer == null) {
			footer = new EObjectContainmentEList<Row>(Row.class, this, EadocPackage.ETABLE__FOOTER);
		}
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Row>(Row.class, this, EadocPackage.ETABLE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(String newFrame) {
		String oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ETABLE__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(String newGrid) {
		String oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ETABLE__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasHeaderOption() {
		return this.isHeaderOption();
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
			case EadocPackage.ETABLE__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
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
			case EadocPackage.ETABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case EadocPackage.ETABLE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case EadocPackage.ETABLE__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
			case EadocPackage.ETABLE__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case EadocPackage.ETABLE__HEADER_OPTION:
				return isHeaderOption();
			case EadocPackage.ETABLE__COLUMNS:
				return getColumns();
			case EadocPackage.ETABLE__HEADER:
				return getHeader();
			case EadocPackage.ETABLE__FOOTER:
				return getFooter();
			case EadocPackage.ETABLE__BODY:
				return getBody();
			case EadocPackage.ETABLE__FRAME:
				return getFrame();
			case EadocPackage.ETABLE__GRID:
				return getGrid();
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
			case EadocPackage.ETABLE__HEADER_OPTION:
				setHeaderOption((Boolean)newValue);
				return;
			case EadocPackage.ETABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends EColumn>)newValue);
				return;
			case EadocPackage.ETABLE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends Row>)newValue);
				return;
			case EadocPackage.ETABLE__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends Row>)newValue);
				return;
			case EadocPackage.ETABLE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Row>)newValue);
				return;
			case EadocPackage.ETABLE__FRAME:
				setFrame((String)newValue);
				return;
			case EadocPackage.ETABLE__GRID:
				setGrid((String)newValue);
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
			case EadocPackage.ETABLE__HEADER_OPTION:
				setHeaderOption(HEADER_OPTION_EDEFAULT);
				return;
			case EadocPackage.ETABLE__COLUMNS:
				getColumns().clear();
				return;
			case EadocPackage.ETABLE__HEADER:
				getHeader().clear();
				return;
			case EadocPackage.ETABLE__FOOTER:
				getFooter().clear();
				return;
			case EadocPackage.ETABLE__BODY:
				getBody().clear();
				return;
			case EadocPackage.ETABLE__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
			case EadocPackage.ETABLE__GRID:
				setGrid(GRID_EDEFAULT);
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
			case EadocPackage.ETABLE__HEADER_OPTION:
				return headerOption != HEADER_OPTION_EDEFAULT;
			case EadocPackage.ETABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case EadocPackage.ETABLE__HEADER:
				return header != null && !header.isEmpty();
			case EadocPackage.ETABLE__FOOTER:
				return footer != null && !footer.isEmpty();
			case EadocPackage.ETABLE__BODY:
				return body != null && !body.isEmpty();
			case EadocPackage.ETABLE__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
			case EadocPackage.ETABLE__GRID:
				return GRID_EDEFAULT == null ? grid != null : !GRID_EDEFAULT.equals(grid);
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
		result.append(" (headerOption: ");
		result.append(headerOption);
		result.append(", frame: ");
		result.append(frame);
		result.append(", grid: ");
		result.append(grid);
		result.append(')');
		return result.toString();
	}

} //ETableImpl
