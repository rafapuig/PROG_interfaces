package guidelines.strategy.composition;

public abstract class Duck {

    protected QuackBehavior quackBehavior = new Quack();
    protected FlyBehavior flyBehavior = new FlyWithWings();

    // Nadar
    public void swim() {
        System.out.println("Pato nadando...");
    }

    // Cada subtipo de pato se ve diferente
    public abstract void display(); // Mostrar info

    // Delegación en los los objetos componentes

    // El metodo fly de la clase Duck delega en el objeto flyBehavior
    public void fly() {
        flyBehavior.fly();
    }

    // El metodo quack delega en el metodo quack del objeto quackBehavior
    public void quack() {
        quackBehavior.quack();
    }

}
