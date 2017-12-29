package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.DescriptionList;
import org.asciidoctor.ast.DescriptionListEntry;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;
import org.junit.Test;

public abstract class AbstractListLabeledNestedMixedTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isXmlEqualTo(EXPECTED_HTML);
    }

    public static final String ASCIIDOC = "" +
            "Operating Systems::\n" +
            "  Linux:::\n" +
            "    . Fedora\n" +
            "      * Desktop\n" +
            "    . Ubuntu\n" +
            "      * Desktop\n" +
            "      * Server\n" +
            "  BSD:::\n" +
            "    . FreeBSD\n" +
            "    . NetBSD\n" +
            "\n" +
            "Cloud Providers::\n" +
            "  PaaS:::\n" +
            "    . OpenShift\n" +
            "    . CloudBees\n" +
            "  IaaS:::\n" +
            "    . Amazon EC2\n" +
            "    . Rackspace" +
            "";

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<div class=\"dlist\">\n" +
            "<dl>\n" +
            "<dt class=\"hdlist1\">\n" +
            "Operating Systems\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"dlist\">\n" +
            "<dl>\n" +
            "<dt class=\"hdlist1\">\n" +
            "Linux\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"olist arabic\">\n" +
            "<ol class=\"arabic\">\n" +
            "<li> <p>Fedora</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>Desktop</p> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "<li> <p>Ubuntu</p>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>Desktop</p> </li>\n" +
            "<li> <p>Server</p> </li>\n" +
            "</ul>\n" +
            "</div> </li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</dd>\n" +
            "<dt class=\"hdlist1\">\n" +
            "BSD\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"olist arabic\">\n" +
            "<ol class=\"arabic\">\n" +
            "<li> <p>FreeBSD</p> </li>\n" +
            "<li> <p>NetBSD</p> </li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</dd>\n" +
            "</dl>\n" +
            "</div>\n" +
            "</dd>\n" +
            "<dt class=\"hdlist1\">\n" +
            "Cloud Providers\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"dlist\">\n" +
            "<dl>\n" +
            "<dt class=\"hdlist1\">\n" +
            "PaaS\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"olist arabic\">\n" +
            "<ol class=\"arabic\">\n" +
            "<li> <p>OpenShift</p> </li>\n" +
            "<li> <p>CloudBees</p> </li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</dd>\n" +
            "<dt class=\"hdlist1\">\n" +
            "IaaS\n" +
            "</dt>\n" +
            "<dd>\n" +
            "<div class=\"olist arabic\">\n" +
            "<ol class=\"arabic\">\n" +
            "<li> <p>Amazon EC2</p> </li>\n" +
            "<li> <p>Rackspace</p> </li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</dd>\n" +
            "</dl>\n" +
            "</div>\n" +
            "</dd>\n" +
            "</dl>\n" +
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
                .containsEntry("prewrap", "");
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
        DescriptionList descriptionList1 = (DescriptionList) document1.getBlocks()
                .get(0);
        assertThat(descriptionList1.getId()).isNull();
        assertThat(descriptionList1.getNodeName()).isEqualTo("dlist");
        assertThat(descriptionList1.getContext()).isEqualTo("dlist");
        assertThat(descriptionList1.getDocument()).isSameAs(document1);
        assertThat(descriptionList1.isInline()).isFalse();
        assertThat(descriptionList1.isBlock()).isTrue();
        assertThat(descriptionList1.getAttributes()).isNullOrEmpty();
        assertThat(descriptionList1.getRoles()).isNullOrEmpty();
        assertThat(descriptionList1.isReftext()).isFalse();
        assertThat(descriptionList1.getReftext()).isNull();
        assertThat(descriptionList1.getTitle()).isNull();
        assertThat(descriptionList1.getStyle()).isNull();
        assertThat(descriptionList1.getLevel()).isEqualTo(0);
        assertThat(descriptionList1.getContentModel()).isEqualTo("compound");
        assertThat(descriptionList1.getSourceLocation()).isNull();
        assertThat(descriptionList1.getSubstitutions()).isNullOrEmpty();
        assertThat(descriptionList1.getBlocks()).isNullOrEmpty();
        assertThat(descriptionList1.getItems()).hasSize(2);
        DescriptionListEntry descriptionListEntry1 = (DescriptionListEntry) descriptionList1.getItems()
                .get(0);
        ListItem listItem1 = descriptionListEntry1.getDescription();
        assertThat(listItem1.getId()).isNull();
        assertThat(listItem1.getNodeName()).isEqualTo("list_item");
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
        assertThat(listItem1.getLevel()).isEqualTo(0);
        assertThat(listItem1.getContentModel()).isEqualTo("compound");
        assertThat(listItem1.getSourceLocation()).isNull();
        assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem1.getBlocks()).hasSize(1);
        DescriptionList descriptionList2 = (DescriptionList) listItem1.getBlocks()
                .get(0);
        assertThat(descriptionList2.getId()).isNull();
        assertThat(descriptionList2.getNodeName()).isEqualTo("dlist");
        assertThat(descriptionList2.getContext()).isEqualTo("dlist");
        assertThat(descriptionList2.getDocument()).isSameAs(document1);
        assertThat(descriptionList2.isInline()).isFalse();
        assertThat(descriptionList2.isBlock()).isTrue();
        assertThat(descriptionList2.getAttributes()).isNullOrEmpty();
        assertThat(descriptionList2.getRoles()).isNullOrEmpty();
        assertThat(descriptionList2.isReftext()).isFalse();
        assertThat(descriptionList2.getReftext()).isNull();
        assertThat(descriptionList2.getTitle()).isNull();
        assertThat(descriptionList2.getStyle()).isNull();
        assertThat(descriptionList2.getLevel()).isEqualTo(0);
        assertThat(descriptionList2.getContentModel()).isEqualTo("compound");
        assertThat(descriptionList2.getSourceLocation()).isNull();
        assertThat(descriptionList2.getSubstitutions()).isNullOrEmpty();
        assertThat(descriptionList2.getBlocks()).isNullOrEmpty();
        assertThat(descriptionList2.getItems()).hasSize(2);
        DescriptionListEntry descriptionListEntry2 = (DescriptionListEntry) descriptionList2.getItems()
                .get(0);
        ListItem listItem2 = descriptionListEntry2.getDescription();
        assertThat(listItem2.getId()).isNull();
        assertThat(listItem2.getNodeName()).isEqualTo("list_item");
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
        assertThat(listItem2.getLevel()).isEqualTo(0);
        assertThat(listItem2.getContentModel()).isEqualTo("compound");
        assertThat(listItem2.getSourceLocation()).isNull();
        assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem2.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) listItem2.getBlocks()
                .get(0);
        assertThat(list1.getId()).isNull();
        assertThat(list1.getNodeName()).isEqualTo("olist");
        assertThat(list1.getParent()).isSameAs(listItem2);
        assertThat(list1.getContext()).isEqualTo("olist");
        assertThat(list1.getDocument()).isSameAs(document1);
        assertThat(list1.isInline()).isFalse();
        assertThat(list1.isBlock()).isTrue();
        assertThat(list1.getAttributes()).containsEntry("style", "arabic");
        assertThat(list1.getRoles()).isNullOrEmpty();
        assertThat(list1.isReftext()).isFalse();
        assertThat(list1.getReftext()).isNull();
        assertThat(list1.getTitle()).isNull();
        assertThat(list1.getStyle()).isEqualTo("arabic");
        assertThat(list1.getLevel()).isEqualTo(1);
        assertThat(list1.getContentModel()).isEqualTo("compound");
        assertThat(list1.getSourceLocation()).isNull();
        assertThat(list1.getSubstitutions()).isNullOrEmpty();
        assertThat(list1.getBlocks()).isNullOrEmpty();
        assertThat(list1.getItems()).hasSize(2);
        ListItem listItem3 = (ListItem) list1.getItems()
                .get(0);
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
        assertThat(listItem3.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list2 = (org.asciidoctor.ast.List) listItem3.getBlocks()
                .get(0);
        assertThat(list2.getId()).isNull();
        assertThat(list2.getNodeName()).isEqualTo("ulist");
        assertThat(list2.getParent()).isSameAs(listItem3);
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
        assertThat(list2.getItems()).hasSize(1);
        ListItem listItem4 = (ListItem) list2.getItems()
                .get(0);
        assertThat(listItem4.getId()).isNull();
        assertThat(listItem4.getNodeName()).isEqualTo("list_item");
        assertThat(listItem4.getParent()).isSameAs(list2);
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
        assertThat(listItem4.getBlocks()).isNullOrEmpty();
        assertThat(listItem4.getMarker()).isEqualTo("*");
        assertThat(listItem4.getText()).isEqualTo("Desktop");
        assertThat(listItem4.getSource()).isEqualTo("Desktop");
        assertThat(listItem4.hasText()).isTrue();
        assertThat(list2.hasItems()).isTrue();
        assertThat(listItem3.getMarker()).isEqualTo(".");
        assertThat(listItem3.getText()).isEqualTo("Fedora");
        assertThat(listItem3.getSource()).isEqualTo("Fedora");
        assertThat(listItem3.hasText()).isTrue();
        ListItem listItem5 = (ListItem) list1.getItems()
                .get(1);
        assertThat(listItem5.getId()).isNull();
        assertThat(listItem5.getNodeName()).isEqualTo("list_item");
        assertThat(listItem5.getParent()).isSameAs(list1);
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
        assertThat(listItem5.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list3 = (org.asciidoctor.ast.List) listItem5.getBlocks()
                .get(0);
        assertThat(list3.getId()).isNull();
        assertThat(list3.getNodeName()).isEqualTo("ulist");
        assertThat(list3.getParent()).isSameAs(listItem5);
        assertThat(list3.getContext()).isEqualTo("ulist");
        assertThat(list3.getDocument()).isSameAs(document1);
        assertThat(list3.isInline()).isFalse();
        assertThat(list3.isBlock()).isTrue();
        assertThat(list3.getAttributes()).isNullOrEmpty();
        assertThat(list3.getRoles()).isNullOrEmpty();
        assertThat(list3.isReftext()).isFalse();
        assertThat(list3.getReftext()).isNull();
        assertThat(list3.getTitle()).isNull();
        assertThat(list3.getStyle()).isNull();
        assertThat(list3.getLevel()).isEqualTo(1);
        assertThat(list3.getContentModel()).isEqualTo("compound");
        assertThat(list3.getSourceLocation()).isNull();
        assertThat(list3.getSubstitutions()).isNullOrEmpty();
        assertThat(list3.getBlocks()).isNullOrEmpty();
        assertThat(list3.getItems()).hasSize(2);
        ListItem listItem6 = (ListItem) list3.getItems()
                .get(0);
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
        assertThat(listItem6.getMarker()).isEqualTo("*");
        assertThat(listItem6.getText()).isEqualTo("Desktop");
        assertThat(listItem6.getSource()).isEqualTo("Desktop");
        assertThat(listItem6.hasText()).isTrue();
        ListItem listItem7 = (ListItem) list3.getItems()
                .get(1);
        assertThat(listItem7.getId()).isNull();
        assertThat(listItem7.getNodeName()).isEqualTo("list_item");
        assertThat(listItem7.getParent()).isSameAs(list3);
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
        assertThat(listItem7.getBlocks()).isNullOrEmpty();
        assertThat(listItem7.getMarker()).isEqualTo("*");
        assertThat(listItem7.getText()).isEqualTo("Server");
        assertThat(listItem7.getSource()).isEqualTo("Server");
        assertThat(listItem7.hasText()).isTrue();
        assertThat(list3.hasItems()).isTrue();
        assertThat(listItem5.getMarker()).isEqualTo(".");
        assertThat(listItem5.getText()).isEqualTo("Ubuntu");
        assertThat(listItem5.getSource()).isEqualTo("Ubuntu");
        assertThat(listItem5.hasText()).isTrue();
        assertThat(list1.hasItems()).isTrue();
        assertThat(listItem2.getMarker()).isNull();
        assertThat(listItem2.getSource()).isNull();
        assertThat(listItem2.hasText()).isFalse();
        assertThat(descriptionListEntry2.getTerms()).hasSize(1);
        ListItem listItem8 = (ListItem) descriptionListEntry2.getTerms()
                .get(0);
        assertThat(listItem8.getId()).isNull();
        assertThat(listItem8.getNodeName()).isEqualTo("list_item");
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
        assertThat(listItem8.getLevel()).isEqualTo(0);
        assertThat(listItem8.getContentModel()).isEqualTo("compound");
        assertThat(listItem8.getSourceLocation()).isNull();
        assertThat(listItem8.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem8.getBlocks()).isNullOrEmpty();
        assertThat(listItem8.getMarker()).isNull();
        assertThat(listItem8.getText()).isEqualTo("Linux");
        assertThat(listItem8.getSource()).isEqualTo("Linux");
        assertThat(listItem8.hasText()).isTrue();
        DescriptionListEntry descriptionListEntry3 = (DescriptionListEntry) descriptionList2.getItems()
                .get(1);
        ListItem listItem9 = descriptionListEntry3.getDescription();
        assertThat(listItem9.getId()).isNull();
        assertThat(listItem9.getNodeName()).isEqualTo("list_item");
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
        assertThat(listItem9.getLevel()).isEqualTo(0);
        assertThat(listItem9.getContentModel()).isEqualTo("compound");
        assertThat(listItem9.getSourceLocation()).isNull();
        assertThat(listItem9.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem9.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list4 = (org.asciidoctor.ast.List) listItem9.getBlocks()
                .get(0);
        assertThat(list4.getId()).isNull();
        assertThat(list4.getNodeName()).isEqualTo("olist");
        assertThat(list4.getParent()).isSameAs(listItem9);
        assertThat(list4.getContext()).isEqualTo("olist");
        assertThat(list4.getDocument()).isSameAs(document1);
        assertThat(list4.isInline()).isFalse();
        assertThat(list4.isBlock()).isTrue();
        assertThat(list4.getAttributes()).containsEntry("style", "arabic");
        assertThat(list4.getRoles()).isNullOrEmpty();
        assertThat(list4.isReftext()).isFalse();
        assertThat(list4.getReftext()).isNull();
        assertThat(list4.getTitle()).isNull();
        assertThat(list4.getStyle()).isEqualTo("arabic");
        assertThat(list4.getLevel()).isEqualTo(1);
        assertThat(list4.getContentModel()).isEqualTo("compound");
        assertThat(list4.getSourceLocation()).isNull();
        assertThat(list4.getSubstitutions()).isNullOrEmpty();
        assertThat(list4.getBlocks()).isNullOrEmpty();
        assertThat(list4.getItems()).hasSize(2);
        ListItem listItem10 = (ListItem) list4.getItems()
                .get(0);
        assertThat(listItem10.getId()).isNull();
        assertThat(listItem10.getNodeName()).isEqualTo("list_item");
        assertThat(listItem10.getParent()).isSameAs(list4);
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
        assertThat(listItem10.getMarker()).isEqualTo(".");
        assertThat(listItem10.getText()).isEqualTo("FreeBSD");
        assertThat(listItem10.getSource()).isEqualTo("FreeBSD");
        assertThat(listItem10.hasText()).isTrue();
        ListItem listItem11 = (ListItem) list4.getItems()
                .get(1);
        assertThat(listItem11.getId()).isNull();
        assertThat(listItem11.getNodeName()).isEqualTo("list_item");
        assertThat(listItem11.getParent()).isSameAs(list4);
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
        assertThat(listItem11.getMarker()).isEqualTo(".");
        assertThat(listItem11.getText()).isEqualTo("NetBSD");
        assertThat(listItem11.getSource()).isEqualTo("NetBSD");
        assertThat(listItem11.hasText()).isTrue();
        assertThat(list4.hasItems()).isTrue();
        assertThat(listItem9.getMarker()).isNull();
        assertThat(listItem9.getSource()).isNull();
        assertThat(listItem9.hasText()).isFalse();
        assertThat(descriptionListEntry3.getTerms()).hasSize(1);
        ListItem listItem12 = (ListItem) descriptionListEntry3.getTerms()
                .get(0);
        assertThat(listItem12.getId()).isNull();
        assertThat(listItem12.getNodeName()).isEqualTo("list_item");
        assertThat(listItem12.getContext()).isEqualTo("list_item");
        assertThat(listItem12.getDocument()).isSameAs(document1);
        assertThat(listItem12.isInline()).isFalse();
        assertThat(listItem12.isBlock()).isTrue();
        assertThat(listItem12.getAttributes()).isNullOrEmpty();
        assertThat(listItem12.getRoles()).isNullOrEmpty();
        assertThat(listItem12.isReftext()).isFalse();
        assertThat(listItem12.getReftext()).isNull();
        assertThat(listItem12.getTitle()).isNull();
        assertThat(listItem12.getStyle()).isNull();
        assertThat(listItem12.getLevel()).isEqualTo(0);
        assertThat(listItem12.getContentModel()).isEqualTo("compound");
        assertThat(listItem12.getSourceLocation()).isNull();
        assertThat(listItem12.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem12.getBlocks()).isNullOrEmpty();
        assertThat(listItem12.getMarker()).isNull();
        assertThat(listItem12.getText()).isEqualTo("BSD");
        assertThat(listItem12.getSource()).isEqualTo("BSD");
        assertThat(listItem12.hasText()).isTrue();
        assertThat(listItem1.getMarker()).isNull();
        assertThat(listItem1.getSource()).isNull();
        assertThat(listItem1.hasText()).isFalse();
        assertThat(descriptionListEntry1.getTerms()).hasSize(1);
        ListItem listItem13 = (ListItem) descriptionListEntry1.getTerms()
                .get(0);
        assertThat(listItem13.getId()).isNull();
        assertThat(listItem13.getNodeName()).isEqualTo("list_item");
        assertThat(listItem13.getContext()).isEqualTo("list_item");
        assertThat(listItem13.getDocument()).isSameAs(document1);
        assertThat(listItem13.isInline()).isFalse();
        assertThat(listItem13.isBlock()).isTrue();
        assertThat(listItem13.getAttributes()).isNullOrEmpty();
        assertThat(listItem13.getRoles()).isNullOrEmpty();
        assertThat(listItem13.isReftext()).isFalse();
        assertThat(listItem13.getReftext()).isNull();
        assertThat(listItem13.getTitle()).isNull();
        assertThat(listItem13.getStyle()).isNull();
        assertThat(listItem13.getLevel()).isEqualTo(0);
        assertThat(listItem13.getContentModel()).isEqualTo("compound");
        assertThat(listItem13.getSourceLocation()).isNull();
        assertThat(listItem13.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem13.getBlocks()).isNullOrEmpty();
        assertThat(listItem13.getMarker()).isNull();
        assertThat(listItem13.getText()).isEqualTo("Operating Systems");
        assertThat(listItem13.getSource()).isEqualTo("Operating Systems");
        assertThat(listItem13.hasText()).isTrue();
        DescriptionListEntry descriptionListEntry4 = (DescriptionListEntry) descriptionList1.getItems()
                .get(1);
        ListItem listItem14 = descriptionListEntry4.getDescription();
        assertThat(listItem14.getId()).isNull();
        assertThat(listItem14.getNodeName()).isEqualTo("list_item");
        assertThat(listItem14.getContext()).isEqualTo("list_item");
        assertThat(listItem14.getDocument()).isSameAs(document1);
        assertThat(listItem14.isInline()).isFalse();
        assertThat(listItem14.isBlock()).isTrue();
        assertThat(listItem14.getAttributes()).isNullOrEmpty();
        assertThat(listItem14.getRoles()).isNullOrEmpty();
        assertThat(listItem14.isReftext()).isFalse();
        assertThat(listItem14.getReftext()).isNull();
        assertThat(listItem14.getTitle()).isNull();
        assertThat(listItem14.getStyle()).isNull();
        assertThat(listItem14.getLevel()).isEqualTo(0);
        assertThat(listItem14.getContentModel()).isEqualTo("compound");
        assertThat(listItem14.getSourceLocation()).isNull();
        assertThat(listItem14.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem14.getBlocks()).hasSize(1);
        DescriptionList descriptionList3 = (DescriptionList) listItem14.getBlocks()
                .get(0);
        assertThat(descriptionList3.getId()).isNull();
        assertThat(descriptionList3.getNodeName()).isEqualTo("dlist");
        assertThat(descriptionList3.getContext()).isEqualTo("dlist");
        assertThat(descriptionList3.getDocument()).isSameAs(document1);
        assertThat(descriptionList3.isInline()).isFalse();
        assertThat(descriptionList3.isBlock()).isTrue();
        assertThat(descriptionList3.getAttributes()).isNullOrEmpty();
        assertThat(descriptionList3.getRoles()).isNullOrEmpty();
        assertThat(descriptionList3.isReftext()).isFalse();
        assertThat(descriptionList3.getReftext()).isNull();
        assertThat(descriptionList3.getTitle()).isNull();
        assertThat(descriptionList3.getStyle()).isNull();
        assertThat(descriptionList3.getLevel()).isEqualTo(0);
        assertThat(descriptionList3.getContentModel()).isEqualTo("compound");
        assertThat(descriptionList3.getSourceLocation()).isNull();
        assertThat(descriptionList3.getSubstitutions()).isNullOrEmpty();
        assertThat(descriptionList3.getBlocks()).isNullOrEmpty();
        assertThat(descriptionList3.getItems()).hasSize(2);
        DescriptionListEntry descriptionListEntry5 = (DescriptionListEntry) descriptionList3.getItems()
                .get(0);
        ListItem listItem15 = descriptionListEntry5.getDescription();
        assertThat(listItem15.getId()).isNull();
        assertThat(listItem15.getNodeName()).isEqualTo("list_item");
        assertThat(listItem15.getContext()).isEqualTo("list_item");
        assertThat(listItem15.getDocument()).isSameAs(document1);
        assertThat(listItem15.isInline()).isFalse();
        assertThat(listItem15.isBlock()).isTrue();
        assertThat(listItem15.getAttributes()).isNullOrEmpty();
        assertThat(listItem15.getRoles()).isNullOrEmpty();
        assertThat(listItem15.isReftext()).isFalse();
        assertThat(listItem15.getReftext()).isNull();
        assertThat(listItem15.getTitle()).isNull();
        assertThat(listItem15.getStyle()).isNull();
        assertThat(listItem15.getLevel()).isEqualTo(0);
        assertThat(listItem15.getContentModel()).isEqualTo("compound");
        assertThat(listItem15.getSourceLocation()).isNull();
        assertThat(listItem15.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem15.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list5 = (org.asciidoctor.ast.List) listItem15.getBlocks()
                .get(0);
        assertThat(list5.getId()).isNull();
        assertThat(list5.getNodeName()).isEqualTo("olist");
        assertThat(list5.getParent()).isSameAs(listItem15);
        assertThat(list5.getContext()).isEqualTo("olist");
        assertThat(list5.getDocument()).isSameAs(document1);
        assertThat(list5.isInline()).isFalse();
        assertThat(list5.isBlock()).isTrue();
        assertThat(list5.getAttributes()).containsEntry("style", "arabic");
        assertThat(list5.getRoles()).isNullOrEmpty();
        assertThat(list5.isReftext()).isFalse();
        assertThat(list5.getReftext()).isNull();
        assertThat(list5.getTitle()).isNull();
        assertThat(list5.getStyle()).isEqualTo("arabic");
        assertThat(list5.getLevel()).isEqualTo(1);
        assertThat(list5.getContentModel()).isEqualTo("compound");
        assertThat(list5.getSourceLocation()).isNull();
        assertThat(list5.getSubstitutions()).isNullOrEmpty();
        assertThat(list5.getBlocks()).isNullOrEmpty();
        assertThat(list5.getItems()).hasSize(2);
        ListItem listItem16 = (ListItem) list5.getItems()
                .get(0);
        assertThat(listItem16.getId()).isNull();
        assertThat(listItem16.getNodeName()).isEqualTo("list_item");
        assertThat(listItem16.getParent()).isSameAs(list5);
        assertThat(listItem16.getContext()).isEqualTo("list_item");
        assertThat(listItem16.getDocument()).isSameAs(document1);
        assertThat(listItem16.isInline()).isFalse();
        assertThat(listItem16.isBlock()).isTrue();
        assertThat(listItem16.getAttributes()).isNullOrEmpty();
        assertThat(listItem16.getRoles()).isNullOrEmpty();
        assertThat(listItem16.isReftext()).isFalse();
        assertThat(listItem16.getReftext()).isNull();
        assertThat(listItem16.getTitle()).isNull();
        assertThat(listItem16.getStyle()).isNull();
        assertThat(listItem16.getLevel()).isEqualTo(1);
        assertThat(listItem16.getContentModel()).isEqualTo("compound");
        assertThat(listItem16.getSourceLocation()).isNull();
        assertThat(listItem16.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem16.getBlocks()).isNullOrEmpty();
        assertThat(listItem16.getMarker()).isEqualTo(".");
        assertThat(listItem16.getText()).isEqualTo("OpenShift");
        assertThat(listItem16.getSource()).isEqualTo("OpenShift");
        assertThat(listItem16.hasText()).isTrue();
        ListItem listItem17 = (ListItem) list5.getItems()
                .get(1);
        assertThat(listItem17.getId()).isNull();
        assertThat(listItem17.getNodeName()).isEqualTo("list_item");
        assertThat(listItem17.getParent()).isSameAs(list5);
        assertThat(listItem17.getContext()).isEqualTo("list_item");
        assertThat(listItem17.getDocument()).isSameAs(document1);
        assertThat(listItem17.isInline()).isFalse();
        assertThat(listItem17.isBlock()).isTrue();
        assertThat(listItem17.getAttributes()).isNullOrEmpty();
        assertThat(listItem17.getRoles()).isNullOrEmpty();
        assertThat(listItem17.isReftext()).isFalse();
        assertThat(listItem17.getReftext()).isNull();
        assertThat(listItem17.getTitle()).isNull();
        assertThat(listItem17.getStyle()).isNull();
        assertThat(listItem17.getLevel()).isEqualTo(1);
        assertThat(listItem17.getContentModel()).isEqualTo("compound");
        assertThat(listItem17.getSourceLocation()).isNull();
        assertThat(listItem17.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem17.getBlocks()).isNullOrEmpty();
        assertThat(listItem17.getMarker()).isEqualTo(".");
        assertThat(listItem17.getText()).isEqualTo("CloudBees");
        assertThat(listItem17.getSource()).isEqualTo("CloudBees");
        assertThat(listItem17.hasText()).isTrue();
        assertThat(list5.hasItems()).isTrue();
        assertThat(listItem15.getMarker()).isNull();
        assertThat(listItem15.getSource()).isNull();
        assertThat(listItem15.hasText()).isFalse();
        assertThat(descriptionListEntry5.getTerms()).hasSize(1);
        ListItem listItem18 = (ListItem) descriptionListEntry5.getTerms()
                .get(0);
        assertThat(listItem18.getId()).isNull();
        assertThat(listItem18.getNodeName()).isEqualTo("list_item");
        assertThat(listItem18.getContext()).isEqualTo("list_item");
        assertThat(listItem18.getDocument()).isSameAs(document1);
        assertThat(listItem18.isInline()).isFalse();
        assertThat(listItem18.isBlock()).isTrue();
        assertThat(listItem18.getAttributes()).isNullOrEmpty();
        assertThat(listItem18.getRoles()).isNullOrEmpty();
        assertThat(listItem18.isReftext()).isFalse();
        assertThat(listItem18.getReftext()).isNull();
        assertThat(listItem18.getTitle()).isNull();
        assertThat(listItem18.getStyle()).isNull();
        assertThat(listItem18.getLevel()).isEqualTo(0);
        assertThat(listItem18.getContentModel()).isEqualTo("compound");
        assertThat(listItem18.getSourceLocation()).isNull();
        assertThat(listItem18.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem18.getBlocks()).isNullOrEmpty();
        assertThat(listItem18.getMarker()).isNull();
        assertThat(listItem18.getText()).isEqualTo("PaaS");
        assertThat(listItem18.getSource()).isEqualTo("PaaS");
        assertThat(listItem18.hasText()).isTrue();
        DescriptionListEntry descriptionListEntry6 = (DescriptionListEntry) descriptionList3.getItems()
                .get(1);
        ListItem listItem19 = descriptionListEntry6.getDescription();
        assertThat(listItem19.getId()).isNull();
        assertThat(listItem19.getNodeName()).isEqualTo("list_item");
        assertThat(listItem19.getContext()).isEqualTo("list_item");
        assertThat(listItem19.getDocument()).isSameAs(document1);
        assertThat(listItem19.isInline()).isFalse();
        assertThat(listItem19.isBlock()).isTrue();
        assertThat(listItem19.getAttributes()).isNullOrEmpty();
        assertThat(listItem19.getRoles()).isNullOrEmpty();
        assertThat(listItem19.isReftext()).isFalse();
        assertThat(listItem19.getReftext()).isNull();
        assertThat(listItem19.getTitle()).isNull();
        assertThat(listItem19.getStyle()).isNull();
        assertThat(listItem19.getLevel()).isEqualTo(0);
        assertThat(listItem19.getContentModel()).isEqualTo("compound");
        assertThat(listItem19.getSourceLocation()).isNull();
        assertThat(listItem19.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem19.getBlocks()).hasSize(1);
        org.asciidoctor.ast.List list6 = (org.asciidoctor.ast.List) listItem19.getBlocks()
                .get(0);
        assertThat(list6.getId()).isNull();
        assertThat(list6.getNodeName()).isEqualTo("olist");
        assertThat(list6.getParent()).isSameAs(listItem19);
        assertThat(list6.getContext()).isEqualTo("olist");
        assertThat(list6.getDocument()).isSameAs(document1);
        assertThat(list6.isInline()).isFalse();
        assertThat(list6.isBlock()).isTrue();
        assertThat(list6.getAttributes()).containsEntry("style", "arabic");
        assertThat(list6.getRoles()).isNullOrEmpty();
        assertThat(list6.isReftext()).isFalse();
        assertThat(list6.getReftext()).isNull();
        assertThat(list6.getTitle()).isNull();
        assertThat(list6.getStyle()).isEqualTo("arabic");
        assertThat(list6.getLevel()).isEqualTo(1);
        assertThat(list6.getContentModel()).isEqualTo("compound");
        assertThat(list6.getSourceLocation()).isNull();
        assertThat(list6.getSubstitutions()).isNullOrEmpty();
        assertThat(list6.getBlocks()).isNullOrEmpty();
        assertThat(list6.getItems()).hasSize(2);
        ListItem listItem20 = (ListItem) list6.getItems()
                .get(0);
        assertThat(listItem20.getId()).isNull();
        assertThat(listItem20.getNodeName()).isEqualTo("list_item");
        assertThat(listItem20.getParent()).isSameAs(list6);
        assertThat(listItem20.getContext()).isEqualTo("list_item");
        assertThat(listItem20.getDocument()).isSameAs(document1);
        assertThat(listItem20.isInline()).isFalse();
        assertThat(listItem20.isBlock()).isTrue();
        assertThat(listItem20.getAttributes()).isNullOrEmpty();
        assertThat(listItem20.getRoles()).isNullOrEmpty();
        assertThat(listItem20.isReftext()).isFalse();
        assertThat(listItem20.getReftext()).isNull();
        assertThat(listItem20.getTitle()).isNull();
        assertThat(listItem20.getStyle()).isNull();
        assertThat(listItem20.getLevel()).isEqualTo(1);
        assertThat(listItem20.getContentModel()).isEqualTo("compound");
        assertThat(listItem20.getSourceLocation()).isNull();
        assertThat(listItem20.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem20.getBlocks()).isNullOrEmpty();
        assertThat(listItem20.getMarker()).isEqualTo(".");
        assertThat(listItem20.getText()).isEqualTo("Amazon EC2");
        assertThat(listItem20.getSource()).isEqualTo("Amazon EC2");
        assertThat(listItem20.hasText()).isTrue();
        ListItem listItem21 = (ListItem) list6.getItems()
                .get(1);
        assertThat(listItem21.getId()).isNull();
        assertThat(listItem21.getNodeName()).isEqualTo("list_item");
        assertThat(listItem21.getParent()).isSameAs(list6);
        assertThat(listItem21.getContext()).isEqualTo("list_item");
        assertThat(listItem21.getDocument()).isSameAs(document1);
        assertThat(listItem21.isInline()).isFalse();
        assertThat(listItem21.isBlock()).isTrue();
        assertThat(listItem21.getAttributes()).isNullOrEmpty();
        assertThat(listItem21.getRoles()).isNullOrEmpty();
        assertThat(listItem21.isReftext()).isFalse();
        assertThat(listItem21.getReftext()).isNull();
        assertThat(listItem21.getTitle()).isNull();
        assertThat(listItem21.getStyle()).isNull();
        assertThat(listItem21.getLevel()).isEqualTo(1);
        assertThat(listItem21.getContentModel()).isEqualTo("compound");
        assertThat(listItem21.getSourceLocation()).isNull();
        assertThat(listItem21.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem21.getBlocks()).isNullOrEmpty();
        assertThat(listItem21.getMarker()).isEqualTo(".");
        assertThat(listItem21.getText()).isEqualTo("Rackspace");
        assertThat(listItem21.getSource()).isEqualTo("Rackspace");
        assertThat(listItem21.hasText()).isTrue();
        assertThat(list6.hasItems()).isTrue();
        assertThat(listItem19.getMarker()).isNull();
        assertThat(listItem19.getSource()).isNull();
        assertThat(listItem19.hasText()).isFalse();
        assertThat(descriptionListEntry6.getTerms()).hasSize(1);
        ListItem listItem22 = (ListItem) descriptionListEntry6.getTerms()
                .get(0);
        assertThat(listItem22.getId()).isNull();
        assertThat(listItem22.getNodeName()).isEqualTo("list_item");
        assertThat(listItem22.getContext()).isEqualTo("list_item");
        assertThat(listItem22.getDocument()).isSameAs(document1);
        assertThat(listItem22.isInline()).isFalse();
        assertThat(listItem22.isBlock()).isTrue();
        assertThat(listItem22.getAttributes()).isNullOrEmpty();
        assertThat(listItem22.getRoles()).isNullOrEmpty();
        assertThat(listItem22.isReftext()).isFalse();
        assertThat(listItem22.getReftext()).isNull();
        assertThat(listItem22.getTitle()).isNull();
        assertThat(listItem22.getStyle()).isNull();
        assertThat(listItem22.getLevel()).isEqualTo(0);
        assertThat(listItem22.getContentModel()).isEqualTo("compound");
        assertThat(listItem22.getSourceLocation()).isNull();
        assertThat(listItem22.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem22.getBlocks()).isNullOrEmpty();
        assertThat(listItem22.getMarker()).isNull();
        assertThat(listItem22.getText()).isEqualTo("IaaS");
        assertThat(listItem22.getSource()).isEqualTo("IaaS");
        assertThat(listItem22.hasText()).isTrue();
        assertThat(listItem14.getMarker()).isNull();
        assertThat(listItem14.getSource()).isNull();
        assertThat(listItem14.hasText()).isFalse();
        assertThat(descriptionListEntry4.getTerms()).hasSize(1);
        ListItem listItem23 = (ListItem) descriptionListEntry4.getTerms()
                .get(0);
        assertThat(listItem23.getId()).isNull();
        assertThat(listItem23.getNodeName()).isEqualTo("list_item");
        assertThat(listItem23.getContext()).isEqualTo("list_item");
        assertThat(listItem23.getDocument()).isSameAs(document1);
        assertThat(listItem23.isInline()).isFalse();
        assertThat(listItem23.isBlock()).isTrue();
        assertThat(listItem23.getAttributes()).isNullOrEmpty();
        assertThat(listItem23.getRoles()).isNullOrEmpty();
        assertThat(listItem23.isReftext()).isFalse();
        assertThat(listItem23.getReftext()).isNull();
        assertThat(listItem23.getTitle()).isNull();
        assertThat(listItem23.getStyle()).isNull();
        assertThat(listItem23.getLevel()).isEqualTo(0);
        assertThat(listItem23.getContentModel()).isEqualTo("compound");
        assertThat(listItem23.getSourceLocation()).isNull();
        assertThat(listItem23.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(listItem23.getBlocks()).isNullOrEmpty();
        assertThat(listItem23.getMarker()).isNull();
        assertThat(listItem23.getText()).isEqualTo("Cloud Providers");
        assertThat(listItem23.getSource()).isEqualTo("Cloud Providers");
        assertThat(listItem23.hasText()).isTrue();
        assertThat(document1.getStructuredDoctitle()).isNull();
        assertThat(document1.getDoctitle()).isNull();
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

}
