package exercises.strategy.medieval;

public interface Weapon {

    /**
     * Metodo abstracto que implementan las concreciones (implementaciones) de Weapon
     * @return el daño que causa el arma cuando se usa
     */
    int use();


    /**
     * El implementador debe indicar la cantidad de daño que inflige cuando el arma se usa para atacar
     * @return valor numérico que representa la cantidad de daño que causa el uso del arma
     */
    default int getDamage() {
        return 0;
    }


    /**
     * Usar arma contra una instancia dañable
     * @param damageable objetivo (enemigo) contra el que se lanza el ataque
     * @throws IllegalArgumentException si el enemigo no puede recibir el daño (está muerto)
     */
    default void useAgainst(Damageable damageable) throws IllegalArgumentException {
        int damage = use();
        try {
            damageable.takeDamage(damage);
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("No se puede infligir daño al objetivo", e);
        }
    }

}
