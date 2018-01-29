package fr.jmini.sciid;

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

public class SciidUtility {

    public static SAuthor convertAuthor(Author author) {
        SAuthor sAuthor = SciidFactory.eINSTANCE.createSAuthor();
        sAuthor.setEmail(author.getEmail());
        sAuthor.setFullName(author.getFullName());
        sAuthor.setFirstName(author.getFirstName());
        sAuthor.setLastName(author.getLastName());
        sAuthor.setMiddleName(author.getMiddleName());
        sAuthor.setInitials(author.getInitials());
        return sAuthor;
    }

    public static SBlock convertBlock(Block block) {
        SBlock sBlock = SciidFactory.eINSTANCE.createSBlock();
        mapStructuralNodeFields(sBlock, block);
        sBlock.setLines(block.getLines());
        sBlock.setSource(block.getSource());
        return sBlock;
    }

    public static SCell convertCell(Cell cell) {
        SCell sCell = SciidFactory.eINSTANCE.createSCell();
        sCell.setColumn(convertColumn(cell.getColumn()));
        sCell.setColspan(cell.getColspan());
        sCell.setRowspan(cell.getRowspan());
        // sCell.set(cell.getText());
        sCell.setSource(cell.getSource());
        sCell.setStyle(cell.getStyle());
        sCell.setHorizontalAlignment(cell.getHorizontalAlignment());
        sCell.setVerticalAlignment(cell.getVerticalAlignment());
        sCell.setInnerDocument(cell.getInnerDocument());
        return sCell;
    }

    public static SColumn convertColumn(Column column) {
        SColumn sColumn = SciidFactory.eINSTANCE.createSColumn();
        sColumn.setStyle(column.getStyle());
        sColumn.setTable(convertTable(column.getTable()));
        sColumn.setWidth(column.getWidth());
        sColumn.setHorizontalAlignment(column.getHorizontalAlignment());
        sColumn.setVerticalAlignment(column.getVerticalAlignment());
        return sColumn;
    }

    public static SContentNode convertContentNode(ContentNode contentNode) {
        if (contentNode instanceof Cell) {
            return convertCell((Cell) contentNode);
        } else if (contentNode instanceof Column) {
            return convertColumn((Column) contentNode);
        } else if (contentNode instanceof PhraseNode) {
            return convertPhraseNode((PhraseNode) contentNode);
        } else if (contentNode instanceof StructuralNode) {
            return convertStructuralNode((StructuralNode) contentNode);
        }
        SContentNode sContentNode = SciidFactory.eINSTANCE.createSContentNode();
        mapContentNodeFields(sContentNode, contentNode);
        return sContentNode;
    }

    private static void mapContentNodeFields(SContentNode sContentNode, ContentNode contentNode) {
        sContentNode.setId(contentNode.getId());
        sContentNode.setNodeName(contentNode.getNodeName());
        // sContentNode.setParent(contentNode.getParent());
        sContentNode.setContext(contentNode.getContext());
        sContentNode.setInline(contentNode.isInline());
        sContentNode.setBlock(contentNode.isBlock());
        sContentNode.setAttributes(contentNode.getAttributes());
        sContentNode.setRoles(contentNode.getRoles());
    }

    public static SContentPart convertContentPart(ContentPart contentPart) {
        SContentPart sContentPart = SciidFactory.eINSTANCE.createSContentPart();
        sContentPart.setId(contentPart.getId());
        sContentPart.setLevel(contentPart.getLevel());
        sContentPart.setContext(contentPart.getContext());
        sContentPart.setStyle(contentPart.getStyle());
        sContentPart.setRole(contentPart.getRole());
        sContentPart.setTitle(contentPart.getTitle());
        sContentPart.setAttributes(contentPart.getAttributes());
        convertAndAddAllContentPart(sContentPart.getParts(), contentPart.getParts());
        return sContentPart;
    }

    public static SCursor convertCursor(Cursor cursor) {
        SCursor sCursor = SciidFactory.eINSTANCE.createSCursor();
        sCursor.setLineNumber(cursor.getLineNumber());
        sCursor.setPath(cursor.getPath());
        sCursor.setDir(cursor.getDir());
        sCursor.setFile(cursor.getFile());
        return sCursor;
    }

    public static SDescriptionList convertDescriptionList(DescriptionList descriptionList) {
        SDescriptionList sDescriptionList = SciidFactory.eINSTANCE.createSDescriptionList();
        mapStructuralNodeFields(sDescriptionList, descriptionList);
        // sDescriptionList.set(descriptionList.getItems());
        return sDescriptionList;
    }

    public static SDescriptionListEntry convertDescriptionListEntry(DescriptionListEntry descriptionListEntry) {
        SDescriptionListEntry sDescriptionListEntry = SciidFactory.eINSTANCE.createSDescriptionListEntry();
        // sDescriptionListEntry.set(descriptionListEntry.getTerms());
        sDescriptionListEntry.setDescription(descriptionListEntry.getDescription());
        return sDescriptionListEntry;
    }

    public static SDocument convertDocument(Document document) {
        SDocument sDocument = SciidFactory.eINSTANCE.createSDocument();
        mapStructuralNodeFields(sDocument, document);
        sDocument.setStructuredDoctitle(convertTitle(document.getStructuredDoctitle()));
        sDocument.setDoctitle(document.getDoctitle());
        sDocument.setOptions(document.getOptions());
        return sDocument;
    }

