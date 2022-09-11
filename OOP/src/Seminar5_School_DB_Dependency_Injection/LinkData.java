package Seminar5_School_DB_Dependency_Injection;

public class LinkData {
    private static Long id;
    Link link;


    public LinkData(Link link) {
        this.link = link;
        id++;
    }


    public static Long getId() {
        return id;
    }
}
