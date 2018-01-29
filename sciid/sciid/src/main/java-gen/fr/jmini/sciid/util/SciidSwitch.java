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
 * @see fr.jmini.sciid.SciidPackage
 * @generated
 */
public class SciidSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SciidPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SciidSwitch() {
		if (modelPackage == null) {
			modelPackage = SciidPackage.eINSTANCE;
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
			case SciidPackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.CONTENT_NODE: {
				ContentNode contentNode = (ContentNode)theEObject;
				T result = caseContentNode(contentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.CONTENT_PART: {
				ContentPart contentPart = (ContentPart)theEObject;
				T result = caseContentPart(contentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.CURSOR: {
				Cursor cursor = (Cursor)theEObject;
				T result = caseCursor(cursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.DESCRIPTION_LIST: {
				DescriptionList descriptionList = (DescriptionList)theEObject;
				T result = caseDescriptionList(descriptionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.DESCRIPTION_LIST_ENTRY: {
				DescriptionListEntry descriptionListEntry = (DescriptionListEntry)theEObject;
				T result = caseDescriptionListEntry(descriptionListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.DOCUMENT_HEADER: {
				DocumentHeader documentHeader = (DocumentHeader)theEObject;
				T result = caseDocumentHeader(documentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.AST_LIST: {
				List astList = (List)theEObject;
				T result = caseAstList(astList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.PHRASE_NODE: {
				PhraseNode phraseNode = (PhraseNode)theEObject;
				T result = casePhraseNode(phraseNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.REVISION_INFO: {
				RevisionInfo revisionInfo = (RevisionInfo)theEObject;
				T result = caseRevisionInfo(revisionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.STRUCTURAL_NODE: {
				StructuralNode structuralNode = (StructuralNode)theEObject;
				T result = caseStructuralNode(structuralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.STRUCTURED_DOCUMENT: {
				StructuredDocument structuredDocument = (StructuredDocument)theEObject;
				T result = caseStructuredDocument(structuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SAUTHOR: {
				SAuthor sAuthor = (SAuthor)theEObject;
				T result = caseSAuthor(sAuthor);
				if (result == null) result = caseAuthor(sAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SBLOCK: {
				SBlock sBlock = (SBlock)theEObject;
				T result = caseSBlock(sBlock);
				if (result == null) result = caseSStructuralNode(sBlock);
				if (result == null) result = caseBlock(sBlock);
				if (result == null) result = caseSContentNode(sBlock);
				if (result == null) result = caseStructuralNode(sBlock);
				if (result == null) result = caseContentNode(sBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SCELL: {
				SCell sCell = (SCell)theEObject;
				T result = caseSCell(sCell);
				if (result == null) result = caseSContentNode(sCell);
				if (result == null) result = caseCell(sCell);
				if (result == null) result = caseContentNode(sCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SCOLUMN: {
				SColumn sColumn = (SColumn)theEObject;
				T result = caseSColumn(sColumn);
				if (result == null) result = caseSContentNode(sColumn);
				if (result == null) result = caseColumn(sColumn);
				if (result == null) result = caseContentNode(sColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SCONTENT_NODE: {
				SContentNode sContentNode = (SContentNode)theEObject;
				T result = caseSContentNode(sContentNode);
				if (result == null) result = caseContentNode(sContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SCONTENT_PART: {
				SContentPart sContentPart = (SContentPart)theEObject;
				T result = caseSContentPart(sContentPart);
				if (result == null) result = caseContentPart(sContentPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SCURSOR: {
				SCursor sCursor = (SCursor)theEObject;
				T result = caseSCursor(sCursor);
				if (result == null) result = caseCursor(sCursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SDESCRIPTION_LIST: {
				SDescriptionList sDescriptionList = (SDescriptionList)theEObject;
				T result = caseSDescriptionList(sDescriptionList);
				if (result == null) result = caseSStructuralNode(sDescriptionList);
				if (result == null) result = caseDescriptionList(sDescriptionList);
				if (result == null) result = caseSContentNode(sDescriptionList);
				if (result == null) result = caseStructuralNode(sDescriptionList);
				if (result == null) result = caseContentNode(sDescriptionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SDESCRIPTION_LIST_ENTRY: {
				SDescriptionListEntry sDescriptionListEntry = (SDescriptionListEntry)theEObject;
				T result = caseSDescriptionListEntry(sDescriptionListEntry);
				if (result == null) result = caseDescriptionListEntry(sDescriptionListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SDOCUMENT: {
				SDocument sDocument = (SDocument)theEObject;
				T result = caseSDocument(sDocument);
				if (result == null) result = caseSStructuralNode(sDocument);
				if (result == null) result = caseDocument(sDocument);
				if (result == null) result = caseSContentNode(sDocument);
				if (result == null) result = caseStructuralNode(sDocument);
				if (result == null) result = caseContentNode(sDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SDOCUMENT_HEADER: {
				SDocumentHeader sDocumentHeader = (SDocumentHeader)theEObject;
				T result = caseSDocumentHeader(sDocumentHeader);
				if (result == null) result = caseDocumentHeader(sDocumentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SLIST: {
				SList sList = (SList)theEObject;
				T result = caseSList(sList);
				if (result == null) result = caseSStructuralNode(sList);
				if (result == null) result = caseAstList(sList);
				if (result == null) result = caseSContentNode(sList);
				if (result == null) result = caseStructuralNode(sList);
				if (result == null) result = caseContentNode(sList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SLIST_ITEM: {
				SListItem sListItem = (SListItem)theEObject;
				T result = caseSListItem(sListItem);
				if (result == null) result = caseSStructuralNode(sListItem);
				if (result == null) result = caseListItem(sListItem);
				if (result == null) result = caseSContentNode(sListItem);
				if (result == null) result = caseStructuralNode(sListItem);
				if (result == null) result = caseContentNode(sListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SPHRASE_NODE: {
				SPhraseNode sPhraseNode = (SPhraseNode)theEObject;
				T result = caseSPhraseNode(sPhraseNode);
				if (result == null) result = caseSContentNode(sPhraseNode);
				if (result == null) result = casePhraseNode(sPhraseNode);
				if (result == null) result = caseContentNode(sPhraseNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SREVISION_INFO: {
				SRevisionInfo sRevisionInfo = (SRevisionInfo)theEObject;
				T result = caseSRevisionInfo(sRevisionInfo);
				if (result == null) result = caseRevisionInfo(sRevisionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SROW: {
				SRow sRow = (SRow)theEObject;
				T result = caseSRow(sRow);
				if (result == null) result = caseRow(sRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SSECTION: {
				SSection sSection = (SSection)theEObject;
				T result = caseSSection(sSection);
				if (result == null) result = caseSStructuralNode(sSection);
				if (result == null) result = caseSection(sSection);
				if (result == null) result = caseSContentNode(sSection);
				if (result == null) result = caseStructuralNode(sSection);
				if (result == null) result = caseContentNode(sSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SSTRUCTURAL_NODE: {
				SStructuralNode sStructuralNode = (SStructuralNode)theEObject;
				T result = caseSStructuralNode(sStructuralNode);
				if (result == null) result = caseSContentNode(sStructuralNode);
				if (result == null) result = caseStructuralNode(sStructuralNode);
				if (result == null) result = caseContentNode(sStructuralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.SSTRUCTURED_DOCUMENT: {
				SStructuredDocument sStructuredDocument = (SStructuredDocument)theEObject;
				T result = caseSStructuredDocument(sStructuredDocument);
				if (result == null) result = caseStructuredDocument(sStructuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.STABLE: {
				STable sTable = (STable)theEObject;
				T result = caseSTable(sTable);
				if (result == null) result = caseSStructuralNode(sTable);
				if (result == null) result = caseTable(sTable);
				if (result == null) result = caseSContentNode(sTable);
				if (result == null) result = caseStructuralNode(sTable);
				if (result == null) result = caseContentNode(sTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SciidPackage.STITLE: {
				STitle sTitle = (STitle)theEObject;
				T result = caseSTitle(sTitle);
				if (result == null) result = caseTitle(sTitle);
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
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Description List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionList(DescriptionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionListEntry(DescriptionListEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ast List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ast List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAstList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phrase Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phrase Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhraseNode(PhraseNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralNode(StructuralNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SAuthor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAuthor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAuthor(SAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SBlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SBlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSBlock(SBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCell(SCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SColumn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SColumn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSColumn(SColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContent Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContent Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSContentNode(SContentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContent Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContent Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSContentPart(SContentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCursor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCursor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCursor(SCursor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDescription List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDescription List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDescriptionList(SDescriptionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDescription List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDescription List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDescriptionListEntry(SDescriptionListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDocument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDocument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDocument(SDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDocument Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDocument Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDocumentHeader(SDocumentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSList(SList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SList Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SList Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSListItem(SListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPhrase Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPhrase Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPhraseNode(SPhraseNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRevision Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRevision Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRevisionInfo(SRevisionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRow(SRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSection(SSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStructural Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStructural Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStructuralNode(SStructuralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStructuredDocument(SStructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTable(STable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STitle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STitle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTitle(STitle object) {
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

} //SciidSwitch
