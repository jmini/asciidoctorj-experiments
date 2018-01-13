package fr.jmini.asciidoctorj.converter.html.helper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.testcases.AdocTestCase;
import fr.jmini.asciidoctorj.testcases.AdocTestCases;

public class HtmlConverterHelper {

    public static void main(String[] args) throws IOException {
        List<AdocTestCase> testCases = AdocTestCases.getAllTestCases();
        for (AdocTestCase testCase : testCases) {
            System.out.println(testCase.getClass()
                    .getSimpleName());

            String abstractTestingClassName = computeAbstractTestingClassName(testCase);
            File abstractTestingFile = findAbstractTestingFile(abstractTestingClassName);
            String abstractTestingContent = createTestingClassFile(abstractTestingClassName, testCase.getClass()
                    .getSimpleName());
            Files.write(abstractTestingContent, abstractTestingFile, Charsets.UTF_8);

            String testClassName = computeTestClassName(testCase);
            File testFile = findTestFile(testClassName);
            String testContent = createTestFile(testClassName, abstractTestingClassName);
            Files.write(testContent, testFile, Charsets.UTF_8);

            String referenceClassName = computeReferenceTestClassName(testCase);
            File referenceTestFile = findReferenceTestFile(referenceClassName);
            String referenceTestContent = createReferenceTestFile(referenceClassName, abstractTestingClassName);
            Files.write(referenceTestContent, referenceTestFile, Charsets.UTF_8);
        }
        System.out.println("-");
    }

    public static String computeAbstractTestingClassName(AdocTestCase testCase) {
        return "Abstract" + testCase.getClass()
                .getSimpleName()
                .replace("TestCase", "Testing");
    }

    public static String computeTestClassName(AdocTestCase testCase) {
        return testCase.getClass()
                .getSimpleName()
                .replace("TestCase", "Test");
    }

    public static String computeReferenceTestClassName(AdocTestCase testCase) {
        return testCase.getClass()
                .getSimpleName()
                .replace("TestCase", "ReferenceTest");
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-converter" project corresponding to the given testing file class name
     *
     * @param abstractTestingClassName
     *            testing file class name
     * @return testFile
     */
    public static File findAbstractTestingFile(String abstractTestingClassName) {
        return new File("../html-j-converter-testing/src/main/java/fr/jmini/asciidoctorj/converter/html/testing/" + abstractTestingClassName + ".java");
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-converter" project corresponding to the given testing file class name
     *
     * @param testClassName
     * @return testFile
     */
    public static File findTestFile(String testClassName) {
        return new File("../html-j-converter/src/test/java/fr/jmini/asciidoctorj/converter/html/" + testClassName + ".java");
    }

    /**
     * Find the test file in the "fr.jmini.asciidoctorj.converter.html" package of the "html-j-reference-test" project corresponding to the given class name
     *
     * @param referenceClassName
     * @return refernceTestFile
     */
    public static File findReferenceTestFile(String referenceClassName) {
        return new File("../html-j-reference-test/src/test/java/fr/jmini/asciidoctorj/converter/html/reference/" + referenceClassName + ".java");
    }

    /**
     * Create test file content
     *
     * @param abstractTestingClassName
     * @param testCaseClassName
     * @return
     */
    public static String createTestingClassFile(String abstractTestingClassName, String testCaseClassName) {
        return "package fr.jmini.asciidoctorj.converter.html.testing;\n" +
                "\n" +
                "import static org.assertj.core.api.Assertions.assertThat;\n" +
                "\n" +
                "import java.util.Map;\n" +
                "\n" +
                "import org.asciidoctor.ast.Document;\n" +
                "import org.junit.Test;\n" +
                "\n" +
                "import fr.jmini.asciidoctorj.testcases.AdocTestCase;\n" +
                "import fr.jmini.asciidoctorj.testcases." + testCaseClassName + ";\n" +
                "\n" +
                "public abstract class " + abstractTestingClassName + " {\n" +
                "\n" +
                "    protected AdocTestCase testCase = new " + testCaseClassName + "();\n" +
                "\n" +
                "    @Test\n" +
                "    public void test() throws Exception {\n" +
                "        Document astDocument = createAstDocument(testCase.getAdocInput(), testCase.getInputOptions());\n" +
                "        testCase.checkAst(astDocument);\n" +
                "        String html = convertToHtml(astDocument);\n" +
                "        assertThat(\"<htmlRoot>\\n\" + html + \"\\n</htmlRoot>\")\n" +
                "                .as(testCase.getClass()\n" +
                "                        .getSimpleName())\n" +
                "                .isXmlEqualTo(\"<htmlRoot>\\n\" + testCase.getHtmlOutput() + \"\\n</htmlRoot>\");\n" +
                "    }\n" +
                "\n" +
                "    protected abstract Document createAstDocument(String asciiDoc, Map<String, Object> options);\n" +
                "\n" +
                "    protected abstract String convertToHtml(Document astDocument);\n" +
                "\n" +
                "}\n" +
                "";
    }

    /**
     * Create test file content
     *
     * @param testClassName
     * @param abstractTestingClassName
     * @return
     */
    public static String createTestFile(String testClassName, String abstractTestingClassName) {
        return "package fr.jmini.asciidoctorj.converter.html;\n" +
                "\n" +
                "import java.util.Map;\n" +
                "\n" +
                "import org.asciidoctor.ast.Document;\n" +
                "\n" +
                "import fr.jmini.asciidoctorj.converter.html.testing." + abstractTestingClassName + ";\n" +
                "\n" +
                "public class " + testClassName + " extends " + abstractTestingClassName + " {\n" +
                "\n" +
                "    @Override\n" +
                "    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {\n" +
                "        Document mock = testCase.createMock();\n" +
                "        return mock;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected String convertToHtml(Document astDocument) {\n" +
                "        return HtmlConverterTestUtility.convertToHtml(astDocument);\n" +
                "    }\n" +
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
                "import java.util.Map;\n" +
                "\n" +
                "import org.asciidoctor.Asciidoctor;\n" +
                "import org.asciidoctor.ast.Document;\n" +
                "import org.asciidoctor.ast.impl.DocumentImpl;\n" +
                "\n" +
                "import fr.jmini.asciidoctorj.converter.html.testing." + abstractTestingClassName + ";\n" +
                "import fr.jmini.asciidoctorj.testcases.HtmlUtility;\n" +
                "\n" +
                "public class " + referenceClassName + " extends " + abstractTestingClassName + " {\n" +
                "\n" +
                "    @Override\n" +
                "    protected Document createAstDocument(String asciiDoc, Map<String, Object> options) {\n" +
                "        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();\n" +
                "        Document document = asciidoctor.load(asciiDoc, options);\n" +
                "        assertThat(document).isInstanceOf(DocumentImpl.class);\n" +
                "        return document;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected String convertToHtml(Document astDocument) {\n" +
                "        String html = astDocument.convert();\n" +
                "        return HtmlUtility.normalizeHtml(html);\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "";
    }

}
