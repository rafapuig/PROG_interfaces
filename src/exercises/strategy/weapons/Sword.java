package exercises.strategy.weapons;

import exercises.strategy.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Atacando con una espada...");
    }
}
