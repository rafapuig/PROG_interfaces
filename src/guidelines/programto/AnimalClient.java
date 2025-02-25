package guidelines.programto;

/**
 * La clase AnimalClient esta programada para una abstracción no para una implementación concreta
 * Todas las referencias que usa son del tipo de la abstracción (la clase base abstracta)
 */
public class AnimalClient {

    Animal animal;

    public AnimalClient(Animal animal) {
        this.animal = animal;
    }

    public void methodThatUsesAnimal() {
        this.animal.makeSound();
    }

    public void letAnimalMakeSound(Animal animal) {
        animal.makeSound();
    }

}
