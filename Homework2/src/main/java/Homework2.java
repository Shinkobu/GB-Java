import java.util.Arrays;
import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {

//      У вас есть отсортированный массив
//      нужно используя минимальное количество попыток найти загаданное число (Алгоритм бинарного поиска)

//        Task1();

//        Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций),
//        протестировать можно при выводе последовательности треугольного числа до n
//        Приер
//        1
//        1 3
//        1 3 6

        Task2();

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

    public static void Task2() {
        int[] myArray = new int[]{1,2,3};
        System.out.println(Arrays.toString(myArray));
        int[] tempArray = new int[myArray.length+1];
        System.out.println(Arrays.toString(tempArray));



        Scanner inputScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");

        //    Проверка на соответствие получаемого типа
        while (inputScanner.hasNextInt()==false){
            System.out.printf("Ошибка ввода. Требуется ввести целое число: ");
            inputScanner.next();
        }

        int n = inputScanner.nextInt();



        System.out.println(n);


        // определяем n - номер треугольного числа
        // выводим массив из 1 числа, потом из 2, потом из 3....до n
        for (int i = 1; i < n; i++) {

        }
        myArray = new int[]{1,2,3,4,5};

        System.out.println("Сгенерирован массив: ");
        System.out.println(Arrays.toString(myArray));

//        for (int i = 0; i < myArray.length-1; i++) {
//        tempArray[i] = myArray[i];
//
       }

    public static int triangle(int n) {
//      Возвращает массив n-ого треугольного числа.


//        Вычисляем результат
        int t = (int)(1d/2*n*(n+1));


        System.out.printf("Результат %d", t);
        return t;
    }



}

