package intro;

public class Cat implements Walkable {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    // Los patos también pueden caminar, responden al mensaje "walk"
    public void walk() {
        System.out.println(name + " (un gato) esta caminando.");
    }

}
