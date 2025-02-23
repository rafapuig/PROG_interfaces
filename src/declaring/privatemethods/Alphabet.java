package declaring.privatemethods;

/**
 * El código de los dos miembros por defecto que componen la interface
 * son prácticamente idénticos
 * Mover el código común a otro método y llamar a ese método desde los otros dos sería lo ideal
 * NO podemos hacerlo en Java 8 porque el método tendría que ser público, y lo expondría al exterior
 * y eso no es lo que se quiere (es un detalle de implementación del cual se debe abstraer y ocultar
 * a los usuarios de la interfaz)
 */
public interface Alphabet {

    /**
     * ¿La letra ocupa una posición impar en el alfabeto?
     */
    default boolean isAtOddPosition(char ch) {
        if(!Character.isLetter(ch)) {
            throw new RuntimeException("No es una letra " + ch);
        }
        char uc = Character.toUpperCase(ch);
        int position = uc - 'A';
        return position % 2 == 1;
    }

    /**
     * ¿La letra ocupa una posición par en el alfabeto?
     */
    default boolean isAtEvenPosition(char ch) {
        if(!Character.isLetter(ch)) {
            throw new RuntimeException("No es una letra " + ch);
        }
        char uc = Character.toUpperCase(ch);
        int position = uc - 'A';
        return position % 2 == 0;
    }
}
