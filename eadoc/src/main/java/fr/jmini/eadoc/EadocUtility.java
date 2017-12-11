package fr.jmini.eadoc;

import java.util.List;
import java.util.stream.Collectors;

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
import org.asciidoctor.ast.ListItem;
import org.asciidoctor.ast.PhraseNode;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Table;
import org.asciidoctor.ast.Title;
import org.eclipse.emf.common.util.EList;

public class EadocUtility {

    public static EAuthor convertAuthor(Author author) {
        EAuthor eAuthor = EadocFactory.eINSTANCE.createEAuthor();
        eAuthor.setEmail(author.getEmail());
        eAuthor.setFullName(author.getFullName());
        eAuthor.setFirstName(author.getFirstName());
        eAuthor.setLastName(author.getLastName());
        eAuthor.setMiddleName(author.getMiddleName());
        eAuthor.setInitials(author.getInitials());
        return eAuthor;
    }

    public static EBlock convertBlock(Block block) {
        EBlock eBlock = EadocFactory.eINSTANCE.createEBlock();
        mapStructuralNodeFields(eBlock, block);
        eBlock.setLines(block.getLines());
        eBlock.setSource(block.getSource());
        return eBlock;
    }

    public static ECell convertCell(Cell cell) {
        ECell eCell = EadocFactory.eINSTANCE.createECell();
        eCell.setColumn(convertColumn(cell.getColumn()));
        eCell.setColspan(cell.getColspan());
        eCell.setRowspan(cell.getRowspan());
        // eCell.set(cell.getText());
        eCell.setSource(cell.getSource());
        eCell.setStyle(cell.getStyle());
        eCell.setHorizontalAlignment(cell.getHorizontalAlignment());
        eCell.setVerticalAlignment(cell.getVerticalAlignment());
        eCell.setInnerDocument(cell.getInnerDocument());
        return eCell;
    }

    public static EColumn convertColumn(Column column) {
        EColumn eColumn = EadocFactory.eINSTANCE.createEColumn();
        eColumn.setStyle(column.getStyle());
        eColumn.setTable(convertTable(column.getTable()));
        eColumn.setWidth(column.getWidth());
        eColumn.setHorizontalAlignment(column.getHorizontalAlignment());
        eColumn.setVerticalAlignment(column.getVerticalAlignment());
        return eColumn;
    }

