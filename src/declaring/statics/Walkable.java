package declaring.statics;

/**
 * Todos los objetos que pueden caminar deberían implementar la interface Walkable
 */
public interface Walkable {

    void walk(); // método abstracto

    /**
     * Método de conveniencia (utilidad) aplicable sobre objetos que implementan Walkable
     */
    public static void letThemWalk(Walkable[] walkables) {
        for (int i = 0; i < walkables.length; i++) {
            walkables[i].walk();
        }
    }

}
