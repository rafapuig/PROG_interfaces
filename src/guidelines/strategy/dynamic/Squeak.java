package guidelines.strategy.dynamic;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Pitando...");
    }
}
