package fr.jmini.asciidoctorj.testcases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.ListItem;

public class OpenBlockWithIdAndRoleTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "[#idd.rolee]\n" +
            "--\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
            "\n" +
            "* Lorem\n" +
            "* Ipsum\n" +
            "--\n" +
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
            "<div id=\"idd\" class=\"openblock rolee\">\n" +
            "<div class=\"content\">\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n" +
            "</div>\n" +
            "<div class=\"ulist\">\n" +
            "<ul>\n" +
            "<li> <p>Lorem</p> </li>\n" +
            "<li> <p>Ipsum</p> </li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "</div>\n" +
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
assertThat(document1.getAttributes()).containsEntry("appendix-caption", "Appendix").containsEntry("appendix-refsig", "Appendix").containsEntry("asciidoctor", "").containsEntry("asciidoctor-version", "1.5.6.1").containsEntry("attribute-missing", "skip").containsEntry("attribute-undefined", "drop-line").containsEntry("backend", "html5").containsEntry("backend-html5", "").containsEntry("backend-html5-doctype-article", "").containsEntry("basebackend", "html").containsEntry("basebackend-html", "").containsEntry("basebackend-html-doctype-article", "").containsEntry("caution-caption", "Caution").containsEntry("chapter-refsig", "Chapter").containsEntry("docdate", "2018-01-27").containsEntry("docdatetime", "2018-01-27 23:07:50 CET").containsEntry("docdir", "").containsEntry("doctime", "23:07:50 CET").containsEntry("doctype", "article").containsEntry("doctype-article", "").containsEntry("docyear", "2018").containsEntry("embedded", "").containsEntry("example-caption", "Example").containsEntry("figure-caption", "Figure").containsEntry("filetype", "html").containsEntry("filetype-html", "").containsEntry("htmlsyntax", "html").containsEntry("iconfont-remote", "").containsEntry("iconsdir", "./images/icons").containsEntry("important-caption", "Important").containsEntry("last-update-label", "Last updated").containsEntry("linkcss", "").containsEntry("localdate", "2018-01-27").containsEntry("localdatetime", "2018-01-27 23:07:50 CET").containsEntry("localtime", "23:07:50 CET").containsEntry("localyear", "2018").containsEntry("manname-title", "NAME").containsEntry("max-attribute-value-size", 4096L).containsEntry("max-include-depth", 64L).containsEntry("note-caption", "Note").containsEntry("notitle", "").containsEntry("outfilesuffix", ".html").containsEntry("prewrap", "").containsEntry("safe-mode-level", 20L).containsEntry("safe-mode-name", "secure").containsEntry("safe-mode-secure", "").containsEntry("sectids", "").containsEntry("section-refsig", "Section").containsEntry("stylesdir", ".").containsEntry("stylesheet", "").containsEntry("table-caption", "Table").containsEntry("tip-caption", "Tip").containsEntry("toc-placement", "auto").containsEntry("toc-title", "Table of Contents").containsEntry("untitled-label", "Untitled").containsEntry("user-home", ".").containsEntry("version-label", "Version").containsEntry("warning-caption", "Warning").containsEntry("webfonts", "");
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
Block block1 = (Block) document1.getBlocks().get(0);
assertThat(block1.getId()).isEqualTo("idd");
assertThat(block1.getNodeName()).isEqualTo("open");
assertThat(block1.getParent()).isSameAs(document1);
assertThat(block1.getContext()).isEqualTo("open");
assertThat(block1.getDocument()).isSameAs(document1);
assertThat(block1.isInline()).isFalse();
assertThat(block1.isBlock()).isTrue();
assertThat(block1.getAttributes()).containsEntry("1", "#idd.rolee").containsEntry("id", "idd").containsEntry("role", "rolee").containsEntry("style", "open");
assertThat(block1.getRoles()).containsExactly("rolee");
assertThat(block1.isReftext()).isFalse();
assertThat(block1.getReftext()).isNull();
assertThat(block1.getCaption()).isNull();
assertThat(block1.getTitle()).isNull();
assertThat(block1.getStyle()).isEqualTo("open");
assertThat(block1.getLevel()).isEqualTo(0);
assertThat(block1.getContentModel()).isEqualTo("compound");
assertThat(block1.getSourceLocation()).isNull();
assertThat(block1.getSubstitutions()).isNullOrEmpty();
assertThat(block1.getBlocks()).hasSize(2);
Block block2 = (Block) block1.getBlocks().get(0);
assertThat(block2.getId()).isNull();
assertThat(block2.getNodeName()).isEqualTo("paragraph");
assertThat(block2.getParent()).isSameAs(block1);
assertThat(block2.getContext()).isEqualTo("paragraph");
assertThat(block2.getDocument()).isSameAs(document1);
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
assertThat(block2.getLines()).containsExactly("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
assertThat(block2.getSource()).isEqualTo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
org.asciidoctor.ast.List list1 = (org.asciidoctor.ast.List) block1.getBlocks().get(1);
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
assertThat(list1.getCaption()).isNull();
assertThat(list1.getTitle()).isNull();
assertThat(list1.getStyle()).isNull();
assertThat(list1.getLevel()).isEqualTo(1);
assertThat(list1.getContentModel()).isEqualTo("compound");
assertThat(list1.getSourceLocation()).isNull();
assertThat(list1.getSubstitutions()).isNullOrEmpty();
assertThat(list1.getBlocks()).isNullOrEmpty();
assertThat(list1.getItems()).hasSize(2);
ListItem listItem1 = (ListItem) list1.getItems().get(0);
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
assertThat(listItem1.getCaption()).isNull();
assertThat(listItem1.getTitle()).isNull();
assertThat(listItem1.getStyle()).isNull();
assertThat(listItem1.getLevel()).isEqualTo(1);
assertThat(listItem1.getContentModel()).isEqualTo("compound");
assertThat(listItem1.getSourceLocation()).isNull();
assertThat(listItem1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
assertThat(listItem1.getBlocks()).isNullOrEmpty();
assertThat(listItem1.getMarker()).isEqualTo("*");
assertThat(listItem1.getText()).isEqualTo("Lorem");
assertThat(listItem1.getSource()).isEqualTo("Lorem");
assertThat(listItem1.hasText()).isTrue();
ListItem listItem2 = (ListItem) list1.getItems().get(1);
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
assertThat(listItem2.getCaption()).isNull();
assertThat(listItem2.getTitle()).isNull();
assertThat(listItem2.getStyle()).isNull();
assertThat(listItem2.getLevel()).isEqualTo(1);
assertThat(listItem2.getContentModel()).isEqualTo("compound");
assertThat(listItem2.getSourceLocation()).isNull();
assertThat(listItem2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
assertThat(listItem2.getBlocks()).isNullOrEmpty();
assertThat(listItem2.getMarker()).isEqualTo("*");
assertThat(listItem2.getText()).isEqualTo("Ipsum");
assertThat(listItem2.getSource()).isEqualTo("Ipsum");
assertThat(listItem2.hasText()).isTrue();
assertThat(list1.hasItems()).isTrue();
assertThat(block1.getLines()).isNullOrEmpty();
assertThat(block1.getSource()).isEqualTo("");
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
map1.put("docdatetime", "2018-01-27 23:07:50 CET");
map1.put("docdir", "");
map1.put("doctime", "23:07:50 CET");
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
map1.put("localdatetime", "2018-01-27 23:07:50 CET");
map1.put("localtime", "23:07:50 CET");
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
map1.put("table-caption", "Table");
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
Block mockBlock1 = mock(Block.class);
when(mockBlock1.getId()).thenReturn("idd");
when(mockBlock1.getNodeName()).thenReturn("open");
when(mockBlock1.getParent()).thenReturn(mockDocument1);
when(mockBlock1.getContext()).thenReturn("open");
when(mockBlock1.getDocument()).thenReturn(mockDocument1);
when(mockBlock1.isInline()).thenReturn(false);
when(mockBlock1.isBlock()).thenReturn(true);
Map<String, Object> map2 = new HashMap<>();
map2.put("1", "#idd.rolee");
map2.put("id", "idd");
map2.put("role", "rolee");
map2.put("style", "open");
when(mockBlock1.getAttributes()).thenReturn(map2);
when(mockBlock1.getRoles()).thenReturn(Collections.singletonList("rolee"));
when(mockBlock1.isReftext()).thenReturn(false);
when(mockBlock1.getReftext()).thenReturn(null);
when(mockBlock1.getCaption()).thenReturn(null);
when(mockBlock1.getTitle()).thenReturn(null);
when(mockBlock1.getStyle()).thenReturn("open");
when(mockBlock1.getLevel()).thenReturn(0);
when(mockBlock1.getContentModel()).thenReturn("compound");
when(mockBlock1.getSourceLocation()).thenReturn(null);
when(mockBlock1.getSubstitutions()).thenReturn(Collections.emptyList());
Block mockBlock2 = mock(Block.class);
when(mockBlock2.getId()).thenReturn(null);
when(mockBlock2.getNodeName()).thenReturn("paragraph");
when(mockBlock2.getParent()).thenReturn(mockBlock1);
when(mockBlock2.getContext()).thenReturn("paragraph");
when(mockBlock2.getDocument()).thenReturn(mockDocument1);
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
when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
when(mockBlock2.getSource()).thenReturn("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
org.asciidoctor.ast.List mockList1 = mock(org.asciidoctor.ast.List.class);
when(mockList1.getId()).thenReturn(null);
when(mockList1.getNodeName()).thenReturn("ulist");
when(mockList1.getParent()).thenReturn(mockBlock1);
when(mockList1.getContext()).thenReturn("ulist");
when(mockList1.getDocument()).thenReturn(mockDocument1);
when(mockList1.isInline()).thenReturn(false);
when(mockList1.isBlock()).thenReturn(true);
when(mockList1.getAttributes()).thenReturn(Collections.emptyMap());
when(mockList1.getRoles()).thenReturn(Collections.emptyList());
when(mockList1.isReftext()).thenReturn(false);
when(mockList1.getReftext()).thenReturn(null);
when(mockList1.getCaption()).thenReturn(null);
when(mockList1.getTitle()).thenReturn(null);
when(mockList1.getStyle()).thenReturn(null);
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
when(mockListItem1.getCaption()).thenReturn(null);
when(mockListItem1.getTitle()).thenReturn(null);
when(mockListItem1.getStyle()).thenReturn(null);
when(mockListItem1.getLevel()).thenReturn(1);
when(mockListItem1.getContentModel()).thenReturn("compound");
when(mockListItem1.getSourceLocation()).thenReturn(null);
when(mockListItem1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
when(mockListItem1.getBlocks()).thenReturn(Collections.emptyList());
when(mockListItem1.getMarker()).thenReturn("*");
when(mockListItem1.getText()).thenReturn("Lorem");
when(mockListItem1.getSource()).thenReturn("Lorem");
when(mockListItem1.hasText()).thenReturn(true);
ListItem mockListItem2 = mock(ListItem.class);
when(mockListItem2.getId()).thenReturn(null);
when(mockListItem2.getNodeName()).thenReturn("list_item");
when(mockListItem2.getParent()).thenReturn(mockList1);
when(mockListItem2.getContext()).thenReturn("list_item");
when(mockListItem2.getDocument()).thenReturn(mockDocument1);
when(mockListItem2.isInline()).thenReturn(false);
when(mockListItem2.isBlock()).thenReturn(true);
when(mockListItem2.getAttributes()).thenReturn(Collections.emptyMap());
when(mockListItem2.getRoles()).thenReturn(Collections.emptyList());
when(mockListItem2.isReftext()).thenReturn(false);
when(mockListItem2.getReftext()).thenReturn(null);
when(mockListItem2.getCaption()).thenReturn(null);
when(mockListItem2.getTitle()).thenReturn(null);
when(mockListItem2.getStyle()).thenReturn(null);
when(mockListItem2.getLevel()).thenReturn(1);
when(mockListItem2.getContentModel()).thenReturn("compound");
when(mockListItem2.getSourceLocation()).thenReturn(null);
when(mockListItem2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
when(mockListItem2.getBlocks()).thenReturn(Collections.emptyList());
when(mockListItem2.getMarker()).thenReturn("*");
when(mockListItem2.getText()).thenReturn("Ipsum");
when(mockListItem2.getSource()).thenReturn("Ipsum");
when(mockListItem2.hasText()).thenReturn(true);
when(mockList1.getItems()).thenReturn(Arrays.asList(mockListItem1, mockListItem2));
when(mockList1.hasItems()).thenReturn(true);
when(mockBlock1.getBlocks()).thenReturn(Arrays.asList(mockBlock2, mockList1));
when(mockBlock1.getLines()).thenReturn(Collections.emptyList());
when(mockBlock1.getSource()).thenReturn("");
when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockBlock1));
when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
when(mockDocument1.getDoctitle()).thenReturn(null);
Map<Object, Object> map3 = new HashMap<>();
map3.put("attributes", "{}");
map3.put("header_footer", false);
when(mockDocument1.getOptions()).thenReturn(map3);
return mockDocument1;
}
 // end::mock-code[]
}