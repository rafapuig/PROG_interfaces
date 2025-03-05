package inheritance;

import java.util.List;
import java.util.SortedSet;

interface I1 {

    default void print() {
        System.out.println("I1 print");
    }

}

interface I2 extends I1 {

    //abstract void print();

    default void print2() {
        System.out.println("I2 print2");
    }

}

class A implements I2, I1 {

    @Override
    public void print() {
        //I1.super.print();
        System.out.println("A print");
    }
}


public class InheritanceTest {

    public static void main(String[] args) {
        A a = new A();
        I2 i2 = a;
        I1 i1 = a;

        i1.print();
        i2.print();
        i2.print2();
        a.print();
        a.print2();

    }
}
