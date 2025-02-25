package intro;


/**
 * Clase de utilidad con métodos estáticos que usan la interface Walkable
 */
public class Walkables {

    public static void letThemWalk(Walkable[] list) {
        for (int i = 0; i < list.length; i++) {
            letItWalk(list[i]);
        }
    }

    public static void letItWalk(Walkable walkable) {
        walkable.walk();
    }

}
