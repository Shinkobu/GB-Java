package Seminar5_School_DB_Dependency_Injection;

public class FileWorkerRepository implements Repository<Worker, Long> {
    @Override
    public Long save(Worker worker) {
        System.out.println("Save to file");
        return null;
    }

    @Override
    public Worker findByID(Long aLong) {
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {

    }
}
