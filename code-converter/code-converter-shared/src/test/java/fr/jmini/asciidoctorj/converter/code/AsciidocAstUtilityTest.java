package fr.jmini.asciidoctorj.converter.code;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Table;
import org.junit.Test;

public class AsciidocAstUtilityTest {

    @Test
    public void testFindAllDocumentNode1() {
        Document mockDocument = mock(Document.class);
        Set<Document> result = AsciidocAstUtility.findAllDocumentNode(mockDocument);
        assertThat(result).hasSize(1);
    }

    @Test
    public void testFindAllDocumentNode2() {
        Document mockDocument1 = mock(Document.class);
        when(mockDocument1.getId()).thenReturn(null);
        when(mockDocument1.getNodeName()).thenReturn("document");
        when(mockDocument1.getContext()).thenReturn("document");
        when(mockDocument1.getDocument()).thenReturn(mockDocument1);
        Table mockTable1 = mock(Table.class);
        when(mockTable1.getId()).thenReturn(null);
        when(mockTable1.getNodeName()).thenReturn("table");
        when(mockTable1.getContext()).thenReturn("table");
        when(mockTable1.getDocument()).thenReturn(mockDocument1);
        Column mockColumn1 = mock(Column.class);
        when(mockColumn1.getId()).thenReturn(null);
        when(mockColumn1.getNodeName()).thenReturn("column");
        when(mockColumn1.getParent()).thenReturn(mockTable1);
        when(mockColumn1.getContext()).thenReturn("column");
        when(mockColumn1.getDocument()).thenReturn(mockDocument1);
        when(mockTable1.getColumns()).thenReturn(Arrays.asList(mockColumn1));
        when(mockTable1.getHeader()).thenReturn(Collections.emptyList());
        when(mockTable1.getFooter()).thenReturn(Collections.emptyList());
        Row mockRow1 = mock(Row.class);
        Cell mockCell1 = mock(Cell.class);
        when(mockCell1.getId()).thenReturn(null);
        when(mockCell1.getNodeName()).thenReturn("cell");
        when(mockCell1.getParent()).thenReturn(mockColumn1);
        when(mockCell1.getContext()).thenReturn("cell");
        when(mockCell1.getDocument()).thenReturn(mockDocument1);
        Document mockDocument2 = mock(Document.class);
        when(mockDocument2.getId()).thenReturn(null);
        when(mockDocument2.getNodeName()).thenReturn("document");
        when(mockDocument2.getContext()).thenReturn("document");
        when(mockCell1.getInnerDocument()).thenReturn(mockDocument2);
        when(mockRow1.getCells()).thenReturn(Arrays.asList(mockCell1));
        when(mockTable1.getBody()).thenReturn(Arrays.asList(mockRow1));
        when(mockDocument1.getBlocks()).thenReturn(Collections.singletonList(mockTable1));

        Set<Document> result = AsciidocAstUtility.findAllDocumentNode(mockDocument1);
        assertThat(result).hasSize(2);
    }

}
