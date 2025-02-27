package conflicts.classwins;

abstract class Employee {
    private double rate;

    public void setRate(double rate) {
        System.out.println("Estableciendo el rate desde Employee...");
        this.rate = rate;
    }

    public double getRate() {
        System.out.println("Devolviendo el rate desde CharitySinger ...");
        return rate;
    }
}

abstract class Manager extends Employee implements CharitySinger {

    // Hereda
    // método CharitySinger.sing() abstracto (no hay conflicto)

    // método default CharitySinger.setRate() default
    // método Employee.setRate() abstracto <-- gana la superclase

    // método default CharitySinger.getRate() abstracto
    // método Employee.getRate() abstracto  <-- gana la superclase
}

public class ClassWinsDemo {

    public static void main(String[] args) {
        Manager manager = new Manager() {
            @Override
            public void sing() {
                System.out.println("Cantando ...");
            }
        };

        testManager(manager);
    }

    static void testManager(Manager manager) {
        manager.sing();
        manager.setRate(0.5); // Llama a la version de la superclase Employee
        double rate = manager.getRate(); // Llama a la version de la superclase Employee
    }
}
