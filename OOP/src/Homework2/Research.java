package Homework2;

import java.util.ArrayList;
import java.util.Iterator;
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

    public static Person findPerson(String name, List myArList) {
        Human foundPerson = null;
        Iterator<Human> myIter = myArList.iterator();
        while (myIter.hasNext() && foundPerson == null) {
            Human tempHuman = myIter.next();
            String tempName = tempHuman.name;
            if (tempName.equals(name)) {
                return (Person) tempHuman;
            }
        }
        return null;
    }

}
