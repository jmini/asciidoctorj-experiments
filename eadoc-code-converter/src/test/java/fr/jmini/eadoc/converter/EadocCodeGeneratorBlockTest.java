package fr.jmini.eadoc.converter;

import java.util.Arrays;
import java.util.Collections;

import org.asciidoctor.ast.Block;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.EBlock;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorBlockTest {

    @Test
    public void testBlock() throws Exception {
        Block eBlock = createEadoc();

        EadocCodeGenerator generator = new EadocCodeGenerator();
        StringBuilder sb = new StringBuilder();
        generator.createBlockCode(sb, eBlock);
        CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
    }

    // tag::generated-code[]
    public EBlock createEadoc() {
        EBlock eBlock1 = EadocFactory.eINSTANCE.createEBlock();
        eBlock1.setId("block-id");
        eBlock1.setNodeName("some-name");
        eBlock1.setContext(null);
        eBlock1.setDocument(null);
        eBlock1.setInline(false);
        eBlock1.setBlock(false);
        ImmutableMap<String, Object> map1 = ImmutableMap.<String, Object>builder()
                .put("one", "lorem")
                .put("two", "ipusm")
                .build();
        eBlock1.setAttributes(map1);
        eBlock1.setRoles(Arrays.asList("r1", "r2"));
        eBlock1.setReftext(null);
        eBlock1.setTitle("some-title");
        eBlock1.setStyle(null);
        eBlock1.setLevel(0);
        eBlock1.setContentModel(null);
        eBlock1.setSourceLocation(null);
        eBlock1.setLines(Collections.emptyList());
        eBlock1.setSource(null);
        return eBlock1;
    }
    // end::generated-code[]
}
