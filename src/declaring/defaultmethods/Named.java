package declaring.defaultmethods;

public interface Named {

    default String getName() {
        return "Anónimo";
    }

    default String getApellidos() {
        return null;
    }

    default void setApellidos(String apellidos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default String getFullName() {
        return getName() + " " + getApellidos();
    }

}

class TestNamedImplementer implements Named {

    private String name;
    private String apellidos;

    public TestNamedImplementer(String name) {
        this.name = name;
    }

    public TestNamedImplementer(String name, String apellidos) {
        this.name = name;
        this.apellidos = apellidos;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }
}

class TestNamedImplementerDemo implements Named {

    public static void main(String[] args) {
        TestNamedImplementer t1 = new TestNamedImplementer("Perico", "Palotes");
        System.out.println(t1.getFullName());
    }

}
