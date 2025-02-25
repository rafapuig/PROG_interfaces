package inheritance;

interface Singer {
    void sing();        // El trabajo que realiza

    void setRate(double rate);      // El coste mínimo por hora

    double getRate();
}

interface Writer {
    void write();

    void setRate(double rate);

    double getRate();
}

interface Player {
    void play();

    void setRate(double rate);

    default double getRate() { // Proporciona una implementación por defecto
        return 300.0;
    }
}

/**
 * Charity singers no cobran por cantar
 * Un CharitySinger es un Singer
 * Las clases que implementen CharitySinger solamente deben proporcionar la implementación de sing()
 * ya que heredan la implementación de setRate y getRate
 */
interface CharitySinger extends Singer {

    // Dado que un charity singer no cobra por cantar reemplaza los métodos setRate y getRate
    @Override
    default void setRate(double rate) {
        // No hacer nada
    }

    default double getRate() {
        return 0.0;
    }
}

/**
 * Un cantante y compositor al mismo tiempo
 */
interface SingerWriter extends Singer, Writer {
    // Cuantos métodos tiene esta interface?
    // Tres de Singer
    // Tres de Writer
    // setRate y getRate tienen la misma declaración en ambas superinterfaces y son abstractos
    // Esto no causa ningún problema, ya que son abstractos
    // La clase que implemente SingerWriter solamente tiene que proporcionar la implementación solo una vez
}

class Melodist implements SingerWriter {

    private String name;
    private double rate = 500.0;

    public Melodist(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(name + " esta cantando");
    }

    @Override
    public void write() {
        System.out.println(name + " esta escribiendo");
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getRate() {
        return this.rate;
    }
}

/**
 * Cantante que además juega con videojuegos
 */
interface SingerPlayer extends Singer, Player {
    //Hay conflicto entre las dos versiones heredadas del metodo getRate
    // de sSinger se hereda un método abstracto
    // de Writer se hereda un método con implementación por defecto
    // Combinación abstract-default

    // Una solucion es reimplementar el método
    // Podemos acceder a las versiones reemplazadas con el <nombre de la interfaz>.super
    @Override
    default double getRate() {
        double playerRate = Player.super.getRate();
        double singerRate = playerRate * 2.5;
        return playerRate + singerRate;
    }
}

interface CharitySingerPlayer extends CharitySinger, Player {
    //En este caso heredamos dos versiones con implementación por defecto del getRate --> default-default
    // y una abstracta y otra con implementación por defecto del setRate --> abstract-default


    // Llamar al método getRate() de la superinterface Player
    @Override
    default double getRate() {
        return Player.super.getRate();
    }

    // Reemplazarlo por un método abstracto
    @Override
    void setRate(double rate);
}







public class InheritanceDemo {
    public static void main(String[] args) {
        SingerWriter perales = new Melodist("Jose Luis Perales");
        perales.setRate(800.0);
        perales.write();
        perales.sing();
    }
}
