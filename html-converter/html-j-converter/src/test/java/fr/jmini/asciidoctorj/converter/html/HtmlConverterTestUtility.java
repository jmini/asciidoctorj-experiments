package fr.jmini.asciidoctorj.converter.html;

import org.asciidoctor.ast.Document;

public class HtmlConverterTestUtility {

    public static String convertToHtml(Document astDocument) {
        HtmlConverter converter = new HtmlConverter(null, null);
        return converter.convert(astDocument, null, null);
    }

}
