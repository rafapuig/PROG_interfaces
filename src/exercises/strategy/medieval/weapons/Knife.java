package exercises.strategy.medieval.weapons;

import exercises.strategy.medieval.Weapon;

import java.util.Random;

public class Knife implements Weapon {

    public static final int MIN_DAMAGE = 8;
    public static final int MAX_DAMAGE = 10;

    private static final Random random = new Random();

    @Override
    public int getDamage() {
        return random.nextInt(MIN_DAMAGE, MAX_DAMAGE + 1);
    }

    @Override
    public int use() {
        int damage = getDamage(); // Daño entre mínimo y máximo
        System.out.println("Atacando con un cuchillo, causa un daño " + damage);
        return damage;
    }
}
