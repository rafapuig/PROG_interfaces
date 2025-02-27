package exercises.strategy.medieval.characters;

import exercises.strategy.medieval.Character;
import exercises.strategy.medieval.Weapon;
import exercises.strategy.medieval.weapons.Knife;

public class King extends Character {

    public King() {
        super(new Knife(), 150);
    }
}
