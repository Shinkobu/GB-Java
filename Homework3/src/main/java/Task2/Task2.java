package Task2;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws InterruptedException {
//        �������� �����, ������� ��������� ���������� ������ � ������ (��� ������ � ���������� ���������)
//        � ��� ������ ����������� try-catch ���������� ���������� ������ (����� ���������� ����������� �������
//        �� 6 � ����� 3 ������� ������ ���� ���������, ��� �� ��������� ���������� �������, ������� �����������
//        ��� ������ ����� ��������� �� ��������� �����. � ����� ������� �������� - �����)

        String login = "admin";
        String password = "asdf";
        int attempt = 0;

        Scanner myScanner = new Scanner(System.in);
        passCheck(myScanner,password,login,attempt);
        myScanner.close();
    }

    public static void passCheck (Scanner myScanner, String password, String login, int attempt) throws InterruptedException {

        if (attempt == 3) {
            System.out.println("�� ����� ����� ������ ������� ��� ����. ��������� ���� �������� ����� 5 ������");
            Thread.sleep(5000);
        }
        if (attempt == 6) {
            System.out.println("�� ��������� ����� �������. ��������� ���� ����������");
            return;
        }

        System.out.println("������� �����: ");
        String tempLogin = myScanner.next();

        System.out.println("������� ������: ");
        String tempPass = myScanner.next();

        if (login.equals(tempLogin) & password.equals(tempPass)){
            System.out.println("����� � ������ �����");
            return;

        }else {
            System.out.println("\n���� ����� + ������ �� �����, ��������� ����");
            attempt++;
            passCheck(myScanner, password,login,attempt);
        }
    }
}
