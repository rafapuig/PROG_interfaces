package exercises.decoratingobjects;

import java.util.StringJoiner;

public class StretchDecorator extends ObjectDecorator {

    public StretchDecorator(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        for (char c : object.toString().toCharArray()) {
            sj.add(String.valueOf(c));
        }
        return sj.toString();
    }
}
