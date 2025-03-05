package exercises.decorator.labeling;

public class UpperCaseDecorator extends LabelDecorator {

    public UpperCaseDecorator(Label label) {
        super(label);
    }

    @Override
    public String getText() {
        return label.getText().toUpperCase();
    }

}
