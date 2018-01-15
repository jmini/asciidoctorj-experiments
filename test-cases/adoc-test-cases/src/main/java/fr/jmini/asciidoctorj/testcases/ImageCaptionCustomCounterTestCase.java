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

public class ImageCaptionCustomCounterTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            ":figure-number: 10\n" +
            "\n" +
            "[.right.text-center]\n" +
            ".first caption\n" +
            "image::sunset.jpg[]\n" +
            "\n" +
            ".second caption\n" +
            "image::http://upload.wikimedia.org/wikipedia/commons/3/35/Tux.svg[Tux,250,350]\n" +
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
            "<div class=\"imageblock right text-center\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"sunset.jpg\" alt=\"sunset\" />\n" +
            "</div>\n" +
            "<div class=\"title\">\n" +
            "Figure 11. first caption\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"http://upload.wikimedia.org/wikipedia/commons/3/35/Tux.svg\" alt=\"Tux\" width=\"250\" height=\"350\" />\n" +
            "</div>\n" +
            "<div class=\"title\">\n" +
            "Figure 12. second caption\n" +
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
        assertThat(document1.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("figure-caption", "Figure")
                .containsEntry("figure-number", "10")
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
        assertThat(document1.getBlocks()).hasSize(2);
        Block block1 = (Block) document1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("image");
        assertThat(block1.getParent()).isSameAs(document1);
        assertThat(block1.getContext()).isEqualTo("image");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).containsEntry("1", ".right.text-center")
                .containsEntry("alt", "sunset")
                .containsEntry("default-alt", "sunset")
                .containsEntry("role", "right text-center")
                .containsEntry("target", "sunset.jpg");
        assertThat(block1.getRoles()).containsExactly("right", "text-center");
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isEqualTo("Figure 11. ");
        assertThat(block1.getTitle()).isEqualTo("first caption");
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isEqualTo("empty");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).isNullOrEmpty();
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).isNullOrEmpty();
        assertThat(block1.getSource()).isEqualTo("");
        Block block2 = (Block) document1.getBlocks()
                .get(1);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("image");
        assertThat(block2.getParent()).isSameAs(document1);
        assertThat(block2.getContext()).isEqualTo("image");
        assertThat(block2.getDocument()).isSameAs(document1);
        assertThat(block2.isInline()).isFalse();
        assertThat(block2.isBlock()).isTrue();
        assertThat(block2.getAttributes()).containsEntry("1", "Tux")
                .containsEntry("2", "250")
                .containsEntry("3", "350")
                .containsEntry("alt", "Tux")
                .containsEntry("height", "350")
                .containsEntry("target", "http://upload.wikimedia.org/wikipedia/commons/3/35/Tux.svg")
                .containsEntry("width", "250");
        assertThat(block2.getRoles()).isNullOrEmpty();
        assertThat(block2.isReftext()).isFalse();
        assertThat(block2.getReftext()).isNull();
        assertThat(block2.getCaption()).isEqualTo("Figure 12. ");
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
        map1.put("doctype", "article");
        map1.put("example-caption", "Example");
        map1.put("figure-caption", "Figure");
        map1.put("figure-number", "10");
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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("image");
        when(mockBlock1.getParent()).thenReturn(mockDocument1);
        when(mockBlock1.getContext()).thenReturn("image");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("1", ".right.text-center");
        map2.put("alt", "sunset");
        map2.put("default-alt", "sunset");
        map2.put("role", "right text-center");
        map2.put("target", "sunset.jpg");
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Arrays.asList("right", "text-center"));
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn("Figure 11. ");
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
        map3.put("1", "Tux");
        map3.put("2", "250");
        map3.put("3", "350");
        map3.put("alt", "Tux");
        map3.put("height", "350");
        map3.put("target", "http://upload.wikimedia.org/wikipedia/commons/3/35/Tux.svg");
        map3.put("width", "250");
        when(mockBlock2.getAttributes()).thenReturn(map3);
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getCaption()).thenReturn("Figure 12. ");
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