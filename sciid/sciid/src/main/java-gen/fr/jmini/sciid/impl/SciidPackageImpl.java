/**
 */
package fr.jmini.sciid.impl;

import fr.jmini.sciid.SAuthor;
import fr.jmini.sciid.SBlock;
import fr.jmini.sciid.SCell;
import fr.jmini.sciid.SColumn;
import fr.jmini.sciid.SContentNode;
import fr.jmini.sciid.SContentPart;
import fr.jmini.sciid.SCursor;
import fr.jmini.sciid.SDescriptionList;
import fr.jmini.sciid.SDescriptionListEntry;
import fr.jmini.sciid.SDocument;
import fr.jmini.sciid.SDocumentHeader;
import fr.jmini.sciid.SList;
import fr.jmini.sciid.SListItem;
import fr.jmini.sciid.SPhraseNode;
import fr.jmini.sciid.SRevisionInfo;
import fr.jmini.sciid.SRow;
import fr.jmini.sciid.SSection;
import fr.jmini.sciid.SStructuralNode;
import fr.jmini.sciid.SStructuredDocument;
import fr.jmini.sciid.STable;
import fr.jmini.sciid.STitle;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.SciidPackage;
import fr.jmini.sciid.SciidUtility;

import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.Cursor;
import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.PhraseNode;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Title;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SciidPackageImpl extends EPackageImpl implements SciidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phraseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sContentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sContentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sCursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDescriptionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDescriptionListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDocumentHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sPhraseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sRevisionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStructuralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horizontalAlignmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalAlignmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sciidUtilityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringObjectMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectObjectMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentPartListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structuralNodeListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.jmini.sciid.SciidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SciidPackageImpl() {
		super(eNS_URI, SciidFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SciidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SciidPackage init() {
		if (isInited) return (SciidPackage)EPackage.Registry.INSTANCE.getEPackage(SciidPackage.eNS_URI);

		// Obtain or create and register package
		SciidPackageImpl theSciidPackage = (SciidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SciidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SciidPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSciidPackage.createPackageContents();

		// Initialize created meta-data
		theSciidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSciidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SciidPackage.eNS_URI, theSciidPackage);
		return theSciidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentNode() {
		return contentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentPart() {
		return contentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursor() {
		return cursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionList() {
		return descriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionListEntry() {
		return descriptionListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentHeader() {
		return documentHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstList() {
		return astListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhraseNode() {
		return phraseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionInfo() {
		return revisionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralNode() {
		return structuralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDocument() {
		return structuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAuthor() {
		return sAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_Email() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_FullName() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_FirstName() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_LastName() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_MiddleName() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAuthor_Initials() {
		return (EAttribute)sAuthorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSBlock() {
		return sBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSBlock_Lines() {
		return (EAttribute)sBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSBlock_Source() {
		return (EAttribute)sBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCell() {
		return sCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCell_Row() {
		return (EReference)sCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCell_Column() {
		return (EReference)sCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_Colspan() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_Rowspan() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_Source() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_Style() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_HorizontalAlignment() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCell_VerticalAlignment() {
		return (EAttribute)sCellEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSCell_InnerDocument() {
		return (EReference)sCellEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSColumn() {
		return sColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSColumn_Style() {
		return (EAttribute)sColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSColumn_Table() {
		return (EReference)sColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSColumn_Width() {
		return (EAttribute)sColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSColumn_HorizontalAlignment() {
		return (EAttribute)sColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSColumn_VerticalAlignment() {
		return (EAttribute)sColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSContentNode() {
		return sContentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Id() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_NodeName() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContentNode_Parent() {
		return (EReference)sContentNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Context() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContentNode_Document() {
		return (EReference)sContentNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Inline() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Block() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Attributes() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Roles() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentNode_Reftext() {
		return (EAttribute)sContentNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSContentPart() {
		return sContentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Id() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Level() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Context() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Style() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Role() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Title() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSContentPart_Attributes() {
		return (EAttribute)sContentPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContentPart_Parts() {
		return (EReference)sContentPartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContentPart_ParentPart() {
		return (EReference)sContentPartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSCursor() {
		return sCursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCursor_LineNumber() {
		return (EAttribute)sCursorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCursor_Path() {
		return (EAttribute)sCursorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCursor_Dir() {
		return (EAttribute)sCursorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSCursor_File() {
		return (EAttribute)sCursorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDescriptionList() {
		return sDescriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDescriptionList_Items() {
		return (EReference)sDescriptionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDescriptionListEntry() {
		return sDescriptionListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDescriptionListEntry_Terms() {
		return (EReference)sDescriptionListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDescriptionListEntry_Description() {
		return (EReference)sDescriptionListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDocument() {
		return sDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDocument_StructuredDoctitle() {
		return (EReference)sDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDocument_Doctitle() {
		return (EAttribute)sDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDocument_Options() {
		return (EAttribute)sDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDocumentHeader() {
		return sDocumentHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDocumentHeader_Authors() {
		return (EReference)sDocumentHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDocumentHeader_DocumentTitle() {
		return (EReference)sDocumentHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDocumentHeader_PageTitle() {
		return (EAttribute)sDocumentHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDocumentHeader_RevisionInfo() {
		return (EReference)sDocumentHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDocumentHeader_Attributes() {
		return (EAttribute)sDocumentHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSList() {
		return sListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSList_Items() {
		return (EReference)sListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSListItem() {
		return sListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSListItem_Marker() {
		return (EAttribute)sListItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSListItem_Text() {
		return (EAttribute)sListItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSListItem_Source() {
		return (EAttribute)sListItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPhraseNode() {
		return sPhraseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPhraseNode_Target() {
		return (EAttribute)sPhraseNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPhraseNode_Text() {
		return (EAttribute)sPhraseNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPhraseNode_Type() {
		return (EAttribute)sPhraseNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRevisionInfo() {
		return sRevisionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRevisionInfo_Date() {
		return (EAttribute)sRevisionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRevisionInfo_Number() {
		return (EAttribute)sRevisionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRevisionInfo_Remark() {
		return (EAttribute)sRevisionInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRow() {
		return sRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRow_Cells() {
		return (EReference)sRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSection() {
		return sSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSection_Index() {
		return (EAttribute)sSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSection_Number() {
		return (EAttribute)sSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSection_SectionName() {
		return (EAttribute)sSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSection_Special() {
		return (EAttribute)sSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSection_Numbered() {
		return (EAttribute)sSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStructuralNode() {
		return sStructuralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_Title() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_Caption() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_Style() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStructuralNode_Blocks() {
		return (EReference)sStructuralNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_Level() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_ContentModel() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStructuralNode_SourceLocation() {
		return (EReference)sStructuralNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStructuralNode_Substitutions() {
		return (EAttribute)sStructuralNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStructuredDocument() {
		return sStructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStructuredDocument_Parts() {
		return (EReference)sStructuredDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStructuredDocument_Header() {
		return (EReference)sStructuredDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTable() {
		return sTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTable_HeaderOption() {
		return (EAttribute)sTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTable_Columns() {
		return (EReference)sTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTable_Header() {
		return (EReference)sTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTable_Footer() {
		return (EReference)sTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTable_Body() {
		return (EReference)sTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTable_Frame() {
		return (EAttribute)sTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTable_Grid() {
		return (EAttribute)sTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTitle() {
		return sTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTitle_Main() {
		return (EAttribute)sTitleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTitle_Subtitle() {
		return (EAttribute)sTitleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTitle_Combined() {
		return (EAttribute)sTitleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSTitle_Sanitized() {
		return (EAttribute)sTitleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHorizontalAlignment() {
		return horizontalAlignmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerticalAlignment() {
		return verticalAlignmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSciidUtility() {
		return sciidUtilityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringObjectMap() {
		return stringObjectMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObjectObjectMap() {
		return objectObjectMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringList() {
		return stringListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentPartList() {
		return contentPartListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStructuralNodeList() {
		return structuralNodeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SciidFactory getSciidFactory() {
		return (SciidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorEClass = createEClass(AUTHOR);

		blockEClass = createEClass(BLOCK);

		cellEClass = createEClass(CELL);

		columnEClass = createEClass(COLUMN);

		contentNodeEClass = createEClass(CONTENT_NODE);

		contentPartEClass = createEClass(CONTENT_PART);

		cursorEClass = createEClass(CURSOR);

		descriptionListEClass = createEClass(DESCRIPTION_LIST);

		descriptionListEntryEClass = createEClass(DESCRIPTION_LIST_ENTRY);

		documentEClass = createEClass(DOCUMENT);

		documentHeaderEClass = createEClass(DOCUMENT_HEADER);

		astListEClass = createEClass(AST_LIST);

		listItemEClass = createEClass(LIST_ITEM);

		phraseNodeEClass = createEClass(PHRASE_NODE);

		revisionInfoEClass = createEClass(REVISION_INFO);

		rowEClass = createEClass(ROW);

		sectionEClass = createEClass(SECTION);

		structuralNodeEClass = createEClass(STRUCTURAL_NODE);

		structuredDocumentEClass = createEClass(STRUCTURED_DOCUMENT);

		tableEClass = createEClass(TABLE);

		titleEClass = createEClass(TITLE);

		sAuthorEClass = createEClass(SAUTHOR);
		createEAttribute(sAuthorEClass, SAUTHOR__EMAIL);
		createEAttribute(sAuthorEClass, SAUTHOR__FULL_NAME);
		createEAttribute(sAuthorEClass, SAUTHOR__FIRST_NAME);
		createEAttribute(sAuthorEClass, SAUTHOR__LAST_NAME);
		createEAttribute(sAuthorEClass, SAUTHOR__MIDDLE_NAME);
		createEAttribute(sAuthorEClass, SAUTHOR__INITIALS);

		sBlockEClass = createEClass(SBLOCK);
		createEAttribute(sBlockEClass, SBLOCK__LINES);
		createEAttribute(sBlockEClass, SBLOCK__SOURCE);

		sCellEClass = createEClass(SCELL);
		createEReference(sCellEClass, SCELL__ROW);
		createEReference(sCellEClass, SCELL__COLUMN);
		createEAttribute(sCellEClass, SCELL__COLSPAN);
		createEAttribute(sCellEClass, SCELL__ROWSPAN);
		createEAttribute(sCellEClass, SCELL__SOURCE);
		createEAttribute(sCellEClass, SCELL__STYLE);
		createEAttribute(sCellEClass, SCELL__HORIZONTAL_ALIGNMENT);
		createEAttribute(sCellEClass, SCELL__VERTICAL_ALIGNMENT);
		createEReference(sCellEClass, SCELL__INNER_DOCUMENT);

		sColumnEClass = createEClass(SCOLUMN);
		createEAttribute(sColumnEClass, SCOLUMN__STYLE);
		createEReference(sColumnEClass, SCOLUMN__TABLE);
		createEAttribute(sColumnEClass, SCOLUMN__WIDTH);
		createEAttribute(sColumnEClass, SCOLUMN__HORIZONTAL_ALIGNMENT);
		createEAttribute(sColumnEClass, SCOLUMN__VERTICAL_ALIGNMENT);

		sContentNodeEClass = createEClass(SCONTENT_NODE);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__ID);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__NODE_NAME);
		createEReference(sContentNodeEClass, SCONTENT_NODE__PARENT);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__CONTEXT);
		createEReference(sContentNodeEClass, SCONTENT_NODE__DOCUMENT);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__INLINE);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__BLOCK);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__ATTRIBUTES);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__ROLES);
		createEAttribute(sContentNodeEClass, SCONTENT_NODE__REFTEXT);

		sContentPartEClass = createEClass(SCONTENT_PART);
		createEAttribute(sContentPartEClass, SCONTENT_PART__ID);
		createEAttribute(sContentPartEClass, SCONTENT_PART__LEVEL);
		createEAttribute(sContentPartEClass, SCONTENT_PART__CONTEXT);
		createEAttribute(sContentPartEClass, SCONTENT_PART__STYLE);
		createEAttribute(sContentPartEClass, SCONTENT_PART__ROLE);
		createEAttribute(sContentPartEClass, SCONTENT_PART__TITLE);
		createEAttribute(sContentPartEClass, SCONTENT_PART__ATTRIBUTES);
		createEReference(sContentPartEClass, SCONTENT_PART__PARTS);
		createEReference(sContentPartEClass, SCONTENT_PART__PARENT_PART);

		sCursorEClass = createEClass(SCURSOR);
		createEAttribute(sCursorEClass, SCURSOR__LINE_NUMBER);
		createEAttribute(sCursorEClass, SCURSOR__PATH);
		createEAttribute(sCursorEClass, SCURSOR__DIR);
		createEAttribute(sCursorEClass, SCURSOR__FILE);

		sDescriptionListEClass = createEClass(SDESCRIPTION_LIST);
		createEReference(sDescriptionListEClass, SDESCRIPTION_LIST__ITEMS);

		sDescriptionListEntryEClass = createEClass(SDESCRIPTION_LIST_ENTRY);
		createEReference(sDescriptionListEntryEClass, SDESCRIPTION_LIST_ENTRY__TERMS);
		createEReference(sDescriptionListEntryEClass, SDESCRIPTION_LIST_ENTRY__DESCRIPTION);

		sDocumentEClass = createEClass(SDOCUMENT);
		createEReference(sDocumentEClass, SDOCUMENT__STRUCTURED_DOCTITLE);
		createEAttribute(sDocumentEClass, SDOCUMENT__DOCTITLE);
		createEAttribute(sDocumentEClass, SDOCUMENT__OPTIONS);

		sDocumentHeaderEClass = createEClass(SDOCUMENT_HEADER);
		createEReference(sDocumentHeaderEClass, SDOCUMENT_HEADER__AUTHORS);
		createEReference(sDocumentHeaderEClass, SDOCUMENT_HEADER__DOCUMENT_TITLE);
		createEAttribute(sDocumentHeaderEClass, SDOCUMENT_HEADER__PAGE_TITLE);
		createEReference(sDocumentHeaderEClass, SDOCUMENT_HEADER__REVISION_INFO);
		createEAttribute(sDocumentHeaderEClass, SDOCUMENT_HEADER__ATTRIBUTES);

		sListEClass = createEClass(SLIST);
		createEReference(sListEClass, SLIST__ITEMS);

		sListItemEClass = createEClass(SLIST_ITEM);
		createEAttribute(sListItemEClass, SLIST_ITEM__MARKER);
		createEAttribute(sListItemEClass, SLIST_ITEM__TEXT);
		createEAttribute(sListItemEClass, SLIST_ITEM__SOURCE);

		sPhraseNodeEClass = createEClass(SPHRASE_NODE);
		createEAttribute(sPhraseNodeEClass, SPHRASE_NODE__TARGET);
		createEAttribute(sPhraseNodeEClass, SPHRASE_NODE__TEXT);
		createEAttribute(sPhraseNodeEClass, SPHRASE_NODE__TYPE);

		sRevisionInfoEClass = createEClass(SREVISION_INFO);
		createEAttribute(sRevisionInfoEClass, SREVISION_INFO__DATE);
		createEAttribute(sRevisionInfoEClass, SREVISION_INFO__NUMBER);
		createEAttribute(sRevisionInfoEClass, SREVISION_INFO__REMARK);

		sRowEClass = createEClass(SROW);
		createEReference(sRowEClass, SROW__CELLS);

		sSectionEClass = createEClass(SSECTION);
		createEAttribute(sSectionEClass, SSECTION__INDEX);
		createEAttribute(sSectionEClass, SSECTION__NUMBER);
		createEAttribute(sSectionEClass, SSECTION__SECTION_NAME);
		createEAttribute(sSectionEClass, SSECTION__SPECIAL);
		createEAttribute(sSectionEClass, SSECTION__NUMBERED);

		sStructuralNodeEClass = createEClass(SSTRUCTURAL_NODE);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__TITLE);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__CAPTION);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__STYLE);
		createEReference(sStructuralNodeEClass, SSTRUCTURAL_NODE__BLOCKS);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__LEVEL);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__CONTENT_MODEL);
		createEReference(sStructuralNodeEClass, SSTRUCTURAL_NODE__SOURCE_LOCATION);
		createEAttribute(sStructuralNodeEClass, SSTRUCTURAL_NODE__SUBSTITUTIONS);

		sStructuredDocumentEClass = createEClass(SSTRUCTURED_DOCUMENT);
		createEReference(sStructuredDocumentEClass, SSTRUCTURED_DOCUMENT__PARTS);
		createEReference(sStructuredDocumentEClass, SSTRUCTURED_DOCUMENT__HEADER);

		sTableEClass = createEClass(STABLE);
		createEAttribute(sTableEClass, STABLE__HEADER_OPTION);
		createEReference(sTableEClass, STABLE__COLUMNS);
		createEReference(sTableEClass, STABLE__HEADER);
		createEReference(sTableEClass, STABLE__FOOTER);
		createEReference(sTableEClass, STABLE__BODY);
		createEAttribute(sTableEClass, STABLE__FRAME);
		createEAttribute(sTableEClass, STABLE__GRID);

		sTitleEClass = createEClass(STITLE);
		createEAttribute(sTitleEClass, STITLE__MAIN);
		createEAttribute(sTitleEClass, STITLE__SUBTITLE);
		createEAttribute(sTitleEClass, STITLE__COMBINED);
		createEAttribute(sTitleEClass, STITLE__SANITIZED);

		// Create data types
		horizontalAlignmentEDataType = createEDataType(HORIZONTAL_ALIGNMENT);
		verticalAlignmentEDataType = createEDataType(VERTICAL_ALIGNMENT);
		sciidUtilityEDataType = createEDataType(SCIID_UTILITY);
		stringObjectMapEDataType = createEDataType(STRING_OBJECT_MAP);
		objectObjectMapEDataType = createEDataType(OBJECT_OBJECT_MAP);
		stringListEDataType = createEDataType(STRING_LIST);
		contentPartListEDataType = createEDataType(CONTENT_PART_LIST);
		structuralNodeListEDataType = createEDataType(STRUCTURAL_NODE_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sAuthorEClass.getESuperTypes().add(this.getAuthor());
		sBlockEClass.getESuperTypes().add(this.getSStructuralNode());
		sBlockEClass.getESuperTypes().add(this.getBlock());
		sCellEClass.getESuperTypes().add(this.getSContentNode());
		sCellEClass.getESuperTypes().add(this.getCell());
		sColumnEClass.getESuperTypes().add(this.getSContentNode());
		sColumnEClass.getESuperTypes().add(this.getColumn());
		sContentNodeEClass.getESuperTypes().add(this.getContentNode());
		sContentPartEClass.getESuperTypes().add(this.getContentPart());
		sCursorEClass.getESuperTypes().add(this.getCursor());
		sDescriptionListEClass.getESuperTypes().add(this.getSStructuralNode());
		sDescriptionListEClass.getESuperTypes().add(this.getDescriptionList());
		sDescriptionListEntryEClass.getESuperTypes().add(this.getDescriptionListEntry());
		sDocumentEClass.getESuperTypes().add(this.getSStructuralNode());
		sDocumentEClass.getESuperTypes().add(this.getDocument());
		sDocumentHeaderEClass.getESuperTypes().add(this.getDocumentHeader());
		sListEClass.getESuperTypes().add(this.getSStructuralNode());
		sListEClass.getESuperTypes().add(this.getAstList());
		sListItemEClass.getESuperTypes().add(this.getSStructuralNode());
		sListItemEClass.getESuperTypes().add(this.getListItem());
		sPhraseNodeEClass.getESuperTypes().add(this.getSContentNode());
		sPhraseNodeEClass.getESuperTypes().add(this.getPhraseNode());
		sRevisionInfoEClass.getESuperTypes().add(this.getRevisionInfo());
		sRowEClass.getESuperTypes().add(this.getRow());
		sSectionEClass.getESuperTypes().add(this.getSStructuralNode());
		sSectionEClass.getESuperTypes().add(this.getSection());
		sStructuralNodeEClass.getESuperTypes().add(this.getSContentNode());
		sStructuralNodeEClass.getESuperTypes().add(this.getStructuralNode());
		sStructuredDocumentEClass.getESuperTypes().add(this.getStructuredDocument());
		sTableEClass.getESuperTypes().add(this.getSStructuralNode());
		sTableEClass.getESuperTypes().add(this.getTable());
		sTitleEClass.getESuperTypes().add(this.getTitle());

		// Initialize classes and features; add operations and parameters
		initEClass(authorEClass, Author.class, "Author", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(cellEClass, Cell.class, "Cell", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnEClass, Column.class, "Column", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentNodeEClass, ContentNode.class, "ContentNode", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentPartEClass, ContentPart.class, "ContentPart", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(cursorEClass, Cursor.class, "Cursor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionListEClass, DescriptionList.class, "DescriptionList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionListEntryEClass, DescriptionListEntry.class, "DescriptionListEntry", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentHeaderEClass, DocumentHeader.class, "DocumentHeader", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(astListEClass, List.class, "AstList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(listItemEClass, ListItem.class, "ListItem", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(phraseNodeEClass, PhraseNode.class, "PhraseNode", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(revisionInfoEClass, RevisionInfo.class, "RevisionInfo", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(rowEClass, Row.class, "Row", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralNodeEClass, StructuralNode.class, "StructuralNode", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredDocumentEClass, StructuredDocument.class, "StructuredDocument", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(titleEClass, Title.class, "Title", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(sAuthorEClass, SAuthor.class, "SAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSAuthor_Email(), theEcorePackage.getEString(), "email", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAuthor_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAuthor_FirstName(), theEcorePackage.getEString(), "firstName", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAuthor_LastName(), theEcorePackage.getEString(), "lastName", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAuthor_MiddleName(), theEcorePackage.getEString(), "middleName", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAuthor_Initials(), theEcorePackage.getEString(), "initials", null, 0, 1, SAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sBlockEClass, SBlock.class, "SBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSBlock_Lines(), this.getStringList(), "lines", null, 0, 1, SBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSBlock_Source(), theEcorePackage.getEString(), "source", null, 0, 1, SBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sBlockEClass, this.getStringList(), "lines", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sBlockEClass, theEcorePackage.getEString(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sCellEClass, SCell.class, "SCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSCell_Row(), this.getSRow(), this.getSRow_Cells(), "row", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCell_Column(), this.getSColumn(), null, "column", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_Colspan(), theEcorePackage.getEInt(), "colspan", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_Rowspan(), theEcorePackage.getEInt(), "rowspan", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_Source(), theEcorePackage.getEString(), "source", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_Style(), theEcorePackage.getEString(), "style", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_HorizontalAlignment(), this.getHorizontalAlignment(), "horizontalAlignment", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCell_VerticalAlignment(), this.getVerticalAlignment(), "verticalAlignment", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCell_InnerDocument(), this.getDocument(), null, "innerDocument", null, 0, 1, SCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sCellEClass, theEcorePackage.getEString(), "getText", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sCellEClass, theEcorePackage.getEJavaObject(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sColumnEClass, SColumn.class, "SColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSColumn_Style(), theEcorePackage.getEString(), "style", null, 0, 1, SColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSColumn_Table(), this.getSTable(), this.getSTable_Columns(), "table", null, 0, 1, SColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSColumn_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, SColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSColumn_HorizontalAlignment(), this.getHorizontalAlignment(), "horizontalAlignment", null, 0, 1, SColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSColumn_VerticalAlignment(), this.getVerticalAlignment(), "verticalAlignment", null, 0, 1, SColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sColumnEClass, theEcorePackage.getEInt(), "getColumnNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sContentNodeEClass, SContentNode.class, "SContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSContentNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSContentNode_Parent(), this.getContentNode(), null, "parent", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Context(), theEcorePackage.getEString(), "context", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSContentNode_Document(), this.getDocument(), null, "document", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Inline(), theEcorePackage.getEBoolean(), "inline", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Block(), theEcorePackage.getEBoolean(), "block", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Attributes(), this.getStringObjectMap(), "attributes", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Roles(), this.getStringList(), "roles", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentNode_Reftext(), theEcorePackage.getEString(), "reftext", null, 0, 1, SContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "id", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, this.getContentNode(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, this.getDocument(), "document", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "setAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "setAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isOption", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "hasRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "getRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, null, "addRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, null, "removeRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sContentNodeEClass, theEcorePackage.getEBoolean(), "isReftext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "iconUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "mediaUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "assetDirKey", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "readAsset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectObjectMap(), "opts", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sContentNodeEClass, theEcorePackage.getEString(), "normalizeWebPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "preserveUriTarget", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sContentPartEClass, SContentPart.class, "SContentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSContentPart_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Context(), theEcorePackage.getEString(), "context", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Style(), theEcorePackage.getEString(), "style", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Role(), theEcorePackage.getEString(), "role", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSContentPart_Attributes(), this.getStringObjectMap(), "attributes", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSContentPart_Parts(), this.getSContentPart(), this.getSContentPart_ParentPart(), "parts", null, 0, -1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSContentPart_ParentPart(), this.getSContentPart(), this.getSContentPart_Parts(), "parentPart", null, 0, 1, SContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sContentPartEClass, theEcorePackage.getEString(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sCursorEClass, SCursor.class, "SCursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSCursor_LineNumber(), theEcorePackage.getEInt(), "lineNumber", null, 0, 1, SCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCursor_Path(), theEcorePackage.getEString(), "path", null, 0, 1, SCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCursor_Dir(), theEcorePackage.getEString(), "dir", null, 0, 1, SCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCursor_File(), theEcorePackage.getEString(), "file", null, 0, 1, SCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDescriptionListEClass, SDescriptionList.class, "SDescriptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDescriptionList_Items(), this.getSDescriptionListEntry(), null, "items", null, 0, -1, SDescriptionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sDescriptionListEClass, theEcorePackage.getEBoolean(), "hasItems", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sDescriptionListEClass, theEcorePackage.getEString(), "render", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sDescriptionListEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sDescriptionListEntryEClass, SDescriptionListEntry.class, "SDescriptionListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDescriptionListEntry_Terms(), this.getSListItem(), null, "terms", null, 0, -1, SDescriptionListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDescriptionListEntry_Description(), this.getSListItem(), null, "description", null, 0, 1, SDescriptionListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(sDescriptionListEntryEClass, null, "setDescription", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListItem(), "item", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sDocumentEClass, SDocument.class, "SDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDocument_StructuredDoctitle(), this.getSTitle(), null, "structuredDoctitle", null, 0, 1, SDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDocument_Doctitle(), theEcorePackage.getEString(), "doctitle", null, 0, 1, SDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDocument_Options(), this.getObjectObjectMap(), "options", null, 0, 1, SDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sDocumentEClass, theEcorePackage.getEString(), "doctitle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sDocumentEClass, theEcorePackage.getEBoolean(), "isBasebackend", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "backend", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sDocumentEClass, theEcorePackage.getEBoolean(), "basebackend", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "backend", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sDocumentEClass, theEcorePackage.getEInt(), "getAndIncrementCounter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sDocumentEClass, theEcorePackage.getEInt(), "getAndIncrementCounter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "initialValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sDocumentHeaderEClass, SDocumentHeader.class, "SDocumentHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDocumentHeader_Authors(), this.getSAuthor(), null, "authors", null, 0, -1, SDocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDocumentHeader_DocumentTitle(), this.getSTitle(), null, "documentTitle", null, 0, 1, SDocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDocumentHeader_PageTitle(), theEcorePackage.getEString(), "pageTitle", null, 0, 1, SDocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDocumentHeader_RevisionInfo(), this.getSRevisionInfo(), null, "revisionInfo", null, 0, 1, SDocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDocumentHeader_Attributes(), this.getStringObjectMap(), "attributes", null, 0, 1, SDocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sDocumentHeaderEClass, this.getAuthor(), "getAuthor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sListEClass, SList.class, "SList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSList_Items(), this.getSStructuralNode(), null, "items", null, 0, -1, SList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sListEClass, theEcorePackage.getEBoolean(), "hasItems", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sListEClass, theEcorePackage.getEString(), "render", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sListEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sListItemEClass, SListItem.class, "SListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSListItem_Marker(), theEcorePackage.getEString(), "marker", null, 0, 1, SListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSListItem_Text(), theEcorePackage.getEString(), "text", null, 0, 1, SListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSListItem_Source(), theEcorePackage.getEString(), "source", null, 0, 1, SListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sListItemEClass, theEcorePackage.getEBoolean(), "hasText", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sPhraseNodeEClass, SPhraseNode.class, "SPhraseNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPhraseNode_Target(), theEcorePackage.getEString(), "target", null, 0, 1, SPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPhraseNode_Text(), theEcorePackage.getEString(), "text", null, 0, 1, SPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPhraseNode_Type(), theEcorePackage.getEString(), "type", null, 0, 1, SPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sPhraseNodeEClass, theEcorePackage.getEString(), "render", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sPhraseNodeEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sRevisionInfoEClass, SRevisionInfo.class, "SRevisionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRevisionInfo_Date(), theEcorePackage.getEString(), "date", null, 0, 1, SRevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRevisionInfo_Number(), theEcorePackage.getEString(), "number", null, 0, 1, SRevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSRevisionInfo_Remark(), theEcorePackage.getEString(), "remark", null, 0, 1, SRevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sRowEClass, SRow.class, "SRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSRow_Cells(), this.getSCell(), this.getSCell_Row(), "cells", null, 0, -1, SRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sSectionEClass, SSection.class, "SSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSSection_Index(), theEcorePackage.getEInt(), "index", null, 0, 1, SSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSection_Number(), theEcorePackage.getEInt(), "number", null, 0, 1, SSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSection_SectionName(), theEcorePackage.getEString(), "sectionName", null, 0, 1, SSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSection_Special(), theEcorePackage.getEBoolean(), "special", null, 0, 1, SSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSection_Numbered(), theEcorePackage.getEBoolean(), "numbered", null, 0, 1, SSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sSectionEClass, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sSectionEClass, theEcorePackage.getEInt(), "number", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sSectionEClass, theEcorePackage.getEString(), "sectname", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sSectionEClass, theEcorePackage.getEBoolean(), "special", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sSectionEClass, theEcorePackage.getEBoolean(), "numbered", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sStructuralNodeEClass, SStructuralNode.class, "SStructuralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSStructuralNode_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructuralNode_Caption(), theEcorePackage.getEString(), "caption", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructuralNode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSStructuralNode_Blocks(), this.getSStructuralNode(), null, "blocks", null, 0, -1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructuralNode_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructuralNode_ContentModel(), theEcorePackage.getEString(), "contentModel", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSStructuralNode_SourceLocation(), this.getSCursor(), null, "sourceLocation", null, 0, 1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructuralNode_Substitutions(), theEcorePackage.getEString(), "substitutions", null, 0, -1, SStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, theEcorePackage.getEString(), "title", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, this.getStructuralNodeList(), "blocks", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, null, "append", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStructuralNode(), "block", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, theEcorePackage.getEJavaObject(), "content", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, theEcorePackage.getEJavaObject(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(sStructuralNodeEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, this.getStructuralNodeList(), "findBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectObjectMap(), "selector", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, theEcorePackage.getEBoolean(), "isSubstitutionEnabled", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, null, "removeSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, null, "addSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, null, "prependSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuralNodeEClass, null, "setSubstitutions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sStructuredDocumentEClass, SStructuredDocument.class, "SStructuredDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSStructuredDocument_Parts(), this.getSContentPart(), null, "parts", null, 0, -1, SStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSStructuredDocument_Header(), this.getDocumentHeader(), null, "header", null, 0, 1, SStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPart(), "getPartById", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "partId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPart(), "getPartByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPart(), "getPartByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPartList(), "getPartsByContext", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPartList(), "getPartsByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sStructuredDocumentEClass, this.getContentPartList(), "getPartsByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sTableEClass, STable.class, "STable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSTable_HeaderOption(), theEcorePackage.getEBoolean(), "headerOption", null, 0, 1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTable_Columns(), this.getSColumn(), this.getSColumn_Table(), "columns", null, 0, -1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTable_Header(), this.getRow(), null, "header", null, 0, -1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTable_Footer(), this.getRow(), null, "footer", null, 0, -1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTable_Body(), this.getRow(), null, "body", null, 0, -1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSTable_Frame(), theEcorePackage.getEString(), "frame", null, 0, 1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSTable_Grid(), theEcorePackage.getEString(), "grid", null, 0, 1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sTableEClass, theEcorePackage.getEBoolean(), "hasHeaderOption", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sTitleEClass, STitle.class, "STitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSTitle_Main(), theEcorePackage.getEString(), "main", null, 0, 1, STitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSTitle_Subtitle(), theEcorePackage.getEString(), "subtitle", null, 0, 1, STitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSTitle_Combined(), theEcorePackage.getEString(), "combined", null, 0, 1, STitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSTitle_Sanitized(), theEcorePackage.getEBoolean(), "sanitized", null, 0, 1, STitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(horizontalAlignmentEDataType, Table.HorizontalAlignment.class, "HorizontalAlignment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verticalAlignmentEDataType, Table.VerticalAlignment.class, "VerticalAlignment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sciidUtilityEDataType, SciidUtility.class, "SciidUtility", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringObjectMapEDataType, Map.class, "StringObjectMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, java.lang.Object>");
		initEDataType(objectObjectMapEDataType, Map.class, "ObjectObjectMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.Object, java.lang.Object>");
		initEDataType(stringListEDataType, java.util.List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");
		initEDataType(contentPartListEDataType, java.util.List.class, "ContentPartList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<org.asciidoctor.ast.ContentPart>");
		initEDataType(structuralNodeListEDataType, java.util.List.class, "StructuralNodeList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<fr.jmini.sciid.SStructuralNode>");

		// Create resource
		createResource(eNS_URI);
	}

} //SciidPackageImpl
