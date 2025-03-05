package exercises.decorator.labeling;

public class EllipsedDecorator extends LabelDecorator {

    private String ellipse = "...";
    private final int width;

    public EllipsedDecorator(Label label, int width) {
        super(label);
        this.width = Math.max(width, ellipse.length());
    }

    @Override
    public String getText() {
        if(label.getText().length() > width) {
            return label.getText().substring(0, width - ellipse.length()) + ellipse;
        }
        return label.getText();
    }
}
