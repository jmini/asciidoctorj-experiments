/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EAuthor;
import fr.jmini.eadoc.EadocPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAuthor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EAuthorImpl#getInitials <em>Initials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAuthorImpl extends MinimalEObjectImpl.Container implements EAuthor {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitials() <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitials() <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected String initials = INITIALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.EAUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__MIDDLE_NAME, oldMiddleName, middleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitials() {
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitials(String newInitials) {
		String oldInitials = initials;
		initials = newInitials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.EAUTHOR__INITIALS, oldInitials, initials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EadocPackage.EAUTHOR__EMAIL:
				return getEmail();
			case EadocPackage.EAUTHOR__FULL_NAME:
				return getFullName();
			case EadocPackage.EAUTHOR__FIRST_NAME:
				return getFirstName();
			case EadocPackage.EAUTHOR__LAST_NAME:
				return getLastName();
			case EadocPackage.EAUTHOR__MIDDLE_NAME:
				return getMiddleName();
			case EadocPackage.EAUTHOR__INITIALS:
				return getInitials();
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
			case EadocPackage.EAUTHOR__EMAIL:
				setEmail((String)newValue);
				return;
			case EadocPackage.EAUTHOR__FULL_NAME:
				setFullName((String)newValue);
				return;
			case EadocPackage.EAUTHOR__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case EadocPackage.EAUTHOR__LAST_NAME:
				setLastName((String)newValue);
				return;
			case EadocPackage.EAUTHOR__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case EadocPackage.EAUTHOR__INITIALS:
				setInitials((String)newValue);
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
			case EadocPackage.EAUTHOR__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EadocPackage.EAUTHOR__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case EadocPackage.EAUTHOR__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case EadocPackage.EAUTHOR__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case EadocPackage.EAUTHOR__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case EadocPackage.EAUTHOR__INITIALS:
				setInitials(INITIALS_EDEFAULT);
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
			case EadocPackage.EAUTHOR__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EadocPackage.EAUTHOR__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case EadocPackage.EAUTHOR__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case EadocPackage.EAUTHOR__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case EadocPackage.EAUTHOR__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case EadocPackage.EAUTHOR__INITIALS:
				return INITIALS_EDEFAULT == null ? initials != null : !INITIALS_EDEFAULT.equals(initials);
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
		result.append(" (email: ");
		result.append(email);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", middleName: ");
		result.append(middleName);
		result.append(", initials: ");
		result.append(initials);
		result.append(')');
		return result.toString();
	}

} //EAuthorImpl
