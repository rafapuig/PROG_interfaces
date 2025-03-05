package exercises.decorator.labeling;

public class TextLabel implements Label {

    private String text;

    public TextLabel() {
    }

    public TextLabel(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
