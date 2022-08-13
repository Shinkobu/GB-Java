package Homework2;

import java.util.List;

public class Research implements ResearchMethods {
    public static void printAllRelatives(String name, FamilyHistory tree, Relation someRelation) {
        List<Link> links = tree.getLinks();

        boolean isFound = false;


        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
            el.getLink() == someRelation) {
                System.out.println(el.getSecondPersonName());
                isFound = true;
                 }
            }
        if (!isFound) {
            System.out.println("Родственники не найдены");
        }
        }


}
