package Seminar1;

public class Link {
    private Person personFirst;
    private Person personSecond;
    private Relation link;

    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Person getPersonFirst() {
        return personFirst;
    }

    public Person getPersonSecond() {return personSecond;}

    public String getSecondPersonName() {return personSecond.getName();}
    public String getFirstPersonName() {return personFirst.getName();}


    public Relation getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + personFirst +
                ", personSecond=" + personSecond +
                ", link=" + link +
                '}';
    }
}
