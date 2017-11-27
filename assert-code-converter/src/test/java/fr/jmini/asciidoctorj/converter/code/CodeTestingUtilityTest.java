package fr.jmini.asciidoctorj.converter.code;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class CodeTestingUtilityTest {

    @Test
    public void testFindMethodDeclaration() throws Exception {
        String methodDeclaration = CodeTestingUtility.findMethodDeclaration("  public void test(String s) {}");
        assertThat(methodDeclaration).isEqualTo("public void test(String s)");
    }

    @Test
    public void testFindStatements() throws Exception {
        List<String> statements;

        statements = CodeTestingUtility.findStatements("public void test(String s) {\n" + "   System.out.println(s);" + "}\n");
        assertThat(statements).containsExactly("System.out.println(s)");

        statements = CodeTestingUtility.findStatements("public void test(String s) {\n" + "   System.out.println(\"{\" + s + \"}\");" + "}\n");
        assertThat(statements).containsExactly("System.out.println(\"{\" + s + \"}\")");

        statements = CodeTestingUtility.findStatements("public void test(String s) {\n"
                + "   System.out.println(\"This is important:\");"
                + "   System.out.println(s);"
                + "   System.out.println(\"This is \"\n    + \"the end!\");"
                + "}\n");
        assertThat(statements).containsExactly("System.out.println(\"This is important:\")", "System.out.println(s)", "System.out.println(\"This is \" + \"the end!\")");

        statements = CodeTestingUtility.findStatements("public void test(Map<String,Object> map) {\n"
                + "   assertThat(map).containsEntry(\"one\", 1)\n    .containsEntry(\"two\", 2)\n    .containsEntry(\"three\", 3);"
                + "}\n");
        assertThat(statements).containsExactly("assertThat(map).containsEntry(\"one\", 1).containsEntry(\"two\", 2).containsEntry(\"three\", 3)");

        statements = CodeTestingUtility.findStatements("public void test(Map<String,Object> map) {\n"
                + "assertThat(map).containsEntry(\"one\", 1)\n.containsEntry(\"two\", 2);"
                + "}\n");
        assertThat(statements).containsExactly("assertThat(map).containsEntry(\"one\", 1).containsEntry(\"two\", 2)");
    }

}
