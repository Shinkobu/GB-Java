package Homework6_Solid.Controller;

import java.util.Scanner;

public class ActionMenu {
    public static int actionMenu(){

        Scanner myScan = new Scanner(System.in);
        System.out.println("Выберите действие:\n" +
                "1 - Новое сообщение в беседе\n" +
                "2 - Редактировать последнее сообщение (Автор, Moderator and Admin)\n" +
                "3 - Удалить сообщение (only Admin)\n" +
                "4 - Поиск по сообщениям\n");
//                "4 - Забанить пользователя (Moderator and Admin)\n" +
//                "5 - Убрать пользователя из бан-листа (Moderator and Admin)\n");

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        return choice;
    }
}
