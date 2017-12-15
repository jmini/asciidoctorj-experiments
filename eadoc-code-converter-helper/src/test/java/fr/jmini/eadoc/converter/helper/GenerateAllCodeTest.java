package fr.jmini.eadoc.converter.helper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.StructuredDocument;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeGenerator;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.asciidoctorj.converter.mockcode.MockCodeGenerator;

public class GenerateAllCodeTest {

    @Test
    public void generateExampleTest() throws Exception {
        String adocInput = "= My page\n"
                + "\n"
                + "Some text\n";

        generateDocumentCode("EadocCodeGeneratorExampleTest", adocInput);
    }

    @Test
    public void generateDocumentAstTest() throws Exception {
        String adocInput = "== A small List\n" +
                "\n" +
                "Lorem ipsum dolor sit amet:\n" +
                "\n" +
                "* First item\n" +
                "* Second item\n" +
                "\n" +
                "Ut commodo lorem nec lacinia finibus.\n";

        generateDocumentCode("EadocCodeGeneratorDocumentAstTest", adocInput);
    }

    @Test
    public void generateStructuredDocumentAstTest() throws Exception {
        String adocInput = "= My page\n"
                + "\n"
                + "Some text\n"
                + "\n"
                + "== An header\n"
                + "\n"
                + "What does it mean?\n";

        generateStructuredDocumentCode("EadocCodeGeneratorStructuredDocumentAstTest", adocInput);
    }

    private void generateDocumentCode(String testName, String adocInput) throws IOException {
        File adocFile = new File("../eadoc-code-converter/src/test/java/fr/jmini/eadoc/converter/" + testName + ".adoc");
        Files.write(adocInput, adocFile, Charsets.UTF_8);

        File utFile = new File("../eadoc-code-converter/src/test/java/fr/jmini/eadoc/converter/" + testName + ".java");
        assertThat(utFile).exists();

        CodeTestingUtility.replaceContentInFile(utFile, adocInput, "input-asciidoc", false);

        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        Document document = asciidoctor.load(adocInput, new java.util.HashMap<String, Object>());
        CodeTestingUtility.rewriteAttributes(document.getAttributes());

        StringBuilder sb;

        MockCodeGenerator mockConverter = new MockCodeGenerator();
        sb = new StringBuilder();
        mockConverter.createDocumentCode(sb, document);
        CodeTestingUtility.replaceContentInFile(utFile, sb.toString(), "mock-code", true);

        AssertCodeGenerator assertConverter = new AssertCodeGenerator();
        sb = new StringBuilder();
        assertConverter.createDocumentCode(sb, document);
        CodeTestingUtility.replaceContentInFile(utFile, sb.toString(), "assert-code", true);
    }

    private void generateStructuredDocumentCode(String testName, String adocInput) throws IOException {
        File adocFile = new File("../eadoc-code-converter/src/test/java/fr/jmini/eadoc/converter/" + testName + ".adoc");
        Files.write(adocInput, adocFile, Charsets.UTF_8);

        File utFile = new File("../eadoc-code-converter/src/test/java/fr/jmini/eadoc/converter/" + testName + ".java");
        assertThat(utFile).exists();

        CodeTestingUtility.replaceContentInFile(utFile, adocInput, "input-asciidoc", false);

        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        StructuredDocument structuredDocument = asciidoctor.readDocumentStructure(adocInput, new java.util.HashMap<String, Object>());

        if (structuredDocument.getHeader() != null) {
            CodeTestingUtility.rewriteAttributes(structuredDocument.getHeader()
                    .getAttributes());
        }

        StringBuilder sb;

        MockCodeGenerator mockConverter = new MockCodeGenerator();
        sb = new StringBuilder();
        mockConverter.createStructuredDocumentCode(sb, structuredDocument);
        CodeTestingUtility.replaceContentInFile(utFile, sb.toString(), "mock-code", true);

        AssertCodeGenerator assertConverter = new AssertCodeGenerator();
        sb = new StringBuilder();
        assertConverter.createStructuredDocumentCode(sb, structuredDocument);
        CodeTestingUtility.replaceContentInFile(utFile, sb.toString(), "assert-code", true);
    }
}
