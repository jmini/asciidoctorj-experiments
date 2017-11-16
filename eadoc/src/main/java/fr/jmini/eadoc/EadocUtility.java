package fr.jmini.eadoc;

import java.util.List;
import java.util.stream.Collectors;

import org.asciidoctor.ast.ContentPart;
import org.eclipse.emf.common.util.EList;

public class EadocUtility {

    public static EContentPart convertContentPart(ContentPart contentPart) {
        EContentPart eContentPart = EadocFactory.eINSTANCE.createEContentPart();
        eContentPart.setId(contentPart.getId());
        eContentPart.setLevel(contentPart.getLevel());
        eContentPart.setContext(contentPart.getContext());
        eContentPart.setStyle(contentPart.getStyle());
        eContentPart.setRole(contentPart.getRole());
        eContentPart.setTitle(contentPart.getTitle());
        eContentPart.setAttributes(contentPart.getAttributes());
        convertAndAddAllContentPart(eContentPart.getParts(), contentPart.getParts());
        return eContentPart;
    }

    public static void convertAndAddAllContentPart(EList<EContentPart> eList, List<? extends ContentPart> parts) {
        if (parts != null) {
            List<EContentPart> items = parts.stream().map(EadocUtility::convertContentPart).collect(Collectors.toList());
            eList.addAll(items);
        }
    }
}
