package intro;

public class WalkablesTest {

    public static void main(String[] args) {
        testWalkable();
        testWalkablePersonsAndDucks();
        testWalkablePersonsDucksAndCats();
    }

    private static void testWalkable() {
        Walkable perico = new Person("Perico Palotes");
        perico.walk();  // ordenar al objeto que camine
        Walkables.letItWalk(perico); // Llamando a la clase de utilidad para que ponga a caminar al objeto

        Walkable silvestre = new Cat("Silvestre");
        silvestre.walk();
        Walkables.letItWalk(silvestre);
    }


    private static void testWalkablePersonsAndDucks() {
        Walkable[] walkables = new Walkable[3];
        walkables[0] = new Person("Perico Palotes");
        walkables[1] = new Duck("Pato Donald");
        walkables[2] = new Person("Belen Tilla");

        // Hacer que todos los objetos caminen
        Walkables.letThemWalk(walkables);
    }

    private static void testWalkablePersonsDucksAndCats() {
        Walkable[] walkables = new Walkable[4];
        walkables[0] = new Person("Perico Palotes");
        walkables[1] = new Duck("Pato Donald");
        walkables[2] = new Person("Belen Tilla");
        walkables[3] = new Cat("Garfield");

        // Hacer que todos los objetos caminen
        Walkables.letThemWalk(walkables);
    }

}
