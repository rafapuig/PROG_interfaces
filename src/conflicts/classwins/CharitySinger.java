package conflicts.classwins;

/**
 * Charity singers no cobran por cantar
 * Un CharitySinger es un Singer
 * Las clases que implementen CharitySinger solamente deben proporcionar la implementación de sing()
 * ya que heredan la implementación de setRate y getRate
 */
interface CharitySinger extends Singer {

    // Dado que un charity singer no cobra por cantar reemplaza los métodos setRate y getRate
    @Override
    default void setRate(double rate) {
        // No hacer nada
    }

    default double getRate() {
        return 0.0;
    }
}