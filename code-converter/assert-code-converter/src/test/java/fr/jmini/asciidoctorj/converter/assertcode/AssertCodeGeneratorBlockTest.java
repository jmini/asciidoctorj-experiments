package fr.jmini.asciidoctorj.converter.assertcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.asciidoctor.ast.Block;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class AssertCodeGeneratorBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block mockBlock = mock(Block.class);
        when(mockBlock.getId()).thenReturn("block-id");
        ImmutableMap<String, Object> attributes = ImmutableMap.<String, Object>builder()
                .put("1", "#idname.rolename")
                .put("id", "idname")
                .put("role", "rolename")
                .build();
        when(mockBlock.getAttributes()).thenReturn(attributes);
        when(mockBlock.getParent()).thenReturn(null);
        when(mockBlock.getNodeName()).thenReturn("some-name");
        when(mockBlock.isInline()).thenReturn(true);
        when(mockBlock.getTitle()).thenReturn("some-title");
        when(mockBlock.getRoles()).thenReturn(Arrays.asList("r1", "r2"));

        AssertCodeGenerator generator = new AssertCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createBlockCode(sb, mockBlock);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());

        checkAst(mockBlock);
    }

    // tag::generated-code[]
    public void checkAst(Block astBlock) {
        Block block1 = astBlock;
        assertThat(block1.getId()).isEqualTo("block-id");
        assertThat(block1.getNodeName()).isEqualTo("some-name");
        assertThat(block1.getParent()).isNull();
        assertThat(block1.getContext()).isNull();
        assertThat(block1.getDocument()).isNull();
        assertThat(block1.isInline()).isTrue();
        assertThat(block1.isBlock()).isFalse();
        assertThat(block1.getAttributes()).containsEntry("1", "#idname.rolename")
                .containsEntry("id", "idname")
                .containsEntry("role", "rolename");
        assertThat(block1.getRoles()).containsExactly("r1", "r2");
        assertThat(block1.isReftext()).isFalse();
        assertThat(block1.getReftext()).isNull();
        assertThat(block1.getCaption()).isNull();
        assertThat(block1.getTitle()).isEqualTo("some-title");
        assertThat(block1.getStyle()).isNull();
        assertThat(block1.getLevel()).isEqualTo(0);
        assertThat(block1.getContentModel()).isNull();
        assertThat(block1.getSourceLocation()).isNull();
        assertThat(block1.getSubstitutions()).isNullOrEmpty();
        assertThat(block1.getBlocks()).isNullOrEmpty();
        assertThat(block1.getLines()).isNullOrEmpty();
        assertThat(block1.getSource()).isNull();
    }
    // end::generated-code[]
}
