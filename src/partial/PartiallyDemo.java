package partial;

interface MyInterface {

    void methodA();
    void methodB();
    void methodC();

}

abstract class A implements MyInterface {
    @Override
    public void methodA() {
        System.out.println("A");
    }
}

abstract class B extends A {
    @Override
    public void methodB() {
        System.out.println("B");
    }
}

class C extends B {
    @Override
    public void methodC() {
        System.out.println("C");
    }
}

public class PartiallyDemo {

    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();

        B b = c;
        b.methodA();
        b.methodB();
        b.methodC();

        A a = b;
        a.methodA();
        a.methodB();
        a.methodC();

        MyInterface myInterface = a;
        myInterface.methodA();
        myInterface.methodB();
        myInterface.methodC();

        Object object = myInterface;
    }
}
