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

import java.util.Scanner;

class Sem1 {
    public static void main(String[] args) {

        // ввод чисел

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("Рассчитываю выражение %d в степени %d \n", a,b);

        // Определяем тип операции
        int r = 1;
        float rr = 1;

        if (b>0) {
            for (int i = 0; i < b; i++) {
                r *= a;
            }
            System.out.printf("Результат: %d", r);
        }

        if(b<0) {
            for (int i = 0; i < b*(-1); i++) {
                rr *= a;
            }
            rr = 1 / rr;
            System.out.printf("Результат: %f", rr);
        }
        if (b==0){
            if ((b==0)&&(a==0)){
                System.out.printf("не определено");
            }else System.out.printf("Ответ: 1");
        }




//        System.out.printf("Результат %f", r);

    }


}





