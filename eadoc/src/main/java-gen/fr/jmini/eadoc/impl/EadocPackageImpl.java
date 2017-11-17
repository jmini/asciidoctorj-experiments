/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EAdocList;
import fr.jmini.eadoc.EAuthor;
import fr.jmini.eadoc.EBlock;
import fr.jmini.eadoc.ECell;
import fr.jmini.eadoc.EColumn;
import fr.jmini.eadoc.EContentNode;
import fr.jmini.eadoc.EContentPart;
import fr.jmini.eadoc.ECursor;
import fr.jmini.eadoc.EDescriptionList;
import fr.jmini.eadoc.EDescriptionListEntry;
import fr.jmini.eadoc.EDocument;
import fr.jmini.eadoc.EDocumentHeader;
import fr.jmini.eadoc.EListItem;
import fr.jmini.eadoc.EPhraseNode;
import fr.jmini.eadoc.ERevisionInfo;
import fr.jmini.eadoc.ERow;
import fr.jmini.eadoc.ESection;
import fr.jmini.eadoc.EStructuralNode;
import fr.jmini.eadoc.EStructuredDocument;
import fr.jmini.eadoc.ETable;
import fr.jmini.eadoc.ETitle;
import fr.jmini.eadoc.EadocFactory;
import fr.jmini.eadoc.EadocPackage;
import fr.jmini.eadoc.EadocUtility;

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
public class EadocPackageImpl extends EPackageImpl implements EadocPackage {
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
	private EClass eadocUtilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eContentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eContentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDescriptionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDescriptionListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDocumentHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAdocListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePhraseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRevisionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTitleEClass = null;

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
	 * @see fr.jmini.eadoc.EadocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EadocPackageImpl() {
		super(eNS_URI, EadocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EadocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EadocPackage init() {
		if (isInited) return (EadocPackage)EPackage.Registry.INSTANCE.getEPackage(EadocPackage.eNS_URI);

		// Obtain or create and register package
		EadocPackageImpl theEadocPackage = (EadocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EadocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EadocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEadocPackage.createPackageContents();

		// Initialize created meta-data
		theEadocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEadocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EadocPackage.eNS_URI, theEadocPackage);
		return theEadocPackage;
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
	public EClass getEadocUtility() {
		return eadocUtilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAuthor() {
		return eAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_Email() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_FullName() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_FirstName() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_LastName() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_MiddleName() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAuthor_Initials() {
		return (EAttribute)eAuthorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEBlock() {
		return eBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECell() {
		return eCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEColumn() {
		return eColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEColumn_Style() {
		return (EAttribute)eColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEColumn_Table() {
		return (EReference)eColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEColumn_Width() {
		return (EAttribute)eColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEColumn_HorizontalAlignment() {
		return (EAttribute)eColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEColumn_VerticalAlignment() {
		return (EAttribute)eColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEContentNode() {
		return eContentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Id() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_NodeName() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentNode_Parent() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Context() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentNode_Document() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Inline() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Block() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Attributes() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Roles() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEContentPart() {
		return eContentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Id() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Level() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Context() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Style() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Role() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Title() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentPart_Attributes() {
		return (EAttribute)eContentPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentPart_Parts() {
		return (EReference)eContentPartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentPart_ParentPart() {
		return (EReference)eContentPartEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECursor() {
		return eCursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECursor_LineNumber() {
		return (EAttribute)eCursorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECursor_Path() {
		return (EAttribute)eCursorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECursor_Dir() {
		return (EAttribute)eCursorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECursor_File() {
		return (EAttribute)eCursorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDescriptionList() {
		return eDescriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDescriptionListEntry() {
		return eDescriptionListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDocument() {
		return eDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDocumentHeader() {
		return eDocumentHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAdocList() {
		return eAdocListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEListItem() {
		return eListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPhraseNode() {
		return ePhraseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPhraseNode_Target() {
		return (EAttribute)ePhraseNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPhraseNode_Text() {
		return (EAttribute)ePhraseNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPhraseNode_Type() {
		return (EAttribute)ePhraseNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERevisionInfo() {
		return eRevisionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERevisionInfo_Date() {
		return (EAttribute)eRevisionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERevisionInfo_Number() {
		return (EAttribute)eRevisionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getERevisionInfo_Remark() {
		return (EAttribute)eRevisionInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getERow() {
		return eRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESection() {
		return eSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralNode() {
		return eStructuralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralNode_Title() {
		return (EAttribute)eStructuralNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralNode_Style() {
		return (EAttribute)eStructuralNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralNode_Blocks() {
		return (EReference)eStructuralNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralNode_Level() {
		return (EAttribute)eStructuralNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralNode_SourceLocation() {
		return (EReference)eStructuralNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralNode_Substitutions() {
		return (EAttribute)eStructuralNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuredDocument() {
		return eStructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuredDocument_Parts() {
		return (EReference)eStructuredDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuredDocument_Header() {
		return (EReference)eStructuredDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETable() {
		return eTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETable_HeaderOption() {
		return (EAttribute)eTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETable_Columns() {
		return (EReference)eTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETable_Header() {
		return (EReference)eTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETable_Footer() {
		return (EReference)eTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETable_Body() {
		return (EReference)eTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETable_Frame() {
		return (EAttribute)eTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETable_Grid() {
		return (EAttribute)eTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETitle() {
		return eTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETitle_Main() {
		return (EAttribute)eTitleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETitle_Subtitle() {
		return (EAttribute)eTitleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETitle_Combined() {
		return (EAttribute)eTitleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETitle_Sanitized() {
		return (EAttribute)eTitleEClass.getEStructuralFeatures().get(3);
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
	public EadocFactory getEadocFactory() {
		return (EadocFactory)getEFactoryInstance();
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

		eadocUtilityEClass = createEClass(EADOC_UTILITY);

		eAuthorEClass = createEClass(EAUTHOR);
		createEAttribute(eAuthorEClass, EAUTHOR__EMAIL);
		createEAttribute(eAuthorEClass, EAUTHOR__FULL_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__FIRST_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__LAST_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__MIDDLE_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__INITIALS);

		eBlockEClass = createEClass(EBLOCK);

		eCellEClass = createEClass(ECELL);

		eColumnEClass = createEClass(ECOLUMN);
		createEAttribute(eColumnEClass, ECOLUMN__STYLE);
		createEReference(eColumnEClass, ECOLUMN__TABLE);
		createEAttribute(eColumnEClass, ECOLUMN__WIDTH);
		createEAttribute(eColumnEClass, ECOLUMN__HORIZONTAL_ALIGNMENT);
		createEAttribute(eColumnEClass, ECOLUMN__VERTICAL_ALIGNMENT);

		eContentNodeEClass = createEClass(ECONTENT_NODE);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__ID);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__NODE_NAME);
		createEReference(eContentNodeEClass, ECONTENT_NODE__PARENT);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__CONTEXT);
		createEReference(eContentNodeEClass, ECONTENT_NODE__DOCUMENT);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__INLINE);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__BLOCK);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__ATTRIBUTES);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__ROLES);

		eContentPartEClass = createEClass(ECONTENT_PART);
		createEAttribute(eContentPartEClass, ECONTENT_PART__ID);
		createEAttribute(eContentPartEClass, ECONTENT_PART__LEVEL);
		createEAttribute(eContentPartEClass, ECONTENT_PART__CONTEXT);
		createEAttribute(eContentPartEClass, ECONTENT_PART__STYLE);
		createEAttribute(eContentPartEClass, ECONTENT_PART__ROLE);
		createEAttribute(eContentPartEClass, ECONTENT_PART__TITLE);
		createEAttribute(eContentPartEClass, ECONTENT_PART__ATTRIBUTES);
		createEReference(eContentPartEClass, ECONTENT_PART__PARTS);
		createEReference(eContentPartEClass, ECONTENT_PART__PARENT_PART);

		eCursorEClass = createEClass(ECURSOR);
		createEAttribute(eCursorEClass, ECURSOR__LINE_NUMBER);
		createEAttribute(eCursorEClass, ECURSOR__PATH);
		createEAttribute(eCursorEClass, ECURSOR__DIR);
		createEAttribute(eCursorEClass, ECURSOR__FILE);

		eDescriptionListEClass = createEClass(EDESCRIPTION_LIST);

		eDescriptionListEntryEClass = createEClass(EDESCRIPTION_LIST_ENTRY);

		eDocumentEClass = createEClass(EDOCUMENT);

		eDocumentHeaderEClass = createEClass(EDOCUMENT_HEADER);

		eAdocListEClass = createEClass(EADOC_LIST);

		eListItemEClass = createEClass(ELIST_ITEM);

		ePhraseNodeEClass = createEClass(EPHRASE_NODE);
		createEAttribute(ePhraseNodeEClass, EPHRASE_NODE__TARGET);
		createEAttribute(ePhraseNodeEClass, EPHRASE_NODE__TEXT);
		createEAttribute(ePhraseNodeEClass, EPHRASE_NODE__TYPE);

		eRevisionInfoEClass = createEClass(EREVISION_INFO);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__DATE);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__NUMBER);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__REMARK);

		eRowEClass = createEClass(EROW);

		eSectionEClass = createEClass(ESECTION);

		eStructuralNodeEClass = createEClass(ESTRUCTURAL_NODE);
		createEAttribute(eStructuralNodeEClass, ESTRUCTURAL_NODE__TITLE);
		createEAttribute(eStructuralNodeEClass, ESTRUCTURAL_NODE__STYLE);
		createEReference(eStructuralNodeEClass, ESTRUCTURAL_NODE__BLOCKS);
		createEAttribute(eStructuralNodeEClass, ESTRUCTURAL_NODE__LEVEL);
		createEReference(eStructuralNodeEClass, ESTRUCTURAL_NODE__SOURCE_LOCATION);
		createEAttribute(eStructuralNodeEClass, ESTRUCTURAL_NODE__SUBSTITUTIONS);

		eStructuredDocumentEClass = createEClass(ESTRUCTURED_DOCUMENT);
		createEReference(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT__PARTS);
		createEReference(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT__HEADER);

		eTableEClass = createEClass(ETABLE);
		createEAttribute(eTableEClass, ETABLE__HEADER_OPTION);
		createEReference(eTableEClass, ETABLE__COLUMNS);
		createEReference(eTableEClass, ETABLE__HEADER);
		createEReference(eTableEClass, ETABLE__FOOTER);
		createEReference(eTableEClass, ETABLE__BODY);
		createEAttribute(eTableEClass, ETABLE__FRAME);
		createEAttribute(eTableEClass, ETABLE__GRID);

		eTitleEClass = createEClass(ETITLE);
		createEAttribute(eTitleEClass, ETITLE__MAIN);
		createEAttribute(eTitleEClass, ETITLE__SUBTITLE);
		createEAttribute(eTitleEClass, ETITLE__COMBINED);
		createEAttribute(eTitleEClass, ETITLE__SANITIZED);

		// Create data types
		horizontalAlignmentEDataType = createEDataType(HORIZONTAL_ALIGNMENT);
		verticalAlignmentEDataType = createEDataType(VERTICAL_ALIGNMENT);
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
		eAuthorEClass.getESuperTypes().add(this.getAuthor());
		eBlockEClass.getESuperTypes().add(this.getEStructuralNode());
		eCellEClass.getESuperTypes().add(this.getEContentNode());
		eColumnEClass.getESuperTypes().add(this.getEContentNode());
		eColumnEClass.getESuperTypes().add(this.getColumn());
		eContentNodeEClass.getESuperTypes().add(this.getContentNode());
		eContentPartEClass.getESuperTypes().add(this.getContentPart());
		eCursorEClass.getESuperTypes().add(this.getCursor());
		eDescriptionListEClass.getESuperTypes().add(this.getEStructuralNode());
		eDocumentEClass.getESuperTypes().add(this.getEStructuralNode());
		eAdocListEClass.getESuperTypes().add(this.getEStructuralNode());
		eListItemEClass.getESuperTypes().add(this.getEStructuralNode());
		ePhraseNodeEClass.getESuperTypes().add(this.getEContentNode());
		ePhraseNodeEClass.getESuperTypes().add(this.getPhraseNode());
		eRevisionInfoEClass.getESuperTypes().add(this.getRevisionInfo());
		eSectionEClass.getESuperTypes().add(this.getEStructuralNode());
		eStructuralNodeEClass.getESuperTypes().add(this.getEContentNode());
		eStructuralNodeEClass.getESuperTypes().add(this.getStructuralNode());
		eStructuredDocumentEClass.getESuperTypes().add(this.getStructuredDocument());
		eTableEClass.getESuperTypes().add(this.getEStructuralNode());
		eTableEClass.getESuperTypes().add(this.getTable());
		eTitleEClass.getESuperTypes().add(this.getTitle());

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

		initEClass(eadocUtilityEClass, EadocUtility.class, "EadocUtility", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAuthorEClass, EAuthor.class, "EAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAuthor_Email(), theEcorePackage.getEString(), "email", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_FirstName(), theEcorePackage.getEString(), "firstName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_LastName(), theEcorePackage.getEString(), "lastName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_MiddleName(), theEcorePackage.getEString(), "middleName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_Initials(), theEcorePackage.getEString(), "initials", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eBlockEClass, EBlock.class, "EBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCellEClass, ECell.class, "ECell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eColumnEClass, EColumn.class, "EColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEColumn_Style(), theEcorePackage.getEString(), "style", null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEColumn_Table(), this.getETable(), this.getETable_Columns(), "table", null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEColumn_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEColumn_HorizontalAlignment(), this.getHorizontalAlignment(), "horizontalAlignment", null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEColumn_VerticalAlignment(), this.getVerticalAlignment(), "verticalAlignment", null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eColumnEClass, theEcorePackage.getEInt(), "getColumnNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eContentNodeEClass, EContentNode.class, "EContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEContentNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Parent(), this.getContentNode(), null, "parent", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Context(), theEcorePackage.getEString(), "context", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Document(), this.getDocument(), null, "document", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Inline(), theEcorePackage.getEBoolean(), "inline", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Block(), theEcorePackage.getEBoolean(), "block", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Attributes(), this.getStringObjectMap(), "attributes", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Roles(), this.getStringList(), "roles", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "id", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, this.getContentNode(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, this.getDocument(), "document", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "setAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "setAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isOption", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "hasRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "getRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, null, "addRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, null, "removeRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEBoolean(), "isReftext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "getReftext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "iconUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "mediaUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "assetDirKey", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "readAsset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectObjectMap(), "opts", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eContentNodeEClass, theEcorePackage.getEString(), "normalizeWebPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "preserveUriTarget", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eContentPartEClass, EContentPart.class, "EContentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEContentPart_Id(), theEcorePackage.getEString(), "id", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Context(), theEcorePackage.getEString(), "context", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Style(), theEcorePackage.getEString(), "style", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Role(), theEcorePackage.getEString(), "role", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Title(), theEcorePackage.getEString(), "title", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Attributes(), this.getStringObjectMap(), "attributes", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentPart_Parts(), this.getEContentPart(), this.getEContentPart_ParentPart(), "parts", null, 0, -1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentPart_ParentPart(), this.getEContentPart(), this.getEContentPart_Parts(), "parentPart", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eContentPartEClass, theEcorePackage.getEString(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eCursorEClass, ECursor.class, "ECursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECursor_LineNumber(), theEcorePackage.getEInt(), "lineNumber", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_Dir(), theEcorePackage.getEString(), "dir", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_File(), theEcorePackage.getEString(), "file", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDescriptionListEClass, EDescriptionList.class, "EDescriptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDescriptionListEntryEClass, EDescriptionListEntry.class, "EDescriptionListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDocumentEClass, EDocument.class, "EDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDocumentHeaderEClass, EDocumentHeader.class, "EDocumentHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAdocListEClass, EAdocList.class, "EAdocList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eListItemEClass, EListItem.class, "EListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePhraseNodeEClass, EPhraseNode.class, "EPhraseNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPhraseNode_Target(), theEcorePackage.getEString(), "target", null, 0, 1, EPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPhraseNode_Text(), theEcorePackage.getEString(), "text", null, 0, 1, EPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPhraseNode_Type(), theEcorePackage.getEString(), "type", null, 0, 1, EPhraseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ePhraseNodeEClass, theEcorePackage.getEString(), "render", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(ePhraseNodeEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eRevisionInfoEClass, ERevisionInfo.class, "ERevisionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERevisionInfo_Date(), theEcorePackage.getEString(), "date", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERevisionInfo_Number(), theEcorePackage.getEString(), "number", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERevisionInfo_Remark(), theEcorePackage.getEString(), "remark", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRowEClass, ERow.class, "ERow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSectionEClass, ESection.class, "ESection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eStructuralNodeEClass, EStructuralNode.class, "EStructuralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStructuralNode_Title(), theEcorePackage.getEString(), "title", null, 0, 1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralNode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuralNode_Blocks(), this.getEStructuralNode(), null, "blocks", null, 0, -1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralNode_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuralNode_SourceLocation(), this.getECursor(), null, "sourceLocation", null, 0, 1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralNode_Substitutions(), theEcorePackage.getEString(), "substitutions", null, 0, -1, EStructuralNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEString(), "title", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, this.getStructuralNodeList(), "blocks", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, null, "append", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStructuralNode(), "block", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEJavaObject(), "content", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEJavaObject(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEString(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, this.getStructuralNodeList(), "findBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectObjectMap(), "selector", 0, 1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralNodeEClass, theEcorePackage.getEString(), "getContentModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, theEcorePackage.getEBoolean(), "isSubstitutionEnabled", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, null, "removeSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, null, "addSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, null, "prependSubstitution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralNodeEClass, null, "setSubstitutions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "substitution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eStructuredDocumentEClass, EStructuredDocument.class, "EStructuredDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuredDocument_Parts(), this.getEContentPart(), null, "parts", null, 0, -1, EStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuredDocument_Header(), this.getDocumentHeader(), null, "header", null, 0, 1, EStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPart(), "getPartById", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "partId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPart(), "getPartByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPart(), "getPartByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPartList(), "getPartsByContext", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPartList(), "getPartsByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuredDocumentEClass, this.getContentPartList(), "getPartsByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eTableEClass, ETable.class, "ETable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETable_HeaderOption(), theEcorePackage.getEBoolean(), "headerOption", null, 0, 1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETable_Columns(), this.getEColumn(), this.getEColumn_Table(), "columns", null, 0, -1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETable_Header(), this.getRow(), null, "header", null, 0, -1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETable_Footer(), this.getRow(), null, "footer", null, 0, -1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETable_Body(), this.getRow(), null, "body", null, 0, -1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETable_Frame(), theEcorePackage.getEString(), "frame", null, 0, 1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETable_Grid(), theEcorePackage.getEString(), "grid", null, 0, 1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eTableEClass, theEcorePackage.getEBoolean(), "hasHeaderOption", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eTitleEClass, ETitle.class, "ETitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETitle_Main(), theEcorePackage.getEString(), "main", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Subtitle(), theEcorePackage.getEString(), "subtitle", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Combined(), theEcorePackage.getEString(), "combined", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Sanitized(), theEcorePackage.getEBoolean(), "sanitized", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(horizontalAlignmentEDataType, Table.HorizontalAlignment.class, "HorizontalAlignment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verticalAlignmentEDataType, Table.VerticalAlignment.class, "VerticalAlignment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringObjectMapEDataType, Map.class, "StringObjectMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, java.lang.Object>");
		initEDataType(objectObjectMapEDataType, Map.class, "ObjectObjectMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.Object, java.lang.Object>");
		initEDataType(stringListEDataType, java.util.List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");
		initEDataType(contentPartListEDataType, java.util.List.class, "ContentPartList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<org.asciidoctor.ast.ContentPart>");
		initEDataType(structuralNodeListEDataType, java.util.List.class, "StructuralNodeList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<? extends org.asciidoctor.ast.StructuralNode>");

		// Create resource
		createResource(eNS_URI);
	}

} //EadocPackageImpl
