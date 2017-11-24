package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class CodeTestingUtility {

    private static final String START_TAG = "tag::generated-code[]";
    private static final String END_TAG = "end::generated-code[]";

    public static void testGeneratedCode(String expectedCode, Class<?> utClass) {
        // System.out.println(expectedCode);
        // replaceGeneratedBlock(expectedCode, utClass);

        String utCode = readUtCode(utClass);
        String code = findGeneratedBlock(utCode);

        String expectedDeclaration = findMethodDeclaration(expectedCode);
        String declaration = findMethodDeclaration(code);
        assertThat(declaration).isEqualTo(expectedDeclaration);

        List<String> expectedStatements = findStatements(expectedCode);
        List<String> statements = findStatements(code);
        assertThat(statements).containsExactlyElementsOf(expectedStatements);
    }

    private static void replaceGeneratedBlock(String expectedCode, Class<?> utClass) {
        String content = readUtCode(utClass);
        int start = content.indexOf(START_TAG, 0) + START_TAG.length();
        int end = content.indexOf(END_TAG, start);

        String newContent = content.substring(0, start) + "\n" + expectedCode + "\n // " + content.substring(end);

        // System.out.println(newContent);
        File file = javaFile(utClass);
        try {
            Files.write(newContent, file, Charsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String findGeneratedBlock(String content) {
        int start = content.indexOf(START_TAG, 0) + START_TAG.length();
        int end = content.indexOf(END_TAG, start);
        return content.substring(start, end)
                .trim();
    }

    static String findMethodDeclaration(String content) {
        int i = content.indexOf("{", 0);
        return content.substring(0, i)
                .trim();
    }

    static List<String> findStatements(String content) {
        int start = content.indexOf("{", 0) + 1;
        int end = content.indexOf("}", start);
        String body = content.substring(start, end)
                .trim();
        String[] parts = body.split(";");
        return Arrays.stream(parts)
                .map(s -> s.trim()
                        .replaceAll("\n[ ]+", " ")
                        .replace(" .", "."))
                .collect(Collectors.toList());
    }

    private static String readUtCode(Class<?> utClass) {
        String content;
        File f = javaFile(utClass);
        try {
            content = Files.toString(f, Charsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return content;
    }

    private static File javaFile(Class<?> utClass) {
        return new File("src/test/java/fr/jmini/asciidoctorj/code/converter/" + utClass.getSimpleName() + ".java");
    }

}
