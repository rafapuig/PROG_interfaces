package exercises.strategy.people.walk;

import exercises.strategy.people.WalkBehavior;

/**
 * Gatear
 */
public class WalkCrawling implements WalkBehavior {

    @Override
    public void walk() {
        System.out.println("Gateando...");
    }
}
