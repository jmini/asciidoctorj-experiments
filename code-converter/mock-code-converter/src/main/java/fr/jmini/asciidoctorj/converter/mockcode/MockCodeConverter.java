package fr.jmini.asciidoctorj.converter.mockcode;

import java.util.Map;

import org.asciidoctor.converter.ConverterFor;

import fr.jmini.asciidoctorj.converter.code.AbstractCodeConverter;
import fr.jmini.asciidoctorj.converter.code.AbstractCodeGenerator;

@ConverterFor("mock-code")
public class MockCodeConverter extends AbstractCodeConverter {

    public MockCodeConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
    }

    @Override
    protected AbstractCodeGenerator createGenerator() {
        return new MockCodeGenerator();
    }

}
