package guidelines.strategy.dynamic;

public class SimuDuckDemo {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        testDuck(mallardDuck);
        testDuck(redheadDuck);

        Duck rubberDuck = new RubberDuck();
        testDuck(rubberDuck);

        Duck woodenDecoyDuck = new WoodenDecoyDuck();
        testDuck(woodenDecoyDuck);

        testDynamicFlyVBahavior();
    }

    static void testDuck(Duck duck) {
        duck.display();
        duck.swim();
        duck.fly();
        duck.quack();
    }

    static void testDynamicFlyVBahavior() {
        Duck model = new ModelDuck();

        model.fly();

        // Cambiar el comportamiento de manera dinámica
        model.setFlyBehavior(new FlyRocketPowered());

        model.fly();
    }

}
