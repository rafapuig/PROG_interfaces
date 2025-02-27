package conflicts.mustoverride;

interface Singer {
    void sing();                    // El trabajo que realiza

    void setRate(double rate);      // El coste mínimo por hora

    default double getRate() {
        System.out.println("Llamada a Singer.getRate");
        return 200.0;
    }
}

interface Player {
    void play();

    void setRate(double rate);

    default double getRate() { // Proporciona una implementación por defecto
        System.out.println("Llamada a Player.getRate");
        return 300.0;
    }
}

abstract class Multitalented implements Singer, Player {
    public double getRate() {
        System.out.println("Llamada a Multitalented.getRate");
        double playerRate = Player.super.getRate();
        double singerRate = Singer.super.getRate();
        double rate = playerRate + singerRate;
        return rate;
    }
}


public class ClassMustOverideDemo {

    public static void main(String[] args) {
        Multitalented multitalented = new Multitalented() {
            @Override
            public void play() {

            }

            @Override
            public void sing() {

            }

            @Override
            public void setRate(double rate) {

            }
        };

        double rate = multitalented.getRate();
        System.out.println(rate);
    }

}
