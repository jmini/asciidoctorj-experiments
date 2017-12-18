package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class AssertCodeGeneratorTest {

    @Test
    public void testEqualsToExpressionMap() throws Exception {
        String code;
        ImmutableMap<String, Object> map = ImmutableMap.<String, Object>builder()
                .put("x", "1")
                .put("b", "2")
                .build();
        List<String> list = Arrays.asList("c", "a", "b");

        code = AssertCodeGenerator.equalsToExpressionMap(map, list);
        assertThat(code).isEqualTo("containsEntry(\"b\", \"2\").containsEntry(\"x\", \"1\").doesNotContainKey(\"a\").doesNotContainKey(\"c\")");

        code = AssertCodeGenerator.equalsToExpressionMap(map, Collections.emptyList());
        assertThat(code).isEqualTo("containsEntry(\"b\", \"2\").containsEntry(\"x\", \"1\")");

        code = AssertCodeGenerator.equalsToExpressionMap(map, Arrays.asList("x", "b"));
        assertThat(code).isEqualTo("containsEntry(\"b\", \"2\").containsEntry(\"x\", \"1\")");

        code = AssertCodeGenerator.equalsToExpressionMap(Collections.singletonMap("x", "y"), list);
        assertThat(code).isEqualTo("containsEntry(\"x\", \"y\").doesNotContainKey(\"a\").doesNotContainKey(\"b\").doesNotContainKey(\"c\")");

        code = AssertCodeGenerator.equalsToExpressionMap(Collections.emptyMap(), list);
        assertThat(code).isEqualTo("isNullOrEmpty()");
    }
}
