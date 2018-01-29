/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SAuthor;
import fr.jmini.sciid.SDocumentHeader;
import fr.jmini.sciid.SRevisionInfo;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.SciidPackage;

import java.util.Collection;
import java.util.Map;

import org.asciidoctor.ast.Author;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDocument Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentHeaderImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentHeaderImpl#getDocumentTitle <em>Document Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentHeaderImpl#getPageTitle <em>Page Title</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentHeaderImpl#getRevisionInfo <em>Revision Info</em>}</li>
 *   <li>{@link fr.jmini.sciid.impl.SDocumentHeaderImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDocumentHeaderImpl extends MinimalEObjectImpl.Container implements SDocumentHeader {
	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> authors;

	/**
	 * The cached value of the '{@link #getDocumentTitle() <em>Document Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTitle()
	 * @generated
	 * @ordered
	 */
	protected STitle documentTitle;

	/**
	 * The default value of the '{@link #getPageTitle() <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageTitle() <em>Page Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTitle()
	 * @generated
	 * @ordered
	 */
	protected String pageTitle = PAGE_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisionInfo() <em>Revision Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionInfo()
	 * @generated
	 * @ordered
	 */
	protected SRevisionInfo revisionInfo;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDocumentHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SciidPackage.Literals.SDOCUMENT_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Author>(SAuthor.class, this, SciidPackage.SDOCUMENT_HEADER__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STitle getDocumentTitle() {
		return documentTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentTitle(STitle newDocumentTitle, NotificationChain msgs) {
		STitle oldDocumentTitle = documentTitle;
		documentTitle = newDocumentTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE, oldDocumentTitle, newDocumentTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTitle(STitle newDocumentTitle) {
		if (newDocumentTitle != documentTitle) {
			NotificationChain msgs = null;
			if (documentTitle != null)
				msgs = ((InternalEObject)documentTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE, null, msgs);
			if (newDocumentTitle != null)
				msgs = ((InternalEObject)newDocumentTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE, null, msgs);
			msgs = basicSetDocumentTitle(newDocumentTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE, newDocumentTitle, newDocumentTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageTitle() {
		return pageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageTitle(String newPageTitle) {
		String oldPageTitle = pageTitle;
		pageTitle = newPageTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__PAGE_TITLE, oldPageTitle, pageTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRevisionInfo getRevisionInfo() {
		return revisionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisionInfo(SRevisionInfo newRevisionInfo, NotificationChain msgs) {
		SRevisionInfo oldRevisionInfo = revisionInfo;
		revisionInfo = newRevisionInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__REVISION_INFO, oldRevisionInfo, newRevisionInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionInfo(SRevisionInfo newRevisionInfo) {
		if (newRevisionInfo != revisionInfo) {
			NotificationChain msgs = null;
			if (revisionInfo != null)
				msgs = ((InternalEObject)revisionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT_HEADER__REVISION_INFO, null, msgs);
			if (newRevisionInfo != null)
				msgs = ((InternalEObject)newRevisionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SciidPackage.SDOCUMENT_HEADER__REVISION_INFO, null, msgs);
			msgs = basicSetRevisionInfo(newRevisionInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__REVISION_INFO, newRevisionInfo, newRevisionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Map<String, Object> newAttributes) {
		Map<String, Object> oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SciidPackage.SDOCUMENT_HEADER__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getAuthor() {
		boolean _isEmpty = this.getAuthors().isEmpty();
		if (_isEmpty) {
			return SciidFactory.eINSTANCE.createSAuthor();
		}
		else {
			return IterableExtensions.<Author>head(this.getAuthors());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SciidPackage.SDOCUMENT_HEADER__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE:
				return basicSetDocumentTitle(null, msgs);
			case SciidPackage.SDOCUMENT_HEADER__REVISION_INFO:
				return basicSetRevisionInfo(null, msgs);
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
			case SciidPackage.SDOCUMENT_HEADER__AUTHORS:
				return getAuthors();
			case SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE:
				return getDocumentTitle();
			case SciidPackage.SDOCUMENT_HEADER__PAGE_TITLE:
				return getPageTitle();
			case SciidPackage.SDOCUMENT_HEADER__REVISION_INFO:
				return getRevisionInfo();
			case SciidPackage.SDOCUMENT_HEADER__ATTRIBUTES:
				return getAttributes();
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
			case SciidPackage.SDOCUMENT_HEADER__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends SAuthor>)newValue);
				return;
			case SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE:
				setDocumentTitle((STitle)newValue);
				return;
			case SciidPackage.SDOCUMENT_HEADER__PAGE_TITLE:
				setPageTitle((String)newValue);
				return;
			case SciidPackage.SDOCUMENT_HEADER__REVISION_INFO:
				setRevisionInfo((SRevisionInfo)newValue);
				return;
			case SciidPackage.SDOCUMENT_HEADER__ATTRIBUTES:
				setAttributes((Map<String, Object>)newValue);
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
			case SciidPackage.SDOCUMENT_HEADER__AUTHORS:
				getAuthors().clear();
				return;
			case SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE:
				setDocumentTitle((STitle)null);
				return;
			case SciidPackage.SDOCUMENT_HEADER__PAGE_TITLE:
				setPageTitle(PAGE_TITLE_EDEFAULT);
				return;
			case SciidPackage.SDOCUMENT_HEADER__REVISION_INFO:
				setRevisionInfo((SRevisionInfo)null);
				return;
			case SciidPackage.SDOCUMENT_HEADER__ATTRIBUTES:
				setAttributes((Map<String, Object>)null);
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
			case SciidPackage.SDOCUMENT_HEADER__AUTHORS:
				return authors != null && !authors.isEmpty();
			case SciidPackage.SDOCUMENT_HEADER__DOCUMENT_TITLE:
				return documentTitle != null;
			case SciidPackage.SDOCUMENT_HEADER__PAGE_TITLE:
				return PAGE_TITLE_EDEFAULT == null ? pageTitle != null : !PAGE_TITLE_EDEFAULT.equals(pageTitle);
			case SciidPackage.SDOCUMENT_HEADER__REVISION_INFO:
				return revisionInfo != null;
			case SciidPackage.SDOCUMENT_HEADER__ATTRIBUTES:
				return attributes != null;
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
		result.append(" (pageTitle: ");
		result.append(pageTitle);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(')');
		return result.toString();
	}

} //SDocumentHeaderImpl
