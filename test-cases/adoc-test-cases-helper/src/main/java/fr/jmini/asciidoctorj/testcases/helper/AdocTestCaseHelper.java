package fr.jmini.asciidoctorj.testcases.helper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.ast.Document;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.converter.assertcode.AssertCodeGenerator;
import fr.jmini.asciidoctorj.converter.code.CodeConverterUtility;
import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.asciidoctorj.converter.mockcode.MockCodeGenerator;
import fr.jmini.asciidoctorj.testcases.AdocTestCase;
import fr.jmini.asciidoctorj.testcases.AdocTestCases;
import fr.jmini.asciidoctorj.testcases.HtmlUtility;

public class AdocTestCaseHelper {

    public static final String ASSERT_CODE_TAG_NAME = "assert-code";
    public static final String MOCK_CODE_TAG_NAME = "mock-code";
    public static final String EXPECTED_HTML_TAG_NAME = "expected-html";
    public static final String ALL_CASES_TAG_NAME = "all-cases";

    public static final File RESOURCES_FOLDER = new File("../adoc-test-cases/src/main/resources/");

    public static void main(String[] args) throws IOException {
        checkAllTestCases();
        // checkTestCase(new fr.jmini.asciidoctorj.testcases.SectionWithSectnumTestCase());
        System.out.println("-");
    }

    private static void checkAllTestCases() throws IOException {
        List<String> testCasesNames = AdocTestCases.getAllTestCases()
                .stream()
                .map(c -> c.getClass()
                        .getSimpleName())
                .collect(Collectors.toList());

        File[] files = findTestCasesFiles();
        boolean allFilePresent = true;
        for (File file : files) {
            String testCaseClassName = computeClassName(file);
            if (!testCasesNames.contains(testCaseClassName)) {
                allFilePresent = false;
            }
        }
        if (!allFilePresent) {
            StringBuilder sb = new StringBuilder();
            sb.append("public static List<AdocTestCase> getAllTestCases() {\n");
            sb.append("List<AdocTestCase> list = new ArrayList<>();\n");
            sb.append(Arrays.stream(files)
                    .sorted()
                    .map(f -> {
                        String name = f.getName()
                                .replace(".java", "");
                        return "list.add(new " + name + "());";
                    })
                    .collect(Collectors.joining("\n")));
            sb.append("return Collections.unmodifiableList(list);\n");
            sb.append("}");
            CodeTestingUtility.replaceContentInFile(CodeTestingUtility.javaFile("../adoc-test-cases/", "main", AdocTestCases.class), sb.toString(), ALL_CASES_TAG_NAME, false, true);

            throw new IllegalStateException("Some items are missing \n\tsee file fr.jmini.asciidoctorj.testcases.AdocTestCases.getAllTestCases(AdocTestCases.java:10)");
        }
        Arrays.stream(RESOURCES_FOLDER.listFiles())
                .forEach(File::delete);
        for (AdocTestCase testCase : AdocTestCases.getAllTestCases()) {
            checkTestCase(testCase);
        }
    }

    private static void checkTestCase(AdocTestCase testCase) throws IOException {
        System.out.println(testCase.getClass()
                .getSimpleName());
        String asciidocContent = testCase.getAdocInput();
        if (asciidocContent == null) {
            System.out.println("Content missing in " + testCase.getClass()
                    .getName());
        } else {
            File resourcesFile = findAsciidocRessourceFile(RESOURCES_FOLDER, testCase);
            Files.write(asciidocContent, resourcesFile, Charsets.UTF_8);

            File testCaseFile = CodeTestingUtility.javaFile("../adoc-test-cases/", "main", testCase.getClass());

            Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
            Document document = asciidoctor.load(asciidocContent, testCase.getInputOptions());
            // CodeTestingUtility.rewriteAttributes(document);

            String assertCode = computeAssertCode(document);
            CodeTestingUtility.replaceContentInFile(testCaseFile, assertCode, ASSERT_CODE_TAG_NAME, true, true);

            String mockCode = computeMockCode(document);
            CodeTestingUtility.replaceContentInFile(testCaseFile, mockCode, MOCK_CODE_TAG_NAME, true, true);

            String expectedHtml = computeExpectedHtmlConstant(document);
            CodeTestingUtility.replaceContentInFile(testCaseFile, expectedHtml, EXPECTED_HTML_TAG_NAME, false, true);
        }
    }

