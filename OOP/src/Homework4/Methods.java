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


    public static void newTask () throws IOException {

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

        switch (tempPrior){
            case 1:
                priority = Priority.IMMEDIATE;
            case 2:
                priority = Priority.AVERAGE;
            case 3:
                priority = Priority.LOW;
        }

        System.out.println("Введите автора: \n");
        String author = myScan.nextLine();

//        AppendToCSV(taskName, deadline, priority, author);

    }
//    public static void AppendToCSV (String taskName, String deadline, Priority priority, String author) throws IOException {
//
//        String csv = "TasksDB.csv";
//        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
//        String [] record = {taskName, deadline, priority.toString(), author};
////        String [] record = "3,David,Feezor,USA,40".split(",");
//        writer.writeNext(record);
//        writer.close();
//    }

//    public static void showAllTasks() throws IOException, CsvValidationException {
//
//        try (CSVReader reader = new CSVReader(new FileReader("TasksDB.csv"))) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(Arrays.toString(x)));
//        } catch (CsvException e) {
//            throw new RuntimeException(e);
//        }


//        Object csvFile = "TasksDB.csv";
//        CSVReader csvReader = new CSVReader (new InputStreamReader(csvFile.getInputStream()));
//        while ((record = csvReader.readNext()) != null) {
//            // do something
//        }
//
//        try (CSVReader reader = new CSVReader(new FileReader("TasksDB.csv"))) {
//
//            String[] nextLine;
//            while ((nextLine = reader.readNext()) != null) {
//                if (nextLine != null) {
//                    //Verifying the read data here
//                    System.out.println(Arrays.toString(nextLine));
//                }
//            }
//        }

    }


//}
