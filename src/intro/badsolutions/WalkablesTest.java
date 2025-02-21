package intro;

public class WalkablesTest {

    public static void main(String[] args) {
        testWalkableOnlyPersons();
        testWalkablePersonsAndDucks();
    }

    private static void testWalkableOnlyPersons() {
        Person[] people = new Person[3];
        people[0] = new Person("Perico Palotes");
        people[1] = new Person("Paco Jones");
        people[2] = new Person("Belen Tilla");

        // Hacer que todas las personas caminen
        Walkables.letThemWalk(people);
    }

    private static void testWalkablePersonsAndDucks() {
        Object[] list = new Object[4];
        list[0] = new Person("Perico Palotes");
        list[1] = new Duck("Pato Donald");
        list[2] = new Person("Belen Tilla");
        list[3] = new Object(); // No tiene el método "walk"

        // Hacer que todos los objetos caminen
        Walkables.letThemWalk(list);
    }


}
