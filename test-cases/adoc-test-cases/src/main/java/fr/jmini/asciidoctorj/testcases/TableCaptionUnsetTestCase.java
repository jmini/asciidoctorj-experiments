package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;

public class TableCaptionUnsetTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            ":table-caption!:\n" +
            "\n" +
            ".some first caption\n" +
            "|=== \n" +
            "\n" +
            "| Cell in column 1, row 1 | Cell in column 2, row 1\n" +
            "\n" +
            "|===";

    @Override
    public String getAdocInput() {
        return ASCIIDOC;
    }

    @Override
    public Map<String, Object> getInputOptions() {
        return OptionsBuilder.options()
                .asMap();
    }

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "" +
            "<table class=\"tableblock frame-all grid-all spread\">\n" +
            "<caption class=\"title\">\n" +
            "some first caption\n" +
            "</caption>\n" +
            "<colgroup>\n" +
            "<col style=\"width: 50%;\" />\n" +
            "<col style=\"width: 50%;\" />\n" +
            "</colgroup>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 1, row 1</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 2, row 1</p></td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>";
    // end::expected-html[]

    @Override
    public String getHtmlOutput() {
        return EXPECTED_HTML;
    }

    @Override
    // tag::assert-code[]
public void checkAst(Document astDocument) {
Document document1 = astDocument;
assertThat(document1.getId()).isNull();
assertThat(document1.getNodeName()).isEqualTo("document");
assertThat(document1.getParent()).isNull();
assertThat(document1.getContext()).isEqualTo("document");
assertThat(document1.getDocument()).isSameAs(document1);
assertThat(document1.isInline()).isFalse();
assertThat(document1.isBlock()).isTrue();
assertThat(document1.getAttributes()).containsEntry("appendix-caption", "Appendix").containsEntry("appendix-refsig", "Appendix").containsEntry("asciidoctor", "").containsEntry("asciidoctor-version", "1.5.6.1").containsEntry("attribute-missing", "skip").containsEntry("attribute-undefined", "drop-line").containsEntry("backend", "html5").containsEntry("backend-html5", "").containsEntry("backend-html5-doctype-article", "").containsEntry("basebackend", "html").containsEntry("basebackend-html", "").containsEntry("basebackend-html-doctype-article", "").containsEntry("caution-caption", "Caution").containsEntry("chapter-refsig", "Chapter").containsEntry("docdate", "2018-01-27").containsEntry("docdatetime", "2018-01-27 23:08:17 CET").containsEntry("docdir", "").containsEntry("doctime", "23:08:17 CET").containsEntry("doctype", "article").containsEntry("doctype-article", "").containsEntry("docyear", "2018").containsEntry("embedded", "").containsEntry("example-caption", "Example").containsEntry("figure-caption", "Figure").containsEntry("filetype", "html").containsEntry("filetype-html", "").containsEntry("htmlsyntax", "html").containsEntry("iconfont-remote", "").containsEntry("iconsdir", "./images/icons").containsEntry("important-caption", "Important").containsEntry("last-update-label", "Last updated").containsEntry("linkcss", "").containsEntry("localdate", "2018-01-27").containsEntry("localdatetime", "2018-01-27 23:08:17 CET").containsEntry("localtime", "23:08:17 CET").containsEntry("localyear", "2018").containsEntry("manname-title", "NAME").containsEntry("max-attribute-value-size", 4096L).containsEntry("max-include-depth", 64L).containsEntry("note-caption", "Note").containsEntry("notitle", "").containsEntry("outfilesuffix", ".html").containsEntry("prewrap", "").containsEntry("safe-mode-level", 20L).containsEntry("safe-mode-name", "secure").containsEntry("safe-mode-secure", "").containsEntry("sectids", "").containsEntry("section-refsig", "Section").containsEntry("stylesdir", ".").containsEntry("stylesheet", "").containsEntry("tip-caption", "Tip").containsEntry("toc-placement", "auto").containsEntry("toc-title", "Table of Contents").containsEntry("untitled-label", "Untitled").containsEntry("user-home", ".").containsEntry("version-label", "Version").containsEntry("warning-caption", "Warning").containsEntry("webfonts", "");
assertThat(document1.getRoles()).isNullOrEmpty();
assertThat(document1.isReftext()).isFalse();
assertThat(document1.getReftext()).isNull();
assertThat(document1.getCaption()).isNull();
assertThat(document1.getTitle()).isNull();
assertThat(document1.getStyle()).isNull();
assertThat(document1.getLevel()).isEqualTo(0);
assertThat(document1.getContentModel()).isEqualTo("compound");
assertThat(document1.getSourceLocation()).isNull();
assertThat(document1.getSubstitutions()).isNullOrEmpty();
assertThat(document1.getBlocks()).hasSize(1);
Table table1 = (Table) document1.getBlocks().get(0);
assertThat(table1.getId()).isNull();
assertThat(table1.getNodeName()).isEqualTo("table");
assertThat(table1.getParent()).isSameAs(document1);
assertThat(table1.getContext()).isEqualTo("table");
assertThat(table1.getDocument()).isSameAs(document1);
assertThat(table1.isInline()).isFalse();
assertThat(table1.isBlock()).isTrue();
assertThat(table1.getAttributes()).containsEntry("colcount", 2L).containsEntry("rowcount", 1L).containsEntry("style", "table").containsEntry("tablepcwidth", 100L);
assertThat(table1.getRoles()).isNullOrEmpty();
assertThat(table1.isReftext()).isFalse();
assertThat(table1.getReftext()).isNull();
assertThat(table1.getCaption()).isNull();
assertThat(table1.getTitle()).isEqualTo("some first caption");
assertThat(table1.getStyle()).isEqualTo("table");
assertThat(table1.getLevel()).isEqualTo(0);
assertThat(table1.getContentModel()).isEqualTo("compound");
assertThat(table1.getSourceLocation()).isNull();
assertThat(table1.getSubstitutions()).isNullOrEmpty();
assertThat(table1.getBlocks()).isNullOrEmpty();
assertThat(table1.hasHeaderOption()).isFalse();
assertThat(table1.getColumns()).hasSize(2);
Column column1 = (Column) table1.getColumns().get(0);
assertThat(column1.getId()).isNull();
assertThat(column1.getNodeName()).isEqualTo("column");
assertThat(column1.getParent()).isSameAs(table1);
assertThat(column1.getContext()).isEqualTo("column");
assertThat(column1.getDocument()).isSameAs(document1);
assertThatThrownBy(() -> { column1.isInline(); }).hasMessageContaining("NotImplementedError");
assertThatThrownBy(() -> { column1.isBlock(); }).hasMessageContaining("NotImplementedError");
assertThat(column1.getAttributes()).containsEntry("colnumber", 1L).containsEntry("colpcwidth", 50L).containsEntry("halign", "left").containsEntry("valign", "top").containsEntry("width", 1L);
assertThat(column1.getRoles()).isNullOrEmpty();
assertThat(column1.isReftext()).isFalse();
assertThat(column1.getReftext()).isNull();
assertThat(column1.getStyle()).isNull();
assertThat(column1.getTable()).isSameAs(table1);
assertThat(column1.getColumnNumber()).isEqualTo(1);
assertThat(column1.getWidth()).isEqualTo(1);
assertThat(column1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
assertThat(column1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
Column column2 = (Column) table1.getColumns().get(1);
assertThat(column2.getId()).isNull();
assertThat(column2.getNodeName()).isEqualTo("column");
assertThat(column2.getParent()).isSameAs(table1);
assertThat(column2.getContext()).isEqualTo("column");
assertThat(column2.getDocument()).isSameAs(document1);
assertThatThrownBy(() -> { column2.isInline(); }).hasMessageContaining("NotImplementedError");
assertThatThrownBy(() -> { column2.isBlock(); }).hasMessageContaining("NotImplementedError");
assertThat(column2.getAttributes()).containsEntry("colnumber", 2L).containsEntry("colpcwidth", 50L).containsEntry("halign", "left").containsEntry("valign", "top").containsEntry("width", 1L);
assertThat(column2.getRoles()).isNullOrEmpty();
assertThat(column2.isReftext()).isFalse();
assertThat(column2.getReftext()).isNull();
assertThat(column2.getStyle()).isNull();
assertThat(column2.getTable()).isSameAs(table1);
assertThat(column2.getColumnNumber()).isEqualTo(2);
assertThat(column2.getWidth()).isEqualTo(1);
assertThat(column2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
assertThat(column2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
assertThat(table1.getHeader()).isNullOrEmpty();
assertThat(table1.getFooter()).isNullOrEmpty();
assertThat(table1.getBody()).hasSize(1);
Row row1 = (Row) table1.getBody().get(0);
assertThat(row1.getCells()).hasSize(2);
Cell cell1 = (Cell) row1.getCells().get(0);
assertThat(cell1.getId()).isNull();
assertThat(cell1.getNodeName()).isEqualTo("cell");
assertThat(cell1.getParent()).isSameAs(column1);
assertThat(cell1.getContext()).isEqualTo("cell");
assertThat(cell1.getDocument()).isSameAs(document1);
assertThatThrownBy(() -> { cell1.isInline(); }).hasMessageContaining("NotImplementedError");
assertThatThrownBy(() -> { cell1.isBlock(); }).hasMessageContaining("NotImplementedError");
assertThat(cell1.getAttributes()).containsEntry("colnumber", 1L).containsEntry("halign", "left").containsEntry("valign", "top").containsEntry("width", 1L);
assertThat(cell1.getRoles()).isNullOrEmpty();
assertThat(cell1.isReftext()).isFalse();
assertThat(cell1.getReftext()).isNull();
assertThat(cell1.getColumn()).isSameAs(column1);
assertThat(cell1.getColspan()).isEqualTo(0);
assertThat(cell1.getRowspan()).isEqualTo(0);
assertThat(cell1.getText()).isEqualTo("Cell in column 1, row 1");
assertThat(cell1.getSource()).isEqualTo("Cell in column 1, row 1");
assertThat(cell1.getStyle()).isNull();
assertThat(cell1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
assertThat(cell1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
assertThat(cell1.getInnerDocument()).isNull();
Cell cell2 = (Cell) row1.getCells().get(1);
assertThat(cell2.getId()).isNull();
assertThat(cell2.getNodeName()).isEqualTo("cell");
assertThat(cell2.getParent()).isSameAs(column2);
assertThat(cell2.getContext()).isEqualTo("cell");
assertThat(cell2.getDocument()).isSameAs(document1);
assertThatThrownBy(() -> { cell2.isInline(); }).hasMessageContaining("NotImplementedError");
assertThatThrownBy(() -> { cell2.isBlock(); }).hasMessageContaining("NotImplementedError");
assertThat(cell2.getAttributes()).containsEntry("colnumber", 2L).containsEntry("halign", "left").containsEntry("valign", "top").containsEntry("width", 1L);
assertThat(cell2.getRoles()).isNullOrEmpty();
assertThat(cell2.isReftext()).isFalse();
assertThat(cell2.getReftext()).isNull();
assertThat(cell2.getColumn()).isSameAs(column2);
assertThat(cell2.getColspan()).isEqualTo(0);
assertThat(cell2.getRowspan()).isEqualTo(0);
assertThat(cell2.getText()).isEqualTo("Cell in column 2, row 1");
assertThat(cell2.getSource()).isEqualTo("Cell in column 2, row 1");
assertThat(cell2.getStyle()).isNull();
assertThat(cell2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
assertThat(cell2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
assertThat(cell2.getInnerDocument()).isNull();
assertThat(table1.getFrame()).isEqualTo("all");
assertThat(table1.getGrid()).isEqualTo("all");
assertThat(document1.getStructuredDoctitle()).isNull();
assertThat(document1.getDoctitle()).isNull();
assertThat(document1.getOptions()).containsEntry("header_footer", false);
}
 // end::assert-code[]

    @Override
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
map1.put("appendix-caption", "Appendix");
map1.put("appendix-refsig", "Appendix");
map1.put("asciidoctor", "");
map1.put("asciidoctor-version", "1.5.6.1");
map1.put("attribute-missing", "skip");
map1.put("attribute-undefined", "drop-line");
map1.put("backend", "html5");
map1.put("backend-html5", "");
map1.put("backend-html5-doctype-article", "");
map1.put("basebackend", "html");
map1.put("basebackend-html", "");
map1.put("basebackend-html-doctype-article", "");
map1.put("caution-caption", "Caution");
map1.put("chapter-refsig", "Chapter");
map1.put("docdate", "2018-01-27");
map1.put("docdatetime", "2018-01-27 23:08:17 CET");
map1.put("docdir", "");
map1.put("doctime", "23:08:17 CET");
map1.put("doctype", "article");
map1.put("doctype-article", "");
map1.put("docyear", "2018");
map1.put("embedded", "");
map1.put("example-caption", "Example");
map1.put("figure-caption", "Figure");
map1.put("filetype", "html");
map1.put("filetype-html", "");
map1.put("htmlsyntax", "html");
map1.put("iconfont-remote", "");
map1.put("iconsdir", "./images/icons");
map1.put("important-caption", "Important");
map1.put("last-update-label", "Last updated");
map1.put("linkcss", "");
map1.put("localdate", "2018-01-27");
map1.put("localdatetime", "2018-01-27 23:08:17 CET");
map1.put("localtime", "23:08:17 CET");
map1.put("localyear", "2018");
map1.put("manname-title", "NAME");
map1.put("max-attribute-value-size", 4096L);
map1.put("max-include-depth", 64L);
map1.put("note-caption", "Note");
map1.put("notitle", "");
map1.put("outfilesuffix", ".html");
map1.put("prewrap", "");
map1.put("safe-mode-level", 20L);
map1.put("safe-mode-name", "secure");
map1.put("safe-mode-secure", "");
map1.put("sectids", "");
map1.put("section-refsig", "Section");
map1.put("stylesdir", ".");
map1.put("stylesheet", "");
map1.put("tip-caption", "Tip");
map1.put("toc-placement", "auto");
map1.put("toc-title", "Table of Contents");
map1.put("untitled-label", "Untitled");
map1.put("user-home", ".");
map1.put("version-label", "Version");
map1.put("warning-caption", "Warning");
map1.put("webfonts", "");
when(mockDocument1.getAttributes()).thenReturn(map1);
when(mockDocument1.getRoles()).thenReturn(Collections.emptyList());
when(mockDocument1.isReftext()).thenReturn(false);
when(mockDocument1.getReftext()).thenReturn(null);
when(mockDocument1.getCaption()).thenReturn(null);
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
map2.put("rowcount", 1L);
map2.put("style", "table");
map2.put("tablepcwidth", 100L);
when(mockTable1.getAttributes()).thenReturn(map2);
when(mockTable1.getRoles()).thenReturn(Collections.emptyList());
when(mockTable1.isReftext()).thenReturn(false);
when(mockTable1.getReftext()).thenReturn(null);
when(mockTable1.getCaption()).thenReturn(null);
when(mockTable1.getTitle()).thenReturn("some first caption");
when(mockTable1.getStyle()).thenReturn("table");
when(mockTable1.getLevel()).thenReturn(0);
when(mockTable1.getContentModel()).thenReturn("compound");
when(mockTable1.getSourceLocation()).thenReturn(null);
when(mockTable1.getSubstitutions()).thenReturn(Collections.emptyList());
when(mockTable1.getBlocks()).thenReturn(Collections.emptyList());
when(mockTable1.hasHeaderOption()).thenReturn(false);
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
when(mockTable1.getHeader()).thenReturn(Collections.emptyList());
when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
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
when(mockCell1.getText()).thenReturn("Cell in column 1, row 1");
when(mockCell1.getSource()).thenReturn("Cell in column 1, row 1");
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
when(mockCell2.getText()).thenReturn("Cell in column 2, row 1");
when(mockCell2.getSource()).thenReturn("Cell in column 2, row 1");
when(mockCell2.getStyle()).thenReturn(null);
when(mockCell2.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
when(mockCell2.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
when(mockCell2.getInnerDocument()).thenReturn(null);
when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1, mockCell2));
when(mockTable1.getBody()).thenReturn(Collections.singletonList(mockRow1));
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