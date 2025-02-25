package guidelines.programto;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("bark");
    }
}
