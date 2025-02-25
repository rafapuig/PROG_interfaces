package exercises.strategy;

import exercises.strategy.characters.King;
import exercises.strategy.characters.Queen;
import exercises.strategy.weapons.Axe;
import exercises.strategy.weapons.Bow;
import exercises.strategy.weapons.Knife;
import exercises.strategy.weapons.Sword;

public class Game {

    public static void main(String[] args) {

        Weapon sword = new Sword();
        Weapon knife = new Knife();
        Weapon axe = new Axe();
        Weapon Bow = new Bow();

        Character king = new King();

        king.setWeapon(new Sword());
        king.attack();

        king.setWeapon(new Knife());
        king.attack();


        Character queen = new Queen();

        makeAttack(king, axe);
        makeAttack(queen, sword);
    }

    static void makeAttack(Character character, Weapon weapon) {
        character.setWeapon(weapon);
        character.attack();
    }

}
