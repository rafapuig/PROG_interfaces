package conflicts.classwins;

interface Sizeable {
    int size();

    /**
     * Un metodo default NO puede ser final,
     * De permitirlo se podría romper el codigo si cuando se añade a la interface
     * ya se han definido clases que implementan la interface
     * Si alguna de estas clases declaran un metodo con la misma firma que el metodo default añadido
     * ahora es como si reemplazaran al metodo default
     * si este último pudiera ser final, estaría impidiendo su reemplazo y, por tanto, generando un
     * error en las clases que implementan la interface y reemplazan el metodo isEmpty
     * Por eso, en Java los metodos default no pueden ser finales
     */
    default boolean isEmpty() {
        System.out.println("Llamada a isEmpty en Sizeable...");
        return size() == 0;
    }
}

class Bag implements Sizeable {

    private int size;

    @Override
    public int size() {
        return size;
    }

    /**
     * En el momento en que en la interface Sizeable se añade el método default isEmpty
     * este metodo pasa a ser una reimplementación del heredado desde la interface
     */
    public boolean isEmpty() {
        System.out.println("Llamada a isEmpty en Bag...");
        return size == 0;
    }
}

public class Example3 {

    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println(bag.isEmpty()); // La clase base siempre gana
    }
}