    public static EContentNode convertContentNode(ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            return convertCell((Cell) contentNode);
        } else if (contentNode instanceof Column) {
            return convertColumn((Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            return convertPhraseNode((PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            return convertStructuralNode((StructuralNode) contentNode);
        }
        EContentNode eContentNode = EadocFactory.eINSTANCE.createEContentNode();
        mapContentNodeFields(eContentNode, contentNode);
        return eContentNode;
    }

    private static void mapContentNodeFields(EContentNode eContentNode, ContentNode contentNode) {
        eContentNode.setId(contentNode.getId());
        eContentNode.setNodeName(contentNode.getNodeName());
        // eContentNode.setParent(contentNode.getParent());
        eContentNode.setContext(contentNode.getContext());
        eContentNode.setInline(contentNode.isInline());
        eContentNode.setBlock(contentNode.isBlock());
        eContentNode.setAttributes(contentNode.getAttributes());
        eContentNode.setRoles(contentNode.getRoles());
    }

    public static EContentPart convertContentPart(ContentPart contentPart) {
        EContentPart eContentPart = EadocFactory.eINSTANCE.createEContentPart();
        eContentPart.setId(contentPart.getId());
        eContentPart.setLevel(contentPart.getLevel());
        eContentPart.setContext(contentPart.getContext());
        eContentPart.setStyle(contentPart.getStyle());
        eContentPart.setRole(contentPart.getRole());
        eContentPart.setTitle(contentPart.getTitle());
        eContentPart.setAttributes(contentPart.getAttributes());
        convertAndAddAllContentPart(eContentPart.getParts(), contentPart.getParts());
        return eContentPart;
    }

    public static ECursor convertCursor(Cursor cursor) {
        ECursor eCursor = EadocFactory.eINSTANCE.createECursor();
        eCursor.setLineNumber(cursor.getLineNumber());
        eCursor.setPath(cursor.getPath());
        eCursor.setDir(cursor.getDir());
        eCursor.setFile(cursor.getFile());
        return eCursor;
    }

    public static EDescriptionList convertDescriptionList(DescriptionList descriptionList) {
        EDescriptionList eDescriptionList = EadocFactory.eINSTANCE.createEDescriptionList();
        mapStructuralNodeFields(eDescriptionList, descriptionList);
        // eDescriptionList.set(descriptionList.getItems());
        return eDescriptionList;
    }

    public static EDescriptionListEntry convertDescriptionListEntry(DescriptionListEntry descriptionListEntry) {
        EDescriptionListEntry eDescriptionListEntry = EadocFactory.eINSTANCE.createEDescriptionListEntry();
        // eDescriptionListEntry.set(descriptionListEntry.getTerms());
        eDescriptionListEntry.setDescription(descriptionListEntry.getDescription());
        return eDescriptionListEntry;
    }

    public static EDocument convertDocument(Document document) {
        EDocument eDocument = EadocFactory.eINSTANCE.createEDocument();
        mapStructuralNodeFields(eDocument, document);
        eDocument.setStructuredDoctitle(convertTitle(document.getStructuredDoctitle()));
        eDocument.setDoctitle(document.getDoctitle());
        eDocument.setOptions(document.getOptions());
        return eDocument;
    }

    public static EDocumentHeader convertDocumentHeader(DocumentHeader documentHeader) {
        EDocumentHeader eDocumentHeader = EadocFactory.eINSTANCE.createEDocumentHeader();
        // eDocumentHeader.set( documentHeader. getAuthors());
        eDocumentHeader.setDocumentTitle(convertTitle(documentHeader.getDocumentTitle()));
        eDocumentHeader.setPageTitle(documentHeader.getPageTitle());
        // eDocumentHeader.setA(documentHeader. getAuthor());
        eDocumentHeader.setRevisionInfo(convertRevisionInfo(documentHeader.getRevisionInfo()));
        eDocumentHeader.setAttributes(documentHeader.getAttributes());
        return eDocumentHeader;
    }

    public static EAdocList convertList(org.asciidoctor.ast.List list) {
        EAdocList eAdocList = EadocFactory.eINSTANCE.createEAdocList();
        mapStructuralNodeFields(eAdocList, list);
        // eAdocList.set(list.getItems());
        return eAdocList;
    }

    public static EListItem convertListItem(ListItem listItem) {
        EListItem eListItem = EadocFactory.eINSTANCE.createEListItem();
        mapStructuralNodeFields(eListItem, listItem);
        eListItem.setMarker(listItem.getMarker());
        eListItem.setText(listItem.getText());
        eListItem.setSource(listItem.getSource());
        return eListItem;
    }

    public static EPhraseNode convertPhraseNode(PhraseNode phraseNode) {
        EPhraseNode ePhraseNode = EadocFactory.eINSTANCE.createEPhraseNode();
        ePhraseNode.setType(phraseNode.getType());
        ePhraseNode.setText(phraseNode.getText());
        ePhraseNode.setTarget(phraseNode.getTarget());
        return ePhraseNode;
    }

    public static ERevisionInfo convertRevisionInfo(RevisionInfo revisionInfo) {
        ERevisionInfo eRevisionInfo = EadocFactory.eINSTANCE.createERevisionInfo();
        eRevisionInfo.setDate(revisionInfo.getDate());
        eRevisionInfo.setNumber(revisionInfo.getNumber());
        eRevisionInfo.setRemark(revisionInfo.getRemark());
        return eRevisionInfo;
    }

    public static ERow convertRow(Row row) {
        ERow eRow = EadocFactory.eINSTANCE.createERow();
        // eRow.set(row.getCells());
        return eRow;
    }

    public static ESection convertSection(Section section) {
        ESection eSection = EadocFactory.eINSTANCE.createESection();
        mapStructuralNodeFields(eSection, section);
        eSection.setIndex(section.getIndex());
        eSection.setNumber(section.getNumber());
        eSection.setSectionName(section.getSectionName());
        eSection.setSpecial(section.isSpecial());
        eSection.setNumbered(section.isNumbered());
        return eSection;
    }

    public static EStructuralNode convertStructuralNode(StructuralNode structuralNode) {
        if (structuralNode instanceof Block) {
            return convertBlock((Block) structuralNode);
        } else if (structuralNode instanceof DescriptionList) {
            return convertDescriptionList((DescriptionList) structuralNode);
        } else if (structuralNode instanceof Document) {
            return convertDocument((Document) structuralNode);
        } else if (structuralNode instanceof org.asciidoctor.ast.List) {
            return convertList((org.asciidoctor.ast.List) structuralNode);
        } else if (structuralNode instanceof ListItem) {
            return convertListItem((ListItem) structuralNode);
        } else if (structuralNode instanceof Section) {
            return convertSection((Section) structuralNode);
        } else if (structuralNode instanceof Table) {
            return convertTable((Table) structuralNode);
        }
        EStructuralNode eStructuralNode = EadocFactory.eINSTANCE.createEStructuralNode();
        mapStructuralNodeFields(eStructuralNode, structuralNode);
        return eStructuralNode;
    }

    private static void mapStructuralNodeFields(EStructuralNode eStructuralNode, StructuralNode structuralNode) {
        mapContentNodeFields(eStructuralNode, structuralNode);
        eStructuralNode.setTitle(structuralNode.getTitle());
        eStructuralNode.setStyle(structuralNode.getStyle());
        // eStructuralNode.setBlocks(structuralNode.getBlocks());
        // eStructuralNode.set(structuralNode.getContent());
        eStructuralNode.setLevel(structuralNode.getLevel());
        // eStructuralNode.setContentModel(structuralNode.getContentModel());
        eStructuralNode.setSourceLocation(convertCursor(structuralNode.getSourceLocation()));
        // eStructuralNode.setSubstitutions(structuralNode.getSubstitutions());
    }

    public static EStructuredDocument convertStructuredDocument(StructuredDocument structuredDocument) {
        EStructuredDocument eStructuredDocument = EadocFactory.eINSTANCE.createEStructuredDocument();
        // eStructuredDocument.set(structuredDocument.getParts());
        eStructuredDocument.setHeader(structuredDocument.getHeader());
        return eStructuredDocument;
    }

    public static ETable convertTable(Table table) {
        ETable eTable = EadocFactory.eINSTANCE.createETable();
        mapStructuralNodeFields(eTable, table);
        eTable.setHeaderOption(table.hasHeaderOption());
        // eTable.set( table.getColumns());
        // eTable.set( table.getHeader());
        // eTable.set( table.getFooter());
        // eTable.set( table.getBody());
        eTable.setFrame(table.getFrame());
        eTable.setGrid(table.getGrid());
        return eTable;
    }

    public static ETitle convertTitle(Title title) {
        ETitle eTitle = EadocFactory.eINSTANCE.createETitle();
        eTitle.setMain(title.getMain());
        eTitle.setSubtitle(title.getSubtitle());
        eTitle.setCombined(title.getCombined());
        eTitle.setSanitized(title.isSanitized());
        return eTitle;
    }

    public static void convertAndAddAllContentPart(EList<ContentPart> eList, List<? extends ContentPart> parts) {
        if (parts != null) {
            List<EContentPart> items = parts.stream().map(EadocUtility::convertContentPart).collect(Collectors.toList());
            eList.addAll(items);
        }
    }
}
