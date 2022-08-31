package Homework2;

import java.util.Iterator;

public class Person extends Human implements Comparable<Person>, Iterator<String> {

    public Person(String name, Integer birthYear) {
        super(name,birthYear);
    }
    Integer index = 0;

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < 2;
            }

            @Override
            public String next() {
                switch (index) {
                    case 1:
                        return String.format("Имя: %s", name);
                    case 2:
                        return String.format("Год рождения: %s", birthYear);
                }
                return null;
            }

        };
        return it;
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

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("Имя: %s", name);
            case 2:
                return String.format("Год рождения: %s", birthYear);
    }

        return null;
    }
}
