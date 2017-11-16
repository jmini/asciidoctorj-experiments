/**
 */
package fr.jmini.eadoc.impl;

import fr.jmini.eadoc.EAuthor;
import fr.jmini.eadoc.EContentNode;
import fr.jmini.eadoc.EContentPart;
import fr.jmini.eadoc.ECursor;
import fr.jmini.eadoc.ERevisionInfo;
import fr.jmini.eadoc.EStructuredDocument;
import fr.jmini.eadoc.ETitle;
import fr.jmini.eadoc.EadocFactory;
import fr.jmini.eadoc.EadocPackage;

import java.util.List;
import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.Cursor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Title;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass documentHeaderEClass = null;

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
	private EClass revisionInfoEClass = null;

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
	private EClass documentEClass = null;

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
	private EClass stringObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentPartListEClass = null;

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
	private EClass eCursorEClass = null;

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
	private EClass eRevisionInfoEClass = null;

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
	private EClass eStructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eContentNodeEClass = null;

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
	public EClass getDocumentHeader() {
		return documentHeaderEClass;
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
	public EClass getRevisionInfo() {
		return revisionInfoEClass;
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
	public EClass getDocument() {
		return documentEClass;
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
	public EClass getStringObjectMap() {
		return stringObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectObjectMap() {
		return objectObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringList() {
		return stringListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentPartList() {
		return contentPartListEClass;
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
	public EReference getEContentPart_Attributes() {
		return (EReference)eContentPartEClass.getEStructuralFeatures().get(6);
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
	public EOperation getEContentPart__GetContent() {
		return eContentPartEClass.getEOperations().get(0);
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
	public EOperation getEStructuredDocument__GetPartById__String() {
		return eStructuredDocumentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuredDocument__GetPartByStyle__String() {
		return eStructuredDocumentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuredDocument__GetPartByRole__String() {
		return eStructuredDocumentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuredDocument__GetPartsByContext__String() {
		return eStructuredDocumentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuredDocument__GetPartsByStyle__String() {
		return eStructuredDocumentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuredDocument__GetPartsByRole__String() {
		return eStructuredDocumentEClass.getEOperations().get(5);
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
	public EReference getEContentNode_Parent() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Context() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentNode_Document() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Inline() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEContentNode_Block() {
		return (EAttribute)eContentNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentNode_Attributes() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEContentNode_Roles() {
		return (EReference)eContentNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__Id() {
		return eContentNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetNodeName() {
		return eContentNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__Parent() {
		return eContentNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__Context() {
		return eContentNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__Document() {
		return eContentNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttr__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttr__Object_Object() {
		return eContentNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttr__Object() {
		return eContentNodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttribute__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttribute__Object_Object() {
		return eContentNodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetAttribute__Object() {
		return eContentNodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__HasAttr__Object() {
		return eContentNodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__HasAttr__Object_boolean() {
		return eContentNodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__HasAttribute__Object() {
		return eContentNodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__HasAttribute__Object_boolean() {
		return eContentNodeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsAttr__Object_Object() {
		return eContentNodeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsAttr__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsAttribute__Object_Object() {
		return eContentNodeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsAttribute__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__SetAttr__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__SetAttribute__Object_Object_boolean() {
		return eContentNodeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsOption__Object() {
		return eContentNodeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsRole() {
		return eContentNodeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__HasRole__String() {
		return eContentNodeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetRole() {
		return eContentNodeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__Role() {
		return eContentNodeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__AddRole__String() {
		return eContentNodeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__RemoveRole__String() {
		return eContentNodeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IsReftext() {
		return eContentNodeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__GetReftext() {
		return eContentNodeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__IconUri__String() {
		return eContentNodeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__MediaUri__String() {
		return eContentNodeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__ImageUri__String() {
		return eContentNodeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__ImageUri__String_String() {
		return eContentNodeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__ReadAsset__String_ObjectObjectMap() {
		return eContentNodeEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEContentNode__NormalizeWebPath__String_String_boolean() {
		return eContentNodeEClass.getEOperations().get(35);
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

		documentHeaderEClass = createEClass(DOCUMENT_HEADER);

		cursorEClass = createEClass(CURSOR);

		revisionInfoEClass = createEClass(REVISION_INFO);

		structuredDocumentEClass = createEClass(STRUCTURED_DOCUMENT);

		contentNodeEClass = createEClass(CONTENT_NODE);

		contentPartEClass = createEClass(CONTENT_PART);

		documentEClass = createEClass(DOCUMENT);

		titleEClass = createEClass(TITLE);

		stringObjectMapEClass = createEClass(STRING_OBJECT_MAP);

		objectObjectMapEClass = createEClass(OBJECT_OBJECT_MAP);

		stringListEClass = createEClass(STRING_LIST);

		contentPartListEClass = createEClass(CONTENT_PART_LIST);

		eAuthorEClass = createEClass(EAUTHOR);
		createEAttribute(eAuthorEClass, EAUTHOR__EMAIL);
		createEAttribute(eAuthorEClass, EAUTHOR__FULL_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__FIRST_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__LAST_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__MIDDLE_NAME);
		createEAttribute(eAuthorEClass, EAUTHOR__INITIALS);

		eCursorEClass = createEClass(ECURSOR);
		createEAttribute(eCursorEClass, ECURSOR__LINE_NUMBER);
		createEAttribute(eCursorEClass, ECURSOR__PATH);
		createEAttribute(eCursorEClass, ECURSOR__DIR);
		createEAttribute(eCursorEClass, ECURSOR__FILE);

		eTitleEClass = createEClass(ETITLE);
		createEAttribute(eTitleEClass, ETITLE__MAIN);
		createEAttribute(eTitleEClass, ETITLE__SUBTITLE);
		createEAttribute(eTitleEClass, ETITLE__COMBINED);
		createEAttribute(eTitleEClass, ETITLE__SANITIZED);

		eRevisionInfoEClass = createEClass(EREVISION_INFO);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__DATE);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__NUMBER);
		createEAttribute(eRevisionInfoEClass, EREVISION_INFO__REMARK);

		eContentPartEClass = createEClass(ECONTENT_PART);
		createEAttribute(eContentPartEClass, ECONTENT_PART__ID);
		createEAttribute(eContentPartEClass, ECONTENT_PART__LEVEL);
		createEAttribute(eContentPartEClass, ECONTENT_PART__CONTEXT);
		createEAttribute(eContentPartEClass, ECONTENT_PART__STYLE);
		createEAttribute(eContentPartEClass, ECONTENT_PART__ROLE);
		createEAttribute(eContentPartEClass, ECONTENT_PART__TITLE);
		createEReference(eContentPartEClass, ECONTENT_PART__ATTRIBUTES);
		createEReference(eContentPartEClass, ECONTENT_PART__PARTS);
		createEReference(eContentPartEClass, ECONTENT_PART__PARENT_PART);
		createEOperation(eContentPartEClass, ECONTENT_PART___GET_CONTENT);

		eStructuredDocumentEClass = createEClass(ESTRUCTURED_DOCUMENT);
		createEReference(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT__PARTS);
		createEReference(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT__HEADER);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PART_BY_ID__STRING);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PART_BY_STYLE__STRING);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PART_BY_ROLE__STRING);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PARTS_BY_CONTEXT__STRING);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PARTS_BY_STYLE__STRING);
		createEOperation(eStructuredDocumentEClass, ESTRUCTURED_DOCUMENT___GET_PARTS_BY_ROLE__STRING);

		eContentNodeEClass = createEClass(ECONTENT_NODE);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__ID);
		createEReference(eContentNodeEClass, ECONTENT_NODE__PARENT);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__CONTEXT);
		createEReference(eContentNodeEClass, ECONTENT_NODE__DOCUMENT);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__INLINE);
		createEAttribute(eContentNodeEClass, ECONTENT_NODE__BLOCK);
		createEReference(eContentNodeEClass, ECONTENT_NODE__ATTRIBUTES);
		createEReference(eContentNodeEClass, ECONTENT_NODE__ROLES);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___ID);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_NODE_NAME);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___PARENT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___CONTEXT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___DOCUMENT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTR__OBJECT_OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTR__OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTRIBUTE__OBJECT_OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ATTRIBUTE__OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___HAS_ATTR__OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___HAS_ATTR__OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___HAS_ATTRIBUTE__OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_ATTR__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___SET_ATTR__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___SET_ATTRIBUTE__OBJECT_OBJECT_BOOLEAN);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_OPTION__OBJECT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_ROLE);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___HAS_ROLE__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_ROLE);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___ROLE);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___ADD_ROLE__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___REMOVE_ROLE__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IS_REFTEXT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___GET_REFTEXT);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___ICON_URI__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___MEDIA_URI__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IMAGE_URI__STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___IMAGE_URI__STRING_STRING);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___READ_ASSET__STRING_OBJECT_OBJECT_MAP);
		createEOperation(eContentNodeEClass, ECONTENT_NODE___NORMALIZE_WEB_PATH__STRING_STRING_BOOLEAN);
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
		eCursorEClass.getESuperTypes().add(this.getCursor());
		eTitleEClass.getESuperTypes().add(this.getTitle());
		eRevisionInfoEClass.getESuperTypes().add(this.getRevisionInfo());
		eContentPartEClass.getESuperTypes().add(this.getContentPart());
		eStructuredDocumentEClass.getESuperTypes().add(this.getStructuredDocument());
		eContentNodeEClass.getESuperTypes().add(this.getContentNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentHeaderEClass, DocumentHeader.class, "DocumentHeader", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(cursorEClass, Cursor.class, "Cursor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(revisionInfoEClass, RevisionInfo.class, "RevisionInfo", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredDocumentEClass, StructuredDocument.class, "StructuredDocument", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentNodeEClass, ContentNode.class, "ContentNode", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentPartEClass, ContentPart.class, "ContentPart", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(titleEClass, Title.class, "Title", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringObjectMapEClass, Map.class, "StringObjectMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, java.lang.Object>");

		initEClass(objectObjectMapEClass, Map.class, "ObjectObjectMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.Object, java.lang.Object>");

		initEClass(stringListEClass, List.class, "StringList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.String>");

		initEClass(contentPartListEClass, List.class, "ContentPartList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<org.asciidoctor.ast.ContentPart>");

		initEClass(eAuthorEClass, EAuthor.class, "EAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAuthor_Email(), theEcorePackage.getEString(), "email", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_FirstName(), theEcorePackage.getEString(), "firstName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_LastName(), theEcorePackage.getEString(), "lastName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_MiddleName(), theEcorePackage.getEString(), "middleName", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAuthor_Initials(), theEcorePackage.getEString(), "initials", null, 0, 1, EAuthor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCursorEClass, ECursor.class, "ECursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECursor_LineNumber(), theEcorePackage.getEInt(), "lineNumber", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_Dir(), theEcorePackage.getEString(), "dir", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECursor_File(), theEcorePackage.getEString(), "file", null, 0, 1, ECursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTitleEClass, ETitle.class, "ETitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETitle_Main(), theEcorePackage.getEString(), "main", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Subtitle(), theEcorePackage.getEString(), "subtitle", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Combined(), theEcorePackage.getEString(), "combined", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETitle_Sanitized(), theEcorePackage.getEBoolean(), "sanitized", null, 0, 1, ETitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRevisionInfoEClass, ERevisionInfo.class, "ERevisionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getERevisionInfo_Date(), theEcorePackage.getEString(), "date", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERevisionInfo_Number(), theEcorePackage.getEString(), "number", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getERevisionInfo_Remark(), theEcorePackage.getEString(), "remark", null, 0, 1, ERevisionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eContentPartEClass, EContentPart.class, "EContentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEContentPart_Id(), theEcorePackage.getEString(), "id", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Context(), theEcorePackage.getEString(), "context", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Style(), theEcorePackage.getEString(), "style", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Role(), theEcorePackage.getEString(), "role", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentPart_Title(), theEcorePackage.getEString(), "title", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentPart_Attributes(), this.getStringObjectMap(), null, "attributes", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentPart_Parts(), this.getEContentPart(), this.getEContentPart_ParentPart(), "parts", null, 0, -1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentPart_ParentPart(), this.getEContentPart(), this.getEContentPart_Parts(), "parentPart", null, 0, 1, EContentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEContentPart__GetContent(), theEcorePackage.getEString(), "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eStructuredDocumentEClass, EStructuredDocument.class, "EStructuredDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuredDocument_Parts(), this.getEContentPart(), null, "parts", null, 0, -1, EStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuredDocument_Header(), this.getDocumentHeader(), null, "header", null, 0, 1, EStructuredDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEStructuredDocument__GetPartById__String(), this.getContentPart(), "getPartById", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "partId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuredDocument__GetPartByStyle__String(), this.getContentPart(), "getPartByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuredDocument__GetPartByRole__String(), this.getContentPart(), "getPartByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuredDocument__GetPartsByContext__String(), this.getContentPartList(), "getPartsByContext", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuredDocument__GetPartsByStyle__String(), this.getContentPartList(), "getPartsByStyle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "style", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuredDocument__GetPartsByRole__String(), this.getContentPartList(), "getPartsByRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eContentNodeEClass, EContentNode.class, "EContentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEContentNode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Parent(), this.getContentNode(), null, "parent", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Context(), theEcorePackage.getEString(), "context", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Document(), this.getDocument(), null, "document", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Inline(), theEcorePackage.getEBoolean(), "inline", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEContentNode_Block(), theEcorePackage.getEBoolean(), "block", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Attributes(), this.getStringObjectMap(), null, "attributes", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContentNode_Roles(), this.getStringList(), null, "roles", null, 0, 1, EContentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEContentNode__Id(), theEcorePackage.getEString(), "id", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__GetNodeName(), theEcorePackage.getEString(), "getNodeName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__Parent(), this.getContentNode(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__Context(), theEcorePackage.getEString(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__Document(), this.getDocument(), "document", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttr__Object_Object_boolean(), theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttr__Object_Object(), theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttr__Object(), theEcorePackage.getEJavaObject(), "getAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttribute__Object_Object_boolean(), theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttribute__Object_Object(), theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "defaultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__GetAttribute__Object(), theEcorePackage.getEJavaObject(), "getAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__HasAttr__Object(), theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__HasAttr__Object_boolean(), theEcorePackage.getEBoolean(), "hasAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__HasAttribute__Object(), theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__HasAttribute__Object_boolean(), theEcorePackage.getEBoolean(), "hasAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherited", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IsAttr__Object_Object(), theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IsAttr__Object_Object_boolean(), theEcorePackage.getEBoolean(), "isAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IsAttribute__Object_Object(), theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IsAttribute__Object_Object_boolean(), theEcorePackage.getEBoolean(), "isAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "expected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inherit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__SetAttr__Object_Object_boolean(), theEcorePackage.getEBoolean(), "setAttr", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__SetAttribute__Object_Object_boolean(), theEcorePackage.getEBoolean(), "setAttribute", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "overwrite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IsOption__Object(), theEcorePackage.getEBoolean(), "isOption", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__IsRole(), theEcorePackage.getEBoolean(), "isRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__HasRole__String(), theEcorePackage.getEBoolean(), "hasRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__GetRole(), theEcorePackage.getEString(), "getRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__Role(), theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__AddRole__String(), null, "addRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__RemoveRole__String(), null, "removeRole", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "role", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__IsReftext(), theEcorePackage.getEBoolean(), "isReftext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEContentNode__GetReftext(), theEcorePackage.getEString(), "getReftext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__IconUri__String(), theEcorePackage.getEString(), "iconUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__MediaUri__String(), theEcorePackage.getEString(), "mediaUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__ImageUri__String(), theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__ImageUri__String_String(), theEcorePackage.getEString(), "imageUri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "assetDirKey", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__ReadAsset__String_ObjectObjectMap(), theEcorePackage.getEString(), "readAsset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectObjectMap(), "opts", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEContentNode__NormalizeWebPath__String_String_boolean(), theEcorePackage.getEString(), "normalizeWebPath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "preserveUriTarget", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EadocPackageImpl
