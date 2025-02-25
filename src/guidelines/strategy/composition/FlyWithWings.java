package guidelines.strategy.composition;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Volar moviendo las alas...");
    }
}
