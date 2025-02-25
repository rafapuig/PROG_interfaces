package guidelines.strategy.interfaces;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Pato Mallard");
    }

    // Implementamos el comportamiento volar en la clase MallardDuck
    /*@Override
    public void fly() {
        System.out.println("Pato volando...");
    }*/
}
