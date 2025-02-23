package declaring;

public class WalkableDemo {

    public static void main(String[] args) {

        Walkable[] list = new Walkable[4];
        list[0] = new Person("Perico Palotes");
        list[1] = new Duck("Pato Lucas");
        list[2] = new Person("Esther Malgin");
        list[3] = new Cat("Gato con botas");

        Walkable.letThemWalk(list);
    }
}
