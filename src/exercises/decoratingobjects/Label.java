package exercises.decoratingobjects;

public class Label extends Object {

    private String text;

    public Label() {
    }

    public Label(String text) {
        this.text = text;
    }

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
