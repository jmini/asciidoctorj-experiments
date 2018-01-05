package fr.jmini.asciidoctorj.converter.code;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class CodeTestingUtility {

    private static final String TAG_NAME = "generated-code";

    public static void testGeneratedCode(String expectedCode, Class<?> utClass) {
        // System.out.println(expectedCode);
        // replaceGeneratedBlock(expectedCode, utClass, TAG_NAME);

        String utCode = readUtCode(utClass);
        testGeneratedCode(expectedCode, utCode, TAG_NAME, true);
    }

    public static void testGeneratedCode(String expectedCode, String content, String tagName, boolean isFunction) {
        String code = findGeneratedBlock(content, tagName);

        if (isFunction) {
            String expectedDeclaration = findMethodDeclaration(expectedCode);
            String declaration = findMethodDeclaration(code);
            assertThat(declaration).isEqualTo(expectedDeclaration);
        }

        List<String> expectedStatements = findStatements(expectedCode, isFunction);
        List<String> statements = findStatements(code, isFunction);
        assertThat(statements).containsExactlyElementsOf(expectedStatements);
    }

    public static void replaceContentInFile(File file, String newContent, String tagName, boolean insideCodeBlock, boolean withCommentTag) {
        String oldFileContent = readContent(file);
        String oldContent = findGeneratedBlock(oldFileContent, tagName);

        List<String> oldStatements = findStatements(oldContent, insideCodeBlock);
        List<String> newStatements = findStatements(newContent, insideCodeBlock);
        if (!oldStatements.equals(newStatements)) {
            String newFileContent = replaceContent(oldFileContent, newContent, tagName, withCommentTag);
            try {
                Files.write(newFileContent, file, Charsets.UTF_8);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

    }

    public static String replaceContent(String existingContent, String newContent, String tagName, boolean withCommentTag) {
        String startTag = computeStartTag(tagName);
        String endTag = computeEndTag(tagName);

        int start = existingContent.indexOf(startTag, 0);
        if (start < 0) {
            throw new IllegalStateException("did not find start tag: " + startTag);
        }
        start = start + startTag.length();
        int end = existingContent.indexOf(endTag, start);
        if (end < 0) {
            throw new IllegalStateException("did not find start end: " + endTag);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(existingContent.substring(0, start));
        sb.append("\n");
        sb.append(newContent);
        sb.append("\n");
        if (withCommentTag) {
            sb.append(" // ");
        }
        sb.append(existingContent.substring(end));
        String newFileContent = sb.toString();
        return newFileContent;
    }

    private static void replaceGeneratedBlock(String expectedCode, Class<?> utClass, String tagName) {
        File file = javaFile(utClass);

        replaceContentInFile(file, expectedCode, tagName, true, true);
    }

    private static String findGeneratedBlock(String content, String tagName) {
        String startTag = computeStartTag(tagName);
        String endTag = computeEndTag(tagName);

        int start = content.indexOf(startTag, 0) + startTag.length();
        int end = content.indexOf(endTag, start);
        return content.substring(start, end)
                .trim();
    }

    static String findMethodDeclaration(String content) {
        int i = content.indexOf("{", 0);
        return content.substring(0, i)
                .trim();
    }

    static List<String> findStatements(String content, boolean insideCodeBlock) {
        String body;
        if (insideCodeBlock) {
            int start = content.indexOf("{") + 1;
            int end = content.lastIndexOf("}");
            body = content.substring(start, end)
                    .trim();
        } else {
            body = content.trim();
        }

        String[] parts = body.split(";");
        return Arrays.stream(parts)
                .filter(s -> !s.trim()
                        .startsWith("//"))
                .map(s -> s.trim()
                        .replaceAll("[ ]*\n[ ]*", " ")
                        .replaceAll("\n\\.", ".")
                        .replace(" .", "."))
                .collect(Collectors.toList());
    }

    private static String computeStartTag(String tagName) {
        return "tag::" + tagName + "[]";
    }

    private static String computeEndTag(String tagName) {
        return "end::" + tagName + "[]";
    }

    private static String readUtCode(Class<?> utClass) {
        File f = javaFile(utClass);
        return readContent(f);
    }

    private static String readContent(File f) {
        String content;
        try {
            content = Files.toString(f, Charsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return content;
    }

    private static File javaFile(Class<?> utClass) {
        String packageDir = utClass.getPackage()
                .getName()
                .replace('.', '/');
        return new File("src/test/java/" + packageDir + "/" + utClass.getSimpleName() + ".java");
    }

    public static void rewriteAttributes(Map<String, Object> attributes) {
        Map<String, Object> newAttributes = new HashMap<>();
        copyValue("example-caption", attributes, newAttributes);
        copyValue("example-number", attributes, newAttributes);
        copyValue("listing-caption", attributes, newAttributes);
        copyValue("listing-number", attributes, newAttributes);
        copyValue("filetype", attributes, newAttributes);
        copyValue("doctitle", attributes, newAttributes);
        copyValue("doctype", attributes, newAttributes);
        copyValue("notitle", attributes, newAttributes);
        copyValue("prewrap", attributes, newAttributes);
        attributes.clear();
        attributes.putAll(newAttributes);
    }

    private static <T> void copyValue(T key, Map<T, Object> fromMap, Map<T, Object> toMap) {
        if (fromMap.containsKey(key)) {
            toMap.put(key, fromMap.get(key));
        }
    }
}
