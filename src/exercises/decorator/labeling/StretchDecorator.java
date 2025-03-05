package exercises.decorator.labeling;

import java.util.StringJoiner;

public class StretchDecorator extends LabelDecorator {

    public StretchDecorator(Label label) {
        super(label);
    }

    @Override
    public String getText() {
        StringJoiner sj = new StringJoiner(" ");
        for (char c : label.getText().toCharArray()) {
            sj.add(String.valueOf(c));
        }
        return sj.toString();
    }
}
