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

public class InheritanceDemo {
    public static void main(String[] args) {
        SingerWriter perales = new Melodist("Jose Luis Perales");
        perales.setRate(800.0);
        perales.write();
        perales.sing();
    }
}
