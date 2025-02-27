package exercises.strategy.observer;

import java.util.Random;

public class FeedingTest {

    static Random rand = new Random();

    public static void main(String[] args) {
        testPersonTakingCareOfACat();
        testFeedWithMilkAnonymous();

        handleFeedableHungry(new Cat("Doroteo"), FeedingTest::feedWithMilk);
        handleFeedableHungry(new Cat("Doroteo"), feedable -> feedWith(feedable,"paté"));
    }

    static void testFeedByPerson() {
        Cat cat = new Cat("Silvestre");
        Person person = new Person("Perico Palotes");

        cat.setOnHungryListener(person);
        cat.hungry();

        cat.setOnHungryListener(feedable -> person.onHungry(feedable));
        cat.setOnHungryListener(person::onHungry);
    }

    private static void testPersonTakingCareOfACat() {

        Cat mitu = new Cat("Mitu");
        Person rafa = new Person("Rafa");

        rafa.adopt(mitu);

        Runnable catLife = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(rand.nextInt(1000, 2000));
                    mitu.hungry();
                }
            } catch (Exception _) {
            }
        };

        catLife.run();
    }

    private static void testFeedWithMilkAnonymous() {

        Cat cat = new Cat("Isidoro");

        OnHungryListener feedWithMilk = new OnHungryListener() {
            @Override
            public void onHungry(Feedable feedable) {
                System.out.println("Alimentando con leche a " + feedable);
                feedable.eat("leche");
            }
        };

        cat.setOnHungryListener(feedWithMilk);
        cat.hungry();
    }


    private static void testFeedWithMilkLambda() {

        Cat cat = new Cat("Isidoro");

        OnHungryListener feedWithMilk = feedable -> {
            System.out.println("Alimentando con leche a " + feedable);
            feedable.eat("leche");
        };

        cat.setOnHungryListener(feedWithMilk);
        cat.hungry();
    }


    private static void feedWith(Feedable feedable, String food) {
        System.out.println("Alimentando con " + food + " a " + feedable);
        feedable.eat(food);
    }

    private static void feedWithMilk(Feedable feedable) {
        System.out.println("Alimentando a " + feedable + " con leche");
        feedable.eat("leche");
    }

    private static void testFeedWithMilkMethodReference() {

        Cat cat = new Cat("Isidoro");

        OnHungryListener feedWithMilk = FeedingTest::feedWithMilk;

        cat.setOnHungryListener(feedWithMilk);
        cat.hungry();
    }


    static void handleFeedableHungry(Feedable feedable, OnHungryListener onHungryListener) {
        onHungryListener.onHungry(feedable);
    }
}