    public static SDocumentHeader convertDocumentHeader(DocumentHeader documentHeader) {
        SDocumentHeader sDocumentHeader = SciidFactory.eINSTANCE.createSDocumentHeader();
        // sDocumentHeader.set( documentHeader. getAuthors());
        sDocumentHeader.setDocumentTitle(convertTitle(documentHeader.getDocumentTitle()));
        sDocumentHeader.setPageTitle(documentHeader.getPageTitle());
        // sDocumentHeader.setA(documentHeader. getAuthor());
        sDocumentHeader.setRevisionInfo(convertRevisionInfo(documentHeader.getRevisionInfo()));
        sDocumentHeader.setAttributes(documentHeader.getAttributes());
        return sDocumentHeader;
    }

    public static SList convertList(org.asciidoctor.ast.List list) {
        SList sAdocList = SciidFactory.eINSTANCE.createSList();
        mapStructuralNodeFields(sAdocList, list);
        // sAdocList.set(list.getItems());
        return sAdocList;
    }

    public static SListItem convertListItem(ListItem listItem) {
        SListItem sListItem = SciidFactory.eINSTANCE.createSListItem();
        mapStructuralNodeFields(sListItem, listItem);
        sListItem.setMarker(listItem.getMarker());
        sListItem.setText(listItem.getText());
        sListItem.setSource(listItem.getSource());
        return sListItem;
    }

    public static SPhraseNode convertPhraseNode(PhraseNode phraseNode) {
        SPhraseNode sPhraseNode = SciidFactory.eINSTANCE.createSPhraseNode();
        sPhraseNode.setType(phraseNode.getType());
        sPhraseNode.setText(phraseNode.getText());
        sPhraseNode.setTarget(phraseNode.getTarget());
        return sPhraseNode;
    }

    public static SRevisionInfo convertRevisionInfo(RevisionInfo revisionInfo) {
        SRevisionInfo sRevisionInfo = SciidFactory.eINSTANCE.createSRevisionInfo();
        sRevisionInfo.setDate(revisionInfo.getDate());
        sRevisionInfo.setNumber(revisionInfo.getNumber());
        sRevisionInfo.setRemark(revisionInfo.getRemark());
        return sRevisionInfo;
    }

    public static SRow convertRow(Row row) {
        SRow sRow = SciidFactory.eINSTANCE.createSRow();
        // sRow.set(row.getCells());
        return sRow;
    }

    public static SSection convertSection(Section section) {
        SSection sSection = SciidFactory.eINSTANCE.createSSection();
        mapStructuralNodeFields(sSection, section);
        sSection.setIndex(section.getIndex());
        sSection.setNumber(section.getNumber());
        sSection.setSectionName(section.getSectionName());
        sSection.setSpecial(section.isSpecial());
        sSection.setNumbered(section.isNumbered());
        return sSection;
    }

    public static SStructuralNode convertStructuralNode(StructuralNode structuralNode) {
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
        SStructuralNode sStructuralNode = SciidFactory.eINSTANCE.createSStructuralNode();
        mapStructuralNodeFields(sStructuralNode, structuralNode);
        return sStructuralNode;
    }

    private static void mapStructuralNodeFields(SStructuralNode sStructuralNode, StructuralNode structuralNode) {
        mapContentNodeFields(sStructuralNode, structuralNode);
        sStructuralNode.setCaption(structuralNode.getCaption());
        sStructuralNode.setTitle(structuralNode.getTitle());
        sStructuralNode.setStyle(structuralNode.getStyle());
        // sStructuralNode.setBlocks(structuralNode.getBlocks());
        // sStructuralNode.set(structuralNode.getContent());
        sStructuralNode.setLevel(structuralNode.getLevel());
        // sStructuralNode.setContentModel(structuralNode.getContentModel());
        sStructuralNode.setSourceLocation(convertCursor(structuralNode.getSourceLocation()));
        // sStructuralNode.setSubstitutions(structuralNode.getSubstitutions());
    }

    public static SStructuredDocument convertStructuredDocument(StructuredDocument structuredDocument) {
        SStructuredDocument sStructuredDocument = SciidFactory.eINSTANCE.createSStructuredDocument();
        // sStructuredDocument.set(structuredDocument.getParts());
        sStructuredDocument.setHeader(structuredDocument.getHeader());
        return sStructuredDocument;
    }

    public static STable convertTable(Table table) {
        STable sTable = SciidFactory.eINSTANCE.createSTable();
        mapStructuralNodeFields(sTable, table);
        sTable.setHeaderOption(table.hasHeaderOption());
        // sTable.set( table.getColumns());
        // sTable.set( table.getHeader());
        // sTable.set( table.getFooter());
        // sTable.set( table.getBody());
        sTable.setFrame(table.getFrame());
        sTable.setGrid(table.getGrid());
        return sTable;
    }

    public static STitle convertTitle(Title title) {
        STitle sTitle = SciidFactory.eINSTANCE.createSTitle();
        sTitle.setMain(title.getMain());
        sTitle.setSubtitle(title.getSubtitle());
        sTitle.setCombined(title.getCombined());
        sTitle.setSanitized(title.isSanitized());
        return sTitle;
    }

    public static void convertAndAddAllContentPart(EList<ContentPart> sList, List<? extends ContentPart> parts) {
        if (parts != null) {
            List<SContentPart> items = parts.stream().map(SciidUtility::convertContentPart).collect(Collectors.toList());
            sList.addAll(items);
        }
    }
}
