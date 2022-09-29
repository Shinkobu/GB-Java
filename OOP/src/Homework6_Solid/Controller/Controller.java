package Homework6_Solid.Controller;

import Homework6_Solid.Database;
import Homework6_Solid.Users.AbstractUser;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {

    public static void run() throws IOException {

        AbstractUser CurrentUser = null;

        int choice1 = UserMenu.userMenu();

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

        int choice2 = ActionMenu.actionMenu();

        switch (choice2) {
            case 1:
                NewMessage.writeMessage(CurrentUser);
                break;
            case 2:
                EDFMessage.editMessage(CurrentUser);
                break;
            case 3:
                EDFMessage.deleteMessage(CurrentUser);
                break;
            case 4:
                EDFMessage.findMessage();
                break;
        }

        run();

    }

}
