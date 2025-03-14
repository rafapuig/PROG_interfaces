package exercises.decoratingobjects;

public class LabelDemo {

    public static void main(String[] args) {

        Label label = new Label("Patroncita es la mejor");

        Object upperLabel = new UpperCaseDecorator(label);
        Object stretchedLabel = new StretchDecorator(upperLabel);
        Object ellipsedLabel = new EllipsedDecorator(stretchedLabel, 40);
        Object coloredLabel = new ColorDecorator(ellipsedLabel, ConsoleColors.CYAN_BOLD_BRIGHT);
        Object centeredLabel = new AlignmentDecorator(coloredLabel, 70, AlignmentDecorator.Alignment.CENTER);
        Object boxedLabel = new BoxedDecorator(centeredLabel);

        System.out.println(label);
        System.out.println(upperLabel);
        System.out.println(stretchedLabel);
        System.out.println(ellipsedLabel);
        System.out.println(coloredLabel);
        System.out.println(centeredLabel);
        System.out.println(boxedLabel);

        label.setText("la cagada monumental");
        System.out.println(label);
        System.out.println(upperLabel);
        System.out.println(stretchedLabel);
        System.out.println(ellipsedLabel);
        System.out.println(coloredLabel);
        System.out.println(centeredLabel);
        System.out.println(boxedLabel);




        //System.out.println(boxedLabel);
    }
}
