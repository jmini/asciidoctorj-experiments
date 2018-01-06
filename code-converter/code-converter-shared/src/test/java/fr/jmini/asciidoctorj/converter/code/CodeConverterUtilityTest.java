package fr.jmini.asciidoctorj.converter.code;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CodeConverterUtilityTest {

    @Test
    public void testConvertBoolean() {
        assertThat(CodeConverterUtility.convertBoolean(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertBoolean(true)).isEqualTo("true");
        assertThat(CodeConverterUtility.convertBoolean(Boolean.TRUE)).isEqualTo("true");
        assertThat(CodeConverterUtility.convertBoolean(false)).isEqualTo("false");
        assertThat(CodeConverterUtility.convertBoolean(Boolean.FALSE)).isEqualTo("false");
    }

    @Test
    public void testConvertInt() {
        assertThat(CodeConverterUtility.convertInt(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertInt(123)).isEqualTo("123");
    }

    @Test
    public void testConvertLong() {
        assertThat(CodeConverterUtility.convertLong(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertLong(123L)).isEqualTo("123L");
    }

    @Test
    public void testConvertString() {
        assertThat(CodeConverterUtility.convertString(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertString("some")).isEqualTo("\"some\"");
        assertThat(CodeConverterUtility.convertString("_\\\"_")).isEqualTo("\"_\\\\\\\"_\"");
        assertThat(CodeConverterUtility.convertString("a\nb")).isEqualTo("\"a\\n\" +\n\"b\"");
    }

}
