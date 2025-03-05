package exercises.strategy.observer;

/**
 * Interface que declara el metodo al que llamar cuando un objeto alimentable
 * tiene que realizar la acción de comer
 */
public interface Feedable {

    void eat(String food);

}
