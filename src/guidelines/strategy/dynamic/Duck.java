package guidelines.strategy.dynamic;

public abstract class Duck {

    protected QuackBehavior quackBehavior = new Quack();
    protected FlyBehavior flyBehavior = new FlyWithWings();

    // Nadar
    public void swim() {
        System.out.println("Pato nadando...");
    }

    // Cada subtipo de pato se ve diferente
    public abstract void display(); // Mostrar info

    // El metodo fly de la clase Duck delega en el objeto flyBehavior
    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }


    // Setters para cambiar el comportamiento de forma dinámica en tiempo de ejecución

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
