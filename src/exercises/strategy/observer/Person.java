package exercises.strategy.observer;

import java.util.Random;

public class Person implements OnHungryListener {

    static Random rand = new Random();

    private static final String[] foods = new String[]{"paté", "pienso", "atún", "gelatinas", "leche"};

    private static String getRandomFood() {
        int randomIndex = rand.nextInt(foods.length);
        return foods[randomIndex];
    }

    String name;
    Cat cat;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    void adopt(Cat cat) {
        this.cat = cat;
        cat.setOnHungryListener(this);

        //cat.setOnHungry( feedable -> onHungry(feedable));
        //cat.setOnHungry(this::onHungry);
    }

    @Override
    public void onHungry(Feedable feedable) {
        String food = getRandomFood();
        feed(feedable, food);
    }

    private void feed(Feedable feedable, String food) {
        System.out.println(name + " dando de comer " + food + " a " + feedable + " ...");
        feedable.eat(food);
    }
}
