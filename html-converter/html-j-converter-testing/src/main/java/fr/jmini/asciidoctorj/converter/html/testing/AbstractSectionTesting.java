package fr.jmini.asciidoctorj.converter.html.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Title;
import org.junit.Test;

public abstract class AbstractSectionTesting {

    @Test
    public void test() throws Exception {
        String asciiDoc = createAsciiDocInput();
        Document astDocument = createAstDocument(asciiDoc);
        checkAst(astDocument);
        String html = convertToHtml(astDocument);
        assertThat(html).isEqualTo(EXPECTED_HTML);
    }

    public static final String ASCIIDOC = ""
            + "== First Section\n"
            + "\n"
            + "Some text for 1.\n"
            + "\n"
            + "Additional text for 1.\n"
            + "\n"
            + "[#someid.somerole]\n"
            + "== Second Section\n"
            + "\n"
            + "Some text for 2.\n"
            + "\n"
            + "";

    // tag::expected-html[]
    public static final String EXPECTED_HTML = "<div class=\"sect1\">\n" +
            "<h2 id=\"_first_section\">First Section</h2>\n" +
            "<div class=\"sectionbody\">\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 1.</p>\n" +
            "</div>\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Additional text for 1.</p>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"sect1 somerole\">\n" +
            "<h2 id=\"someid\">Second Section</h2>\n" +
            "<div class=\"sectionbody\">\n" +
            "<div class=\"paragraph\">\n" +
            "<p>Some text for 2.</p>\n" +
            "</div>\n" +
            "</div>\n" +
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
        assertThat(document1.getBlocks()).hasSize(2);
        Section section1 = (Section) document1.getBlocks()
                .get(0);
        assertThat(section1.getId()).isEqualTo("_first_section");
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
        assertThat(section1.getTitle()).isEqualTo("First Section");
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
        Block block2 = (Block) section1.getBlocks()
                .get(1);
        assertThat(block2.getId()).isNull();
        assertThat(block2.getNodeName()).isEqualTo("paragraph");
        assertThat(block2.getParent()).isSameAs(section1);
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
        assertThat(block2.getLevel()).isEqualTo(1);
        assertThat(block2.getContentModel()).isEqualTo("simple");
        assertThat(block2.getSourceLocation()).isNull();
        assertThat(block2.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block2.getBlocks()).isNullOrEmpty();
        assertThat(block2.getLines()).containsExactly("Additional text for 1.");
        assertThat(block2.getSource()).isEqualTo("Additional text for 1.");
        assertThat(section1.getIndex()).isEqualTo(0);
        assertThat(section1.getNumber()).isEqualTo(1);
        assertThat(section1.getSectionName()).isEqualTo("section");
        assertThat(section1.isSpecial()).isFalse();
        assertThat(section1.isNumbered()).isFalse();
        Section section2 = (Section) document1.getBlocks()
                .get(1);
        assertThat(section2.getId()).isEqualTo("someid");
        assertThat(section2.getNodeName()).isEqualTo("section");
        assertThat(section2.getParent()).isSameAs(document1);
        assertThat(section2.getContext()).isEqualTo("section");
        assertThat(section2.getDocument()).isSameAs(document1);
        assertThat(section2.isInline()).isFalse();
        assertThat(section2.isBlock()).isTrue();
        assertThat(section2.getAttributes()).containsEntry("id", "someid")
                .containsEntry("role", "somerole");
        assertThat(section2.getRoles()).containsExactly("somerole");
        assertThat(section2.isReftext()).isFalse();
        assertThat(section2.getReftext()).isNull();
        assertThat(section2.getTitle()).isEqualTo("Second Section");
        assertThat(section2.getStyle()).isNull();
        assertThat(section2.getLevel()).isEqualTo(1);
        assertThat(section2.getContentModel()).isEqualTo("compound");
        assertThat(section2.getSourceLocation()).isNull();
        assertThat(section2.getSubstitutions()).isNullOrEmpty();
        assertThat(section2.getBlocks()).hasSize(1);
        Block block3 = (Block) section2.getBlocks()
                .get(0);
        assertThat(block3.getId()).isNull();
        assertThat(block3.getNodeName()).isEqualTo("paragraph");
        assertThat(block3.getParent()).isSameAs(section2);
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
        assertThat(block3.getLevel()).isEqualTo(1);
        assertThat(block3.getContentModel()).isEqualTo("simple");
        assertThat(block3.getSourceLocation()).isNull();
        assertThat(block3.getSubstitutions()).containsExactly("specialcharacters", "quotes", "attributes", "replacements", "macros", "post_replacements");
        assertThat(block3.getBlocks()).isNullOrEmpty();
        assertThat(block3.getLines()).containsExactly("Some text for 2.");
        assertThat(block3.getSource()).isEqualTo("Some text for 2.");
        assertThat(section2.getIndex()).isEqualTo(1);
        assertThat(section2.getNumber()).isEqualTo(1);
        assertThat(section2.getSectionName()).isEqualTo("section");
        assertThat(section2.isSpecial()).isFalse();
        assertThat(section2.isNumbered()).isFalse();
        Title title1 = document1.getStructuredDoctitle();
        assertThat(title1.getMain()).isEqualTo("First Section");
        assertThat(title1.getSubtitle()).isNull();
        assertThat(title1.getCombined()).isEqualTo("First Section");
        assertThat(title1.isSanitized()).isFalse();
        assertThat(document1.getDoctitle()).isEqualTo("First Section");
        assertThat(document1.getOptions()).containsEntry("header_footer", false);
    }
    // end::assert-code[]

}
