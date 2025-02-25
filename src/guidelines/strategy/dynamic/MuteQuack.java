package guidelines.strategy.dynamic;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silencio>>");
    }
}
