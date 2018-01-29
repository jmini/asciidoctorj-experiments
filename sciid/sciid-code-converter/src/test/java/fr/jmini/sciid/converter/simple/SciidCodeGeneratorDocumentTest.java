package fr.jmini.sciid.converter.simple;

import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SDocument;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document document = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, document);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SDocument createSciidObject() {
        SDocument sDocument1 = SciidFactory.eINSTANCE.createSDocument();
        sDocument1.setId(null);
        sDocument1.setNodeName(null);
        sDocument1.setContext(null);
        sDocument1.setDocument(null);
        sDocument1.setInline(false);
        sDocument1.setBlock(false);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("three", 3)
                .put("two", 2)
                .build();
        sDocument1.setAttributes(map1);
        sDocument1.setRoles(Collections.emptyList());
        sDocument1.setReftext(null);
        sDocument1.setCaption(null);
        sDocument1.setTitle(null);
        sDocument1.setStyle(null);
        sDocument1.setLevel(0);
        sDocument1.setContentModel(null);
        sDocument1.setSourceLocation(null);
        sDocument1.setStructuredDoctitle(null);
        sDocument1.setDoctitle("this is a doc title");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("ipsum", false)
                .put("lorem", true)
                .build();
        sDocument1.setOptions(map2);
        return sDocument1;
    }
    // end::generated-code[]
}
