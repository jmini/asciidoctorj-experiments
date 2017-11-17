/**
 */
package fr.jmini.eadoc.util;

import fr.jmini.eadoc.*;

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
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
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
			public Adapter caseCursor(Cursor object) {
				return createCursorAdapter();
			}
			@Override
			public Adapter caseDescriptionList(DescriptionList object) {
				return createDescriptionListAdapter();
			}
			@Override
			public Adapter caseDescriptionListEntry(DescriptionListEntry object) {
				return createDescriptionListEntryAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseDocumentHeader(DocumentHeader object) {
				return createDocumentHeaderAdapter();
			}
			@Override
			public Adapter caseAstList(List object) {
				return createAstListAdapter();
			}
			@Override
			public Adapter caseListItem(ListItem object) {
				return createListItemAdapter();
			}
			@Override
			public Adapter casePhraseNode(PhraseNode object) {
				return createPhraseNodeAdapter();
			}
			@Override
			public Adapter caseRevisionInfo(RevisionInfo object) {
				return createRevisionInfoAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseStructuralNode(StructuralNode object) {
				return createStructuralNodeAdapter();
			}
			@Override
			public Adapter caseStructuredDocument(StructuredDocument object) {
				return createStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseEadocUtility(EadocUtility object) {
				return createEadocUtilityAdapter();
			}
			@Override
			public Adapter caseEAuthor(EAuthor object) {
				return createEAuthorAdapter();
			}
			@Override
			public Adapter caseEBlock(EBlock object) {
				return createEBlockAdapter();
			}
			@Override
			public Adapter caseECell(ECell object) {
				return createECellAdapter();
			}
			@Override
			public Adapter caseEColumn(EColumn object) {
				return createEColumnAdapter();
			}
			@Override
			public Adapter caseEContentNode(EContentNode object) {
				return createEContentNodeAdapter();
			}
			@Override
			public Adapter caseEContentPart(EContentPart object) {
				return createEContentPartAdapter();
			}
			@Override
			public Adapter caseECursor(ECursor object) {
				return createECursorAdapter();
			}
			@Override
			public Adapter caseEDescriptionList(EDescriptionList object) {
				return createEDescriptionListAdapter();
			}
			@Override
			public Adapter caseEDescriptionListEntry(EDescriptionListEntry object) {
				return createEDescriptionListEntryAdapter();
			}
			@Override
			public Adapter caseEDocument(EDocument object) {
				return createEDocumentAdapter();
			}
			@Override
			public Adapter caseEDocumentHeader(EDocumentHeader object) {
				return createEDocumentHeaderAdapter();
			}
			@Override
			public Adapter caseEAdocList(EAdocList object) {
				return createEAdocListAdapter();
			}
			@Override
			public Adapter caseEListItem(EListItem object) {
				return createEListItemAdapter();
			}
			@Override
			public Adapter caseEPhraseNode(EPhraseNode object) {
				return createEPhraseNodeAdapter();
			}
			@Override
			public Adapter caseERevisionInfo(ERevisionInfo object) {
				return createERevisionInfoAdapter();
			}
			@Override
			public Adapter caseERow(ERow object) {
				return createERowAdapter();
			}
			@Override
			public Adapter caseESection(ESection object) {
				return createESectionAdapter();
			}
			@Override
			public Adapter caseEStructuralNode(EStructuralNode object) {
				return createEStructuralNodeAdapter();
			}
			@Override
			public Adapter caseEStructuredDocument(EStructuredDocument object) {
				return createEStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseETable(ETable object) {
				return createETableAdapter();
			}
			@Override
			public Adapter caseETitle(ETitle object) {
				return createETitleAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.DescriptionList <em>Description List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.DescriptionList
	 * @generated
	 */
	public Adapter createDescriptionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.DescriptionListEntry <em>Description List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.DescriptionListEntry
	 * @generated
	 */
	public Adapter createDescriptionListEntryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.List <em>Ast List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.List
	 * @generated
	 */
	public Adapter createAstListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.PhraseNode <em>Phrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.PhraseNode
	 * @generated
	 */
	public Adapter createPhraseNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.StructuralNode <em>Structural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.StructuralNode
	 * @generated
	 */
	public Adapter createStructuralNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.asciidoctor.ast.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.asciidoctor.ast.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EadocUtility <em>Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EadocUtility
	 * @generated
	 */
	public Adapter createEadocUtilityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EBlock <em>EBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EBlock
	 * @generated
	 */
	public Adapter createEBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ECell <em>ECell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ECell
	 * @generated
	 */
	public Adapter createECellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EColumn <em>EColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EColumn
	 * @generated
	 */
	public Adapter createEColumnAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EDescriptionList <em>EDescription List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EDescriptionList
	 * @generated
	 */
	public Adapter createEDescriptionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EDescriptionListEntry <em>EDescription List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EDescriptionListEntry
	 * @generated
	 */
	public Adapter createEDescriptionListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EDocument <em>EDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EDocument
	 * @generated
	 */
	public Adapter createEDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EDocumentHeader <em>EDocument Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EDocumentHeader
	 * @generated
	 */
	public Adapter createEDocumentHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EAdocList <em>EAdoc List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EAdocList
	 * @generated
	 */
	public Adapter createEAdocListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EListItem <em>EList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EListItem
	 * @generated
	 */
	public Adapter createEListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EPhraseNode <em>EPhrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EPhraseNode
	 * @generated
	 */
	public Adapter createEPhraseNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ERow <em>ERow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ERow
	 * @generated
	 */
	public Adapter createERowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ESection <em>ESection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ESection
	 * @generated
	 */
	public Adapter createESectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.EStructuralNode <em>EStructural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.EStructuralNode
	 * @generated
	 */
	public Adapter createEStructuralNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.eadoc.ETable <em>ETable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.eadoc.ETable
	 * @generated
	 */
	public Adapter createETableAdapter() {
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
