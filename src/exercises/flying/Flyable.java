package exercises.flying;

/**
 * Interface que implementan las clases cuyos objetos vayan a tener la habilidad de volar
 */
public interface Flyable {

    /**
     * Método abstracto
     * que declara el concepto de volar
     * Y deja que las clases lo implementen
     */
    void fly();

    default void speedup() {
        System.out.println("Tomando impulso");
    }

    /**
     * Método de utilidad para poner a volar a los objetos de un array de referencias
     * a objetos cuya clase implementa la interface Flyable
     * Antes de Java 8 no se podían declarar métodos estáticos en una interface
     * Y Había que crear una clase de utilidad con nombre de la interface en plural: Flyables
     * @param flyables array de referencias a objetos que implementan Flyable
     */
    static void letThemFly(Flyable[] flyables) {
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }
    }

}
