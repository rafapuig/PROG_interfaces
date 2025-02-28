package anonymous;

/**
 * Galo
 */
class Gaul {

    String name;
    int power = 10;


    protected Gaul(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Gaul(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void drinkPotion() {
        System.out.println(name + " bebiendo la poción mágica....");
        power = 1000;
        System.out.println("Su poder aumenta a " + power);
    }

}

public class AnonymousGaulDemo {

    public static void main(String[] args) {

        Gaul asterix = new Gaul("Asterix");
        Gaul obelix = new Gaul("Obelix", 1000) {
            @Override
            public void drinkPotion() {
                throw new UnsupportedOperationException(name + " no puede beber de la poción mágica");
            }
        };

        System.out.println(asterix + " tiene un poder de " + asterix.getPower());
        System.out.println(obelix + " tiene un poder de " + obelix.getPower());

        asterix.drinkPotion();
        try {
            obelix.drinkPotion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(asterix + " tiene un poder de " + asterix.getPower());
        System.out.println(obelix + " tiene un poder de " + obelix.getPower());

    }
}
