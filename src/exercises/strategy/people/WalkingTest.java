package exercises.strategy.people;

import exercises.strategy.people.walk.WalkCrawling;
import exercises.strategy.people.walk.WalkLeaningOnCrane;
import exercises.strategy.people.walk.WalkUpright;
import exercises.strategy.people.walk.WalkWithCrutches;

public class WalkingTest {

    public static void main(String[] args) {

        WalkBehavior walkUpright = new WalkUpright();

        Person pepe = new Person("Pepe", walkUpright);
        Person luis = new Person("Luis", new WalkLeaningOnCrane());
        Person jose = new Person("Jose", new WalkCrawling());

        letItWalk(pepe);
        letItWalk(luis);
        letItWalk(jose);

        // Pepe se ha torcido el tobillo, ahora tiene que cambiar su estrategia para caminar
        pepe.setWalkBehavior(new WalkWithCrutches());
        letItWalk(pepe);

        // Jose crece y ya camina erguido
        jose.setWalkBehavior(walkUpright);
        letItWalk(jose);

        // Crear directamente una instancia que implementa la interface WalkBehavior
        // mediante un tipo anónimo
        WalkBehavior walkOnOneLeg = new WalkBehavior() {
            @Override
            public void walk() {
                System.out.println("Caminando a la pata coja");
            }
        };

        jose.setWalkBehavior(walkOnOneLeg);
        letItWalk(jose);

        // Crear directamente una instancia que implementa la interface WalkBehavior
        // mediante una expresión lambda
        WalkBehavior walkTiptoe = () -> System.out.println("Caminando a de puntillas");
        pepe.setWalkBehavior(walkTiptoe);
        letItWalk(pepe);

        jose.setWalkBehavior(() -> System.out.println("Patinando"));
        letItWalk(jose);

        // Hacer caminar a pepe con muletas
        letItWalk(pepe, new WalkWithCrutches());

        // Hacer caminar a luis erguido
        letItWalk(luis, walkUpright);

        // Hacemos caminar a jose bocabajo
        letItWalk(jose, () -> System.out.println("Caminando bocabajo apoyando las manos"));

        // Hacemos a pepe caminar de puntillas
        letItWalk(pepe, walkTiptoe);

        testCreatePersonWithUniqueWalkingBehavior();
    }

    private static void testCreatePersonWithUniqueWalkingBehavior() {
        // Crear una persona y asignarle una forma de caminar única e inexistente
        Person rafa = new Person("Rafa", () -> System.out.println("Caminando al estilo único de Rafa"));
        letItWalk(rafa);
    }


    // Poner a caminar a un objeto cuya clase implementa la interface caminable
    static void letItWalk(Walkable walkable) {
        walkable.walk();
    }

    /**
     * Poner a caminar a un objeto caminable usando la forma de caminar proporcionada como
     * argumento
     * @param walkable el objeto que hacemos caminar
     * @param walkBehavior la forma en que queremos que camine
     */
    static void letItWalk(Walkable walkable, WalkBehavior walkBehavior) {
        walkable.walk(walkBehavior);
    }

}