    static String computeAssertCode(Document document) {
        StringBuilder sb = new StringBuilder();
        AssertCodeGenerator assertGenerator = new AssertCodeGenerator();
        assertGenerator.createDocumentCode(sb, document);
        return sb.toString();
    }

    static String computeMockCode(Document document) {
        StringBuilder sb = new StringBuilder();
        MockCodeGenerator mockGenerator = new MockCodeGenerator();
        mockGenerator.createDocumentCode(sb, document);
        return sb.toString();
    }

    public static String computeExpectedHtmlConstant(Document document) {
        String expectedHtml = document.convert();
        expectedHtml = HtmlUtility.normalizeHtml(expectedHtml);
        expectedHtml = "public static final String EXPECTED_HTML = \"\" +\n" + CodeConverterUtility.convertString(expectedHtml) + ";";
        return expectedHtml;
    }

    /**
     * Return the list of all the abstract test cases contained in the "fr.jmini.asciidoctorj.converter.html.testing" package of the "html-j-converter-testing" project
     *
     * @return testingFiles
     */
    public static File[] findTestCasesFiles() {
        File testingFolder = new File("../adoc-test-cases/src/main/java/fr/jmini/asciidoctorj/testcases/");
        File[] files = testingFolder.listFiles(
                f -> !"AdocTestCase.java".equals(f.getName())
                        && f.getName()
                                .endsWith("TestCase.java"));
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

    public static File findAsciidocRessourceFile(File folder, AdocTestCase testCase) {
        return new File(folder, testCase.getClass()
                .getSimpleName() + ".adoc");
    }

    public static String createEmptyTestCase(String className) {
        return "package fr.jmini.asciidoctorj.testcases;\n" +
                "\n" +
                "import static org.assertj.core.api.Assertions.assertThat;\n" +
                "import static org.mockito.Mockito.mock;\n" +
                "import static org.mockito.Mockito.when;\n" +
                "\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Collections;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.Map;\n" +
                "\n" +
                "import org.asciidoctor.OptionsBuilder;\n" +
                "import org.asciidoctor.ast.*;\n" +
                "\n" +
                "public class " + className + " implements AdocTestCase {\n" +
                "\n" +
                "    public static final String ASCIIDOC = null;\n" +
                "\n" +
                "    @Override\n" +
                "    public String getAdocInput() {\n" +
                "        return ASCIIDOC;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public Map<String, Object> getInputOptions() {\n" +
                "        return OptionsBuilder.options()\n" +
                "                .asMap();\n" +
                "    }\n" +
                "\n" +
                "    // tag::" + EXPECTED_HTML_TAG_NAME + "[]\n" +
                "    public static final String EXPECTED_HTML = \"\";\n" +
                "    // end::" + EXPECTED_HTML_TAG_NAME + "[]\n" +
                "\n" +
                "    @Override\n" +
                "    public String getHtmlOutput() {\n" +
                "        return EXPECTED_HTML;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    // tag::" + ASSERT_CODE_TAG_NAME + "[]\n" +
                "    public void checkAst(Document astDocument) {\n" +
                "    }\n" +
                "    // end::" + ASSERT_CODE_TAG_NAME + "[]\n" +
                "\n" +
                "    @Override\n" +
                "    // tag::" + MOCK_CODE_TAG_NAME + "[]\n" +
                "    public Document createMock() {\n" +
                "        Document mockDocument1 = mock(Document.class);\n" +
                "        return mockDocument1;\n" +
                "    }\n" +
                "    // end::" + MOCK_CODE_TAG_NAME + "[]\n" +
                "}";
    }
}
