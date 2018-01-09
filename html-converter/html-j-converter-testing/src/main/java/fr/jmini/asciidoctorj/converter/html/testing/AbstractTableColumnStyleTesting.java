package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;
import org.junit.Test;

public abstract class AbstractTableColumnStyleTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isEqualTo(EXPECTED_HTML);
    }

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

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<table class=\"tableblock frame-all grid-all spread\">\n" +
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

    public String createAsciiDocInput() {
        return ASCIIDOC;
    }

    protected abstract Document createAstDocument(String asciiDoc);

    protected abstract String convertToHtml(Document astDocument);

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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document1.getRoles()).isNullOrEmpty();
        assertThat(document1.isReftext()).isFalse();
        assertThat(document1.getReftext()).isNull();
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document2.getRoles()).isNullOrEmpty();
        assertThat(document2.isReftext()).isFalse();
        assertThat(document2.getReftext()).isNull();
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "")
                .containsEntry("prewrap", "")
                .containsEntry("table-caption", "Table");
        assertThat(document3.getRoles()).isNullOrEmpty();
        assertThat(document3.isReftext()).isFalse();
        assertThat(document3.getReftext()).isNull();
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

}
