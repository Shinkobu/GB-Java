package Homework4;

// static - чтобы была одна база данных, нельзя создать их несколько в 1 проекте

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Task> TASK_DATABASE = new ArrayList<>();

    public static void putData(Task task){
        TASK_DATABASE.add(task);
    }

    public static void showDB(){

        for (var element : TASK_DATABASE) {
            System.out.println(element.toString());
        }

    }
    public static List<Task> getTaskDatabase (){
        return TASK_DATABASE;
    }

}


