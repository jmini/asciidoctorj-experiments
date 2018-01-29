/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SDocument;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDocument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentImpl#getStructuredDoctitle <em>Structured Doctitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentImpl#getDoctitle <em>Doctitle</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDocumentImpl extends SStructuralNodeImpl implements SDocument {
	/**
	 * The cached value of the '{@link #getStructuredDoctitle() <em>Structured Doctitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredDoctitle()
	 * @generated
	 * @ordered
	 */
	protected STitle structuredDoctitle;

	/**
	 * The default value of the '{@link #getDoctitle() <em>Doctitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctitle()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoctitle() <em>Doctitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctitle()
	 * @generated
	 * @ordered
	 */
	protected String doctitle = DOCTITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Map<Object, Object> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SDOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STitle getStructuredDoctitle() {
		return structuredDoctitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredDoctitle(STitle newStructuredDoctitle, NotificationChain msgs) {
		STitle oldStructuredDoctitle = structuredDoctitle;
		structuredDoctitle = newStructuredDoctitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE, oldStructuredDoctitle, newStructuredDoctitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredDoctitle(STitle newStructuredDoctitle) {
		if (newStructuredDoctitle != structuredDoctitle) {
			NotificationChain msgs = null;
			if (structuredDoctitle != null)
				msgs = ((InternalEObject)structuredDoctitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE, null, msgs);
			if (newStructuredDoctitle != null)
				msgs = ((InternalEObject)newStructuredDoctitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE, null, msgs);
			msgs = basicSetStructuredDoctitle(newStructuredDoctitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE, newStructuredDoctitle, newStructuredDoctitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoctitle() {
		return doctitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctitle(String newDoctitle) {
		String oldDoctitle = doctitle;
		doctitle = newDoctitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT__DOCTITLE, oldDoctitle, doctitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Object, Object> getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Map<Object, Object> newOptions) {
		Map<Object, Object> oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String doctitle() {
		return this.getDoctitle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBasebackend(final String backend) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean basebackend(final String backend) {
		return this.isBasebackend(backend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAndIncrementCounter(final String name) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAndIncrementCounter(final String name, final int initialValue) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE:
				return basicSetStructuredDoctitle(null, msgs);
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
			case SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE:
				return getStructuredDoctitle();
			case SciidPackage.SDOCUMENT__DOCTITLE:
				return getDoctitle();
			case SciidPackage.SDOCUMENT__OPTIONS:
				return getOptions();
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
			case SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE:
				setStructuredDoctitle((STitle)newValue);
				return;
			case SciidPackage.SDOCUMENT__DOCTITLE:
				setDoctitle((String)newValue);
				return;
			case SciidPackage.SDOCUMENT__OPTIONS:
				setOptions((Map<Object, Object>)newValue);
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
			case SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE:
				setStructuredDoctitle((STitle)null);
				return;
			case SciidPackage.SDOCUMENT__DOCTITLE:
				setDoctitle(DOCTITLE_EDEFAULT);
				return;
			case SciidPackage.SDOCUMENT__OPTIONS:
				setOptions((Map<Object, Object>)null);
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
			case SciidPackage.SDOCUMENT__STRUCTURED_DOCTITLE:
				return structuredDoctitle != null;
			case SciidPackage.SDOCUMENT__DOCTITLE:
				return DOCTITLE_EDEFAULT == null ? doctitle != null : !DOCTITLE_EDEFAULT.equals(doctitle);
			case SciidPackage.SDOCUMENT__OPTIONS:
				return options != null;
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
		result.append(" (doctitle: ");
		result.append(doctitle);
		result.append(", options: ");
		result.append(options);
		result.append(')');
		return result.toString();
	}

} //SDocumentImpl
