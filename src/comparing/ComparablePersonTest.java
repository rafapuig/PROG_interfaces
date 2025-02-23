package comparing;

import java.util.Arrays;
import java.util.StringJoiner;

class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int compareTo(Person o) {
        int comparison = firstName.compareTo(o.firstName);
        if (comparison == 0) {
            comparison = lastName.compareTo(o.lastName);
        }
        return comparison;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class ComparablePersonTest {

    public static void main(String[] args) {

        Person ivan  = new Person("Ivan", "Ivanov");
        Person armando = new Person("Ivan", "Armandov");
        Person belen  = new Person("Belen", "Belenov");

        Person[] persons = new Person[] {ivan, armando, belen};

        System.out.println("Antes de ordenar...");
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons);

        System.out.println("Despues de ordenar...");
        System.out.println(Arrays.toString(persons));
    }
}
