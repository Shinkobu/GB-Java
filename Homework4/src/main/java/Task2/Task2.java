package Task2;

import Task1.Task;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

//      Задачи
        Tasks passport = new Passport();
        Tasks carLicense = new CarLicense();
        Tasks kinderGarden = new KinderGargen();
        Tasks flatRegistration = new FlatRegistration();
        Tasks childBirth = new ChildBirth();
        Tasks pension = new Pension();
        Tasks surnameChange = new SurnameChange();

//      Список задач

        ArrayList<Tasks> tasksList = new ArrayList<>();

        tasksList.add(passport);
        tasksList.add(carLicense);
        tasksList.add(kinderGarden);
        tasksList.add(flatRegistration);
        tasksList.add(childBirth);
        tasksList.add(pension);
        tasksList.add(surnameChange);

//        System.out.println(tasksList);

//      Массив с индексами

        Integer[] indexArr = new Integer[7];

        for (int i = 0; i < indexArr.length; i++) {
            indexArr[i] = i;
        }

        List <Integer> tempList = Arrays.asList(indexArr);
        Collections.shuffle(tempList);
        tempList.toArray(indexArr);

        System.out.println("\nИмеем массив с индексами: \n" + Arrays.toString(indexArr));


        Deque<Tasks> myQueue = new LinkedList<Tasks>();

        for (int i = 0; i < indexArr.length; i++) {
            myQueue.add(tasksList.get(indexArr[i]));
        }
        System.out.println("\nИмеем очередь заданий: \n" + myQueue);

        System.out.println("\nНачало работы\n");

//        if (myQueue.peekFirst().prioritet() > myQueue.peekFirst().prioritet())
        while (myQueue.size() != 0){
            System.out.println(myQueue);
            myQueue.pollFirst();

        }


    }
}
