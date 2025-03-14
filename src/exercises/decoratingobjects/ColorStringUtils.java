package exercises.decoratingobjects;

import lombok.experimental.ExtensionMethod;
import org.junit.jupiter.api.Test;


public class ColorStringUtils {

    private static final String BACKGROUND_COLOR_REGEX = ".*(\033\\[\\d{2}m|\033\\[\\d{1};\\d{3}m).*";


    /**
     * Indica si el texto tiene color de fondo
     */
    public static boolean isBackgroundColored(String text) {
        return text.matches(BACKGROUND_COLOR_REGEX);
    }

    /**
     * Obtiene el color de fondo
     */
    public static String getBackgroundColor(String text) {
        return text.replaceAll(BACKGROUND_COLOR_REGEX, "$1");
    }


    /**
     * Indica si el texto tiene color
     */
    public static boolean isColored(String text) {
        String regex = ".*\033\\[\\d{1};\\d{2}m.*";
        return text.matches(regex);
    }

    /**
     * Obtiene el color del texto
     */
    public static String getColor(String text) {
        String regex = ".*(\033\\[\\d{1};\\d{2}m).*";
        return text.replaceAll(regex, "$1");
    }


    /**
     * Indica si el texto contiene información de color
     */
    public static boolean containsColorInfo(String text) {
        String regex = ".*\033\\[(\\d{1};)?\\d{2,3}m.*";
        return text.matches(regex);
    }

    /**
     * Devuelve la longitud real que ocupa en la consola el texto
     */
    public static int printedLength(String text) {
        if (!containsColorInfo(text)) return text.length();

        int count = 0;
        boolean parsingColorInfo = false;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (!parsingColorInfo && ch == ConsoleColors.RESET.charAt(0)) {
                parsingColorInfo = true;
                continue;
            }
            if (parsingColorInfo) {
                if (ch == 'm') parsingColorInfo = false;
                continue;
            }
            count++;
        }
        return count;
    }

    /**
     * Devuelve la longitud de los caracteres extra que añade la información para colorear el texto
     */
    public static int coloredMarkupLength(String text) {
        if (!containsColorInfo(text)) return 0;
        return text.length() - printedLength(text);
    }

    /**
     * Devuelve la longitud del string de marcado de color prefijo de la cadena de texto
     */
    public static int colorMarkupLength(String text) {
        if (!containsColorInfo(text)) return 0;
        return text.length() - printedLength(text) - ConsoleColors.RESET.length();
    }


    /**
     * Devuelve el ancho necesario a tener en cuenta para una cadena si además tiene marcado de color
     * a partir del ancho que se quiere conseguir en la cadena imprimida en la consola
     */
    public static int targetWidth(String text, int width) {
        return width + coloredMarkupLength(text);
    }

    public static String startAligned(String text, int width) {
        return String.format("%-" + targetWidth(text, width) + "s", text);
    }

    public static String endAligned(String text, int width) {
        return String.format("%" + targetWidth(text, width) + "s", text);
    }

    public static String centerAligned(String text, int width) {

        int targetWidth = targetWidth(text, width);

        int printedLength = printedLength(text);
        int padding = width - printedLength;
        int paddingLeft = padding / 2;

        return String.format("%-" + targetWidth + "s",
                String.format("%" + (paddingLeft + text.length()) + "s",
                        text));
    }


    public static final String ELLIPSIS = "...";

    public static String ellipsed(String text, int width) {

        int printedWidth = Math.max(width, ELLIPSIS.length());

        int totalLength = text.length();

        boolean isColored = containsColorInfo(text);

        int printedLength = isColored ? printedLength(text) : totalLength;

        if (printedLength > printedWidth) {
            int coloringMarkupLength = totalLength - printedLength; // Caracteres extra por tener color
            int colorMarkupLength = coloringMarkupLength - (isColored ? ConsoleColors.RESET.length() : 0);
            int length = printedWidth - ELLIPSIS.length() + colorMarkupLength; // longitud impresa + marcado de color
            return text.substring(0, length) + ELLIPSIS + (isColored ? ConsoleColors.RESET : "");
        }
        return text;
    }

    public static String ellipsed2(String text, int width) {

        int printedWidth = Math.max(width, ELLIPSIS.length());
        int totalLength = text.length();
        System.out.println("Total length: " + totalLength);
        System.out.println("Printed length: " + printedLength(text));

        int targetWidth = targetWidth(text, printedWidth);
        System.out.println("Target width: " + targetWidth);

        if (totalLength > targetWidth) {
            int ellipsisLength = ELLIPSIS.length();
            int length = targetWidth - ellipsisLength;
            return text.substring(0, length) +
                    ELLIPSIS +
                    (isColored(text) ? ConsoleColors.RESET : "");
        }
        return text;
    }

    public static String subColoredString(String text, int beginIndex, int endIndex) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        int num = beginIndex;
        int length = endIndex - beginIndex;
        boolean parsingColorInfo = false;
        while (count < length) {
            char ch = text.charAt(num);
            builder.append(ch);
            num++;
            if (!parsingColorInfo && ch == ConsoleColors.RESET.charAt(0)) {
                parsingColorInfo = true;
                continue;
            }
            if (parsingColorInfo) {
                if (ch == 'm') parsingColorInfo = false;
                continue;
            }
            count++;
        }
        return builder.toString();
    }

    public static String ellipsed3(String text, int width) {

        int printedWidth = Math.max(width, ELLIPSIS.length());
        int totalLength = text.length();
        System.out.println("Total length: " + totalLength);
        System.out.println("Printed length: " + printedLength(text));

        int targetWidth = targetWidth(text, printedWidth);
        System.out.println("Target width: " + targetWidth);

        if (totalLength > targetWidth) {
            int ellipsisLength = ELLIPSIS.length();
            String substring = subColoredString(text,0, printedWidth - ellipsisLength);
            return substring + ELLIPSIS + (containsColorInfo(text) ? ConsoleColors.RESET : "");
        }
        return text;
    }

    public static String removeAllResets(String text) {
        String regex = "\033\\[0m";
        return text.replaceAll(regex, "");
    }

    public static String colored(String text, String color) {
        return color + removeAllResets(text) + ConsoleColors.RESET;
        // + (!isColored(text) ? ConsoleColors.RESET : "");
    }

    public static int lengthWithoutReset(String text) {
        return containsColorInfo(text) ? text.length() - ConsoleColors.RESET.length() : text.length();
    }

    public static String concat(String text1, String text2) {

        boolean isColored1 = containsColorInfo(text1);
        boolean isColored2 = containsColorInfo(text2);

        int length1 = lengthWithoutReset(text1);
        int length2 = lengthWithoutReset(text2);

        return text1.substring(0, length1) + text2.substring(0, length2)
                + ((isColored1 || isColored2) ? ConsoleColors.RESET : "");
    }

}



