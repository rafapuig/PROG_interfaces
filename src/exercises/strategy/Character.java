package exercises.strategy;

public abstract class Character {

    protected String name;

    public String getName() {
        return name;
    }

    // Composición
    // Un personaje tine un arma
    protected Weapon weapon;

    // Setter para poder cambiar de arma en tiempo de ejecución
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Delegación
    public void attack() {
        if(weapon != null) {
            System.out.print(name + ": ");
            this.weapon.attack();
        }
    }


}
