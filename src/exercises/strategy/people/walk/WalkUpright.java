package exercises.strategy.people.walk;

import exercises.strategy.people.WalkBehavior;

/**
 * Caminar erguido
 */
public class WalkUpright implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("Caminando erguido...");
    }
}
