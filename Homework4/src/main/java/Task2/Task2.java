package Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

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
        Collections.shuffle(tempList);
        tempList.toArray(indexArr);

        System.out.println("\nИмеем массив с индексами: \n" + Arrays.toString(indexArr));

//      Очередь задач, её заполнение

        Deque<Tasks> myQueue = new LinkedList<Tasks>();

        for (int i = 0; i < indexArr.length; i++) {

//          Определение приоритета попадания в очередь

            try {
                Integer d1 = indexArr[i];
                Integer d2 = indexArr[i+1];

                if (d1 < d2){
                    Integer tempInt = indexArr[i];
                    indexArr[i] = indexArr[i+1];
                    indexArr[i+1] = tempInt;
                }
            }catch (ArrayIndexOutOfBoundsException e){

            }

            System.out.println("Расстановка с учётом приоритета: " + Arrays.toString(indexArr));

            myQueue.add(tasksList.get(indexArr[i]));
        }
        System.out.println("\nИмеем очередь заданий: \n" + myQueue);

//      Начало работы МФЦ

        System.out.println("\nНачало работы\n");

        int s = 1;

//        if (myQueue.peekFirst().prioritet() > myQueue.peekFirst().prioritet())
        while (myQueue.size() != 0){

            Iterator<Tasks> myIterator = myQueue.iterator();
            Iterator<Tasks> myIterator1 = myQueue.iterator();
            String showName = "";
            String showPrior = "";
            while (myIterator.hasNext()) showName += myIterator.next().name() + " / ";
            while (myIterator1.hasNext()) showPrior += myIterator1.next().prioritet() + " / ";


            System.out.println("Шаг "+s+". Очередь имеет вид: " + showName);
            System.out.println("       Приоритет: " + showPrior);

            myQueue.pollFirst();
            s++;

        }


    }
}
