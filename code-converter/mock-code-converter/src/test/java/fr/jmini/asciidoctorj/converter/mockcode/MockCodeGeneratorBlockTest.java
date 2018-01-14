package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Block;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block mockBlock = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createBlockCode(sb, mockBlock);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Block createMock() {
        Block mockBlock1 = mock(Block.class);
        when(mockBlock1.getId()).thenReturn("block-id");
        when(mockBlock1.getNodeName()).thenReturn("some-name");
        when(mockBlock1.getParent()).thenReturn(null);
        when(mockBlock1.getContext()).thenReturn(null);
        when(mockBlock1.getDocument()).thenReturn(null);
        when(mockBlock1.isInline()).thenReturn(false);
        when(mockBlock1.isBlock()).thenReturn(false);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("one", "lorem");
        map1.put("two", "ipusm");
        when(mockBlock1.getAttributes()).thenReturn(map1);
        when(mockBlock1.getRoles()).thenReturn(Arrays.asList("r1", "r2"));
        when(mockBlock1.isReftext()).thenReturn(false);
        when(mockBlock1.getReftext()).thenReturn(null);
        when(mockBlock1.getCaption()).thenReturn(null);
        when(mockBlock1.getTitle()).thenReturn("some-title");
        when(mockBlock1.getStyle()).thenReturn(null);
        when(mockBlock1.getLevel()).thenReturn(0);
        when(mockBlock1.getContentModel()).thenReturn(null);
        when(mockBlock1.getSourceLocation()).thenReturn(null);
        when(mockBlock1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockBlock1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockBlock1.getLines()).thenReturn(Collections.emptyList());
        when(mockBlock1.getSource()).thenReturn(null);
        return mockBlock1;
    }
    // end::generated-code[]
}
