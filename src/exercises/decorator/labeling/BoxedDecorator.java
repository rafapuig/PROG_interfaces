package exercises.decorator.labeling;

public class BoxedDecorator extends LabelDecorator{

    public BoxedDecorator(Label label) {
        super(label);
    }

    @Override
    public String getText() {
        String text = label.getText();

        int count = 0;
        boolean parsingColorInfo = false;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            //System.out.println("->" + ch + "<--");

            if(!parsingColorInfo && ch == ConsoleColors.RESET.charAt(0)) {
               parsingColorInfo = true;
               continue;
            }
            if(parsingColorInfo) {
                if(ch == 'm') {
                    parsingColorInfo = false;
                }
                continue;
            }

            if (Character.isSpaceChar(ch) || Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) || ch == '-' || ch == '.') {
                //System.out.println("Counting...");
                //System.out.println(++count);
                count++;
            }
        }
        char topLeft = '┌';
        char topRight = '┐';
        char bottomLeft = '└';
        char bottomRight = '┘';
        String top = "─".repeat(count );
        return topLeft + top + topRight + "\n│" + text + "│\n" + bottomLeft+top+ bottomRight;
    }
}
