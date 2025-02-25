package exercises.flying;

public class Bird implements Flyable {

    public void peck() {
        System.out.println("Pajaro picando con su pico");
    }

    @Override
    public void fly() {
        System.out.println("Pajaro volando");
    }
}
