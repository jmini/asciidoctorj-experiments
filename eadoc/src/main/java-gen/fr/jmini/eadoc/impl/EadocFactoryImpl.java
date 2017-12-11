/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.*;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.Table;

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
			case EadocPackage.HORIZONTAL_ALIGNMENT:
				return createHorizontalAlignmentFromString(eDataType, initialValue);
			case EadocPackage.VERTICAL_ALIGNMENT:
				return createVerticalAlignmentFromString(eDataType, initialValue);
			case EadocPackage.STRING_OBJECT_MAP:
				return createStringObjectMapFromString(eDataType, initialValue);
			case EadocPackage.OBJECT_OBJECT_MAP:
				return createObjectObjectMapFromString(eDataType, initialValue);
			case EadocPackage.STRING_LIST:
				return createStringListFromString(eDataType, initialValue);
			case EadocPackage.CONTENT_PART_LIST:
				return createContentPartListFromString(eDataType, initialValue);
			case EadocPackage.STRUCTURAL_NODE_LIST:
				return createStructuralNodeListFromString(eDataType, initialValue);
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
			case EadocPackage.HORIZONTAL_ALIGNMENT:
				return convertHorizontalAlignmentToString(eDataType, instanceValue);
			case EadocPackage.VERTICAL_ALIGNMENT:
				return convertVerticalAlignmentToString(eDataType, instanceValue);
			case EadocPackage.STRING_OBJECT_MAP:
				return convertStringObjectMapToString(eDataType, instanceValue);
			case EadocPackage.OBJECT_OBJECT_MAP:
				return convertObjectObjectMapToString(eDataType, instanceValue);
			case EadocPackage.STRING_LIST:
				return convertStringListToString(eDataType, instanceValue);
			case EadocPackage.CONTENT_PART_LIST:
				return convertContentPartListToString(eDataType, instanceValue);
			case EadocPackage.STRUCTURAL_NODE_LIST:
				return convertStructuralNodeListToString(eDataType, instanceValue);
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
	public Table.HorizontalAlignment createHorizontalAlignmentFromString(EDataType eDataType, String initialValue) {
		return (Table.HorizontalAlignment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalAlignmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table.VerticalAlignment createVerticalAlignmentFromString(EDataType eDataType, String initialValue) {
		return (Table.VerticalAlignment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> createStringObjectMapFromString(EDataType eDataType, String initialValue) {
		return (Map<String, Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringObjectMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<Object, Object> createObjectObjectMapFromString(EDataType eDataType, String initialValue) {
		return (Map<Object, Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectObjectMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<String> createStringListFromString(EDataType eDataType, String initialValue) {
		return (List<String>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<ContentPart> createContentPartListFromString(EDataType eDataType, String initialValue) {
		return (List<ContentPart>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentPartListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<EStructuralNode> createStructuralNodeListFromString(EDataType eDataType, String initialValue) {
		return (List<EStructuralNode>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructuralNodeListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
