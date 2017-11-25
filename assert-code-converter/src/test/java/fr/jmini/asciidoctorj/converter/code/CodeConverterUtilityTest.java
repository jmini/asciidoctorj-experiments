package fr.jmini.asciidoctorj.converter.code;

import static org.assertj.core.api.Assertions.assertThat;

import org.asciidoctor.ast.Table.HorizontalAlignment;
import org.asciidoctor.ast.Table.VerticalAlignment;
import org.junit.Test;

public class CodeConverterUtilityTest {

    @Test
    public void testConvertBoolean() {
        assertThat(CodeConverterUtility.convertBoolean(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertBoolean(true)).isEqualTo("true");
        assertThat(CodeConverterUtility.convertBoolean(false)).isEqualTo("false");
    }

    @Test
    public void testConvertInt() {
        assertThat(CodeConverterUtility.convertInt(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertInt(14)).isEqualTo("14");
    }

    @Test
    public void testConvertString() {
        assertThat(CodeConverterUtility.convertString(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertString("some")).isEqualTo("\"some\"");
        assertThat(CodeConverterUtility.convertString("foo \"bar\" foo")).isEqualTo("\"foo \\\"bar\\\" foo\"");
        assertThat(CodeConverterUtility.convertString("foo\\bar")).isEqualTo("\"foo\\\\bar\"");
    }

    @Test
    public void testConvertHorizontalAlignment() {
        assertThat(CodeConverterUtility.convertHorizontalAlignment(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertHorizontalAlignment(HorizontalAlignment.LEFT)).isEqualTo("Table.HorizontalAlignment.LEFT");
        assertThat(CodeConverterUtility.convertHorizontalAlignment(HorizontalAlignment.CENTER)).isEqualTo("Table.HorizontalAlignment.CENTER");
        assertThat(CodeConverterUtility.convertHorizontalAlignment(HorizontalAlignment.RIGHT)).isEqualTo("Table.HorizontalAlignment.RIGHT");
    }

    @Test
    public void testConvertVerticalAlignment() {
        assertThat(CodeConverterUtility.convertVerticalAlignment(null)).isEqualTo("null");
        assertThat(CodeConverterUtility.convertVerticalAlignment(VerticalAlignment.TOP)).isEqualTo("Table.VerticalAlignment.TOP");
        assertThat(CodeConverterUtility.convertVerticalAlignment(VerticalAlignment.MIDDLE)).isEqualTo("Table.VerticalAlignment.MIDDLE");
        assertThat(CodeConverterUtility.convertVerticalAlignment(VerticalAlignment.BOTTOM)).isEqualTo("Table.VerticalAlignment.BOTTOM");
    }

}
