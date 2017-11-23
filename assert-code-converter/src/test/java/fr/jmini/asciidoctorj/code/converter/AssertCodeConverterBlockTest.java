package fr.jmini.asciidoctorj.code.converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.asciidoctor.ast.Block;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class AssertCodeConverterBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block mockBlock = mock(Block.class);
        when(mockBlock.getId()).thenReturn("block-id");
        ImmutableMap<String, Object> attributes = ImmutableMap.<String, Object>builder()
                .put("one", "lorem")
                .put("two", "ipusm")
                .build();
        when(mockBlock.getAttributes()).thenReturn(attributes);
        when(mockBlock.getParent()).thenReturn(null);
        when(mockBlock.getNodeName()).thenReturn("some-name");
        when(mockBlock.isInline()).thenReturn(true);
        when(mockBlock.getTitle()).thenReturn("some-title");
        when(mockBlock.getRoles()).thenReturn(Arrays.asList("r1", "r2"));

        // TODO replace System.out.println with a check:
        AssertCodeConverter converter = new AssertCodeConverter(null, null);
        StringBuilder sb = new StringBuilder();
        converter.createBlockCode(sb, mockBlock);
        System.out.println(sb);

        checkAst(mockBlock);
    }

    // tag::generated-code[]
    public void checkAst(Block astBlock) {
        Block b1 = astBlock;
        assertThat(b1.getId()).isEqualTo("block-id");
        assertThat(b1.getNodeName()).isEqualTo("some-name");
        assertThat(b1.getParent()).isNull();
        assertThat(b1.getContext()).isNull();
        assertThat(b1.getDocument()).isNull();
        assertThat(b1.isInline()).isTrue();
        assertThat(b1.isBlock()).isFalse();
        assertThat(b1.getAttributes()).containsEntry("one", "lorem")
                .containsEntry("two", "ipusm");
        assertThat(b1.getRoles()).containsExactly("r1", "r2");
        assertThat(b1.isReftext()).isFalse();
        assertThat(b1.getTitle()).isEqualTo("some-title");
        assertThat(b1.getStyle()).isNull();
        assertThat(b1.getLevel()).isEqualTo(0);
        assertThat(b1.getSourceLocation()).isNull();
        assertThat(b1.getSubstitutions()).isEmpty();
        assertThat(b1.getBlocks()).isEmpty();
        assertThat(b1.getLines()).isEmpty();
        assertThat(b1.getSource()).isNull();
    }
    // end::generated-code[]
}
