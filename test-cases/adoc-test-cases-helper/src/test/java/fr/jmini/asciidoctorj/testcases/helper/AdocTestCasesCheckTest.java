package fr.jmini.asciidoctorj.testcases.helper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.asciidoctorj.testcases.AdocTestCase;
import fr.jmini.asciidoctorj.testcases.AdocTestCases;
import fr.jmini.asciidoctorj.testcases.HtmlUtility;

public class AdocTestCasesCheckTest {

    @Test
    public void ensureAllTestCasesIsComplete() throws Exception {
        List<String> testCasesNames = AdocTestCases.getAllTestCases()
                .stream()
                .map(c -> c.getClass()
                        .getSimpleName())
                .collect(Collectors.toList());

        List<String> testCasesFromFiles = Arrays.stream(AdocTestCaseHelper.findTestCasesFiles())
                .map(AdocTestCaseHelper::computeClassName)
                .collect(Collectors.toList());

        assertThat(testCasesNames).containsAll(testCasesFromFiles);
        assertThat(testCasesNames).containsOnlyElementsOf(testCasesFromFiles);
    }

    @Test
    public void ensureAllTestCasesAreCorrect() throws Exception {
        SoftAssertions assertions = new SoftAssertions();
        List<AdocTestCase> testCases = AdocTestCases.getAllTestCases();
        for (AdocTestCase testCase : testCases) {
            String asciidocContent = testCase.getAdocInput();
            assertThat(asciidocContent).isNotNull();

            File file = CodeTestingUtility.javaFile("../adoc-test-cases/", "main", testCase.getClass());
            String content = Files.toString(file, Charsets.UTF_8);

            Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
            Document document = asciidoctor.load(asciidocContent, testCase.getInputOptions());
            CodeTestingUtility.rewriteAttributes(document);

            String assertCode = AdocTestCaseHelper.computeAssertCode(document);
            CodeTestingUtility.testGeneratedCode(assertCode, content, AdocTestCaseHelper.ASSERT_CODE_TAG_NAME, true);

            String mockCode = AdocTestCaseHelper.computeMockCode(document);
            CodeTestingUtility.testGeneratedCode(mockCode, content, AdocTestCaseHelper.MOCK_CODE_TAG_NAME, true);

            assertThat(content).contains("public static final String EXPECTED_HTML");
            String expectedHtml = AdocTestCaseHelper.computeExpectedHtmlConstant(document);
            CodeTestingUtility.testGeneratedCode(expectedHtml, content, AdocTestCaseHelper.EXPECTED_HTML_TAG_NAME, false);

            String html = document.convert();
            html = HtmlUtility.normalizeHtml(html);
            assertions.assertThat("<htmlRoot>\n" + html + "\n</htmlRoot>")
                    .as(testCase.getClass()
                            .getSimpleName())
                    .isXmlEqualTo("<htmlRoot>\n" + testCase.getHtmlOutput() + "\n</htmlRoot>");
        }
        assertions.assertAll();
    }
}
