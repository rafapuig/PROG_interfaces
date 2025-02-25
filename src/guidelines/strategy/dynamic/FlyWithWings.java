package guidelines.strategy.dynamic;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Volar moviendo las alas...");
    }
}
