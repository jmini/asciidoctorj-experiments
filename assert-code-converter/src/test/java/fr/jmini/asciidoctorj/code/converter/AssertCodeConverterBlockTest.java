package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cursor;
import org.junit.Test;

public class AssertCodeConverterBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block mockBlock = mock(Block.class);
        when(mockBlock.getParent()).thenReturn(null);
        when(mockBlock.getNodeName()).thenReturn("someName");
        when(mockBlock.getRoles()).thenReturn(Arrays.asList("r1", "r2"));

        Cursor mockCursor = mock(Cursor.class);
        when(mockBlock.getSourceLocation()).thenReturn(mockCursor);

        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createBlockCode(sb, mockBlock);
        System.out.println(sb);

        checkAst(mockBlock);
    }

    // tag::generated-code[]
    public void checkAst(Block astBlock) {
        Block b1 = astBlock;
        assertThat(b1.getId()).isNull();
        assertThat(b1.getNodeName()).isNull();
        assertThat(b1.getContext()).isNull();
        assertThat(b1.isInline()).isFalse();
        assertThat(b1.isBlock()).isFalse();
        assertThat(b1.getRoles()).containsExactly("r1", "r2");
        assertThat(b1.getTitle()).isNull();
        assertThat(b1.getStyle()).isNull();
        assertThat(b1.getLevel()).isEqualTo(0);
        Cursor c1 = b1.getSourceLocation();
        assertThat(c1.getLineNumber()).isEqualTo(0);
        assertThat(c1.getPath()).isNull();
        assertThat(c1.getDir()).isNull();
        assertThat(c1.getFile()).isNull();
        assertThat(b1.getLines()).isEmpty();
        assertThat(b1.getSource()).isNull();
    }
    // end::generated-code[]
}
