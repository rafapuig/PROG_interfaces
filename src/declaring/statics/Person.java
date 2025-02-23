package declaring.statics;


public class Person implements Walkable {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " (una persona) esta caminando.");
    }
}
