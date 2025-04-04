package guidelines.strategy.dynamic;

public abstract class Duck {

    // Composición
    protected QuackBehavior quackBehavior = new Quack(); // Tiene una forma de hace quack
    protected FlyBehavior flyBehavior = new FlyWithWings(); // Tiene una forma de volar

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

    // El metodo quack delega en su componente quackBehavior
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
