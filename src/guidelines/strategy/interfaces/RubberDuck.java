package guidelines.strategy.interfaces;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("Patito de goma");
    }


    // Reimplementa la implementación predeterminada del metodo default
    @Override
    public void quack() {
        System.out.println("Patito de goma pitando.");
    }

    /*@Override
    public void fly() {
        // No hacer nada
    }*/
}
