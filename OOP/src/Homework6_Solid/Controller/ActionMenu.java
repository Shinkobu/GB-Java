package Homework6_Solid.Controller;

import java.util.Scanner;

public class ActionMenu {
    public static int actionMenu(){

        Scanner myScan = new Scanner(System.in);
        System.out.println("�������� ��������:\n" +
                "1 - ����� ��������� � ������\n" +
                "2 - ������������� ��������� ��������� (�����, Moderator and Admin)\n" +
                "3 - ������� ��������� (only Admin)\n" +
                "4 - ����� �� ����������\n");
//                "4 - �������� ������������ (Moderator and Admin)\n" +
//                "5 - ������ ������������ �� ���-����� (Moderator and Admin)\n");

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        return choice;
    }
}
