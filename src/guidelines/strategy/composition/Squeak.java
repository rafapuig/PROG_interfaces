package guidelines.strategy.composition;

public class Squeak implements  QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Pitando...");
    }
}
