package exercises.strategy.medieval;

import exercises.strategy.medieval.characters.King;
import exercises.strategy.medieval.characters.Knight;
import exercises.strategy.medieval.characters.Troll;
import exercises.strategy.medieval.weapons.Knife;

public class MedievalGameTest {

    public static void main(String[] args) {

        Character lancelot = new Knight();
        Character arthur = new King();
        Character troll = new Troll();

        try {
            troll.attack(lancelot);
            troll.attack(arthur);

            troll.setWeapon(new Knife());
            troll.attack(arthur);

            arthur.attack(troll);
            lancelot.attack(troll);
            arthur.attack(troll);
            troll.attack(arthur);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
