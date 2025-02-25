package guidelines.strategy.dynamic;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Patito de goma");
    }

}
