package fr.jmini.asciidoctorj.converter.html.helper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeGenerator;
import fr.jmini.asciidoctorj.converter.code.CodeConverterUtility;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractDivMultilineTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractDivSimpleTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractDivWithIdAndRoleTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListNestedTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlDecimalTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlLoweralphaTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlLowergreekTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlLowerromanTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlReversedTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlUpperalphaTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListOlUpperromanTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractListUlTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractMultiDivTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractSectionAllTesting;
import fr.jmini.asciidoctorj.converter.html.testing.AbstractSectionTesting;
import fr.jmini.asciidoctorj.converter.html.testing.HtmlConverterTestingUtility;
import fr.jmini.asciidoctorj.converter.mockcode.MockCodeGenerator;

public class HtmlConverterHelper {

    public static final String ASSERT_CODE_TAG_NAME = "assert-code";
    public static final String MOCK_CODE_TAG_NAME = "mock-code";
    public static final String EXPECTED_HTML_TAG_NAME = "expected-html";

    public static Map<String, String> ASCIIDOC_CONTENT_MAP = ImmutableMap.<String, String>builder()
            .put(AbstractDivMultilineTesting.class.getSimpleName(), AbstractDivMultilineTesting.ASCIIDOC)
            .put(AbstractDivSimpleTesting.class.getSimpleName(), AbstractDivSimpleTesting.ASCIIDOC)
            .put(AbstractDivWithIdAndRoleTesting.class.getSimpleName(), AbstractDivWithIdAndRoleTesting.ASCIIDOC)
            .put(AbstractListNestedTesting.class.getSimpleName(), AbstractListNestedTesting.ASCIIDOC)
            .put(AbstractListOlDecimalTesting.class.getSimpleName(), AbstractListOlDecimalTesting.ASCIIDOC)
            .put(AbstractListOlLoweralphaTesting.class.getSimpleName(), AbstractListOlLoweralphaTesting.ASCIIDOC)
            .put(AbstractListOlLowergreekTesting.class.getSimpleName(), AbstractListOlLowergreekTesting.ASCIIDOC)
            .put(AbstractListOlLowerromanTesting.class.getSimpleName(), AbstractListOlLowerromanTesting.ASCIIDOC)
            .put(AbstractListOlReversedTesting.class.getSimpleName(), AbstractListOlReversedTesting.ASCIIDOC)
            .put(AbstractListOlTesting.class.getSimpleName(), AbstractListOlTesting.ASCIIDOC)
            .put(AbstractListOlUpperalphaTesting.class.getSimpleName(), AbstractListOlUpperalphaTesting.ASCIIDOC)
            .put(AbstractListOlUpperromanTesting.class.getSimpleName(), AbstractListOlUpperromanTesting.ASCIIDOC)
            .put(AbstractListUlTesting.class.getSimpleName(), AbstractListUlTesting.ASCIIDOC)
            .put(AbstractMultiDivTesting.class.getSimpleName(), AbstractMultiDivTesting.ASCIIDOC)
            .put(AbstractSectionAllTesting.class.getSimpleName(), AbstractSectionAllTesting.ASCIIDOC)
            .put(AbstractSectionTesting.class.getSimpleName(), AbstractSectionTesting.ASCIIDOC)
            .build();

