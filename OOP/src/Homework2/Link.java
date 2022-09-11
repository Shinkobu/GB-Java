package Homework2;

public class Link {
    private Human personFirst;
    private Human personSecond;
    private Relation link;

    public Link(Human personFirst, Human personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Human getPersonFirst() {
        return personFirst;
    }

    public Human getPersonSecond() {return personSecond;}

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
