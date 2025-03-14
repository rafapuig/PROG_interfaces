package exercises.decoratingobjects;

import lombok.experimental.ExtensionMethod;

@ExtensionMethod(ColorStringUtils.class)
public class AlignmentDecorator extends ObjectDecorator {

    public enum Alignment {START, CENTER, END}

    private final int width;
    private final Alignment alignment;

    public AlignmentDecorator(Object object, int width, Alignment alignment) {
        super(object);
        this.width = width;
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        String text = object.toString();
        return switch (alignment) {
            case START -> text.startAligned(width);
            case CENTER -> ColorStringUtils.centerAligned(object.toString(), width);
            case END -> ColorStringUtils.endAligned(object.toString(), width);
        };
    }
}
