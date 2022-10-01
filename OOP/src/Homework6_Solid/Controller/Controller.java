package Homework6_Solid.Controller;

import Homework6_Solid.Databases.Database;
import Homework6_Solid.Message;
import Homework6_Solid.MessageRepository;
import Homework6_Solid.Repository;
import Homework6_Solid.Users.AbstractUser;

import java.io.IOException;

import static Homework6_Solid.Controller.ShowChat.showChat;

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
        Repository<Message, AbstractUser> myRepo = new MessageRepository();

        switch (choice2) {
            case 1:
                NewMessage.writeMessage(CurrentUser);
                break;
            case 2:
                myRepo.editMessage(CurrentUser);
                showChat();
                break;
            case 3:
                myRepo.deleteMessage(CurrentUser);
                showChat();
                break;
            case 4:
                myRepo.findMessage();
                break;
        }

        run();

    }

}
