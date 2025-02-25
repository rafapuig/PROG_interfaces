package guidelines.strategy.inhertance;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Patito de goma");
    }

    @Override
    public void quack() {
        System.out.println("Patito de goma pitando.");
    }

    @Override
    public void fly() {
        // No hacer nada
    }
}
