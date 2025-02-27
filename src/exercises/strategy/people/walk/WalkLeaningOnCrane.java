package exercises.strategy.people.walk;

import exercises.strategy.people.WalkBehavior;

public class WalkLeaningOnCrane implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("Caminar apoyandose con un baston");
    }
}
