package Homework2;

import java.util.ArrayList;
import java.util.List;

public abstract class Human implements Iterable {

    public String name;
    public Integer birthYear;
    public Integer deathYear;
    public List<String> titles = new ArrayList<>();
    public List<String> titles1 = new ArrayList<>();

    public Human(String name, Integer birthYear, Integer deathYear) {

        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public void addTitle(String title){
        titles.add(title);
        titles1.add(title);
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }
}
