import java.util.Scanner;

class Sem1 {
    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        Tasks.Task1();
        Tasks.Task2();
    }
}

class Tasks {

    public static void Task1() {

        //   ����������� ������� ���������� ����� � � ������� b. a, b ? Z. ����� ���������� ����������� �������� � ��������.
//        ������ 1: � = 3, b = 2, �����: 9
//        ������ 2: � = 2, b = -2, �����: 0.25
//        ������ 3: � = 3, b = 0, �����: 1
//        ������ 4: � = 0, b = 0, �����: �� ����������
//        ������ 5
//        ������� ������ ��������� � ����� input.txt � ����
//        b 3
//        a 10
//        ��������� ����� ��������� � ����� output.txt
//        1000

        // ���� �����

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("������� ����� a: ");
        int a = iScanner.nextInt();
        System.out.printf("������� ����� b: ");
        int b = iScanner.nextInt();
        System.out.printf("����������� ��������� %d � ������� %d \n", a, b);

        // ���������� ��� ��������
        int r = 1;
        float rr = 1;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                r *= a;
            }
            System.out.printf("���������: %d", r);
        }

        if (b < 0) {
            for (int i = 0; i < b * (-1); i++) {
                rr *= a;
            }
            rr = 1 / rr;
            System.out.printf("���������: %f", rr);
        }
        if (b == 0) {
            if ((b == 0) && (a == 0)) {
                System.out.printf("�� ����������");
            } else System.out.printf("�����: 1");
        }
    }

    public static void Task2() {
//        +�� ���� ���������� ����������� ������� ��� ����� (a, b). � ����������� ���� ��� �������
//                - ������� 1 (�1): ��������� � � ����, � ���������� �� c
//                - ������� 2 (�2): ��������� �� d ( +2 ), � a ������������ d
//        �������� ���������, ������� ����� ����� ������, ����������� ����� a ���������� � ����� b ��� ��������, ��� ��� ����������
//        ������ 1: � = 1, b = 7, c = 2, d = 1
//        �����: �1, �1, �1, �1, �1, �1 ��� �1, �2, �1, �1, �1 ��� �1, �1, �2, �1.
//        ������ 2: � = 11, b = 7, c = 2, d = 1
//        �����: ��� �������.
//      *�������� ��� ���, ��� ������� ����������� ���������� ������

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("������� ����� a: ");
        int a = iScanner.nextInt();
        System.out.printf("������� ����� b: ");
        int b = iScanner.nextInt();
        int c = 2;
        int d = 1;
        int k1 = 0;
        int k2 = 0;
        String StringK12 = "";


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




