package guidelines.strategy.interfaces;

public interface Flyable {

     default void fly() {
         System.out.println("Pato volando...");
     }

}
