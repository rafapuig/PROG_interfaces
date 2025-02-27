package conflicts.mostespecificwins;

interface Singer {
    void sing();                    // El trabajo que realiza
    void setRate(double rate);      // El coste mínimo por hora
    double getRate();
}

interface Player {
    void play();
    void setRate(double rate);
    default double getRate() { // Proporciona una implementación por defecto
        return 300.0;
    }
}

/**
 * Cantante que además juega con videojuegos
 */
interface SingerPlayer extends Singer, Player {
    // Hereda play
    // Hereda sing
    // Hereda Singer.setRate (abstract)
    // Hereda Player.setRate (abstract) --> No hay conflicto entre ambas

    // Reemplaza getRate de Singer y de Player
    @Override
    default double getRate() {
        System.out.println("Llamada a SingerPlayer.getRate");
        double playerRate = Player.super.getRate();
        double singerRate = playerRate * 2.5;
        return playerRate + singerRate;
    }
}

abstract class Employee implements Singer, SingerPlayer {
    // Hereda play de la interface Player
    // Hereda sing

    // ¿Cual setRate?
    // Hereda Singer.setRate (abstract)
    // Hereda SingerPlayer.setRate (abstract) --> no hay conflicto

    //¿Cual gerRate?
    // Hereda Singer.getRate (abstract) ha sido reemplazado por SingerPlayer.getRate (eliminado de la lista de opciones)
    // Hereda SingerPlayer.getRate (default) --> no hay conflicto (solo queda uno)

}

public class MostSpecificSuperinterfaceWins {

    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public void play() {

            }

            @Override
            public void sing() {

            }

            @Override
            public void setRate(double rate) {

            }
        };

        employee.getRate(); // Gama la superinterface más específica SingerPlayer
    }
}
