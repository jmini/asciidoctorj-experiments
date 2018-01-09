package fr.jmini.asciidoctorj.converter.html;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractTableBorderGridRowsTesting;

public class TableBorderGridRowsTest extends AbstractTableBorderGridRowsTesting {

    @Override
    protected Document createAstDocument(String asciiDoc) {
        Document mock = createMock();
        return mock;
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        return HtmlConverterTestUtility.convertToHtml(astDocument);
    }

    // tag::mock-code[]
    public Document createMock() {
        Document mockDocument1 = mock(Document.class);
        when(mockDocument1.getId()).thenReturn(null);
        when(mockDocument1.getNodeName()).thenReturn("document");
        when(mockDocument1.getContext()).thenReturn("document");
        when(mockDocument1.getDocument()).thenReturn(mockDocument1);
        when(mockDocument1.isInline()).thenReturn(false);
        when(mockDocument1.isBlock()).thenReturn(true);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("doctype", "article");
        map1.put("example-caption", "Example");
        map1.put("filetype", "html");
        map1.put("notitle", "");
        map1.put("prewrap", "");
        map1.put("table-caption", "Table");
        when(mockDocument1.getAttributes()).thenReturn(map1);
        when(mockDocument1.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument1.isReftext()).thenReturn(false);
        when(mockDocument1.getReftext()).thenReturn(null);
        when(mockDocument1.getTitle()).thenReturn(null);
        when(mockDocument1.getStyle()).thenReturn(null);
        when(mockDocument1.getLevel()).thenReturn(0);
        when(mockDocument1.getContentModel()).thenReturn("compound");
        when(mockDocument1.getSourceLocation()).thenReturn(null);
        when(mockDocument1.getSubstitutions()).thenReturn(Collections.emptyList());
        Table mockTable1 = mock(Table.class);
        when(mockTable1.getId()).thenReturn(null);
        when(mockTable1.getNodeName()).thenReturn("table");
        when(mockTable1.getContext()).thenReturn("table");
        when(mockTable1.getDocument()).thenReturn(mockDocument1);
        when(mockTable1.isInline()).thenReturn(false);
        when(mockTable1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("colcount", 3L);
        map2.put("grid", "none");
        map2.put("header-option", "");
        map2.put("options", "header");
        map2.put("rowcount", 3L);
        map2.put("style", "table");
        map2.put("tablepcwidth", 100L);
        when(mockTable1.getAttributes()).thenReturn(map2);
        when(mockTable1.getRoles()).thenReturn(Collections.emptyList());
        when(mockTable1.isReftext()).thenReturn(false);
        when(mockTable1.getReftext()).thenReturn(null);
        when(mockTable1.getTitle()).thenReturn(null);
        when(mockTable1.getStyle()).thenReturn("table");
        when(mockTable1.getLevel()).thenReturn(0);
        when(mockTable1.getContentModel()).thenReturn("compound");
        when(mockTable1.getSourceLocation()).thenReturn(null);
        when(mockTable1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockTable1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockTable1.hasHeaderOption()).thenReturn(true);
        Column mockColumn1 = mock(Column.class);
        when(mockColumn1.getId()).thenReturn(null);
        when(mockColumn1.getNodeName()).thenReturn("column");
        when(mockColumn1.getParent()).thenReturn(mockTable1);
        when(mockColumn1.getContext()).thenReturn("column");
        when(mockColumn1.getDocument()).thenReturn(mockDocument1);
        when(mockColumn1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map3 = new HashMap<>();
        map3.put("colnumber", 1L);
        map3.put("colpcwidth", 33.3333);
        map3.put("halign", "left");
        map3.put("valign", "top");
        map3.put("width", 1L);
        when(mockColumn1.getAttributes()).thenReturn(map3);
        when(mockColumn1.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn1.isReftext()).thenReturn(false);
        when(mockColumn1.getReftext()).thenReturn(null);
        when(mockColumn1.getStyle()).thenReturn(null);
        when(mockColumn1.getTable()).thenReturn(mockTable1);
        when(mockColumn1.getColumnNumber()).thenReturn(1);
        when(mockColumn1.getWidth()).thenReturn(1);
        when(mockColumn1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn2 = mock(Column.class);
        when(mockColumn2.getId()).thenReturn(null);
        when(mockColumn2.getNodeName()).thenReturn("column");
        when(mockColumn2.getParent()).thenReturn(mockTable1);
        when(mockColumn2.getContext()).thenReturn("column");
        when(mockColumn2.getDocument()).thenReturn(mockDocument1);
        when(mockColumn2.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn2.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map4 = new HashMap<>();
        map4.put("colnumber", 2L);
        map4.put("colpcwidth", 33.3333);
        map4.put("halign", "left");
        map4.put("valign", "top");
        map4.put("width", 1L);
        when(mockColumn2.getAttributes()).thenReturn(map4);
        when(mockColumn2.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn2.isReftext()).thenReturn(false);
        when(mockColumn2.getReftext()).thenReturn(null);
        when(mockColumn2.getStyle()).thenReturn(null);
        when(mockColumn2.getTable()).thenReturn(mockTable1);
        when(mockColumn2.getColumnNumber()).thenReturn(2);
        when(mockColumn2.getWidth()).thenReturn(1);
        when(mockColumn2.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn2.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn3 = mock(Column.class);
        when(mockColumn3.getId()).thenReturn(null);
        when(mockColumn3.getNodeName()).thenReturn("column");
        when(mockColumn3.getParent()).thenReturn(mockTable1);
        when(mockColumn3.getContext()).thenReturn("column");
        when(mockColumn3.getDocument()).thenReturn(mockDocument1);
        when(mockColumn3.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn3.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map5 = new HashMap<>();
        map5.put("colnumber", 3L);
        map5.put("colpcwidth", 33.3334);
        map5.put("halign", "left");
        map5.put("valign", "top");
        map5.put("width", 1L);
        when(mockColumn3.getAttributes()).thenReturn(map5);
        when(mockColumn3.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn3.isReftext()).thenReturn(false);
        when(mockColumn3.getReftext()).thenReturn(null);
        when(mockColumn3.getStyle()).thenReturn(null);
        when(mockColumn3.getTable()).thenReturn(mockTable1);
        when(mockColumn3.getColumnNumber()).thenReturn(3);
        when(mockColumn3.getWidth()).thenReturn(1);
        when(mockColumn3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockTable1.getColumns()).thenReturn(Arrays.asList(mockColumn1, mockColumn2, mockColumn3));
        Row mockRow1 = mock(Row.class);
        Cell mockCell1 = mock(Cell.class);
        when(mockCell1.getId()).thenReturn(null);
        when(mockCell1.getNodeName()).thenReturn("cell");
        when(mockCell1.getParent()).thenReturn(mockColumn1);
        when(mockCell1.getContext()).thenReturn("cell");
        when(mockCell1.getDocument()).thenReturn(mockDocument1);
        when(mockCell1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map6 = new HashMap<>();
        map6.put("colnumber", 1L);
        map6.put("halign", "left");
        map6.put("valign", "top");
        map6.put("width", 1L);
        when(mockCell1.getAttributes()).thenReturn(map6);
        when(mockCell1.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell1.isReftext()).thenReturn(false);
        when(mockCell1.getReftext()).thenReturn(null);
        when(mockCell1.getColumn()).thenReturn(mockColumn1);
        when(mockCell1.getColspan()).thenReturn(0);
        when(mockCell1.getRowspan()).thenReturn(0);
        when(mockCell1.getText()).thenReturn("Name of Column 1");
        when(mockCell1.getSource()).thenReturn("Name of Column 1");
        when(mockCell1.getStyle()).thenReturn(null);
        when(mockCell1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell1.getInnerDocument()).thenReturn(null);
        Cell mockCell2 = mock(Cell.class);
        when(mockCell2.getId()).thenReturn(null);
        when(mockCell2.getNodeName()).thenReturn("cell");
        when(mockCell2.getParent()).thenReturn(mockColumn2);
        when(mockCell2.getContext()).thenReturn("cell");
        when(mockCell2.getDocument()).thenReturn(mockDocument1);
        when(mockCell2.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell2.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map7 = new HashMap<>();
        map7.put("colnumber", 2L);
        map7.put("halign", "left");
        map7.put("valign", "top");
        map7.put("width", 1L);
        when(mockCell2.getAttributes()).thenReturn(map7);
        when(mockCell2.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell2.isReftext()).thenReturn(false);
        when(mockCell2.getReftext()).thenReturn(null);
        when(mockCell2.getColumn()).thenReturn(mockColumn2);
        when(mockCell2.getColspan()).thenReturn(0);
        when(mockCell2.getRowspan()).thenReturn(0);
        when(mockCell2.getText()).thenReturn("Name of Column 2");
        when(mockCell2.getSource()).thenReturn("Name of Column 2");
        when(mockCell2.getStyle()).thenReturn(null);
        when(mockCell2.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell2.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell2.getInnerDocument()).thenReturn(null);
        Cell mockCell3 = mock(Cell.class);
        when(mockCell3.getId()).thenReturn(null);
        when(mockCell3.getNodeName()).thenReturn("cell");
        when(mockCell3.getParent()).thenReturn(mockColumn3);
        when(mockCell3.getContext()).thenReturn("cell");
        when(mockCell3.getDocument()).thenReturn(mockDocument1);
        when(mockCell3.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell3.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map8 = new HashMap<>();
        map8.put("colnumber", 3L);
        map8.put("halign", "left");
        map8.put("valign", "top");
        map8.put("width", 1L);
        when(mockCell3.getAttributes()).thenReturn(map8);
        when(mockCell3.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell3.isReftext()).thenReturn(false);
        when(mockCell3.getReftext()).thenReturn(null);
        when(mockCell3.getColumn()).thenReturn(mockColumn3);
        when(mockCell3.getColspan()).thenReturn(0);
        when(mockCell3.getRowspan()).thenReturn(0);
        when(mockCell3.getText()).thenReturn("Name of Column 3");
        when(mockCell3.getSource()).thenReturn("Name of Column 3");
        when(mockCell3.getStyle()).thenReturn(null);
        when(mockCell3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell3.getInnerDocument()).thenReturn(null);
        when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1, mockCell2, mockCell3));
        when(mockTable1.getHeader()).thenReturn(Collections.singletonList(mockRow1));
        when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
        Row mockRow2 = mock(Row.class);
        Cell mockCell4 = mock(Cell.class);
        when(mockCell4.getId()).thenReturn(null);
        when(mockCell4.getNodeName()).thenReturn("cell");
        when(mockCell4.getParent()).thenReturn(mockColumn1);
        when(mockCell4.getContext()).thenReturn("cell");
        when(mockCell4.getDocument()).thenReturn(mockDocument1);
        when(mockCell4.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell4.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map9 = new HashMap<>();
        map9.put("colnumber", 1L);
        map9.put("halign", "left");
        map9.put("valign", "top");
        map9.put("width", 1L);
        when(mockCell4.getAttributes()).thenReturn(map9);
        when(mockCell4.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell4.isReftext()).thenReturn(false);
        when(mockCell4.getReftext()).thenReturn(null);
        when(mockCell4.getColumn()).thenReturn(mockColumn1);
        when(mockCell4.getColspan()).thenReturn(0);
        when(mockCell4.getRowspan()).thenReturn(0);
        when(mockCell4.getText()).thenReturn("Cell in column 1, row 1");
        when(mockCell4.getSource()).thenReturn("Cell in column 1, row 1");
        when(mockCell4.getStyle()).thenReturn(null);
        when(mockCell4.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell4.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell4.getInnerDocument()).thenReturn(null);
        Cell mockCell5 = mock(Cell.class);
        when(mockCell5.getId()).thenReturn(null);
        when(mockCell5.getNodeName()).thenReturn("cell");
        when(mockCell5.getParent()).thenReturn(mockColumn2);
        when(mockCell5.getContext()).thenReturn("cell");
        when(mockCell5.getDocument()).thenReturn(mockDocument1);
        when(mockCell5.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell5.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map10 = new HashMap<>();
        map10.put("colnumber", 2L);
        map10.put("halign", "left");
        map10.put("valign", "top");
        map10.put("width", 1L);
        when(mockCell5.getAttributes()).thenReturn(map10);
        when(mockCell5.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell5.isReftext()).thenReturn(false);
        when(mockCell5.getReftext()).thenReturn(null);
        when(mockCell5.getColumn()).thenReturn(mockColumn2);
        when(mockCell5.getColspan()).thenReturn(0);
        when(mockCell5.getRowspan()).thenReturn(0);
        when(mockCell5.getText()).thenReturn("Cell in column 2, row 1");
        when(mockCell5.getSource()).thenReturn("Cell in column 2, row 1");
        when(mockCell5.getStyle()).thenReturn(null);
        when(mockCell5.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell5.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell5.getInnerDocument()).thenReturn(null);
        Cell mockCell6 = mock(Cell.class);
        when(mockCell6.getId()).thenReturn(null);
        when(mockCell6.getNodeName()).thenReturn("cell");
        when(mockCell6.getParent()).thenReturn(mockColumn3);
        when(mockCell6.getContext()).thenReturn("cell");
        when(mockCell6.getDocument()).thenReturn(mockDocument1);
        when(mockCell6.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell6.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map11 = new HashMap<>();
        map11.put("colnumber", 3L);
        map11.put("halign", "left");
        map11.put("valign", "top");
        map11.put("width", 1L);
        when(mockCell6.getAttributes()).thenReturn(map11);
        when(mockCell6.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell6.isReftext()).thenReturn(false);
        when(mockCell6.getReftext()).thenReturn(null);
        when(mockCell6.getColumn()).thenReturn(mockColumn3);
        when(mockCell6.getColspan()).thenReturn(0);
        when(mockCell6.getRowspan()).thenReturn(0);
        when(mockCell6.getText()).thenReturn("Cell in column 3, row 1");
        when(mockCell6.getSource()).thenReturn("Cell in column 3, row 1");
        when(mockCell6.getStyle()).thenReturn(null);
        when(mockCell6.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell6.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell6.getInnerDocument()).thenReturn(null);
        when(mockRow2.getCells()).thenReturn(Arrays.asList(mockCell4, mockCell5, mockCell6));
        Row mockRow3 = mock(Row.class);
        Cell mockCell7 = mock(Cell.class);
        when(mockCell7.getId()).thenReturn(null);
        when(mockCell7.getNodeName()).thenReturn("cell");
        when(mockCell7.getParent()).thenReturn(mockColumn1);
        when(mockCell7.getContext()).thenReturn("cell");
        when(mockCell7.getDocument()).thenReturn(mockDocument1);
        when(mockCell7.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell7.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map12 = new HashMap<>();
        map12.put("colnumber", 1L);
        map12.put("halign", "left");
        map12.put("valign", "top");
        map12.put("width", 1L);
        when(mockCell7.getAttributes()).thenReturn(map12);
        when(mockCell7.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell7.isReftext()).thenReturn(false);
        when(mockCell7.getReftext()).thenReturn(null);
        when(mockCell7.getColumn()).thenReturn(mockColumn1);
        when(mockCell7.getColspan()).thenReturn(0);
        when(mockCell7.getRowspan()).thenReturn(0);
        when(mockCell7.getText()).thenReturn("Cell in column 1, row 2");
        when(mockCell7.getSource()).thenReturn("Cell in column 1, row 2");
        when(mockCell7.getStyle()).thenReturn(null);
        when(mockCell7.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell7.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell7.getInnerDocument()).thenReturn(null);
        Cell mockCell8 = mock(Cell.class);
        when(mockCell8.getId()).thenReturn(null);
        when(mockCell8.getNodeName()).thenReturn("cell");
        when(mockCell8.getParent()).thenReturn(mockColumn2);
        when(mockCell8.getContext()).thenReturn("cell");
        when(mockCell8.getDocument()).thenReturn(mockDocument1);
        when(mockCell8.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell8.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map13 = new HashMap<>();
        map13.put("colnumber", 2L);
        map13.put("halign", "left");
        map13.put("valign", "top");
        map13.put("width", 1L);
        when(mockCell8.getAttributes()).thenReturn(map13);
        when(mockCell8.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell8.isReftext()).thenReturn(false);
        when(mockCell8.getReftext()).thenReturn(null);
        when(mockCell8.getColumn()).thenReturn(mockColumn2);
        when(mockCell8.getColspan()).thenReturn(0);
        when(mockCell8.getRowspan()).thenReturn(0);
        when(mockCell8.getText()).thenReturn("Cell in column 2, row 2");
        when(mockCell8.getSource()).thenReturn("Cell in column 2, row 2");
        when(mockCell8.getStyle()).thenReturn(null);
        when(mockCell8.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell8.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell8.getInnerDocument()).thenReturn(null);
        Cell mockCell9 = mock(Cell.class);
        when(mockCell9.getId()).thenReturn(null);
        when(mockCell9.getNodeName()).thenReturn("cell");
        when(mockCell9.getParent()).thenReturn(mockColumn3);
        when(mockCell9.getContext()).thenReturn("cell");
        when(mockCell9.getDocument()).thenReturn(mockDocument1);
        when(mockCell9.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell9.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map14 = new HashMap<>();
        map14.put("colnumber", 3L);
        map14.put("halign", "left");
        map14.put("valign", "top");
        map14.put("width", 1L);
        when(mockCell9.getAttributes()).thenReturn(map14);
        when(mockCell9.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell9.isReftext()).thenReturn(false);
        when(mockCell9.getReftext()).thenReturn(null);
        when(mockCell9.getColumn()).thenReturn(mockColumn3);
        when(mockCell9.getColspan()).thenReturn(0);
        when(mockCell9.getRowspan()).thenReturn(0);
        when(mockCell9.getText()).thenReturn("Cell in column 3, row 2");
        when(mockCell9.getSource()).thenReturn("Cell in column 3, row 2");
        when(mockCell9.getStyle()).thenReturn(null);
        when(mockCell9.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell9.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell9.getInnerDocument()).thenReturn(null);
        when(mockRow3.getCells()).thenReturn(Arrays.asList(mockCell7, mockCell8, mockCell9));
        when(mockTable1.getBody()).thenReturn(Arrays.asList(mockRow2, mockRow3));
        when(mockTable1.getFrame()).thenReturn("all");
        when(mockTable1.getGrid()).thenReturn("none");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockTable1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map15 = new HashMap<>();
        map15.put("attributes", "{}");
        map15.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map15);
        return mockDocument1;
    }
    // end::mock-code[]
}
