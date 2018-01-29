/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SSection;
import fr.jmini.sciid.SciidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SSectionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SSectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SSectionImpl#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SSectionImpl#isSpecial <em>Special</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SSectionImpl#isNumbered <em>Numbered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSectionImpl extends SStructuralNodeImpl implements SSection {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionName() <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionName()
	 * @generated
	 * @ordered
	 */
	protected String sectionName = SECTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPECIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecial()
	 * @generated
	 * @ordered
	 */
	protected boolean special = SPECIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isNumbered() <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNumbered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NUMBERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNumbered() <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNumbered()
	 * @generated
	 * @ordered
	 */
	protected boolean numbered = NUMBERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SSECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSECTION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionName(String newSectionName) {
		String oldSectionName = sectionName;
		sectionName = newSectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSECTION__SECTION_NAME, oldSectionName, sectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecial() {
		return special;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial(boolean newSpecial) {
		boolean oldSpecial = special;
		special = newSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSECTION__SPECIAL, oldSpecial, special));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNumbered() {
		return numbered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbered(boolean newNumbered) {
		boolean oldNumbered = numbered;
		numbered = newNumbered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SSECTION__NUMBERED, oldNumbered, numbered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int index() {
		return this.getIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int number() {
		return this.getNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String sectname() {
		return this.getSectionName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean special() {
		return this.isSpecial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numbered() {
		return this.isNumbered();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SciidPackage.SSECTION__INDEX:
				return getIndex();
			case SciidPackage.SSECTION__NUMBER:
				return getNumber();
			case SciidPackage.SSECTION__SECTION_NAME:
				return getSectionName();
			case SciidPackage.SSECTION__SPECIAL:
				return isSpecial();
			case SciidPackage.SSECTION__NUMBERED:
				return isNumbered();
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
			case SciidPackage.SSECTION__INDEX:
				setIndex((Integer)newValue);
				return;
			case SciidPackage.SSECTION__NUMBER:
				setNumber((Integer)newValue);
				return;
			case SciidPackage.SSECTION__SECTION_NAME:
				setSectionName((String)newValue);
				return;
			case SciidPackage.SSECTION__SPECIAL:
				setSpecial((Boolean)newValue);
				return;
			case SciidPackage.SSECTION__NUMBERED:
				setNumbered((Boolean)newValue);
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
			case SciidPackage.SSECTION__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case SciidPackage.SSECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case SciidPackage.SSECTION__SECTION_NAME:
				setSectionName(SECTION_NAME_EDEFAULT);
				return;
			case SciidPackage.SSECTION__SPECIAL:
				setSpecial(SPECIAL_EDEFAULT);
				return;
			case SciidPackage.SSECTION__NUMBERED:
				setNumbered(NUMBERED_EDEFAULT);
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
			case SciidPackage.SSECTION__INDEX:
				return index != INDEX_EDEFAULT;
			case SciidPackage.SSECTION__NUMBER:
				return number != NUMBER_EDEFAULT;
			case SciidPackage.SSECTION__SECTION_NAME:
				return SECTION_NAME_EDEFAULT == null ? sectionName != null : !SECTION_NAME_EDEFAULT.equals(sectionName);
			case SciidPackage.SSECTION__SPECIAL:
				return special != SPECIAL_EDEFAULT;
			case SciidPackage.SSECTION__NUMBERED:
				return numbered != NUMBERED_EDEFAULT;
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
		result.append(" (index: ");
		result.append(index);
		result.append(", number: ");
		result.append(number);
		result.append(", sectionName: ");
		result.append(sectionName);
		result.append(", special: ");
		result.append(special);
		result.append(", numbered: ");
		result.append(numbered);
		result.append(')');
		return result.toString();
	}

} //SSectionImpl
