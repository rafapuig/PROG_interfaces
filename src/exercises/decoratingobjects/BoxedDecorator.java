package exercises.decoratingobjects;

public class BoxedDecorator extends ObjectDecorator {

    public static final char topLeft = '┌';
    public static final char topRight = '┐';
    public static final char bottomLeft = '└';
    public static final char bottomRight = '┘';

    public BoxedDecorator(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        String text = object.toString();
        int length = ColorStringUtils.printedLength(text);
        String top = "─".repeat(length);
        return topLeft + top + topRight + "\n" + "│" + text + "│\n" + bottomLeft + top + bottomRight;
    }
}
