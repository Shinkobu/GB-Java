package Seminar1;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("Александр Невский");
        Person person2 = new Person("Даниил");
        Person person3 = new Person("Юрий");
        Person person4 = new Person("Иван Калита");
        Person person5 = new Person("Семён Гордый");
        Person person6 = new Person("Иван II Красный");
        Person person7 = new Person("Дмитрий Донской");


        Tree tree = new Tree();
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
                "4 - Определить дедушек и бабушек\n");

//        int choice = myScan.nextInt();

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());

        System.out.println("Введите имя:\n");

        String name = myScan.nextLine();

        switch (choice){
            case 1:
                Research.printAllRelatives(name,tree, Relation.PARENT);
                break;
            case 2:
                Research.printAllRelatives(name,tree, Relation.SIBLING);
                break;
            case 3:
                Research.printAllRelatives(name,tree, Relation.CHILD);
                break;
            case 4:
                Research.printAllRelatives(name,tree, Relation.GRANDCHILD);
                break;
            default:
                System.out.println("Введено неверное значение");
        }

    }

}
