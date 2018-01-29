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

public class ImageCaptionFixedTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            ":figure-caption: Picture\n" +
            ":imagesdir: imgs\n" +
            "\n" +
            "[caption=\"Image A. \"]\n" +
            ".first caption\n" +
            "image::http://asciidoctor.org/images/sunset.jpg[]\n" +
            "\n" +
            ".second caption\n" +
            "image::sunset.jpg[]\n" +
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
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"http://asciidoctor.org/images/sunset.jpg\" alt=\"sunset\" />\n" +
            "</div>\n" +
            "<div class=\"title\">\n" +
            "Image A. first caption\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"imgs/sunset.jpg\" alt=\"sunset\" />\n" +
            "</div>\n" +
            "<div class=\"title\">\n" +
            "Picture 1. second caption\n" +
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
assertThat(document1.getAttributes()).containsEntry("appendix-caption", "Appendix").containsEntry("appendix-refsig", "Appendix").containsEntry("asciidoctor", "").containsEntry("asciidoctor-version", "1.5.6.1").containsEntry("attribute-missing", "skip").containsEntry("attribute-undefined", "drop-line").containsEntry("backend", "html5").containsEntry("backend-html5", "").containsEntry("backend-html5-doctype-article", "").containsEntry("basebackend", "html").containsEntry("basebackend-html", "").containsEntry("basebackend-html-doctype-article", "").containsEntry("caution-caption", "Caution").containsEntry("chapter-refsig", "Chapter").containsEntry("docdate", "2018-01-27").containsEntry("docdatetime", "2018-01-27 23:07:16 CET").containsEntry("docdir", "").containsEntry("doctime", "23:07:16 CET").containsEntry("doctype", "article").containsEntry("doctype-article", "").containsEntry("docyear", "2018").containsEntry("embedded", "").containsEntry("example-caption", "Example").containsEntry("figure-caption", "Picture").containsEntry("filetype", "html").containsEntry("filetype-html", "").containsEntry("htmlsyntax", "html").containsEntry("iconfont-remote", "").containsEntry("iconsdir", "./images/icons").containsEntry("imagesdir", "imgs").containsEntry("important-caption", "Important").containsEntry("last-update-label", "Last updated").containsEntry("linkcss", "").containsEntry("localdate", "2018-01-27").containsEntry("localdatetime", "2018-01-27 23:07:16 CET").containsEntry("localtime", "23:07:16 CET").containsEntry("localyear", "2018").containsEntry("manname-title", "NAME").containsEntry("max-attribute-value-size", 4096L).containsEntry("max-include-depth", 64L).containsEntry("note-caption", "Note").containsEntry("notitle", "").containsEntry("outfilesuffix", ".html").containsEntry("prewrap", "").containsEntry("safe-mode-level", 20L).containsEntry("safe-mode-name", "secure").containsEntry("safe-mode-secure", "").containsEntry("sectids", "").containsEntry("section-refsig", "Section").containsEntry("stylesdir", ".").containsEntry("stylesheet", "").containsEntry("table-caption", "Table").containsEntry("tip-caption", "Tip").containsEntry("toc-placement", "auto").containsEntry("toc-title", "Table of Contents").containsEntry("untitled-label", "Untitled").containsEntry("user-home", ".").containsEntry("version-label", "Version").containsEntry("warning-caption", "Warning").containsEntry("webfonts", "");
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
assertThat(document1.getBlocks()).hasSize(2);
Block block1 = (Block) document1.getBlocks().get(0);
assertThat(block1.getId()).isNull();
assertThat(block1.getNodeName()).isEqualTo("image");
assertThat(block1.getParent()).isSameAs(document1);
assertThat(block1.getContext()).isEqualTo("image");
assertThat(block1.getDocument()).isSameAs(document1);
assertThat(block1.isInline()).isFalse();
assertThat(block1.isBlock()).isTrue();
assertThat(block1.getAttributes()).containsEntry("alt", "sunset").containsEntry("default-alt", "sunset").containsEntry("target", "http://asciidoctor.org/images/sunset.jpg");
assertThat(block1.getRoles()).isNullOrEmpty();
assertThat(block1.isReftext()).isFalse();
assertThat(block1.getReftext()).isNull();
assertThat(block1.getCaption()).isEqualTo("Image A. ");
assertThat(block1.getTitle()).isEqualTo("first caption");
assertThat(block1.getStyle()).isNull();
assertThat(block1.getLevel()).isEqualTo(0);
assertThat(block1.getContentModel()).isEqualTo("empty");
assertThat(block1.getSourceLocation()).isNull();
assertThat(block1.getSubstitutions()).isNullOrEmpty();
assertThat(block1.getBlocks()).isNullOrEmpty();
assertThat(block1.getLines()).isNullOrEmpty();
assertThat(block1.getSource()).isEqualTo("");
Block block2 = (Block) document1.getBlocks().get(1);
assertThat(block2.getId()).isNull();
assertThat(block2.getNodeName()).isEqualTo("image");
assertThat(block2.getParent()).isSameAs(document1);
assertThat(block2.getContext()).isEqualTo("image");
assertThat(block2.getDocument()).isSameAs(document1);
assertThat(block2.isInline()).isFalse();
assertThat(block2.isBlock()).isTrue();
assertThat(block2.getAttributes()).containsEntry("alt", "sunset").containsEntry("default-alt", "sunset").containsEntry("target", "sunset.jpg");
assertThat(block2.getRoles()).isNullOrEmpty();
assertThat(block2.isReftext()).isFalse();
assertThat(block2.getReftext()).isNull();
assertThat(block2.getCaption()).isEqualTo("Picture 1. ");
assertThat(block2.getTitle()).isEqualTo("second caption");
assertThat(block2.getStyle()).isNull();
assertThat(block2.getLevel()).isEqualTo(0);
assertThat(block2.getContentModel()).isEqualTo("empty");
assertThat(block2.getSourceLocation()).isNull();
assertThat(block2.getSubstitutions()).isNullOrEmpty();
assertThat(block2.getBlocks()).isNullOrEmpty();
assertThat(block2.getLines()).isNullOrEmpty();
assertThat(block2.getSource()).isEqualTo("");
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
map1.put("docdatetime", "2018-01-27 23:07:16 CET");
map1.put("docdir", "");
map1.put("doctime", "23:07:16 CET");
map1.put("doctype", "article");
map1.put("doctype-article", "");
map1.put("docyear", "2018");
map1.put("embedded", "");
map1.put("example-caption", "Example");
map1.put("figure-caption", "Picture");
map1.put("filetype", "html");
map1.put("filetype-html", "");
map1.put("htmlsyntax", "html");
map1.put("iconfont-remote", "");
map1.put("iconsdir", "./images/icons");
map1.put("imagesdir", "imgs");
map1.put("important-caption", "Important");
map1.put("last-update-label", "Last updated");
map1.put("linkcss", "");
map1.put("localdate", "2018-01-27");
map1.put("localdatetime", "2018-01-27 23:07:16 CET");
map1.put("localtime", "23:07:16 CET");
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
when(mockBlock1.getId()).thenReturn(null);
when(mockBlock1.getNodeName()).thenReturn("image");
when(mockBlock1.getParent()).thenReturn(mockDocument1);
when(mockBlock1.getContext()).thenReturn("image");
when(mockBlock1.getDocument()).thenReturn(mockDocument1);
when(mockBlock1.isInline()).thenReturn(false);
when(mockBlock1.isBlock()).thenReturn(true);
Map<String, Object> map2 = new HashMap<>();
map2.put("alt", "sunset");
map2.put("default-alt", "sunset");
map2.put("target", "http://asciidoctor.org/images/sunset.jpg");
when(mockBlock1.getAttributes()).thenReturn(map2);
when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
when(mockBlock1.isReftext()).thenReturn(false);
when(mockBlock1.getReftext()).thenReturn(null);
when(mockBlock1.getCaption()).thenReturn("Image A. ");
when(mockBlock1.getTitle()).thenReturn("first caption");
when(mockBlock1.getStyle()).thenReturn(null);
when(mockBlock1.getLevel()).thenReturn(0);
when(mockBlock1.getContentModel()).thenReturn("empty");
when(mockBlock1.getSourceLocation()).thenReturn(null);
when(mockBlock1.getSubstitutions()).thenReturn(Collections.emptyList());
when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
when(mockBlock1.getLines()).thenReturn(Collections.emptyList());
when(mockBlock1.getSource()).thenReturn("");
Block mockBlock2 = mock(Block.class);
when(mockBlock2.getId()).thenReturn(null);
when(mockBlock2.getNodeName()).thenReturn("image");
when(mockBlock2.getParent()).thenReturn(mockDocument1);
when(mockBlock2.getContext()).thenReturn("image");
when(mockBlock2.getDocument()).thenReturn(mockDocument1);
when(mockBlock2.isInline()).thenReturn(false);
when(mockBlock2.isBlock()).thenReturn(true);
Map<String, Object> map3 = new HashMap<>();
map3.put("alt", "sunset");
map3.put("default-alt", "sunset");
map3.put("target", "sunset.jpg");
when(mockBlock2.getAttributes()).thenReturn(map3);
when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
when(mockBlock2.isReftext()).thenReturn(false);
when(mockBlock2.getReftext()).thenReturn(null);
when(mockBlock2.getCaption()).thenReturn("Picture 1. ");
when(mockBlock2.getTitle()).thenReturn("second caption");
when(mockBlock2.getStyle()).thenReturn(null);
when(mockBlock2.getLevel()).thenReturn(0);
when(mockBlock2.getContentModel()).thenReturn("empty");
when(mockBlock2.getSourceLocation()).thenReturn(null);
when(mockBlock2.getSubstitutions()).thenReturn(Collections.emptyList());
when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
when(mockBlock2.getLines()).thenReturn(Collections.emptyList());
when(mockBlock2.getSource()).thenReturn("");
when(mockDocument1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockBlock2));
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