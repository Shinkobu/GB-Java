package Homework4;

//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
//import com.opencsv.exceptions.CsvException;
//import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Methods {


    public static void newTask() throws IOException {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите наименование задачи: \n");
        String taskName = myScan.nextLine();

        System.out.println("Введите срок выполения: \n");
        String deadline = myScan.nextLine();

        System.out.println("Выберите приоритет: \n" +
                "1 - Немедленное исполнение \n" +
                "2 - Средний \n" +
                "3 - Низкий \n");

        Integer tempPrior = Integer.parseInt(myScan.nextLine());
        Priority priority = null;

        switch (tempPrior) {
            case 1:
                priority = Priority.IMMEDIATE;
            case 2:
                priority = Priority.AVERAGE;
            case 3:
                priority = Priority.LOW;
        }

        System.out.println("Введите автора: \n");
        String author = myScan.nextLine();


    }
}