package Homework2;

import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Human person1 = new Person("Александр Невский", 1221, 1263);
        Human person2 = new Person("Даниил", 1261, 1303);
        Human person3 = new Person("Юрий", 1281, 1325);
        Human person4 = new Person("Иван Калита", 1288, 1340);
        Human person5 = new Person("Семён Гордый", 1317, 1353);
        Human person6 = new Person("Иван II Красный", 1326, 1359);
        Human person7 = new Person("Дмитрий Донской", 1350, 1389);


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

        List<Human> myArList = new ArrayList<>();
        myArList.add(person1);
        myArList.add(person2);
        myArList.add(person3);
        myArList.add(person4);
        myArList.add(person5);
        myArList.add(person6);
        myArList.add(person7);

        System.out.println("Программа готова к работе\n");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите желаемую операцию:\n" +
                "1 - Определить детей\n" +
                "2 - Определить братьев/сестёр\n" +
                "3 - Определить родителей\n" +
                "4 - Определить дедушек и бабушек\n" +
                "5 - Вывести отсортированный список\n" +
                "6 - Вывести данные по персоне (Iterator)\n" +
                "7 - Вывести титулы Александра Невского (Iterable)\n" +
                "8 - Вывести отсортированный список по датам рождения в обратном порядке (Comparator)\n" +
                "9 - Сравнить года рождения двух персон (Comparable)\n");

//        int choice = myScan.nextInt();

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        String name = null;

        if (choice != 5 && choice != 7 && choice != 8 && choice != 9) {
            System.out.println("Введите имя:\n");
            name = myScan.nextLine();
        }
            ResearchMethods myRes = new Research();
            switch (choice) {

                case 1:
                    myRes.printAllRelatives(name, tree, Relation.PARENT);
                    break;
                case 2:
                    myRes.printAllRelatives(name, tree, Relation.SIBLING);
                    break;
                case 3:
                    myRes.printAllRelatives(name, tree, Relation.CHILD);
                    break;
                case 4:
                    myRes.printAllRelatives(name, tree, Relation.GRANDCHILD);
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

                    for (Object o : mySet) {
                        System.out.println(o);
                    }
                    break;
                case 6:

                    Human foundPerson = Research.findPerson(name, myArList);

                    Iterator<String> PersonData = (Person) foundPerson;
                    while (PersonData.hasNext()) {
                        System.out.println(PersonData.next());
                    }
                    break;

                case 7:

                    person1.addTitle("Князь Новгородский");
                    person1.addTitle("Князь Владимирский");
                    person1.addTitle("Князь Киевский");

                    for (var element : person1) {
                        System.out.println(element);
                    }
                    break;
                case 8:
                    System.out.println("\nНачальный список\n");
                    for (Object o : myArList) {
                        System.out.println(o);
                    }

                    myArList.sort(new AgeComparator());

                    System.out.println("\nСписок отсортированный по датам рождения в обратном порядке:\n");
                    for (Object o : myArList) {
                        System.out.println(o);
                    }

                    break;
                case 9:

                    System.out.println("Введите первое имя:\n");
                    String name1 = myScan.nextLine();
                    System.out.println("Введите второе имя:\n");
                    String name2 = myScan.nextLine();

                    Person foundPerson1 = Research.findPerson(name1, myArList);
                    Person foundPerson2 = Research.findPerson(name2, myArList);
                    System.out.println("\nПервая персона: " + foundPerson1);
                    System.out.println("Вторая персона: " + foundPerson2 + "\n");

                    switch (foundPerson1.compareTo(foundPerson2)) {
                        case -1 -> System.out.println(foundPerson1.name + " родился раньше, чем " + foundPerson2.name);
                        case 1 -> System.out.println(foundPerson2.name + " родился раньше, чем " + foundPerson1.name);
                        case 0 -> System.out.println(foundPerson1.name + " и " + foundPerson2.name + " родились в один год");
                    }


                    break;

                default:
                    System.out.println("Введено неверное значение");
            }

        }
    }
