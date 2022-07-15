package Task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task1 {

    private static ArrayList<int[]> digitsList = new ArrayList<>(); // для  Task3Ver2();

    public static void main(String[] args) {


//      У вас есть отсортированный массив
//      нужно используя минимальное количество попыток найти загаданное число (Алгоритм бинарного поиска)

        Task1();


    }


    public static void Task1() {

        Scanner myScan = new Scanner(System.in);
        int rawArray[]; // объявление массива
        rawArray = new int[10]; // выделение памяти для массива
//        sortedArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        // Заполняем массив случайными числами
        for (int i = 0; i < rawArray.length ; i++) {
            rawArray[i] = (int) (Math.random()*100); // Диапазон [0;1) умножается на 100. ( Math.random() * (b-a) ) + a, при интервале (a;b]
        }
        System.out.println("Сгенерирован массив: ");
        System.out.println(Arrays.toString(rawArray));

        // сортировка
        int [] sortedArray = shuttleSort(rawArray);


        System.out.println("\nОтсортированный массив: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.printf("\nВведите искомое число: ");

        // проверка на вводимое число
        while (myScan.hasNextInt()==false){
            System.out.printf("Ошибка ввода. Требуется ввести целое число: ");
            myScan.next();
        }
        int digitToFind = myScan.nextInt();
        myScan.close();

        // поиск числа рекурсией
        Task1RecursionSearch(sortedArray,digitToFind,0,sortedArray.length-1);
    }

    public static void Task1RecursionSearch(int[] sortedArray, int digitToFind, int firstIndex, int lastIndex ) {

     int targetIndex = (firstIndex+lastIndex) / 2;

     if (firstIndex==lastIndex){
         System.out.println("\nЧисло не найдено\n");
         return;
     }
     if (sortedArray[targetIndex] == digitToFind) {
         System.out.printf("\nНайдено число на позиции %d\n", targetIndex+1);
         return;
     }

     if (sortedArray[targetIndex]>digitToFind){
        lastIndex = targetIndex-1;
         Task1RecursionSearch(sortedArray, digitToFind, firstIndex,lastIndex);
     }
     else {
        firstIndex = targetIndex+1;
         Task1RecursionSearch(sortedArray, digitToFind, firstIndex,lastIndex);
     }


    }

    public static int[] shuttleSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                temp = array[i];
                array[i] = array [i-1];
                array[i-1] = temp;

                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        temp = array[z];
                        array[z] = array [z-1];
                        array[z-1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
    }


}

