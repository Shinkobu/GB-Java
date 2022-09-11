package Seminar3;

public class App {

    public static void main(String[] args) {
        var person = new Person("Dima","Ivanov",10, new Cat());
        var person1 = new Person("Fedor","Petrov",11, new Dog());

        person.callPet();
        person1.callPet();
    }
}
