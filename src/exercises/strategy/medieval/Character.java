package exercises.strategy.medieval;

public class Character implements Damageable {

    Weapon weapon;
    int energy;

    public Character(Weapon initialWeapon, int initialEnergy) {
        this.weapon = initialWeapon;
        this.energy = initialEnergy;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     *
     * @param damageable
     */
    void attack(Damageable damageable) {
        if(!isAlive()) throw new IllegalStateException("Un personaje muerto no puede realizar ataques");
        System.out.println(getClass().getSimpleName() + " atacando al enemigo...");

        try {
            weapon.useAgainst(damageable); // Delega en el arma parte de la acción de atacar
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("El enemigo ya esta muerto", e);
        }

        int damage = weapon.use(); // Delega en el arma la obtencion del daño que va a causar
        try {
            damageable.takeDamage(damage);
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("El objetivo ya esta muerto", e);
        }
    }

    @Override
    public void takeDamage(int damage) {
        if(!isAlive()) throw new IllegalStateException("Un personaje muerto no puede recibir daño");
        System.out.print(getClass().getSimpleName() + " recibiendo un daño de " + damage);
        energy -= damage;
        if (energy <= 0) { energy = 0; }
        System.out.println(" - Energía actual: " + energy);
    }

    boolean isAlive() {
        return energy > 0;
    }
}
