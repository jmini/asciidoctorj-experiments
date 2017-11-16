/**
 */
package fr.jmini.eadoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.jmini.eadoc.EadocFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' modelDirectory='adoc-api-impl/src/main/java-gen' complianceLevel='8.0' basePackage='fr.jmini'"
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
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.DocumentHeader
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocumentHeader()
	 * @generated
	 */
	int DOCUMENT_HEADER = 1;

	/**
	 * The number of structural features of the '<em>Document Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Document Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Cursor
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 2;

	/**
	 * The number of structural features of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.RevisionInfo
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRevisionInfo()
	 * @generated
	 */
	int REVISION_INFO = 3;

	/**
	 * The number of structural features of the '<em>Revision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_INFO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Revision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.StructuredDocument
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStructuredDocument()
	 * @generated
	 */
	int STRUCTURED_DOCUMENT = 4;

	/**
	 * The number of structural features of the '<em>Structured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DOCUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Structured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.ContentNode
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentNode()
	 * @generated
	 */
	int CONTENT_NODE = 5;

	/**
	 * The number of structural features of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.ContentPart
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPart()
	 * @generated
	 */
	int CONTENT_PART = 6;

	/**
	 * The number of structural features of the '<em>Content Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Document
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 7;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.asciidoctor.ast.Title <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.asciidoctor.ast.Title
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 8;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.Map<java.lang.String, java.lang.Object> <em>String Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map<java.lang.String, java.lang.Object>
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringObjectMap()
	 * @generated
	 */
	int STRING_OBJECT_MAP = 9;

	/**
	 * The number of structural features of the '<em>String Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT_MAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>String Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.Map<java.lang.Object, java.lang.Object> <em>Object Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map<java.lang.Object, java.lang.Object>
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getObjectObjectMap()
	 * @generated
	 */
	int OBJECT_OBJECT_MAP = 10;

	/**
	 * The number of structural features of the '<em>Object Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OBJECT_MAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.List<java.lang.String> <em>String List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List<java.lang.String>
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 11;

	/**
	 * The number of structural features of the '<em>String List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>String List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.List<org.asciidoctor.ast.ContentPart> <em>Content Part List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List<org.asciidoctor.ast.ContentPart>
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPartList()
	 * @generated
	 */
	int CONTENT_PART_LIST = 12;

	/**
	 * The number of structural features of the '<em>Content Part List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PART_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content Part List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_PART_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EAuthorImpl <em>EAuthor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EAuthorImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEAuthor()
	 * @generated
	 */
	int EAUTHOR = 13;

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
	 * The number of operations of the '<em>EAuthor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUTHOR_OPERATION_COUNT = AUTHOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ECursorImpl <em>ECursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ECursorImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getECursor()
	 * @generated
	 */
	int ECURSOR = 14;

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
	 * The number of operations of the '<em>ECursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECURSOR_OPERATION_COUNT = CURSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ETitleImpl <em>ETitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ETitleImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getETitle()
	 * @generated
	 */
	int ETITLE = 15;

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
	 * The number of operations of the '<em>ETitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETITLE_OPERATION_COUNT = TITLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.ERevisionInfoImpl <em>ERevision Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.ERevisionInfoImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getERevisionInfo()
	 * @generated
	 */
	int EREVISION_INFO = 16;

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
	 * The number of operations of the '<em>ERevision Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREVISION_INFO_OPERATION_COUNT = REVISION_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EContentPartImpl <em>EContent Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EContentPartImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentPart()
	 * @generated
	 */
	int ECONTENT_PART = 17;

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
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
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
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART___GET_CONTENT = CONTENT_PART_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EContent Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_PART_OPERATION_COUNT = CONTENT_PART_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EStructuredDocumentImpl <em>EStructured Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EStructuredDocumentImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEStructuredDocument()
	 * @generated
	 */
	int ESTRUCTURED_DOCUMENT = 18;

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
	 * The operation id for the '<em>Get Part By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PART_BY_ID__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Part By Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PART_BY_STYLE__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Part By Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PART_BY_ROLE__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parts By Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PARTS_BY_CONTEXT__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parts By Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PARTS_BY_STYLE__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Parts By Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT___GET_PARTS_BY_ROLE__STRING = STRUCTURED_DOCUMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>EStructured Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURED_DOCUMENT_OPERATION_COUNT = STRUCTURED_DOCUMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.jmini.eadoc.impl.EContentNodeImpl <em>EContent Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.jmini.eadoc.impl.EContentNodeImpl
	 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getEContentNode()
	 * @generated
	 */
	int ECONTENT_NODE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ID = CONTENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__PARENT = CONTENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__CONTEXT = CONTENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__DOCUMENT = CONTENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__INLINE = CONTENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__BLOCK = CONTENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ATTRIBUTES = CONTENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE__ROLES = CONTENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EContent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE_FEATURE_COUNT = CONTENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___ID = CONTENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Node Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_NODE_NAME = CONTENT_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___PARENT = CONTENT_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___CONTEXT = CONTENT_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___DOCUMENT = CONTENT_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT = CONTENT_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTR__OBJECT = CONTENT_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT = CONTENT_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ATTRIBUTE__OBJECT = CONTENT_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Has Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___HAS_ATTR__OBJECT = CONTENT_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Has Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___HAS_ATTR__OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT = CONTENT_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Has Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT = CONTENT_NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT = CONTENT_NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Set Attr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___SET_ATTR__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Set Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___SET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_OPTION__OBJECT = CONTENT_NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_ROLE = CONTENT_NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Has Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___HAS_ROLE__STRING = CONTENT_NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_ROLE = CONTENT_NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___ROLE = CONTENT_NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Add Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___ADD_ROLE__STRING = CONTENT_NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Remove Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___REMOVE_ROLE__STRING = CONTENT_NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Reftext</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IS_REFTEXT = CONTENT_NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Reftext</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___GET_REFTEXT = CONTENT_NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Icon Uri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___ICON_URI__STRING = CONTENT_NODE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Media Uri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___MEDIA_URI__STRING = CONTENT_NODE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Image Uri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IMAGE_URI__STRING = CONTENT_NODE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Image Uri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___IMAGE_URI__STRING_STRING = CONTENT_NODE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Read Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___READ_ASSET__STRING_OBJECT_OBJECT_MAP = CONTENT_NODE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Normalize Web Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE___NORMALIZE_WEB_PATH__STRING_STRING_BOOLEAN = CONTENT_NODE_OPERATION_COUNT + 35;

	/**
	 * The number of operations of the '<em>EContent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTENT_NODE_OPERATION_COUNT = CONTENT_NODE_OPERATION_COUNT + 36;


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
	 * Returns the meta object for class '{@link java.util.Map<java.lang.String, java.lang.Object> <em>String Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Object Map</em>'.
	 * @see java.util.Map<java.lang.String, java.lang.Object>
	 * @model instanceClass="java.util.Map<java.lang.String, java.lang.Object>"
	 * @generated
	 */
	EClass getStringObjectMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map<java.lang.Object, java.lang.Object> <em>Object Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Object Map</em>'.
	 * @see java.util.Map<java.lang.Object, java.lang.Object>
	 * @model instanceClass="java.util.Map<java.lang.Object, java.lang.Object>"
	 * @generated
	 */
	EClass getObjectObjectMap();

	/**
	 * Returns the meta object for class '{@link java.util.List<java.lang.String> <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String List</em>'.
	 * @see java.util.List<java.lang.String>
	 * @model instanceClass="java.util.List<java.lang.String>"
	 * @generated
	 */
	EClass getStringList();

	/**
	 * Returns the meta object for class '{@link java.util.List<org.asciidoctor.ast.ContentPart> <em>Content Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Part List</em>'.
	 * @see java.util.List<org.asciidoctor.ast.ContentPart>
	 * @model instanceClass="java.util.List<org.asciidoctor.ast.ContentPart>"
	 * @generated
	 */
	EClass getContentPartList();

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
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EContentPart#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see fr.jmini.eadoc.EContentPart#getAttributes()
	 * @see #getEContentPart()
	 * @generated
	 */
	EReference getEContentPart_Attributes();

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
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentPart#getContent() <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see fr.jmini.eadoc.EContentPart#getContent()
	 * @generated
	 */
	EOperation getEContentPart__GetContent();

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
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartById(java.lang.String) <em>Get Part By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Part By Id</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartById(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartById__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartByStyle(java.lang.String) <em>Get Part By Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Part By Style</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartByStyle(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartByStyle__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartByRole(java.lang.String) <em>Get Part By Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Part By Role</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartByRole(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartByRole__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartsByContext(java.lang.String) <em>Get Parts By Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parts By Context</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartsByContext(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartsByContext__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartsByStyle(java.lang.String) <em>Get Parts By Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parts By Style</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartsByStyle(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartsByStyle__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EStructuredDocument#getPartsByRole(java.lang.String) <em>Get Parts By Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parts By Role</em>' operation.
	 * @see fr.jmini.eadoc.EStructuredDocument#getPartsByRole(java.lang.String)
	 * @generated
	 */
	EOperation getEStructuredDocument__GetPartsByRole__String();

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
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EContentNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getAttributes()
	 * @see #getEContentNode()
	 * @generated
	 */
	EReference getEContentNode_Attributes();

	/**
	 * Returns the meta object for the reference '{@link fr.jmini.eadoc.EContentNode#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roles</em>'.
	 * @see fr.jmini.eadoc.EContentNode#getRoles()
	 * @see #getEContentNode()
	 * @generated
	 */
	EReference getEContentNode_Roles();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#id() <em>Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#id()
	 * @generated
	 */
	EOperation getEContentNode__Id();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getNodeName() <em>Get Node Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Name</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getNodeName()
	 * @generated
	 */
	EOperation getEContentNode__GetNodeName();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#parent()
	 * @generated
	 */
	EOperation getEContentNode__Parent();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#context()
	 * @generated
	 */
	EOperation getEContentNode__Context();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#document() <em>Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Document</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#document()
	 * @generated
	 */
	EOperation getEContentNode__Document();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object, java.lang.Object, boolean) <em>Get Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__GetAttr__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object, java.lang.Object) <em>Get Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__GetAttr__Object_Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object) <em>Get Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttr(java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__GetAttr__Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object, java.lang.Object, boolean) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__GetAttribute__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object, java.lang.Object) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__GetAttribute__Object_Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getAttribute(java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__GetAttribute__Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#hasAttr(java.lang.Object) <em>Has Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#hasAttr(java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__HasAttr__Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#hasAttr(java.lang.Object, boolean) <em>Has Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#hasAttr(java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__HasAttr__Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#hasAttribute(java.lang.Object) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#hasAttribute(java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__HasAttribute__Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#hasAttribute(java.lang.Object, boolean) <em>Has Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#hasAttribute(java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__HasAttribute__Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isAttr(java.lang.Object, java.lang.Object) <em>Is Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isAttr(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__IsAttr__Object_Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isAttr(java.lang.Object, java.lang.Object, boolean) <em>Is Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isAttr(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__IsAttr__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isAttribute(java.lang.Object, java.lang.Object) <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isAttribute(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__IsAttribute__Object_Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isAttribute(java.lang.Object, java.lang.Object, boolean) <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isAttribute(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__IsAttribute__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#setAttr(java.lang.Object, java.lang.Object, boolean) <em>Set Attr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attr</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#setAttr(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__SetAttr__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#setAttribute(java.lang.Object, java.lang.Object, boolean) <em>Set Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Attribute</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#setAttribute(java.lang.Object, java.lang.Object, boolean)
	 * @generated
	 */
	EOperation getEContentNode__SetAttribute__Object_Object_boolean();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isOption(java.lang.Object) <em>Is Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Option</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isOption(java.lang.Object)
	 * @generated
	 */
	EOperation getEContentNode__IsOption__Object();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isRole() <em>Is Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isRole()
	 * @generated
	 */
	EOperation getEContentNode__IsRole();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#hasRole(java.lang.String) <em>Has Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#hasRole(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__HasRole__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getRole() <em>Get Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getRole()
	 * @generated
	 */
	EOperation getEContentNode__GetRole();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#role() <em>Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#role()
	 * @generated
	 */
	EOperation getEContentNode__Role();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#addRole(java.lang.String) <em>Add Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#addRole(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__AddRole__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#removeRole(java.lang.String) <em>Remove Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Role</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#removeRole(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__RemoveRole__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#isReftext() <em>Is Reftext</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Reftext</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#isReftext()
	 * @generated
	 */
	EOperation getEContentNode__IsReftext();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#getReftext() <em>Get Reftext</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reftext</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#getReftext()
	 * @generated
	 */
	EOperation getEContentNode__GetReftext();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#iconUri(java.lang.String) <em>Icon Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Icon Uri</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#iconUri(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__IconUri__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#mediaUri(java.lang.String) <em>Media Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Media Uri</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#mediaUri(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__MediaUri__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#imageUri(java.lang.String) <em>Image Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Image Uri</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#imageUri(java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__ImageUri__String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#imageUri(java.lang.String, java.lang.String) <em>Image Uri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Image Uri</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#imageUri(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEContentNode__ImageUri__String_String();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#readAsset(java.lang.String, java.util.Map<java.lang.Object, java.lang.Object>) <em>Read Asset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Asset</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#readAsset(java.lang.String, java.util.Map<java.lang.Object, java.lang.Object>)
	 * @generated
	 */
	EOperation getEContentNode__ReadAsset__String_ObjectObjectMap();

	/**
	 * Returns the meta object for the '{@link fr.jmini.eadoc.EContentNode#normalizeWebPath(java.lang.String, java.lang.String, boolean) <em>Normalize Web Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Normalize Web Path</em>' operation.
	 * @see fr.jmini.eadoc.EContentNode#normalizeWebPath(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getEContentNode__NormalizeWebPath__String_String_boolean();

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
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.DocumentHeader
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocumentHeader()
		 * @generated
		 */
		EClass DOCUMENT_HEADER = eINSTANCE.getDocumentHeader();

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
		 * The meta object literal for the '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.RevisionInfo
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getRevisionInfo()
		 * @generated
		 */
		EClass REVISION_INFO = eINSTANCE.getRevisionInfo();

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
		 * The meta object literal for the '{@link org.asciidoctor.ast.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.asciidoctor.ast.Document
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

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
		 * The meta object literal for the '{@link java.util.Map<java.lang.String, java.lang.Object> <em>String Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map<java.lang.String, java.lang.Object>
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringObjectMap()
		 * @generated
		 */
		EClass STRING_OBJECT_MAP = eINSTANCE.getStringObjectMap();

		/**
		 * The meta object literal for the '{@link java.util.Map<java.lang.Object, java.lang.Object> <em>Object Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map<java.lang.Object, java.lang.Object>
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getObjectObjectMap()
		 * @generated
		 */
		EClass OBJECT_OBJECT_MAP = eINSTANCE.getObjectObjectMap();

		/**
		 * The meta object literal for the '{@link java.util.List<java.lang.String> <em>String List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List<java.lang.String>
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getStringList()
		 * @generated
		 */
		EClass STRING_LIST = eINSTANCE.getStringList();

		/**
		 * The meta object literal for the '{@link java.util.List<org.asciidoctor.ast.ContentPart> <em>Content Part List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List<org.asciidoctor.ast.ContentPart>
		 * @see fr.jmini.eadoc.impl.EadocPackageImpl#getContentPartList()
		 * @generated
		 */
		EClass CONTENT_PART_LIST = eINSTANCE.getContentPartList();

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
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_PART__ATTRIBUTES = eINSTANCE.getEContentPart_Attributes();

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
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_PART___GET_CONTENT = eINSTANCE.getEContentPart__GetContent();

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
		 * The meta object literal for the '<em><b>Get Part By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PART_BY_ID__STRING = eINSTANCE.getEStructuredDocument__GetPartById__String();

		/**
		 * The meta object literal for the '<em><b>Get Part By Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PART_BY_STYLE__STRING = eINSTANCE.getEStructuredDocument__GetPartByStyle__String();

		/**
		 * The meta object literal for the '<em><b>Get Part By Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PART_BY_ROLE__STRING = eINSTANCE.getEStructuredDocument__GetPartByRole__String();

		/**
		 * The meta object literal for the '<em><b>Get Parts By Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PARTS_BY_CONTEXT__STRING = eINSTANCE.getEStructuredDocument__GetPartsByContext__String();

		/**
		 * The meta object literal for the '<em><b>Get Parts By Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PARTS_BY_STYLE__STRING = eINSTANCE.getEStructuredDocument__GetPartsByStyle__String();

		/**
		 * The meta object literal for the '<em><b>Get Parts By Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURED_DOCUMENT___GET_PARTS_BY_ROLE__STRING = eINSTANCE.getEStructuredDocument__GetPartsByRole__String();

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
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_NODE__ATTRIBUTES = eINSTANCE.getEContentNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTENT_NODE__ROLES = eINSTANCE.getEContentNode_Roles();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___ID = eINSTANCE.getEContentNode__Id();

		/**
		 * The meta object literal for the '<em><b>Get Node Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_NODE_NAME = eINSTANCE.getEContentNode__GetNodeName();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___PARENT = eINSTANCE.getEContentNode__Parent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___CONTEXT = eINSTANCE.getEContentNode__Context();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___DOCUMENT = eINSTANCE.getEContentNode__Document();

		/**
		 * The meta object literal for the '<em><b>Get Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__GetAttr__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT = eINSTANCE.getEContentNode__GetAttr__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Get Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTR__OBJECT = eINSTANCE.getEContentNode__GetAttr__Object();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__GetAttribute__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT = eINSTANCE.getEContentNode__GetAttribute__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ATTRIBUTE__OBJECT = eINSTANCE.getEContentNode__GetAttribute__Object();

		/**
		 * The meta object literal for the '<em><b>Has Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___HAS_ATTR__OBJECT = eINSTANCE.getEContentNode__HasAttr__Object();

		/**
		 * The meta object literal for the '<em><b>Has Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___HAS_ATTR__OBJECT_BOOLEAN = eINSTANCE.getEContentNode__HasAttr__Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT = eINSTANCE.getEContentNode__HasAttribute__Object();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT_BOOLEAN = eINSTANCE.getEContentNode__HasAttribute__Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT = eINSTANCE.getEContentNode__IsAttr__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Is Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__IsAttr__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT = eINSTANCE.getEContentNode__IsAttribute__Object_Object();

		/**
		 * The meta object literal for the '<em><b>Is Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__IsAttribute__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Attr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___SET_ATTR__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__SetAttr__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___SET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN = eINSTANCE.getEContentNode__SetAttribute__Object_Object_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_OPTION__OBJECT = eINSTANCE.getEContentNode__IsOption__Object();

		/**
		 * The meta object literal for the '<em><b>Is Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_ROLE = eINSTANCE.getEContentNode__IsRole();

		/**
		 * The meta object literal for the '<em><b>Has Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___HAS_ROLE__STRING = eINSTANCE.getEContentNode__HasRole__String();

		/**
		 * The meta object literal for the '<em><b>Get Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_ROLE = eINSTANCE.getEContentNode__GetRole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___ROLE = eINSTANCE.getEContentNode__Role();

		/**
		 * The meta object literal for the '<em><b>Add Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___ADD_ROLE__STRING = eINSTANCE.getEContentNode__AddRole__String();

		/**
		 * The meta object literal for the '<em><b>Remove Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___REMOVE_ROLE__STRING = eINSTANCE.getEContentNode__RemoveRole__String();

		/**
		 * The meta object literal for the '<em><b>Is Reftext</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IS_REFTEXT = eINSTANCE.getEContentNode__IsReftext();

		/**
		 * The meta object literal for the '<em><b>Get Reftext</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___GET_REFTEXT = eINSTANCE.getEContentNode__GetReftext();

		/**
		 * The meta object literal for the '<em><b>Icon Uri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___ICON_URI__STRING = eINSTANCE.getEContentNode__IconUri__String();

		/**
		 * The meta object literal for the '<em><b>Media Uri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___MEDIA_URI__STRING = eINSTANCE.getEContentNode__MediaUri__String();

		/**
		 * The meta object literal for the '<em><b>Image Uri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IMAGE_URI__STRING = eINSTANCE.getEContentNode__ImageUri__String();

		/**
		 * The meta object literal for the '<em><b>Image Uri</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___IMAGE_URI__STRING_STRING = eINSTANCE.getEContentNode__ImageUri__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Asset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___READ_ASSET__STRING_OBJECT_OBJECT_MAP = eINSTANCE.getEContentNode__ReadAsset__String_ObjectObjectMap();

		/**
		 * The meta object literal for the '<em><b>Normalize Web Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTENT_NODE___NORMALIZE_WEB_PATH__STRING_STRING_BOOLEAN = eINSTANCE.getEContentNode__NormalizeWebPath__String_String_boolean();

	}

} //EadocPackage
