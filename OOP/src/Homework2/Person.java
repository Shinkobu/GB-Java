package Homework2;

public class Person extends Human implements Comparable<Person>{

    public Person(String name, Integer birthYear) {
        super(name,birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        return this.birthYear - o.birthYear;
    }
}
