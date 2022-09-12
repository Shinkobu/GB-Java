package Homework4;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import static Homework4.CsvExpImp.exportToCsv;
import static Homework4.CsvExpImp.importFile;

public class Controller {


    public static void run() throws IOException {
        int choice = menu();

        switch (choice) {
            case 1:
                newTask();
                break;
            case 2:
                System.out.println("\nБаза данных имеет вид:\n");
                Database.showDB();
                break;
            case 3:
                findTaskByID();


                break;
            case 4:
                deleteTaskByID();
                break;
            case 6:
                exportToCsv();
                break;
            case 7:
                importFile();
                break;
        }

        if (choice !=9){
            run();
        }
    }

    public static int menu(){

        System.out.println("\nВыберите действие\n");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Введите желаемую операцию:\n" +
                "1 - Добавить задачу\n" +
                "2 - Вывести список задач\n" +
                "3 - Найти задачу по ID\n" +
                "4 - Удалить задачу по ID\n" +
                "5 - Обновить задачу по ID\n" +
                "6 - Экспорт в CSV\n" +
                "7 - Импорт из CSV\n" +
                "9 - Завершить работу \n");

        int choice = 0;
        choice = Integer.parseInt(myScan.nextLine());
        return choice;
    }


    public static void deleteTaskByID() {
        Scanner myScan = new Scanner(System.in);

        System.out.println("\nБаза данных до удаления имеет вид:\n");
        Database.showDB();

        System.out.println("Введите id задачи для удаления\n");
        Long tempID = myScan.nextLong();

        TasksRepository tasksRepo = new TasksRepository();

        boolean tempBool = tasksRepo.deleteById(tempID);

        if (tempBool) {
            System.out.println("\nЗадача c id " + tempID + " удалена!");
            System.out.println("\nБаза данных после удаления имеет вид:\n");
            Database.showDB();
        }else {
            System.out.println("\nЗадача c id " + tempID + " не найдена!");
            System.out.println("\nБаза данных имеет вид:\n");
            Database.showDB();
        }

    }

    public static void findTaskByID() {
        Scanner myScan = new Scanner(System.in);

        System.out.println("\nБаза данных имеет вид:\n");
        Database.showDB();

        System.out.println("Введите id задачи для поиска\n");
        Long tempID = myScan.nextLong();

        TasksRepository tasksRepo = new TasksRepository();

        Task foundTask = tasksRepo.findById(tempID);

        if (foundTask != null) {
            System.out.println("\nЗадача c id " + tempID + " найдена!");
            System.out.println(foundTask.toString());
        }else {
            System.out.println("\nЗадача c id " + tempID + " не найдена!");
            System.out.println("\nБаза данных имеет вид:\n");
            Database.showDB();
        }

    }

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

        TasksRepository tasksRepo = new TasksRepository();
        tasksRepo.enterNewTask(new Task(LocalDateTime.now(), new Description(taskName),priority,deadline, author));
        System.out.println("\nЗадача успешно добавлена в базу данных\n");
        System.out.println("\nБаза данных имеет вид:\n");

        Database.showDB();



    }
}
