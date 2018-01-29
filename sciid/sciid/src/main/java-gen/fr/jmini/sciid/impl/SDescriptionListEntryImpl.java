/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SDescriptionListEntry;
import fr.jmini.sciid.SListItem;
import fr.jmini.sciid.SciidPackage;
import fr.jmini.sciid.SciidUtility;

import java.util.Collection;

import org.asciidoctor.ast.ListItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDescription List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SDescriptionListEntryImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDescriptionListEntryImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDescriptionListEntryImpl extends MinimalEObjectImpl.Container implements SDescriptionListEntry {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> terms;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected SListItem description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDescriptionListEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SDESCRIPTION_LIST_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListItem> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<ListItem>(SListItem.class, this, SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SListItem getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(SListItem newDescription, NotificationChain msgs) {
		SListItem oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(SListItem newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(final ListItem item) {
		this.setDescription(SciidUtility.convertListItem(item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS:
				return getTerms();
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION:
				return getDescription();
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
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends SListItem>)newValue);
				return;
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION:
				setDescription((SListItem)newValue);
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
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS:
				getTerms().clear();
				return;
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION:
				setDescription((SListItem)null);
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
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__TERMS:
				return terms != null && !terms.isEmpty();
			case SciidPackage.SDESCRIPTION_LIST_ENTRY__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //SDescriptionListEntryImpl
