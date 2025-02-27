package exercises.strategy.medieval.weapons;

import exercises.strategy.medieval.Weapon;

public class Bow implements Weapon {
    @Override
    public int use() {
        int damage = 9;
        System.out.println("Atacando con un arco, daño causado: " + damage);
        return damage;
    }
}
