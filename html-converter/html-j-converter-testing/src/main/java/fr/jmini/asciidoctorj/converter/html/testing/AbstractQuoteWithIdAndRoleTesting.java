package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;
import org.junit.Test;

public abstract class AbstractQuoteWithIdAndRoleTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isXmlEqualTo(EXPECTED_HTML);
    }

    public static final String ASCIIDOC = "" +
            "[#idd.rolee]\n" +
            ".some caption\n" +
            "____\n" +
            "* one.\n" +
            "* two.\n" +
            "* three.\n" +
            "____";

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<div id=\"idd\" class=\"quoteblock rolee\">\n" +
            "<div class=\"title\">\n" +
            "some caption\n" +
            "</div>\n" +
            "<blockquote>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>one.</p> </li>\n" +
            "<li> <p>two.</p> </li>\n" +
            "<li> <p>three.</p> </li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "</blockquote>\n" +
            "</div>";
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
        Block block1 = (Block) document1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isEqualTo("idd");
        assertThat(block1.getNodeName()).isEqualTo("quote");
        assertThat(block1.getParent()).isSameAs(document1);
        assertThat(block1.getContext()).isEqualTo("quote");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).containsEntry("1", "#idd.rolee")
                .containsEntry("id", "idd")
                .containsEntry("role", "rolee")
                .containsEntry("style", "quote")
                .containsEntry("title", "some caption");
        assertThat(block1.getRoles()).containsExactly("rolee");
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getTitle()).isEqualTo("some caption");
        assertThat(block1.getStyle()).isEqualTo("quote");
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("compound");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).isNullOrEmpty();
        assertThat(block1.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) block1.getBlocks()
                .get(0);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("ulist");
        assertThat(list1.getParent()).isSameAs(block1);
        assertThat(list1.getContext()).isEqualTo("ulist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).isNullOrEmpty();
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isNull();
        assertThat(list1.getLevel()).isEqualTo(1);
        assertThat(list1.getContentModel()).isEqualTo("compound");
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isNullOrEmpty();
        assertThat(list1.getBlocks()).isNullOrEmpty();
        assertThat(list1.getItems()).hasSize(3);
        ListItem listItem1 = (ListItem) list1.getItems()
                .get(0);
        assertThat(listItem1.getId()).isNull();
        assertThat(listItem1.getNodeName()).isEqualTo("list_item");
        assertThat(listItem1.getParent()).isSameAs(list1);
        assertThat(listItem1.getContext()).isEqualTo("list_item");
        assertThat(listItem1.getDocument()).isSameAs(document1);
        assertThat(listItem1.isInline()).isFalse();
        assertThat(listItem1.isBlock()).isTrue();
        assertThat(listItem1.getAttributes()).isNullOrEmpty();
        assertThat(listItem1.getRoles()).isNullOrEmpty();
        assertThat(listItem1.isReftext()).isFalse();
        assertThat(listItem1.getReftext()).isNull();
        assertThat(listItem1.getTitle()).isNull();
        assertThat(listItem1.getStyle()).isNull();
        assertThat(listItem1.getLevel()).isEqualTo(1);
        assertThat(listItem1.getContentModel()).isEqualTo("compound");
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem1.getBlocks()).isNullOrEmpty();
        assertThat(listItem1.getMarker()).isEqualTo("*");
        assertThat(listItem1.getText()).isEqualTo("one.");
        assertThat(listItem1.getSource()).isEqualTo("one.");
        assertThat(listItem1.hasText()).isTrue();
        ListItem listItem2 = (ListItem) list1.getItems()
                .get(1);
        assertThat(listItem2.getId()).isNull();
        assertThat(listItem2.getNodeName()).isEqualTo("list_item");
        assertThat(listItem2.getParent()).isSameAs(list1);
        assertThat(listItem2.getContext()).isEqualTo("list_item");
        assertThat(listItem2.getDocument()).isSameAs(document1);
        assertThat(listItem2.isInline()).isFalse();
        assertThat(listItem2.isBlock()).isTrue();
        assertThat(listItem2.getAttributes()).isNullOrEmpty();
        assertThat(listItem2.getRoles()).isNullOrEmpty();
        assertThat(listItem2.isReftext()).isFalse();
        assertThat(listItem2.getReftext()).isNull();
        assertThat(listItem2.getTitle()).isNull();
        assertThat(listItem2.getStyle()).isNull();
        assertThat(listItem2.getLevel()).isEqualTo(1);
        assertThat(listItem2.getContentModel()).isEqualTo("compound");
        assertThat(listItem2.getSourceLocation()).isNull();
        assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem2.getBlocks()).isNullOrEmpty();
        assertThat(listItem2.getMarker()).isEqualTo("*");
        assertThat(listItem2.getText()).isEqualTo("two.");
        assertThat(listItem2.getSource()).isEqualTo("two.");
        assertThat(listItem2.hasText()).isTrue();
        ListItem listItem3 = (ListItem) list1.getItems()
                .get(2);
        assertThat(listItem3.getId()).isNull();
        assertThat(listItem3.getNodeName()).isEqualTo("list_item");
        assertThat(listItem3.getParent()).isSameAs(list1);
        assertThat(listItem3.getContext()).isEqualTo("list_item");
        assertThat(listItem3.getDocument()).isSameAs(document1);
        assertThat(listItem3.isInline()).isFalse();
        assertThat(listItem3.isBlock()).isTrue();
        assertThat(listItem3.getAttributes()).isNullOrEmpty();
        assertThat(listItem3.getRoles()).isNullOrEmpty();
        assertThat(listItem3.isReftext()).isFalse();
        assertThat(listItem3.getReftext()).isNull();
        assertThat(listItem3.getTitle()).isNull();
        assertThat(listItem3.getStyle()).isNull();
        assertThat(listItem3.getLevel()).isEqualTo(1);
        assertThat(listItem3.getContentModel()).isEqualTo("compound");
        assertThat(listItem3.getSourceLocation()).isNull();
        assertThat(listItem3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem3.getBlocks()).isNullOrEmpty();
        assertThat(listItem3.getMarker()).isEqualTo("*");
        assertThat(listItem3.getText()).isEqualTo("three.");
        assertThat(listItem3.getSource()).isEqualTo("three.");
        assertThat(listItem3.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
        assertThat(block1.getLines()).isNullOrEmpty();
        assertThat(block1.getSource()).isEqualTo("");
        assertThat(document1.getStructuredDoctitle()).isNull();
        assertThat(document1.getDoctitle()).isNull();
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

}
