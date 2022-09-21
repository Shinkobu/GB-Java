package Homework5;

import Homework4.Task;
import Homework5.users.User;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Message> MESSAGES_DB = new ArrayList<>();

    private static final List<User> USERS_DB = new ArrayList<>();

    public static void putData(Message message) { MESSAGES_DB.add(message); }
    public static void editLastMessage(Message updatedMessage){
        MESSAGES_DB.set(MESSAGES_DB.size()-1, updatedMessage);
    }
    public static void putDataToUsersDB(User user) { USERS_DB.add(user); }

    public static void showDB(){

        for (var element : MESSAGES_DB) {System.out.println(element.toString());}

    }
    public static List<Message> getDatabase () { return MESSAGES_DB; }

    public static void showDBWithIndex(){

        for (var element : MESSAGES_DB) {
            System.out.println("Индекс: " + MESSAGES_DB.indexOf(element) +" //// "+ element.toString());}

    }

}
