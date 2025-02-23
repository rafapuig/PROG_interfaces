package implementing.fields;

/**
 * El único tipo de campo que se permite declarar en una interface es
 * public estático y final
 * es decir una constante
 */
public interface Choices {
    public static final int YES = 0;
    public static final int NO = 1;
}

class ChoicesTest {
    public static void main(String[] args) {
        System.out.println("Choices.YES = " + Choices.YES);
        System.out.println("Choices.NO = " + Choices.NO);
    }
}
