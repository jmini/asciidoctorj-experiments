package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

public class ListNestedTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[square]\n" +
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
            "<div class=\"ulist square\">\n" +
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
        assertThat(list1.getAttributes()).containsEntry("1", "square")
                .containsEntry("style", "square");
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
        org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn("ulist");
        when(mockList1.getParent()).thenReturn(mockDocument1);
        when(mockList1.getContext()).thenReturn("ulist");
        when(mockList1.getDocument()).thenReturn(mockDocument1);
        when(mockList1.isInline()).thenReturn(false);
        when(mockList1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1", "square");
        map2.put("style", "square");
        when(mockList1.getAttributes()).thenReturn(map2);
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getReftext()).thenReturn(null);
        when(mockList1.getTitle()).thenReturn(null);
        when(mockList1.getStyle()).thenReturn("square");
        when(mockList1.getLevel()).thenReturn(1);
        when(mockList1.getContentModel()).thenReturn("compound");
        when(mockList1.getSourceLocation()).thenReturn(null);
        when(mockList1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList1.getBlocks()).thenReturn(null);
        ListItem mockListItem1 = mock(ListItem.class);
        when(mockListItem1.getId()).thenReturn(null);
        when(mockListItem1.getNodeName()).thenReturn("list_item");
        when(mockListItem1.getParent()).thenReturn(mockList1);
        when(mockListItem1.getContext()).thenReturn("list_item");
        when(mockListItem1.getDocument()).thenReturn(mockDocument1);
        when(mockListItem1.isInline()).thenReturn(false);
        when(mockListItem1.isBlock()).thenReturn(true);
        when(mockListItem1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem1.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem1.isReftext()).thenReturn(false);
        when(mockListItem1.getReftext()).thenReturn(null);
        when(mockListItem1.getTitle()).thenReturn(null);
        when(mockListItem1.getStyle()).thenReturn(null);
        when(mockListItem1.getLevel()).thenReturn(1);
        when(mockListItem1.getContentModel()).thenReturn("compound");
        when(mockListItem1.getSourceLocation()).thenReturn(null);
        when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList2 = mock(org.asciidoctor.ast.List.class);
        when(mockList2.getId()).thenReturn(null);
        when(mockList2.getNodeName()).thenReturn("ulist");
        when(mockList2.getParent()).thenReturn(mockListItem1);
        when(mockList2.getContext()).thenReturn("ulist");
        when(mockList2.getDocument()).thenReturn(mockDocument1);
        when(mockList2.isInline()).thenReturn(false);
        when(mockList2.isBlock()).thenReturn(true);
        when(mockList2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList2.getRoles()).thenReturn(Collections.emptyList());
        when(mockList2.isReftext()).thenReturn(false);
        when(mockList2.getReftext()).thenReturn(null);
        when(mockList2.getTitle()).thenReturn(null);
        when(mockList2.getStyle()).thenReturn(null);
        when(mockList2.getLevel()).thenReturn(1);
        when(mockList2.getContentModel()).thenReturn("compound");
        when(mockList2.getSourceLocation()).thenReturn(null);
        when(mockList2.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList2.getBlocks()).thenReturn(null);
        ListItem mockListItem2 = mock(ListItem.class);
        when(mockListItem2.getId()).thenReturn(null);
        when(mockListItem2.getNodeName()).thenReturn("list_item");
        when(mockListItem2.getParent()).thenReturn(mockList2);
        when(mockListItem2.getContext()).thenReturn("list_item");
        when(mockListItem2.getDocument()).thenReturn(mockDocument1);
        when(mockListItem2.isInline()).thenReturn(false);
        when(mockListItem2.isBlock()).thenReturn(true);
        when(mockListItem2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem2.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem2.isReftext()).thenReturn(false);
        when(mockListItem2.getReftext()).thenReturn(null);
        when(mockListItem2.getTitle()).thenReturn(null);
        when(mockListItem2.getStyle()).thenReturn(null);
        when(mockListItem2.getLevel()).thenReturn(1);
        when(mockListItem2.getContentModel()).thenReturn("compound");
        when(mockListItem2.getSourceLocation()).thenReturn(null);
        when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem2.getMarker()).thenReturn("**");
        when(mockListItem2.getText()).thenReturn("lorem");
        when(mockListItem2.getSource()).thenReturn("lorem");
        when(mockListItem2.hasText()).thenReturn(true);
        ListItem mockListItem3 = mock(ListItem.class);
        when(mockListItem3.getId()).thenReturn(null);
        when(mockListItem3.getNodeName()).thenReturn("list_item");
        when(mockListItem3.getParent()).thenReturn(mockList2);
        when(mockListItem3.getContext()).thenReturn("list_item");
        when(mockListItem3.getDocument()).thenReturn(mockDocument1);
        when(mockListItem3.isInline()).thenReturn(false);
        when(mockListItem3.isBlock()).thenReturn(true);
        when(mockListItem3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem3.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem3.isReftext()).thenReturn(false);
        when(mockListItem3.getReftext()).thenReturn(null);
        when(mockListItem3.getTitle()).thenReturn(null);
        when(mockListItem3.getStyle()).thenReturn(null);
        when(mockListItem3.getLevel()).thenReturn(1);
        when(mockListItem3.getContentModel()).thenReturn("compound");
        when(mockListItem3.getSourceLocation()).thenReturn(null);
        when(mockListItem3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem3.getMarker()).thenReturn("**");
        when(mockListItem3.getText()).thenReturn("ipsum");
        when(mockListItem3.getSource()).thenReturn("ipsum");
        when(mockListItem3.hasText()).thenReturn(true);
        when(mockList2.getItems()).thenReturn(Arrays.asList(mockListItem2, mockListItem3));
        when(mockList2.hasItems()).thenReturn(true);
        when(mockListItem1.getBlocks()).thenReturn(Collections.singletonList(mockList2));
        when(mockListItem1.getMarker()).thenReturn("*");
        when(mockListItem1.getText()).thenReturn("Main 1");
        when(mockListItem1.getSource()).thenReturn("Main 1");
        when(mockListItem1.hasText()).thenReturn(true);
        ListItem mockListItem4 = mock(ListItem.class);
        when(mockListItem4.getId()).thenReturn(null);
        when(mockListItem4.getNodeName()).thenReturn("list_item");
        when(mockListItem4.getParent()).thenReturn(mockList1);
        when(mockListItem4.getContext()).thenReturn("list_item");
        when(mockListItem4.getDocument()).thenReturn(mockDocument1);
        when(mockListItem4.isInline()).thenReturn(false);
        when(mockListItem4.isBlock()).thenReturn(true);
        when(mockListItem4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem4.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem4.isReftext()).thenReturn(false);
        when(mockListItem4.getReftext()).thenReturn(null);
        when(mockListItem4.getTitle()).thenReturn(null);
        when(mockListItem4.getStyle()).thenReturn(null);
        when(mockListItem4.getLevel()).thenReturn(1);
        when(mockListItem4.getContentModel()).thenReturn("compound");
        when(mockListItem4.getSourceLocation()).thenReturn(null);
        when(mockListItem4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList3 = mock(org.asciidoctor.ast.List.class);
        when(mockList3.getId()).thenReturn(null);
        when(mockList3.getNodeName()).thenReturn("olist");
        when(mockList3.getParent()).thenReturn(mockListItem4);
        when(mockList3.getContext()).thenReturn("olist");
        when(mockList3.getDocument()).thenReturn(mockDocument1);
        when(mockList3.isInline()).thenReturn(false);
        when(mockList3.isBlock()).thenReturn(true);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("style", "arabic");
        when(mockList3.getAttributes()).thenReturn(map3);
        when(mockList3.getRoles()).thenReturn(Collections.emptyList());
        when(mockList3.isReftext()).thenReturn(false);
        when(mockList3.getReftext()).thenReturn(null);
        when(mockList3.getTitle()).thenReturn(null);
        when(mockList3.getStyle()).thenReturn("arabic");
        when(mockList3.getLevel()).thenReturn(1);
        when(mockList3.getContentModel()).thenReturn("compound");
        when(mockList3.getSourceLocation()).thenReturn(null);
        when(mockList3.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList3.getBlocks()).thenReturn(null);
        ListItem mockListItem5 = mock(ListItem.class);
        when(mockListItem5.getId()).thenReturn(null);
        when(mockListItem5.getNodeName()).thenReturn("list_item");
        when(mockListItem5.getParent()).thenReturn(mockList3);
        when(mockListItem5.getContext()).thenReturn("list_item");
        when(mockListItem5.getDocument()).thenReturn(mockDocument1);
        when(mockListItem5.isInline()).thenReturn(false);
        when(mockListItem5.isBlock()).thenReturn(true);
        when(mockListItem5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem5.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem5.isReftext()).thenReturn(false);
        when(mockListItem5.getReftext()).thenReturn(null);
        when(mockListItem5.getTitle()).thenReturn(null);
        when(mockListItem5.getStyle()).thenReturn(null);
        when(mockListItem5.getLevel()).thenReturn(1);
        when(mockListItem5.getContentModel()).thenReturn("compound");
        when(mockListItem5.getSourceLocation()).thenReturn(null);
        when(mockListItem5.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem5.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem5.getMarker()).thenReturn(".");
        when(mockListItem5.getText()).thenReturn("one");
        when(mockListItem5.getSource()).thenReturn("one");
        when(mockListItem5.hasText()).thenReturn(true);
        ListItem mockListItem6 = mock(ListItem.class);
        when(mockListItem6.getId()).thenReturn(null);
        when(mockListItem6.getNodeName()).thenReturn("list_item");
        when(mockListItem6.getParent()).thenReturn(mockList3);
        when(mockListItem6.getContext()).thenReturn("list_item");
        when(mockListItem6.getDocument()).thenReturn(mockDocument1);
        when(mockListItem6.isInline()).thenReturn(false);
        when(mockListItem6.isBlock()).thenReturn(true);
        when(mockListItem6.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem6.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem6.isReftext()).thenReturn(false);
        when(mockListItem6.getReftext()).thenReturn(null);
        when(mockListItem6.getTitle()).thenReturn(null);
        when(mockListItem6.getStyle()).thenReturn(null);
        when(mockListItem6.getLevel()).thenReturn(1);
        when(mockListItem6.getContentModel()).thenReturn("compound");
        when(mockListItem6.getSourceLocation()).thenReturn(null);
        when(mockListItem6.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem6.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem6.getMarker()).thenReturn(".");
        when(mockListItem6.getText()).thenReturn("two");
        when(mockListItem6.getSource()).thenReturn("two");
        when(mockListItem6.hasText()).thenReturn(true);
        when(mockList3.getItems()).thenReturn(Arrays.asList(mockListItem5, mockListItem6));
        when(mockList3.hasItems()).thenReturn(true);
        when(mockListItem4.getBlocks()).thenReturn(Collections.singletonList(mockList3));
        when(mockListItem4.getMarker()).thenReturn("*");
        when(mockListItem4.getText()).thenReturn("Main 2");
        when(mockListItem4.getSource()).thenReturn("Main 2");
        when(mockListItem4.hasText()).thenReturn(true);
        ListItem mockListItem7 = mock(ListItem.class);
        when(mockListItem7.getId()).thenReturn(null);
        when(mockListItem7.getNodeName()).thenReturn("list_item");
        when(mockListItem7.getParent()).thenReturn(mockList1);
        when(mockListItem7.getContext()).thenReturn("list_item");
        when(mockListItem7.getDocument()).thenReturn(mockDocument1);
        when(mockListItem7.isInline()).thenReturn(false);
        when(mockListItem7.isBlock()).thenReturn(true);
        when(mockListItem7.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem7.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem7.isReftext()).thenReturn(false);
        when(mockListItem7.getReftext()).thenReturn(null);
        when(mockListItem7.getTitle()).thenReturn(null);
        when(mockListItem7.getStyle()).thenReturn(null);
        when(mockListItem7.getLevel()).thenReturn(1);
        when(mockListItem7.getContentModel()).thenReturn("compound");
        when(mockListItem7.getSourceLocation()).thenReturn(null);
        when(mockListItem7.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList4 = mock(org.asciidoctor.ast.List.class);
        when(mockList4.getId()).thenReturn(null);
        when(mockList4.getNodeName()).thenReturn("ulist");
        when(mockList4.getParent()).thenReturn(mockListItem7);
        when(mockList4.getContext()).thenReturn("ulist");
        when(mockList4.getDocument()).thenReturn(mockDocument1);
        when(mockList4.isInline()).thenReturn(false);
        when(mockList4.isBlock()).thenReturn(true);
        when(mockList4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList4.getRoles()).thenReturn(Collections.emptyList());
        when(mockList4.isReftext()).thenReturn(false);
        when(mockList4.getReftext()).thenReturn(null);
        when(mockList4.getTitle()).thenReturn(null);
        when(mockList4.getStyle()).thenReturn(null);
        when(mockList4.getLevel()).thenReturn(1);
        when(mockList4.getContentModel()).thenReturn("compound");
        when(mockList4.getSourceLocation()).thenReturn(null);
        when(mockList4.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList4.getBlocks()).thenReturn(null);
        ListItem mockListItem8 = mock(ListItem.class);
        when(mockListItem8.getId()).thenReturn(null);
        when(mockListItem8.getNodeName()).thenReturn("list_item");
        when(mockListItem8.getParent()).thenReturn(mockList4);
        when(mockListItem8.getContext()).thenReturn("list_item");
        when(mockListItem8.getDocument()).thenReturn(mockDocument1);
        when(mockListItem8.isInline()).thenReturn(false);
        when(mockListItem8.isBlock()).thenReturn(true);
        when(mockListItem8.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem8.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem8.isReftext()).thenReturn(false);
        when(mockListItem8.getReftext()).thenReturn(null);
        when(mockListItem8.getTitle()).thenReturn(null);
        when(mockListItem8.getStyle()).thenReturn(null);
        when(mockListItem8.getLevel()).thenReturn(1);
        when(mockListItem8.getContentModel()).thenReturn("compound");
        when(mockListItem8.getSourceLocation()).thenReturn(null);
        when(mockListItem8.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList5 = mock(org.asciidoctor.ast.List.class);
        when(mockList5.getId()).thenReturn(null);
        when(mockList5.getNodeName()).thenReturn("ulist");
        when(mockList5.getParent()).thenReturn(mockListItem8);
        when(mockList5.getContext()).thenReturn("ulist");
        when(mockList5.getDocument()).thenReturn(mockDocument1);
        when(mockList5.isInline()).thenReturn(false);
        when(mockList5.isBlock()).thenReturn(true);
        when(mockList5.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList5.getRoles()).thenReturn(Collections.emptyList());
        when(mockList5.isReftext()).thenReturn(false);
        when(mockList5.getReftext()).thenReturn(null);
        when(mockList5.getTitle()).thenReturn(null);
        when(mockList5.getStyle()).thenReturn(null);
        when(mockList5.getLevel()).thenReturn(1);
        when(mockList5.getContentModel()).thenReturn("compound");
        when(mockList5.getSourceLocation()).thenReturn(null);
        when(mockList5.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList5.getBlocks()).thenReturn(null);
        ListItem mockListItem9 = mock(ListItem.class);
        when(mockListItem9.getId()).thenReturn(null);
        when(mockListItem9.getNodeName()).thenReturn("list_item");
        when(mockListItem9.getParent()).thenReturn(mockList5);
        when(mockListItem9.getContext()).thenReturn("list_item");
        when(mockListItem9.getDocument()).thenReturn(mockDocument1);
        when(mockListItem9.isInline()).thenReturn(false);
        when(mockListItem9.isBlock()).thenReturn(true);
        when(mockListItem9.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem9.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem9.isReftext()).thenReturn(false);
        when(mockListItem9.getReftext()).thenReturn(null);
        when(mockListItem9.getTitle()).thenReturn(null);
        when(mockListItem9.getStyle()).thenReturn(null);
        when(mockListItem9.getLevel()).thenReturn(1);
        when(mockListItem9.getContentModel()).thenReturn("compound");
        when(mockListItem9.getSourceLocation()).thenReturn(null);
        when(mockListItem9.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        org.asciidoctor.ast.List mockList6 = mock(org.asciidoctor.ast.List.class);
        when(mockList6.getId()).thenReturn(null);
        when(mockList6.getNodeName()).thenReturn("ulist");
        when(mockList6.getParent()).thenReturn(mockListItem9);
        when(mockList6.getContext()).thenReturn("ulist");
        when(mockList6.getDocument()).thenReturn(mockDocument1);
        when(mockList6.isInline()).thenReturn(false);
        when(mockList6.isBlock()).thenReturn(true);
        when(mockList6.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList6.getRoles()).thenReturn(Collections.emptyList());
        when(mockList6.isReftext()).thenReturn(false);
        when(mockList6.getReftext()).thenReturn(null);
        when(mockList6.getTitle()).thenReturn(null);
        when(mockList6.getStyle()).thenReturn(null);
        when(mockList6.getLevel()).thenReturn(1);
        when(mockList6.getContentModel()).thenReturn("compound");
        when(mockList6.getSourceLocation()).thenReturn(null);
        when(mockList6.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList6.getBlocks()).thenReturn(null);
        ListItem mockListItem10 = mock(ListItem.class);
        when(mockListItem10.getId()).thenReturn(null);
        when(mockListItem10.getNodeName()).thenReturn("list_item");
        when(mockListItem10.getParent()).thenReturn(mockList6);
        when(mockListItem10.getContext()).thenReturn("list_item");
        when(mockListItem10.getDocument()).thenReturn(mockDocument1);
        when(mockListItem10.isInline()).thenReturn(false);
        when(mockListItem10.isBlock()).thenReturn(true);
        when(mockListItem10.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem10.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem10.isReftext()).thenReturn(false);
        when(mockListItem10.getReftext()).thenReturn(null);
        when(mockListItem10.getTitle()).thenReturn(null);
        when(mockListItem10.getStyle()).thenReturn(null);
        when(mockListItem10.getLevel()).thenReturn(1);
        when(mockListItem10.getContentModel()).thenReturn("compound");
        when(mockListItem10.getSourceLocation()).thenReturn(null);
        when(mockListItem10.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem10.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem10.getMarker()).thenReturn("****");
        when(mockListItem10.getText()).thenReturn("z");
        when(mockListItem10.getSource()).thenReturn("z");
        when(mockListItem10.hasText()).thenReturn(true);
        when(mockList6.getItems()).thenReturn(Collections.singletonList(mockListItem10));
        when(mockList6.hasItems()).thenReturn(true);
        when(mockListItem9.getBlocks()).thenReturn(Collections.singletonList(mockList6));
        when(mockListItem9.getMarker()).thenReturn("***");
        when(mockListItem9.getText()).thenReturn("y");
        when(mockListItem9.getSource()).thenReturn("y");
        when(mockListItem9.hasText()).thenReturn(true);
        when(mockList5.getItems()).thenReturn(Collections.singletonList(mockListItem9));
        when(mockList5.hasItems()).thenReturn(true);
        when(mockListItem8.getBlocks()).thenReturn(Collections.singletonList(mockList5));
        when(mockListItem8.getMarker()).thenReturn("**");
        when(mockListItem8.getText()).thenReturn("x");
        when(mockListItem8.getSource()).thenReturn("x");
        when(mockListItem8.hasText()).thenReturn(true);
        when(mockList4.getItems()).thenReturn(Collections.singletonList(mockListItem8));
        when(mockList4.hasItems()).thenReturn(true);
        when(mockListItem7.getBlocks()).thenReturn(Collections.singletonList(mockList4));
        when(mockListItem7.getMarker()).thenReturn("*");
        when(mockListItem7.getText()).thenReturn("Main 3");
        when(mockListItem7.getSource()).thenReturn("Main 3");
        when(mockListItem7.hasText()).thenReturn(true);
        ListItem mockListItem11 = mock(ListItem.class);
        when(mockListItem11.getId()).thenReturn(null);
        when(mockListItem11.getNodeName()).thenReturn("list_item");
        when(mockListItem11.getParent()).thenReturn(mockList1);
        when(mockListItem11.getContext()).thenReturn("list_item");
        when(mockListItem11.getDocument()).thenReturn(mockDocument1);
        when(mockListItem11.isInline()).thenReturn(false);
        when(mockListItem11.isBlock()).thenReturn(true);
        when(mockListItem11.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockListItem11.getRoles()).thenReturn(Collections.emptyList());
        when(mockListItem11.isReftext()).thenReturn(false);
        when(mockListItem11.getReftext()).thenReturn(null);
        when(mockListItem11.getTitle()).thenReturn(null);
        when(mockListItem11.getStyle()).thenReturn(null);
        when(mockListItem11.getLevel()).thenReturn(1);
        when(mockListItem11.getContentModel()).thenReturn("compound");
        when(mockListItem11.getSourceLocation()).thenReturn(null);
        when(mockListItem11.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockListItem11.getBlocks()).thenReturn(Collections.emptyList());
        when(mockListItem11.getMarker()).thenReturn("*");
        when(mockListItem11.getText()).thenReturn("Main 4");
        when(mockListItem11.getSource()).thenReturn("Main 4");
        when(mockListItem11.hasText()).thenReturn(true);
        when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem4, mockListItem7, mockListItem11));
        when(mockList1.hasItems()).thenReturn(true);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockList1));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map4 = new HashMap<>();
        map4.put("attributes", "{}");
        map4.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map4);
        return mockDocument1;
    }
    // end::mock-code[]
}