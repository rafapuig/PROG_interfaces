package exercises.strategy.weapons;

import exercises.strategy.Weapon;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Atacando con un arco...");
    }
}
