package guidelines.strategy.inhertance;

public abstract class Duck {

    // Todos los patos hacen quack y nadan
    // La clase base se hace cargo de la implementación

    // El pato hace quack
    public void quack() {
        System.out.println("Pato hace Quack");
    }

    // Nadar
    public void swim() {
        System.out.println("Pato nadando...");
    }

    // Cada subtipo de pato se ve diferente
    public abstract void display(); // Mostrar info


    // El problema está en que no podemos añadir el metodo fly
    // cuando todas las subclases no deberían poder volar
    public void fly() {
        System.out.println("Pato volando...");
    }

}
