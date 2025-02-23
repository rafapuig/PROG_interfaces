package implementing.multiple;

import declaring.statics.Walkable;
import referencetype.Swimmable;

class Turtle implements Walkable, Swimmable {

    String name;

    public Turtle(String name) {
        this.name = name;
    }

    // Añadir el método bite especifico para objetos Turtle
    public void bite() {
        System.out.println(name + " (una tortuga) está mordiendo");
    }

    @Override
    public void walk() {
        System.out.println(name + " (una tortuga) está caminando");
    }

    @Override
    public void swim() {
        System.out.println(name + " (una tortuga) esta nadando");
    }
}

public class TurtleTest {

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Turtle");
        letItBite(turtle);
        letItSwim(turtle);
        letItWalk(turtle);

        // Con una variable de tipo Turtle se puede acceder a todos los métodos
        turtle.bite();
        turtle.swim();
        turtle.walk();

        // Cuando se usa una Turtle con una referencia de tipo Swimmable solo se puede acceder al método swim
        Swimmable swimmable = turtle;
        swimmable.swim();

        // Cuando se usa uan Turtle con una referencia de tipo Walkable solo se puede acceder al método walk
        Walkable walkable = turtle;
        walkable.walk();
    }

    static void letItBite(Turtle turtle) {
        turtle.bite();
    }

    static void letItSwim(Swimmable swimmable) {
        swimmable.swim();
    }

    static void letItWalk(Walkable walkable) {
        walkable.walk();
    }
}
