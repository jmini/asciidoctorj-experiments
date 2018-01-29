/**
 */
package fr.jmini.sciid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.jmini.sciid.SciidFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' operationReflection='false' modelDirectory='sciid/src/main/java-gen' complianceLevel='8.0' basePackage='fr.jmini'"
 * @generated
 */
public interface SciidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sciid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.jmini.sciid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sciid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SciidPackage eINSTANCE = fr.jmini.sciid.impl.SciidPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Author <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Author
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 0;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Block <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Block
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Cell <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Cell
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Column <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Column
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.ContentNode
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentNode()
	 * @generated
	 */
	int CONTENT_NODE = 4;

	/**
	 * The number of structural features of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.ContentPart
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentPart()
	 * @generated
	 */
	int CONTENT_PART = 5;

	/**
	 * The number of structural features of the '<em>Content Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PART_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Cursor
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 6;

	/**
	 * The number of structural features of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.DescriptionList <em>Description List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.DescriptionList
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDescriptionList()
	 * @generated
	 */
	int DESCRIPTION_LIST = 7;

	/**
	 * The number of structural features of the '<em>Description List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.DescriptionListEntry <em>Description List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.DescriptionListEntry
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDescriptionListEntry()
	 * @generated
	 */
	int DESCRIPTION_LIST_ENTRY = 8;

	/**
	 * The number of structural features of the '<em>Description List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_LIST_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Document
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 9;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.DocumentHeader
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDocumentHeader()
	 * @generated
	 */
	int DOCUMENT_HEADER = 10;

	/**
	 * The number of structural features of the '<em>Document Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.List <em>Ast List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.List
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getAstList()
	 * @generated
	 */
	int AST_LIST = 11;

	/**
	 * The number of structural features of the '<em>Ast List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_LIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.ListItem <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.ListItem
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 12;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.PhraseNode <em>Phrase Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.PhraseNode
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getPhraseNode()
	 * @generated
	 */
	int PHRASE_NODE = 13;

	/**
	 * The number of structural features of the '<em>Phrase Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.RevisionInfo
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getRevisionInfo()
	 * @generated
	 */
	int REVISION_INFO = 14;

	/**
	 * The number of structural features of the '<em>Revision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_INFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Row <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Row
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 15;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Section <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Section
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 16;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.StructuralNode <em>Structural Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.StructuralNode
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuralNode()
	 * @generated
	 */
	int STRUCTURAL_NODE = 17;

	/**
	 * The number of structural features of the '<em>Structural Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.StructuredDocument
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuredDocument()
	 * @generated
	 */
	int STRUCTURED_DOCUMENT = 18;

	/**
	 * The number of structural features of the '<em>Structured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DOCUMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Table <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Table
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 19;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Title <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Title
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 20;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SAuthorImpl <em>SAuthor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SAuthorImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSAuthor()
	 * @generated
	 */
	int SAUTHOR = 21;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__EMAIL = AUTHOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__FULL_NAME = AUTHOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__FIRST_NAME = AUTHOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__LAST_NAME = AUTHOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__MIDDLE_NAME = AUTHOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR__INITIALS = AUTHOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SAuthor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUTHOR_FEATURE_COUNT = AUTHOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SContentNodeImpl <em>SContent Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SContentNodeImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSContentNode()
	 * @generated
	 */
	int SCONTENT_NODE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__ID = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__NODE_NAME = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__PARENT = CONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__CONTEXT = CONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__DOCUMENT = CONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__INLINE = CONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__BLOCK = CONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__ATTRIBUTES = CONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__ROLES = CONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE__REFTEXT = CONTENT_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>SContent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_NODE_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SStructuralNodeImpl <em>SStructural Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SStructuralNodeImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSStructuralNode()
	 * @generated
	 */
	int SSTRUCTURAL_NODE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__ID = SCONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__NODE_NAME = SCONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__PARENT = SCONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__CONTEXT = SCONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__DOCUMENT = SCONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__INLINE = SCONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__BLOCK = SCONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__ATTRIBUTES = SCONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__ROLES = SCONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__REFTEXT = SCONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__TITLE = SCONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__CAPTION = SCONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__STYLE = SCONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__BLOCKS = SCONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__LEVEL = SCONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__CONTENT_MODEL = SCONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__SOURCE_LOCATION = SCONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE__SUBSTITUTIONS = SCONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SStructural Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURAL_NODE_FEATURE_COUNT = SCONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SBlockImpl <em>SBlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SBlockImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSBlock()
	 * @generated
	 */
	int SBLOCK = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__LINES = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK__SOURCE = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SBlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBLOCK_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SCellImpl <em>SCell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SCellImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSCell()
	 * @generated
	 */
	int SCELL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__ID = SCONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__NODE_NAME = SCONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__PARENT = SCONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__CONTEXT = SCONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__DOCUMENT = SCONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__INLINE = SCONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__BLOCK = SCONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__ATTRIBUTES = SCONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__ROLES = SCONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__REFTEXT = SCONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__ROW = SCONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__COLUMN = SCONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__COLSPAN = SCONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__ROWSPAN = SCONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__SOURCE = SCONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__STYLE = SCONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__HORIZONTAL_ALIGNMENT = SCONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__VERTICAL_ALIGNMENT = SCONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inner Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL__INNER_DOCUMENT = SCONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>SCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCELL_FEATURE_COUNT = SCONTENT_NODE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SColumnImpl <em>SColumn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SColumnImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSColumn()
	 * @generated
	 */
	int SCOLUMN = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__ID = SCONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__NODE_NAME = SCONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__PARENT = SCONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__CONTEXT = SCONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__DOCUMENT = SCONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__INLINE = SCONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__BLOCK = SCONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__ATTRIBUTES = SCONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__ROLES = SCONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__REFTEXT = SCONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__STYLE = SCONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__TABLE = SCONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__WIDTH = SCONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__HORIZONTAL_ALIGNMENT = SCONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN__VERTICAL_ALIGNMENT = SCONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOLUMN_FEATURE_COUNT = SCONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SContentPartImpl <em>SContent Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SContentPartImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSContentPart()
	 * @generated
	 */
	int SCONTENT_PART = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__ID = CONTENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__LEVEL = CONTENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__CONTEXT = CONTENT_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__STYLE = CONTENT_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__ROLE = CONTENT_PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__TITLE = CONTENT_PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__ATTRIBUTES = CONTENT_PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__PARTS = CONTENT_PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART__PARENT_PART = CONTENT_PART_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>SContent Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTENT_PART_FEATURE_COUNT = CONTENT_PART_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SCursorImpl <em>SCursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SCursorImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSCursor()
	 * @generated
	 */
	int SCURSOR = 27;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCURSOR__LINE_NUMBER = CURSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCURSOR__PATH = CURSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCURSOR__DIR = CURSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCURSOR__FILE = CURSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SCursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCURSOR_FEATURE_COUNT = CURSOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SDescriptionListImpl <em>SDescription List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SDescriptionListImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDescriptionList()
	 * @generated
	 */
	int SDESCRIPTION_LIST = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST__ITEMS = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SDescription List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SDescriptionListEntryImpl <em>SDescription List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SDescriptionListEntryImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDescriptionListEntry()
	 * @generated
	 */
	int SDESCRIPTION_LIST_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST_ENTRY__TERMS = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST_ENTRY__DESCRIPTION = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SDescription List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDESCRIPTION_LIST_ENTRY_FEATURE_COUNT = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SDocumentImpl <em>SDocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SDocumentImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDocument()
	 * @generated
	 */
	int SDOCUMENT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Structured Doctitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__STRUCTURED_DOCTITLE = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doctitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__DOCTITLE = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT__OPTIONS = SSTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SDocumentHeaderImpl <em>SDocument Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SDocumentHeaderImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDocumentHeader()
	 * @generated
	 */
	int SDOCUMENT_HEADER = 31;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER__AUTHORS = DOCUMENT_HEADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER__DOCUMENT_TITLE = DOCUMENT_HEADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER__PAGE_TITLE = DOCUMENT_HEADER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER__REVISION_INFO = DOCUMENT_HEADER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER__ATTRIBUTES = DOCUMENT_HEADER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SDocument Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOCUMENT_HEADER_FEATURE_COUNT = DOCUMENT_HEADER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SListImpl <em>SList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SListImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSList()
	 * @generated
	 */
	int SLIST = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST__ITEMS = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SListItemImpl <em>SList Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SListItemImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSListItem()
	 * @generated
	 */
	int SLIST_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__MARKER = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__TEXT = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM__SOURCE = SSTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SList Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIST_ITEM_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SPhraseNodeImpl <em>SPhrase Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SPhraseNodeImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSPhraseNode()
	 * @generated
	 */
	int SPHRASE_NODE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__ID = SCONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__NODE_NAME = SCONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__PARENT = SCONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__CONTEXT = SCONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__DOCUMENT = SCONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__INLINE = SCONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__BLOCK = SCONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__ATTRIBUTES = SCONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__ROLES = SCONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__REFTEXT = SCONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__TARGET = SCONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__TEXT = SCONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE__TYPE = SCONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SPhrase Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHRASE_NODE_FEATURE_COUNT = SCONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SRevisionInfoImpl <em>SRevision Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SRevisionInfoImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSRevisionInfo()
	 * @generated
	 */
	int SREVISION_INFO = 35;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SREVISION_INFO__DATE = REVISION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SREVISION_INFO__NUMBER = REVISION_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SREVISION_INFO__REMARK = REVISION_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SRevision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SREVISION_INFO_FEATURE_COUNT = REVISION_INFO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SRowImpl <em>SRow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SRowImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSRow()
	 * @generated
	 */
	int SROW = 36;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SROW__CELLS = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SRow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SSectionImpl <em>SSection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SSectionImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSSection()
	 * @generated
	 */
	int SSECTION = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__INDEX = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__NUMBER = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__SECTION_NAME = SSTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__SPECIAL = SSTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION__NUMBERED = SSTRUCTURAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SSection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSECTION_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.SStructuredDocumentImpl <em>SStructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.SStructuredDocumentImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSStructuredDocument()
	 * @generated
	 */
	int SSTRUCTURED_DOCUMENT = 39;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURED_DOCUMENT__PARTS = STRUCTURED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURED_DOCUMENT__HEADER = STRUCTURED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SStructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURED_DOCUMENT_FEATURE_COUNT = STRUCTURED_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.STableImpl <em>STable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.STableImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSTable()
	 * @generated
	 */
	int STABLE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__ID = SSTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__NODE_NAME = SSTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__PARENT = SSTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__CONTEXT = SSTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__DOCUMENT = SSTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__INLINE = SSTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__BLOCK = SSTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__ATTRIBUTES = SSTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__ROLES = SSTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__REFTEXT = SSTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__TITLE = SSTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__CAPTION = SSTRUCTURAL_NODE__CAPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__STYLE = SSTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__BLOCKS = SSTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__LEVEL = SSTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Content Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__CONTENT_MODEL = SSTRUCTURAL_NODE__CONTENT_MODEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__SOURCE_LOCATION = SSTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__SUBSTITUTIONS = SSTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Header Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__HEADER_OPTION = SSTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__COLUMNS = SSTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__HEADER = SSTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__FOOTER = SSTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__BODY = SSTRUCTURAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__FRAME = SSTRUCTURAL_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE__GRID = SSTRUCTURAL_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>STable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STABLE_FEATURE_COUNT = SSTRUCTURAL_NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.jmini.sciid.impl.STitleImpl <em>STitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.impl.STitleImpl
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSTitle()
	 * @generated
	 */
	int STITLE = 41;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STITLE__MAIN = TITLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STITLE__SUBTITLE = TITLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STITLE__COMBINED = TITLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sanitized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STITLE__SANITIZED = TITLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>STitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STITLE_FEATURE_COUNT = TITLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>Horizontal Alignment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Table.HorizontalAlignment
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getHorizontalAlignment()
	 * @generated
	 */
	int HORIZONTAL_ALIGNMENT = 42;

	/**
	 * The meta object id for the '<em>Vertical Alignment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Table.VerticalAlignment
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getVerticalAlignment()
	 * @generated
	 */
	int VERTICAL_ALIGNMENT = 43;

	/**
	 * The meta object id for the '<em>Utility</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.sciid.SciidUtility
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSciidUtility()
	 * @generated
	 */
	int SCIID_UTILITY = 44;

	/**
	 * The meta object id for the '<em>String Object Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStringObjectMap()
	 * @generated
	 */
	int STRING_OBJECT_MAP = 45;

	/**
	 * The meta object id for the '<em>Object Object Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getObjectObjectMap()
	 * @generated
	 */
	int OBJECT_OBJECT_MAP = 46;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 47;

	/**
	 * The meta object id for the '<em>Content Part List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentPartList()
	 * @generated
	 */
	int CONTENT_PART_LIST = 48;

	/**
	 * The meta object id for the '<em>Structural Node List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuralNodeList()
	 * @generated
	 */
	int STRUCTURAL_NODE_LIST = 49;


	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.asciidoctor.ast.Author
	 * @model instanceClass="org.asciidoctor.ast.Author"
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.asciidoctor.ast.Block
	 * @model instanceClass="org.asciidoctor.ast.Block"
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see org.asciidoctor.ast.Cell
	 * @model instanceClass="org.asciidoctor.ast.Cell"
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.asciidoctor.ast.Column
	 * @model instanceClass="org.asciidoctor.ast.Column"
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Node</em>'.
	 * @see org.asciidoctor.ast.ContentNode
	 * @model instanceClass="org.asciidoctor.ast.ContentNode"
	 * @generated
	 */
	EClass getContentNode();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Part</em>'.
	 * @see org.asciidoctor.ast.ContentPart
	 * @model instanceClass="org.asciidoctor.ast.ContentPart"
	 * @generated
	 */
	EClass getContentPart();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cursor</em>'.
	 * @see org.asciidoctor.ast.Cursor
	 * @model instanceClass="org.asciidoctor.ast.Cursor"
	 * @generated
	 */
	EClass getCursor();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.DescriptionList <em>Description List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description List</em>'.
	 * @see org.asciidoctor.ast.DescriptionList
	 * @model instanceClass="org.asciidoctor.ast.DescriptionList"
	 * @generated
	 */
	EClass getDescriptionList();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.DescriptionListEntry <em>Description List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description List Entry</em>'.
	 * @see org.asciidoctor.ast.DescriptionListEntry
	 * @model instanceClass="org.asciidoctor.ast.DescriptionListEntry"
	 * @generated
	 */
	EClass getDescriptionListEntry();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.asciidoctor.ast.Document
	 * @model instanceClass="org.asciidoctor.ast.Document"
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Header</em>'.
	 * @see org.asciidoctor.ast.DocumentHeader
	 * @model instanceClass="org.asciidoctor.ast.DocumentHeader"
	 * @generated
	 */
	EClass getDocumentHeader();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.List <em>Ast List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ast List</em>'.
	 * @see org.asciidoctor.ast.List
	 * @model instanceClass="org.asciidoctor.ast.List"
	 * @generated
	 */
	EClass getAstList();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see org.asciidoctor.ast.ListItem
	 * @model instanceClass="org.asciidoctor.ast.ListItem"
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.PhraseNode <em>Phrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrase Node</em>'.
	 * @see org.asciidoctor.ast.PhraseNode
	 * @model instanceClass="org.asciidoctor.ast.PhraseNode"
	 * @generated
	 */
	EClass getPhraseNode();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision Info</em>'.
	 * @see org.asciidoctor.ast.RevisionInfo
	 * @model instanceClass="org.asciidoctor.ast.RevisionInfo"
	 * @generated
	 */
	EClass getRevisionInfo();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.asciidoctor.ast.Row
	 * @model instanceClass="org.asciidoctor.ast.Row"
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.asciidoctor.ast.Section
	 * @model instanceClass="org.asciidoctor.ast.Section"
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.StructuralNode <em>Structural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Node</em>'.
	 * @see org.asciidoctor.ast.StructuralNode
	 * @model instanceClass="org.asciidoctor.ast.StructuralNode"
	 * @generated
	 */
	EClass getStructuralNode();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Document</em>'.
	 * @see org.asciidoctor.ast.StructuredDocument
	 * @model instanceClass="org.asciidoctor.ast.StructuredDocument"
	 * @generated
	 */
	EClass getStructuredDocument();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.asciidoctor.ast.Table
	 * @model instanceClass="org.asciidoctor.ast.Table"
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link org.asciidoctor.ast.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see org.asciidoctor.ast.Title
	 * @model instanceClass="org.asciidoctor.ast.Title"
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SAuthor <em>SAuthor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAuthor</em>'.
	 * @see fr.jmini.sciid.SAuthor
	 * @generated
	 */
	EClass getSAuthor();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see fr.jmini.sciid.SAuthor#getEmail()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_Email();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see fr.jmini.sciid.SAuthor#getFullName()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_FullName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.jmini.sciid.SAuthor#getFirstName()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see fr.jmini.sciid.SAuthor#getLastName()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_LastName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see fr.jmini.sciid.SAuthor#getMiddleName()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SAuthor#getInitials <em>Initials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initials</em>'.
	 * @see fr.jmini.sciid.SAuthor#getInitials()
	 * @see #getSAuthor()
	 * @generated
	 */
	EAttribute getSAuthor_Initials();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SBlock <em>SBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SBlock</em>'.
	 * @see fr.jmini.sciid.SBlock
	 * @generated
	 */
	EClass getSBlock();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SBlock#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see fr.jmini.sciid.SBlock#getLines()
	 * @see #getSBlock()
	 * @generated
	 */
	EAttribute getSBlock_Lines();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SBlock#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.sciid.SBlock#getSource()
	 * @see #getSBlock()
	 * @generated
	 */
	EAttribute getSBlock_Source();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SCell <em>SCell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCell</em>'.
	 * @see fr.jmini.sciid.SCell
	 * @generated
	 */
	EClass getSCell();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.sciid.SCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see fr.jmini.sciid.SCell#getRow()
	 * @see #getSCell()
	 * @generated
	 */
	EReference getSCell_Row();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.sciid.SCell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see fr.jmini.sciid.SCell#getColumn()
	 * @see #getSCell()
	 * @generated
	 */
	EReference getSCell_Column();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see fr.jmini.sciid.SCell#getColspan()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see fr.jmini.sciid.SCell#getRowspan()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.sciid.SCell#getSource()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_Source();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.sciid.SCell#getStyle()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see fr.jmini.sciid.SCell#getHorizontalAlignment()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCell#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see fr.jmini.sciid.SCell#getVerticalAlignment()
	 * @see #getSCell()
	 * @generated
	 */
	EAttribute getSCell_VerticalAlignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SCell#getInnerDocument <em>Inner Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Document</em>'.
	 * @see fr.jmini.sciid.SCell#getInnerDocument()
	 * @see #getSCell()
	 * @generated
	 */
	EReference getSCell_InnerDocument();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SColumn <em>SColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SColumn</em>'.
	 * @see fr.jmini.sciid.SColumn
	 * @generated
	 */
	EClass getSColumn();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SColumn#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.sciid.SColumn#getStyle()
	 * @see #getSColumn()
	 * @generated
	 */
	EAttribute getSColumn_Style();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.sciid.SColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see fr.jmini.sciid.SColumn#getTable()
	 * @see #getSColumn()
	 * @generated
	 */
	EReference getSColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.jmini.sciid.SColumn#getWidth()
	 * @see #getSColumn()
	 * @generated
	 */
	EAttribute getSColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SColumn#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see fr.jmini.sciid.SColumn#getHorizontalAlignment()
	 * @see #getSColumn()
	 * @generated
	 */
	EAttribute getSColumn_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SColumn#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see fr.jmini.sciid.SColumn#getVerticalAlignment()
	 * @see #getSColumn()
	 * @generated
	 */
	EAttribute getSColumn_VerticalAlignment();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SContentNode <em>SContent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SContent Node</em>'.
	 * @see fr.jmini.sciid.SContentNode
	 * @generated
	 */
	EClass getSContentNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.jmini.sciid.SContentNode#getId()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see fr.jmini.sciid.SContentNode#getNodeName()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_NodeName();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.sciid.SContentNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.jmini.sciid.SContentNode#getParent()
	 * @see #getSContentNode()
	 * @generated
	 */
	EReference getSContentNode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see fr.jmini.sciid.SContentNode#getContext()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Context();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.sciid.SContentNode#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see fr.jmini.sciid.SContentNode#getDocument()
	 * @see #getSContentNode()
	 * @generated
	 */
	EReference getSContentNode_Document();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#isInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline</em>'.
	 * @see fr.jmini.sciid.SContentNode#isInline()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Inline();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#isBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see fr.jmini.sciid.SContentNode#isBlock()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Block();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.sciid.SContentNode#getAttributes()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see fr.jmini.sciid.SContentNode#getRoles()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Roles();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentNode#getReftext <em>Reftext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reftext</em>'.
	 * @see fr.jmini.sciid.SContentNode#getReftext()
	 * @see #getSContentNode()
	 * @generated
	 */
	EAttribute getSContentNode_Reftext();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SContentPart <em>SContent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SContent Part</em>'.
	 * @see fr.jmini.sciid.SContentPart
	 * @generated
	 */
	EClass getSContentPart();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.jmini.sciid.SContentPart#getId()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.jmini.sciid.SContentPart#getLevel()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Level();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see fr.jmini.sciid.SContentPart#getContext()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Context();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.sciid.SContentPart#getStyle()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see fr.jmini.sciid.SContentPart#getRole()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Role();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.jmini.sciid.SContentPart#getTitle()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SContentPart#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.sciid.SContentPart#getAttributes()
	 * @see #getSContentPart()
	 * @generated
	 */
	EAttribute getSContentPart_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SContentPart#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see fr.jmini.sciid.SContentPart#getParts()
	 * @see #getSContentPart()
	 * @generated
	 */
	EReference getSContentPart_Parts();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.sciid.SContentPart#getParentPart <em>Parent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Part</em>'.
	 * @see fr.jmini.sciid.SContentPart#getParentPart()
	 * @see #getSContentPart()
	 * @generated
	 */
	EReference getSContentPart_ParentPart();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SCursor <em>SCursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCursor</em>'.
	 * @see fr.jmini.sciid.SCursor
	 * @generated
	 */
	EClass getSCursor();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCursor#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see fr.jmini.sciid.SCursor#getLineNumber()
	 * @see #getSCursor()
	 * @generated
	 */
	EAttribute getSCursor_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCursor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.jmini.sciid.SCursor#getPath()
	 * @see #getSCursor()
	 * @generated
	 */
	EAttribute getSCursor_Path();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCursor#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see fr.jmini.sciid.SCursor#getDir()
	 * @see #getSCursor()
	 * @generated
	 */
	EAttribute getSCursor_Dir();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SCursor#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see fr.jmini.sciid.SCursor#getFile()
	 * @see #getSCursor()
	 * @generated
	 */
	EAttribute getSCursor_File();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SDescriptionList <em>SDescription List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDescription List</em>'.
	 * @see fr.jmini.sciid.SDescriptionList
	 * @generated
	 */
	EClass getSDescriptionList();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SDescriptionList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.jmini.sciid.SDescriptionList#getItems()
	 * @see #getSDescriptionList()
	 * @generated
	 */
	EReference getSDescriptionList_Items();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SDescriptionListEntry <em>SDescription List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDescription List Entry</em>'.
	 * @see fr.jmini.sciid.SDescriptionListEntry
	 * @generated
	 */
	EClass getSDescriptionListEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SDescriptionListEntry#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see fr.jmini.sciid.SDescriptionListEntry#getTerms()
	 * @see #getSDescriptionListEntry()
	 * @generated
	 */
	EReference getSDescriptionListEntry_Terms();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SDescriptionListEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fr.jmini.sciid.SDescriptionListEntry#getDescription()
	 * @see #getSDescriptionListEntry()
	 * @generated
	 */
	EReference getSDescriptionListEntry_Description();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SDocument <em>SDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDocument</em>'.
	 * @see fr.jmini.sciid.SDocument
	 * @generated
	 */
	EClass getSDocument();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SDocument#getStructuredDoctitle <em>Structured Doctitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Doctitle</em>'.
	 * @see fr.jmini.sciid.SDocument#getStructuredDoctitle()
	 * @see #getSDocument()
	 * @generated
	 */
	EReference getSDocument_StructuredDoctitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SDocument#getDoctitle <em>Doctitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctitle</em>'.
	 * @see fr.jmini.sciid.SDocument#getDoctitle()
	 * @see #getSDocument()
	 * @generated
	 */
	EAttribute getSDocument_Doctitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SDocument#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see fr.jmini.sciid.SDocument#getOptions()
	 * @see #getSDocument()
	 * @generated
	 */
	EAttribute getSDocument_Options();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SDocumentHeader <em>SDocument Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDocument Header</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader
	 * @generated
	 */
	EClass getSDocumentHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SDocumentHeader#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader#getAuthors()
	 * @see #getSDocumentHeader()
	 * @generated
	 */
	EReference getSDocumentHeader_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SDocumentHeader#getDocumentTitle <em>Document Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Title</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader#getDocumentTitle()
	 * @see #getSDocumentHeader()
	 * @generated
	 */
	EReference getSDocumentHeader_DocumentTitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SDocumentHeader#getPageTitle <em>Page Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Title</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader#getPageTitle()
	 * @see #getSDocumentHeader()
	 * @generated
	 */
	EAttribute getSDocumentHeader_PageTitle();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SDocumentHeader#getRevisionInfo <em>Revision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Info</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader#getRevisionInfo()
	 * @see #getSDocumentHeader()
	 * @generated
	 */
	EReference getSDocumentHeader_RevisionInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SDocumentHeader#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.sciid.SDocumentHeader#getAttributes()
	 * @see #getSDocumentHeader()
	 * @generated
	 */
	EAttribute getSDocumentHeader_Attributes();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SList <em>SList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SList</em>'.
	 * @see fr.jmini.sciid.SList
	 * @generated
	 */
	EClass getSList();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.jmini.sciid.SList#getItems()
	 * @see #getSList()
	 * @generated
	 */
	EReference getSList_Items();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SListItem <em>SList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SList Item</em>'.
	 * @see fr.jmini.sciid.SListItem
	 * @generated
	 */
	EClass getSListItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SListItem#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker</em>'.
	 * @see fr.jmini.sciid.SListItem#getMarker()
	 * @see #getSListItem()
	 * @generated
	 */
	EAttribute getSListItem_Marker();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SListItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.jmini.sciid.SListItem#getText()
	 * @see #getSListItem()
	 * @generated
	 */
	EAttribute getSListItem_Text();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SListItem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.sciid.SListItem#getSource()
	 * @see #getSListItem()
	 * @generated
	 */
	EAttribute getSListItem_Source();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SPhraseNode <em>SPhrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPhrase Node</em>'.
	 * @see fr.jmini.sciid.SPhraseNode
	 * @generated
	 */
	EClass getSPhraseNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SPhraseNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see fr.jmini.sciid.SPhraseNode#getTarget()
	 * @see #getSPhraseNode()
	 * @generated
	 */
	EAttribute getSPhraseNode_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SPhraseNode#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.jmini.sciid.SPhraseNode#getText()
	 * @see #getSPhraseNode()
	 * @generated
	 */
	EAttribute getSPhraseNode_Text();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SPhraseNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.jmini.sciid.SPhraseNode#getType()
	 * @see #getSPhraseNode()
	 * @generated
	 */
	EAttribute getSPhraseNode_Type();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SRevisionInfo <em>SRevision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRevision Info</em>'.
	 * @see fr.jmini.sciid.SRevisionInfo
	 * @generated
	 */
	EClass getSRevisionInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SRevisionInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.jmini.sciid.SRevisionInfo#getDate()
	 * @see #getSRevisionInfo()
	 * @generated
	 */
	EAttribute getSRevisionInfo_Date();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SRevisionInfo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.jmini.sciid.SRevisionInfo#getNumber()
	 * @see #getSRevisionInfo()
	 * @generated
	 */
	EAttribute getSRevisionInfo_Number();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SRevisionInfo#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see fr.jmini.sciid.SRevisionInfo#getRemark()
	 * @see #getSRevisionInfo()
	 * @generated
	 */
	EAttribute getSRevisionInfo_Remark();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SRow <em>SRow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRow</em>'.
	 * @see fr.jmini.sciid.SRow
	 * @generated
	 */
	EClass getSRow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see fr.jmini.sciid.SRow#getCells()
	 * @see #getSRow()
	 * @generated
	 */
	EReference getSRow_Cells();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SSection <em>SSection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSection</em>'.
	 * @see fr.jmini.sciid.SSection
	 * @generated
	 */
	EClass getSSection();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SSection#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see fr.jmini.sciid.SSection#getIndex()
	 * @see #getSSection()
	 * @generated
	 */
	EAttribute getSSection_Index();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SSection#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.jmini.sciid.SSection#getNumber()
	 * @see #getSSection()
	 * @generated
	 */
	EAttribute getSSection_Number();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SSection#getSectionName <em>Section Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Name</em>'.
	 * @see fr.jmini.sciid.SSection#getSectionName()
	 * @see #getSSection()
	 * @generated
	 */
	EAttribute getSSection_SectionName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SSection#isSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special</em>'.
	 * @see fr.jmini.sciid.SSection#isSpecial()
	 * @see #getSSection()
	 * @generated
	 */
	EAttribute getSSection_Special();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SSection#isNumbered <em>Numbered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbered</em>'.
	 * @see fr.jmini.sciid.SSection#isNumbered()
	 * @see #getSSection()
	 * @generated
	 */
	EAttribute getSSection_Numbered();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SStructuralNode <em>SStructural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SStructural Node</em>'.
	 * @see fr.jmini.sciid.SStructuralNode
	 * @generated
	 */
	EClass getSStructuralNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SStructuralNode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getTitle()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SStructuralNode#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getCaption()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_Caption();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SStructuralNode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getStyle()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SStructuralNode#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getBlocks()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EReference getSStructuralNode_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SStructuralNode#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getLevel()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_Level();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.SStructuralNode#getContentModel <em>Content Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Model</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getContentModel()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_ContentModel();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.sciid.SStructuralNode#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Location</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getSourceLocation()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EReference getSStructuralNode_SourceLocation();

	/**
	 * Returns the meta object for the attribute list '{@link fr.jmini.sciid.SStructuralNode#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substitutions</em>'.
	 * @see fr.jmini.sciid.SStructuralNode#getSubstitutions()
	 * @see #getSStructuralNode()
	 * @generated
	 */
	EAttribute getSStructuralNode_Substitutions();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.SStructuredDocument <em>SStructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SStructured Document</em>'.
	 * @see fr.jmini.sciid.SStructuredDocument
	 * @generated
	 */
	EClass getSStructuredDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.SStructuredDocument#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see fr.jmini.sciid.SStructuredDocument#getParts()
	 * @see #getSStructuredDocument()
	 * @generated
	 */
	EReference getSStructuredDocument_Parts();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.sciid.SStructuredDocument#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header</em>'.
	 * @see fr.jmini.sciid.SStructuredDocument#getHeader()
	 * @see #getSStructuredDocument()
	 * @generated
	 */
	EReference getSStructuredDocument_Header();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.STable <em>STable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STable</em>'.
	 * @see fr.jmini.sciid.STable
	 * @generated
	 */
	EClass getSTable();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STable#isHeaderOption <em>Header Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Option</em>'.
	 * @see fr.jmini.sciid.STable#isHeaderOption()
	 * @see #getSTable()
	 * @generated
	 */
	EAttribute getSTable_HeaderOption();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.STable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see fr.jmini.sciid.STable#getColumns()
	 * @see #getSTable()
	 * @generated
	 */
	EReference getSTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.STable#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see fr.jmini.sciid.STable#getHeader()
	 * @see #getSTable()
	 * @generated
	 */
	EReference getSTable_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.STable#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footer</em>'.
	 * @see fr.jmini.sciid.STable#getFooter()
	 * @see #getSTable()
	 * @generated
	 */
	EReference getSTable_Footer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.sciid.STable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see fr.jmini.sciid.STable#getBody()
	 * @see #getSTable()
	 * @generated
	 */
	EReference getSTable_Body();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STable#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see fr.jmini.sciid.STable#getFrame()
	 * @see #getSTable()
	 * @generated
	 */
	EAttribute getSTable_Frame();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STable#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see fr.jmini.sciid.STable#getGrid()
	 * @see #getSTable()
	 * @generated
	 */
	EAttribute getSTable_Grid();

	/**
	 * Returns the meta object for class '{@link fr.jmini.sciid.STitle <em>STitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STitle</em>'.
	 * @see fr.jmini.sciid.STitle
	 * @generated
	 */
	EClass getSTitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STitle#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see fr.jmini.sciid.STitle#getMain()
	 * @see #getSTitle()
	 * @generated
	 */
	EAttribute getSTitle_Main();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STitle#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see fr.jmini.sciid.STitle#getSubtitle()
	 * @see #getSTitle()
	 * @generated
	 */
	EAttribute getSTitle_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STitle#getCombined <em>Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combined</em>'.
	 * @see fr.jmini.sciid.STitle#getCombined()
	 * @see #getSTitle()
	 * @generated
	 */
	EAttribute getSTitle_Combined();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.sciid.STitle#isSanitized <em>Sanitized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sanitized</em>'.
	 * @see fr.jmini.sciid.STitle#isSanitized()
	 * @see #getSTitle()
	 * @generated
	 */
	EAttribute getSTitle_Sanitized();

	/**
	 * Returns the meta object for data type '{@link org.asciidoctor.ast.Table.HorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Horizontal Alignment</em>'.
	 * @see org.asciidoctor.ast.Table.HorizontalAlignment
	 * @model instanceClass="org.asciidoctor.ast.Table$HorizontalAlignment"
	 * @generated
	 */
	EDataType getHorizontalAlignment();

	/**
	 * Returns the meta object for data type '{@link org.asciidoctor.ast.Table.VerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertical Alignment</em>'.
	 * @see org.asciidoctor.ast.Table.VerticalAlignment
	 * @model instanceClass="org.asciidoctor.ast.Table$VerticalAlignment"
	 * @generated
	 */
	EDataType getVerticalAlignment();

	/**
	 * Returns the meta object for data type '{@link fr.jmini.sciid.SciidUtility <em>Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Utility</em>'.
	 * @see fr.jmini.sciid.SciidUtility
	 * @model instanceClass="fr.jmini.sciid.SciidUtility"
	 * @generated
	 */
	EDataType getSciidUtility();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>String Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Object Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map<java.lang.String, java.lang.Object>"
	 * @generated
	 */
	EDataType getStringObjectMap();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Object Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Object Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map<java.lang.Object, java.lang.Object>"
	 * @generated
	 */
	EDataType getObjectObjectMap();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<java.lang.String>"
	 * @generated
	 */
	EDataType getStringList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Content Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Part List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<org.asciidoctor.ast.ContentPart>"
	 * @generated
	 */
	EDataType getContentPartList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Structural Node List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Structural Node List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<fr.jmini.sciid.SStructuralNode>"
	 * @generated
	 */
	EDataType getStructuralNodeList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SciidFactory getSciidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Author <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Author
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Block <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Block
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Cell <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Cell
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Column <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Column
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ContentNode
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentNode()
		 * @generated
		 */
		EClass CONTENT_NODE = eINSTANCE.getContentNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ContentPart
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentPart()
		 * @generated
		 */
		EClass CONTENT_PART = eINSTANCE.getContentPart();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Cursor
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getCursor()
		 * @generated
		 */
		EClass CURSOR = eINSTANCE.getCursor();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DescriptionList <em>Description List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DescriptionList
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDescriptionList()
		 * @generated
		 */
		EClass DESCRIPTION_LIST = eINSTANCE.getDescriptionList();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DescriptionListEntry <em>Description List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DescriptionListEntry
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDescriptionListEntry()
		 * @generated
		 */
		EClass DESCRIPTION_LIST_ENTRY = eINSTANCE.getDescriptionListEntry();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Document
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DocumentHeader
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getDocumentHeader()
		 * @generated
		 */
		EClass DOCUMENT_HEADER = eINSTANCE.getDocumentHeader();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.List <em>Ast List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.List
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getAstList()
		 * @generated
		 */
		EClass AST_LIST = eINSTANCE.getAstList();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ListItem <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ListItem
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.PhraseNode <em>Phrase Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.PhraseNode
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getPhraseNode()
		 * @generated
		 */
		EClass PHRASE_NODE = eINSTANCE.getPhraseNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.RevisionInfo
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getRevisionInfo()
		 * @generated
		 */
		EClass REVISION_INFO = eINSTANCE.getRevisionInfo();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Row <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Row
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Section <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Section
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.StructuralNode <em>Structural Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.StructuralNode
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuralNode()
		 * @generated
		 */
		EClass STRUCTURAL_NODE = eINSTANCE.getStructuralNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.StructuredDocument
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuredDocument()
		 * @generated
		 */
		EClass STRUCTURED_DOCUMENT = eINSTANCE.getStructuredDocument();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Table <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Title <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Title
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SAuthorImpl <em>SAuthor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SAuthorImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSAuthor()
		 * @generated
		 */
		EClass SAUTHOR = eINSTANCE.getSAuthor();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__EMAIL = eINSTANCE.getSAuthor_Email();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__FULL_NAME = eINSTANCE.getSAuthor_FullName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__FIRST_NAME = eINSTANCE.getSAuthor_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__LAST_NAME = eINSTANCE.getSAuthor_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__MIDDLE_NAME = eINSTANCE.getSAuthor_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Initials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUTHOR__INITIALS = eINSTANCE.getSAuthor_Initials();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SBlockImpl <em>SBlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SBlockImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSBlock()
		 * @generated
		 */
		EClass SBLOCK = eINSTANCE.getSBlock();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SBLOCK__LINES = eINSTANCE.getSBlock_Lines();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SBLOCK__SOURCE = eINSTANCE.getSBlock_Source();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SCellImpl <em>SCell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SCellImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSCell()
		 * @generated
		 */
		EClass SCELL = eINSTANCE.getSCell();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCELL__ROW = eINSTANCE.getSCell_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCELL__COLUMN = eINSTANCE.getSCell_Column();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__COLSPAN = eINSTANCE.getSCell_Colspan();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__ROWSPAN = eINSTANCE.getSCell_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__SOURCE = eINSTANCE.getSCell_Source();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__STYLE = eINSTANCE.getSCell_Style();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__HORIZONTAL_ALIGNMENT = eINSTANCE.getSCell_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCELL__VERTICAL_ALIGNMENT = eINSTANCE.getSCell_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Inner Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCELL__INNER_DOCUMENT = eINSTANCE.getSCell_InnerDocument();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SColumnImpl <em>SColumn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SColumnImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSColumn()
		 * @generated
		 */
		EClass SCOLUMN = eINSTANCE.getSColumn();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOLUMN__STYLE = eINSTANCE.getSColumn_Style();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOLUMN__TABLE = eINSTANCE.getSColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOLUMN__WIDTH = eINSTANCE.getSColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOLUMN__HORIZONTAL_ALIGNMENT = eINSTANCE.getSColumn_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOLUMN__VERTICAL_ALIGNMENT = eINSTANCE.getSColumn_VerticalAlignment();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SContentNodeImpl <em>SContent Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SContentNodeImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSContentNode()
		 * @generated
		 */
		EClass SCONTENT_NODE = eINSTANCE.getSContentNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__ID = eINSTANCE.getSContentNode_Id();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__NODE_NAME = eINSTANCE.getSContentNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTENT_NODE__PARENT = eINSTANCE.getSContentNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__CONTEXT = eINSTANCE.getSContentNode_Context();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTENT_NODE__DOCUMENT = eINSTANCE.getSContentNode_Document();

		/**
		 * The meta object literal for the '<em><b>Inline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__INLINE = eINSTANCE.getSContentNode_Inline();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__BLOCK = eINSTANCE.getSContentNode_Block();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__ATTRIBUTES = eINSTANCE.getSContentNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__ROLES = eINSTANCE.getSContentNode_Roles();

		/**
		 * The meta object literal for the '<em><b>Reftext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_NODE__REFTEXT = eINSTANCE.getSContentNode_Reftext();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SContentPartImpl <em>SContent Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SContentPartImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSContentPart()
		 * @generated
		 */
		EClass SCONTENT_PART = eINSTANCE.getSContentPart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__ID = eINSTANCE.getSContentPart_Id();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__LEVEL = eINSTANCE.getSContentPart_Level();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__CONTEXT = eINSTANCE.getSContentPart_Context();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__STYLE = eINSTANCE.getSContentPart_Style();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__ROLE = eINSTANCE.getSContentPart_Role();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__TITLE = eINSTANCE.getSContentPart_Title();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCONTENT_PART__ATTRIBUTES = eINSTANCE.getSContentPart_Attributes();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTENT_PART__PARTS = eINSTANCE.getSContentPart_Parts();

		/**
		 * The meta object literal for the '<em><b>Parent Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTENT_PART__PARENT_PART = eINSTANCE.getSContentPart_ParentPart();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SCursorImpl <em>SCursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SCursorImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSCursor()
		 * @generated
		 */
		EClass SCURSOR = eINSTANCE.getSCursor();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCURSOR__LINE_NUMBER = eINSTANCE.getSCursor_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCURSOR__PATH = eINSTANCE.getSCursor_Path();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCURSOR__DIR = eINSTANCE.getSCursor_Dir();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCURSOR__FILE = eINSTANCE.getSCursor_File();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SDescriptionListImpl <em>SDescription List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SDescriptionListImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDescriptionList()
		 * @generated
		 */
		EClass SDESCRIPTION_LIST = eINSTANCE.getSDescriptionList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDESCRIPTION_LIST__ITEMS = eINSTANCE.getSDescriptionList_Items();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SDescriptionListEntryImpl <em>SDescription List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SDescriptionListEntryImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDescriptionListEntry()
		 * @generated
		 */
		EClass SDESCRIPTION_LIST_ENTRY = eINSTANCE.getSDescriptionListEntry();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDESCRIPTION_LIST_ENTRY__TERMS = eINSTANCE.getSDescriptionListEntry_Terms();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDESCRIPTION_LIST_ENTRY__DESCRIPTION = eINSTANCE.getSDescriptionListEntry_Description();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SDocumentImpl <em>SDocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SDocumentImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDocument()
		 * @generated
		 */
		EClass SDOCUMENT = eINSTANCE.getSDocument();

		/**
		 * The meta object literal for the '<em><b>Structured Doctitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDOCUMENT__STRUCTURED_DOCTITLE = eINSTANCE.getSDocument_StructuredDoctitle();

		/**
		 * The meta object literal for the '<em><b>Doctitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDOCUMENT__DOCTITLE = eINSTANCE.getSDocument_Doctitle();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDOCUMENT__OPTIONS = eINSTANCE.getSDocument_Options();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SDocumentHeaderImpl <em>SDocument Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SDocumentHeaderImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSDocumentHeader()
		 * @generated
		 */
		EClass SDOCUMENT_HEADER = eINSTANCE.getSDocumentHeader();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDOCUMENT_HEADER__AUTHORS = eINSTANCE.getSDocumentHeader_Authors();

		/**
		 * The meta object literal for the '<em><b>Document Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDOCUMENT_HEADER__DOCUMENT_TITLE = eINSTANCE.getSDocumentHeader_DocumentTitle();

		/**
		 * The meta object literal for the '<em><b>Page Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDOCUMENT_HEADER__PAGE_TITLE = eINSTANCE.getSDocumentHeader_PageTitle();

		/**
		 * The meta object literal for the '<em><b>Revision Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDOCUMENT_HEADER__REVISION_INFO = eINSTANCE.getSDocumentHeader_RevisionInfo();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDOCUMENT_HEADER__ATTRIBUTES = eINSTANCE.getSDocumentHeader_Attributes();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SListImpl <em>SList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SListImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSList()
		 * @generated
		 */
		EClass SLIST = eINSTANCE.getSList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIST__ITEMS = eINSTANCE.getSList_Items();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SListItemImpl <em>SList Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SListItemImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSListItem()
		 * @generated
		 */
		EClass SLIST_ITEM = eINSTANCE.getSListItem();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIST_ITEM__MARKER = eINSTANCE.getSListItem_Marker();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIST_ITEM__TEXT = eINSTANCE.getSListItem_Text();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIST_ITEM__SOURCE = eINSTANCE.getSListItem_Source();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SPhraseNodeImpl <em>SPhrase Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SPhraseNodeImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSPhraseNode()
		 * @generated
		 */
		EClass SPHRASE_NODE = eINSTANCE.getSPhraseNode();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHRASE_NODE__TARGET = eINSTANCE.getSPhraseNode_Target();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHRASE_NODE__TEXT = eINSTANCE.getSPhraseNode_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHRASE_NODE__TYPE = eINSTANCE.getSPhraseNode_Type();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SRevisionInfoImpl <em>SRevision Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SRevisionInfoImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSRevisionInfo()
		 * @generated
		 */
		EClass SREVISION_INFO = eINSTANCE.getSRevisionInfo();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SREVISION_INFO__DATE = eINSTANCE.getSRevisionInfo_Date();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SREVISION_INFO__NUMBER = eINSTANCE.getSRevisionInfo_Number();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SREVISION_INFO__REMARK = eINSTANCE.getSRevisionInfo_Remark();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SRowImpl <em>SRow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SRowImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSRow()
		 * @generated
		 */
		EClass SROW = eINSTANCE.getSRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SROW__CELLS = eINSTANCE.getSRow_Cells();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SSectionImpl <em>SSection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SSectionImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSSection()
		 * @generated
		 */
		EClass SSECTION = eINSTANCE.getSSection();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSECTION__INDEX = eINSTANCE.getSSection_Index();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSECTION__NUMBER = eINSTANCE.getSSection_Number();

		/**
		 * The meta object literal for the '<em><b>Section Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSECTION__SECTION_NAME = eINSTANCE.getSSection_SectionName();

		/**
		 * The meta object literal for the '<em><b>Special</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSECTION__SPECIAL = eINSTANCE.getSSection_Special();

		/**
		 * The meta object literal for the '<em><b>Numbered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSECTION__NUMBERED = eINSTANCE.getSSection_Numbered();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SStructuralNodeImpl <em>SStructural Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SStructuralNodeImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSStructuralNode()
		 * @generated
		 */
		EClass SSTRUCTURAL_NODE = eINSTANCE.getSStructuralNode();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__TITLE = eINSTANCE.getSStructuralNode_Title();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__CAPTION = eINSTANCE.getSStructuralNode_Caption();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__STYLE = eINSTANCE.getSStructuralNode_Style();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTRUCTURAL_NODE__BLOCKS = eINSTANCE.getSStructuralNode_Blocks();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__LEVEL = eINSTANCE.getSStructuralNode_Level();

		/**
		 * The meta object literal for the '<em><b>Content Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__CONTENT_MODEL = eINSTANCE.getSStructuralNode_ContentModel();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTRUCTURAL_NODE__SOURCE_LOCATION = eINSTANCE.getSStructuralNode_SourceLocation();

		/**
		 * The meta object literal for the '<em><b>Substitutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURAL_NODE__SUBSTITUTIONS = eINSTANCE.getSStructuralNode_Substitutions();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.SStructuredDocumentImpl <em>SStructured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.SStructuredDocumentImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSStructuredDocument()
		 * @generated
		 */
		EClass SSTRUCTURED_DOCUMENT = eINSTANCE.getSStructuredDocument();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTRUCTURED_DOCUMENT__PARTS = eINSTANCE.getSStructuredDocument_Parts();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTRUCTURED_DOCUMENT__HEADER = eINSTANCE.getSStructuredDocument_Header();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.STableImpl <em>STable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.STableImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSTable()
		 * @generated
		 */
		EClass STABLE = eINSTANCE.getSTable();

		/**
		 * The meta object literal for the '<em><b>Header Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STABLE__HEADER_OPTION = eINSTANCE.getSTable_HeaderOption();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STABLE__COLUMNS = eINSTANCE.getSTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STABLE__HEADER = eINSTANCE.getSTable_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STABLE__FOOTER = eINSTANCE.getSTable_Footer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STABLE__BODY = eINSTANCE.getSTable_Body();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STABLE__FRAME = eINSTANCE.getSTable_Frame();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STABLE__GRID = eINSTANCE.getSTable_Grid();

		/**
		 * The meta object literal for the '{@link fr.jmini.sciid.impl.STitleImpl <em>STitle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.impl.STitleImpl
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSTitle()
		 * @generated
		 */
		EClass STITLE = eINSTANCE.getSTitle();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STITLE__MAIN = eINSTANCE.getSTitle_Main();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STITLE__SUBTITLE = eINSTANCE.getSTitle_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Combined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STITLE__COMBINED = eINSTANCE.getSTitle_Combined();

		/**
		 * The meta object literal for the '<em><b>Sanitized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STITLE__SANITIZED = eINSTANCE.getSTitle_Sanitized();

		/**
		 * The meta object literal for the '<em>Horizontal Alignment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table.HorizontalAlignment
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getHorizontalAlignment()
		 * @generated
		 */
		EDataType HORIZONTAL_ALIGNMENT = eINSTANCE.getHorizontalAlignment();

		/**
		 * The meta object literal for the '<em>Vertical Alignment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table.VerticalAlignment
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getVerticalAlignment()
		 * @generated
		 */
		EDataType VERTICAL_ALIGNMENT = eINSTANCE.getVerticalAlignment();

		/**
		 * The meta object literal for the '<em>Utility</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.sciid.SciidUtility
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getSciidUtility()
		 * @generated
		 */
		EDataType SCIID_UTILITY = eINSTANCE.getSciidUtility();

		/**
		 * The meta object literal for the '<em>String Object Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStringObjectMap()
		 * @generated
		 */
		EDataType STRING_OBJECT_MAP = eINSTANCE.getStringObjectMap();

		/**
		 * The meta object literal for the '<em>Object Object Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getObjectObjectMap()
		 * @generated
		 */
		EDataType OBJECT_OBJECT_MAP = eINSTANCE.getObjectObjectMap();

		/**
		 * The meta object literal for the '<em>String List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStringList()
		 * @generated
		 */
		EDataType STRING_LIST = eINSTANCE.getStringList();

		/**
		 * The meta object literal for the '<em>Content Part List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getContentPartList()
		 * @generated
		 */
		EDataType CONTENT_PART_LIST = eINSTANCE.getContentPartList();

		/**
		 * The meta object literal for the '<em>Structural Node List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.sciid.impl.SciidPackageImpl#getStructuralNodeList()
		 * @generated
		 */
		EDataType STRUCTURAL_NODE_LIST = eINSTANCE.getStructuralNodeList();

	}

} //SciidPackage
