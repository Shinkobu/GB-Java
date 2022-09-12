package Homework4;

import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvExpImp implements Exporter, Importer{

    public static void importFile() {
        String csvToImport = "TasksDB.csv";
//        String csvToImport = "Import.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            reader = new BufferedReader(new FileReader(csvToImport));
            while ((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for (String index : row){
                    System.out.printf("%-15s", index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void exportToCsv() throws IOException {

        String csvDB = "TasksDB.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csvDB, true));

        for (var element : Database.getTaskDatabase() ) {
            String [] record = {element.getId().toString(),
                    element.getCreatedDateTime().toString(),
                    element.getDescription().toString(),
                    element.getPriority().toString(),
                    element.getDeadline(),
                    element.getAuthor()};

            writer.writeNext(record);

        }
        System.out.println("\nЭкспорт успешно выполнен!\n");
        writer.close();
    }
}
