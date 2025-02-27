package exercises.strategy.medieval;

public interface Damageable {

    /**
     * Metodo para recibir y procesar una cantidad de daño por un Damageable
     * @param damage cantidad de daño que debe recibir
     * @throws IllegalStateException si el objeto no puede recibir el daño
     */
    void takeDamage(int damage) throws IllegalStateException;
}
