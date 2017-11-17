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
			case EadocPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
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
			case EadocPackage.CURSOR: {
				Cursor cursor = (Cursor)theEObject;
				T result = caseCursor(cursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DESCRIPTION_LIST: {
				DescriptionList descriptionList = (DescriptionList)theEObject;
				T result = caseDescriptionList(descriptionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DESCRIPTION_LIST_ENTRY: {
				DescriptionListEntry descriptionListEntry = (DescriptionListEntry)theEObject;
				T result = caseDescriptionListEntry(descriptionListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.DOCUMENT_HEADER: {
				DocumentHeader documentHeader = (DocumentHeader)theEObject;
				T result = caseDocumentHeader(documentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.AST_LIST: {
				List astList = (List)theEObject;
				T result = caseAstList(astList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.PHRASE_NODE: {
				PhraseNode phraseNode = (PhraseNode)theEObject;
				T result = casePhraseNode(phraseNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.REVISION_INFO: {
				RevisionInfo revisionInfo = (RevisionInfo)theEObject;
				T result = caseRevisionInfo(revisionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.STRUCTURAL_NODE: {
				StructuralNode structuralNode = (StructuralNode)theEObject;
				T result = caseStructuralNode(structuralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.STRUCTURED_DOCUMENT: {
				StructuredDocument structuredDocument = (StructuredDocument)theEObject;
				T result = caseStructuredDocument(structuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EADOC_UTILITY: {
				EadocUtility eadocUtility = (EadocUtility)theEObject;
				T result = caseEadocUtility(eadocUtility);
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
			case EadocPackage.EBLOCK: {
				EBlock eBlock = (EBlock)theEObject;
				T result = caseEBlock(eBlock);
				if (result == null) result = caseEStructuralNode(eBlock);
				if (result == null) result = caseEContentNode(eBlock);
				if (result == null) result = caseStructuralNode(eBlock);
				if (result == null) result = caseContentNode(eBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ECELL: {
				ECell eCell = (ECell)theEObject;
				T result = caseECell(eCell);
				if (result == null) result = caseEContentNode(eCell);
				if (result == null) result = caseContentNode(eCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ECOLUMN: {
				EColumn eColumn = (EColumn)theEObject;
				T result = caseEColumn(eColumn);
				if (result == null) result = caseEContentNode(eColumn);
				if (result == null) result = caseColumn(eColumn);
				if (result == null) result = caseContentNode(eColumn);
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
			case EadocPackage.ECONTENT_PART: {
				EContentPart eContentPart = (EContentPart)theEObject;
				T result = caseEContentPart(eContentPart);
				if (result == null) result = caseContentPart(eContentPart);
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
			case EadocPackage.EDESCRIPTION_LIST: {
				EDescriptionList eDescriptionList = (EDescriptionList)theEObject;
				T result = caseEDescriptionList(eDescriptionList);
				if (result == null) result = caseEStructuralNode(eDescriptionList);
				if (result == null) result = caseEContentNode(eDescriptionList);
				if (result == null) result = caseStructuralNode(eDescriptionList);
				if (result == null) result = caseContentNode(eDescriptionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EDESCRIPTION_LIST_ENTRY: {
				EDescriptionListEntry eDescriptionListEntry = (EDescriptionListEntry)theEObject;
				T result = caseEDescriptionListEntry(eDescriptionListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EDOCUMENT: {
				EDocument eDocument = (EDocument)theEObject;
				T result = caseEDocument(eDocument);
				if (result == null) result = caseEStructuralNode(eDocument);
				if (result == null) result = caseEContentNode(eDocument);
				if (result == null) result = caseStructuralNode(eDocument);
				if (result == null) result = caseContentNode(eDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EDOCUMENT_HEADER: {
				EDocumentHeader eDocumentHeader = (EDocumentHeader)theEObject;
				T result = caseEDocumentHeader(eDocumentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EADOC_LIST: {
				EAdocList eAdocList = (EAdocList)theEObject;
				T result = caseEAdocList(eAdocList);
				if (result == null) result = caseEStructuralNode(eAdocList);
				if (result == null) result = caseEContentNode(eAdocList);
				if (result == null) result = caseStructuralNode(eAdocList);
				if (result == null) result = caseContentNode(eAdocList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ELIST_ITEM: {
				EListItem eListItem = (EListItem)theEObject;
				T result = caseEListItem(eListItem);
				if (result == null) result = caseEStructuralNode(eListItem);
				if (result == null) result = caseEContentNode(eListItem);
				if (result == null) result = caseStructuralNode(eListItem);
				if (result == null) result = caseContentNode(eListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.EPHRASE_NODE: {
				EPhraseNode ePhraseNode = (EPhraseNode)theEObject;
				T result = caseEPhraseNode(ePhraseNode);
				if (result == null) result = caseEContentNode(ePhraseNode);
				if (result == null) result = casePhraseNode(ePhraseNode);
				if (result == null) result = caseContentNode(ePhraseNode);
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
			case EadocPackage.EROW: {
				ERow eRow = (ERow)theEObject;
				T result = caseERow(eRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ESECTION: {
				ESection eSection = (ESection)theEObject;
				T result = caseESection(eSection);
				if (result == null) result = caseEStructuralNode(eSection);
				if (result == null) result = caseEContentNode(eSection);
				if (result == null) result = caseStructuralNode(eSection);
				if (result == null) result = caseContentNode(eSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EadocPackage.ESTRUCTURAL_NODE: {
				EStructuralNode eStructuralNode = (EStructuralNode)theEObject;
				T result = caseEStructuralNode(eStructuralNode);
				if (result == null) result = caseEContentNode(eStructuralNode);
				if (result == null) result = caseStructuralNode(eStructuralNode);
				if (result == null) result = caseContentNode(eStructuralNode);
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
			case EadocPackage.ETABLE: {
				ETable eTable = (ETable)theEObject;
				T result = caseETable(eTable);
				if (result == null) result = caseEStructuralNode(eTable);
				if (result == null) result = caseTable(eTable);
				if (result == null) result = caseEContentNode(eTable);
				if (result == null) result = caseStructuralNode(eTable);
				if (result == null) result = caseContentNode(eTable);
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
	 * Returns the result of interpreting the object as an instance of '<em>Utility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEadocUtility(EadocUtility object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EBlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBlock(EBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECell(ECell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EColumn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EColumn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEColumn(EColumn object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EDescription List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDescription List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDescriptionList(EDescriptionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDescription List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDescription List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDescriptionListEntry(EDescriptionListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDocument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDocument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDocument(EDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDocument Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDocument Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDocumentHeader(EDocumentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAdoc List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAdoc List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAdocList(EAdocList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EList Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EList Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEListItem(EListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPhrase Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPhrase Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPhraseNode(EPhraseNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ERow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERow(ERow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESection(ESection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralNode(EStructuralNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ETable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETable(ETable object) {
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
