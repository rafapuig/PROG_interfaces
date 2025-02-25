package guidelines.strategy.interfaces;

public interface Quackable {
    // El pato hace quack
    default void quack() {
        System.out.println("Pato hace Quack");
    }
}
