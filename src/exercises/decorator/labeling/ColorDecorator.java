package exercises.decorator.labeling;

public class ColorDecorator extends LabelDecorator {

    String color;

    public ColorDecorator(Label label, String color) {
        super(label);
        this.color = color;
    }

    @Override
    public String getText() {
        return color + label.getText() + ConsoleColors.RESET;
    }
}
