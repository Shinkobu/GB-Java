package Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

//      Задачи
        Tasks passport = new Passport();
        Tasks carLicense = new CarLicense();
        Tasks kinderGarden = new KinderGarden();
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
//      Случайный порядок (массив имеет индексы, которые будут обозначать место объекта в tasksList)
        Collections.shuffle(tempList);
        tempList.toArray(indexArr);

        System.out.println("\nИмеем массив с индексами: \n" + Arrays.toString(indexArr));

//      Очередь задач

        Deque<Tasks> myQueueNoPrior = new LinkedList<Tasks>();

        for (int i = 0; i < indexArr.length; i++) {
            myQueueNoPrior.add(tasksList.get(indexArr[i]));
        }

        myIterator(myQueueNoPrior," Исходная очередь имеет вид: ");

//      Расстановка очереди с учётом приоритета

        Deque<Tasks> myQueuePrior = new LinkedList<Tasks>();

        int j = myQueueNoPrior.size();
        Tasks temp1 = myQueueNoPrior.pop();
        Tasks temp2 = myQueueNoPrior.pop();

        for (int i = 0; i < j-2; i++) {

            if (temp1.prioritet()>temp2.prioritet()) {
                myQueuePrior.add(temp1);
                temp1 = myQueueNoPrior.pop();
            }
            else {
                myQueuePrior.add(temp2);
                temp2 = myQueueNoPrior.pop();
            }

//            myIterator(myQueueNoPrior);
//            myIterator(myQueuePrior);
        }

        if (temp1.prioritet()>temp2.prioritet()) {
            myQueuePrior.add(temp1);
            myQueuePrior.add(temp2);
        }
        else {
            myQueuePrior.add(temp2);
            myQueuePrior.add(temp1);
        }

        myIterator(myQueuePrior, " Очередь с поправкой на приоритет: ");

//      Начало работы МФЦ

        System.out.println("\nНачало работы\n");

        int s = 1;

        while (myQueuePrior.size() != 0){

            myIterator(myQueuePrior,"Шаг "+s+". Очередь имеет вид: ");
            System.out.println("       В окно идёт задача " + myQueuePrior.peekFirst().name());
            myQueuePrior.pollFirst();
            s++;
            Thread.sleep(1000);

        }


    }

    public static void myIterator(Queue <Tasks> someQueue, String queueComment) {
        Iterator<Tasks> myIterator = someQueue.iterator();
        Iterator<Tasks> myIterator1 = someQueue.iterator();
        String showName = "";
        String showPrior = "";
        while (myIterator.hasNext()) showName += myIterator.next().name() + " / ";
        while (myIterator1.hasNext()) showPrior += myIterator1.next().prioritet() + " / ";
        System.out.println("\n" + queueComment + showName);
        System.out.println("       Приоритеты объектов очереди: " + showPrior);
    }

}
