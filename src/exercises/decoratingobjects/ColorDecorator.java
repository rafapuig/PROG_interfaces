package exercises.decoratingobjects;



public class ColorDecorator extends ObjectDecorator {

    String color;

    public ColorDecorator(Object object, String color) {
        super(object);
        this.color = color;
    }

    @Override
    public String toString() {
        return color + object + ConsoleColors.RESET;
    }
}
