package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;
import org.junit.Test;

public abstract class AbstractListNestedTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isXmlEqualTo(EXPECTED_HTML);
    }

    public static final String ASCIIDOC = ""
            + "[square]\n" +
            "* Main 1\n" +
            "** lorem\n" +
            "** ipsum\n" +
            "* Main 2\n" +
            ". one\n" +
            ". two\n" +
            "* Main 3\n" +
            "** x\n" +
            "*** y\n" +
            "**** z\n" +
            "* Main 4\n" +
            "";

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<div class=\"ulist square\">\n" +
            "<ul class=\"square\">\n" +
            "<li> <p>Main 1</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>lorem</p> </li>\n" +
            "<li> <p>ipsum</p> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "<li> <p>Main 2</p>\n" +
            "<div class=\"olist arabic\">\n" +
            "<ol class=\"arabic\">\n" +
            "<li> <p>one</p> </li>\n" +
            "<li> <p>two</p> </li>\n" +
            "</ol>\n" +
            "</div> </li>\n" +
            "<li> <p>Main 3</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>x</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>y</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>z</p> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "<li> <p>Main 4</p> </li>\n" +
            "</ul>\n" +
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
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) document1.getBlocks()
                .get(0);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("ulist");
        assertThat(list1.getParent()).isSameAs(document1);
        assertThat(list1.getContext()).isEqualTo("ulist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).containsEntry("style", "square");
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isEqualTo("square");
        assertThat(list1.getLevel()).isEqualTo(1);
        assertThat(list1.getContentModel()).isEqualTo("compound");
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isNullOrEmpty();
        assertThat(list1.getBlocks()).isNullOrEmpty();
        assertThat(list1.getItems()).hasSize(4);
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
        assertThat(listItem1.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list2 = (org.asciidoctor.ast.List) listItem1.getBlocks()
                .get(0);
        assertThat(list2.getId()).isNull();
        assertThat(list2.getNodeName()).isEqualTo("ulist");
        assertThat(list2.getParent()).isSameAs(listItem1);
        assertThat(list2.getContext()).isEqualTo("ulist");
        assertThat(list2.getDocument()).isSameAs(document1);
        assertThat(list2.isInline()).isFalse();
        assertThat(list2.isBlock()).isTrue();
        assertThat(list2.getAttributes()).isNullOrEmpty();
        assertThat(list2.getRoles()).isNullOrEmpty();
        assertThat(list2.isReftext()).isFalse();
        assertThat(list2.getReftext()).isNull();
        assertThat(list2.getTitle()).isNull();
        assertThat(list2.getStyle()).isNull();
        assertThat(list2.getLevel()).isEqualTo(1);
        assertThat(list2.getContentModel()).isEqualTo("compound");
        assertThat(list2.getSourceLocation()).isNull();
        assertThat(list2.getSubstitutions()).isNullOrEmpty();
        assertThat(list2.getBlocks()).isNullOrEmpty();
        assertThat(list2.getItems()).hasSize(2);
        ListItem listItem2 = (ListItem) list2.getItems()
                .get(0);
        assertThat(listItem2.getId()).isNull();
        assertThat(listItem2.getNodeName()).isEqualTo("list_item");
        assertThat(listItem2.getParent()).isSameAs(list2);
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
        assertThat(listItem2.getMarker()).isEqualTo("**");
        assertThat(listItem2.getText()).isEqualTo("lorem");
        assertThat(listItem2.getSource()).isEqualTo("lorem");
        assertThat(listItem2.hasText()).isTrue();
        ListItem listItem3 = (ListItem) list2.getItems()
                .get(1);
        assertThat(listItem3.getId()).isNull();
        assertThat(listItem3.getNodeName()).isEqualTo("list_item");
        assertThat(listItem3.getParent()).isSameAs(list2);
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
        assertThat(listItem3.getMarker()).isEqualTo("**");
        assertThat(listItem3.getText()).isEqualTo("ipsum");
        assertThat(listItem3.getSource()).isEqualTo("ipsum");
        assertThat(listItem3.hasText()).isTrue();
        assertThat(list2.hasItems()).isTrue();
        assertThat(listItem1.getMarker()).isEqualTo("*");
        assertThat(listItem1.getText()).isEqualTo("Main 1");
        assertThat(listItem1.getSource()).isEqualTo("Main 1");
        assertThat(listItem1.hasText()).isTrue();
        ListItem listItem4 = (ListItem) list1.getItems()
                .get(1);
        assertThat(listItem4.getId()).isNull();
        assertThat(listItem4.getNodeName()).isEqualTo("list_item");
        assertThat(listItem4.getParent()).isSameAs(list1);
        assertThat(listItem4.getContext()).isEqualTo("list_item");
        assertThat(listItem4.getDocument()).isSameAs(document1);
        assertThat(listItem4.isInline()).isFalse();
        assertThat(listItem4.isBlock()).isTrue();
        assertThat(listItem4.getAttributes()).isNullOrEmpty();
        assertThat(listItem4.getRoles()).isNullOrEmpty();
        assertThat(listItem4.isReftext()).isFalse();
        assertThat(listItem4.getReftext()).isNull();
        assertThat(listItem4.getTitle()).isNull();
        assertThat(listItem4.getStyle()).isNull();
        assertThat(listItem4.getLevel()).isEqualTo(1);
        assertThat(listItem4.getContentModel()).isEqualTo("compound");
        assertThat(listItem4.getSourceLocation()).isNull();
        assertThat(listItem4.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem4.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list3 = (org.asciidoctor.ast.List) listItem4.getBlocks()
                .get(0);
        assertThat(list3.getId()).isNull();
        assertThat(list3.getNodeName()).isEqualTo("olist");
        assertThat(list3.getParent()).isSameAs(listItem4);
        assertThat(list3.getContext()).isEqualTo("olist");
        assertThat(list3.getDocument()).isSameAs(document1);
        assertThat(list3.isInline()).isFalse();
        assertThat(list3.isBlock()).isTrue();
        assertThat(list3.getAttributes()).containsEntry("style", "arabic");
        assertThat(list3.getRoles()).isNullOrEmpty();
        assertThat(list3.isReftext()).isFalse();
        assertThat(list3.getReftext()).isNull();
        assertThat(list3.getTitle()).isNull();
        assertThat(list3.getStyle()).isEqualTo("arabic");
        assertThat(list3.getLevel()).isEqualTo(1);
        assertThat(list3.getContentModel()).isEqualTo("compound");
        assertThat(list3.getSourceLocation()).isNull();
        assertThat(list3.getSubstitutions()).isNullOrEmpty();
        assertThat(list3.getBlocks()).isNullOrEmpty();
        assertThat(list3.getItems()).hasSize(2);
        ListItem listItem5 = (ListItem) list3.getItems()
                .get(0);
        assertThat(listItem5.getId()).isNull();
        assertThat(listItem5.getNodeName()).isEqualTo("list_item");
        assertThat(listItem5.getParent()).isSameAs(list3);
        assertThat(listItem5.getContext()).isEqualTo("list_item");
        assertThat(listItem5.getDocument()).isSameAs(document1);
        assertThat(listItem5.isInline()).isFalse();
        assertThat(listItem5.isBlock()).isTrue();
        assertThat(listItem5.getAttributes()).isNullOrEmpty();
        assertThat(listItem5.getRoles()).isNullOrEmpty();
        assertThat(listItem5.isReftext()).isFalse();
        assertThat(listItem5.getReftext()).isNull();
        assertThat(listItem5.getTitle()).isNull();
        assertThat(listItem5.getStyle()).isNull();
        assertThat(listItem5.getLevel()).isEqualTo(1);
        assertThat(listItem5.getContentModel()).isEqualTo("compound");
        assertThat(listItem5.getSourceLocation()).isNull();
        assertThat(listItem5.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem5.getBlocks()).isNullOrEmpty();
        assertThat(listItem5.getMarker()).isEqualTo(".");
        assertThat(listItem5.getText()).isEqualTo("one");
        assertThat(listItem5.getSource()).isEqualTo("one");
        assertThat(listItem5.hasText()).isTrue();
        ListItem listItem6 = (ListItem) list3.getItems()
                .get(1);
        assertThat(listItem6.getId()).isNull();
        assertThat(listItem6.getNodeName()).isEqualTo("list_item");
        assertThat(listItem6.getParent()).isSameAs(list3);
        assertThat(listItem6.getContext()).isEqualTo("list_item");
        assertThat(listItem6.getDocument()).isSameAs(document1);
        assertThat(listItem6.isInline()).isFalse();
        assertThat(listItem6.isBlock()).isTrue();
        assertThat(listItem6.getAttributes()).isNullOrEmpty();
        assertThat(listItem6.getRoles()).isNullOrEmpty();
        assertThat(listItem6.isReftext()).isFalse();
        assertThat(listItem6.getReftext()).isNull();
        assertThat(listItem6.getTitle()).isNull();
        assertThat(listItem6.getStyle()).isNull();
        assertThat(listItem6.getLevel()).isEqualTo(1);
        assertThat(listItem6.getContentModel()).isEqualTo("compound");
        assertThat(listItem6.getSourceLocation()).isNull();
        assertThat(listItem6.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem6.getBlocks()).isNullOrEmpty();
        assertThat(listItem6.getMarker()).isEqualTo(".");
        assertThat(listItem6.getText()).isEqualTo("two");
        assertThat(listItem6.getSource()).isEqualTo("two");
        assertThat(listItem6.hasText()).isTrue();
        assertThat(list3.hasItems()).isTrue();
        assertThat(listItem4.getMarker()).isEqualTo("*");
        assertThat(listItem4.getText()).isEqualTo("Main 2");
        assertThat(listItem4.getSource()).isEqualTo("Main 2");
        assertThat(listItem4.hasText()).isTrue();
        ListItem listItem7 = (ListItem) list1.getItems()
                .get(2);
        assertThat(listItem7.getId()).isNull();
        assertThat(listItem7.getNodeName()).isEqualTo("list_item");
        assertThat(listItem7.getParent()).isSameAs(list1);
        assertThat(listItem7.getContext()).isEqualTo("list_item");
        assertThat(listItem7.getDocument()).isSameAs(document1);
        assertThat(listItem7.isInline()).isFalse();
        assertThat(listItem7.isBlock()).isTrue();
        assertThat(listItem7.getAttributes()).isNullOrEmpty();
        assertThat(listItem7.getRoles()).isNullOrEmpty();
        assertThat(listItem7.isReftext()).isFalse();
        assertThat(listItem7.getReftext()).isNull();
        assertThat(listItem7.getTitle()).isNull();
        assertThat(listItem7.getStyle()).isNull();
        assertThat(listItem7.getLevel()).isEqualTo(1);
        assertThat(listItem7.getContentModel()).isEqualTo("compound");
        assertThat(listItem7.getSourceLocation()).isNull();
        assertThat(listItem7.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem7.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list4 = (org.asciidoctor.ast.List) listItem7.getBlocks()
                .get(0);
        assertThat(list4.getId()).isNull();
        assertThat(list4.getNodeName()).isEqualTo("ulist");
        assertThat(list4.getParent()).isSameAs(listItem7);
        assertThat(list4.getContext()).isEqualTo("ulist");
        assertThat(list4.getDocument()).isSameAs(document1);
        assertThat(list4.isInline()).isFalse();
        assertThat(list4.isBlock()).isTrue();
        assertThat(list4.getAttributes()).isNullOrEmpty();
        assertThat(list4.getRoles()).isNullOrEmpty();
        assertThat(list4.isReftext()).isFalse();
        assertThat(list4.getReftext()).isNull();
        assertThat(list4.getTitle()).isNull();
        assertThat(list4.getStyle()).isNull();
        assertThat(list4.getLevel()).isEqualTo(1);
        assertThat(list4.getContentModel()).isEqualTo("compound");
        assertThat(list4.getSourceLocation()).isNull();
        assertThat(list4.getSubstitutions()).isNullOrEmpty();
        assertThat(list4.getBlocks()).isNullOrEmpty();
        assertThat(list4.getItems()).hasSize(1);
        ListItem listItem8 = (ListItem) list4.getItems()
                .get(0);
        assertThat(listItem8.getId()).isNull();
        assertThat(listItem8.getNodeName()).isEqualTo("list_item");
        assertThat(listItem8.getParent()).isSameAs(list4);
        assertThat(listItem8.getContext()).isEqualTo("list_item");
        assertThat(listItem8.getDocument()).isSameAs(document1);
        assertThat(listItem8.isInline()).isFalse();
        assertThat(listItem8.isBlock()).isTrue();
        assertThat(listItem8.getAttributes()).isNullOrEmpty();
        assertThat(listItem8.getRoles()).isNullOrEmpty();
        assertThat(listItem8.isReftext()).isFalse();
        assertThat(listItem8.getReftext()).isNull();
        assertThat(listItem8.getTitle()).isNull();
        assertThat(listItem8.getStyle()).isNull();
        assertThat(listItem8.getLevel()).isEqualTo(1);
        assertThat(listItem8.getContentModel()).isEqualTo("compound");
        assertThat(listItem8.getSourceLocation()).isNull();
        assertThat(listItem8.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem8.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list5 = (org.asciidoctor.ast.List) listItem8.getBlocks()
                .get(0);
        assertThat(list5.getId()).isNull();
        assertThat(list5.getNodeName()).isEqualTo("ulist");
        assertThat(list5.getParent()).isSameAs(listItem8);
        assertThat(list5.getContext()).isEqualTo("ulist");
        assertThat(list5.getDocument()).isSameAs(document1);
        assertThat(list5.isInline()).isFalse();
        assertThat(list5.isBlock()).isTrue();
        assertThat(list5.getAttributes()).isNullOrEmpty();
        assertThat(list5.getRoles()).isNullOrEmpty();
        assertThat(list5.isReftext()).isFalse();
        assertThat(list5.getReftext()).isNull();
        assertThat(list5.getTitle()).isNull();
        assertThat(list5.getStyle()).isNull();
        assertThat(list5.getLevel()).isEqualTo(1);
        assertThat(list5.getContentModel()).isEqualTo("compound");
        assertThat(list5.getSourceLocation()).isNull();
        assertThat(list5.getSubstitutions()).isNullOrEmpty();
        assertThat(list5.getBlocks()).isNullOrEmpty();
        assertThat(list5.getItems()).hasSize(1);
        ListItem listItem9 = (ListItem) list5.getItems()
                .get(0);
        assertThat(listItem9.getId()).isNull();
        assertThat(listItem9.getNodeName()).isEqualTo("list_item");
        assertThat(listItem9.getParent()).isSameAs(list5);
        assertThat(listItem9.getContext()).isEqualTo("list_item");
        assertThat(listItem9.getDocument()).isSameAs(document1);
        assertThat(listItem9.isInline()).isFalse();
        assertThat(listItem9.isBlock()).isTrue();
        assertThat(listItem9.getAttributes()).isNullOrEmpty();
        assertThat(listItem9.getRoles()).isNullOrEmpty();
        assertThat(listItem9.isReftext()).isFalse();
        assertThat(listItem9.getReftext()).isNull();
        assertThat(listItem9.getTitle()).isNull();
        assertThat(listItem9.getStyle()).isNull();
        assertThat(listItem9.getLevel()).isEqualTo(1);
        assertThat(listItem9.getContentModel()).isEqualTo("compound");
        assertThat(listItem9.getSourceLocation()).isNull();
        assertThat(listItem9.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem9.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list6 = (org.asciidoctor.ast.List) listItem9.getBlocks()
                .get(0);
        assertThat(list6.getId()).isNull();
        assertThat(list6.getNodeName()).isEqualTo("ulist");
        assertThat(list6.getParent()).isSameAs(listItem9);
        assertThat(list6.getContext()).isEqualTo("ulist");
        assertThat(list6.getDocument()).isSameAs(document1);
        assertThat(list6.isInline()).isFalse();
        assertThat(list6.isBlock()).isTrue();
        assertThat(list6.getAttributes()).isNullOrEmpty();
        assertThat(list6.getRoles()).isNullOrEmpty();
        assertThat(list6.isReftext()).isFalse();
        assertThat(list6.getReftext()).isNull();
        assertThat(list6.getTitle()).isNull();
        assertThat(list6.getStyle()).isNull();
        assertThat(list6.getLevel()).isEqualTo(1);
        assertThat(list6.getContentModel()).isEqualTo("compound");
        assertThat(list6.getSourceLocation()).isNull();
        assertThat(list6.getSubstitutions()).isNullOrEmpty();
        assertThat(list6.getBlocks()).isNullOrEmpty();
        assertThat(list6.getItems()).hasSize(1);
        ListItem listItem10 = (ListItem) list6.getItems()
                .get(0);
        assertThat(listItem10.getId()).isNull();
        assertThat(listItem10.getNodeName()).isEqualTo("list_item");
        assertThat(listItem10.getParent()).isSameAs(list6);
        assertThat(listItem10.getContext()).isEqualTo("list_item");
        assertThat(listItem10.getDocument()).isSameAs(document1);
        assertThat(listItem10.isInline()).isFalse();
        assertThat(listItem10.isBlock()).isTrue();
        assertThat(listItem10.getAttributes()).isNullOrEmpty();
        assertThat(listItem10.getRoles()).isNullOrEmpty();
        assertThat(listItem10.isReftext()).isFalse();
        assertThat(listItem10.getReftext()).isNull();
        assertThat(listItem10.getTitle()).isNull();
        assertThat(listItem10.getStyle()).isNull();
        assertThat(listItem10.getLevel()).isEqualTo(1);
        assertThat(listItem10.getContentModel()).isEqualTo("compound");
        assertThat(listItem10.getSourceLocation()).isNull();
        assertThat(listItem10.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem10.getBlocks()).isNullOrEmpty();
        assertThat(listItem10.getMarker()).isEqualTo("****");
        assertThat(listItem10.getText()).isEqualTo("z");
        assertThat(listItem10.getSource()).isEqualTo("z");
        assertThat(listItem10.hasText()).isTrue();
        assertThat(list6.hasItems()).isTrue();
        assertThat(listItem9.getMarker()).isEqualTo("***");
        assertThat(listItem9.getText()).isEqualTo("y");
        assertThat(listItem9.getSource()).isEqualTo("y");
        assertThat(listItem9.hasText()).isTrue();
        assertThat(list5.hasItems()).isTrue();
        assertThat(listItem8.getMarker()).isEqualTo("**");
        assertThat(listItem8.getText()).isEqualTo("x");
        assertThat(listItem8.getSource()).isEqualTo("x");
        assertThat(listItem8.hasText()).isTrue();
        assertThat(list4.hasItems()).isTrue();
        assertThat(listItem7.getMarker()).isEqualTo("*");
        assertThat(listItem7.getText()).isEqualTo("Main 3");
        assertThat(listItem7.getSource()).isEqualTo("Main 3");
        assertThat(listItem7.hasText()).isTrue();
        ListItem listItem11 = (ListItem) list1.getItems()
                .get(3);
        assertThat(listItem11.getId()).isNull();
        assertThat(listItem11.getNodeName()).isEqualTo("list_item");
        assertThat(listItem11.getParent()).isSameAs(list1);
        assertThat(listItem11.getContext()).isEqualTo("list_item");
        assertThat(listItem11.getDocument()).isSameAs(document1);
        assertThat(listItem11.isInline()).isFalse();
        assertThat(listItem11.isBlock()).isTrue();
        assertThat(listItem11.getAttributes()).isNullOrEmpty();
        assertThat(listItem11.getRoles()).isNullOrEmpty();
        assertThat(listItem11.isReftext()).isFalse();
        assertThat(listItem11.getReftext()).isNull();
        assertThat(listItem11.getTitle()).isNull();
        assertThat(listItem11.getStyle()).isNull();
        assertThat(listItem11.getLevel()).isEqualTo(1);
        assertThat(listItem11.getContentModel()).isEqualTo("compound");
        assertThat(listItem11.getSourceLocation()).isNull();
        assertThat(listItem11.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem11.getBlocks()).isNullOrEmpty();
        assertThat(listItem11.getMarker()).isEqualTo("*");
        assertThat(listItem11.getText()).isEqualTo("Main 4");
        assertThat(listItem11.getSource()).isEqualTo("Main 4");
        assertThat(listItem11.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
        assertThat(document1.getStructuredDoctitle()).isNull();
        assertThat(document1.getDoctitle()).isNull();
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

}
