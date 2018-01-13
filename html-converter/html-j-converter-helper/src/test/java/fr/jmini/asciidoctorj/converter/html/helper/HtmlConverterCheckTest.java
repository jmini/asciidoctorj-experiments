package fr.jmini.asciidoctorj.converter.html.helper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fr.jmini.asciidoctorj.testcases.AdocTestCase;
import fr.jmini.asciidoctorj.testcases.AdocTestCases;

public class HtmlConverterCheckTest {

    @Test
    public void ensureAllTestingFileCorrect() throws Exception {
        List<AdocTestCase> testCases = AdocTestCases.getAllTestCases();
        for (AdocTestCase testCase : testCases) {
            String abstractTestingClassName = HtmlConverterHelper.computeAbstractTestingClassName(testCase);

            File abstractTestingFile = HtmlConverterHelper.findAbstractTestingFile(abstractTestingClassName);
            assertThat(abstractTestingFile).exists();
            String content = Files.toString(abstractTestingFile, Charsets.UTF_8);
            assertThat(content).contains(testCase.getClass()
                    .getCanonicalName());
        }
    }

    @Test
    public void ensureAllTestFileExists() throws Exception {
        List<AdocTestCase> testCases = AdocTestCases.getAllTestCases();
        for (AdocTestCase testCase : testCases) {
            String abstractTestingClassName = HtmlConverterHelper.computeAbstractTestingClassName(testCase);
            String testClassName = HtmlConverterHelper.computeTestClassName(testCase);

            File testFile = HtmlConverterHelper.findTestFile(testClassName);
            assertThat(testFile).exists();
            String content = Files.toString(testFile, Charsets.UTF_8);
            assertThat(content).contains(" extends " + abstractTestingClassName);
        }
    }

    @Test
    public void ensureAllReferenceTestFileExists() throws Exception {
        List<AdocTestCase> testCases = AdocTestCases.getAllTestCases();
        for (AdocTestCase testCase : testCases) {
            String abstractTestingClassName = HtmlConverterHelper.computeAbstractTestingClassName(testCase);
            String referenceTestClassName = HtmlConverterHelper.computeReferenceTestClassName(testCase);

            File referenceTestFile = HtmlConverterHelper.findReferenceTestFile(referenceTestClassName);
            assertThat(referenceTestFile).exists();
            String content = Files.toString(referenceTestFile, Charsets.UTF_8);
            assertThat(content).contains(" extends " + abstractTestingClassName);
        }
    }
}
