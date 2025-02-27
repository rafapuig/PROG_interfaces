package exercises.strategy.medieval.weapons;

import exercises.strategy.medieval.Weapon;

public class Axe implements Weapon {

    private final int AXE_DAMAGE = 8;

    @Override
    public int getDamage() {
        return AXE_DAMAGE;
    }

    @Override
    public int use() {
        int damage = getDamage();
        System.out.println("Atacando con un hacha, causa un daño " + damage);
        return damage;
    }
}
