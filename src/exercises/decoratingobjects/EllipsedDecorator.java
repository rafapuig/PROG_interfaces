package exercises.decoratingobjects;


import lombok.experimental.ExtensionMethod;

@ExtensionMethod(StringUtils.class)
public class EllipsedDecorator extends ObjectDecorator {

    private final String ellipse = "...";
    private final int width;

    public EllipsedDecorator(Object object, int width) {
        super(object);
        this.width = Math.max(width, ellipse.length());
    }

    @Override
    public String toString() {
        String text = object.toString();
        if(text.length() > width) {
            return text.substring(0, width - ellipse.length()) + ellipse;
        }
        return object.toString();
    }
}
