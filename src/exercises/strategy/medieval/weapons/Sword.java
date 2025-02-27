package exercises.strategy.medieval.weapons;

import exercises.strategy.medieval.Weapon;

public class Sword implements Weapon {

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int use() {
        int damage = getDamage();
        System.out.println("Atacando con una espada, causa un daño de " + damage);
        return damage;
    }
}
