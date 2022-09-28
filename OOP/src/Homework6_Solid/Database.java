package Homework6_Solid;

import Homework6_Solid.users.AbstractUser;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Message> MESSAGES_DB = new ArrayList<>();

    private static final List<AbstractUser> USERS_DB = new ArrayList<>();

    public static void putDataToMessagesDB(Message message) { MESSAGES_DB.add(message); }
    public static void editLastMessage(Message updatedMessage){
        MESSAGES_DB.set(MESSAGES_DB.size()-1, updatedMessage);
    }

    public static void editMessage(Message updatedMessage, int index){
        MESSAGES_DB.set(index, updatedMessage);
    }

    public static void putDataToUsersDB(AbstractUser user) { USERS_DB.add(user); }

    public static void showDB(){

        for (var element : MESSAGES_DB) {System.out.println(element.toString());}

    }
    public static List<Message> getDatabase () { return MESSAGES_DB; }
    public static List<AbstractUser> getUsersDatabase () { return USERS_DB; }

    public static void showDBWithIndex(){

        for (var element : MESSAGES_DB) {
            System.out.println("Индекс: " + MESSAGES_DB.indexOf(element) +" //// "+ element.toString());}

    }

}
