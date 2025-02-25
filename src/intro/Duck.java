package intro;

/**
 * Antes de crear la clase Duck, solamente los objetos Person podían caminar
 * Ahora los objetos Duck también tienen ese comportamiento
 */
public class Duck implements Walkable {

    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    // Los patos también pueden caminar, responden al mensaje "walk"
    public void walk() {
        System.out.println(name + " (un pato) esta caminando.");
    }
}
