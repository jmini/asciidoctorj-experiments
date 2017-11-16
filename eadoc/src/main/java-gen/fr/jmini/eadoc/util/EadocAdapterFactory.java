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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.jmini.eadoc.EadocPackage
 * @generated
 */
public class EadocAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EadocPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EadocAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EadocPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EadocSwitch<Adapter> modelSwitch =
		new EadocSwitch<Adapter>() {
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseDocumentHeader(DocumentHeader object) {
				return createDocumentHeaderAdapter();
			}
			@Override
			public Adapter caseCursor(Cursor object) {
				return createCursorAdapter();
			}
			@Override
			public Adapter caseRevisionInfo(RevisionInfo object) {
				return createRevisionInfoAdapter();
			}
			@Override
			public Adapter caseStructuredDocument(StructuredDocument object) {
				return createStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseContentNode(ContentNode object) {
				return createContentNodeAdapter();
			}
			@Override
			public Adapter caseContentPart(ContentPart object) {
				return createContentPartAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseStringObjectMap(Map<String, Object> object) {
				return createStringObjectMapAdapter();
			}
			@Override
			public Adapter caseObjectObjectMap(Map<Object, Object> object) {
				return createObjectObjectMapAdapter();
			}
			@Override
			public Adapter caseStringList(List<String> object) {
				return createStringListAdapter();
			}
			@Override
			public Adapter caseContentPartList(List<ContentPart> object) {
				return createContentPartListAdapter();
			}
			@Override
			public Adapter caseEAuthor(EAuthor object) {
				return createEAuthorAdapter();
			}
			@Override
			public Adapter caseECursor(ECursor object) {
				return createECursorAdapter();
			}
			@Override
			public Adapter caseETitle(ETitle object) {
				return createETitleAdapter();
			}
			@Override
			public Adapter caseERevisionInfo(ERevisionInfo object) {
				return createERevisionInfoAdapter();
			}
			@Override
			public Adapter caseEContentPart(EContentPart object) {
				return createEContentPartAdapter();
			}
			@Override
			public Adapter caseEStructuredDocument(EStructuredDocument object) {
				return createEStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseEContentNode(EContentNode object) {
				return createEContentNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.DocumentHeader <em>Document Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.DocumentHeader
	 * @generated
	 */
	public Adapter createDocumentHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Cursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Cursor
	 * @generated
	 */
	public Adapter createCursorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.RevisionInfo <em>Revision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.RevisionInfo
	 * @generated
	 */
	public Adapter createRevisionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.StructuredDocument <em>Structured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.StructuredDocument
	 * @generated
	 */
	public Adapter createStructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.ContentNode <em>Content Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.ContentNode
	 * @generated
	 */
	public Adapter createContentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.ContentPart <em>Content Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.ContentPart
	 * @generated
	 */
	public Adapter createContentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map<java.lang.String, java.lang.Object> <em>String Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map<java.lang.String, java.lang.Object>
	 * @generated
	 */
	public Adapter createStringObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map<java.lang.Object, java.lang.Object> <em>Object Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map<java.lang.Object, java.lang.Object>
	 * @generated
	 */
	public Adapter createObjectObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.List<java.lang.String> <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.List<java.lang.String>
	 * @generated
	 */
	public Adapter createStringListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.List<org.asciidoctor.ast.ContentPart> <em>Content Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.List<org.asciidoctor.ast.ContentPart>
	 * @generated
	 */
	public Adapter createContentPartListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EAuthor <em>EAuthor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EAuthor
	 * @generated
	 */
	public Adapter createEAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ECursor <em>ECursor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ECursor
	 * @generated
	 */
	public Adapter createECursorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ETitle <em>ETitle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ETitle
	 * @generated
	 */
	public Adapter createETitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ERevisionInfo <em>ERevision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ERevisionInfo
	 * @generated
	 */
	public Adapter createERevisionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EContentPart <em>EContent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EContentPart
	 * @generated
	 */
	public Adapter createEContentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EStructuredDocument <em>EStructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EStructuredDocument
	 * @generated
	 */
	public Adapter createEStructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EContentNode <em>EContent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EContentNode
	 * @generated
	 */
	public Adapter createEContentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EadocAdapterFactory
