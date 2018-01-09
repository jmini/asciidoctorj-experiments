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

import fr.jmini.asciidoctorj.converter.html.testing.AbstractTableHeaderRowOnlyTesting;

public class TableHeaderRowOnlyTest extends AbstractTableHeaderRowOnlyTesting {

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
        when(mockDocument1.getParent()).thenReturn(null);
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
        when(mockTable1.getParent()).thenReturn(mockDocument1);
        when(mockTable1.getContext()).thenReturn("table");
        when(mockTable1.getDocument()).thenReturn(mockDocument1);
        when(mockTable1.isInline()).thenReturn(false);
        when(mockTable1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("colcount", 2L);
        map2.put("cols", "2*");
        map2.put("header-option", "");
        map2.put("options", "header");
        map2.put("rowcount", 1L);
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
        map3.put("colpcwidth", 50L);
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
        map4.put("colpcwidth", 50L);
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
        when(mockTable1.getColumns()).thenReturn(Arrays.asList(mockColumn1, mockColumn2));
        Row mockRow1 = mock(Row.class);
        Cell mockCell1 = mock(Cell.class);
        when(mockCell1.getId()).thenReturn(null);
        when(mockCell1.getNodeName()).thenReturn("cell");
        when(mockCell1.getParent()).thenReturn(mockColumn1);
        when(mockCell1.getContext()).thenReturn("cell");
        when(mockCell1.getDocument()).thenReturn(mockDocument1);
        when(mockCell1.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell1.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map5 = new HashMap<>();
        map5.put("colnumber", 1L);
        map5.put("colpcwidth", 50L);
        map5.put("halign", "left");
        map5.put("valign", "top");
        map5.put("width", 1L);
        when(mockCell1.getAttributes()).thenReturn(map5);
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
        Map<String, Object> map6 = new HashMap<>();
        map6.put("colnumber", 2L);
        map6.put("colpcwidth", 50L);
        map6.put("halign", "left");
        map6.put("valign", "top");
        map6.put("width", 1L);
        when(mockCell2.getAttributes()).thenReturn(map6);
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
        when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1, mockCell2));
        when(mockTable1.getHeader()).thenReturn(Collections.singletonList(mockRow1));
        when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
        when(mockTable1.getBody()).thenReturn(Collections.emptyList());
        when(mockTable1.getFrame()).thenReturn("all");
        when(mockTable1.getGrid()).thenReturn("all");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockTable1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map7 = new HashMap<>();
        map7.put("attributes", "{}");
        map7.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map7);
        return mockDocument1;
    }
    // end::mock-code[]
}
