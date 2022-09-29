package Homework6_Solid.Controller;

import Homework6_Solid.Message;
import Homework6_Solid.MessageRepository;
import Homework6_Solid.Repository;
import Homework6_Solid.Users.AbstractUser;

import static Homework6_Solid.Controller.ShowChat.showChat;


public class EDFMessage {

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

    public static void findMessage() {
        Repository<Message, AbstractUser> myRepo = new MessageRepository();
        myRepo.findMessage();

    }

}
