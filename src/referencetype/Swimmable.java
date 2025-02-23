package referencetype;

public interface Swimmable {
    void swim();
}

class SwimmableTest {

    // Definir un campo de instancia
    private Swimmable swimmable;

    // Declarar un parámetro de entrada de un constructor
    public SwimmableTest(Swimmable swimmable) {}

    // Definir el tipo de retorno de un método
    public Swimmable getSwimmable() {
        return swimmable;
    }

    // Declarar un parámetro para un método
    public void setSwimmable(Swimmable swimmable) {
        this.swimmable = swimmable;
    }

    public void letItSwim() {
        // Declarar una variable local
        Swimmable localSwimmable = this.swimmable;

        // una variable interfaz se puede usar para llamar a cualquier método
        // declarado en el interfaz y de la clase Object
        localSwimmable.swim();
    }


}
