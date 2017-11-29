package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.asciidoctor.ast.List;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorListTest {

    @Test
    public void testList() throws Exception {
        List mockList = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createListCode(sb, mockList);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public org.asciidoctor.ast.List createMock() {
        List mockList1 = mock(org.asciidoctor.ast.List.class);
        when(mockList1.getId()).thenReturn(null);
        when(mockList1.getNodeName()).thenReturn(null);
        when(mockList1.getContext()).thenReturn(null);
        when(mockList1.getDocument()).thenReturn(null);
        when(mockList1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockList1.getRoles()).thenReturn(Collections.emptyList());
        when(mockList1.isReftext()).thenReturn(false);
        when(mockList1.getTitle()).thenReturn(null);
        when(mockList1.getStyle()).thenReturn(null);
        when(mockList1.getLevel()).thenReturn(0);
        when(mockList1.getContentModel()).thenReturn(null);
        when(mockList1.getSourceLocation()).thenReturn(null);
        when(mockList1.getSubstitutions()).thenReturn(Collections.emptyList());
        when(mockList1.getBlocks()).thenReturn(Collections.emptyList());
        when(mockList1.getItems()).thenReturn(Collections.emptyList());
        when(mockList1.hasItems()).thenReturn(false);
        return mockList1;
    }
    // end::generated-code[]
}
