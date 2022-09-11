package Homework4.example;

// static - чтобы была одна база данных, нельзя создать их несколько в 1 проекте


import java.util.ArrayList;
import java.util.List;



public class DataBase {

    private static final List<Data> dataBase = new ArrayList<>();

    public static void putData(Data data) {
        dataBase.add(data);
    }

}
