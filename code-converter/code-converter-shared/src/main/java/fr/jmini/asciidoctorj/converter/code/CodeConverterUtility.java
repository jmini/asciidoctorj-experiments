package fr.jmini.asciidoctorj.converter.code;

import org.asciidoctor.ast.Table.HorizontalAlignment;
import org.asciidoctor.ast.Table.VerticalAlignment;

public class CodeConverterUtility {

    public static String convertBoolean(Boolean value) {
        if (value == null) {
            return "null";
        }
        return value.toString();
    }

    public static String convertInt(Integer value) {
        if (value == null) {
            return "null";
        }
        return value.toString();
    }

    public static String convertLong(Long value) {
        if (value == null) {
            return "null";
        }
        return value.toString() + "L";
    }

    public static String convertDouble(Double value) {
        if (value == null) {
            return "null";
        }
        return value.toString();
    }

    public static String convertString(String value) {
        if (value == null) {
            return "null";
        }
        return "\"" + value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n\" +\n\"") + "\"";
    }

    public static String convertHorizontalAlignment(HorizontalAlignment value) {
        if (value == null) {
            return "null";
        }
        switch (value) {
        case LEFT:
            return "Table.HorizontalAlignment.LEFT";
        case CENTER:
            return "Table.HorizontalAlignment.CENTER";
        case RIGHT:
            return "Table.HorizontalAlignment.RIGHT";
        default:
            throw new IllegalArgumentException();
        }
    }

    public static String convertVerticalAlignment(VerticalAlignment value) {
        if (value == null) {
            return "null";
        }
        switch (value) {
        case TOP:
            return "Table.VerticalAlignment.TOP";
        case MIDDLE:
            return "Table.VerticalAlignment.MIDDLE";
        case BOTTOM:
            return "Table.VerticalAlignment.BOTTOM";
        default:
            throw new IllegalArgumentException();
        }
    }

    public static String convertObject(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof Boolean) {
            return convertBoolean((Boolean) value);
        }
        if (value instanceof Integer) {
            return convertInt((Integer) value);
        }
        if (value instanceof Long) {
            return convertLong((Long) value);
        }
        if (value instanceof Double) {
            return convertDouble((Double) value);
        }
        if (value instanceof HorizontalAlignment) {
            return convertHorizontalAlignment((HorizontalAlignment) value);
        }
        if (value instanceof VerticalAlignment) {
            return convertVerticalAlignment((VerticalAlignment) value);
        }
        return convertString(value.toString());
    }
}
