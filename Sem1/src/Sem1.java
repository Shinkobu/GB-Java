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

import java.util.Scanner;

class Sem1 {
    public static void main(String[] args) {

        // ���� �����

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("������� ����� a: ");
        int a = iScanner.nextInt();
        System.out.printf("������� ����� b: ");
        int b = iScanner.nextInt();
        System.out.printf("����������� ��������� %d � ������� %d \n", a,b);

        // ���������� ��� ��������
        int r = 1;
        float rr = 1;

        if (b>0) {
            for (int i = 0; i < b; i++) {
                r *= a;
            }
            System.out.printf("���������: %d", r);
        }

        if(b<0) {
            for (int i = 0; i < b*(-1); i++) {
                rr *= a;
            }
            rr = 1 / rr;
            System.out.printf("���������: %f", rr);
        }
        if (b==0){
            if ((b==0)&&(a==0)){
                System.out.printf("�� ����������");
            }else System.out.printf("�����: 1");
        }




//        System.out.printf("��������� %f", r);

    }


}





