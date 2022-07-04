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

//        Task2();


//        *+Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса,
//        например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.

        // исходим из того, что в каждом числе может быть только замена только одной цифры на "?"
        Task3();


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

    public static void Task3() {

        Scanner MyScan = new Scanner(System.in);
        System.out.println("Решаем уравнение q + w = e. Введите число q = ");
        String q = MyScan.nextLine();
//        System.out.printf("q = %s\n", q);
        System.out.println("Введите число w = ");
        String w = MyScan.nextLine();
//        System.out.printf("w = %s", w);
        System.out.println("Введите число e = ");
        int e = MyScan.nextInt();
//        System.out.printf("e = %d", e);

        int[] qArray = questionToDigit(q);
//        System.out.println("Число q и индекс знака вопроса" + Arrays.toString(qArray));
        int[] wArray = questionToDigit(w);
//        System.out.println("Число w и индекс знака вопроса" + Arrays.toString(wArray));

        equationSolution(qArray,wArray,e);

    }

    public static int[] questionToDigit (String str) {

//      преобразуем строку в массив для анализа
        char[] chars = str.toCharArray();
        int newDigit = 0;

        boolean questionMarkSwitch = false; // признак, что встретился знак вопроса
        int targetIndex = 0; // индекс со знаком ?

        // проходим по числу от меньших разрядов к большим


        for (int i = chars.length - 1; i >= 0; i--) {
            int ind = chars.length - 1 - i;
//            System.out.println("chars[i] and ind " + chars[i] + " " + ind);
            // преобразуем цифры в число

            if (Character.isDigit(chars[i])) {
                newDigit += (chars[i] - '0') * (Math.pow(10, ind));
//                System.out.println("newDigit = " + newDigit);

            } else if (chars[i] == '?' && questionMarkSwitch == false) {
                targetIndex = ind;
//                System.out.println("targetIndex = " + targetIndex);
                questionMarkSwitch = true;

            } else {
                System.out.println("Недопустимое значение: " + str + "\nПопробуйте снова");
                break;
            }
        }

        if (questionMarkSwitch == false){
            targetIndex = -1;
        }

        int [] outputArray = new int[]{newDigit, targetIndex};
        return outputArray;

    }

    public static void equationSolution(int[] qArray, int[] wArray, int e) {
        int q = qArray[0];
        int qQuestionIndex = qArray[1];
        int qNoQMark = 1;
        if (qQuestionIndex == -1) qNoQMark = 0; // если нет знака вопроса в числе
        int w = wArray[0];
        int wQuestionIndex = wArray[1];
        int wNoQMark = 1;
        if (wQuestionIndex == -1) wNoQMark = 0;  // если нет знака вопроса в числе

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double qIter = q + ((Math.pow(10, qQuestionIndex))*i*qNoQMark);
                double wIter = w + ((Math.pow(10, wQuestionIndex))*j*wNoQMark);


                if ( (qIter + wIter) == e){
                    System.out.printf("\nРешение найдено: " + (int)qIter + " + " + (int)wIter + " = " + e );
                    return;
                }
                
            }
        }
        System.out.println("\nРешение не найдено");
    }
}

