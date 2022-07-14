package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Task2 {

    private static ArrayList<int[]> digitsList = new ArrayList<>(); // для  Task3Ver2();

    public static void main(String[] args) {


//        Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций),
//        протестировать можно при выводе последовательности треугольного числа до n
//        Приер
//        1
//        1 3
//        1 3 6

        Task2();

    }

    public static void Task2() {
        // n - количество элементов массива
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите n: ");

        //    Проверка на соответствие получаемого типа
        while (inputScanner.hasNextInt()==false){
            System.out.print("Ошибка ввода. Требуется ввести целое число: ");
            inputScanner.next();
        }

        int n = inputScanner.nextInt();
//        System.out.println(n);

//      создаём служебный массив
        int[] tempArray = new int[0];

        for (int i = 0; i < n; i++) {
//          создаём новый элемент алгоритмом треугольного числа
            int newElement = triangle(i+1);
//          добавляем новый элемент в новый массив
            int[] newArray = addArrayElement(tempArray, newElement, i);

            System.out.println("Сгенерирован массив: ");
            System.out.println(Arrays.toString(newArray));
            tempArray = newArray;

        }
        inputScanner.close();
       }

    public static int triangle(int n) {
//      Возвращает n-ое треугольного числа.

        int t = (int)(1d/2*n*(n+1));

//        System.out.printf("Результат %d \n", t);
        return t;
    }

    // добавляет элемент к массиву
    public static int[] addArrayElement(int[] oldArray, int newElement, int index) {

        int newArray[] = new int[index+1];
        if (index!=0) {
            for (int i = 0; i < index; i++) {
                newArray[i] = oldArray[i];

            }
        }
        newArray[index] = newElement;
        return newArray;

    }



}

