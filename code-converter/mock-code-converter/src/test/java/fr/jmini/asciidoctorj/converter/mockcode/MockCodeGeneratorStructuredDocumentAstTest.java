package fr.jmini.asciidoctorj.converter.mockcode;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.StructuredDocument;
import org.asciidoctor.ast.Title;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

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
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("appendix-caption", "Appendix")
                .put("appendix-refsig", "Appendix")
                .put("asciidoctor", "")
                .put("asciidoctor-version", "1.5.6.1")
                .put("attribute-missing", "skip")
                .put("attribute-undefined", "drop-line")
                .put("backend", "html5")
                .put("backend-html5", "")
                .put("backend-html5-doctype-article", "")
                .put("basebackend", "html")
                .put("basebackend-html", "")
                .put("basebackend-html-doctype-article", "")
                .put("caution-caption", "Caution")
                .put("chapter-refsig", "Chapter")
                .put("docdate", "2017-11-26")
                .put("docdatetime", "2017-11-26 18:46:11 CET")
                .put("docdir", "")
                .put("doctime", "18:46:11 CET")
                .put("doctitle", "My page")
                .put("doctype", "article")
                .put("doctype-article", "")
                .put("docyear", "2017")
                .put("embedded", "")
                .put("example-caption", "Example")
                .put("figure-caption", "Figure")
                .put("filetype", "html")
                .put("filetype-html", "")
                .put("htmlsyntax", "html")
                .put("iconfont-remote", "")
                .put("iconsdir", "./images/icons")
                .put("important-caption", "Important")
                .put("last-update-label", "Last updated")
                .put("linkcss", "")
                .put("localdate", "2017-11-26")
                .put("localdatetime", "2017-11-26 18:46:11 CET")
                .put("localtime", "18:46:11 CET")
                .put("localyear", "2017")
                .put("manname-title", "NAME")
                .put("max-attribute-value-size", "4096")
                .put("max-include-depth", "64")
                .put("note-caption", "Note")
                .put("notitle", "")
                .put("outfilesuffix", ".html")
                .put("prewrap", "")
                .put("safe-mode-level", "20")
                .put("safe-mode-name", "secure")
                .put("safe-mode-secure", "")
                .put("sectids", "")
                .put("section-refsig", "Section")
                .put("stylesdir", ".")
                .put("stylesheet", "")
                .put("table-caption", "Table")
                .put("tip-caption", "Tip")
                .put("toc-placement", "auto")
                .put("toc-title", "Table of Contents")
                .put("untitled-label", "Untitled")
                .put("user-home", ".")
                .put("version-label", "Version")
                .put("warning-caption", "Warning")
                .put("webfonts", "")
                .build();
        when(mockDocumentHeader1.getAttributes()).thenReturn(map1);
        when(mockStructuredDocument1.getHeader()).thenReturn(mockDocumentHeader1);
        return mockStructuredDocument1;
    }
    // end::generated-code[]
}
