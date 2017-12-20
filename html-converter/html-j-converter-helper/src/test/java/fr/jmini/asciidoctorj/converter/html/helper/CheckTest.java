package fr.jmini.asciidoctorj.converter.html.helper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeGenerator;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.asciidoctorj.converter.mockcode.MockCodeGenerator;

public class CheckTest {

    @Test
    public void ensureAllTestingFileCorrect() throws Exception {
        File[] files = HtmlConverterHelper.findTestingFiles();
        for (File abstractTestingFile : files) {
            String abstractTestingClassName = HtmlConverterHelper.computeClassName(abstractTestingFile);
            String asciidocContent = HtmlConverterHelper.ASCIIDOC_CONTENT_MAP.get(abstractTestingClassName);
            assertThat(asciidocContent).isNotNull();

            Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
            Document document = asciidoctor.load(asciidocContent, new java.util.HashMap<String, Object>());
            String expectedHtml = HtmlConverterHelper.computeExpectedHtmlConstant(document);
            CodeTestingUtility.rewriteAttributes(document.getAttributes());

            AssertCodeGenerator assertGenerator = new AssertCodeGenerator();
            StringBuilder sb = new StringBuilder();
            assertGenerator.createDocumentCode(sb, document);

            String content = Files.toString(abstractTestingFile, Charsets.UTF_8);
            CodeTestingUtility.testGeneratedCode(sb.toString(), content, HtmlConverterHelper.ASSERT_CODE_TAG_NAME, true);

            assertThat(content).contains("public static final String EXPECTED_HTML");
            CodeTestingUtility.testGeneratedCode(expectedHtml, content, HtmlConverterHelper.EXPECTED_HTML_TAG_NAME, false);
        }
    }

    @Test
    public void ensureAllTestFileExists() throws Exception {
        File[] files = HtmlConverterHelper.findTestingFiles();
        for (File abstractTestingFile : files) {
            String abstractTestingClassName = HtmlConverterHelper.computeClassName(abstractTestingFile);
            String asciidocContent = HtmlConverterHelper.ASCIIDOC_CONTENT_MAP.get(abstractTestingClassName);

            File testFile = HtmlConverterHelper.findTestFile(abstractTestingClassName);
            assertThat(testFile).exists();
            String content = Files.toString(testFile, Charsets.UTF_8);
            assertThat(content).contains(" extends " + abstractTestingClassName);

            Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
            Document document = asciidoctor.load(asciidocContent, new java.util.HashMap<String, Object>());
            CodeTestingUtility.rewriteAttributes(document.getAttributes());

            MockCodeGenerator mockGenerator = new MockCodeGenerator();
            StringBuilder sb = new StringBuilder();
            mockGenerator.createDocumentCode(sb, document);
            CodeTestingUtility.testGeneratedCode(sb.toString(), content, HtmlConverterHelper.MOCK_CODE_TAG_NAME, true);
        }
    }

    @Test
    public void ensureAllReferenceTestFileExists() throws Exception {
        File[] files = HtmlConverterHelper.findTestingFiles();
        for (File abstractTestingFile : files) {
            String className = HtmlConverterHelper.computeClassName(abstractTestingFile);
            File testFile = HtmlConverterHelper.findReferenceTestFile(className);
            assertThat(testFile).exists();
            String content = Files.toString(testFile, Charsets.UTF_8);
            assertThat(content).contains(" extends " + className);
            assertThat(content).contains("    @Override\n" +
                    "    public void checkAst(Document astDocument) {\n" +
                    "        assertThat(astDocument).isInstanceOf(DocumentImpl.class);\n" +
                    "        super.checkAst(astDocument);\n" +
                    "    }\n");
        }
    }
}
