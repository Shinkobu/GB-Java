package Homework6_Solid.Controller;

import java.util.Scanner;

public class UserMenu {
    public static int userMenu(){

        System.out.println("\nВыберите пользователя\n");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Выберите пользователя:\n" +
                "1 - Alex (User)\n" +
                "2 - Nikolay (User)\n" +
                "3 - Fedor (Moderator, can edit messages)\n" +
                "4 - Peter (Admin, can edit messages, delete messages)\n");

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        return choice;
    }
}
