package exercises.strategy.people;

public interface Walkable {

    void walk();

    default void walk(WalkBehavior walkBehavior) {
        walkBehavior.walk();
    }

}
