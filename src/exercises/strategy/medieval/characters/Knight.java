package exercises.strategy.medieval.characters;

import exercises.strategy.medieval.Character;
import exercises.strategy.medieval.Weapon;
import exercises.strategy.medieval.weapons.Sword;

public class Knight extends Character {

    public Knight() {
        super(new Sword(), 100);
    }
}
