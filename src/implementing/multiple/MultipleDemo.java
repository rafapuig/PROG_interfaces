package implementing.multiple;

interface Adder {
    int add(int a, int b);
}

interface Subtractor {
    int subtract(int a, int b);
}

class ArithOperations implements Adder, Subtractor {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class MultipleDemo {

    public static void main(String[] args) {

        // Ub objeto de la clase ArithOperations tiene 2 tipos
        // el de la clase, y el de las dos interfaces que la clase implementa
        // ArithOperations
        // Adder
        // Subtractor

        // Ademas de Object

        ArithOperations arithOperations = new ArithOperations();
        Adder adder = arithOperations;
        Subtractor subtractor = arithOperations;

        Object obj = arithOperations;
    }
}
