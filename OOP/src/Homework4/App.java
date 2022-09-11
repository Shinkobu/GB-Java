package Homework4;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
// test comment
    public static Long id = Long.valueOf(0);

    public static void main(String[] args) throws IOException, CsvValidationException {

        TasksRepository startRepo = new TasksRepository();
        startRepo.enterNewTask(new Task(LocalDateTime.now(), new Description("Сделать уборку"), Priority.AVERAGE, "25.10.22","Alex"));
        startRepo.enterNewTask(new Task(LocalDateTime.now(), new Description("Помыть посуду"), Priority.LOW, "15.12.22","Alex"));
        startRepo.enterNewTask(new Task(LocalDateTime.now(), new Description("Захватить мир"), Priority.IMMEDIATE, "31.10.22","Alex"));

        Controller.run();

}
}
