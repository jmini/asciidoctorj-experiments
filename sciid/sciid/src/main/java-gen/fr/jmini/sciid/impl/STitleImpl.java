/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STitle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.STitleImpl#getMain <em>Main</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STitleImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STitleImpl#getCombined <em>Combined</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.STitleImpl#isSanitized <em>Sanitized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STitleImpl extends MinimalEObjectImpl.Container implements STitle {
	/**
	 * The default value of the '{@link #getMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected String main = MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCombined() <em>Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombined()
	 * @generated
	 * @ordered
	 */
	protected static final String COMBINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCombined() <em>Combined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombined()
	 * @generated
	 * @ordered
	 */
	protected String combined = COMBINED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSanitized() <em>Sanitized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSanitized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SANITIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSanitized() <em>Sanitized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSanitized()
	 * @generated
	 * @ordered
	 */
	protected boolean sanitized = SANITIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.STITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(String newMain) {
		String oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STITLE__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STITLE__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCombined() {
		return combined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombined(String newCombined) {
		String oldCombined = combined;
		combined = newCombined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STITLE__COMBINED, oldCombined, combined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSanitized() {
		return sanitized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSanitized(boolean newSanitized) {
		boolean oldSanitized = sanitized;
		sanitized = newSanitized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.STITLE__SANITIZED, oldSanitized, sanitized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SciidPackage.STITLE__MAIN:
				return getMain();
			case SciidPackage.STITLE__SUBTITLE:
				return getSubtitle();
			case SciidPackage.STITLE__COMBINED:
				return getCombined();
			case SciidPackage.STITLE__SANITIZED:
				return isSanitized();
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
			case SciidPackage.STITLE__MAIN:
				setMain((String)newValue);
				return;
			case SciidPackage.STITLE__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case SciidPackage.STITLE__COMBINED:
				setCombined((String)newValue);
				return;
			case SciidPackage.STITLE__SANITIZED:
				setSanitized((Boolean)newValue);
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
			case SciidPackage.STITLE__MAIN:
				setMain(MAIN_EDEFAULT);
				return;
			case SciidPackage.STITLE__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case SciidPackage.STITLE__COMBINED:
				setCombined(COMBINED_EDEFAULT);
				return;
			case SciidPackage.STITLE__SANITIZED:
				setSanitized(SANITIZED_EDEFAULT);
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
			case SciidPackage.STITLE__MAIN:
				return MAIN_EDEFAULT == null ? main != null : !MAIN_EDEFAULT.equals(main);
			case SciidPackage.STITLE__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case SciidPackage.STITLE__COMBINED:
				return COMBINED_EDEFAULT == null ? combined != null : !COMBINED_EDEFAULT.equals(combined);
			case SciidPackage.STITLE__SANITIZED:
				return sanitized != SANITIZED_EDEFAULT;
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
		result.append(" (main: ");
		result.append(main);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(", combined: ");
		result.append(combined);
		result.append(", sanitized: ");
		result.append(sanitized);
		result.append(')');
		return result.toString();
	}

} //STitleImpl
