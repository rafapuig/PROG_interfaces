package exercises.decorator.labeling;

public abstract class LabelDecorator implements Label {

    protected Label label;

    public LabelDecorator(Label label) {
        this.label = label;
    }

    public abstract String getText();

    @Override
    public String toString() {
        return getText();
    }

    //public abstract String toString();

}
