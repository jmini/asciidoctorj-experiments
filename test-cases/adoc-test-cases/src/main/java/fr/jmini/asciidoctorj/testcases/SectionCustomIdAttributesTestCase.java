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
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;

public class SectionCustomIdAttributesTestCase implements AdocTestCase {

    public static final String ASCIIDOC = "" +
            ":idprefix:\n" +
            ":idseparator: -\n" +
            "\n" +
            "== Section 1\n" +
            "\n" +
            "Some text for 1.\n" +
            "\n" +
            "[[somesec]]\n" +
            "=== Section 2\n" +
            "\n" +
            "Some text for 2.\n" +
            "\n" +
            "=== A  Section   Three!\n" +
            "\n" +
            "Some text for 3.\n" +
            "\n" +
            "=== This_is_section_4\n" +
            "\n" +
            "Some text for 4.\n" +
            "\n" +
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
            "<div class=\"sect1\">\n" +
            "<h2 id=\"section-1\">Section 1</h2>\n" +
            "<div class=\"sectionbody\">\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 1.</p>\n" +
            "</div>\n" +
            "<div class=\"sect2\">\n" +
            "<h3 id=\"somesec\">Section 2</h3>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 2.</p>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"sect2\">\n" +
            "<h3 id=\"a-section-three\">A Section Three!</h3>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 3.</p>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"sect2\">\n" +
            "<h3 id=\"this_is_section_4\">This_is_section_4</h3>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 4.</p>\n" +
            "</div>\n" +
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
        assertThat(document1.getAttributes()).containsEntry("doctype", "article")
                .containsEntry("example-caption", "Example")
                .containsEntry("filetype", "html")
                .containsEntry("idprefix", "")
                .containsEntry("idseparator", "-")
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
        Section section1 = (Section) document1.getBlocks()
                .get(0);
        assertThat(section1.getId()).isEqualTo("section-1");
        assertThat(section1.getNodeName()).isEqualTo("section");
        assertThat(section1.getParent()).isSameAs(document1);
        assertThat(section1.getContext()).isEqualTo("section");
        assertThat(section1.getDocument()).isSameAs(document1);
        assertThat(section1.isInline()).isFalse();
        assertThat(section1.isBlock()).isTrue();
        assertThat(section1.getAttributes()).isNullOrEmpty();
        assertThat(section1.getRoles()).isNullOrEmpty();
        assertThat(section1.isReftext()).isFalse();
        assertThat(section1.getReftext()).isNull();
        assertThat(section1.getCaption()).isNull();
        assertThat(section1.getTitle()).isEqualTo("Section 1");
        assertThat(section1.getStyle()).isNull();
        assertThat(section1.getLevel()).isEqualTo(1);
        assertThat(section1.getContentModel()).isEqualTo("compound");
        assertThat(section1.getSourceLocation()).isNull();
        assertThat(section1.getSubstitutions()).isNullOrEmpty();
        assertThat(section1.getBlocks()).hasSize(4);
        Block block1 = (Block) section1.getBlocks()
                .get(0);
        assertThat(block1.getId()).isNull();
        assertThat(block1.getNodeName()).isEqualTo("paragraph");
        assertThat(block1.getParent()).isSameAs(section1);
        assertThat(block1.getContext()).isEqualTo("paragraph");
        assertThat(block1.getDocument()).isSameAs(document1);
        assertThat(block1.isInline()).isFalse();
        assertThat(block1.isBlock()).isTrue();
        assertThat(block1.getAttributes()).isNullOrEmpty();
        assertThat(block1.getRoles()).isNullOrEmpty();
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isNull();
        assertThat(block1.getTitle()).isNull();
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(1);
        assertThat(block1.getContentModel()).isEqualTo("simple");
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).containsExactly("Some text for 1.");
        assertThat(block1.getSource()).isEqualTo("Some text for 1.");
        Section section2 = (Section) section1.getBlocks()
                .get(1);
        assertThat(section2.getId()).isEqualTo("somesec");
        assertThat(section2.getNodeName()).isEqualTo("section");
        assertThat(section2.getParent()).isSameAs(section1);
        assertThat(section2.getContext()).isEqualTo("section");
        assertThat(section2.getDocument()).isSameAs(document1);
        assertThat(section2.isInline()).isFalse();
        assertThat(section2.isBlock()).isTrue();
        assertThat(section2.getAttributes()).containsEntry("id", "somesec");
        assertThat(section2.getRoles()).isNullOrEmpty();
        assertThat(section2.isReftext()).isFalse();
        assertThat(section2.getReftext()).isNull();
        assertThat(section2.getCaption()).isNull();
        assertThat(section2.getTitle()).isEqualTo("Section 2");
        assertThat(section2.getStyle()).isNull();
        assertThat(section2.getLevel()).isEqualTo(2);
        assertThat(section2.getContentModel()).isEqualTo("compound");
        assertThat(section2.getSourceLocation()).isNull();
        assertThat(section2.getSubstitutions()).isNullOrEmpty();
        assertThat(section2.getBlocks()).hasSize(1);
        Block block2 = (Block) section2.getBlocks()
                .get(0);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(section2);
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
        assertThat(block2.getLevel()).isEqualTo(2);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Some text for 2.");
        assertThat(block2.getSource()).isEqualTo("Some text for 2.");
        assertThat(section2.getIndex()).isEqualTo(0);
        assertThat(section2.getNumber()).isEqualTo(1);
        assertThat(section2.getSectionName()).isEqualTo("section");
        assertThat(section2.isSpecial()).isFalse();
        assertThat(section2.isNumbered()).isFalse();
        Section section3 = (Section) section1.getBlocks()
                .get(2);
        assertThat(section3.getId()).isEqualTo("a-section-three");
        assertThat(section3.getNodeName()).isEqualTo("section");
        assertThat(section3.getParent()).isSameAs(section1);
        assertThat(section3.getContext()).isEqualTo("section");
        assertThat(section3.getDocument()).isSameAs(document1);
        assertThat(section3.isInline()).isFalse();
        assertThat(section3.isBlock()).isTrue();
        assertThat(section3.getAttributes()).isNullOrEmpty();
        assertThat(section3.getRoles()).isNullOrEmpty();
        assertThat(section3.isReftext()).isFalse();
        assertThat(section3.getReftext()).isNull();
        assertThat(section3.getCaption()).isNull();
        assertThat(section3.getTitle()).isEqualTo("A  Section   Three!");
        assertThat(section3.getStyle()).isNull();
        assertThat(section3.getLevel()).isEqualTo(2);
        assertThat(section3.getContentModel()).isEqualTo("compound");
        assertThat(section3.getSourceLocation()).isNull();
        assertThat(section3.getSubstitutions()).isNullOrEmpty();
        assertThat(section3.getBlocks()).hasSize(1);
        Block block3 = (Block) section3.getBlocks()
                .get(0);
        assertThat(block3.getId()).isNull();
        assertThat(block3.getNodeName()).isEqualTo("paragraph");
        assertThat(block3.getParent()).isSameAs(section3);
        assertThat(block3.getContext()).isEqualTo("paragraph");
        assertThat(block3.getDocument()).isSameAs(document1);
        assertThat(block3.isInline()).isFalse();
        assertThat(block3.isBlock()).isTrue();
        assertThat(block3.getAttributes()).isNullOrEmpty();
        assertThat(block3.getRoles()).isNullOrEmpty();
        assertThat(block3.isReftext()).isFalse();
        assertThat(block3.getReftext()).isNull();
        assertThat(block3.getCaption()).isNull();
        assertThat(block3.getTitle()).isNull();
        assertThat(block3.getStyle()).isNull();
        assertThat(block3.getLevel()).isEqualTo(2);
        assertThat(block3.getContentModel()).isEqualTo("simple");
        assertThat(block3.getSourceLocation()).isNull();
        assertThat(block3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block3.getBlocks()).isNullOrEmpty();
        assertThat(block3.getLines()).containsExactly("Some text for 3.");
        assertThat(block3.getSource()).isEqualTo("Some text for 3.");
        assertThat(section3.getIndex()).isEqualTo(1);
        assertThat(section3.getNumber()).isEqualTo(1);
        assertThat(section3.getSectionName()).isEqualTo("section");
        assertThat(section3.isSpecial()).isFalse();
        assertThat(section3.isNumbered()).isFalse();
        Section section4 = (Section) section1.getBlocks()
                .get(3);
        assertThat(section4.getId()).isEqualTo("this_is_section_4");
        assertThat(section4.getNodeName()).isEqualTo("section");
        assertThat(section4.getParent()).isSameAs(section1);
        assertThat(section4.getContext()).isEqualTo("section");
        assertThat(section4.getDocument()).isSameAs(document1);
        assertThat(section4.isInline()).isFalse();
        assertThat(section4.isBlock()).isTrue();
        assertThat(section4.getAttributes()).isNullOrEmpty();
        assertThat(section4.getRoles()).isNullOrEmpty();
        assertThat(section4.isReftext()).isFalse();
        assertThat(section4.getReftext()).isNull();
        assertThat(section4.getCaption()).isNull();
        assertThat(section4.getTitle()).isEqualTo("This_is_section_4");
        assertThat(section4.getStyle()).isNull();
        assertThat(section4.getLevel()).isEqualTo(2);
        assertThat(section4.getContentModel()).isEqualTo("compound");
        assertThat(section4.getSourceLocation()).isNull();
        assertThat(section4.getSubstitutions()).isNullOrEmpty();
        assertThat(section4.getBlocks()).hasSize(1);
        Block block4 = (Block) section4.getBlocks()
                .get(0);
        assertThat(block4.getId()).isNull();
        assertThat(block4.getNodeName()).isEqualTo("paragraph");
        assertThat(block4.getParent()).isSameAs(section4);
        assertThat(block4.getContext()).isEqualTo("paragraph");
        assertThat(block4.getDocument()).isSameAs(document1);
        assertThat(block4.isInline()).isFalse();
        assertThat(block4.isBlock()).isTrue();
        assertThat(block4.getAttributes()).isNullOrEmpty();
        assertThat(block4.getRoles()).isNullOrEmpty();
        assertThat(block4.isReftext()).isFalse();
        assertThat(block4.getReftext()).isNull();
        assertThat(block4.getCaption()).isNull();
        assertThat(block4.getTitle()).isNull();
        assertThat(block4.getStyle()).isNull();
        assertThat(block4.getLevel()).isEqualTo(2);
        assertThat(block4.getContentModel()).isEqualTo("simple");
        assertThat(block4.getSourceLocation()).isNull();
        assertThat(block4.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block4.getBlocks()).isNullOrEmpty();
        assertThat(block4.getLines()).containsExactly("Some text for 4.");
        assertThat(block4.getSource()).isEqualTo("Some text for 4.");
        assertThat(section4.getIndex()).isEqualTo(2);
        assertThat(section4.getNumber()).isEqualTo(1);
        assertThat(section4.getSectionName()).isEqualTo("section");
        assertThat(section4.isSpecial()).isFalse();
        assertThat(section4.isNumbered()).isFalse();
        assertThat(section1.getIndex()).isEqualTo(0);
        assertThat(section1.getNumber()).isEqualTo(1);
        assertThat(section1.getSectionName()).isEqualTo("section");
        assertThat(section1.isSpecial()).isFalse();
        assertThat(section1.isNumbered()).isFalse();
        Title title1 = document1.getStructuredDoctitle();
        assertThat(title1.getMain()).isEqualTo("Section 1");
        assertThat(title1.getSubtitle()).isNull();
        assertThat(title1.getCombined()).isEqualTo("Section 1");
        assertThat(title1.isSanitized()).isFalse();
        assertThat(document1.getDoctitle()).isEqualTo("Section 1");
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
        map1.put("idprefix", "");
        map1.put("idseparator", "-");
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
        Section mockSection1 = mock(Section.class);
        when(mockSection1.getId()).thenReturn("section-1");
        when(mockSection1.getNodeName()).thenReturn("section");
        when(mockSection1.getParent()).thenReturn(mockDocument1);
        when(mockSection1.getContext()).thenReturn("section");
        when(mockSection1.getDocument()).thenReturn(mockDocument1);
        when(mockSection1.isInline()).thenReturn(false);
        when(mockSection1.isBlock()).thenReturn(true);
        when(mockSection1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection1.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection1.isReftext()).thenReturn(false);
        when(mockSection1.getReftext()).thenReturn(null);
        when(mockSection1.getCaption()).thenReturn(null);
        when(mockSection1.getTitle()).thenReturn("Section 1");
        when(mockSection1.getStyle()).thenReturn(null);
        when(mockSection1.getLevel()).thenReturn(1);
        when(mockSection1.getContentModel()).thenReturn("compound");
        when(mockSection1.getSourceLocation()).thenReturn(null);
        when(mockSection1.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn(null);
        when(mockBlock1.getNodeName()).thenReturn("paragraph");
        when(mockBlock1.getParent()).thenReturn(mockSection1);
        when(mockBlock1.getContext()).thenReturn("paragraph");
        when(mockBlock1.getDocument()).thenReturn(mockDocument1);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(true);
        when(mockBlock1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock1.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn(null);
        when(mockBlock1.getStyle()).thenReturn(null);
        when(mockBlock1.getLevel()).thenReturn(1);
        when(mockBlock1.getContentModel()).thenReturn("simple");
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.singletonList("Some text for 1."));
        when(mockBlock1.getSource()).thenReturn("Some text for 1.");
        Section mockSection2 = mock(Section.class);
        when(mockSection2.getId()).thenReturn("somesec");
        when(mockSection2.getNodeName()).thenReturn("section");
        when(mockSection2.getParent()).thenReturn(mockSection1);
        when(mockSection2.getContext()).thenReturn("section");
        when(mockSection2.getDocument()).thenReturn(mockDocument1);
        when(mockSection2.isInline()).thenReturn(false);
        when(mockSection2.isBlock()).thenReturn(true);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", "somesec");
        when(mockSection2.getAttributes()).thenReturn(map2);
        when(mockSection2.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection2.isReftext()).thenReturn(false);
        when(mockSection2.getReftext()).thenReturn(null);
        when(mockSection2.getCaption()).thenReturn(null);
        when(mockSection2.getTitle()).thenReturn("Section 2");
        when(mockSection2.getStyle()).thenReturn(null);
        when(mockSection2.getLevel()).thenReturn(2);
        when(mockSection2.getContentModel()).thenReturn("compound");
        when(mockSection2.getSourceLocation()).thenReturn(null);
        when(mockSection2.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock2 = mock(Block.class);
        when(mockBlock2.getId()).thenReturn(null);
        when(mockBlock2.getNodeName()).thenReturn("paragraph");
        when(mockBlock2.getParent()).thenReturn(mockSection2);
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
        when(mockBlock2.getLevel()).thenReturn(2);
        when(mockBlock2.getContentModel()).thenReturn("simple");
        when(mockBlock2.getSourceLocation()).thenReturn(null);
        when(mockBlock2.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock2.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock2.getLines()).thenReturn(Collections.singletonList("Some text for 2."));
        when(mockBlock2.getSource()).thenReturn("Some text for 2.");
        when(mockSection2.getBlocks()).thenReturn(Collections.singletonList(mockBlock2));
        when(mockSection2.getIndex()).thenReturn(0);
        when(mockSection2.getNumber()).thenReturn(1);
        when(mockSection2.getSectionName()).thenReturn("section");
        when(mockSection2.isSpecial()).thenReturn(false);
        when(mockSection2.isNumbered()).thenReturn(false);
        Section mockSection3 = mock(Section.class);
        when(mockSection3.getId()).thenReturn("a-section-three");
        when(mockSection3.getNodeName()).thenReturn("section");
        when(mockSection3.getParent()).thenReturn(mockSection1);
        when(mockSection3.getContext()).thenReturn("section");
        when(mockSection3.getDocument()).thenReturn(mockDocument1);
        when(mockSection3.isInline()).thenReturn(false);
        when(mockSection3.isBlock()).thenReturn(true);
        when(mockSection3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection3.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection3.isReftext()).thenReturn(false);
        when(mockSection3.getReftext()).thenReturn(null);
        when(mockSection3.getCaption()).thenReturn(null);
        when(mockSection3.getTitle()).thenReturn("A  Section   Three!");
        when(mockSection3.getStyle()).thenReturn(null);
        when(mockSection3.getLevel()).thenReturn(2);
        when(mockSection3.getContentModel()).thenReturn("compound");
        when(mockSection3.getSourceLocation()).thenReturn(null);
        when(mockSection3.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock3 = mock(Block.class);
        when(mockBlock3.getId()).thenReturn(null);
        when(mockBlock3.getNodeName()).thenReturn("paragraph");
        when(mockBlock3.getParent()).thenReturn(mockSection3);
        when(mockBlock3.getContext()).thenReturn("paragraph");
        when(mockBlock3.getDocument()).thenReturn(mockDocument1);
        when(mockBlock3.isInline()).thenReturn(false);
        when(mockBlock3.isBlock()).thenReturn(true);
        when(mockBlock3.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock3.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock3.isReftext()).thenReturn(false);
        when(mockBlock3.getReftext()).thenReturn(null);
        when(mockBlock3.getCaption()).thenReturn(null);
        when(mockBlock3.getTitle()).thenReturn(null);
        when(mockBlock3.getStyle()).thenReturn(null);
        when(mockBlock3.getLevel()).thenReturn(2);
        when(mockBlock3.getContentModel()).thenReturn("simple");
        when(mockBlock3.getSourceLocation()).thenReturn(null);
        when(mockBlock3.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock3.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock3.getLines()).thenReturn(Collections.singletonList("Some text for 3."));
        when(mockBlock3.getSource()).thenReturn("Some text for 3.");
        when(mockSection3.getBlocks()).thenReturn(Collections.singletonList(mockBlock3));
        when(mockSection3.getIndex()).thenReturn(1);
        when(mockSection3.getNumber()).thenReturn(1);
        when(mockSection3.getSectionName()).thenReturn("section");
        when(mockSection3.isSpecial()).thenReturn(false);
        when(mockSection3.isNumbered()).thenReturn(false);
        Section mockSection4 = mock(Section.class);
        when(mockSection4.getId()).thenReturn("this_is_section_4");
        when(mockSection4.getNodeName()).thenReturn("section");
        when(mockSection4.getParent()).thenReturn(mockSection1);
        when(mockSection4.getContext()).thenReturn("section");
        when(mockSection4.getDocument()).thenReturn(mockDocument1);
        when(mockSection4.isInline()).thenReturn(false);
        when(mockSection4.isBlock()).thenReturn(true);
        when(mockSection4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockSection4.getRoles()).thenReturn(Collections.emptyList());
        when(mockSection4.isReftext()).thenReturn(false);
        when(mockSection4.getReftext()).thenReturn(null);
        when(mockSection4.getCaption()).thenReturn(null);
        when(mockSection4.getTitle()).thenReturn("This_is_section_4");
        when(mockSection4.getStyle()).thenReturn(null);
        when(mockSection4.getLevel()).thenReturn(2);
        when(mockSection4.getContentModel()).thenReturn("compound");
        when(mockSection4.getSourceLocation()).thenReturn(null);
        when(mockSection4.getSubstitutions()).thenReturn(Collections.emptyList());
        Block mockBlock4 = mock(Block.class);
        when(mockBlock4.getId()).thenReturn(null);
        when(mockBlock4.getNodeName()).thenReturn("paragraph");
        when(mockBlock4.getParent()).thenReturn(mockSection4);
        when(mockBlock4.getContext()).thenReturn("paragraph");
        when(mockBlock4.getDocument()).thenReturn(mockDocument1);
        when(mockBlock4.isInline()).thenReturn(false);
        when(mockBlock4.isBlock()).thenReturn(true);
        when(mockBlock4.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockBlock4.getRoles()).thenReturn(Collections.emptyList());
        when(mockBlock4.isReftext()).thenReturn(false);
        when(mockBlock4.getReftext()).thenReturn(null);
        when(mockBlock4.getCaption()).thenReturn(null);
        when(mockBlock4.getTitle()).thenReturn(null);
        when(mockBlock4.getStyle()).thenReturn(null);
        when(mockBlock4.getLevel()).thenReturn(2);
        when(mockBlock4.getContentModel()).thenReturn("simple");
        when(mockBlock4.getSourceLocation()).thenReturn(null);
        when(mockBlock4.getSubstitutions()).thenReturn(Arrays.asList("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements"));
        when(mockBlock4.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock4.getLines()).thenReturn(Collections.singletonList("Some text for 4."));
        when(mockBlock4.getSource()).thenReturn("Some text for 4.");
        when(mockSection4.getBlocks()).thenReturn(Collections.singletonList(mockBlock4));
        when(mockSection4.getIndex()).thenReturn(2);
        when(mockSection4.getNumber()).thenReturn(1);
        when(mockSection4.getSectionName()).thenReturn("section");
        when(mockSection4.isSpecial()).thenReturn(false);
        when(mockSection4.isNumbered()).thenReturn(false);
        when(mockSection1.getBlocks()).thenReturn(Arrays.asList(mockBlock1, mockSection2, mockSection3, mockSection4));
        when(mockSection1.getIndex()).thenReturn(0);
        when(mockSection1.getNumber()).thenReturn(1);
        when(mockSection1.getSectionName()).thenReturn("section");
        when(mockSection1.isSpecial()).thenReturn(false);
        when(mockSection1.isNumbered()).thenReturn(false);
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockSection1));
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("Section 1");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("Section 1");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocument1.getStructuredDoctitle()).thenReturn(mockTitle1);
        when(mockDocument1.getDoctitle()).thenReturn("Section 1");
        Map<Object, Object> map3 = new HashMap<>();
        map3.put("attributes", "{}");
        map3.put("header_footer", false);
        when(mockDocument1.getOptions()).thenReturn(map3);
        return mockDocument1;
    }
    // end::mock-code[]
}