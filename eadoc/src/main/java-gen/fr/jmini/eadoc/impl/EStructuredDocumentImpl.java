/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EContentPart;
import fr.jmini.eadoc.EStructuredDocument;
import fr.jmini.eadoc.EadocPackage;

import java.util.Collection;
import java.util.List;

import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructured Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.impl.EStructuredDocumentImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link fr.jmini.eadoc.impl.EStructuredDocumentImpl#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStructuredDocumentImpl extends MinimalEObjectImpl.Container implements EStructuredDocument {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<EContentPart> parts;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected DocumentHeader header;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuredDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EadocPackage.Literals.ESTRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EContentPart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<EContentPart>(EContentPart.class, this, EadocPackage.ESTRUCTURED_DOCUMENT__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentHeader getHeader() {
		if (header != null && ((EObject)header).eIsProxy()) {
			InternalEObject oldHeader = (InternalEObject)header;
			header = (DocumentHeader)eResolveProxy(oldHeader);
			if (header != oldHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EadocPackage.ESTRUCTURED_DOCUMENT__HEADER, oldHeader, header));
			}
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentHeader basicGetHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(DocumentHeader newHeader) {
		DocumentHeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EadocPackage.ESTRUCTURED_DOCUMENT__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPart getPartById(final String partId) {
		if ((partId == null)) {
			return null;
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(partId.equals(it.getId()));
			}
		};
		return IterableExtensions.<EContentPart>findFirst(this.getParts(), _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPart getPartByStyle(final String style) {
		if ((style == null)) {
			return null;
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(style.equals(it.getStyle()));
			}
		};
		return IterableExtensions.<EContentPart>findFirst(this.getParts(), _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPart getPartByRole(final String role) {
		if ((role == null)) {
			return null;
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(role.equals(it.getRole()));
			}
		};
		return IterableExtensions.<EContentPart>findFirst(this.getParts(), _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ContentPart> getPartsByContext(final String context) {
		if ((context == null)) {
			return CollectionLiterals.<ContentPart>emptyList();
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(context.equals(it.getContext()));
			}
		};
		return ECollections.<ContentPart>asEList(((ContentPart[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(IterableExtensions.<EContentPart>filter(this.getParts(), _function), ContentPart.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ContentPart> getPartsByStyle(final String style) {
		if ((style == null)) {
			return CollectionLiterals.<ContentPart>emptyList();
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(style.equals(it.getStyle()));
			}
		};
		return ECollections.<ContentPart>asEList(((ContentPart[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(IterableExtensions.<EContentPart>filter(this.getParts(), _function), ContentPart.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ContentPart> getPartsByRole(final String role) {
		if ((role == null)) {
			return CollectionLiterals.<ContentPart>emptyList();
		}
		final Function1<EContentPart, Boolean> _function = new Function1<EContentPart, Boolean>() {
			public Boolean apply(final EContentPart it) {
				return Boolean.valueOf(role.equals(it.getRole()));
			}
		};
		return ECollections.<ContentPart>asEList(((ContentPart[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(IterableExtensions.<EContentPart>filter(this.getParts(), _function), ContentPart.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EadocPackage.ESTRUCTURED_DOCUMENT__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case EadocPackage.ESTRUCTURED_DOCUMENT__PARTS:
				return getParts();
			case EadocPackage.ESTRUCTURED_DOCUMENT__HEADER:
				if (resolve) return getHeader();
				return basicGetHeader();
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
			case EadocPackage.ESTRUCTURED_DOCUMENT__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends EContentPart>)newValue);
				return;
			case EadocPackage.ESTRUCTURED_DOCUMENT__HEADER:
				setHeader((DocumentHeader)newValue);
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
			case EadocPackage.ESTRUCTURED_DOCUMENT__PARTS:
				getParts().clear();
				return;
			case EadocPackage.ESTRUCTURED_DOCUMENT__HEADER:
				setHeader((DocumentHeader)null);
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
			case EadocPackage.ESTRUCTURED_DOCUMENT__PARTS:
				return parts != null && !parts.isEmpty();
			case EadocPackage.ESTRUCTURED_DOCUMENT__HEADER:
				return header != null;
		}
		return super.eIsSet(featureID);
	}

} //EStructuredDocumentImpl
