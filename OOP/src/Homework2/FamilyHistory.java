package Homework2;

import java.util.List;

public abstract class FamilyHistory {

    public abstract List<Link> getLinks();

    public abstract void addLink(Human p1, Human p2, Relation link1, Relation link2);
}
