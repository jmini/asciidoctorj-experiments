package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;
import org.junit.Test;

public abstract class AbstractSectionAllTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);

        html = HtmlConverterTestingUtility.normalizeHtml(html);
        assertThat(html).isEqualTo(EXPECTED_HTML);
    }

    public static final String ASCIIDOC = ""
            + "== Section 1\n"
            + "\n"
            + "Some text for 1.\n"
            + "\n"
            + "=== Section 2\n"
            + "\n"
            + "Some text for 2.\n"
            + "\n"
            + "[[somesec]]\n"
            + "==== Section 3\n"
            + "\n"
            + "Some text for 3.\n"
            + "\n"
            + "===== Section 4\n"
            + "\n"
            + "Some text for 4.\n"
            + "\n"
            + "====== Section 5\n"
            + "\n"
            + "Some text for 5.\n"
            + "\n"
            + "";

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<div class=\"sect1\"> \n" +
            " <h2 id=\"_section_1\">Section 1</h2> \n" +
            " <div class=\"sectionbody\"> \n" +
            "  <div class=\"paragraph\"> \n" +
            "   <p>Some text for 1.</p> \n" +
            "  </div> \n" +
            "  <div class=\"sect2\"> \n" +
            "   <h3 id=\"_section_2\">Section 2</h3> \n" +
            "   <div class=\"paragraph\"> \n" +
            "    <p>Some text for 2.</p> \n" +
            "   </div> \n" +
            "   <div class=\"sect3\"> \n" +
            "    <h4 id=\"somesec\">Section 3</h4> \n" +
            "    <div class=\"paragraph\"> \n" +
            "     <p>Some text for 3.</p> \n" +
            "    </div> \n" +
            "    <div class=\"sect4\"> \n" +
            "     <h5 id=\"_section_4\">Section 4</h5> \n" +
            "     <div class=\"paragraph\"> \n" +
            "      <p>Some text for 4.</p> \n" +
            "     </div> \n" +
            "     <div class=\"sect5\"> \n" +
            "      <h6 id=\"_section_5\">Section 5</h6> \n" +
            "      <div class=\"paragraph\"> \n" +
            "       <p>Some text for 5.</p> \n" +
            "      </div> \n" +
            "     </div> \n" +
            "    </div> \n" +
            "   </div> \n" +
            "  </div> \n" +
            " </div> \n" +
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
                .containsEntry("filetype", "html")
                .containsEntry("notitle", "");
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
        Section section1 = (Section) document1.getBlocks()
                .get(0);
        assertThat(section1.getId()).isEqualTo("_section_1");
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
        assertThat(section1.getTitle()).isEqualTo("Section 1");
        assertThat(section1.getStyle()).isNull();
        assertThat(section1.getLevel()).isEqualTo(1);
        assertThat(section1.getContentModel()).isEqualTo("compound");
        assertThat(section1.getSourceLocation()).isNull();
        assertThat(section1.getSubstitutions()).isNullOrEmpty();
        assertThat(section1.getBlocks()).hasSize(2);
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
        assertThat(section2.getId()).isEqualTo("_section_2");
        assertThat(section2.getNodeName()).isEqualTo("section");
        assertThat(section2.getParent()).isSameAs(section1);
        assertThat(section2.getContext()).isEqualTo("section");
        assertThat(section2.getDocument()).isSameAs(document1);
        assertThat(section2.isInline()).isFalse();
        assertThat(section2.isBlock()).isTrue();
        assertThat(section2.getAttributes()).isNullOrEmpty();
        assertThat(section2.getRoles()).isNullOrEmpty();
        assertThat(section2.isReftext()).isFalse();
        assertThat(section2.getReftext()).isNull();
        assertThat(section2.getTitle()).isEqualTo("Section 2");
        assertThat(section2.getStyle()).isNull();
        assertThat(section2.getLevel()).isEqualTo(2);
        assertThat(section2.getContentModel()).isEqualTo("compound");
        assertThat(section2.getSourceLocation()).isNull();
        assertThat(section2.getSubstitutions()).isNullOrEmpty();
        assertThat(section2.getBlocks()).hasSize(2);
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
        assertThat(block2.getTitle()).isNull();
        assertThat(block2.getStyle()).isNull();
        assertThat(block2.getLevel()).isEqualTo(2);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Some text for 2.");
        assertThat(block2.getSource()).isEqualTo("Some text for 2.");
        Section section3 = (Section) section2.getBlocks()
                .get(1);
        assertThat(section3.getId()).isEqualTo("somesec");
        assertThat(section3.getNodeName()).isEqualTo("section");
        assertThat(section3.getParent()).isSameAs(section2);
        assertThat(section3.getContext()).isEqualTo("section");
        assertThat(section3.getDocument()).isSameAs(document1);
        assertThat(section3.isInline()).isFalse();
        assertThat(section3.isBlock()).isTrue();
        assertThat(section3.getAttributes()).containsEntry("id", "somesec");
        assertThat(section3.getRoles()).isNullOrEmpty();
        assertThat(section3.isReftext()).isFalse();
        assertThat(section3.getReftext()).isNull();
        assertThat(section3.getTitle()).isEqualTo("Section 3");
        assertThat(section3.getStyle()).isNull();
        assertThat(section3.getLevel()).isEqualTo(3);
        assertThat(section3.getContentModel()).isEqualTo("compound");
        assertThat(section3.getSourceLocation()).isNull();
        assertThat(section3.getSubstitutions()).isNullOrEmpty();
        assertThat(section3.getBlocks()).hasSize(2);
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
        assertThat(block3.getTitle()).isNull();
        assertThat(block3.getStyle()).isNull();
        assertThat(block3.getLevel()).isEqualTo(3);
        assertThat(block3.getContentModel()).isEqualTo("simple");
        assertThat(block3.getSourceLocation()).isNull();
        assertThat(block3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block3.getBlocks()).isNullOrEmpty();
        assertThat(block3.getLines()).containsExactly("Some text for 3.");
        assertThat(block3.getSource()).isEqualTo("Some text for 3.");
        Section section4 = (Section) section3.getBlocks()
                .get(1);
        assertThat(section4.getId()).isEqualTo("_section_4");
        assertThat(section4.getNodeName()).isEqualTo("section");
        assertThat(section4.getParent()).isSameAs(section3);
        assertThat(section4.getContext()).isEqualTo("section");
        assertThat(section4.getDocument()).isSameAs(document1);
        assertThat(section4.isInline()).isFalse();
        assertThat(section4.isBlock()).isTrue();
        assertThat(section4.getAttributes()).isNullOrEmpty();
        assertThat(section4.getRoles()).isNullOrEmpty();
        assertThat(section4.isReftext()).isFalse();
        assertThat(section4.getReftext()).isNull();
        assertThat(section4.getTitle()).isEqualTo("Section 4");
        assertThat(section4.getStyle()).isNull();
        assertThat(section4.getLevel()).isEqualTo(4);
        assertThat(section4.getContentModel()).isEqualTo("compound");
        assertThat(section4.getSourceLocation()).isNull();
        assertThat(section4.getSubstitutions()).isNullOrEmpty();
        assertThat(section4.getBlocks()).hasSize(2);
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
        assertThat(block4.getTitle()).isNull();
        assertThat(block4.getStyle()).isNull();
        assertThat(block4.getLevel()).isEqualTo(4);
        assertThat(block4.getContentModel()).isEqualTo("simple");
        assertThat(block4.getSourceLocation()).isNull();
        assertThat(block4.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block4.getBlocks()).isNullOrEmpty();
        assertThat(block4.getLines()).containsExactly("Some text for 4.");
        assertThat(block4.getSource()).isEqualTo("Some text for 4.");
        Section section5 = (Section) section4.getBlocks()
                .get(1);
        assertThat(section5.getId()).isEqualTo("_section_5");
        assertThat(section5.getNodeName()).isEqualTo("section");
        assertThat(section5.getParent()).isSameAs(section4);
        assertThat(section5.getContext()).isEqualTo("section");
        assertThat(section5.getDocument()).isSameAs(document1);
        assertThat(section5.isInline()).isFalse();
        assertThat(section5.isBlock()).isTrue();
        assertThat(section5.getAttributes()).isNullOrEmpty();
        assertThat(section5.getRoles()).isNullOrEmpty();
        assertThat(section5.isReftext()).isFalse();
        assertThat(section5.getReftext()).isNull();
        assertThat(section5.getTitle()).isEqualTo("Section 5");
        assertThat(section5.getStyle()).isNull();
        assertThat(section5.getLevel()).isEqualTo(5);
        assertThat(section5.getContentModel()).isEqualTo("compound");
        assertThat(section5.getSourceLocation()).isNull();
        assertThat(section5.getSubstitutions()).isNullOrEmpty();
        assertThat(section5.getBlocks()).hasSize(1);
        Block block5 = (Block) section5.getBlocks()
                .get(0);
        assertThat(block5.getId()).isNull();
        assertThat(block5.getNodeName()).isEqualTo("paragraph");
        assertThat(block5.getParent()).isSameAs(section5);
        assertThat(block5.getContext()).isEqualTo("paragraph");
        assertThat(block5.getDocument()).isSameAs(document1);
        assertThat(block5.isInline()).isFalse();
        assertThat(block5.isBlock()).isTrue();
        assertThat(block5.getAttributes()).isNullOrEmpty();
        assertThat(block5.getRoles()).isNullOrEmpty();
        assertThat(block5.isReftext()).isFalse();
        assertThat(block5.getReftext()).isNull();
        assertThat(block5.getTitle()).isNull();
        assertThat(block5.getStyle()).isNull();
        assertThat(block5.getLevel()).isEqualTo(5);
        assertThat(block5.getContentModel()).isEqualTo("simple");
        assertThat(block5.getSourceLocation()).isNull();
        assertThat(block5.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block5.getBlocks()).isNullOrEmpty();
        assertThat(block5.getLines()).containsExactly("Some text for 5.");
        assertThat(block5.getSource()).isEqualTo("Some text for 5.");
        assertThat(section5.getIndex()).isEqualTo(0);
        assertThat(section5.getNumber()).isEqualTo(1);
        assertThat(section5.getSectionName()).isEqualTo("section");
        assertThat(section5.isSpecial()).isFalse();
        assertThat(section5.isNumbered()).isFalse();
        assertThat(section4.getIndex()).isEqualTo(0);
        assertThat(section4.getNumber()).isEqualTo(1);
        assertThat(section4.getSectionName()).isEqualTo("section");
        assertThat(section4.isSpecial()).isFalse();
        assertThat(section4.isNumbered()).isFalse();
        assertThat(section3.getIndex()).isEqualTo(0);
        assertThat(section3.getNumber()).isEqualTo(1);
        assertThat(section3.getSectionName()).isEqualTo("section");
        assertThat(section3.isSpecial()).isFalse();
        assertThat(section3.isNumbered()).isFalse();
        assertThat(section2.getIndex()).isEqualTo(0);
        assertThat(section2.getNumber()).isEqualTo(1);
        assertThat(section2.getSectionName()).isEqualTo("section");
        assertThat(section2.isSpecial()).isFalse();
        assertThat(section2.isNumbered()).isFalse();
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

}
