package exercises.strategy.medieval.characters;

import exercises.strategy.medieval.Character;
import exercises.strategy.medieval.weapons.Axe;

public class Troll extends Character {

    public Troll() {
        super(new Axe(), 20);
    }
}
