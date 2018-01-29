/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.*;

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
public class SciidFactoryImpl extends EFactoryImpl implements SciidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SciidFactory init() {
		try {
			SciidFactory theSciidFactory = (SciidFactory)EPackage.Registry.INSTANCE.getEFactory(SciidPackage.eNS_URI);
			if (theSciidFactory != null) {
				return theSciidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SciidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SciidFactoryImpl() {
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
			case SciidPackage.SAUTHOR: return createSAuthor();
			case SciidPackage.SBLOCK: return createSBlock();
			case SciidPackage.SCELL: return createSCell();
			case SciidPackage.SCOLUMN: return createSColumn();
			case SciidPackage.SCONTENT_NODE: return createSContentNode();
			case SciidPackage.SCONTENT_PART: return createSContentPart();
			case SciidPackage.SCURSOR: return createSCursor();
			case SciidPackage.SDESCRIPTION_LIST: return createSDescriptionList();
			case SciidPackage.SDESCRIPTION_LIST_ENTRY: return createSDescriptionListEntry();
			case SciidPackage.SDOCUMENT: return createSDocument();
			case SciidPackage.SDOCUMENT_HEADER: return createSDocumentHeader();
			case SciidPackage.SLIST: return createSList();
			case SciidPackage.SLIST_ITEM: return createSListItem();
			case SciidPackage.SPHRASE_NODE: return createSPhraseNode();
			case SciidPackage.SREVISION_INFO: return createSRevisionInfo();
			case SciidPackage.SROW: return createSRow();
			case SciidPackage.SSECTION: return createSSection();
			case SciidPackage.SSTRUCTURAL_NODE: return createSStructuralNode();
			case SciidPackage.SSTRUCTURED_DOCUMENT: return createSStructuredDocument();
			case SciidPackage.STABLE: return createSTable();
			case SciidPackage.STITLE: return createSTitle();
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
			case SciidPackage.HORIZONTAL_ALIGNMENT:
				return createHorizontalAlignmentFromString(eDataType, initialValue);
			case SciidPackage.VERTICAL_ALIGNMENT:
				return createVerticalAlignmentFromString(eDataType, initialValue);
			case SciidPackage.SCIID_UTILITY:
				return createSciidUtilityFromString(eDataType, initialValue);
			case SciidPackage.STRING_OBJECT_MAP:
				return createStringObjectMapFromString(eDataType, initialValue);
			case SciidPackage.OBJECT_OBJECT_MAP:
				return createObjectObjectMapFromString(eDataType, initialValue);
			case SciidPackage.STRING_LIST:
				return createStringListFromString(eDataType, initialValue);
			case SciidPackage.CONTENT_PART_LIST:
				return createContentPartListFromString(eDataType, initialValue);
			case SciidPackage.STRUCTURAL_NODE_LIST:
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
			case SciidPackage.HORIZONTAL_ALIGNMENT:
				return convertHorizontalAlignmentToString(eDataType, instanceValue);
			case SciidPackage.VERTICAL_ALIGNMENT:
				return convertVerticalAlignmentToString(eDataType, instanceValue);
			case SciidPackage.SCIID_UTILITY:
				return convertSciidUtilityToString(eDataType, instanceValue);
			case SciidPackage.STRING_OBJECT_MAP:
				return convertStringObjectMapToString(eDataType, instanceValue);
			case SciidPackage.OBJECT_OBJECT_MAP:
				return convertObjectObjectMapToString(eDataType, instanceValue);
			case SciidPackage.STRING_LIST:
				return convertStringListToString(eDataType, instanceValue);
			case SciidPackage.CONTENT_PART_LIST:
				return convertContentPartListToString(eDataType, instanceValue);
			case SciidPackage.STRUCTURAL_NODE_LIST:
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
	public SAuthor createSAuthor() {
		SAuthorImpl sAuthor = new SAuthorImpl();
		return sAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBlock createSBlock() {
		SBlockImpl sBlock = new SBlockImpl();
		return sBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCell createSCell() {
		SCellImpl sCell = new SCellImpl();
		return sCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SColumn createSColumn() {
		SColumnImpl sColumn = new SColumnImpl();
		return sColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SContentNode createSContentNode() {
		SContentNodeImpl sContentNode = new SContentNodeImpl();
		return sContentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SContentPart createSContentPart() {
		SContentPartImpl sContentPart = new SContentPartImpl();
		return sContentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCursor createSCursor() {
		SCursorImpl sCursor = new SCursorImpl();
		return sCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDescriptionList createSDescriptionList() {
		SDescriptionListImpl sDescriptionList = new SDescriptionListImpl();
		return sDescriptionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDescriptionListEntry createSDescriptionListEntry() {
		SDescriptionListEntryImpl sDescriptionListEntry = new SDescriptionListEntryImpl();
		return sDescriptionListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDocument createSDocument() {
		SDocumentImpl sDocument = new SDocumentImpl();
		return sDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDocumentHeader createSDocumentHeader() {
		SDocumentHeaderImpl sDocumentHeader = new SDocumentHeaderImpl();
		return sDocumentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SList createSList() {
		SListImpl sList = new SListImpl();
		return sList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SListItem createSListItem() {
		SListItemImpl sListItem = new SListItemImpl();
		return sListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPhraseNode createSPhraseNode() {
		SPhraseNodeImpl sPhraseNode = new SPhraseNodeImpl();
		return sPhraseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRevisionInfo createSRevisionInfo() {
		SRevisionInfoImpl sRevisionInfo = new SRevisionInfoImpl();
		return sRevisionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRow createSRow() {
		SRowImpl sRow = new SRowImpl();
		return sRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSection createSSection() {
		SSectionImpl sSection = new SSectionImpl();
		return sSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SStructuralNode createSStructuralNode() {
		SStructuralNodeImpl sStructuralNode = new SStructuralNodeImpl();
		return sStructuralNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SStructuredDocument createSStructuredDocument() {
		SStructuredDocumentImpl sStructuredDocument = new SStructuredDocumentImpl();
		return sStructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STable createSTable() {
		STableImpl sTable = new STableImpl();
		return sTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STitle createSTitle() {
		STitleImpl sTitle = new STitleImpl();
		return sTitle;
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
	public SciidUtility createSciidUtilityFromString(EDataType eDataType, String initialValue) {
		return (SciidUtility)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSciidUtilityToString(EDataType eDataType, Object instanceValue) {
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
	public List<SStructuralNode> createStructuralNodeListFromString(EDataType eDataType, String initialValue) {
		return (List<SStructuralNode>)super.createFromString(initialValue);
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
	public SciidPackage getSciidPackage() {
		return (SciidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SciidPackage getPackage() {
		return SciidPackage.eINSTANCE;
	}

} //SciidFactoryImpl
