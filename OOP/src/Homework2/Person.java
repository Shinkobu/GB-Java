package Homework2;

public class Person extends Human {
    private String name;


    public Person(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
