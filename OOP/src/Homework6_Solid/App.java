package Homework6_Solid;

import Homework6_Solid.users.AbstractUser;
import Homework6_Solid.users.Admin;
import Homework6_Solid.users.Moderator;
import Homework6_Solid.users.User;
import java.io.IOException;
import static Homework6_Solid.Controller.showChat;

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

        Database.putDataToMessagesDB(new Message("Привет!", Controller.formattedTime(),Alex));
        Database.putDataToMessagesDB(new Message("Здорово! Как дела?", Controller.formattedTime(),Nikolay));
        Database.putDataToMessagesDB(new Message("Ауэнно!", Controller.formattedTime(),Alex));
        Database.putDataToMessagesDB(new Message("Парни, не ругаемся!", Controller.formattedTime(),Fedor));
        Database.putDataToMessagesDB(new Message("Сорян!", Controller.formattedTime(),Alex));


        showChat();
        Controller.run();
    }
}
