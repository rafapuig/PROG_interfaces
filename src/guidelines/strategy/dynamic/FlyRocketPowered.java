package guidelines.strategy.dynamic;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Volando impulsado por un cohete...");
    }
}
