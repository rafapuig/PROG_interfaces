package guidelines.strategy.interfaces;

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
    }

    static void testDuck(Duck duck) {
        duck.display();
        duck.swim();

        //duck.quack();
        if (duck instanceof Quackable quackable) {
            quackable.quack();
        }

        //duck.fly();
        if(duck instanceof Flyable flyable) {
            flyable.fly();
        }

    }

}
