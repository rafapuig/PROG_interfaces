package intro;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " (una persona) esta caminando.");
    }
}
