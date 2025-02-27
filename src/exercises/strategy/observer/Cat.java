package exercises.strategy.observer;

public class Cat implements FeedableWithEvent {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    private OnHungryListener onHungryListener;

    @Override
    public void setOnHungryListener(OnHungryListener onHungry) {
        this.onHungryListener = onHungry;
    }

    public void hungry() {
        System.out.println(name + " tiene hambre...");
        if (onHungryListener != null) {
            onHungryListener.onHungry(this);
        }
    }

    @Override
    public void eat(String food) {
        System.out.println("Comiendo " + food +" ...");
    }


}
