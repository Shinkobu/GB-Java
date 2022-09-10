package Seminar5_School_DB_Dependency_Injection;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final List<WorkerData> workerTable = new ArrayList<>();

    public static final List<LinkData> linksTable = new ArrayList<>();

    private DataBase(){

    }
    public static List<WorkerData> getWorkerTable(){
        return workerTable;
    }

    public static List<LinkData> getLinksTable(){
        return linksTable;
    }
}
