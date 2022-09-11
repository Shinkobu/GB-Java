package Homework2;

import java.util.Iterator;

public class Person extends Human implements Comparable<Person>, Iterator<String> {

    public Person(String name, Integer birthYear, Integer deathYear) {
        super(name,birthYear,deathYear);
    }
    Integer index = 0;

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < titles.size();
            }

            @Override
            public String next() {
                return titles.get(index++);
                }

            };
        return it;
        }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                '}';
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        if (this.birthYear > o.birthYear)
            return 1;
        else if (this.birthYear < o.birthYear)
            return -1;
        else
            return 0;
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
