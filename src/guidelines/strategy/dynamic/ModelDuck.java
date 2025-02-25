package guidelines.strategy.dynamic;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Pato modelo");
    }
}
