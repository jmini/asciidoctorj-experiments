/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SColumn;
import org.asciidoctor.ast.Column; import fr.jmini.sciid.STable;
import fr.jmini.sciid.SciidPackage;

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
 * An implementation of the model object '<em><b>STable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#isHeaderOption <em>Header Option</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STableImpl#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STableImpl extends SStructuralNodeImpl implements STable {
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
	protected EList<Column> columns;

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
	protected STableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.STABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STABLE__HEADER_OPTION, oldHeaderOption, headerOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<Column>(SColumn.class, this, SciidPackage.STABLE__COLUMNS, SciidPackage.SCOLUMN__TABLE);
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
			header = new EObjectContainmentEList<Row>(Row.class, this, SciidPackage.STABLE__HEADER);
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
			footer = new EObjectContainmentEList<Row>(Row.class, this, SciidPackage.STABLE__FOOTER);
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
			body = new EObjectContainmentEList<Row>(Row.class, this, SciidPackage.STABLE__BODY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STABLE__FRAME, oldFrame, frame));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STABLE__GRID, oldGrid, grid));
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
			case SciidPackage.STABLE__COLUMNS:
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
			case SciidPackage.STABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case SciidPackage.STABLE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case SciidPackage.STABLE__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
			case SciidPackage.STABLE__BODY:
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
			case SciidPackage.STABLE__HEADER_OPTION:
				return isHeaderOption();
			case SciidPackage.STABLE__COLUMNS:
				return getColumns();
			case SciidPackage.STABLE__HEADER:
				return getHeader();
			case SciidPackage.STABLE__FOOTER:
				return getFooter();
			case SciidPackage.STABLE__BODY:
				return getBody();
			case SciidPackage.STABLE__FRAME:
				return getFrame();
			case SciidPackage.STABLE__GRID:
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
			case SciidPackage.STABLE__HEADER_OPTION:
				setHeaderOption((Boolean)newValue);
				return;
			case SciidPackage.STABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends SColumn>)newValue);
				return;
			case SciidPackage.STABLE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends Row>)newValue);
				return;
			case SciidPackage.STABLE__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends Row>)newValue);
				return;
			case SciidPackage.STABLE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Row>)newValue);
				return;
			case SciidPackage.STABLE__FRAME:
				setFrame((String)newValue);
				return;
			case SciidPackage.STABLE__GRID:
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
			case SciidPackage.STABLE__HEADER_OPTION:
				setHeaderOption(HEADER_OPTION_EDEFAULT);
				return;
			case SciidPackage.STABLE__COLUMNS:
				getColumns().clear();
				return;
			case SciidPackage.STABLE__HEADER:
				getHeader().clear();
				return;
			case SciidPackage.STABLE__FOOTER:
				getFooter().clear();
				return;
			case SciidPackage.STABLE__BODY:
				getBody().clear();
				return;
			case SciidPackage.STABLE__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
			case SciidPackage.STABLE__GRID:
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
			case SciidPackage.STABLE__HEADER_OPTION:
				return headerOption != HEADER_OPTION_EDEFAULT;
			case SciidPackage.STABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case SciidPackage.STABLE__HEADER:
				return header != null && !header.isEmpty();
			case SciidPackage.STABLE__FOOTER:
				return footer != null && !footer.isEmpty();
			case SciidPackage.STABLE__BODY:
				return body != null && !body.isEmpty();
			case SciidPackage.STABLE__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
			case SciidPackage.STABLE__GRID:
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

} //STableImpl
