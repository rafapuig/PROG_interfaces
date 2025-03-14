package exercises.decoratingobjects;

public abstract class ObjectDecorator extends Object {

    protected Object object;

    public ObjectDecorator(Object object) {
        this.object = object;
    }

    @Override
    public abstract String toString();

}
