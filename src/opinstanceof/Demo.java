package opinstanceof;

public class Demo {

    public static void main(String[] args) {
        testRuntimeFalse();
        testCompileTimeError();
        testRuntimeFalseWithNull();
    }

    private static void testRuntimeTrue() {
        Giver armando = new MunificientGiver();
        if (armando instanceof Munificient) {
            System.out.println("true"); // <-- en ejecución
        } else {
            System.out.println("false");
        }
    }

    private static void testRuntimeFalse() {
        Giver belen = new Giver();
        if (belen instanceof Munificient) {
            System.out.println("true");
        } else {
            System.out.println("false"); //<-- en ejecución
        }
    }

    private static void testRuntimeFalse2() {
        Giver perico = new StingyGiver();
        if (perico instanceof Munificient) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void testCompileTimeError() {
        StingyGiver gilito = new StingyGiver();
        /*if (gilito instanceof Munificient) { // Descomentar para ver el error de compilacion
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/
    }

    private static void testRuntimeFalseWithNull() {
        Giver misternobody = null;
        if (misternobody instanceof Munificient) {
            System.out.println("true");
        } else {
            System.out.println("false"); // <-- en ejecución
        }
    }

}
