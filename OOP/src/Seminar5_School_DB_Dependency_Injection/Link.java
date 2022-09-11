package Seminar5_School_DB_Dependency_Injection;

public class Link {
    Person person1;
    Person person2;
    Relation link1;
    Relation link2;

    public Link(Person person1, Person person2, Relation link1, Relation link2) {
        this.person1 = person1;
        this.person2 = person2;
        this.link1 = link1;
        this.link2 = link2;
    }
}
