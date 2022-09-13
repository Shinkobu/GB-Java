package Homework4;

import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CsvExpImp implements Exporter, Importer{

    public static void importFile() {
//        String csvToImport = "TasksDB.csv";
        String csvToImport = "Import.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            reader = new BufferedReader(new FileReader(csvToImport));
            while ((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for (String index : row){
                    System.out.printf(index +" ");

                }
                System.out.println();

                Task tempTask = new Task();
                String tempPriority = row[1].replace("\"", "" );

                switch (tempPriority){
                    case "IMMEDIATE":
                        tempTask.setPriority(Priority.IMMEDIATE);
                        break;
                    case "AVERAGE":
                        tempTask.setPriority(Priority.AVERAGE);
                        break;
                    case "LOW":
                        tempTask.setPriority(Priority.LOW);
                        break;
                }

                tempTask.setDescription(new Description(row[0].replace("\"", "" )));
//                tempTask.setPriority(Priority.AVERAGE);//new Priority(row[1]));
                tempTask.setDeadline(row[2].replace("\"", "" ));

                tempTask.setAuthor(row[3].replace("\"", "" ));
                tempTask.setCreatedDateTime(LocalDateTime.now());

                TasksRepository tempRepo = new TasksRepository();
                tempRepo.enterNewTask(tempTask);

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
