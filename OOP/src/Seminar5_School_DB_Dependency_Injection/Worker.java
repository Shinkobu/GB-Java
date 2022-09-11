package Seminar5_School_DB_Dependency_Injection;

public class Worker extends Person {

    Status status;

    public Worker(String name, String surname, int yearOfBirth, Status status) {
        super(name, surname, yearOfBirth);
        this.status = status;
    }
}
