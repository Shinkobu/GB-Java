package Homework2;

import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Human person1 = new Person("Александр Невский", 1221);
        Human person2 = new Person("Даниил", 1261);
        Human person3 = new Person("Юрий", 1281);
        Human person4 = new Person("Иван Калита", 1322);
        Human person5 = new Person("Семён Гордый", 1317);
        Human person6 = new Person("Иван II Красный", 1326);
        Human person7 = new Person("Дмитрий Донской", 1350);


        FamilyHistory tree = new Tree();

        tree.addLink(person1, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person4, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person5, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person6, Relation.PARENT, Relation.CHILD);
        tree.addLink(person6, person7, Relation.PARENT, Relation.CHILD);

        tree.addLink(person3, person4, Relation.SIBLING, Relation.SIBLING);
        tree.addLink(person5, person6, Relation.SIBLING, Relation.SIBLING);

        tree.addLink(person1, person3, Relation.GRANDPARENT, Relation.GRANDCHILD);
        tree.addLink(person1, person4, Relation.GRANDPARENT, Relation.GRANDCHILD);
        tree.addLink(person2, person5, Relation.GRANDPARENT, Relation.GRANDCHILD);
        tree.addLink(person2, person6, Relation.GRANDPARENT, Relation.GRANDCHILD);
        tree.addLink(person4, person7, Relation.GRANDPARENT, Relation.GRANDCHILD);

        System.out.println("Программа готова к работе\n");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите желаемую операцию:\n" +
                "1 - Определить детей\n" +
                "2 - Определить братьев/сестёр\n" +
                "3 - Определить родителей\n" +
                "4 - Определить дедушек и бабушек\n" +
                "5 - Вывести отсортированный список (Comparable)\n" +
                "6 - Вывести данные по персоне (Iterator)\n");

//        int choice = myScan.nextInt();

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        String name = null;

        if (choice !=5) {
            System.out.println("Введите имя:\n");
            name = myScan.nextLine();
        }


        switch (choice) {
            case 1:
                Research.printAllRelatives(name, tree, Relation.PARENT);
                break;
            case 2:
                Research.printAllRelatives(name, tree, Relation.SIBLING);
                break;
            case 3:
                Research.printAllRelatives(name, tree, Relation.CHILD);
                break;
            case 4:
                Research.printAllRelatives(name, tree, Relation.GRANDCHILD);
                break;
            case 5:

                Set mySet = new TreeSet();
                mySet.add(person1);
                mySet.add(person2);
                mySet.add(person3);
                mySet.add(person4);
                mySet.add(person5);
                mySet.add(person6);
                mySet.add(person7);

                for (Object o: mySet){
                    System.out.println(o);
                }
                break;
            case 6:

                List <Human> myArList = new ArrayList<>();
                myArList.add(person1);
                myArList.add(person2);
                myArList.add(person3);
                myArList.add(person4);
                myArList.add(person5);
                myArList.add(person6);
                myArList.add(person7);

                Human foundPerson = null;
                Iterator<Human> myIter = myArList.iterator();
                while (myIter.hasNext() && foundPerson == null) {
                    Human tempHuman = myIter.next();
                    String tempName = tempHuman.name;
                    if (tempName.equals(name)) {
                        foundPerson = tempHuman;
                    }
                }
                Iterator<String> PersonData = (Person) foundPerson;
                while (PersonData.hasNext()){
                    System.out.println(PersonData.next());
                }
                break;

            default:
                System.out.println("Введено неверное значение");
        }

    }

}
