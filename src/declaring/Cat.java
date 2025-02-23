package declaring;

/**
 * Antes de crear la clase Duck, solamente los objetos Person podían caminar
 * Ahora los objetos Duck también tienen ese comportamiento
 */
public class Cat implements Walkable {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    // Los patos también pueden caminar, responden al mensaje "walk"
    public void walk() {
        System.out.println(name + " (un gato) esta caminando.");
    }

    /* ¿Como podemos hacer caminar a los objetos Duck mediante la clase Walkables? */
}
