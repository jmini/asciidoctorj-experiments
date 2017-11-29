package fr.jmini.asciidoctorj.converter.code;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.asciidoctor.ast.ContentNode;
import org.asciidoctor.converter.AbstractConverter;

public abstract class AbstractCodeConverter extends AbstractConverter<String> {

    private AbstractCodeGenerator generator;

    public AbstractCodeConverter(String backend, Map<String, Object> opts) {
        super(backend, opts);
        this.generator = createGenerator();
    }

    protected abstract AbstractCodeGenerator createGenerator();

    @Override
    public String convert(ContentNode node, String transform, Map<Object, Object> o) {
        StringBuilder sb = new StringBuilder();
        generator.createContentNodeCode(sb, node);
        return sb.toString();
    }

    @Override
    public void write(String content, OutputStream out) throws IOException {
        if (content != null) {
            try (PrintWriter p = new PrintWriter(out)) {
                p.println("content");
            }
        }
    }

}
