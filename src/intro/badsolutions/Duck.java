package intro.badsolutions;

/**
 * Antes de crear la clase Duck, solamente los objetos Person podían caminar
 * Ahora los objetos Duck también tienen ese comportamiento
 */
public class Duck {
    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    // Los patos también pueden caminar, responden al mensaje "walk"
    public void walk() {
        System.out.println(name + " (un pato) esta caminando.");
    }

    /* ¿Como podemos hacer caminar a los objetos Duck mediante la clase Walkables? */
}
