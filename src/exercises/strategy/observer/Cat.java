package exercises.strategy.observer;

/**
 * La clase Cat implementa la interface Feedable
 */
public class Cat implements FeedableWithEvent, Feedable {

    /** Nombre del gato **/
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    /**
     * Campo que almacena la referencia al objeto que está pendiente de ser informado
     * de cuando al gato le entra hambre
     * el objeto encapsula el comportamiento (instrucciones) que se ejecutará cuando sea requerido
     */
    private OnHungryListener onHungryListener;

    /**
     * Setter para establecer el objeto que responde ejecutando un código cuando es notificado
     * de que el gato está hambriento
     */
    @Override
    public void setOnHungryListener(OnHungryListener onHungry) {
        this.onHungryListener = onHungry;
    }

    /**
     * La llamada al metodo hungry hace que el gato se sienta hambriento
     */
    public void hungry() {
        System.out.println(name + " tiene hambre...");
        notifyOnHungryListener();
    }

    /**
     * Informa al objeto que está observando (escuchando) cuando
     * al gato le entra hambre para ser notificado y reaccionar
     */
    protected void notifyOnHungryListener() {
        if (onHungryListener != null) {
            onHungryListener.onHungry(this);
        }
    }

    /**
     * Metodo que implementa el metodo abstracto de la interface Feedable
     * Especifica como debe comer un objeto de la clase Cat
     * @param food alimento proporcionado para ser comido
     */
    @Override
    public void eat(String food) {
        System.out.println("Comiendo " + food +" ...");
    }

}
