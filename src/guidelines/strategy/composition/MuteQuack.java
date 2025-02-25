package guidelines.strategy.composition;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silencio>>");
    }
}
