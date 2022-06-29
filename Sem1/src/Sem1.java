
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;




class Sem1 {
    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        Tasks.Task1();
//        Tasks.Task2();
        Tasks.generate(1, 7, 1, 2, "");
    }
}

class Tasks {
    //    public static double powerNumbers(double a, double b); // принимает и может возвращать значения через return
    public static void Task1() {

        //   Реализовать функцию возведения числа а в степень b. a, b ? Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
//        Пример 4: а = 0, b = 0, ответ: не определено
//        Пример 5
//        входные данные находятся в файле input.txt в виде
//        b 3
//        a 10
//        Результат нужно сохранить в файле output.txt
//        1000

        // ввод чисел

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("Рассчитываю выражение %d в степени %d \n", a, b);


        // Определяем тип операции
        int r = 1;
        float rr = 1;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                r *= a;
            }
            System.out.printf("Результат: %d", r);
            writeToFile(r);
        }

        if (b < 0) {
            for (int i = 0; i < b * (-1); i++) {
                rr *= a;
            }
            rr = 1 / rr;
            System.out.printf("Результат: %f", rr);
            writeToFile(rr);
        }
        if (b == 0) {
            if ((b == 0) && (a == 0)) {
                System.out.printf("не определено");

            } else System.out.printf("Ответ: 1");
            writeToFile(1);
        }
    }

    public static void Task2() {
//        +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
//                - команда 1 (к1): увеличить в с раза, а умножается на c
//                - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
//        написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
//        Пример 1: а = 1, b = 7, c = 2, d = 1
//        ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
//        Пример 2: а = 11, b = 7, c = 2, d = 1
//        ответ: нет решения.
//      *Подумать над тем, как сделать минимальное количество команд

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        int c = 2;
        int d = 1;
        int k1 = 0;
        int k2 = 0;
        String StringK12 = "";

        if (a > b) {
            System.out.printf("Решение невозможно");

        } else {

            while ((a * c) <= b) {
                a *= c;
                k1++;
                StringK12 += "k1, ";
                //            System.out.println(k1);
                //            System.out.println(a);
                //            System.out.print("\n");
            }
            while ((a + d) <= b) {
                a += d;
                k2++;
                StringK12 += "k2, ";
                //            System.out.println(k2);
                //            System.out.println(d);
                //            System.out.print("\n");
            }
            System.out.printf("k1 = %d \n", k1);
            System.out.print(StringK12);
            //        System.out.println(k1);
            //        System.out.println(k2);
        }
    }

    public static void writeToFile(double res) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write((Double.toString(res)));
            fw.append('\n');
//            fw.append(res);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Task2_1(String[] args) {
        ;
    }

    public static void generate(int source, int target, int c, int d, String path) {
        if (source > target){
//            System.out.println(path);
            return;
        }
        if (source == target) {
            System.out.println(path);
            return;
        }

        generate(source + c, target, c, d, path + " k1");
        generate(source * d, target, c, d, path + " k2");


    }
}




