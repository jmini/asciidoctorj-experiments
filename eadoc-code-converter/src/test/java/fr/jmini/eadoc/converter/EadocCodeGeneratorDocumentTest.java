package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.Document;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EDocument;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorDocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document eDocument = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createDocumentCode(sb, eDocument);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EDocument createEadoc() {
        EDocument eDocument1 = EadocFactory.eINSTANCE.createEDocument();
        eDocument1.setId(null);
        eDocument1.setNodeName(null);
        eDocument1.setContext(null);
        eDocument1.setDocument(null);
        eDocument1.setInline(false);
        eDocument1.setBlock(false);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", 1)
                .put("two", 2)
                .put("three", 3)
                .build();
        eDocument1.setAttributes(map1);
        eDocument1.setRoles(Collections.emptyList());
        eDocument1.setReftext(null);
        eDocument1.setTitle(null);
        eDocument1.setStyle(null);
        eDocument1.setLevel(0);
        eDocument1.setContentModel(null);
        eDocument1.setSourceLocation(null);
        eDocument1.setStructuredDoctitle(null);
        eDocument1.setDoctitle("this is a doc title");
        ImmutableMap<Object, Object> map2 = ImmutableMap.<Object, Object>builder()
                .put("lorem", true)
                .put("ipsum", false)
                .build();
        eDocument1.setOptions(map2);
        return eDocument1;
    }
    // end::generated-code[]
}
