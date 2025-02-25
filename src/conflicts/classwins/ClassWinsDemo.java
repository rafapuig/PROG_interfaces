package conflicts.classwins;

abstract class Employee {
    private double rate;

    public abstract void setRate(double rate);

    public double getRate() {
        return rate;
    }
}

abstract class Manager extends Employee implements CharitySinger {

    // Hereda
    // método CharitySinger.sing() abstracto
    // método default CharitySinger.setRate() abstracto
    // método default CharitySinger.getRate() abstracto
    // método Employee.setRate() abstracto <-- gana la superclase
    // método Employee.getRate() abstracto  <-- gana la superclase

}

public class ClassWinsDemo {
}
