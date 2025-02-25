package exercises.strategy.weapons;

import exercises.strategy.Weapon;

public class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("Atacando con un hacha...");
    }
}
