package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task3 {

    private static ArrayList<int[]> digitsList = new ArrayList<>(); // для  Task3Ver2();

    public static void main(String[] args) {

//        *+Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса,
//        например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.

        // исходим из того, что в каждом числе может быть только замена только одной цифры на "?"
//        Task3();

        // Версия 2. исходим из того, что знаков вопроса может быть несколько в каждом числе
        Task3Ver2();
        /*
        1) Вводим числа с ?
        2) Начинаем перебор всех значений (список списков?)
        3) Ограничение - проверка на цифры указанные в числе (сделать рекурсию или цикл)
        Если при переборе цифры совпадают с введёнными пользователем, то число используется для проверки равенства


        * */


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

    public static void Task3Ver2() {

        //  ввод значений

        Scanner MyScan = new Scanner(System.in);
        System.out.println("Решаем уравнение q + w = e. Введите выражение: ");
        String formula = MyScan.nextLine();
        formula = formula.replace(" ", "");
        char[] chars = formula.toCharArray();
        int formulaLen = chars.length;
//        System.out.println(formulaLen);

        // находим знаки вопроса и отмечаем их положение в списке

        List<Integer> questionMarkList = new ArrayList<>();

        for (int i = 0; i < formulaLen; i++) {
//            Проверка на правильность ввода
            if (chars[i] != '?' & chars[i] != '+' & chars[i] != '=' & !Character.isDigit(chars[i])) {
                System.out.println("Ошибка ввода. Попробуйте ещё раз");
                return;
            }
            if (chars[i] == '?') questionMarkList.add(i);

        }
        System.out.println("Успешный ввод, идёт анализ");

        // получаем список массивов с перебором всех комбинаций из n разрядов

        int decade = questionMarkList.size();
        int index = 0;
        int[] comb = new int[decade];

        generate(comb, index);

//        System.out.println(Arrays.deepToString(digitsList.toArray()));
//        System.out.println(digitsList.get(1)[1]);
//        System.out.println((char) digitsList.get(1)[1]);
//        System.out.println((int)(char) digitsList.get(1)[1]);

        // заменяем поочерёдно знаки вопроса на значения цифр из списка массивов

        boolean success = false; // указатель, найдено ли решение

        // по всем сочетаниям цифр


        for (int i = 0; i < Math.pow(10,decade) ; i++) {
            // меняем в строке ? на цифры
            for (int j = 0; j < questionMarkList.size(); j++) {
//                chars[questionMarkList.get(j)] = (char) digitsList.get(i)[j];
                chars[questionMarkList.get(j)] = Character.forDigit(digitsList.get(i)[j],10) ;
            }
//            System.out.println(chars);
//            System.out.println((int) chars[1]);
//            System.out.println((int) chars[2]);

            // разбираем формулу - массив на цифры и знаки + =
            String q = "";
            String w = "";;
            String e = "";;
            int k = 0;

            for (k = 0; k < chars.length; k++) {
                if (chars[k] != '+') q = q + chars[k];
                else break;
                }

            for (k = k + 1; k < chars.length; k++) {
                if (chars[k] != '=') w = w + chars[k];
                else break;
                }

            for (k = k + 1; k < chars.length; k++) {
                    e = e + chars[k];
                }
//            System.out.println(q);
//            System.out.println(w);
//            System.out.println(e);
            int qInt = Integer.parseInt(q);
            int wInt = Integer.parseInt(w);
            int eInt = Integer.parseInt(e);


            if ((qInt + wInt) == eInt) {
                System.out.println("Решение найдено: " + q + " + " + w + " = " + e + "\n");
                success = true;
                return;

            }

        }

    if (success == false) System.out.println("\nРешение не найдено");


    }


// Взят для основы пример с семинара - метод вычисляет массивы с цифрами и записывает их в список массивов digitsList
    public static void generate(int[] comb, int index) {
        if (comb.length == index){
            digitsList.add(comb.clone());
            return;

        }
        for (int i = 0; i < 10; i++) {
            comb[index] = i;
            generate(comb, index +1);

        }
    }


    // Не используется. возвращает список списков из n разрядов

    public static ArrayList<ArrayList<Integer>> ArrArr (int n) {

        ArrayList<ArrayList<Integer>> MyArrList = new ArrayList<>();
        int k = (int) Math.pow(10,n);
        for (int i = 0; i < k; i++) {
            MyArrList.add(ArrGen(i,n)); // на позицию c индексом n

        }
//        System.out.println(MyArrList);
        return MyArrList;

    }

    // Не используется    // создаёт список цифр из числа i/ Y
    public static ArrayList<Integer> ArrGen(int i, int n) {
        ArrayList<Integer> tempAL = new ArrayList<>(n);


        for (int j = n; j >= 1; j--) {
            int tempPow = (int) Math.pow(10,j-1);
            int k = i / (int) Math.pow(10,j-1);
            tempAL.add(k);
            i = i % (int) Math.pow(10,j-1);
//            System.out.println(k);

        }
        System.out.println(tempAL);
        return tempAL;

    }

}

