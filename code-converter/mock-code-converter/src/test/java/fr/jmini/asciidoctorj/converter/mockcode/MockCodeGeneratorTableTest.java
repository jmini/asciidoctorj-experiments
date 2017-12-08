package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorTableTest {

    @Test
    public void testTable() throws Exception {
        Table mockTable = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createTableCode(sb, mockTable);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public Table createMock() {
        Table mockTable1 = mock(Table.class);
        when(mockTable1.getId()).thenReturn(null);
        when(mockTable1.getNodeName()).thenReturn(null);
        when(mockTable1.getContext()).thenReturn(null);
        when(mockTable1.getDocument()).thenReturn(null);
        when(mockTable1.isInline()).thenReturn(false);
        when(mockTable1.isBlock()).thenReturn(false);
        when(mockTable1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockTable1.getRoles()).thenReturn(Collections.emptyList());
        when(mockTable1.isReftext()).thenReturn(false);
        when(mockTable1.getReftext()).thenReturn(null);
        when(mockTable1.getTitle()).thenReturn(null);
        when(mockTable1.getStyle()).thenReturn(null);
        when(mockTable1.getLevel()).thenReturn(0);
        when(mockTable1.getContentModel()).thenReturn(null);
        when(mockTable1.getSourceLocation()).thenReturn(null);
        when(mockTable1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockTable1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockTable1.hasHeaderOption()).thenReturn(true);
        when(mockTable1.getColumns()).thenReturn(Collections.emptyList());
        when(mockTable1.getHeader()).thenReturn(Collections.emptyList());
        when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
        when(mockTable1.getBody()).thenReturn(Collections.emptyList());
        when(mockTable1.getFrame()).thenReturn("my-frame");
        when(mockTable1.getGrid()).thenReturn("my-grid");
        return mockTable1;
    }
    // end::generated-code[]
}
