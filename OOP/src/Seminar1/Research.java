package Seminar1;

import java.util.List;

public class Research {
    public static void printAllRelatives(String name, Tree tree, Relation someRelation) {
        List<Link> links = tree.getLinks();

        boolean foundYes = false;


        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
            el.getLink() == someRelation) {
                System.out.println(el.getSecondPersonName());
                foundYes = true;
                 }
            }
        if (foundYes == false) System.out.println("Родственники не найдены");
        }


}
