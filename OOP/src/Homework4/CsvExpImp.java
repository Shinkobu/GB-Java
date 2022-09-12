package Homework4;

import Homework4.example.Document;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CsvExpImp implements Exporter, Importer{

    @Override
    public void exportToCSV(String id, String date, String taskName, String priority,String deadline, String author) throws IOException {

        String csv = "TasksDB.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = {id, date, taskName, priority, deadline, author};
//        String [] record = {taskName, deadline, priority.toString(), author};
//        String [] record = "3,David,Feezor,USA,40".split(",");
        writer.writeNext(record);
        writer.close();
    }

//    public static void showAllTasks() throws IOException, CsvValidationException {
//
//        try (CSVReader reader = new CSVReader(new FileReader("TasksDB.csv"))) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(Arrays.toString(x)));
//        } catch (CsvException e) {
//            throw new RuntimeException(e);
//        }

//
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
//        };


    @Override
    public Document importFile(String pathToFile) {
        return null;
    }
}
