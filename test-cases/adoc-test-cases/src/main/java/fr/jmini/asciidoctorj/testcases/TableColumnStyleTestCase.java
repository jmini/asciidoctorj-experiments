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
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;

public class TableColumnStyleTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[cols=\"a,e,h,l,m,d,s,v\"]\n" +
            "|===\n" +
            "|Cell in column 1, row 1\n" +
            "|Cell in column 2, row 1\n" +
            "|Cell in column 3, row 1\n" +
            "|Cell in column 4, row 1\n" +
            "|Cell in column 5, row 1\n" +
            "|Cell in column 6, row 1\n" +
            "|Cell in column 7, row 1\n" +
            "|Cell in column 8, row 1\n" +
            "\n" +
            "|Cell in column 1, row 2\n" +
            "|Cell in column 2, row 2\n" +
            "|Cell in column 3, row 2\n" +
            "|Cell in column 4, row 2\n" +
            "|Cell in column 5, row 2\n" +
            "|Cell in column 6, row 2\n" +
            "|Cell in column 7, row 2\n" +
            "|Cell in column 8, row 2\n" +
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
            "<colgroup>\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "<col style=\"width: 12.5%;\" />\n" +
            "</colgroup>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Cell in column 1, row 1</p>\n" +
            "</div>\n" +
            "</div></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><em>Cell in column 2, row 1</em></p></td>\n" +
            "<th class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 3, row 1</p></th>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div class=\"literal\">\n" +
            "<pre>Cell in column 4, row 1</pre>\n" +
            "</div></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><code>Cell in column 5, row 1</code></p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 6, row 1</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><strong>Cell in column 7, row 1</strong></p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div class=\"verse\">\n" +
            "Cell in column 8, row 1\n" +
            "</div></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Cell in column 1, row 2</p>\n" +
            "</div>\n" +
            "</div></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><em>Cell in column 2, row 2</em></p></td>\n" +
            "<th class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 3, row 2</p></th>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div class=\"literal\">\n" +
            "<pre>Cell in column 4, row 2</pre>\n" +
            "</div></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><code>Cell in column 5, row 2</code></p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\">Cell in column 6, row 2</p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\"><p class=\"tableblock\"><strong>Cell in column 7, row 2</strong></p></td>\n" +
            "<td class=\"tableblock halign-left valign-top\">\n" +
            "<div class=\"verse\">\n" +
            "Cell in column 8, row 2\n" +
            "</div></td>\n" +
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
        assertThat(document1.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
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
        Table table1 = (Table) document1.getBlocks()
                .get(0);
        assertThat(table1.getId()).isNull();
        assertThat(table1.getNodeName()).isEqualTo("table");
        assertThat(table1.getParent()).isSameAs(document1);
        assertThat(table1.getContext()).isEqualTo("table");
        assertThat(table1.getDocument()).isSameAs(document1);
        assertThat(table1.isInline()).isFalse();
        assertThat(table1.isBlock()).isTrue();
        assertThat(table1.getAttributes()).containsEntry("colcount", 8L)
                .containsEntry("cols", "a,e,h,l,m,d,s,v")
                .containsEntry("rowcount", 2L)
                .containsEntry("style", "table")
                .containsEntry("tablepcwidth", 100L);
        assertThat(table1.getRoles()).isNullOrEmpty();
        assertThat(table1.isReftext()).isFalse();
        assertThat(table1.getReftext()).isNull();
        assertThat(table1.getCaption()).isNull();
        assertThat(table1.getTitle()).isNull();
        assertThat(table1.getStyle()).isEqualTo("table");
        assertThat(table1.getLevel()).isEqualTo(0);
        assertThat(table1.getContentModel()).isEqualTo("compound");
        assertThat(table1.getSourceLocation()).isNull();
        assertThat(table1.getSubstitutions()).isNullOrEmpty();
        assertThat(table1.getBlocks()).isNullOrEmpty();
        assertThat(table1.hasHeaderOption()).isFalse();
        assertThat(table1.getColumns()).hasSize(8);
        Column column1 = (Column) table1.getColumns()
                .get(0);
        assertThat(column1.getId()).isNull();
        assertThat(column1.getNodeName()).isEqualTo("column");
        assertThat(column1.getParent()).isSameAs(table1);
        assertThat(column1.getContext()).isEqualTo("column");
        assertThat(column1.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column1.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column1.getRoles()).isNullOrEmpty();
        assertThat(column1.isReftext()).isFalse();
        assertThat(column1.getReftext()).isNull();
        assertThat(column1.getStyle()).isEqualTo("asciidoc");
        assertThat(column1.getTable()).isSameAs(table1);
        assertThat(column1.getColumnNumber()).isEqualTo(1);
        assertThat(column1.getWidth()).isEqualTo(1);
        assertThat(column1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column2 = (Column) table1.getColumns()
                .get(1);
        assertThat(column2.getId()).isNull();
        assertThat(column2.getNodeName()).isEqualTo("column");
        assertThat(column2.getParent()).isSameAs(table1);
        assertThat(column2.getContext()).isEqualTo("column");
        assertThat(column2.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column2.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column2.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column2.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column2.getRoles()).isNullOrEmpty();
        assertThat(column2.isReftext()).isFalse();
        assertThat(column2.getReftext()).isNull();
        assertThat(column2.getStyle()).isEqualTo("emphasis");
        assertThat(column2.getTable()).isSameAs(table1);
        assertThat(column2.getColumnNumber()).isEqualTo(2);
        assertThat(column2.getWidth()).isEqualTo(1);
        assertThat(column2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column3 = (Column) table1.getColumns()
                .get(2);
        assertThat(column3.getId()).isNull();
        assertThat(column3.getNodeName()).isEqualTo("column");
        assertThat(column3.getParent()).isSameAs(table1);
        assertThat(column3.getContext()).isEqualTo("column");
        assertThat(column3.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column3.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column3.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column3.getAttributes()).containsEntry("colnumber", 3L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column3.getRoles()).isNullOrEmpty();
        assertThat(column3.isReftext()).isFalse();
        assertThat(column3.getReftext()).isNull();
        assertThat(column3.getStyle()).isEqualTo("header");
        assertThat(column3.getTable()).isSameAs(table1);
        assertThat(column3.getColumnNumber()).isEqualTo(3);
        assertThat(column3.getWidth()).isEqualTo(1);
        assertThat(column3.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column3.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column4 = (Column) table1.getColumns()
                .get(3);
        assertThat(column4.getId()).isNull();
        assertThat(column4.getNodeName()).isEqualTo("column");
        assertThat(column4.getParent()).isSameAs(table1);
        assertThat(column4.getContext()).isEqualTo("column");
        assertThat(column4.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column4.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column4.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column4.getAttributes()).containsEntry("colnumber", 4L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column4.getRoles()).isNullOrEmpty();
        assertThat(column4.isReftext()).isFalse();
        assertThat(column4.getReftext()).isNull();
        assertThat(column4.getStyle()).isEqualTo("literal");
        assertThat(column4.getTable()).isSameAs(table1);
        assertThat(column4.getColumnNumber()).isEqualTo(4);
        assertThat(column4.getWidth()).isEqualTo(1);
        assertThat(column4.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column4.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column5 = (Column) table1.getColumns()
                .get(4);
        assertThat(column5.getId()).isNull();
        assertThat(column5.getNodeName()).isEqualTo("column");
        assertThat(column5.getParent()).isSameAs(table1);
        assertThat(column5.getContext()).isEqualTo("column");
        assertThat(column5.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column5.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column5.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column5.getAttributes()).containsEntry("colnumber", 5L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column5.getRoles()).isNullOrEmpty();
        assertThat(column5.isReftext()).isFalse();
        assertThat(column5.getReftext()).isNull();
        assertThat(column5.getStyle()).isEqualTo("monospaced");
        assertThat(column5.getTable()).isSameAs(table1);
        assertThat(column5.getColumnNumber()).isEqualTo(5);
        assertThat(column5.getWidth()).isEqualTo(1);
        assertThat(column5.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column5.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column6 = (Column) table1.getColumns()
                .get(5);
        assertThat(column6.getId()).isNull();
        assertThat(column6.getNodeName()).isEqualTo("column");
        assertThat(column6.getParent()).isSameAs(table1);
        assertThat(column6.getContext()).isEqualTo("column");
        assertThat(column6.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column6.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column6.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column6.getAttributes()).containsEntry("colnumber", 6L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column6.getRoles()).isNullOrEmpty();
        assertThat(column6.isReftext()).isFalse();
        assertThat(column6.getReftext()).isNull();
        assertThat(column6.getStyle()).isEqualTo("none");
        assertThat(column6.getTable()).isSameAs(table1);
        assertThat(column6.getColumnNumber()).isEqualTo(6);
        assertThat(column6.getWidth()).isEqualTo(1);
        assertThat(column6.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column6.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column7 = (Column) table1.getColumns()
                .get(6);
        assertThat(column7.getId()).isNull();
        assertThat(column7.getNodeName()).isEqualTo("column");
        assertThat(column7.getParent()).isSameAs(table1);
        assertThat(column7.getContext()).isEqualTo("column");
        assertThat(column7.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column7.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column7.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column7.getAttributes()).containsEntry("colnumber", 7L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column7.getRoles()).isNullOrEmpty();
        assertThat(column7.isReftext()).isFalse();
        assertThat(column7.getReftext()).isNull();
        assertThat(column7.getStyle()).isEqualTo("strong");
        assertThat(column7.getTable()).isSameAs(table1);
        assertThat(column7.getColumnNumber()).isEqualTo(7);
        assertThat(column7.getWidth()).isEqualTo(1);
        assertThat(column7.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column7.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Column column8 = (Column) table1.getColumns()
                .get(7);
        assertThat(column8.getId()).isNull();
        assertThat(column8.getNodeName()).isEqualTo("column");
        assertThat(column8.getParent()).isSameAs(table1);
        assertThat(column8.getContext()).isEqualTo("column");
        assertThat(column8.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            column8.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            column8.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(column8.getAttributes()).containsEntry("colnumber", 8L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(column8.getRoles()).isNullOrEmpty();
        assertThat(column8.isReftext()).isFalse();
        assertThat(column8.getReftext()).isNull();
        assertThat(column8.getStyle()).isEqualTo("verse");
        assertThat(column8.getTable()).isSameAs(table1);
        assertThat(column8.getColumnNumber()).isEqualTo(8);
        assertThat(column8.getWidth()).isEqualTo(1);
        assertThat(column8.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(column8.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(table1.getHeader()).isNullOrEmpty();
        assertThat(table1.getFooter()).isNullOrEmpty();
        assertThat(table1.getBody()).hasSize(2);
        Row row1 = (Row) table1.getBody()
                .get(0);
        assertThat(row1.getCells()).hasSize(8);
        Cell cell1 = (Cell) row1.getCells()
                .get(0);
        assertThat(cell1.getId()).isNull();
        assertThat(cell1.getNodeName()).isEqualTo("cell");
        assertThat(cell1.getParent()).isSameAs(column1);
        assertThat(cell1.getContext()).isEqualTo("cell");
        assertThat(cell1.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell1.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell1.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell1.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell1.getRoles()).isNullOrEmpty();
        assertThat(cell1.isReftext()).isFalse();
        assertThat(cell1.getReftext()).isNull();
        assertThat(cell1.getColumn()).isSameAs(column1);
        assertThat(cell1.getColspan()).isEqualTo(0);
        assertThat(cell1.getRowspan()).isEqualTo(0);
        assertThat(cell1.getText()).isEqualTo("Cell in column 1, row 1");
        assertThat(cell1.getSource()).isEqualTo("Cell in column 1, row 1");
        assertThat(cell1.getStyle()).isEqualTo("asciidoc");
        assertThat(cell1.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell1.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Document document2 = cell1.getInnerDocument();
        assertThat(document2.getId()).isNull();
        assertThat(document2.getNodeName()).isEqualTo("document");
        assertThat(document2.getParent()).isNull();
        assertThat(document2.getContext()).isEqualTo("document");
        assertThat(document2.getDocument()).isSameAs(document2);
        assertThat(document2.isInline()).isFalse();
        assertThat(document2.isBlock()).isTrue();
        assertThat(document2.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document2.getRoles()).isNullOrEmpty();
        assertThat(document2.isReftext()).isFalse();
        assertThat(document2.getReftext()).isNull();
        assertThat(document2.getCaption()).isNull();
        assertThat(document2.getTitle()).isNull();
        assertThat(document2.getStyle()).isNull();
        assertThat(document2.getLevel()).isEqualTo(0);
        assertThat(document2.getContentModel()).isEqualTo("compound");
        assertThat(document2.getSourceLocation()).isNull();
        assertThat(document2.getSubstitutions()).isNullOrEmpty();
        assertThat(document2.getBlocks()).hasSize(1);
        Block block1 = (Block) document2.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("paragraph");
        assertThat(block1.getParent()).isSameAs(document2);
        assertThat(block1.getContext()).isEqualTo("paragraph");
        assertThat(block1.getDocument()).isSameAs(document2);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).isNullOrEmpty();
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isNull();
        assertThat(block1.getTitle()).isNull();
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("simple");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).containsExactly("Cell in column 1, row 1");
        assertThat(block1.getSource()).isEqualTo("Cell in column 1, row 1");
        assertThat(document2.getStructuredDoctitle()).isNull();
        assertThat(document2.getDoctitle()).isNull();
        assertThat(document2.getOptions()).containsEntry("header_footer", false);
        Cell cell2 = (Cell) row1.getCells()
                .get(1);
        assertThat(cell2.getId()).isNull();
        assertThat(cell2.getNodeName()).isEqualTo("cell");
        assertThat(cell2.getParent()).isSameAs(column2);
        assertThat(cell2.getContext()).isEqualTo("cell");
        assertThat(cell2.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell2.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell2.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell2.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell2.getRoles()).isNullOrEmpty();
        assertThat(cell2.isReftext()).isFalse();
        assertThat(cell2.getReftext()).isNull();
        assertThat(cell2.getColumn()).isSameAs(column2);
        assertThat(cell2.getColspan()).isEqualTo(0);
        assertThat(cell2.getRowspan()).isEqualTo(0);
        assertThat(cell2.getText()).isEqualTo("Cell in column 2, row 1");
        assertThat(cell2.getSource()).isEqualTo("Cell in column 2, row 1");
        assertThat(cell2.getStyle()).isEqualTo("emphasis");
        assertThat(cell2.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell2.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell2.getInnerDocument()).isNull();
        Cell cell3 = (Cell) row1.getCells()
                .get(2);
        assertThat(cell3.getId()).isNull();
        assertThat(cell3.getNodeName()).isEqualTo("cell");
        assertThat(cell3.getParent()).isSameAs(column3);
        assertThat(cell3.getContext()).isEqualTo("cell");
        assertThat(cell3.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell3.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell3.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell3.getAttributes()).containsEntry("colnumber", 3L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell3.getRoles()).isNullOrEmpty();
        assertThat(cell3.isReftext()).isFalse();
        assertThat(cell3.getReftext()).isNull();
        assertThat(cell3.getColumn()).isSameAs(column3);
        assertThat(cell3.getColspan()).isEqualTo(0);
        assertThat(cell3.getRowspan()).isEqualTo(0);
        assertThat(cell3.getText()).isEqualTo("Cell in column 3, row 1");
        assertThat(cell3.getSource()).isEqualTo("Cell in column 3, row 1");
        assertThat(cell3.getStyle()).isEqualTo("header");
        assertThat(cell3.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell3.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell3.getInnerDocument()).isNull();
        Cell cell4 = (Cell) row1.getCells()
                .get(3);
        assertThat(cell4.getId()).isNull();
        assertThat(cell4.getNodeName()).isEqualTo("cell");
        assertThat(cell4.getParent()).isSameAs(column4);
        assertThat(cell4.getContext()).isEqualTo("cell");
        assertThat(cell4.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell4.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell4.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell4.getAttributes()).containsEntry("colnumber", 4L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell4.getRoles()).isNullOrEmpty();
        assertThat(cell4.isReftext()).isFalse();
        assertThat(cell4.getReftext()).isNull();
        assertThat(cell4.getColumn()).isSameAs(column4);
        assertThat(cell4.getColspan()).isEqualTo(0);
        assertThat(cell4.getRowspan()).isEqualTo(0);
        assertThat(cell4.getText()).isEqualTo("Cell in column 4, row 1");
        assertThat(cell4.getSource()).isEqualTo("Cell in column 4, row 1");
        assertThat(cell4.getStyle()).isEqualTo("literal");
        assertThat(cell4.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell4.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell4.getInnerDocument()).isNull();
        Cell cell5 = (Cell) row1.getCells()
                .get(4);
        assertThat(cell5.getId()).isNull();
        assertThat(cell5.getNodeName()).isEqualTo("cell");
        assertThat(cell5.getParent()).isSameAs(column5);
        assertThat(cell5.getContext()).isEqualTo("cell");
        assertThat(cell5.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell5.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell5.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell5.getAttributes()).containsEntry("colnumber", 5L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell5.getRoles()).isNullOrEmpty();
        assertThat(cell5.isReftext()).isFalse();
        assertThat(cell5.getReftext()).isNull();
        assertThat(cell5.getColumn()).isSameAs(column5);
        assertThat(cell5.getColspan()).isEqualTo(0);
        assertThat(cell5.getRowspan()).isEqualTo(0);
        assertThat(cell5.getText()).isEqualTo("Cell in column 5, row 1");
        assertThat(cell5.getSource()).isEqualTo("Cell in column 5, row 1");
        assertThat(cell5.getStyle()).isEqualTo("monospaced");
        assertThat(cell5.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell5.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell5.getInnerDocument()).isNull();
        Cell cell6 = (Cell) row1.getCells()
                .get(5);
        assertThat(cell6.getId()).isNull();
        assertThat(cell6.getNodeName()).isEqualTo("cell");
        assertThat(cell6.getParent()).isSameAs(column6);
        assertThat(cell6.getContext()).isEqualTo("cell");
        assertThat(cell6.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell6.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell6.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell6.getAttributes()).containsEntry("colnumber", 6L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell6.getRoles()).isNullOrEmpty();
        assertThat(cell6.isReftext()).isFalse();
        assertThat(cell6.getReftext()).isNull();
        assertThat(cell6.getColumn()).isSameAs(column6);
        assertThat(cell6.getColspan()).isEqualTo(0);
        assertThat(cell6.getRowspan()).isEqualTo(0);
        assertThat(cell6.getText()).isEqualTo("Cell in column 6, row 1");
        assertThat(cell6.getSource()).isEqualTo("Cell in column 6, row 1");
        assertThat(cell6.getStyle()).isEqualTo("none");
        assertThat(cell6.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell6.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell6.getInnerDocument()).isNull();
        Cell cell7 = (Cell) row1.getCells()
                .get(6);
        assertThat(cell7.getId()).isNull();
        assertThat(cell7.getNodeName()).isEqualTo("cell");
        assertThat(cell7.getParent()).isSameAs(column7);
        assertThat(cell7.getContext()).isEqualTo("cell");
        assertThat(cell7.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell7.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell7.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell7.getAttributes()).containsEntry("colnumber", 7L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell7.getRoles()).isNullOrEmpty();
        assertThat(cell7.isReftext()).isFalse();
        assertThat(cell7.getReftext()).isNull();
        assertThat(cell7.getColumn()).isSameAs(column7);
        assertThat(cell7.getColspan()).isEqualTo(0);
        assertThat(cell7.getRowspan()).isEqualTo(0);
        assertThat(cell7.getText()).isEqualTo("Cell in column 7, row 1");
        assertThat(cell7.getSource()).isEqualTo("Cell in column 7, row 1");
        assertThat(cell7.getStyle()).isEqualTo("strong");
        assertThat(cell7.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell7.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell7.getInnerDocument()).isNull();
        Cell cell8 = (Cell) row1.getCells()
                .get(7);
        assertThat(cell8.getId()).isNull();
        assertThat(cell8.getNodeName()).isEqualTo("cell");
        assertThat(cell8.getParent()).isSameAs(column8);
        assertThat(cell8.getContext()).isEqualTo("cell");
        assertThat(cell8.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell8.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell8.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell8.getAttributes()).containsEntry("colnumber", 8L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell8.getRoles()).isNullOrEmpty();
        assertThat(cell8.isReftext()).isFalse();
        assertThat(cell8.getReftext()).isNull();
        assertThat(cell8.getColumn()).isSameAs(column8);
        assertThat(cell8.getColspan()).isEqualTo(0);
        assertThat(cell8.getRowspan()).isEqualTo(0);
        assertThat(cell8.getText()).isEqualTo("Cell in column 8, row 1");
        assertThat(cell8.getSource()).isEqualTo("Cell in column 8, row 1");
        assertThat(cell8.getStyle()).isEqualTo("verse");
        assertThat(cell8.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell8.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell8.getInnerDocument()).isNull();
        Row row2 = (Row) table1.getBody()
                .get(1);
        assertThat(row2.getCells()).hasSize(8);
        Cell cell9 = (Cell) row2.getCells()
                .get(0);
        assertThat(cell9.getId()).isNull();
        assertThat(cell9.getNodeName()).isEqualTo("cell");
        assertThat(cell9.getParent()).isSameAs(column1);
        assertThat(cell9.getContext()).isEqualTo("cell");
        assertThat(cell9.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell9.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell9.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell9.getAttributes()).containsEntry("colnumber", 1L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell9.getRoles()).isNullOrEmpty();
        assertThat(cell9.isReftext()).isFalse();
        assertThat(cell9.getReftext()).isNull();
        assertThat(cell9.getColumn()).isSameAs(column1);
        assertThat(cell9.getColspan()).isEqualTo(0);
        assertThat(cell9.getRowspan()).isEqualTo(0);
        assertThat(cell9.getText()).isEqualTo("Cell in column 1, row 2");
        assertThat(cell9.getSource()).isEqualTo("Cell in column 1, row 2");
        assertThat(cell9.getStyle()).isEqualTo("asciidoc");
        assertThat(cell9.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell9.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        Document document3 = cell9.getInnerDocument();
        assertThat(document3.getId()).isNull();
        assertThat(document3.getNodeName()).isEqualTo("document");
        assertThat(document3.getParent()).isNull();
        assertThat(document3.getContext()).isEqualTo("document");
        assertThat(document3.getDocument()).isSameAs(document3);
        assertThat(document3.isInline()).isFalse();
        assertThat(document3.isBlock()).isTrue();
        assertThat(document3.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document3.getRoles()).isNullOrEmpty();
        assertThat(document3.isReftext()).isFalse();
        assertThat(document3.getReftext()).isNull();
        assertThat(document3.getCaption()).isNull();
        assertThat(document3.getTitle()).isNull();
        assertThat(document3.getStyle()).isNull();
        assertThat(document3.getLevel()).isEqualTo(0);
        assertThat(document3.getContentModel()).isEqualTo("compound");
        assertThat(document3.getSourceLocation()).isNull();
        assertThat(document3.getSubstitutions()).isNullOrEmpty();
        assertThat(document3.getBlocks()).hasSize(1);
        Block block2 = (Block) document3.getBlocks()
                .get(0);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(document3);
        assertThat(block2.getContext()).isEqualTo("paragraph");
        assertThat(block2.getDocument()).isSameAs(document3);
        assertThat(block2.isInline()).isFalse();
        assertThat(block2.isBlock()).isTrue();
        assertThat(block2.getAttributes()).isNullOrEmpty();
        assertThat(block2.getRoles()).isNullOrEmpty();
        assertThat(block2.isReftext()).isFalse();
        assertThat(block2.getReftext()).isNull();
        assertThat(block2.getCaption()).isNull();
        assertThat(block2.getTitle()).isNull();
        assertThat(block2.getStyle()).isNull();
        assertThat(block2.getLevel()).isEqualTo(0);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Cell in column 1, row 2");
        assertThat(block2.getSource()).isEqualTo("Cell in column 1, row 2");
        assertThat(document3.getStructuredDoctitle()).isNull();
        assertThat(document3.getDoctitle()).isNull();
        assertThat(document3.getOptions()).containsEntry("header_footer", false);
        Cell cell10 = (Cell) row2.getCells()
                .get(1);
        assertThat(cell10.getId()).isNull();
        assertThat(cell10.getNodeName()).isEqualTo("cell");
        assertThat(cell10.getParent()).isSameAs(column2);
        assertThat(cell10.getContext()).isEqualTo("cell");
        assertThat(cell10.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell10.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell10.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell10.getAttributes()).containsEntry("colnumber", 2L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell10.getRoles()).isNullOrEmpty();
        assertThat(cell10.isReftext()).isFalse();
        assertThat(cell10.getReftext()).isNull();
        assertThat(cell10.getColumn()).isSameAs(column2);
        assertThat(cell10.getColspan()).isEqualTo(0);
        assertThat(cell10.getRowspan()).isEqualTo(0);
        assertThat(cell10.getText()).isEqualTo("Cell in column 2, row 2");
        assertThat(cell10.getSource()).isEqualTo("Cell in column 2, row 2");
        assertThat(cell10.getStyle()).isEqualTo("emphasis");
        assertThat(cell10.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell10.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell10.getInnerDocument()).isNull();
        Cell cell11 = (Cell) row2.getCells()
                .get(2);
        assertThat(cell11.getId()).isNull();
        assertThat(cell11.getNodeName()).isEqualTo("cell");
        assertThat(cell11.getParent()).isSameAs(column3);
        assertThat(cell11.getContext()).isEqualTo("cell");
        assertThat(cell11.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell11.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell11.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell11.getAttributes()).containsEntry("colnumber", 3L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell11.getRoles()).isNullOrEmpty();
        assertThat(cell11.isReftext()).isFalse();
        assertThat(cell11.getReftext()).isNull();
        assertThat(cell11.getColumn()).isSameAs(column3);
        assertThat(cell11.getColspan()).isEqualTo(0);
        assertThat(cell11.getRowspan()).isEqualTo(0);
        assertThat(cell11.getText()).isEqualTo("Cell in column 3, row 2");
        assertThat(cell11.getSource()).isEqualTo("Cell in column 3, row 2");
        assertThat(cell11.getStyle()).isEqualTo("header");
        assertThat(cell11.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell11.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell11.getInnerDocument()).isNull();
        Cell cell12 = (Cell) row2.getCells()
                .get(3);
        assertThat(cell12.getId()).isNull();
        assertThat(cell12.getNodeName()).isEqualTo("cell");
        assertThat(cell12.getParent()).isSameAs(column4);
        assertThat(cell12.getContext()).isEqualTo("cell");
        assertThat(cell12.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell12.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell12.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell12.getAttributes()).containsEntry("colnumber", 4L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell12.getRoles()).isNullOrEmpty();
        assertThat(cell12.isReftext()).isFalse();
        assertThat(cell12.getReftext()).isNull();
        assertThat(cell12.getColumn()).isSameAs(column4);
        assertThat(cell12.getColspan()).isEqualTo(0);
        assertThat(cell12.getRowspan()).isEqualTo(0);
        assertThat(cell12.getText()).isEqualTo("Cell in column 4, row 2");
        assertThat(cell12.getSource()).isEqualTo("Cell in column 4, row 2");
        assertThat(cell12.getStyle()).isEqualTo("literal");
        assertThat(cell12.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell12.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell12.getInnerDocument()).isNull();
        Cell cell13 = (Cell) row2.getCells()
                .get(4);
        assertThat(cell13.getId()).isNull();
        assertThat(cell13.getNodeName()).isEqualTo("cell");
        assertThat(cell13.getParent()).isSameAs(column5);
        assertThat(cell13.getContext()).isEqualTo("cell");
        assertThat(cell13.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell13.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell13.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell13.getAttributes()).containsEntry("colnumber", 5L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell13.getRoles()).isNullOrEmpty();
        assertThat(cell13.isReftext()).isFalse();
        assertThat(cell13.getReftext()).isNull();
        assertThat(cell13.getColumn()).isSameAs(column5);
        assertThat(cell13.getColspan()).isEqualTo(0);
        assertThat(cell13.getRowspan()).isEqualTo(0);
        assertThat(cell13.getText()).isEqualTo("Cell in column 5, row 2");
        assertThat(cell13.getSource()).isEqualTo("Cell in column 5, row 2");
        assertThat(cell13.getStyle()).isEqualTo("monospaced");
        assertThat(cell13.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell13.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell13.getInnerDocument()).isNull();
        Cell cell14 = (Cell) row2.getCells()
                .get(5);
        assertThat(cell14.getId()).isNull();
        assertThat(cell14.getNodeName()).isEqualTo("cell");
        assertThat(cell14.getParent()).isSameAs(column6);
        assertThat(cell14.getContext()).isEqualTo("cell");
        assertThat(cell14.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell14.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell14.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell14.getAttributes()).containsEntry("colnumber", 6L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell14.getRoles()).isNullOrEmpty();
        assertThat(cell14.isReftext()).isFalse();
        assertThat(cell14.getReftext()).isNull();
        assertThat(cell14.getColumn()).isSameAs(column6);
        assertThat(cell14.getColspan()).isEqualTo(0);
        assertThat(cell14.getRowspan()).isEqualTo(0);
        assertThat(cell14.getText()).isEqualTo("Cell in column 6, row 2");
        assertThat(cell14.getSource()).isEqualTo("Cell in column 6, row 2");
        assertThat(cell14.getStyle()).isEqualTo("none");
        assertThat(cell14.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell14.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell14.getInnerDocument()).isNull();
        Cell cell15 = (Cell) row2.getCells()
                .get(6);
        assertThat(cell15.getId()).isNull();
        assertThat(cell15.getNodeName()).isEqualTo("cell");
        assertThat(cell15.getParent()).isSameAs(column7);
        assertThat(cell15.getContext()).isEqualTo("cell");
        assertThat(cell15.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell15.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell15.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell15.getAttributes()).containsEntry("colnumber", 7L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell15.getRoles()).isNullOrEmpty();
        assertThat(cell15.isReftext()).isFalse();
        assertThat(cell15.getReftext()).isNull();
        assertThat(cell15.getColumn()).isSameAs(column7);
        assertThat(cell15.getColspan()).isEqualTo(0);
        assertThat(cell15.getRowspan()).isEqualTo(0);
        assertThat(cell15.getText()).isEqualTo("Cell in column 7, row 2");
        assertThat(cell15.getSource()).isEqualTo("Cell in column 7, row 2");
        assertThat(cell15.getStyle()).isEqualTo("strong");
        assertThat(cell15.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell15.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell15.getInnerDocument()).isNull();
        Cell cell16 = (Cell) row2.getCells()
                .get(7);
        assertThat(cell16.getId()).isNull();
        assertThat(cell16.getNodeName()).isEqualTo("cell");
        assertThat(cell16.getParent()).isSameAs(column8);
        assertThat(cell16.getContext()).isEqualTo("cell");
        assertThat(cell16.getDocument()).isSameAs(document1);
        assertThatThrownBy(() -> {
            cell16.isInline();
        }).hasMessageContaining("NotImplementedError");
        assertThatThrownBy(() -> {
            cell16.isBlock();
        }).hasMessageContaining("NotImplementedError");
        assertThat(cell16.getAttributes()).containsEntry("colnumber", 8L)
                .containsEntry("colpcwidth", 12.5)
                .containsEntry("halign", "left")
                .containsEntry("valign", "top")
                .containsEntry("width", 1L);
        assertThat(cell16.getRoles()).isNullOrEmpty();
        assertThat(cell16.isReftext()).isFalse();
        assertThat(cell16.getReftext()).isNull();
        assertThat(cell16.getColumn()).isSameAs(column8);
        assertThat(cell16.getColspan()).isEqualTo(0);
        assertThat(cell16.getRowspan()).isEqualTo(0);
        assertThat(cell16.getText()).isEqualTo("Cell in column 8, row 2");
        assertThat(cell16.getSource()).isEqualTo("Cell in column 8, row 2");
        assertThat(cell16.getStyle()).isEqualTo("verse");
        assertThat(cell16.getHorizontalAlignment()).isEqualTo(Table.HorizontalAlignment.LEFT);
        assertThat(cell16.getVerticalAlignment()).isEqualTo(Table.VerticalAlignment.TOP);
        assertThat(cell16.getInnerDocument()).isNull();
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
        map1.put("doctype", "article");
        map1.put("example-caption", "Example");
        map1.put("figure-caption", "Figure");
        map1.put("filetype", "html");
        map1.put("notitle", "");
        map1.put("prewrap", "");
        map1.put("table-caption", "Table");
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
        map2.put("colcount", 8L);
        map2.put("cols", "a,e,h,l,m,d,s,v");
        map2.put("rowcount", 2L);
        map2.put("style", "table");
        map2.put("tablepcwidth", 100L);
        when(mockTable1.getAttributes()).thenReturn(map2);
        when(mockTable1.getRoles()).thenReturn(Collections.emptyList());
        when(mockTable1.isReftext()).thenReturn(false);
        when(mockTable1.getReftext()).thenReturn(null);
        when(mockTable1.getCaption()).thenReturn(null);
        when(mockTable1.getTitle()).thenReturn(null);
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
        map3.put("colpcwidth", 12.5);
        map3.put("halign", "left");
        map3.put("style", "asciidoc");
        map3.put("valign", "top");
        map3.put("width", 1L);
        when(mockColumn1.getAttributes()).thenReturn(map3);
        when(mockColumn1.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn1.isReftext()).thenReturn(false);
        when(mockColumn1.getReftext()).thenReturn(null);
        when(mockColumn1.getStyle()).thenReturn("asciidoc");
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
        map4.put("colpcwidth", 12.5);
        map4.put("halign", "left");
        map4.put("style", "emphasis");
        map4.put("valign", "top");
        map4.put("width", 1L);
        when(mockColumn2.getAttributes()).thenReturn(map4);
        when(mockColumn2.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn2.isReftext()).thenReturn(false);
        when(mockColumn2.getReftext()).thenReturn(null);
        when(mockColumn2.getStyle()).thenReturn("emphasis");
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
        map5.put("colpcwidth", 12.5);
        map5.put("halign", "left");
        map5.put("style", "header");
        map5.put("valign", "top");
        map5.put("width", 1L);
        when(mockColumn3.getAttributes()).thenReturn(map5);
        when(mockColumn3.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn3.isReftext()).thenReturn(false);
        when(mockColumn3.getReftext()).thenReturn(null);
        when(mockColumn3.getStyle()).thenReturn("header");
        when(mockColumn3.getTable()).thenReturn(mockTable1);
        when(mockColumn3.getColumnNumber()).thenReturn(3);
        when(mockColumn3.getWidth()).thenReturn(1);
        when(mockColumn3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn4 = mock(Column.class);
        when(mockColumn4.getId()).thenReturn(null);
        when(mockColumn4.getNodeName()).thenReturn("column");
        when(mockColumn4.getParent()).thenReturn(mockTable1);
        when(mockColumn4.getContext()).thenReturn("column");
        when(mockColumn4.getDocument()).thenReturn(mockDocument1);
        when(mockColumn4.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn4.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map6 = new HashMap<>();
        map6.put("colnumber", 4L);
        map6.put("colpcwidth", 12.5);
        map6.put("halign", "left");
        map6.put("style", "literal");
        map6.put("valign", "top");
        map6.put("width", 1L);
        when(mockColumn4.getAttributes()).thenReturn(map6);
        when(mockColumn4.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn4.isReftext()).thenReturn(false);
        when(mockColumn4.getReftext()).thenReturn(null);
        when(mockColumn4.getStyle()).thenReturn("literal");
        when(mockColumn4.getTable()).thenReturn(mockTable1);
        when(mockColumn4.getColumnNumber()).thenReturn(4);
        when(mockColumn4.getWidth()).thenReturn(1);
        when(mockColumn4.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn4.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn5 = mock(Column.class);
        when(mockColumn5.getId()).thenReturn(null);
        when(mockColumn5.getNodeName()).thenReturn("column");
        when(mockColumn5.getParent()).thenReturn(mockTable1);
        when(mockColumn5.getContext()).thenReturn("column");
        when(mockColumn5.getDocument()).thenReturn(mockDocument1);
        when(mockColumn5.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn5.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map7 = new HashMap<>();
        map7.put("colnumber", 5L);
        map7.put("colpcwidth", 12.5);
        map7.put("halign", "left");
        map7.put("style", "monospaced");
        map7.put("valign", "top");
        map7.put("width", 1L);
        when(mockColumn5.getAttributes()).thenReturn(map7);
        when(mockColumn5.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn5.isReftext()).thenReturn(false);
        when(mockColumn5.getReftext()).thenReturn(null);
        when(mockColumn5.getStyle()).thenReturn("monospaced");
        when(mockColumn5.getTable()).thenReturn(mockTable1);
        when(mockColumn5.getColumnNumber()).thenReturn(5);
        when(mockColumn5.getWidth()).thenReturn(1);
        when(mockColumn5.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn5.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn6 = mock(Column.class);
        when(mockColumn6.getId()).thenReturn(null);
        when(mockColumn6.getNodeName()).thenReturn("column");
        when(mockColumn6.getParent()).thenReturn(mockTable1);
        when(mockColumn6.getContext()).thenReturn("column");
        when(mockColumn6.getDocument()).thenReturn(mockDocument1);
        when(mockColumn6.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn6.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map8 = new HashMap<>();
        map8.put("colnumber", 6L);
        map8.put("colpcwidth", 12.5);
        map8.put("halign", "left");
        map8.put("style", "none");
        map8.put("valign", "top");
        map8.put("width", 1L);
        when(mockColumn6.getAttributes()).thenReturn(map8);
        when(mockColumn6.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn6.isReftext()).thenReturn(false);
        when(mockColumn6.getReftext()).thenReturn(null);
        when(mockColumn6.getStyle()).thenReturn("none");
        when(mockColumn6.getTable()).thenReturn(mockTable1);
        when(mockColumn6.getColumnNumber()).thenReturn(6);
        when(mockColumn6.getWidth()).thenReturn(1);
        when(mockColumn6.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn6.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn7 = mock(Column.class);
        when(mockColumn7.getId()).thenReturn(null);
        when(mockColumn7.getNodeName()).thenReturn("column");
        when(mockColumn7.getParent()).thenReturn(mockTable1);
        when(mockColumn7.getContext()).thenReturn("column");
        when(mockColumn7.getDocument()).thenReturn(mockDocument1);
        when(mockColumn7.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn7.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map9 = new HashMap<>();
        map9.put("colnumber", 7L);
        map9.put("colpcwidth", 12.5);
        map9.put("halign", "left");
        map9.put("style", "strong");
        map9.put("valign", "top");
        map9.put("width", 1L);
        when(mockColumn7.getAttributes()).thenReturn(map9);
        when(mockColumn7.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn7.isReftext()).thenReturn(false);
        when(mockColumn7.getReftext()).thenReturn(null);
        when(mockColumn7.getStyle()).thenReturn("strong");
        when(mockColumn7.getTable()).thenReturn(mockTable1);
        when(mockColumn7.getColumnNumber()).thenReturn(7);
        when(mockColumn7.getWidth()).thenReturn(1);
        when(mockColumn7.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn7.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Column mockColumn8 = mock(Column.class);
        when(mockColumn8.getId()).thenReturn(null);
        when(mockColumn8.getNodeName()).thenReturn("column");
        when(mockColumn8.getParent()).thenReturn(mockTable1);
        when(mockColumn8.getContext()).thenReturn("column");
        when(mockColumn8.getDocument()).thenReturn(mockDocument1);
        when(mockColumn8.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockColumn8.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map10 = new HashMap<>();
        map10.put("colnumber", 8L);
        map10.put("colpcwidth", 12.5);
        map10.put("halign", "left");
        map10.put("style", "verse");
        map10.put("valign", "top");
        map10.put("width", 1L);
        when(mockColumn8.getAttributes()).thenReturn(map10);
        when(mockColumn8.getRoles()).thenReturn(Collections.emptyList());
        when(mockColumn8.isReftext()).thenReturn(false);
        when(mockColumn8.getReftext()).thenReturn(null);
        when(mockColumn8.getStyle()).thenReturn("verse");
        when(mockColumn8.getTable()).thenReturn(mockTable1);
        when(mockColumn8.getColumnNumber()).thenReturn(8);
        when(mockColumn8.getWidth()).thenReturn(1);
        when(mockColumn8.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockColumn8.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockTable1.getColumns()).thenReturn(Arrays.asList(mockColumn1, mockColumn2, mockColumn3, mockColumn4, mockColumn5, mockColumn6, mockColumn7, mockColumn8));
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
        Map<String, Object> map11 = new HashMap<>();
        map11.put("colnumber", 1L);
        map11.put("colpcwidth", 12.5);
        map11.put("halign", "left");
        map11.put("style", "asciidoc");
        map11.put("valign", "top");
        map11.put("width", 1L);
        when(mockCell1.getAttributes()).thenReturn(map11);
        when(mockCell1.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell1.isReftext()).thenReturn(false);
        when(mockCell1.getReftext()).thenReturn(null);
        when(mockCell1.getColumn()).thenReturn(mockColumn1);
        when(mockCell1.getColspan()).thenReturn(0);
        when(mockCell1.getRowspan()).thenReturn(0);
        when(mockCell1.getText()).thenReturn("Cell in column 1, row 1");
        when(mockCell1.getSource()).thenReturn("Cell in column 1, row 1");
        when(mockCell1.getStyle()).thenReturn("asciidoc");
        when(mockCell1.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell1.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Document mockDocument2 = mock(Document.class);
        when(mockDocument2.getId()).thenReturn(null);
        when(mockDocument2.getNodeName()).thenReturn("document");
        when(mockDocument2.getParent()).thenReturn(null);
        when(mockDocument2.getContext()).thenReturn("document");
        when(mockDocument2.getDocument()).thenReturn(mockDocument2);
        when(mockDocument2.isInline()).thenReturn(false);
        when(mockDocument2.isBlock()).thenReturn(true);
        Map<String, Object> map12 = new HashMap<>();
        map12.put("doctype", "article");
        map12.put("example-caption", "Example");
        map12.put("figure-caption", "Figure");
        map12.put("filetype", "html");
        map12.put("notitle", "");
        map12.put("prewrap", "");
        map12.put("table-caption", "Table");
        when(mockDocument2.getAttributes()).thenReturn(map12);
        when(mockDocument2.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument2.isReftext()).thenReturn(false);
        when(mockDocument2.getReftext()).thenReturn(null);
        when(mockDocument2.getCaption()).thenReturn(null);
        when(mockDocument2.getTitle()).thenReturn(null);
        when(mockDocument2.getStyle()).thenReturn(null);
        when(mockDocument2.getLevel()).thenReturn(0);
        when(mockDocument2.getContentModel()).thenReturn("compound");
        when(mockDocument2.getSourceLocation()).thenReturn(null);
        when(mockDocument2.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("paragraph");
        when(mockBlock1.getParent()).thenReturn(mockDocument2);
        when(mockBlock1.getContext()).thenReturn("paragraph");
        when(mockBlock1.getDocument()).thenReturn(mockDocument2);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        when(mockBlock1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn(null);
        when(mockBlock1.getStyle()).thenReturn(null);
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn("simple");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Cell in column 1, row 1"));
        when(mockBlock1.getSource()).thenReturn("Cell in column 1, row 1");
        when(mockDocument2.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
        when(mockDocument2.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument2.getDoctitle()).thenReturn(null);
        Map<Object, Object> map13 = new HashMap<>();
        map13.put("cursor", "<stdin>: line 21");
        map13.put("header_footer", false);
        when(mockDocument2.getOptions()).thenReturn(map13);
        when(mockCell1.getInnerDocument()).thenReturn(mockDocument2);
        Cell mockCell2 = mock(Cell.class);
        when(mockCell2.getId()).thenReturn(null);
        when(mockCell2.getNodeName()).thenReturn("cell");
        when(mockCell2.getParent()).thenReturn(mockColumn2);
        when(mockCell2.getContext()).thenReturn("cell");
        when(mockCell2.getDocument()).thenReturn(mockDocument1);
        when(mockCell2.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell2.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map14 = new HashMap<>();
        map14.put("colnumber", 2L);
        map14.put("colpcwidth", 12.5);
        map14.put("halign", "left");
        map14.put("style", "emphasis");
        map14.put("valign", "top");
        map14.put("width", 1L);
        when(mockCell2.getAttributes()).thenReturn(map14);
        when(mockCell2.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell2.isReftext()).thenReturn(false);
        when(mockCell2.getReftext()).thenReturn(null);
        when(mockCell2.getColumn()).thenReturn(mockColumn2);
        when(mockCell2.getColspan()).thenReturn(0);
        when(mockCell2.getRowspan()).thenReturn(0);
        when(mockCell2.getText()).thenReturn("Cell in column 2, row 1");
        when(mockCell2.getSource()).thenReturn("Cell in column 2, row 1");
        when(mockCell2.getStyle()).thenReturn("emphasis");
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
        Map<String, Object> map15 = new HashMap<>();
        map15.put("colnumber", 3L);
        map15.put("colpcwidth", 12.5);
        map15.put("halign", "left");
        map15.put("style", "header");
        map15.put("valign", "top");
        map15.put("width", 1L);
        when(mockCell3.getAttributes()).thenReturn(map15);
        when(mockCell3.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell3.isReftext()).thenReturn(false);
        when(mockCell3.getReftext()).thenReturn(null);
        when(mockCell3.getColumn()).thenReturn(mockColumn3);
        when(mockCell3.getColspan()).thenReturn(0);
        when(mockCell3.getRowspan()).thenReturn(0);
        when(mockCell3.getText()).thenReturn("Cell in column 3, row 1");
        when(mockCell3.getSource()).thenReturn("Cell in column 3, row 1");
        when(mockCell3.getStyle()).thenReturn("header");
        when(mockCell3.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell3.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell3.getInnerDocument()).thenReturn(null);
        Cell mockCell4 = mock(Cell.class);
        when(mockCell4.getId()).thenReturn(null);
        when(mockCell4.getNodeName()).thenReturn("cell");
        when(mockCell4.getParent()).thenReturn(mockColumn4);
        when(mockCell4.getContext()).thenReturn("cell");
        when(mockCell4.getDocument()).thenReturn(mockDocument1);
        when(mockCell4.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell4.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map16 = new HashMap<>();
        map16.put("colnumber", 4L);
        map16.put("colpcwidth", 12.5);
        map16.put("halign", "left");
        map16.put("style", "literal");
        map16.put("valign", "top");
        map16.put("width", 1L);
        when(mockCell4.getAttributes()).thenReturn(map16);
        when(mockCell4.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell4.isReftext()).thenReturn(false);
        when(mockCell4.getReftext()).thenReturn(null);
        when(mockCell4.getColumn()).thenReturn(mockColumn4);
        when(mockCell4.getColspan()).thenReturn(0);
        when(mockCell4.getRowspan()).thenReturn(0);
        when(mockCell4.getText()).thenReturn("Cell in column 4, row 1");
        when(mockCell4.getSource()).thenReturn("Cell in column 4, row 1");
        when(mockCell4.getStyle()).thenReturn("literal");
        when(mockCell4.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell4.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell4.getInnerDocument()).thenReturn(null);
        Cell mockCell5 = mock(Cell.class);
        when(mockCell5.getId()).thenReturn(null);
        when(mockCell5.getNodeName()).thenReturn("cell");
        when(mockCell5.getParent()).thenReturn(mockColumn5);
        when(mockCell5.getContext()).thenReturn("cell");
        when(mockCell5.getDocument()).thenReturn(mockDocument1);
        when(mockCell5.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell5.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map17 = new HashMap<>();
        map17.put("colnumber", 5L);
        map17.put("colpcwidth", 12.5);
        map17.put("halign", "left");
        map17.put("style", "monospaced");
        map17.put("valign", "top");
        map17.put("width", 1L);
        when(mockCell5.getAttributes()).thenReturn(map17);
        when(mockCell5.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell5.isReftext()).thenReturn(false);
        when(mockCell5.getReftext()).thenReturn(null);
        when(mockCell5.getColumn()).thenReturn(mockColumn5);
        when(mockCell5.getColspan()).thenReturn(0);
        when(mockCell5.getRowspan()).thenReturn(0);
        when(mockCell5.getText()).thenReturn("Cell in column 5, row 1");
        when(mockCell5.getSource()).thenReturn("Cell in column 5, row 1");
        when(mockCell5.getStyle()).thenReturn("monospaced");
        when(mockCell5.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell5.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell5.getInnerDocument()).thenReturn(null);
        Cell mockCell6 = mock(Cell.class);
        when(mockCell6.getId()).thenReturn(null);
        when(mockCell6.getNodeName()).thenReturn("cell");
        when(mockCell6.getParent()).thenReturn(mockColumn6);
        when(mockCell6.getContext()).thenReturn("cell");
        when(mockCell6.getDocument()).thenReturn(mockDocument1);
        when(mockCell6.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell6.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map18 = new HashMap<>();
        map18.put("colnumber", 6L);
        map18.put("colpcwidth", 12.5);
        map18.put("halign", "left");
        map18.put("style", "none");
        map18.put("valign", "top");
        map18.put("width", 1L);
        when(mockCell6.getAttributes()).thenReturn(map18);
        when(mockCell6.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell6.isReftext()).thenReturn(false);
        when(mockCell6.getReftext()).thenReturn(null);
        when(mockCell6.getColumn()).thenReturn(mockColumn6);
        when(mockCell6.getColspan()).thenReturn(0);
        when(mockCell6.getRowspan()).thenReturn(0);
        when(mockCell6.getText()).thenReturn("Cell in column 6, row 1");
        when(mockCell6.getSource()).thenReturn("Cell in column 6, row 1");
        when(mockCell6.getStyle()).thenReturn("none");
        when(mockCell6.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell6.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell6.getInnerDocument()).thenReturn(null);
        Cell mockCell7 = mock(Cell.class);
        when(mockCell7.getId()).thenReturn(null);
        when(mockCell7.getNodeName()).thenReturn("cell");
        when(mockCell7.getParent()).thenReturn(mockColumn7);
        when(mockCell7.getContext()).thenReturn("cell");
        when(mockCell7.getDocument()).thenReturn(mockDocument1);
        when(mockCell7.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell7.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map19 = new HashMap<>();
        map19.put("colnumber", 7L);
        map19.put("colpcwidth", 12.5);
        map19.put("halign", "left");
        map19.put("style", "strong");
        map19.put("valign", "top");
        map19.put("width", 1L);
        when(mockCell7.getAttributes()).thenReturn(map19);
        when(mockCell7.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell7.isReftext()).thenReturn(false);
        when(mockCell7.getReftext()).thenReturn(null);
        when(mockCell7.getColumn()).thenReturn(mockColumn7);
        when(mockCell7.getColspan()).thenReturn(0);
        when(mockCell7.getRowspan()).thenReturn(0);
        when(mockCell7.getText()).thenReturn("Cell in column 7, row 1");
        when(mockCell7.getSource()).thenReturn("Cell in column 7, row 1");
        when(mockCell7.getStyle()).thenReturn("strong");
        when(mockCell7.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell7.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell7.getInnerDocument()).thenReturn(null);
        Cell mockCell8 = mock(Cell.class);
        when(mockCell8.getId()).thenReturn(null);
        when(mockCell8.getNodeName()).thenReturn("cell");
        when(mockCell8.getParent()).thenReturn(mockColumn8);
        when(mockCell8.getContext()).thenReturn("cell");
        when(mockCell8.getDocument()).thenReturn(mockDocument1);
        when(mockCell8.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell8.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map20 = new HashMap<>();
        map20.put("colnumber", 8L);
        map20.put("colpcwidth", 12.5);
        map20.put("halign", "left");
        map20.put("style", "verse");
        map20.put("valign", "top");
        map20.put("width", 1L);
        when(mockCell8.getAttributes()).thenReturn(map20);
        when(mockCell8.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell8.isReftext()).thenReturn(false);
        when(mockCell8.getReftext()).thenReturn(null);
        when(mockCell8.getColumn()).thenReturn(mockColumn8);
        when(mockCell8.getColspan()).thenReturn(0);
        when(mockCell8.getRowspan()).thenReturn(0);
        when(mockCell8.getText()).thenReturn("Cell in column 8, row 1");
        when(mockCell8.getSource()).thenReturn("Cell in column 8, row 1");
        when(mockCell8.getStyle()).thenReturn("verse");
        when(mockCell8.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell8.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell8.getInnerDocument()).thenReturn(null);
        when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1, mockCell2, mockCell3, mockCell4, mockCell5, mockCell6, mockCell7, mockCell8));
        Row mockRow2 = mock(Row.class);
        Cell mockCell9 = mock(Cell.class);
        when(mockCell9.getId()).thenReturn(null);
        when(mockCell9.getNodeName()).thenReturn("cell");
        when(mockCell9.getParent()).thenReturn(mockColumn1);
        when(mockCell9.getContext()).thenReturn("cell");
        when(mockCell9.getDocument()).thenReturn(mockDocument1);
        when(mockCell9.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell9.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map21 = new HashMap<>();
        map21.put("colnumber", 1L);
        map21.put("colpcwidth", 12.5);
        map21.put("halign", "left");
        map21.put("style", "asciidoc");
        map21.put("valign", "top");
        map21.put("width", 1L);
        when(mockCell9.getAttributes()).thenReturn(map21);
        when(mockCell9.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell9.isReftext()).thenReturn(false);
        when(mockCell9.getReftext()).thenReturn(null);
        when(mockCell9.getColumn()).thenReturn(mockColumn1);
        when(mockCell9.getColspan()).thenReturn(0);
        when(mockCell9.getRowspan()).thenReturn(0);
        when(mockCell9.getText()).thenReturn("Cell in column 1, row 2");
        when(mockCell9.getSource()).thenReturn("Cell in column 1, row 2");
        when(mockCell9.getStyle()).thenReturn("asciidoc");
        when(mockCell9.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell9.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        Document mockDocument3 = mock(Document.class);
        when(mockDocument3.getId()).thenReturn(null);
        when(mockDocument3.getNodeName()).thenReturn("document");
        when(mockDocument3.getParent()).thenReturn(null);
        when(mockDocument3.getContext()).thenReturn("document");
        when(mockDocument3.getDocument()).thenReturn(mockDocument3);
        when(mockDocument3.isInline()).thenReturn(false);
        when(mockDocument3.isBlock()).thenReturn(true);
        Map<String, Object> map22 = new HashMap<>();
        map22.put("doctype", "article");
        map22.put("example-caption", "Example");
        map22.put("figure-caption", "Figure");
        map22.put("filetype", "html");
        map22.put("notitle", "");
        map22.put("prewrap", "");
        map22.put("table-caption", "Table");
        when(mockDocument3.getAttributes()).thenReturn(map22);
        when(mockDocument3.getRoles()).thenReturn(Collections.emptyList());
        when(mockDocument3.isReftext()).thenReturn(false);
        when(mockDocument3.getReftext()).thenReturn(null);
        when(mockDocument3.getCaption()).thenReturn(null);
        when(mockDocument3.getTitle()).thenReturn(null);
        when(mockDocument3.getStyle()).thenReturn(null);
        when(mockDocument3.getLevel()).thenReturn(0);
        when(mockDocument3.getContentModel()).thenReturn("compound");
        when(mockDocument3.getSourceLocation()).thenReturn(null);
        when(mockDocument3.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockDocument3);
        when(mockBlock2.getContext()).thenReturn("paragraph");
        when(mockBlock2.getDocument()).thenReturn(mockDocument3);
        when(mockBlock2.isInline()).thenReturn(false);
        when(mockBlock2.isBlock()).thenReturn(true);
        when(mockBlock2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getCaption()).thenReturn(null);
        when(mockBlock2.getTitle()).thenReturn(null);
        when(mockBlock2.getStyle()).thenReturn(null);
        when(mockBlock2.getLevel()).thenReturn(0);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Cell in column 1, row 2"));
        when(mockBlock2.getSource()).thenReturn("Cell in column 1, row 2");
        when(mockDocument3.getBlocks()).thenReturn(Collections.singletonList(mockBlock2));
        when(mockDocument3.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument3.getDoctitle()).thenReturn(null);
        Map<Object, Object> map23 = new HashMap<>();
        map23.put("cursor", "<stdin>: line 31");
        map23.put("header_footer", false);
        when(mockDocument3.getOptions()).thenReturn(map23);
        when(mockCell9.getInnerDocument()).thenReturn(mockDocument3);
        Cell mockCell10 = mock(Cell.class);
        when(mockCell10.getId()).thenReturn(null);
        when(mockCell10.getNodeName()).thenReturn("cell");
        when(mockCell10.getParent()).thenReturn(mockColumn2);
        when(mockCell10.getContext()).thenReturn("cell");
        when(mockCell10.getDocument()).thenReturn(mockDocument1);
        when(mockCell10.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell10.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map24 = new HashMap<>();
        map24.put("colnumber", 2L);
        map24.put("colpcwidth", 12.5);
        map24.put("halign", "left");
        map24.put("style", "emphasis");
        map24.put("valign", "top");
        map24.put("width", 1L);
        when(mockCell10.getAttributes()).thenReturn(map24);
        when(mockCell10.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell10.isReftext()).thenReturn(false);
        when(mockCell10.getReftext()).thenReturn(null);
        when(mockCell10.getColumn()).thenReturn(mockColumn2);
        when(mockCell10.getColspan()).thenReturn(0);
        when(mockCell10.getRowspan()).thenReturn(0);
        when(mockCell10.getText()).thenReturn("Cell in column 2, row 2");
        when(mockCell10.getSource()).thenReturn("Cell in column 2, row 2");
        when(mockCell10.getStyle()).thenReturn("emphasis");
        when(mockCell10.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell10.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell10.getInnerDocument()).thenReturn(null);
        Cell mockCell11 = mock(Cell.class);
        when(mockCell11.getId()).thenReturn(null);
        when(mockCell11.getNodeName()).thenReturn("cell");
        when(mockCell11.getParent()).thenReturn(mockColumn3);
        when(mockCell11.getContext()).thenReturn("cell");
        when(mockCell11.getDocument()).thenReturn(mockDocument1);
        when(mockCell11.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell11.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map25 = new HashMap<>();
        map25.put("colnumber", 3L);
        map25.put("colpcwidth", 12.5);
        map25.put("halign", "left");
        map25.put("style", "header");
        map25.put("valign", "top");
        map25.put("width", 1L);
        when(mockCell11.getAttributes()).thenReturn(map25);
        when(mockCell11.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell11.isReftext()).thenReturn(false);
        when(mockCell11.getReftext()).thenReturn(null);
        when(mockCell11.getColumn()).thenReturn(mockColumn3);
        when(mockCell11.getColspan()).thenReturn(0);
        when(mockCell11.getRowspan()).thenReturn(0);
        when(mockCell11.getText()).thenReturn("Cell in column 3, row 2");
        when(mockCell11.getSource()).thenReturn("Cell in column 3, row 2");
        when(mockCell11.getStyle()).thenReturn("header");
        when(mockCell11.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell11.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell11.getInnerDocument()).thenReturn(null);
        Cell mockCell12 = mock(Cell.class);
        when(mockCell12.getId()).thenReturn(null);
        when(mockCell12.getNodeName()).thenReturn("cell");
        when(mockCell12.getParent()).thenReturn(mockColumn4);
        when(mockCell12.getContext()).thenReturn("cell");
        when(mockCell12.getDocument()).thenReturn(mockDocument1);
        when(mockCell12.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell12.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map26 = new HashMap<>();
        map26.put("colnumber", 4L);
        map26.put("colpcwidth", 12.5);
        map26.put("halign", "left");
        map26.put("style", "literal");
        map26.put("valign", "top");
        map26.put("width", 1L);
        when(mockCell12.getAttributes()).thenReturn(map26);
        when(mockCell12.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell12.isReftext()).thenReturn(false);
        when(mockCell12.getReftext()).thenReturn(null);
        when(mockCell12.getColumn()).thenReturn(mockColumn4);
        when(mockCell12.getColspan()).thenReturn(0);
        when(mockCell12.getRowspan()).thenReturn(0);
        when(mockCell12.getText()).thenReturn("Cell in column 4, row 2");
        when(mockCell12.getSource()).thenReturn("Cell in column 4, row 2");
        when(mockCell12.getStyle()).thenReturn("literal");
        when(mockCell12.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell12.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell12.getInnerDocument()).thenReturn(null);
        Cell mockCell13 = mock(Cell.class);
        when(mockCell13.getId()).thenReturn(null);
        when(mockCell13.getNodeName()).thenReturn("cell");
        when(mockCell13.getParent()).thenReturn(mockColumn5);
        when(mockCell13.getContext()).thenReturn("cell");
        when(mockCell13.getDocument()).thenReturn(mockDocument1);
        when(mockCell13.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell13.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map27 = new HashMap<>();
        map27.put("colnumber", 5L);
        map27.put("colpcwidth", 12.5);
        map27.put("halign", "left");
        map27.put("style", "monospaced");
        map27.put("valign", "top");
        map27.put("width", 1L);
        when(mockCell13.getAttributes()).thenReturn(map27);
        when(mockCell13.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell13.isReftext()).thenReturn(false);
        when(mockCell13.getReftext()).thenReturn(null);
        when(mockCell13.getColumn()).thenReturn(mockColumn5);
        when(mockCell13.getColspan()).thenReturn(0);
        when(mockCell13.getRowspan()).thenReturn(0);
        when(mockCell13.getText()).thenReturn("Cell in column 5, row 2");
        when(mockCell13.getSource()).thenReturn("Cell in column 5, row 2");
        when(mockCell13.getStyle()).thenReturn("monospaced");
        when(mockCell13.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell13.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell13.getInnerDocument()).thenReturn(null);
        Cell mockCell14 = mock(Cell.class);
        when(mockCell14.getId()).thenReturn(null);
        when(mockCell14.getNodeName()).thenReturn("cell");
        when(mockCell14.getParent()).thenReturn(mockColumn6);
        when(mockCell14.getContext()).thenReturn("cell");
        when(mockCell14.getDocument()).thenReturn(mockDocument1);
        when(mockCell14.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell14.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map28 = new HashMap<>();
        map28.put("colnumber", 6L);
        map28.put("colpcwidth", 12.5);
        map28.put("halign", "left");
        map28.put("style", "none");
        map28.put("valign", "top");
        map28.put("width", 1L);
        when(mockCell14.getAttributes()).thenReturn(map28);
        when(mockCell14.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell14.isReftext()).thenReturn(false);
        when(mockCell14.getReftext()).thenReturn(null);
        when(mockCell14.getColumn()).thenReturn(mockColumn6);
        when(mockCell14.getColspan()).thenReturn(0);
        when(mockCell14.getRowspan()).thenReturn(0);
        when(mockCell14.getText()).thenReturn("Cell in column 6, row 2");
        when(mockCell14.getSource()).thenReturn("Cell in column 6, row 2");
        when(mockCell14.getStyle()).thenReturn("none");
        when(mockCell14.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell14.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell14.getInnerDocument()).thenReturn(null);
        Cell mockCell15 = mock(Cell.class);
        when(mockCell15.getId()).thenReturn(null);
        when(mockCell15.getNodeName()).thenReturn("cell");
        when(mockCell15.getParent()).thenReturn(mockColumn7);
        when(mockCell15.getContext()).thenReturn("cell");
        when(mockCell15.getDocument()).thenReturn(mockDocument1);
        when(mockCell15.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell15.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map29 = new HashMap<>();
        map29.put("colnumber", 7L);
        map29.put("colpcwidth", 12.5);
        map29.put("halign", "left");
        map29.put("style", "strong");
        map29.put("valign", "top");
        map29.put("width", 1L);
        when(mockCell15.getAttributes()).thenReturn(map29);
        when(mockCell15.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell15.isReftext()).thenReturn(false);
        when(mockCell15.getReftext()).thenReturn(null);
        when(mockCell15.getColumn()).thenReturn(mockColumn7);
        when(mockCell15.getColspan()).thenReturn(0);
        when(mockCell15.getRowspan()).thenReturn(0);
        when(mockCell15.getText()).thenReturn("Cell in column 7, row 2");
        when(mockCell15.getSource()).thenReturn("Cell in column 7, row 2");
        when(mockCell15.getStyle()).thenReturn("strong");
        when(mockCell15.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell15.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell15.getInnerDocument()).thenReturn(null);
        Cell mockCell16 = mock(Cell.class);
        when(mockCell16.getId()).thenReturn(null);
        when(mockCell16.getNodeName()).thenReturn("cell");
        when(mockCell16.getParent()).thenReturn(mockColumn8);
        when(mockCell16.getContext()).thenReturn("cell");
        when(mockCell16.getDocument()).thenReturn(mockDocument1);
        when(mockCell16.isInline()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        when(mockCell16.isBlock()).thenThrow(new UnsupportedOperationException("NotImplementedError"));
        Map<String, Object> map30 = new HashMap<>();
        map30.put("colnumber", 8L);
        map30.put("colpcwidth", 12.5);
        map30.put("halign", "left");
        map30.put("style", "verse");
        map30.put("valign", "top");
        map30.put("width", 1L);
        when(mockCell16.getAttributes()).thenReturn(map30);
        when(mockCell16.getRoles()).thenReturn(Collections.emptyList());
        when(mockCell16.isReftext()).thenReturn(false);
        when(mockCell16.getReftext()).thenReturn(null);
        when(mockCell16.getColumn()).thenReturn(mockColumn8);
        when(mockCell16.getColspan()).thenReturn(0);
        when(mockCell16.getRowspan()).thenReturn(0);
        when(mockCell16.getText()).thenReturn("Cell in column 8, row 2");
        when(mockCell16.getSource()).thenReturn("Cell in column 8, row 2");
        when(mockCell16.getStyle()).thenReturn("verse");
        when(mockCell16.getHorizontalAlignment()).thenReturn(Table.HorizontalAlignment.LEFT);
        when(mockCell16.getVerticalAlignment()).thenReturn(Table.VerticalAlignment.TOP);
        when(mockCell16.getInnerDocument()).thenReturn(null);
        when(mockRow2.getCells()).thenReturn(Arrays.asList(mockCell9, mockCell10, mockCell11, mockCell12, mockCell13, mockCell14, mockCell15, mockCell16));
        when(mockTable1.getBody()).thenReturn(Arrays.asList(mockRow1, mockRow2));
        when(mockTable1.getFrame()).thenReturn("all");
        when(mockTable1.getGrid()).thenReturn("all");
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockTable1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map31 = new HashMap<>();
        map31.put("attributes", "{}");
        map31.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map31);
        return mockDocument1;
    }
    // end::mock-code[]
}