package exercises.decorator.labeling;

public class LabelDemo {

    public static void main(String[] args) {

        TextLabel label = new TextLabel("Patroncita es la mejor");
        Label upperLabel = new UpperCaseDecorator(label);
        Label stretchedLabel = new StretchDecorator(upperLabel);
        Label ellipsedLabel = new EllipsedDecorator(stretchedLabel, 40);

        Label coloredLabel = new ColorDecorator(ellipsedLabel, ConsoleColors.YELLOW_BOLD);
        Label boxedLabel = new BoxedDecorator(coloredLabel);

        System.out.println(label);
        System.out.println(upperLabel);
        System.out.println(stretchedLabel);
        System.out.println(ellipsedLabel);
        System.out.println(coloredLabel);
        System.out.println(boxedLabel);

        label.setText("la cagada monumental");
        System.out.println(label);
        System.out.println(upperLabel);
        System.out.println(stretchedLabel);
        System.out.println(ellipsedLabel);
        System.out.println(coloredLabel);
        System.out.println(boxedLabel);


        //System.out.println(boxedLabel);
    }
}
