package exercises.flying;

public class Airplane implements Flyable {

    public void land() {
        System.out.println("Avión aterrizando...");
    }

    public void takeoff() {
        System.out.println("Avión despegando...");
    }

    // Método heredado de la interface Flyable
    @Override
    public void fly() {
        System.out.println("Avión volando...");
    }
}
