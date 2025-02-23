package implementing;

public class Fish implements Swimmable {

    String name;

    public Fish(String name) {
        this.name = name;
    }

    // Reemplazar e implementar el metodo swim heredado de la interface Swimmable
    @Override
    public void swim() {
        System.out.println(name + " (un pez) está nadando...");
    }

    // Este método no tiene nada que ver con el método swin de la interface
    // No es más que una sobrecarga (overload) de swim (por tener el mismo nombre pero distinta firma)
    public void swim(double distance) {

    }
}

class FishTest  {

    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo");

        Swimmable dori = new Fish("Dori");

        // Un Fish siempre es un Swimmable
        Swimmable swimmable = nemo;

        // Al contrario no, no todo Swimmable es un Fish, puede ser un Turtle
        //Fish fish = swimmable;

        Turtle turtle = new Turtle();
        swimmable = turtle; // OK, toda Turtle es Swimmable

        // swimmable esta apuntando a una tortuga!!! swimmable es una tortuga en tiempo de ejecución
        try {
            Fish fish = (Fish) swimmable; // Válido en compilación, pero lanzará ClassCastException en ejecución
        } catch (ClassCastException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        swimmable = nemo;
        swimmable.swim();

    }
}
