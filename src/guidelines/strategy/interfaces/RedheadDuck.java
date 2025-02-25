package guidelines.strategy.interfaces;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Pato Redhead");
    }

    // Implementamos el comportamiento volar en la clase RedheadDuck
   /* @Override
    public void fly() {
        System.out.println("Pato volando..."); // Mismo código otra vez!!!!
    }*/
}
