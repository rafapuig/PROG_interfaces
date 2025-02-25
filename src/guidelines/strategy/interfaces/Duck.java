package guidelines.strategy.interfaces;

public abstract class Duck {

    // Nadar
    public void swim() {
        System.out.println("Pato nadando...");
    }

    // Cada subtipo de pato se ve diferente
    public abstract void display(); // Mostrar info

}
