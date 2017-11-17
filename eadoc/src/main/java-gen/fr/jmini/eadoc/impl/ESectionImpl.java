/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.ESection;
import fr.jmini.eadoc.EadocPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.ESectionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ESectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ESectionImpl#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ESectionImpl#isSpecial <em>Special</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.ESectionImpl#isNumbered <em>Numbered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESectionImpl extends EStructuralNodeImpl implements ESection {
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
	protected ESectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.ESECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESECTION__INDEX, oldIndex, index));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESECTION__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESECTION__SECTION_NAME, oldSectionName, sectionName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESECTION__SPECIAL, oldSpecial, special));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESECTION__NUMBERED, oldNumbered, numbered));
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
			case EadocPackage.ESECTION__INDEX:
				return getIndex();
			case EadocPackage.ESECTION__NUMBER:
				return getNumber();
			case EadocPackage.ESECTION__SECTION_NAME:
				return getSectionName();
			case EadocPackage.ESECTION__SPECIAL:
				return isSpecial();
			case EadocPackage.ESECTION__NUMBERED:
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
			case EadocPackage.ESECTION__INDEX:
				setIndex((Integer)newValue);
				return;
			case EadocPackage.ESECTION__NUMBER:
				setNumber((Integer)newValue);
				return;
			case EadocPackage.ESECTION__SECTION_NAME:
				setSectionName((String)newValue);
				return;
			case EadocPackage.ESECTION__SPECIAL:
				setSpecial((Boolean)newValue);
				return;
			case EadocPackage.ESECTION__NUMBERED:
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
			case EadocPackage.ESECTION__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case EadocPackage.ESECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case EadocPackage.ESECTION__SECTION_NAME:
				setSectionName(SECTION_NAME_EDEFAULT);
				return;
			case EadocPackage.ESECTION__SPECIAL:
				setSpecial(SPECIAL_EDEFAULT);
				return;
			case EadocPackage.ESECTION__NUMBERED:
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
			case EadocPackage.ESECTION__INDEX:
				return index != INDEX_EDEFAULT;
			case EadocPackage.ESECTION__NUMBER:
				return number != NUMBER_EDEFAULT;
			case EadocPackage.ESECTION__SECTION_NAME:
				return SECTION_NAME_EDEFAULT == null ? sectionName != null : !SECTION_NAME_EDEFAULT.equals(sectionName);
			case EadocPackage.ESECTION__SPECIAL:
				return special != SPECIAL_EDEFAULT;
			case EadocPackage.ESECTION__NUMBERED:
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

} //ESectionImpl
