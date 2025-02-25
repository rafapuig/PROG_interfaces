package guidelines.strategy.dynamic;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Incapaz de volar");
    }
}