    public static void main(String[] args) throws IOException {
        File[] files = findTestingFiles();
        for (File file : files) {
            String abstractTestingClassName = computeClassName(file);
            if (!ASCIIDOC_CONTENT_MAP.containsKey(abstractTestingClassName)) {
                throw new IllegalStateException(abstractTestingClassName + " key is missing in ASCIIDOC_CONTENT_MAP");
            }
        }
        for (File abstractTestingFile : files) {
            System.out.println(abstractTestingFile.getName());
            String abstractTestingClassName = computeClassName(abstractTestingFile);
            String asciidocContent = ASCIIDOC_CONTENT_MAP.get(abstractTestingClassName);

            File resourcesFile = findAsciidocRessourceFile(abstractTestingClassName);
            Files.write(asciidocContent, resourcesFile, Charsets.UTF_8);

            Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
            Document document = asciidoctor.load(asciidocContent, new java.util.HashMap<String, Object>());
            CodeTestingUtility.rewriteAttributes(document.getAttributes());

            String assertCode = computeAssertCode(document);
            CodeTestingUtility.replaceContentInFile(abstractTestingFile, assertCode, ASSERT_CODE_TAG_NAME, true, true);

            String expectedHtml = computeExpectedHtmlConstant(document);
            CodeTestingUtility.replaceContentInFile(abstractTestingFile, expectedHtml, EXPECTED_HTML_TAG_NAME, false, true);

            String mockCode = computeMockCode(document);
            File testFile = findTestFile(abstractTestingClassName);
            if (!testFile.exists()) {
                String testClassName = computeClassName(testFile);
                String testFileContent = createTestFile(testClassName, abstractTestingClassName);

                testFileContent = CodeTestingUtility.replaceContent(testFileContent, mockCode, MOCK_CODE_TAG_NAME, true);
                Files.write(testFileContent, testFile, Charsets.UTF_8);
            } else {
                CodeTestingUtility.replaceContentInFile(testFile, mockCode, MOCK_CODE_TAG_NAME, true, true);
            }
            File referenceTestFile = findReferenceTestFile(abstractTestingClassName);
            if (!referenceTestFile.exists()) {
                String referenceClassName = computeClassName(referenceTestFile);
                String testFileContent = createReferenceTestFile(referenceClassName, abstractTestingClassName);
                Files.write(testFileContent, referenceTestFile, Charsets.UTF_8);
            }
        }
        System.out.println("-");
    }

    private static String computeAssertCode(Document document) {
        StringBuilder sb = new StringBuilder();
        AssertCodeGenerator assertGenerator = new AssertCodeGenerator();
        assertGenerator.createDocumentCode(sb, document);
        return sb.toString();
    }

    private static String computeMockCode(Document document) {
        StringBuilder sb = new StringBuilder();
        MockCodeGenerator mockGenerator = new MockCodeGenerator();
        mockGenerator.createDocumentCode(sb, document);
        return sb.toString();
    }

    public static String computeExpectedHtmlConstant(Document document) {
        String expectedHtml = document.convert();
        expectedHtml = HtmlConverterTestingUtility.normalizeHtml(expectedHtml);
        expectedHtml = "public static final String EXPECTED_HTML = " + CodeConverterUtility.convertString(expectedHtml) + ";";
        return expectedHtml;
    }

    /**
     * Return the list of all the abstract test cases contained in the "fr.jmini.asciidoctorj.converter.html.testing" package of the "html-j-converter-testing" project
     *
     * @return testingFiles
     */
    public static File[] findTestingFiles() {
        File testingFolder = new File("../html-j-converter-testing/src/main/java/fr/jmini/asciidoctorj/converter/html/testing/");
        File[] files = testingFolder.listFiles(f -> f.getName()
                .endsWith("Testing.java"));
        return files;
    }

