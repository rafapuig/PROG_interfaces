package exercises.strategy.observer;

import java.util.Random;

public class Person implements OnHungryListener {

    static Random rand = new Random();

    private static final String[] foods = new String[]{"paté", "pienso", "atún", "gelatinas", "leche"};

    private static String getRandomFood() {
        int randomIndex = rand.nextInt(foods.length);
        return foods[randomIndex];
    }

    String name;
    Cat cat;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Si usaramos composición "tiene-un" en lugar de "es-un"
     * Tedríamos que añadir un campo a la clase para almacenar la referencia a la instancia OnHungryListener
     * Esto tendría las ventajas de la composición, la individualidad en el comportamiento
     * En otras palabras, que el comportamiento no viene determinado por pertenecer a la clase (Person)
     * si no que, cada instancia Person puede establecer su propio comportamiento individualmente
     * además que poder cambiarlo dinámicamente en tipo de ejecución
     */
    OnHungryListener onHungryBehavior = this;

    /**
     * Mediante este metodo podemos establecer una nueva forma de atender al gato hambriento
     * que vendrá encasulada en un objeto concreto que implementa OnHungryListener
     * @param onHungryBehavior
     */
    public void setOnHungryBehavior(OnHungryListener onHungryBehavior) {
        this.onHungryBehavior = onHungryBehavior;
        cat.setOnHungryListener(onHungryBehavior);
    }

    /**
     * Metodo para asignar el campo cat y establecer la referencia a la instancia de clase Cat
     * que pasa a ser la mascota de la Person, y por tanto, cuidada por esta.
     * Dado que Person implementa directamente OnHungryListener, define el metodo al que llama
     * el objeto gato cuando notifica que tiene hambre
     * Por ello, hay que establecer como observador (escuchador) del hambre del Cat al objeto Person receptor
     * de la llamada al metodo adopt mediante el uso de this como argumento de llamada
     * @param cat
     */
    void adopt(Cat cat) {
        this.cat = cat;
        cat.setOnHungryListener(this);


        /* No es estrictamente necesario que la clase Person sea quien implemente
        *  Se puede hacer uso de la composición haciendo que Person "tenga-un" OnHungryListener
        * y pasándolo como argumento en la llamada al metodo setOnHungryListener de la clase Cat
        */
        cat.setOnHungryListener(feedable -> feed(feedable, getRandomFood()));
        cat.setOnHungryListener( feedable -> onHungry(feedable));
        cat.setOnHungryListener(this::onHungry);

        // Y si el objeto ObHungryListener nos es estblecido desde el código cliente mediante
        // setOnHungryListener entonces para hacer uso de ello la instrucción quedaría asi:
        cat.setOnHungryListener(this.onHungryBehavior);
        // Lo que habré muchas nuevas posibilidades, como por ejemplo, en este caso particular
        // Podríamos dejar que el gato nos lo cuide la vecina por un tiempo y luego volver a cuidarlo otra vez
    }

    @Override
    public void onHungry(Feedable feedable) {
        String food = getRandomFood();
        feed(feedable, food);
    }

    private void feed(Feedable feedable, String food) {
        System.out.println(name + " dando de comer " + food + " a " + feedable + " ...");
        feedable.eat(food);
    }
}
