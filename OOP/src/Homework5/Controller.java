package Homework5;

import Homework5.users.AbstractUser;
import Homework5.users.Moderator;
import Homework5.users.User;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Homework4.CsvExpImp.exportToCsv;
import static Homework4.CsvExpImp.importFile;

public class Controller {

    public static void run() throws IOException {

        AbstractUser Alex = new User("Alex", "123",AccessRights.READ_WRITE);
        AbstractUser Nikolay = new User("Nikolay", "456", AccessRights.READ_WRITE);
        AbstractUser Fedor = new Moderator("Fedor", "qwerty%%^^",AccessRights.READ_WRITE_EDIT_BAN);
        AbstractUser Peter = new Moderator("Peter", "qwerty%%^^dddd",AccessRights.READ_WRITE_EDIT_BAN_DELETE);

        AbstractUser CurrentUser = null;

        int choice1 = userMenu();

        switch (choice1) {
            case 1:
                CurrentUser = Alex;
                break;
            case 2:
                CurrentUser = Nikolay;
                break;
            case 3:
                CurrentUser = Fedor;
                break;
            case 4:
                CurrentUser = Peter;
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
        }

        run();

    }

    public static int userMenu(){

        System.out.println("\nВыберите пользователя\n");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Выберите пользователя:\n" +
                "1 - Alex (User)\n" +
                "2 - Nikolay (User)\n" +
                "3 - Fedor (Moderator, can edit messages and ban users)\n" +
                "4 - Peter (Admin, can edit messages, ban users, delete messages)\n");

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
                "4 - Забанить пользователя (Moderator and Admin)\n" +
                "5 - Убрать пользователя из бан-листа (Moderator and Admin)\n");

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

        Repository<Message,AbstractUser> myRepo = new MessageRepository();
        myRepo.enterNewMessage(currentMessage);

        showChat();

    }

    public static void editMessage(AbstractUser user){
        Repository<Message,AbstractUser> myRepo = new MessageRepository();
        myRepo.editMessage(user);
        showChat();

    }

    public static void deleteMessage(AbstractUser user){
        Repository<Message,AbstractUser> myRepo = new MessageRepository();
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
}