    /**
     * Given a file representing a Java class, return the name of the corresponding class
     *
     * @param file
     * @return className
     */
    public static String computeClassName(File file) {
        String className = file.getName()
                .replace(".java", "");
        return className;
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-converter" project corresponding to the given testing file class name
     *
     * @param abstractTestingClassName
     *            testing file class name
     * @return testFile
     */
    public static File findAsciidocRessourceFile(String abstractTestingClassName) {
        return new File("../html-j-converter-testing/src/main/resources/" + abstractTestingClassName + ".adoc");
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-converter" project corresponding to the given testing file class name
     *
     * @param abstractTestingClassName
     *            testing file class name
     * @return testFile
     */
    public static File findTestFile(String abstractTestingClassName) {
        String testClassName = abstractTestingClassName.replace("Abstract", "")
                .replace("Testing", "Test");
        File testFile = new File("../html-j-converter/src/test/java/fr/jmini/asciidoctorj/converter/html/" + testClassName + ".java");
        return testFile;
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-converter" project corresponding to the given testing file class name
     *
     * @param abstractTestingClassName
     *            testing file class name
     * @return refernceTestFile
     */
    public static File findReferenceTestFile(String abstractTestingClassName) {
        String referenceClassName = abstractTestingClassName.replace("Abstract", "")
                .replace("Testing", "ReferenceTest");
        File referenceTestFile = new File("../html-j-reference-test/src/test/java/fr/jmini/asciidoctorj/converter/html/reference/" + referenceClassName + ".java");
        return referenceTestFile;
    }

    /**
     * Create reference test file content
     *
     * @param referenceClassName
     * @param abstractTestingClassName
     * @return
     */
    public static String createTestFile(String testClassName, String abstractTestingClassName) {
        return "package fr.jmini.asciidoctorj.converter.html;\n" +
                "\n" +
                "import static org.mockito.Mockito.mock;\n" +
                "import static org.mockito.Mockito.when;\n" +
                "\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Collections;\n" +
                "\n" +
                "import org.asciidoctor.ast.Block;\n" +
                "import org.asciidoctor.ast.Document;\n" +
                "import org.asciidoctor.ast.Title;\n" +
                "\n" +
                "import fr.jmini.asciidoctorj.converter.html.testing." + abstractTestingClassName + ";\n" +
                "\n" +
                "public class " + testClassName + " extends " + abstractTestingClassName + " {\n" +
                "\n" +
                "    @Override\n" +
                "    protected Document createAstDocument(String asciiDoc) {\n" +
                "        Document mock = createMock();\n" +
                "        return mock;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected String convertToHtml(Document astDocument) {\n" +
                "        return HtmlConverterTestUtility.convertToHtml(astDocument);\n" +
                "    }\n" +
                "\n" +
                "    // tag::" + MOCK_CODE_TAG_NAME + "[]\n" +
                "    public Document createMock() {\n" +
                "        Document mockDocument1 = mock(Document.class);\n" +
                "        return mockDocument1;\n" +
                "    }\n" +
                "    // end::" + MOCK_CODE_TAG_NAME + "[]\n" +
                "}\n" +
                "";
    }

    /**
     * Create reference test file content
     *
     * @param referenceClassName
     * @param abstractTestingClassName
     * @return
     */
    public static String createReferenceTestFile(String referenceClassName, String abstractTestingClassName) {
        return "package fr.jmini.asciidoctorj.converter.html.reference;\n" +
                "\n" +
                "import static org.assertj.core.api.Assertions.assertThat;\n" +
                "\n" +
                "import org.asciidoctor.Asciidoctor;\n" +
                "import org.asciidoctor.ast.Document;\n" +
                "import org.asciidoctor.ast.impl.DocumentImpl;\n" +
                "\n" +
                "import fr.jmini.asciidoctorj.converter.html.testing." + abstractTestingClassName + ";\n" +
                "import fr.jmini.asciidoctorj.converter.html.testing.HtmlConverterTestingUtility;\n" +
                "\n" +
                "public class " + referenceClassName + " extends " + abstractTestingClassName + " {\n" +
                "\n" +
                "    @Override\n" +
                "    protected Document createAstDocument(String asciiDoc) {\n" +
                "        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();\n" +
                "        return asciidoctor.load(asciiDoc, new java.util.HashMap<String, Object>());\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void checkAst(Document astDocument) {\n" +
                "        assertThat(astDocument).isInstanceOf(DocumentImpl.class);\n" +
                "        super.checkAst(astDocument);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected String convertToHtml(Document astDocument) {\n" +
                "        String html = astDocument.convert();\n" +
                "        html = HtmlConverterTestingUtility.normalizeHtml(html);\n" +
                "        return html;\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "";
    }

}
