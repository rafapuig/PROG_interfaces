package guidelines.programto;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        meow();
    }

    void meow() {
        System.out.println("meow");
    }
}
