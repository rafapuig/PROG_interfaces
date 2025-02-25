package exercises.strategy.weapons;

import exercises.strategy.Weapon;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("Atacando con un cuchillo...");
    }
}
