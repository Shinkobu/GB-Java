package Seminar5_School_DB_Dependency_Injection;

public class WorkerData {
    private static Long id;
    Worker worker;

    public WorkerData(Worker worker) {
        this.worker = worker;
        id++;
    }

    public static Long getId() {
        return id;
    }
}
