package fr.jmini.asciidoctorj.converter.assertcode;

import java.util.Map;

import org.asciidoctor.converter.ConverterFor;

import fr.jmini.asciidoctorj.converter.code.AbstractCodeConverter;
import fr.jmini.asciidoctorj.converter.code.AbstractCodeGenerator;

@ConverterFor("assert-code")
public class AssertCodeConverter extends AbstractCodeConverter {

    public AssertCodeConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    protected AbstractCodeGenerator createGenerator() {
        return new AssertCodeGenerator();
    }

}
