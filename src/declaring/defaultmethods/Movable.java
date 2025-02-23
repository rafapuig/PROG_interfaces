package declaring.defaultmethods;

/**
 * Especificación para objetos móviles y describir su posición en 2D
 */
public interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();

    // Mas tarde se añade un nuevo método al interfaz
    // Añadir un nuevo método rompe el codigo existente
    // Todas las clases que implementaban hasta ahora la interfaz ya no compilarán
    // hasta que no definan una implementación para este nuevo método
    //void move(double dx, double dy);

    // Pero si añadimos el nuevo método a la vez que proporcionamos una implementación por defecto
    // Las clases existentes que implementan la interfaz heredan el método junto con la implementación
    // por defecto. Por tanto, no tienen la obligación de proporcionar la implementación del nuevo método
    // y no se quedan "rotas"
    default void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    // Las clases que implementan Movable. continuarán compilando y funcionando
    // El nuevo método move() con su implementación por defecto estará disponible en todas esas clases

}
