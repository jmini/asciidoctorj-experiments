package fr.jmini.sciid.converter.simple;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.sciid.SBlock;
import fr.jmini.sciid.SciidFactory;
import fr.jmini.sciid.converter.SciidCodeGenerator;

public class SciidCodeGeneratorBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block block = createSciidObject();

        SciidCodeGenerator generator = new SciidCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createBlockCode(sb, block);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public SBlock createSciidObject() {
        SBlock sBlock1 = SciidFactory.eINSTANCE.createSBlock();
        sBlock1.setId("block-id");
        sBlock1.setNodeName("some-name");
        sBlock1.setContext(null);
        sBlock1.setDocument(null);
        sBlock1.setInline(false);
        sBlock1.setBlock(false);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", "lorem")
                .put("two", "ipusm")
                .build();
        sBlock1.setAttributes(map1);
        sBlock1.setRoles(Arrays.asList("r1", "r2"));
        sBlock1.setReftext(null);
        sBlock1.setCaption("some-caption");
        sBlock1.setTitle("some-title");
        sBlock1.setStyle(null);
        sBlock1.setLevel(0);
        sBlock1.setContentModel(null);
        sBlock1.setSourceLocation(null);
        sBlock1.setLines(Collections.emptyList());
        sBlock1.setSource(null);
        return sBlock1;
    }
    // end::generated-code[]
}
