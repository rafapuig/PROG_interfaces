package exercises.strategy.observer;

/**
 * Interface que declara un metodo que deben implementar las clases (u objetos) que
 * quieren ser notificados (son observadores) cuando un Feedable tiene hambre.
 * La implementacion del metodo será la respuesta propocionada por el objeto
 * en el momento que ha sido notificado
 */
public interface OnHungryListener {
    void onHungry(Feedable feedable);
}
