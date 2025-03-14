package exercises.decoratingobjects;

public class UpperCaseDecorator extends ObjectDecorator {

    public UpperCaseDecorator(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        return object.toString().toUpperCase();
    }
}
