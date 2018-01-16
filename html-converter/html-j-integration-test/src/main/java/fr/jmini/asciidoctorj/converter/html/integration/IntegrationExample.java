package fr.jmini.asciidoctorj.converter.html.integration;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.OptionsBuilder;

import fr.jmini.asciidoctorj.converter.html.HtmlConverter;

public class IntegrationExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // tag::integration-example[]
        String s = "= My page\n" +
                "\n" +
                "Some text\n";

        Asciidoctor asciidoctor = org.asciidoctor.Asciidoctor.Factory.create();
        asciidoctor.javaConverterRegistry()
                .register(HtmlConverter.class);

        OptionsBuilder optionsBuilder = org.asciidoctor.OptionsBuilder.options()
                .backend(HtmlConverter.ID);
        String output = asciidoctor.convert(s, optionsBuilder);

        System.out.println(output);
        // end::integration-example[]
    }

}
