package exercises.strategy.people;

public class Person implements Walkable {

    private final String name;
    private WalkBehavior walkBehavior;

    public Person(String name, WalkBehavior initialWalkBehavior) {
        this.name = name;
        this.walkBehavior = initialWalkBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    @Override
    public void walk() {
        System.out.print(name + ": ");
        walkBehavior.walk(); // Delega en el objeto comportamiento
    }
}
