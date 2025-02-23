package declaring.defaultmethods;

public class MovableActorDemo {
    public static void main(String[] args) {
        Movable movable = new Actor();
        System.out.println(movable);
        // Mover el actor
        movable.setX(12);
        movable.setY(15);
        System.out.println(movable);


        // Mover el actor unas coordenadas relativas
        movable.move(3.0, 7.0);
        System.out.println(movable);
    }
}
