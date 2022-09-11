package Seminar5_School_DB_Dependency_Injection;

public class RepositoryWorker implements Repository<Worker, Long> {
    @Override
    public Long save(Worker worker) {
//        List<WorkerData> workerTable = DataBase.getWorkerTable();
//        workerTable.add(new WorkerData(worker));
//        return WorkerData.getId();

        System.out.println("Save to database");
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
