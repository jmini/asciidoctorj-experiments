package fr.jmini.eadoc.converter;

import java.util.Collections;

import org.asciidoctor.ast.Table;
import org.junit.Test;

import fr.jmini.asciidoctorj.converter.code.CodeTestingUtility;
import fr.jmini.eadoc.ETable;
import fr.jmini.eadoc.EadocFactory;

public class EadocCodeGeneratorTableTest {

  @Test
  public void testTable() throws Exception {
    Table eTable = createEadoc();

    EadocCodeGenerator generator = new EadocCodeGenerator();
    StringBuilder sb = new StringBuilder();
    generator.createTableCode(sb, eTable);
    CodeTestingUtility.testGeneratedCode(sb.toString(), this.getClass());
  }

  // tag::generated-code[]
  public ETable createEadoc() {
    ETable eTable1 = EadocFactory.eINSTANCE.createETable();
    eTable1.setId("id");
    eTable1.setNodeName("nn");
    eTable1.setContext("ctx");
    eTable1.setDocument(null);
    eTable1.setAttributes(Collections.emptyMap());
    eTable1.setRoles(Collections.emptyList());
    eTable1.setTitle(null);
    eTable1.setStyle(null);
    eTable1.setLevel(0);
    eTable1.setSourceLocation(null);
    eTable1.setHeaderOption(true);
    eTable1.setFrame("my-frame");
    eTable1.setGrid("my-grid");
    return eTable1;
  }
  // end::generated-code[]
}
