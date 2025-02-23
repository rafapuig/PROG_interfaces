package intro;

import intro.badsolutions.Duck;
import intro.badsolutions.Person;
import intro.badsolutions.Walkables;

public class WalkablesTest {

    public static void main(String[] args) {
        testWalkablePersonsAndDucks();
        testWalkablePersonsDucksAndCats();
    }

    private static void testWalkablePersonsAndDucks() {
        Object[] walkables = new Object[3];
        walkables[0] = new Person("Perico Palotes");
        walkables[1] = new Duck("Pato Donald");
        walkables[2] = new Person("Belen Tilla");

        // Hacer que todos los objetos caminen
        Walkables.letThemWalk(walkables);
    }

    private static void testWalkablePersonsDucksAndCats() {
        Object[] walkables = new Object[4];
        walkables[0] = new Person("Perico Palotes");
        walkables[1] = new Duck("Pato Donald");
        walkables[2] = new Person("Belen Tilla");
        walkables[3] = new Cat("Garfield");

        // Hacer que todos los objetos caminen
        Walkables.letThemWalk(walkables);
    }

}
