package Homework4.example;

// static - ����� ���� ���� ���� ������, ������ ������� �� ��������� � 1 �������


import java.util.ArrayList;
import java.util.List;



public class DataBase {

    private static final List<Data> dataBase = new ArrayList<>();

    public static void putData(Data data) {
        dataBase.add(data);
    }

}
