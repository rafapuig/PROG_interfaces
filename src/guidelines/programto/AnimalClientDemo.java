package guidelines.programto;

public class AnimalClientDemo {

    public static void main(String[] args) {
        AnimalClient client = new AnimalClient(new Cat());
        client.methodThatUsesAnimal();
        client.letAnimalMakeSound(new Dog());
    }
}
