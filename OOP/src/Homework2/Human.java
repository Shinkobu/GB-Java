package Homework2;

public abstract class Human {

    public String name;
    public Integer birthYear;

    public Human(String name, Integer birthYear) {

        this.name = name;
        this.birthYear = birthYear;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }
}
