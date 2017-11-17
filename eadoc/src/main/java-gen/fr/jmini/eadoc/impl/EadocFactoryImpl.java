/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case EadocPackage.EBLOCK: return createEBlock();
			case EadocPackage.ECELL: return createECell();
			case EadocPackage.ECOLUMN: return createEColumn();
			case EadocPackage.ECONTENT_NODE: return createEContentNode();
			case EadocPackage.ECONTENT_PART: return createEContentPart();
			case EadocPackage.ECURSOR: return createECursor();
			case EadocPackage.EDESCRIPTION_LIST: return createEDescriptionList();
			case EadocPackage.EDESCRIPTION_LIST_ENTRY: return createEDescriptionListEntry();
			case EadocPackage.EDOCUMENT: return createEDocument();
			case EadocPackage.EDOCUMENT_HEADER: return createEDocumentHeader();
			case EadocPackage.EADOC_LIST: return createEAdocList();
			case EadocPackage.ELIST_ITEM: return createEListItem();
			case EadocPackage.EPHRASE_NODE: return createEPhraseNode();
			case EadocPackage.EREVISION_INFO: return createERevisionInfo();
			case EadocPackage.EROW: return createERow();
			case EadocPackage.ESECTION: return createESection();
			case EadocPackage.ESTRUCTURAL_NODE: return createEStructuralNode();
			case EadocPackage.ESTRUCTURED_DOCUMENT: return createEStructuredDocument();
			case EadocPackage.ETABLE: return createETable();
			case EadocPackage.ETITLE: return createETitle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EadocPackage.EHORIZONTAL_ALIGNMENT:
				return createEHorizontalAlignmentFromString(eDataType, initialValue);
			case EadocPackage.EVERTICAL_ALIGNMENT:
				return createEVerticalAlignmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EadocPackage.EHORIZONTAL_ALIGNMENT:
				return convertEHorizontalAlignmentToString(eDataType, instanceValue);
			case EadocPackage.EVERTICAL_ALIGNMENT:
				return convertEVerticalAlignmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public EBlock createEBlock() {
		EBlockImpl eBlock = new EBlockImpl();
		return eBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECell createECell() {
		ECellImpl eCell = new ECellImpl();
		return eCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EColumn createEColumn() {
		EColumnImpl eColumn = new EColumnImpl();
		return eColumn;
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
	public EContentPart createEContentPart() {
		EContentPartImpl eContentPart = new EContentPartImpl();
		return eContentPart;
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
	public EDescriptionList createEDescriptionList() {
		EDescriptionListImpl eDescriptionList = new EDescriptionListImpl();
		return eDescriptionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDescriptionListEntry createEDescriptionListEntry() {
		EDescriptionListEntryImpl eDescriptionListEntry = new EDescriptionListEntryImpl();
		return eDescriptionListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDocument createEDocument() {
		EDocumentImpl eDocument = new EDocumentImpl();
		return eDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDocumentHeader createEDocumentHeader() {
		EDocumentHeaderImpl eDocumentHeader = new EDocumentHeaderImpl();
		return eDocumentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAdocList createEAdocList() {
		EAdocListImpl eAdocList = new EAdocListImpl();
		return eAdocList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EListItem createEListItem() {
		EListItemImpl eListItem = new EListItemImpl();
		return eListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPhraseNode createEPhraseNode() {
		EPhraseNodeImpl ePhraseNode = new EPhraseNodeImpl();
		return ePhraseNode;
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
	public ERow createERow() {
		ERowImpl eRow = new ERowImpl();
		return eRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESection createESection() {
		ESectionImpl eSection = new ESectionImpl();
		return eSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralNode createEStructuralNode() {
		EStructuralNodeImpl eStructuralNode = new EStructuralNodeImpl();
		return eStructuralNode;
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
	public ETable createETable() {
		ETableImpl eTable = new ETableImpl();
		return eTable;
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
	public EHorizontalAlignment createEHorizontalAlignmentFromString(EDataType eDataType, String initialValue) {
		EHorizontalAlignment result = EHorizontalAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEHorizontalAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVerticalAlignment createEVerticalAlignmentFromString(EDataType eDataType, String initialValue) {
		EVerticalAlignment result = EVerticalAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVerticalAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
