package exercises.anonymous;

public class Elephant {

    String name;

    public Elephant(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " moviéndose mediante sus patas");
    }
}

class ElephantDemo {

    public static void main(String[] args) {

        Elephant elephant = new Elephant("Elefante normal");
        elephant.move();

        Elephant dumbo = new Elephant("Dumbo") {
            public void move() {
                System.out.println(name + " se desplaza agitando las orejas");
            }
        };

        dumbo.move();
    }
}
