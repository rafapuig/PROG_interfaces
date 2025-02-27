package exercises.strategy.medieval.characters;

import exercises.strategy.medieval.Character;
import exercises.strategy.medieval.weapons.Bow;

public class Queen extends Character {

    public Queen() {
        super(new Bow(), 200);
    }
}
