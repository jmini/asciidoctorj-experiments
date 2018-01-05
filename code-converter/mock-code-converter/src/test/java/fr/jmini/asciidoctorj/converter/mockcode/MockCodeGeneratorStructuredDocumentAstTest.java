package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Title;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;

public class MockCodeGeneratorStructuredDocumentAstTest {

    @Test
    public void testAst() throws Exception {
        StructuredDocument mockStructuredDocument1 = createMock();

        MockCodeGenerator generator = new MockCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createStructuredDocumentCode(sb, mockStructuredDocument1);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public StructuredDocument createMock() {
        StructuredDocument mockStructuredDocument1 = mock(StructuredDocument.class);
        ContentPart mockContentPart1 = mock(ContentPart.class);
        when(mockContentPart1.getId()).thenReturn(null);
        when(mockContentPart1.getLevel()).thenReturn(1);
        when(mockContentPart1.getContext()).thenReturn("preamble");
        when(mockContentPart1.getStyle()).thenReturn(null);
        when(mockContentPart1.getRole()).thenReturn(null);
        when(mockContentPart1.getTitle()).thenReturn(null);
        when(mockContentPart1.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockContentPart1.getParts()).thenReturn(null);
        ContentPart mockContentPart2 = mock(ContentPart.class);
        when(mockContentPart2.getId()).thenReturn("_an_header");
        when(mockContentPart2.getLevel()).thenReturn(1);
        when(mockContentPart2.getContext()).thenReturn("section");
        when(mockContentPart2.getStyle()).thenReturn(null);
        when(mockContentPart2.getRole()).thenReturn(null);
        when(mockContentPart2.getTitle()).thenReturn("An header");
        when(mockContentPart2.getAttributes()).thenReturn(Collections.emptyMap());
        when(mockContentPart2.getParts()).thenReturn(null);
        when(mockStructuredDocument1.getParts()).thenReturn(Arrays.asList(mockContentPart1, mockContentPart2));
        DocumentHeader mockDocumentHeader1 = mock(DocumentHeader.class);
        when(mockDocumentHeader1.getAuthors()).thenReturn(Collections.emptyList());
        Title mockTitle1 = mock(Title.class);
        when(mockTitle1.getMain()).thenReturn("My page");
        when(mockTitle1.getSubtitle()).thenReturn(null);
        when(mockTitle1.getCombined()).thenReturn("My page");
        when(mockTitle1.isSanitized()).thenReturn(false);
        when(mockDocumentHeader1.getDocumentTitle()).thenReturn(mockTitle1);
        when(mockDocumentHeader1.getPageTitle()).thenReturn("My page");
        Author mockAuthor1 = mock(Author.class);
        when(mockAuthor1.getEmail()).thenReturn(null);
        when(mockAuthor1.getFullName()).thenReturn(null);
        when(mockAuthor1.getFirstName()).thenReturn(null);
        when(mockAuthor1.getLastName()).thenReturn(null);
        when(mockAuthor1.getMiddleName()).thenReturn(null);
        when(mockAuthor1.getInitials()).thenReturn(null);
        when(mockDocumentHeader1.getAuthor()).thenReturn(mockAuthor1);
        RevisionInfo mockRevisionInfo1 = mock(RevisionInfo.class);
        when(mockRevisionInfo1.getDate()).thenReturn(null);
        when(mockRevisionInfo1.getNumber()).thenReturn(null);
        when(mockRevisionInfo1.getRemark()).thenReturn(null);
        when(mockDocumentHeader1.getRevisionInfo()).thenReturn(mockRevisionInfo1);
        when(mockDocumentHeader1.getPageTitle()).thenReturn("My page");
        Map<String, Object> map1 = new HashMap<>();
        map1.put("appendix-caption", "Appendix");
        map1.put("appendix-refsig", "Appendix");
        map1.put("asciidoctor", "");
        map1.put("asciidoctor-version", "1.5.6.1");
        map1.put("attribute-missing", "skip");
        map1.put("attribute-undefined", "drop-line");
        map1.put("backend", "html5");
        map1.put("backend-html5", "");
        map1.put("backend-html5-doctype-article", "");
        map1.put("basebackend", "html");
        map1.put("basebackend-html", "");
        map1.put("basebackend-html-doctype-article", "");
        map1.put("caution-caption", "Caution");
        map1.put("chapter-refsig", "Chapter");
        map1.put("docdate", "2017-11-26");
        map1.put("docdatetime", "2017-11-26 18:46:11 CET");
        map1.put("docdir", "");
        map1.put("doctime", "18:46:11 CET");
        map1.put("doctitle", "My page");
        map1.put("doctype", "article");
        map1.put("doctype-article", "");
        map1.put("docyear", "2017");
        map1.put("embedded", "");
        map1.put("example-caption", "Example");
        map1.put("figure-caption", "Figure");
        map1.put("filetype", "html");
        map1.put("filetype-html", "");
        map1.put("htmlsyntax", "html");
        map1.put("iconfont-remote", "");
        map1.put("iconsdir", "./images/icons");
        map1.put("important-caption", "Important");
        map1.put("last-update-label", "Last updated");
        map1.put("linkcss", "");
        map1.put("localdate", "2017-11-26");
        map1.put("localdatetime", "2017-11-26 18:46:11 CET");
        map1.put("localtime", "18:46:11 CET");
        map1.put("localyear", "2017");
        map1.put("manname-title", "NAME");
        map1.put("max-attribute-value-size", "4096");
        map1.put("max-include-depth", "64");
        map1.put("note-caption", "Note");
        map1.put("notitle", "");
        map1.put("outfilesuffix", ".html");
        map1.put("prewrap", "");
        map1.put("safe-mode-level", "20");
        map1.put("safe-mode-name", "secure");
        map1.put("safe-mode-secure", "");
        map1.put("sectids", "");
        map1.put("section-refsig", "Section");
        map1.put("stylesdir", ".");
        map1.put("stylesheet", "");
        map1.put("table-caption", "Table");
        map1.put("tip-caption", "Tip");
        map1.put("toc-placement", "auto");
        map1.put("toc-title", "Table of Contents");
        map1.put("untitled-label", "Untitled");
        map1.put("user-home", ".");
        map1.put("version-label", "Version");
        map1.put("warning-caption", "Warning");
        map1.put("webfonts", "");
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        when(mockStructuredDocument1.getHeader()).thenReturn(mockDocumentHeader1);
        return mockStructuredDocument1;
    }
    // end::generated-code[]
}
