package Homework6_Solid.Controller;

import Homework6_Solid.Message;
import Homework6_Solid.MessageRepository;
import Homework6_Solid.Repository;
import Homework6_Solid.Users.AbstractUser;

import java.util.Scanner;



import static Homework6_Solid.Controller.FormattedTime.formattedTime;
import static Homework6_Solid.Controller.ShowChat.showChat;

public class NewMessage {
    public static void writeMessage(AbstractUser CurrentUser){

        Scanner myScan = new Scanner(System.in);
        System.out.println(CurrentUser.getName() + " : ");
        String currentText = myScan.nextLine();
        Message currentMessage = new Message(currentText, formattedTime(),CurrentUser);

        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.enterNewMessage(currentMessage);

        showChat();

    }
}
