package Homework6_Solid;

import Homework6_Solid.Controller.Controller;
import Homework6_Solid.Users.AbstractUser;
import Homework6_Solid.Users.Admin;
import Homework6_Solid.Users.Moderator;
import Homework6_Solid.Users.User;
import java.io.IOException;

import static Homework6_Solid.Controller.ShowChat.showChat;
import static Homework6_Solid.Controller.FormattedTime.formattedTime;


public class App {
    public static void main(String[] args) throws IOException {


        AbstractUser Alex = new User("Alex", "123", AccessRights.READ_WRITE);
        AbstractUser Nikolay = new User("Nikolay", "456", AccessRights.READ_WRITE);
        AbstractUser Fedor = new Moderator("Fedor", "qwerty%%^^", AccessRights.READ_WRITE_EDIT);
        AbstractUser Peter = new Admin("Peter", "qwerty%%^^dddd", AccessRights.READ_WRITE_EDIT_DELETE);

        Database.putDataToUsersDB(Alex);
        Database.putDataToUsersDB(Nikolay);
        Database.putDataToUsersDB(Fedor);
        Database.putDataToUsersDB(Peter);

        Database.putDataToMessagesDB(new Message("Привет!", formattedTime(),Alex));
        Database.putDataToMessagesDB(new Message("Здорово! Как дела?", formattedTime(),Nikolay));
        Database.putDataToMessagesDB(new Message("Ауэнно!", formattedTime(),Alex));
        Database.putDataToMessagesDB(new Message("Парни, не ругаемся!", formattedTime(),Fedor));
        Database.putDataToMessagesDB(new Message("Сорян!", formattedTime(),Alex));


        showChat();
        Controller.run();
    }
}
