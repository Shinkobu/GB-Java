package Homework6_Solid;

import Homework6_Solid.users.AbstractUser;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Controller {

    public static void run() throws IOException {

        AbstractUser CurrentUser = null;

        int choice1 = userMenu();

        switch (choice1) {
            case 1:
                CurrentUser = Database.getUsersDatabase().get(0);
                break;
            case 2:
                CurrentUser = Database.getUsersDatabase().get(1);
                break;
            case 3:
                CurrentUser = Database.getUsersDatabase().get(2);
                break;
            case 4:
                CurrentUser = Database.getUsersDatabase().get(3);
                break;
        }

        int choice2 = actionMenu();

        switch (choice2) {
            case 1:
                writeMessage(CurrentUser);
                break;
            case 2:
                editMessage(CurrentUser);
                break;
            case 3:
                deleteMessage(CurrentUser);
                break;
            case 4:
                findMessage();
                break;
        }

        run();

    }

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

    public static void writeMessage(AbstractUser CurrentUser){

        Scanner myScan = new Scanner(System.in);
        System.out.println(CurrentUser.getName() + " : ");
        String currentText = myScan.nextLine();
        Message currentMessage = new Message(currentText, formattedTime(),CurrentUser);
//        System.out.println("\nСообщение имеет вид:\n");
//        System.out.println(currentMessage.toString());

        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.enterNewMessage(currentMessage);

        showChat();

    }

    public static void editMessage(AbstractUser user){
        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.editMessage(user);
        showChat();

    }

    public static void deleteMessage(AbstractUser user){
        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.deleteMessage(user);
        showChat();

    }

    public static String formattedTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;

    }

    public static void showChat(){
        System.out.println("\nБеседа имеет вид:\n");
        Database.showDB();
    }

    public static void findMessage() {
        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.findMessage();

    }
}
