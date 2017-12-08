/**
 */
package fr.jmini.eadoc;

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
 * @see fr.jmini.eadoc.EadocFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' operationReflection='false' modelDirectory='adoc-api-impl/src/main/java-gen' complianceLevel='8.0' basePackage='fr.jmini'"
 * @generated
 */
public interface EadocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eadoc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.jmini.eadoc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eadoc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EadocPackage eINSTANCE = fr.jmini.eadoc.impl.EadocPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Author <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Author
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getAuthor()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getBlock()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getCell()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getColumn()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentNode()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPart()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getCursor()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDescriptionList()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDescriptionListEntry()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocument()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocumentHeader()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getAstList()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getListItem()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getPhraseNode()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRevisionInfo()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRow()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getSection()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuralNode()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuredDocument()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getTable()
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
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getTitle()
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
	 * The meta object id for the '{@link fr.jmini.eadoc.EadocUtility <em>Utility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.EadocUtility
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEadocUtility()
	 * @generated
	 */
	int EADOC_UTILITY = 21;

	/**
	 * The number of structural features of the '<em>Utility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_UTILITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EAuthorImpl <em>EAuthor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EAuthorImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEAuthor()
	 * @generated
	 */
	int EAUTHOR = 22;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__EMAIL = AUTHOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__FULL_NAME = AUTHOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__FIRST_NAME = AUTHOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__LAST_NAME = AUTHOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__MIDDLE_NAME = AUTHOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR__INITIALS = AUTHOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EAuthor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR_FEATURE_COUNT = AUTHOR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EContentNodeImpl <em>EContent Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EContentNodeImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentNode()
	 * @generated
	 */
	int ECONTENT_NODE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ID = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__NODE_NAME = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__PARENT = CONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__CONTEXT = CONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__DOCUMENT = CONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__INLINE = CONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__BLOCK = CONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ATTRIBUTES = CONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ROLES = CONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__REFTEXT = CONTENT_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>EContent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EStructuralNodeImpl <em>EStructural Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EStructuralNodeImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEStructuralNode()
	 * @generated
	 */
	int ESTRUCTURAL_NODE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__ID = ECONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__NODE_NAME = ECONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__PARENT = ECONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__CONTEXT = ECONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__DOCUMENT = ECONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__INLINE = ECONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__BLOCK = ECONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__ATTRIBUTES = ECONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__ROLES = ECONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__REFTEXT = ECONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__TITLE = ECONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__STYLE = ECONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__BLOCKS = ECONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__LEVEL = ECONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__SOURCE_LOCATION = ECONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE__SUBSTITUTIONS = ECONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EStructural Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_NODE_FEATURE_COUNT = ECONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EBlockImpl <em>EBlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EBlockImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEBlock()
	 * @generated
	 */
	int EBLOCK = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__LINES = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK__SOURCE = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EBlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBLOCK_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ECellImpl <em>ECell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ECellImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getECell()
	 * @generated
	 */
	int ECELL = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__ID = ECONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__NODE_NAME = ECONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__PARENT = ECONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__CONTEXT = ECONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__DOCUMENT = ECONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__INLINE = ECONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__BLOCK = ECONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__ATTRIBUTES = ECONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__ROLES = ECONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__REFTEXT = ECONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__ROW = ECONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__COLUMN = ECONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__COLSPAN = ECONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__ROWSPAN = ECONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__SOURCE = ECONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__STYLE = ECONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__HORIZONTAL_ALIGNMENT = ECONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__VERTICAL_ALIGNMENT = ECONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inner Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL__INNER_DOCUMENT = ECONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>ECell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECELL_FEATURE_COUNT = ECONTENT_NODE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EColumnImpl <em>EColumn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EColumnImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEColumn()
	 * @generated
	 */
	int ECOLUMN = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__ID = ECONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__NODE_NAME = ECONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__PARENT = ECONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__CONTEXT = ECONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__DOCUMENT = ECONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__INLINE = ECONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__BLOCK = ECONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__ATTRIBUTES = ECONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__ROLES = ECONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__REFTEXT = ECONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__STYLE = ECONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__TABLE = ECONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__WIDTH = ECONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__HORIZONTAL_ALIGNMENT = ECONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN__VERTICAL_ALIGNMENT = ECONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOLUMN_FEATURE_COUNT = ECONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EContentPartImpl <em>EContent Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EContentPartImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentPart()
	 * @generated
	 */
	int ECONTENT_PART = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__ID = CONTENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__LEVEL = CONTENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__CONTEXT = CONTENT_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__STYLE = CONTENT_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__ROLE = CONTENT_PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__TITLE = CONTENT_PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__ATTRIBUTES = CONTENT_PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__PARTS = CONTENT_PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART__PARENT_PART = CONTENT_PART_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EContent Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART_FEATURE_COUNT = CONTENT_PART_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ECursorImpl <em>ECursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ECursorImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getECursor()
	 * @generated
	 */
	int ECURSOR = 28;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR__LINE_NUMBER = CURSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR__PATH = CURSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR__DIR = CURSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR__FILE = CURSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ECursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR_FEATURE_COUNT = CURSOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EDescriptionListImpl <em>EDescription List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EDescriptionListImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDescriptionList()
	 * @generated
	 */
	int EDESCRIPTION_LIST = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST__ITEMS = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDescription List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EDescriptionListEntryImpl <em>EDescription List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EDescriptionListEntryImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDescriptionListEntry()
	 * @generated
	 */
	int EDESCRIPTION_LIST_ENTRY = 30;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST_ENTRY__TERMS = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST_ENTRY__DESCRIPTION = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EDescription List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDESCRIPTION_LIST_ENTRY_FEATURE_COUNT = DESCRIPTION_LIST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EDocumentImpl <em>EDocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EDocumentImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDocument()
	 * @generated
	 */
	int EDOCUMENT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Structured Doctitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__STRUCTURED_DOCTITLE = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doctitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__DOCTITLE = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT__OPTIONS = ESTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EDocumentHeaderImpl <em>EDocument Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EDocumentHeaderImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDocumentHeader()
	 * @generated
	 */
	int EDOCUMENT_HEADER = 32;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER__AUTHORS = DOCUMENT_HEADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER__DOCUMENT_TITLE = DOCUMENT_HEADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER__PAGE_TITLE = DOCUMENT_HEADER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER__REVISION_INFO = DOCUMENT_HEADER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER__ATTRIBUTES = DOCUMENT_HEADER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EDocument Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOCUMENT_HEADER_FEATURE_COUNT = DOCUMENT_HEADER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EAdocListImpl <em>EAdoc List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EAdocListImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEAdocList()
	 * @generated
	 */
	int EADOC_LIST = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST__ITEMS = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAdoc List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADOC_LIST_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EListItemImpl <em>EList Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EListItemImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEListItem()
	 * @generated
	 */
	int ELIST_ITEM = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__MARKER = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__TEXT = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM__SOURCE = ESTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EList Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_ITEM_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EPhraseNodeImpl <em>EPhrase Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EPhraseNodeImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEPhraseNode()
	 * @generated
	 */
	int EPHRASE_NODE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__ID = ECONTENT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__NODE_NAME = ECONTENT_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__PARENT = ECONTENT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__CONTEXT = ECONTENT_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__DOCUMENT = ECONTENT_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__INLINE = ECONTENT_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__BLOCK = ECONTENT_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__ATTRIBUTES = ECONTENT_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__ROLES = ECONTENT_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__REFTEXT = ECONTENT_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__TARGET = ECONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__TEXT = ECONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE__TYPE = ECONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EPhrase Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPHRASE_NODE_FEATURE_COUNT = ECONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ERevisionInfoImpl <em>ERevision Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ERevisionInfoImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getERevisionInfo()
	 * @generated
	 */
	int EREVISION_INFO = 36;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREVISION_INFO__DATE = REVISION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREVISION_INFO__NUMBER = REVISION_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREVISION_INFO__REMARK = REVISION_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ERevision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREVISION_INFO_FEATURE_COUNT = REVISION_INFO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ERowImpl <em>ERow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ERowImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getERow()
	 * @generated
	 */
	int EROW = 37;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EROW__CELLS = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ERow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ESectionImpl <em>ESection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ESectionImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getESection()
	 * @generated
	 */
	int ESECTION = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__INDEX = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__NUMBER = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__SECTION_NAME = ESTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__SPECIAL = ESTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION__NUMBERED = ESTRUCTURAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ESection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESECTION_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EStructuredDocumentImpl <em>EStructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EStructuredDocumentImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEStructuredDocument()
	 * @generated
	 */
	int ESTRUCTURED_DOCUMENT = 40;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT__PARTS = STRUCTURED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT__HEADER = STRUCTURED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EStructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT_FEATURE_COUNT = STRUCTURED_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ETableImpl <em>ETable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ETableImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getETable()
	 * @generated
	 */
	int ETABLE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__ID = ESTRUCTURAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__NODE_NAME = ESTRUCTURAL_NODE__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__PARENT = ESTRUCTURAL_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__CONTEXT = ESTRUCTURAL_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__DOCUMENT = ESTRUCTURAL_NODE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__INLINE = ESTRUCTURAL_NODE__INLINE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__BLOCK = ESTRUCTURAL_NODE__BLOCK;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__ATTRIBUTES = ESTRUCTURAL_NODE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__ROLES = ESTRUCTURAL_NODE__ROLES;

	/**
	 * The feature id for the '<em><b>Reftext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__REFTEXT = ESTRUCTURAL_NODE__REFTEXT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__TITLE = ESTRUCTURAL_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__STYLE = ESTRUCTURAL_NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__BLOCKS = ESTRUCTURAL_NODE__BLOCKS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__LEVEL = ESTRUCTURAL_NODE__LEVEL;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__SOURCE_LOCATION = ESTRUCTURAL_NODE__SOURCE_LOCATION;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__SUBSTITUTIONS = ESTRUCTURAL_NODE__SUBSTITUTIONS;

	/**
	 * The feature id for the '<em><b>Header Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__HEADER_OPTION = ESTRUCTURAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__COLUMNS = ESTRUCTURAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__HEADER = ESTRUCTURAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__FOOTER = ESTRUCTURAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__BODY = ESTRUCTURAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__FRAME = ESTRUCTURAL_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE__GRID = ESTRUCTURAL_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>ETable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_FEATURE_COUNT = ESTRUCTURAL_NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ETitleImpl <em>ETitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ETitleImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getETitle()
	 * @generated
	 */
	int ETITLE = 42;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE__MAIN = TITLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE__SUBTITLE = TITLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE__COMBINED = TITLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sanitized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE__SANITIZED = TITLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ETitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE_FEATURE_COUNT = TITLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>Horizontal Alignment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Table.HorizontalAlignment
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getHorizontalAlignment()
	 * @generated
	 */
	int HORIZONTAL_ALIGNMENT = 43;

	/**
	 * The meta object id for the '<em>Vertical Alignment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Table.VerticalAlignment
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getVerticalAlignment()
	 * @generated
	 */
	int VERTICAL_ALIGNMENT = 44;

	/**
	 * The meta object id for the '<em>String Object Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringObjectMap()
	 * @generated
	 */
	int STRING_OBJECT_MAP = 45;

	/**
	 * The meta object id for the '<em>Object Object Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getObjectObjectMap()
	 * @generated
	 */
	int OBJECT_OBJECT_MAP = 46;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 47;

	/**
	 * The meta object id for the '<em>Content Part List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPartList()
	 * @generated
	 */
	int CONTENT_PART_LIST = 48;

	/**
	 * The meta object id for the '<em>Structural Node List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuralNodeList()
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
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EadocUtility <em>Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility</em>'.
	 * @see fr.jmini.eadoc.EadocUtility
	 * @model instanceClass="fr.jmini.eadoc.EadocUtility"
	 * @generated
	 */
	EClass getEadocUtility();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EAuthor <em>EAuthor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAuthor</em>'.
	 * @see fr.jmini.eadoc.EAuthor
	 * @generated
	 */
	EClass getEAuthor();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getEmail()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_Email();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getFullName()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_FullName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getFirstName()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getLastName()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_LastName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getMiddleName()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EAuthor#getInitials <em>Initials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initials</em>'.
	 * @see fr.jmini.eadoc.EAuthor#getInitials()
	 * @see #getEAuthor()
	 * @generated
	 */
	EAttribute getEAuthor_Initials();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EBlock <em>EBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBlock</em>'.
	 * @see fr.jmini.eadoc.EBlock
	 * @generated
	 */
	EClass getEBlock();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EBlock#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see fr.jmini.eadoc.EBlock#getLines()
	 * @see #getEBlock()
	 * @generated
	 */
	EAttribute getEBlock_Lines();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EBlock#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.eadoc.EBlock#getSource()
	 * @see #getEBlock()
	 * @generated
	 */
	EAttribute getEBlock_Source();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ECell <em>ECell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECell</em>'.
	 * @see fr.jmini.eadoc.ECell
	 * @generated
	 */
	EClass getECell();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.eadoc.ECell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see fr.jmini.eadoc.ECell#getRow()
	 * @see #getECell()
	 * @generated
	 */
	EReference getECell_Row();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.ECell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see fr.jmini.eadoc.ECell#getColumn()
	 * @see #getECell()
	 * @generated
	 */
	EReference getECell_Column();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see fr.jmini.eadoc.ECell#getColspan()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see fr.jmini.eadoc.ECell#getRowspan()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.eadoc.ECell#getSource()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_Source();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.eadoc.ECell#getStyle()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see fr.jmini.eadoc.ECell#getHorizontalAlignment()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECell#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see fr.jmini.eadoc.ECell#getVerticalAlignment()
	 * @see #getECell()
	 * @generated
	 */
	EAttribute getECell_VerticalAlignment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.ECell#getInnerDocument <em>Inner Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Document</em>'.
	 * @see fr.jmini.eadoc.ECell#getInnerDocument()
	 * @see #getECell()
	 * @generated
	 */
	EReference getECell_InnerDocument();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EColumn <em>EColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EColumn</em>'.
	 * @see fr.jmini.eadoc.EColumn
	 * @generated
	 */
	EClass getEColumn();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EColumn#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.eadoc.EColumn#getStyle()
	 * @see #getEColumn()
	 * @generated
	 */
	EAttribute getEColumn_Style();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.eadoc.EColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see fr.jmini.eadoc.EColumn#getTable()
	 * @see #getEColumn()
	 * @generated
	 */
	EReference getEColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.jmini.eadoc.EColumn#getWidth()
	 * @see #getEColumn()
	 * @generated
	 */
	EAttribute getEColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EColumn#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see fr.jmini.eadoc.EColumn#getHorizontalAlignment()
	 * @see #getEColumn()
	 * @generated
	 */
	EAttribute getEColumn_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EColumn#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see fr.jmini.eadoc.EColumn#getVerticalAlignment()
	 * @see #getEColumn()
	 * @generated
	 */
	EAttribute getEColumn_VerticalAlignment();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EContentNode <em>EContent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EContent Node</em>'.
	 * @see fr.jmini.eadoc.EContentNode
	 * @generated
	 */
	EClass getEContentNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getId()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getNodeName()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_NodeName();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EContentNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getParent()
	 * @see #getEContentNode()
	 * @generated
	 */
	EReference getEContentNode_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getContext()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Context();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EContentNode#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getDocument()
	 * @see #getEContentNode()
	 * @generated
	 */
	EReference getEContentNode_Document();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#isInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline</em>'.
	 * @see fr.jmini.eadoc.EContentNode#isInline()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Inline();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#isBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see fr.jmini.eadoc.EContentNode#isBlock()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Block();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getAttributes()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roles</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getRoles()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Roles();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentNode#getReftext <em>Reftext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reftext</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getReftext()
	 * @see #getEContentNode()
	 * @generated
	 */
	EAttribute getEContentNode_Reftext();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EContentPart <em>EContent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EContent Part</em>'.
	 * @see fr.jmini.eadoc.EContentPart
	 * @generated
	 */
	EClass getEContentPart();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getId()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getLevel()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Level();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getContext()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Context();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getStyle()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Style();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getRole()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Role();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getTitle()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EContentPart#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getAttributes()
	 * @see #getEContentPart()
	 * @generated
	 */
	EAttribute getEContentPart_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EContentPart#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getParts()
	 * @see #getEContentPart()
	 * @generated
	 */
	EReference getEContentPart_Parts();

	/**
	 * Returns the meta object for the container reference '{@link fr.jmini.eadoc.EContentPart#getParentPart <em>Parent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Part</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getParentPart()
	 * @see #getEContentPart()
	 * @generated
	 */
	EReference getEContentPart_ParentPart();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ECursor <em>ECursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECursor</em>'.
	 * @see fr.jmini.eadoc.ECursor
	 * @generated
	 */
	EClass getECursor();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECursor#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see fr.jmini.eadoc.ECursor#getLineNumber()
	 * @see #getECursor()
	 * @generated
	 */
	EAttribute getECursor_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECursor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.jmini.eadoc.ECursor#getPath()
	 * @see #getECursor()
	 * @generated
	 */
	EAttribute getECursor_Path();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECursor#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see fr.jmini.eadoc.ECursor#getDir()
	 * @see #getECursor()
	 * @generated
	 */
	EAttribute getECursor_Dir();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ECursor#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see fr.jmini.eadoc.ECursor#getFile()
	 * @see #getECursor()
	 * @generated
	 */
	EAttribute getECursor_File();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EDescriptionList <em>EDescription List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDescription List</em>'.
	 * @see fr.jmini.eadoc.EDescriptionList
	 * @generated
	 */
	EClass getEDescriptionList();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EDescriptionList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.jmini.eadoc.EDescriptionList#getItems()
	 * @see #getEDescriptionList()
	 * @generated
	 */
	EReference getEDescriptionList_Items();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EDescriptionListEntry <em>EDescription List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDescription List Entry</em>'.
	 * @see fr.jmini.eadoc.EDescriptionListEntry
	 * @generated
	 */
	EClass getEDescriptionListEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EDescriptionListEntry#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see fr.jmini.eadoc.EDescriptionListEntry#getTerms()
	 * @see #getEDescriptionListEntry()
	 * @generated
	 */
	EReference getEDescriptionListEntry_Terms();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.EDescriptionListEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fr.jmini.eadoc.EDescriptionListEntry#getDescription()
	 * @see #getEDescriptionListEntry()
	 * @generated
	 */
	EReference getEDescriptionListEntry_Description();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EDocument <em>EDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDocument</em>'.
	 * @see fr.jmini.eadoc.EDocument
	 * @generated
	 */
	EClass getEDocument();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.EDocument#getStructuredDoctitle <em>Structured Doctitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Doctitle</em>'.
	 * @see fr.jmini.eadoc.EDocument#getStructuredDoctitle()
	 * @see #getEDocument()
	 * @generated
	 */
	EReference getEDocument_StructuredDoctitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EDocument#getDoctitle <em>Doctitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctitle</em>'.
	 * @see fr.jmini.eadoc.EDocument#getDoctitle()
	 * @see #getEDocument()
	 * @generated
	 */
	EAttribute getEDocument_Doctitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EDocument#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see fr.jmini.eadoc.EDocument#getOptions()
	 * @see #getEDocument()
	 * @generated
	 */
	EAttribute getEDocument_Options();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EDocumentHeader <em>EDocument Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDocument Header</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader
	 * @generated
	 */
	EClass getEDocumentHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EDocumentHeader#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader#getAuthors()
	 * @see #getEDocumentHeader()
	 * @generated
	 */
	EReference getEDocumentHeader_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.EDocumentHeader#getDocumentTitle <em>Document Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Title</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader#getDocumentTitle()
	 * @see #getEDocumentHeader()
	 * @generated
	 */
	EReference getEDocumentHeader_DocumentTitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EDocumentHeader#getPageTitle <em>Page Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Title</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader#getPageTitle()
	 * @see #getEDocumentHeader()
	 * @generated
	 */
	EAttribute getEDocumentHeader_PageTitle();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.EDocumentHeader#getRevisionInfo <em>Revision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Info</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader#getRevisionInfo()
	 * @see #getEDocumentHeader()
	 * @generated
	 */
	EReference getEDocumentHeader_RevisionInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EDocumentHeader#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see fr.jmini.eadoc.EDocumentHeader#getAttributes()
	 * @see #getEDocumentHeader()
	 * @generated
	 */
	EAttribute getEDocumentHeader_Attributes();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EAdocList <em>EAdoc List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAdoc List</em>'.
	 * @see fr.jmini.eadoc.EAdocList
	 * @generated
	 */
	EClass getEAdocList();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EAdocList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.jmini.eadoc.EAdocList#getItems()
	 * @see #getEAdocList()
	 * @generated
	 */
	EReference getEAdocList_Items();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EListItem <em>EList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EList Item</em>'.
	 * @see fr.jmini.eadoc.EListItem
	 * @generated
	 */
	EClass getEListItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EListItem#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker</em>'.
	 * @see fr.jmini.eadoc.EListItem#getMarker()
	 * @see #getEListItem()
	 * @generated
	 */
	EAttribute getEListItem_Marker();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EListItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.jmini.eadoc.EListItem#getText()
	 * @see #getEListItem()
	 * @generated
	 */
	EAttribute getEListItem_Text();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EListItem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.jmini.eadoc.EListItem#getSource()
	 * @see #getEListItem()
	 * @generated
	 */
	EAttribute getEListItem_Source();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EPhraseNode <em>EPhrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPhrase Node</em>'.
	 * @see fr.jmini.eadoc.EPhraseNode
	 * @generated
	 */
	EClass getEPhraseNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EPhraseNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see fr.jmini.eadoc.EPhraseNode#getTarget()
	 * @see #getEPhraseNode()
	 * @generated
	 */
	EAttribute getEPhraseNode_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EPhraseNode#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.jmini.eadoc.EPhraseNode#getText()
	 * @see #getEPhraseNode()
	 * @generated
	 */
	EAttribute getEPhraseNode_Text();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EPhraseNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.jmini.eadoc.EPhraseNode#getType()
	 * @see #getEPhraseNode()
	 * @generated
	 */
	EAttribute getEPhraseNode_Type();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ERevisionInfo <em>ERevision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERevision Info</em>'.
	 * @see fr.jmini.eadoc.ERevisionInfo
	 * @generated
	 */
	EClass getERevisionInfo();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ERevisionInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.jmini.eadoc.ERevisionInfo#getDate()
	 * @see #getERevisionInfo()
	 * @generated
	 */
	EAttribute getERevisionInfo_Date();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ERevisionInfo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.jmini.eadoc.ERevisionInfo#getNumber()
	 * @see #getERevisionInfo()
	 * @generated
	 */
	EAttribute getERevisionInfo_Number();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ERevisionInfo#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see fr.jmini.eadoc.ERevisionInfo#getRemark()
	 * @see #getERevisionInfo()
	 * @generated
	 */
	EAttribute getERevisionInfo_Remark();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ERow <em>ERow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERow</em>'.
	 * @see fr.jmini.eadoc.ERow
	 * @generated
	 */
	EClass getERow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.ERow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see fr.jmini.eadoc.ERow#getCells()
	 * @see #getERow()
	 * @generated
	 */
	EReference getERow_Cells();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ESection <em>ESection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESection</em>'.
	 * @see fr.jmini.eadoc.ESection
	 * @generated
	 */
	EClass getESection();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ESection#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see fr.jmini.eadoc.ESection#getIndex()
	 * @see #getESection()
	 * @generated
	 */
	EAttribute getESection_Index();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ESection#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.jmini.eadoc.ESection#getNumber()
	 * @see #getESection()
	 * @generated
	 */
	EAttribute getESection_Number();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ESection#getSectionName <em>Section Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Name</em>'.
	 * @see fr.jmini.eadoc.ESection#getSectionName()
	 * @see #getESection()
	 * @generated
	 */
	EAttribute getESection_SectionName();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ESection#isSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special</em>'.
	 * @see fr.jmini.eadoc.ESection#isSpecial()
	 * @see #getESection()
	 * @generated
	 */
	EAttribute getESection_Special();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ESection#isNumbered <em>Numbered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbered</em>'.
	 * @see fr.jmini.eadoc.ESection#isNumbered()
	 * @see #getESection()
	 * @generated
	 */
	EAttribute getESection_Numbered();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EStructuralNode <em>EStructural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Node</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode
	 * @generated
	 */
	EClass getEStructuralNode();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EStructuralNode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getTitle()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EAttribute getEStructuralNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EStructuralNode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getStyle()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EAttribute getEStructuralNode_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EStructuralNode#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getBlocks()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EReference getEStructuralNode_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.EStructuralNode#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getLevel()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EAttribute getEStructuralNode_Level();

	/**
	 * Returns the meta object for the containment reference '{@link fr.jmini.eadoc.EStructuralNode#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Location</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getSourceLocation()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EReference getEStructuralNode_SourceLocation();

	/**
	 * Returns the meta object for the attribute list '{@link fr.jmini.eadoc.EStructuralNode#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substitutions</em>'.
	 * @see fr.jmini.eadoc.EStructuralNode#getSubstitutions()
	 * @see #getEStructuralNode()
	 * @generated
	 */
	EAttribute getEStructuralNode_Substitutions();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.EStructuredDocument <em>EStructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructured Document</em>'.
	 * @see fr.jmini.eadoc.EStructuredDocument
	 * @generated
	 */
	EClass getEStructuredDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.EStructuredDocument#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see fr.jmini.eadoc.EStructuredDocument#getParts()
	 * @see #getEStructuredDocument()
	 * @generated
	 */
	EReference getEStructuredDocument_Parts();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EStructuredDocument#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header</em>'.
	 * @see fr.jmini.eadoc.EStructuredDocument#getHeader()
	 * @see #getEStructuredDocument()
	 * @generated
	 */
	EReference getEStructuredDocument_Header();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ETable <em>ETable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETable</em>'.
	 * @see fr.jmini.eadoc.ETable
	 * @generated
	 */
	EClass getETable();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETable#isHeaderOption <em>Header Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Option</em>'.
	 * @see fr.jmini.eadoc.ETable#isHeaderOption()
	 * @see #getETable()
	 * @generated
	 */
	EAttribute getETable_HeaderOption();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.ETable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see fr.jmini.eadoc.ETable#getColumns()
	 * @see #getETable()
	 * @generated
	 */
	EReference getETable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.ETable#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see fr.jmini.eadoc.ETable#getHeader()
	 * @see #getETable()
	 * @generated
	 */
	EReference getETable_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.ETable#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footer</em>'.
	 * @see fr.jmini.eadoc.ETable#getFooter()
	 * @see #getETable()
	 * @generated
	 */
	EReference getETable_Footer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.jmini.eadoc.ETable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see fr.jmini.eadoc.ETable#getBody()
	 * @see #getETable()
	 * @generated
	 */
	EReference getETable_Body();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETable#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see fr.jmini.eadoc.ETable#getFrame()
	 * @see #getETable()
	 * @generated
	 */
	EAttribute getETable_Frame();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETable#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see fr.jmini.eadoc.ETable#getGrid()
	 * @see #getETable()
	 * @generated
	 */
	EAttribute getETable_Grid();

	/**
	 * Returns the meta object for class '{@link fr.jmini.eadoc.ETitle <em>ETitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETitle</em>'.
	 * @see fr.jmini.eadoc.ETitle
	 * @generated
	 */
	EClass getETitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETitle#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see fr.jmini.eadoc.ETitle#getMain()
	 * @see #getETitle()
	 * @generated
	 */
	EAttribute getETitle_Main();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETitle#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see fr.jmini.eadoc.ETitle#getSubtitle()
	 * @see #getETitle()
	 * @generated
	 */
	EAttribute getETitle_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETitle#getCombined <em>Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combined</em>'.
	 * @see fr.jmini.eadoc.ETitle#getCombined()
	 * @see #getETitle()
	 * @generated
	 */
	EAttribute getETitle_Combined();

	/**
	 * Returns the meta object for the attribute '{@link fr.jmini.eadoc.ETitle#isSanitized <em>Sanitized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sanitized</em>'.
	 * @see fr.jmini.eadoc.ETitle#isSanitized()
	 * @see #getETitle()
	 * @generated
	 */
	EAttribute getETitle_Sanitized();

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
	 * @model instanceClass="java.util.List<? extends org.asciidoctor.ast.StructuralNode>"
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
	EadocFactory getEadocFactory();

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
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Block <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Block
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Cell <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Cell
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Column <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Column
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ContentNode
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentNode()
		 * @generated
		 */
		EClass CONTENT_NODE = eINSTANCE.getContentNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ContentPart
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPart()
		 * @generated
		 */
		EClass CONTENT_PART = eINSTANCE.getContentPart();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Cursor
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getCursor()
		 * @generated
		 */
		EClass CURSOR = eINSTANCE.getCursor();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DescriptionList <em>Description List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DescriptionList
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDescriptionList()
		 * @generated
		 */
		EClass DESCRIPTION_LIST = eINSTANCE.getDescriptionList();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DescriptionListEntry <em>Description List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DescriptionListEntry
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDescriptionListEntry()
		 * @generated
		 */
		EClass DESCRIPTION_LIST_ENTRY = eINSTANCE.getDescriptionListEntry();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Document
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DocumentHeader
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocumentHeader()
		 * @generated
		 */
		EClass DOCUMENT_HEADER = eINSTANCE.getDocumentHeader();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.List <em>Ast List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.List
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getAstList()
		 * @generated
		 */
		EClass AST_LIST = eINSTANCE.getAstList();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.ListItem <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.ListItem
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.PhraseNode <em>Phrase Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.PhraseNode
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getPhraseNode()
		 * @generated
		 */
		EClass PHRASE_NODE = eINSTANCE.getPhraseNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.RevisionInfo
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRevisionInfo()
		 * @generated
		 */
		EClass REVISION_INFO = eINSTANCE.getRevisionInfo();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Row <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Row
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Section <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Section
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.StructuralNode <em>Structural Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.StructuralNode
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuralNode()
		 * @generated
		 */
		EClass STRUCTURAL_NODE = eINSTANCE.getStructuralNode();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.StructuredDocument
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuredDocument()
		 * @generated
		 */
		EClass STRUCTURED_DOCUMENT = eINSTANCE.getStructuredDocument();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Table <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link org.asciidoctor.ast.Title <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Title
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.EadocUtility <em>Utility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.EadocUtility
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEadocUtility()
		 * @generated
		 */
		EClass EADOC_UTILITY = eINSTANCE.getEadocUtility();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EAuthorImpl <em>EAuthor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EAuthorImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEAuthor()
		 * @generated
		 */
		EClass EAUTHOR = eINSTANCE.getEAuthor();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__EMAIL = eINSTANCE.getEAuthor_Email();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__FULL_NAME = eINSTANCE.getEAuthor_FullName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__FIRST_NAME = eINSTANCE.getEAuthor_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__LAST_NAME = eINSTANCE.getEAuthor_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__MIDDLE_NAME = eINSTANCE.getEAuthor_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Initials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAUTHOR__INITIALS = eINSTANCE.getEAuthor_Initials();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EBlockImpl <em>EBlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EBlockImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEBlock()
		 * @generated
		 */
		EClass EBLOCK = eINSTANCE.getEBlock();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBLOCK__LINES = eINSTANCE.getEBlock_Lines();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBLOCK__SOURCE = eINSTANCE.getEBlock_Source();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ECellImpl <em>ECell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ECellImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getECell()
		 * @generated
		 */
		EClass ECELL = eINSTANCE.getECell();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECELL__ROW = eINSTANCE.getECell_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECELL__COLUMN = eINSTANCE.getECell_Column();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__COLSPAN = eINSTANCE.getECell_Colspan();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__ROWSPAN = eINSTANCE.getECell_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__SOURCE = eINSTANCE.getECell_Source();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__STYLE = eINSTANCE.getECell_Style();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__HORIZONTAL_ALIGNMENT = eINSTANCE.getECell_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECELL__VERTICAL_ALIGNMENT = eINSTANCE.getECell_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Inner Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECELL__INNER_DOCUMENT = eINSTANCE.getECell_InnerDocument();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EColumnImpl <em>EColumn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EColumnImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEColumn()
		 * @generated
		 */
		EClass ECOLUMN = eINSTANCE.getEColumn();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOLUMN__STYLE = eINSTANCE.getEColumn_Style();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOLUMN__TABLE = eINSTANCE.getEColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOLUMN__WIDTH = eINSTANCE.getEColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOLUMN__HORIZONTAL_ALIGNMENT = eINSTANCE.getEColumn_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOLUMN__VERTICAL_ALIGNMENT = eINSTANCE.getEColumn_VerticalAlignment();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EContentNodeImpl <em>EContent Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EContentNodeImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentNode()
		 * @generated
		 */
		EClass ECONTENT_NODE = eINSTANCE.getEContentNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__ID = eINSTANCE.getEContentNode_Id();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__NODE_NAME = eINSTANCE.getEContentNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_NODE__PARENT = eINSTANCE.getEContentNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__CONTEXT = eINSTANCE.getEContentNode_Context();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_NODE__DOCUMENT = eINSTANCE.getEContentNode_Document();

		/**
		 * The meta object literal for the '<em><b>Inline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__INLINE = eINSTANCE.getEContentNode_Inline();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__BLOCK = eINSTANCE.getEContentNode_Block();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__ATTRIBUTES = eINSTANCE.getEContentNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__ROLES = eINSTANCE.getEContentNode_Roles();

		/**
		 * The meta object literal for the '<em><b>Reftext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_NODE__REFTEXT = eINSTANCE.getEContentNode_Reftext();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EContentPartImpl <em>EContent Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EContentPartImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentPart()
		 * @generated
		 */
		EClass ECONTENT_PART = eINSTANCE.getEContentPart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__ID = eINSTANCE.getEContentPart_Id();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__LEVEL = eINSTANCE.getEContentPart_Level();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__CONTEXT = eINSTANCE.getEContentPart_Context();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__STYLE = eINSTANCE.getEContentPart_Style();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__ROLE = eINSTANCE.getEContentPart_Role();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__TITLE = eINSTANCE.getEContentPart_Title();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTENT_PART__ATTRIBUTES = eINSTANCE.getEContentPart_Attributes();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_PART__PARTS = eINSTANCE.getEContentPart_Parts();

		/**
		 * The meta object literal for the '<em><b>Parent Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_PART__PARENT_PART = eINSTANCE.getEContentPart_ParentPart();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ECursorImpl <em>ECursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ECursorImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getECursor()
		 * @generated
		 */
		EClass ECURSOR = eINSTANCE.getECursor();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECURSOR__LINE_NUMBER = eINSTANCE.getECursor_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECURSOR__PATH = eINSTANCE.getECursor_Path();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECURSOR__DIR = eINSTANCE.getECursor_Dir();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECURSOR__FILE = eINSTANCE.getECursor_File();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EDescriptionListImpl <em>EDescription List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EDescriptionListImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDescriptionList()
		 * @generated
		 */
		EClass EDESCRIPTION_LIST = eINSTANCE.getEDescriptionList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDESCRIPTION_LIST__ITEMS = eINSTANCE.getEDescriptionList_Items();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EDescriptionListEntryImpl <em>EDescription List Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EDescriptionListEntryImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDescriptionListEntry()
		 * @generated
		 */
		EClass EDESCRIPTION_LIST_ENTRY = eINSTANCE.getEDescriptionListEntry();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDESCRIPTION_LIST_ENTRY__TERMS = eINSTANCE.getEDescriptionListEntry_Terms();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDESCRIPTION_LIST_ENTRY__DESCRIPTION = eINSTANCE.getEDescriptionListEntry_Description();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EDocumentImpl <em>EDocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EDocumentImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDocument()
		 * @generated
		 */
		EClass EDOCUMENT = eINSTANCE.getEDocument();

		/**
		 * The meta object literal for the '<em><b>Structured Doctitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOCUMENT__STRUCTURED_DOCTITLE = eINSTANCE.getEDocument_StructuredDoctitle();

		/**
		 * The meta object literal for the '<em><b>Doctitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOCUMENT__DOCTITLE = eINSTANCE.getEDocument_Doctitle();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOCUMENT__OPTIONS = eINSTANCE.getEDocument_Options();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EDocumentHeaderImpl <em>EDocument Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EDocumentHeaderImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEDocumentHeader()
		 * @generated
		 */
		EClass EDOCUMENT_HEADER = eINSTANCE.getEDocumentHeader();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOCUMENT_HEADER__AUTHORS = eINSTANCE.getEDocumentHeader_Authors();

		/**
		 * The meta object literal for the '<em><b>Document Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOCUMENT_HEADER__DOCUMENT_TITLE = eINSTANCE.getEDocumentHeader_DocumentTitle();

		/**
		 * The meta object literal for the '<em><b>Page Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOCUMENT_HEADER__PAGE_TITLE = eINSTANCE.getEDocumentHeader_PageTitle();

		/**
		 * The meta object literal for the '<em><b>Revision Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOCUMENT_HEADER__REVISION_INFO = eINSTANCE.getEDocumentHeader_RevisionInfo();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOCUMENT_HEADER__ATTRIBUTES = eINSTANCE.getEDocumentHeader_Attributes();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EAdocListImpl <em>EAdoc List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EAdocListImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEAdocList()
		 * @generated
		 */
		EClass EADOC_LIST = eINSTANCE.getEAdocList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADOC_LIST__ITEMS = eINSTANCE.getEAdocList_Items();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EListItemImpl <em>EList Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EListItemImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEListItem()
		 * @generated
		 */
		EClass ELIST_ITEM = eINSTANCE.getEListItem();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELIST_ITEM__MARKER = eINSTANCE.getEListItem_Marker();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELIST_ITEM__TEXT = eINSTANCE.getEListItem_Text();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELIST_ITEM__SOURCE = eINSTANCE.getEListItem_Source();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EPhraseNodeImpl <em>EPhrase Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EPhraseNodeImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEPhraseNode()
		 * @generated
		 */
		EClass EPHRASE_NODE = eINSTANCE.getEPhraseNode();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPHRASE_NODE__TARGET = eINSTANCE.getEPhraseNode_Target();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPHRASE_NODE__TEXT = eINSTANCE.getEPhraseNode_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPHRASE_NODE__TYPE = eINSTANCE.getEPhraseNode_Type();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ERevisionInfoImpl <em>ERevision Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ERevisionInfoImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getERevisionInfo()
		 * @generated
		 */
		EClass EREVISION_INFO = eINSTANCE.getERevisionInfo();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREVISION_INFO__DATE = eINSTANCE.getERevisionInfo_Date();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREVISION_INFO__NUMBER = eINSTANCE.getERevisionInfo_Number();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREVISION_INFO__REMARK = eINSTANCE.getERevisionInfo_Remark();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ERowImpl <em>ERow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ERowImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getERow()
		 * @generated
		 */
		EClass EROW = eINSTANCE.getERow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EROW__CELLS = eINSTANCE.getERow_Cells();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ESectionImpl <em>ESection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ESectionImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getESection()
		 * @generated
		 */
		EClass ESECTION = eINSTANCE.getESection();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESECTION__INDEX = eINSTANCE.getESection_Index();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESECTION__NUMBER = eINSTANCE.getESection_Number();

		/**
		 * The meta object literal for the '<em><b>Section Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESECTION__SECTION_NAME = eINSTANCE.getESection_SectionName();

		/**
		 * The meta object literal for the '<em><b>Special</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESECTION__SPECIAL = eINSTANCE.getESection_Special();

		/**
		 * The meta object literal for the '<em><b>Numbered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESECTION__NUMBERED = eINSTANCE.getESection_Numbered();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EStructuralNodeImpl <em>EStructural Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EStructuralNodeImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEStructuralNode()
		 * @generated
		 */
		EClass ESTRUCTURAL_NODE = eINSTANCE.getEStructuralNode();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_NODE__TITLE = eINSTANCE.getEStructuralNode_Title();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_NODE__STYLE = eINSTANCE.getEStructuralNode_Style();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_NODE__BLOCKS = eINSTANCE.getEStructuralNode_Blocks();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_NODE__LEVEL = eINSTANCE.getEStructuralNode_Level();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_NODE__SOURCE_LOCATION = eINSTANCE.getEStructuralNode_SourceLocation();

		/**
		 * The meta object literal for the '<em><b>Substitutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_NODE__SUBSTITUTIONS = eINSTANCE.getEStructuralNode_Substitutions();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.EStructuredDocumentImpl <em>EStructured Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.EStructuredDocumentImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEStructuredDocument()
		 * @generated
		 */
		EClass ESTRUCTURED_DOCUMENT = eINSTANCE.getEStructuredDocument();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURED_DOCUMENT__PARTS = eINSTANCE.getEStructuredDocument_Parts();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURED_DOCUMENT__HEADER = eINSTANCE.getEStructuredDocument_Header();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ETableImpl <em>ETable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ETableImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getETable()
		 * @generated
		 */
		EClass ETABLE = eINSTANCE.getETable();

		/**
		 * The meta object literal for the '<em><b>Header Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE__HEADER_OPTION = eINSTANCE.getETable_HeaderOption();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE__COLUMNS = eINSTANCE.getETable_Columns();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE__HEADER = eINSTANCE.getETable_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE__FOOTER = eINSTANCE.getETable_Footer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE__BODY = eINSTANCE.getETable_Body();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE__FRAME = eINSTANCE.getETable_Frame();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE__GRID = eINSTANCE.getETable_Grid();

		/**
		 * The meta object literal for the '{@link fr.jmini.eadoc.impl.ETitleImpl <em>ETitle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.jmini.eadoc.impl.ETitleImpl
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getETitle()
		 * @generated
		 */
		EClass ETITLE = eINSTANCE.getETitle();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETITLE__MAIN = eINSTANCE.getETitle_Main();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETITLE__SUBTITLE = eINSTANCE.getETitle_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Combined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETITLE__COMBINED = eINSTANCE.getETitle_Combined();

		/**
		 * The meta object literal for the '<em><b>Sanitized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETITLE__SANITIZED = eINSTANCE.getETitle_Sanitized();

		/**
		 * The meta object literal for the '<em>Horizontal Alignment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table.HorizontalAlignment
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getHorizontalAlignment()
		 * @generated
		 */
		EDataType HORIZONTAL_ALIGNMENT = eINSTANCE.getHorizontalAlignment();

		/**
		 * The meta object literal for the '<em>Vertical Alignment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Table.VerticalAlignment
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getVerticalAlignment()
		 * @generated
		 */
		EDataType VERTICAL_ALIGNMENT = eINSTANCE.getVerticalAlignment();

		/**
		 * The meta object literal for the '<em>String Object Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringObjectMap()
		 * @generated
		 */
		EDataType STRING_OBJECT_MAP = eINSTANCE.getStringObjectMap();

		/**
		 * The meta object literal for the '<em>Object Object Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getObjectObjectMap()
		 * @generated
		 */
		EDataType OBJECT_OBJECT_MAP = eINSTANCE.getObjectObjectMap();

		/**
		 * The meta object literal for the '<em>String List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringList()
		 * @generated
		 */
		EDataType STRING_LIST = eINSTANCE.getStringList();

		/**
		 * The meta object literal for the '<em>Content Part List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPartList()
		 * @generated
		 */
		EDataType CONTENT_PART_LIST = eINSTANCE.getContentPartList();

		/**
		 * The meta object literal for the '<em>Structural Node List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuralNodeList()
		 * @generated
		 */
		EDataType STRUCTURAL_NODE_LIST = eINSTANCE.getStructuralNodeList();

	}

} //EadocPackage
