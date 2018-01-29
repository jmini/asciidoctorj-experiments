/**
 */
package fr.jmini.sciid.util;

import fr.jmini.sciid.*;

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
 * @see fr.jmini.sciid.SciidPackage
 * @generated
 */
public class SciidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SciidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SciidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SciidPackage.eINSTANCE;
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
	protected SciidSwitch<Adapter> modelSwitch =
		new SciidSwitch<Adapter>() {
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
			public Adapter caseSAuthor(SAuthor object) {
				return createSAuthorAdapter();
			}
			@Override
			public Adapter caseSBlock(SBlock object) {
				return createSBlockAdapter();
			}
			@Override
			public Adapter caseSCell(SCell object) {
				return createSCellAdapter();
			}
			@Override
			public Adapter caseSColumn(SColumn object) {
				return createSColumnAdapter();
			}
			@Override
			public Adapter caseSContentNode(SContentNode object) {
				return createSContentNodeAdapter();
			}
			@Override
			public Adapter caseSContentPart(SContentPart object) {
				return createSContentPartAdapter();
			}
			@Override
			public Adapter caseSCursor(SCursor object) {
				return createSCursorAdapter();
			}
			@Override
			public Adapter caseSDescriptionList(SDescriptionList object) {
				return createSDescriptionListAdapter();
			}
			@Override
			public Adapter caseSDescriptionListEntry(SDescriptionListEntry object) {
				return createSDescriptionListEntryAdapter();
			}
			@Override
			public Adapter caseSDocument(SDocument object) {
				return createSDocumentAdapter();
			}
			@Override
			public Adapter caseSDocumentHeader(SDocumentHeader object) {
				return createSDocumentHeaderAdapter();
			}
			@Override
			public Adapter caseSList(SList object) {
				return createSListAdapter();
			}
			@Override
			public Adapter caseSListItem(SListItem object) {
				return createSListItemAdapter();
			}
			@Override
			public Adapter caseSPhraseNode(SPhraseNode object) {
				return createSPhraseNodeAdapter();
			}
			@Override
			public Adapter caseSRevisionInfo(SRevisionInfo object) {
				return createSRevisionInfoAdapter();
			}
			@Override
			public Adapter caseSRow(SRow object) {
				return createSRowAdapter();
			}
			@Override
			public Adapter caseSSection(SSection object) {
				return createSSectionAdapter();
			}
			@Override
			public Adapter caseSStructuralNode(SStructuralNode object) {
				return createSStructuralNodeAdapter();
			}
			@Override
			public Adapter caseSStructuredDocument(SStructuredDocument object) {
				return createSStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseSTable(STable object) {
				return createSTableAdapter();
			}
			@Override
			public Adapter caseSTitle(STitle object) {
				return createSTitleAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SAuthor <em>SAuthor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SAuthor
	 * @generated
	 */
	public Adapter createSAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SBlock <em>SBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SBlock
	 * @generated
	 */
	public Adapter createSBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SCell <em>SCell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SCell
	 * @generated
	 */
	public Adapter createSCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SColumn <em>SColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SColumn
	 * @generated
	 */
	public Adapter createSColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SContentNode <em>SContent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SContentNode
	 * @generated
	 */
	public Adapter createSContentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SContentPart <em>SContent Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SContentPart
	 * @generated
	 */
	public Adapter createSContentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SCursor <em>SCursor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SCursor
	 * @generated
	 */
	public Adapter createSCursorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SDescriptionList <em>SDescription List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SDescriptionList
	 * @generated
	 */
	public Adapter createSDescriptionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SDescriptionListEntry <em>SDescription List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SDescriptionListEntry
	 * @generated
	 */
	public Adapter createSDescriptionListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SDocument <em>SDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SDocument
	 * @generated
	 */
	public Adapter createSDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SDocumentHeader <em>SDocument Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SDocumentHeader
	 * @generated
	 */
	public Adapter createSDocumentHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SList <em>SList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SList
	 * @generated
	 */
	public Adapter createSListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SListItem <em>SList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SListItem
	 * @generated
	 */
	public Adapter createSListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SPhraseNode <em>SPhrase Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SPhraseNode
	 * @generated
	 */
	public Adapter createSPhraseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SRevisionInfo <em>SRevision Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SRevisionInfo
	 * @generated
	 */
	public Adapter createSRevisionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SRow <em>SRow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SRow
	 * @generated
	 */
	public Adapter createSRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SSection <em>SSection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SSection
	 * @generated
	 */
	public Adapter createSSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SStructuralNode <em>SStructural Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SStructuralNode
	 * @generated
	 */
	public Adapter createSStructuralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.SStructuredDocument <em>SStructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.SStructuredDocument
	 * @generated
	 */
	public Adapter createSStructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.STable <em>STable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.STable
	 * @generated
	 */
	public Adapter createSTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.jmini.sciid.STitle <em>STitle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.jmini.sciid.STitle
	 * @generated
	 */
	public Adapter createSTitleAdapter() {
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

} //SciidAdapterFactory
