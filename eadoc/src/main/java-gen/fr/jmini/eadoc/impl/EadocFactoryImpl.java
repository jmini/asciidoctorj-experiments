/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EadocFactoryImpl extends EFactoryImpl implements EadocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EadocFactory init() {
		try {
			EadocFactory theEadocFactory = (EadocFactory)EPackage.Registry.INSTANCE.getEFactory(EadocPackage.eNS_URI);
			if (theEadocFactory != null) {
				return theEadocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EadocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EadocFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EadocPackage.EAUTHOR: return createEAuthor();
			case EadocPackage.ECURSOR: return createECursor();
			case EadocPackage.ETITLE: return createETitle();
			case EadocPackage.EREVISION_INFO: return createERevisionInfo();
			case EadocPackage.ECONTENT_PART: return createEContentPart();
			case EadocPackage.ESTRUCTURED_DOCUMENT: return createEStructuredDocument();
			case EadocPackage.ECONTENT_NODE: return createEContentNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAuthor createEAuthor() {
		EAuthorImpl eAuthor = new EAuthorImpl();
		return eAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECursor createECursor() {
		ECursorImpl eCursor = new ECursorImpl();
		return eCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETitle createETitle() {
		ETitleImpl eTitle = new ETitleImpl();
		return eTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERevisionInfo createERevisionInfo() {
		ERevisionInfoImpl eRevisionInfo = new ERevisionInfoImpl();
		return eRevisionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContentPart createEContentPart() {
		EContentPartImpl eContentPart = new EContentPartImpl();
		return eContentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuredDocument createEStructuredDocument() {
		EStructuredDocumentImpl eStructuredDocument = new EStructuredDocumentImpl();
		return eStructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContentNode createEContentNode() {
		EContentNodeImpl eContentNode = new EContentNodeImpl();
		return eContentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EadocPackage getEadocPackage() {
		return (EadocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EadocPackage getPackage() {
		return EadocPackage.eINSTANCE;
	}

} //EadocFactoryImpl
