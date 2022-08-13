package Seminar3;

public class Person {

    String name;
    String surname;
    int age;
    PetAction petAction;

    public Person(String name, String surname, int age, PetAction petAction) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.petAction = petAction;
    }

    public void callPet(){
        petAction.voice();

    }
}
