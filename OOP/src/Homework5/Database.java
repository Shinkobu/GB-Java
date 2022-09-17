package Homework5;

import Homework4.Task;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Message> MESSAGES_DB = new ArrayList<>();

    public static void putData(Message message) { MESSAGES_DB.add(message); }

    public static void showDB(){

        for (var element : MESSAGES_DB) {System.out.println(element.toString());}

    }
    public static List<Message> getDatabase () { return MESSAGES_DB; }

}
