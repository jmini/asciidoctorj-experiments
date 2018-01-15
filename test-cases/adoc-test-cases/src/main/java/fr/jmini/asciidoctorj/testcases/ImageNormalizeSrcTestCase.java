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

public class ImageNormalizeSrcTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            "image::./img/sunset0.png[]\n" +
            "\n" +
            "image::../../other/./sunset1.png[]\n" +
            "\n" +
            "image::img/./sunset2.png[]\n" +
            "\n" +
            "image::other/../img/sunset3.jpg[]\n" +
            "\n" +
            "image::other/.././img/sunset4.jpg[]\n" +
            "\n" +
            "image::other/../../img/sunset5.jpg[]\n" +
            "\n" +
            "image::./other/../../img/sunset6.jpg[]\n" +
            "\n" +
            "image::/absolute/../img/sunset7.jpg[]\n" +
            "\n" +
            "image::/absolute/../../sunset8.jpg[]\n" +
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
            "<img src=\"./img/sunset0.png\" alt=\"sunset0\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"../../other/sunset1.png\" alt=\"sunset1\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"img/sunset2.png\" alt=\"sunset2\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"img/sunset3.jpg\" alt=\"sunset3\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"img/sunset4.jpg\" alt=\"sunset4\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"../img/sunset5.jpg\" alt=\"sunset5\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"./../img/sunset6.jpg\" alt=\"sunset6\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"/img/sunset7.jpg\" alt=\"sunset7\" />\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"imageblock\">\n" +
            "<div class=\"content\">\n" +
            "<img src=\"/sunset8.jpg\" alt=\"sunset8\" />\n" +
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
        assertThat(document1.getBlocks()).hasSize(9);
        Block block1 = (Block) document1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("image");
        assertThat(block1.getParent()).isSameAs(document1);
        assertThat(block1.getContext()).isEqualTo("image");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).containsEntry("alt", "sunset0")
                .containsEntry("default-alt", "sunset0")
                .containsEntry("target", "./img/sunset0.png");
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isNull();
        assertThat(block1.getTitle()).isNull();
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
        assertThat(block2.getAttributes()).containsEntry("alt", "sunset1")
                .containsEntry("default-alt", "sunset1")
                .containsEntry("target", "../../other/./sunset1.png");
        assertThat(block2.getRoles()).isNullOrEmpty();
        assertThat(block2.isReftext()).isFalse();
        assertThat(block2.getReftext()).isNull();
        assertThat(block2.getCaption()).isNull();
        assertThat(block2.getTitle()).isNull();
        assertThat(block2.getStyle()).isNull();
        assertThat(block2.getLevel()).isEqualTo(0);
        assertThat(block2.getContentModel()).isEqualTo("empty");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).isNullOrEmpty();
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).isNullOrEmpty();
        assertThat(block2.getSource()).isEqualTo("");
        Block block3 = (Block) document1.getBlocks()
                .get(2);
        assertThat(block3.getId()).isNull();
        assertThat(block3.getNodeName()).isEqualTo("image");
        assertThat(block3.getParent()).isSameAs(document1);
        assertThat(block3.getContext()).isEqualTo("image");
        assertThat(block3.getDocument()).isSameAs(document1);
        assertThat(block3.isInline()).isFalse();
        assertThat(block3.isBlock()).isTrue();
        assertThat(block3.getAttributes()).containsEntry("alt", "sunset2")
                .containsEntry("default-alt", "sunset2")
                .containsEntry("target", "img/./sunset2.png");
        assertThat(block3.getRoles()).isNullOrEmpty();
        assertThat(block3.isReftext()).isFalse();
        assertThat(block3.getReftext()).isNull();
        assertThat(block3.getCaption()).isNull();
        assertThat(block3.getTitle()).isNull();
        assertThat(block3.getStyle()).isNull();
        assertThat(block3.getLevel()).isEqualTo(0);
        assertThat(block3.getContentModel()).isEqualTo("empty");
        assertThat(block3.getSourceLocation()).isNull();
        assertThat(block3.getSubstitutions()).isNullOrEmpty();
        assertThat(block3.getBlocks()).isNullOrEmpty();
        assertThat(block3.getLines()).isNullOrEmpty();
        assertThat(block3.getSource()).isEqualTo("");
        Block block4 = (Block) document1.getBlocks()
                .get(3);
        assertThat(block4.getId()).isNull();
        assertThat(block4.getNodeName()).isEqualTo("image");
        assertThat(block4.getParent()).isSameAs(document1);
        assertThat(block4.getContext()).isEqualTo("image");
        assertThat(block4.getDocument()).isSameAs(document1);
        assertThat(block4.isInline()).isFalse();
        assertThat(block4.isBlock()).isTrue();
        assertThat(block4.getAttributes()).containsEntry("alt", "sunset3")
                .containsEntry("default-alt", "sunset3")
                .containsEntry("target", "other/../img/sunset3.jpg");
        assertThat(block4.getRoles()).isNullOrEmpty();
        assertThat(block4.isReftext()).isFalse();
        assertThat(block4.getReftext()).isNull();
        assertThat(block4.getCaption()).isNull();
        assertThat(block4.getTitle()).isNull();
        assertThat(block4.getStyle()).isNull();
        assertThat(block4.getLevel()).isEqualTo(0);
        assertThat(block4.getContentModel()).isEqualTo("empty");
        assertThat(block4.getSourceLocation()).isNull();
        assertThat(block4.getSubstitutions()).isNullOrEmpty();
        assertThat(block4.getBlocks()).isNullOrEmpty();
        assertThat(block4.getLines()).isNullOrEmpty();
        assertThat(block4.getSource()).isEqualTo("");
        Block block5 = (Block) document1.getBlocks()
                .get(4);
        assertThat(block5.getId()).isNull();
        assertThat(block5.getNodeName()).isEqualTo("image");
        assertThat(block5.getParent()).isSameAs(document1);
        assertThat(block5.getContext()).isEqualTo("image");
        assertThat(block5.getDocument()).isSameAs(document1);
        assertThat(block5.isInline()).isFalse();
        assertThat(block5.isBlock()).isTrue();
        assertThat(block5.getAttributes()).containsEntry("alt", "sunset4")
                .containsEntry("default-alt", "sunset4")
                .containsEntry("target", "other/.././img/sunset4.jpg");
        assertThat(block5.getRoles()).isNullOrEmpty();
        assertThat(block5.isReftext()).isFalse();
        assertThat(block5.getReftext()).isNull();
        assertThat(block5.getCaption()).isNull();
        assertThat(block5.getTitle()).isNull();
        assertThat(block5.getStyle()).isNull();
        assertThat(block5.getLevel()).isEqualTo(0);
        assertThat(block5.getContentModel()).isEqualTo("empty");
        assertThat(block5.getSourceLocation()).isNull();
        assertThat(block5.getSubstitutions()).isNullOrEmpty();
        assertThat(block5.getBlocks()).isNullOrEmpty();
        assertThat(block5.getLines()).isNullOrEmpty();
        assertThat(block5.getSource()).isEqualTo("");
        Block block6 = (Block) document1.getBlocks()
                .get(5);
        assertThat(block6.getId()).isNull();
        assertThat(block6.getNodeName()).isEqualTo("image");
        assertThat(block6.getParent()).isSameAs(document1);
        assertThat(block6.getContext()).isEqualTo("image");
        assertThat(block6.getDocument()).isSameAs(document1);
        assertThat(block6.isInline()).isFalse();
        assertThat(block6.isBlock()).isTrue();
        assertThat(block6.getAttributes()).containsEntry("alt", "sunset5")
                .containsEntry("default-alt", "sunset5")
                .containsEntry("target", "other/../../img/sunset5.jpg");
        assertThat(block6.getRoles()).isNullOrEmpty();
        assertThat(block6.isReftext()).isFalse();
        assertThat(block6.getReftext()).isNull();
        assertThat(block6.getCaption()).isNull();
        assertThat(block6.getTitle()).isNull();
        assertThat(block6.getStyle()).isNull();
        assertThat(block6.getLevel()).isEqualTo(0);
        assertThat(block6.getContentModel()).isEqualTo("empty");
        assertThat(block6.getSourceLocation()).isNull();
        assertThat(block6.getSubstitutions()).isNullOrEmpty();
        assertThat(block6.getBlocks()).isNullOrEmpty();
        assertThat(block6.getLines()).isNullOrEmpty();
        assertThat(block6.getSource()).isEqualTo("");
        Block block7 = (Block) document1.getBlocks()
                .get(6);
        assertThat(block7.getId()).isNull();
        assertThat(block7.getNodeName()).isEqualTo("image");
        assertThat(block7.getParent()).isSameAs(document1);
        assertThat(block7.getContext()).isEqualTo("image");
        assertThat(block7.getDocument()).isSameAs(document1);
        assertThat(block7.isInline()).isFalse();
        assertThat(block7.isBlock()).isTrue();
        assertThat(block7.getAttributes()).containsEntry("alt", "sunset6")
                .containsEntry("default-alt", "sunset6")
                .containsEntry("target", "./other/../../img/sunset6.jpg");
        assertThat(block7.getRoles()).isNullOrEmpty();
        assertThat(block7.isReftext()).isFalse();
        assertThat(block7.getReftext()).isNull();
        assertThat(block7.getCaption()).isNull();
        assertThat(block7.getTitle()).isNull();
        assertThat(block7.getStyle()).isNull();
        assertThat(block7.getLevel()).isEqualTo(0);
        assertThat(block7.getContentModel()).isEqualTo("empty");
        assertThat(block7.getSourceLocation()).isNull();
        assertThat(block7.getSubstitutions()).isNullOrEmpty();
        assertThat(block7.getBlocks()).isNullOrEmpty();
        assertThat(block7.getLines()).isNullOrEmpty();
        assertThat(block7.getSource()).isEqualTo("");
        Block block8 = (Block) document1.getBlocks()
                .get(7);
        assertThat(block8.getId()).isNull();
        assertThat(block8.getNodeName()).isEqualTo("image");
        assertThat(block8.getParent()).isSameAs(document1);
        assertThat(block8.getContext()).isEqualTo("image");
        assertThat(block8.getDocument()).isSameAs(document1);
        assertThat(block8.isInline()).isFalse();
        assertThat(block8.isBlock()).isTrue();
        assertThat(block8.getAttributes()).containsEntry("alt", "sunset7")
                .containsEntry("default-alt", "sunset7")
                .containsEntry("target", "/absolute/../img/sunset7.jpg");
        assertThat(block8.getRoles()).isNullOrEmpty();
        assertThat(block8.isReftext()).isFalse();
        assertThat(block8.getReftext()).isNull();
        assertThat(block8.getCaption()).isNull();
        assertThat(block8.getTitle()).isNull();
        assertThat(block8.getStyle()).isNull();
        assertThat(block8.getLevel()).isEqualTo(0);
        assertThat(block8.getContentModel()).isEqualTo("empty");
        assertThat(block8.getSourceLocation()).isNull();
        assertThat(block8.getSubstitutions()).isNullOrEmpty();
        assertThat(block8.getBlocks()).isNullOrEmpty();
        assertThat(block8.getLines()).isNullOrEmpty();
        assertThat(block8.getSource()).isEqualTo("");
        Block block9 = (Block) document1.getBlocks()
                .get(8);
        assertThat(block9.getId()).isNull();
        assertThat(block9.getNodeName()).isEqualTo("image");
        assertThat(block9.getParent()).isSameAs(document1);
        assertThat(block9.getContext()).isEqualTo("image");
        assertThat(block9.getDocument()).isSameAs(document1);
        assertThat(block9.isInline()).isFalse();
        assertThat(block9.isBlock()).isTrue();
        assertThat(block9.getAttributes()).containsEntry("alt", "sunset8")
                .containsEntry("default-alt", "sunset8")
                .containsEntry("target", "/absolute/../../sunset8.jpg");
        assertThat(block9.getRoles()).isNullOrEmpty();
        assertThat(block9.isReftext()).isFalse();
        assertThat(block9.getReftext()).isNull();
        assertThat(block9.getCaption()).isNull();
        assertThat(block9.getTitle()).isNull();
        assertThat(block9.getStyle()).isNull();
        assertThat(block9.getLevel()).isEqualTo(0);
        assertThat(block9.getContentModel()).isEqualTo("empty");
        assertThat(block9.getSourceLocation()).isNull();
        assertThat(block9.getSubstitutions()).isNullOrEmpty();
        assertThat(block9.getBlocks()).isNullOrEmpty();
        assertThat(block9.getLines()).isNullOrEmpty();
        assertThat(block9.getSource()).isEqualTo("");
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
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("image");
        when(mockBlock1.getParent()).thenReturn(mockDocument1);
        when(mockBlock1.getContext()).thenReturn("image");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("alt", "sunset0");
        map2.put("default-alt", "sunset0");
        map2.put("target", "./img/sunset0.png");
        when(mockBlock1.getAttributes()).thenReturn(map2);
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn(null);
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
        map3.put("alt", "sunset1");
        map3.put("default-alt", "sunset1");
        map3.put("target", "../../other/./sunset1.png");
        when(mockBlock2.getAttributes()).thenReturn(map3);
        when(mockBlock2.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock2.isReftext()).thenReturn(false);
        when(mockBlock2.getReftext()).thenReturn(null);
        when(mockBlock2.getCaption()).thenReturn(null);
        when(mockBlock2.getTitle()).thenReturn(null);
        when(mockBlock2.getStyle()).thenReturn(null);
        when(mockBlock2.getLevel()).thenReturn(0);
        when(mockBlock2.getContentModel()).thenReturn("empty");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock2.getSource()).thenReturn("");
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("image");
        when(mockBlock3.getParent()).thenReturn(mockDocument1);
        when(mockBlock3.getContext()).thenReturn("image");
        when(mockBlock3.getDocument()).thenReturn(mockDocument1);
        when(mockBlock3.isInline()).thenReturn(false);
        when(mockBlock3.isBlock()).thenReturn(true);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("alt", "sunset2");
        map4.put("default-alt", "sunset2");
        map4.put("target", "img/./sunset2.png");
        when(mockBlock3.getAttributes()).thenReturn(map4);
        when(mockBlock3.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock3.isReftext()).thenReturn(false);
        when(mockBlock3.getReftext()).thenReturn(null);
        when(mockBlock3.getCaption()).thenReturn(null);
        when(mockBlock3.getTitle()).thenReturn(null);
        when(mockBlock3.getStyle()).thenReturn(null);
        when(mockBlock3.getLevel()).thenReturn(0);
        when(mockBlock3.getContentModel()).thenReturn("empty");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock3.getSource()).thenReturn("");
        Block mockBlock4 = mock(Block.class);
        when(mockBlock4.getId()).thenReturn(null);
        when(mockBlock4.getNodeName()).thenReturn("image");
        when(mockBlock4.getParent()).thenReturn(mockDocument1);
        when(mockBlock4.getContext()).thenReturn("image");
        when(mockBlock4.getDocument()).thenReturn(mockDocument1);
        when(mockBlock4.isInline()).thenReturn(false);
        when(mockBlock4.isBlock()).thenReturn(true);
        Map<String, Object> map5 = new HashMap<>();
        map5.put("alt", "sunset3");
        map5.put("default-alt", "sunset3");
        map5.put("target", "other/../img/sunset3.jpg");
        when(mockBlock4.getAttributes()).thenReturn(map5);
        when(mockBlock4.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock4.isReftext()).thenReturn(false);
        when(mockBlock4.getReftext()).thenReturn(null);
        when(mockBlock4.getCaption()).thenReturn(null);
        when(mockBlock4.getTitle()).thenReturn(null);
        when(mockBlock4.getStyle()).thenReturn(null);
        when(mockBlock4.getLevel()).thenReturn(0);
        when(mockBlock4.getContentModel()).thenReturn("empty");
        when(mockBlock4.getSourceLocation()).thenReturn(null);
        when(mockBlock4.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock4.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock4.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock4.getSource()).thenReturn("");
        Block mockBlock5 = mock(Block.class);
        when(mockBlock5.getId()).thenReturn(null);
        when(mockBlock5.getNodeName()).thenReturn("image");
        when(mockBlock5.getParent()).thenReturn(mockDocument1);
        when(mockBlock5.getContext()).thenReturn("image");
        when(mockBlock5.getDocument()).thenReturn(mockDocument1);
        when(mockBlock5.isInline()).thenReturn(false);
        when(mockBlock5.isBlock()).thenReturn(true);
        Map<String, Object> map6 = new HashMap<>();
        map6.put("alt", "sunset4");
        map6.put("default-alt", "sunset4");
        map6.put("target", "other/.././img/sunset4.jpg");
        when(mockBlock5.getAttributes()).thenReturn(map6);
        when(mockBlock5.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock5.isReftext()).thenReturn(false);
        when(mockBlock5.getReftext()).thenReturn(null);
        when(mockBlock5.getCaption()).thenReturn(null);
        when(mockBlock5.getTitle()).thenReturn(null);
        when(mockBlock5.getStyle()).thenReturn(null);
        when(mockBlock5.getLevel()).thenReturn(0);
        when(mockBlock5.getContentModel()).thenReturn("empty");
        when(mockBlock5.getSourceLocation()).thenReturn(null);
        when(mockBlock5.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock5.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock5.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock5.getSource()).thenReturn("");
        Block mockBlock6 = mock(Block.class);
        when(mockBlock6.getId()).thenReturn(null);
        when(mockBlock6.getNodeName()).thenReturn("image");
        when(mockBlock6.getParent()).thenReturn(mockDocument1);
        when(mockBlock6.getContext()).thenReturn("image");
        when(mockBlock6.getDocument()).thenReturn(mockDocument1);
        when(mockBlock6.isInline()).thenReturn(false);
        when(mockBlock6.isBlock()).thenReturn(true);
        Map<String, Object> map7 = new HashMap<>();
        map7.put("alt", "sunset5");
        map7.put("default-alt", "sunset5");
        map7.put("target", "other/../../img/sunset5.jpg");
        when(mockBlock6.getAttributes()).thenReturn(map7);
        when(mockBlock6.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock6.isReftext()).thenReturn(false);
        when(mockBlock6.getReftext()).thenReturn(null);
        when(mockBlock6.getCaption()).thenReturn(null);
        when(mockBlock6.getTitle()).thenReturn(null);
        when(mockBlock6.getStyle()).thenReturn(null);
        when(mockBlock6.getLevel()).thenReturn(0);
        when(mockBlock6.getContentModel()).thenReturn("empty");
        when(mockBlock6.getSourceLocation()).thenReturn(null);
        when(mockBlock6.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock6.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock6.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock6.getSource()).thenReturn("");
        Block mockBlock7 = mock(Block.class);
        when(mockBlock7.getId()).thenReturn(null);
        when(mockBlock7.getNodeName()).thenReturn("image");
        when(mockBlock7.getParent()).thenReturn(mockDocument1);
        when(mockBlock7.getContext()).thenReturn("image");
        when(mockBlock7.getDocument()).thenReturn(mockDocument1);
        when(mockBlock7.isInline()).thenReturn(false);
        when(mockBlock7.isBlock()).thenReturn(true);
        Map<String, Object> map8 = new HashMap<>();
        map8.put("alt", "sunset6");
        map8.put("default-alt", "sunset6");
        map8.put("target", "./other/../../img/sunset6.jpg");
        when(mockBlock7.getAttributes()).thenReturn(map8);
        when(mockBlock7.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock7.isReftext()).thenReturn(false);
        when(mockBlock7.getReftext()).thenReturn(null);
        when(mockBlock7.getCaption()).thenReturn(null);
        when(mockBlock7.getTitle()).thenReturn(null);
        when(mockBlock7.getStyle()).thenReturn(null);
        when(mockBlock7.getLevel()).thenReturn(0);
        when(mockBlock7.getContentModel()).thenReturn("empty");
        when(mockBlock7.getSourceLocation()).thenReturn(null);
        when(mockBlock7.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock7.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock7.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock7.getSource()).thenReturn("");
        Block mockBlock8 = mock(Block.class);
        when(mockBlock8.getId()).thenReturn(null);
        when(mockBlock8.getNodeName()).thenReturn("image");
        when(mockBlock8.getParent()).thenReturn(mockDocument1);
        when(mockBlock8.getContext()).thenReturn("image");
        when(mockBlock8.getDocument()).thenReturn(mockDocument1);
        when(mockBlock8.isInline()).thenReturn(false);
        when(mockBlock8.isBlock()).thenReturn(true);
        Map<String, Object> map9 = new HashMap<>();
        map9.put("alt", "sunset7");
        map9.put("default-alt", "sunset7");
        map9.put("target", "/absolute/../img/sunset7.jpg");
        when(mockBlock8.getAttributes()).thenReturn(map9);
        when(mockBlock8.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock8.isReftext()).thenReturn(false);
        when(mockBlock8.getReftext()).thenReturn(null);
        when(mockBlock8.getCaption()).thenReturn(null);
        when(mockBlock8.getTitle()).thenReturn(null);
        when(mockBlock8.getStyle()).thenReturn(null);
        when(mockBlock8.getLevel()).thenReturn(0);
        when(mockBlock8.getContentModel()).thenReturn("empty");
        when(mockBlock8.getSourceLocation()).thenReturn(null);
        when(mockBlock8.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock8.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock8.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock8.getSource()).thenReturn("");
        Block mockBlock9 = mock(Block.class);
        when(mockBlock9.getId()).thenReturn(null);
        when(mockBlock9.getNodeName()).thenReturn("image");
        when(mockBlock9.getParent()).thenReturn(mockDocument1);
        when(mockBlock9.getContext()).thenReturn("image");
        when(mockBlock9.getDocument()).thenReturn(mockDocument1);
        when(mockBlock9.isInline()).thenReturn(false);
        when(mockBlock9.isBlock()).thenReturn(true);
        Map<String, Object> map10 = new HashMap<>();
        map10.put("alt", "sunset8");
        map10.put("default-alt", "sunset8");
        map10.put("target", "/absolute/../../sunset8.jpg");
        when(mockBlock9.getAttributes()).thenReturn(map10);
        when(mockBlock9.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock9.isReftext()).thenReturn(false);
        when(mockBlock9.getReftext()).thenReturn(null);
        when(mockBlock9.getCaption()).thenReturn(null);
        when(mockBlock9.getTitle()).thenReturn(null);
        when(mockBlock9.getStyle()).thenReturn(null);
        when(mockBlock9.getLevel()).thenReturn(0);
        when(mockBlock9.getContentModel()).thenReturn("empty");
        when(mockBlock9.getSourceLocation()).thenReturn(null);
        when(mockBlock9.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock9.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock9.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock9.getSource()).thenReturn("");
        when(mockDocument1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockBlock2, mockBlock3, mockBlock4, mockBlock5, mockBlock6, mockBlock7, mockBlock8, mockBlock9));
        when(mockDocument1.getStructuredDoctitle()).thenReturn(null);
        when(mockDocument1.getDoctitle()).thenReturn(null);
        Map<Object, Object> map11 = new HashMap<>();
        map11.put("attributes", "{}");
        map11.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map11);
        return mockDocument1;
    }
    // end::mock-code[]
}