package exercises.strategy.people.walk;

import exercises.strategy.people.WalkBehavior;

public class WalkWithCrutches implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("Caminar con muletas");
    }
}
