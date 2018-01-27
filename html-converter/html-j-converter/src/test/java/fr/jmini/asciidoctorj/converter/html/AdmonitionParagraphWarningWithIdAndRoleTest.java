package fr.jmini.asciidoctorj.converter.html;

import java.util.Map;

import org.asciidoctor.ast.Document;

import fr.jmini.asciidoctorj.converter.html.testing.AbstractAdmonitionParagraphWarningWithIdAndRoleTesting;

/**
 * Test for {@link fr.jmini.asciidoctorj.testcases.AdmonitionParagraphWarningWithIdAndRoleTestCase} (mocked AST, java html backend) .
 */
public class AdmonitionParagraphWarningWithIdAndRoleTest extends AbstractAdmonitionParagraphWarningWithIdAndRoleTesting {

    @Override
    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {
        Document mock = testCase.createMock();
        return mock;
    }

    @Override
    protected String convertToHtml(Document astDocument) {
        return HtmlConverterTestUtility.convertToHtml(astDocument);
    }
}