@ExtensionMethod(ColorStringUtils.class)
class ColorStringUtilsTest {

    @Test
    public void testColored() {
        String text = "Hola mundo";

        System.out.println(text);

        text = text.colored(ConsoleColors.GREEN_UNDERLINED);

        System.out.println(text);

        text = text.colored(ConsoleColors.RED_BACKGROUND);

        System.out.println(text);


        text = text.ellipsed2(8);
        System.out.println(text);

        //text = text.colored(ConsoleColors.YELLOW_BACKGROUND_BRIGHT);

        text = text.centerAligned(25);


        System.out.println("-" + text + "-");

        String text2 = "Adios";

        text2 = text2.colored(ConsoleColors.YELLOW_BOLD_BRIGHT);

        text = text + text2;

        System.out.println(text);

        text = text.centerAligned(70);

        System.out.println("-" + text + "-");

    }

    @Test
    public void testColored2() {
        String text1 = "Hola";
        String text2 = "Mundo";

        text1 = text1.colored(ConsoleColors.YELLOW_BOLD_BRIGHT);
        text2 = text2.colored(ConsoleColors.GREEN_BOLD_BRIGHT);

        String text = text1 + "<> " + text2; //text1.concat(" <> ").concat(text2);

        System.out.println(text);

        text = text.centerAligned(17);
        System.out.println("-" + text + "-");

        text = text.colored(ConsoleColors.BLUE_BACKGROUND);
        System.out.println(text);
        System.out.println("-" + text + "-");
    }

    @Test
    public void testGetBackgroundColor() {
        String text = "Hola";
        text = text.colored(ConsoleColors.YELLOW_BACKGROUND);
        System.out.println(text);
        String backcolor = text.getBackgroundColor();
        System.out.println(backcolor.equals(ConsoleColors.YELLOW_BACKGROUND));
        System.out.println(backcolor.length());
        System.out.println(text.isBackgroundColored());
    }

    @Test
    public void testGetColor() {
        String text = "Hola";
        text = text.colored(ConsoleColors.YELLOW_BOLD_BRIGHT);
        text = text.colored(ConsoleColors.BLUE_BACKGROUND);
        System.out.println(text);
        String color = text.getColor();
        System.out.println(color.equals(ConsoleColors.YELLOW_BOLD_BRIGHT));
        System.out.println(color.length());
    }

    @Test
    public void testMultiple() {
        String text1 = "Hola";
        String text2 = "Mundo";
        text1 = text1.colored(ConsoleColors.GREEN_BOLD_BRIGHT);
        text2 = text2.colored(ConsoleColors.YELLOW_BOLD_BRIGHT);

        System.out.println(text1);
        System.out.println(text2);

        String text = text1 + " " + text2;
        System.out.println(text);

        //text = text.centerAligned(20);
        System.out.println("->" + text + "<-");

        text = text.colored(ConsoleColors.PURPLE_BACKGROUND);
        System.out.println("->" + text + "<-");

        text = text.ellipsed3(9);
        text = text.centerAligned(20);
        //text = text.colored(ConsoleColors.PURPLE_BACKGROUND);
        System.out.println("->" + text + "<-");

    }

}
