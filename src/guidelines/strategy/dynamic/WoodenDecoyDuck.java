package guidelines.strategy.dynamic;

/**
 * Pato señuelo de madera (no puede hacer quack ni volar
 */
public class WoodenDecoyDuck extends Duck {

    public WoodenDecoyDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Pato señuelo de madera");
    }

}
