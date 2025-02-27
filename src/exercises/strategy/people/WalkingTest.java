package exercises.strategy.people;

import exercises.strategy.people.walk.WalkCrawling;
import exercises.strategy.people.walk.WalkLeaningOnCrane;
import exercises.strategy.people.walk.WalkUpright;
import exercises.strategy.people.walk.WalkWithCrutches;

public class WalkingTest {

    public static void main(String[] args) {

        WalkBehavior walkUpright = new WalkUpright();

        Person pepe = new Person("Pepe", walkUpright);
        Person luis = new Person("Luis", new WalkLeaningOnCrane());
        Person jose = new Person("Jose", new WalkCrawling());

        letItWalk(pepe);
        letItWalk(luis);
        letItWalk(jose);

        // Pepe se ha torcido el tobillo, ahora tiene que cambiar su estrategia para caminar
        pepe.setWalkBehavior(new WalkWithCrutches());
        letItWalk(pepe);

        // Jose crece y ya camina erguido
        jose.setWalkBehavior(walkUpright);
        letItWalk(jose);
    }

    static void letItWalk(Walkable walkable) {
        walkable.walk();
    }

}
