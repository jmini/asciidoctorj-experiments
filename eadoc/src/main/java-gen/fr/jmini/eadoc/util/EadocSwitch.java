/**
 */
package fr.jmini.eadoc.util;

import fr.jmini.eadoc.*;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.jmini.eadoc.EadocPackage
 * @generated
 */
public class EadocSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EadocPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EadocSwitch() {
		if (modelPackage == null) {
			modelPackage = EadocPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EadocPackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DOCUMENT_HEADER: {
				DocumentHeader documentHeader = (DocumentHeader)theEObject;
				T result = caseDocumentHeader(documentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.CURSOR: {
				Cursor cursor = (Cursor)theEObject;
				T result = caseCursor(cursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.REVISION_INFO: {
				RevisionInfo revisionInfo = (RevisionInfo)theEObject;
				T result = caseRevisionInfo(revisionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.STRUCTURED_DOCUMENT: {
				StructuredDocument structuredDocument = (StructuredDocument)theEObject;
				T result = caseStructuredDocument(structuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.CONTENT_NODE: {
				ContentNode contentNode = (ContentNode)theEObject;
				T result = caseContentNode(contentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.CONTENT_PART: {
				ContentPart contentPart = (ContentPart)theEObject;
				T result = caseContentPart(contentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.STRING_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map<String, Object> stringObjectMap = (Map<String, Object>)theEObject;
				T result = caseStringObjectMap(stringObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.OBJECT_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map<Object, Object> objectObjectMap = (Map<Object, Object>)theEObject;
				T result = caseObjectObjectMap(objectObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.STRING_LIST: {
				@SuppressWarnings("unchecked") List<String> stringList = (List<String>)theEObject;
				T result = caseStringList(stringList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.CONTENT_PART_LIST: {
				@SuppressWarnings("unchecked") List<ContentPart> contentPartList = (List<ContentPart>)theEObject;
				T result = caseContentPartList(contentPartList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EAUTHOR: {
				EAuthor eAuthor = (EAuthor)theEObject;
				T result = caseEAuthor(eAuthor);
				if (result == null) result = caseAuthor(eAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ECURSOR: {
				ECursor eCursor = (ECursor)theEObject;
				T result = caseECursor(eCursor);
				if (result == null) result = caseCursor(eCursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ETITLE: {
				ETitle eTitle = (ETitle)theEObject;
				T result = caseETitle(eTitle);
				if (result == null) result = caseTitle(eTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EREVISION_INFO: {
				ERevisionInfo eRevisionInfo = (ERevisionInfo)theEObject;
				T result = caseERevisionInfo(eRevisionInfo);
				if (result == null) result = caseRevisionInfo(eRevisionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ECONTENT_PART: {
				EContentPart eContentPart = (EContentPart)theEObject;
				T result = caseEContentPart(eContentPart);
				if (result == null) result = caseContentPart(eContentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ESTRUCTURED_DOCUMENT: {
				EStructuredDocument eStructuredDocument = (EStructuredDocument)theEObject;
				T result = caseEStructuredDocument(eStructuredDocument);
				if (result == null) result = caseStructuredDocument(eStructuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ECONTENT_NODE: {
				EContentNode eContentNode = (EContentNode)theEObject;
				T result = caseEContentNode(eContentNode);
				if (result == null) result = caseContentNode(eContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentHeader(DocumentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cursor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cursor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCursor(Cursor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevisionInfo(RevisionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDocument(StructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentNode(ContentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentPart(ContentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringObjectMap(Map<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectObjectMap(Map<Object, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringList(List<String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Part List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Part List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentPartList(List<ContentPart> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAuthor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAuthor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAuthor(EAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECursor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECursor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECursor(ECursor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETitle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETitle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETitle(ETitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERevision Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERevision Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERevisionInfo(ERevisionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EContent Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EContent Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEContentPart(EContentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuredDocument(EStructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EContent Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EContent Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEContentNode(EContentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EadocSwitch
