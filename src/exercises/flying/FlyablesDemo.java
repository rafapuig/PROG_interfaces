package exercises.flying;

import java.util.Arrays;
import java.util.Collections;

public class FlyablesDemo {

    public static void main(String[] args) {
        testBird();
        testAirplane();
        testLetThemFly();
    }

    private static void testBird() {
        Bird zazu = new Bird();
        zazu.fly();
        zazu.peck();
        Flyable flyable = zazu;
        flyable.fly();
        flyable.speedup();
    }

    private static void testAirplane() {
        Airplane airplane = new Airplane();
        // Mediante la referencia de tipo Airplane tenemos acceso a toda la interfaz de la clase Airplane
        airplane.takeoff();
        airplane.fly();
        airplane.land();

        // Se puede asignar una referencia del tipo Airplane a una variable de tipo Flyable
        // porque la referencia es de un tipo cuya clase implementa la interface
        Flyable flyable = airplane;
        flyable.speedup();
        flyable.fly();
    }

    private static void testLetThemFly() {
        Bird zazu = new Bird();
        Airplane airplane = new Airplane();

        // Array de referencias a objetos cuya clase implementa la interface Flyable
        Flyable[] flyables = new Flyable[] {zazu, airplane};

        Flyable.letThemFly(flyables);
    }
}
