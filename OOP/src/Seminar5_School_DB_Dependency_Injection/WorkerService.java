package Seminar5_School_DB_Dependency_Injection;

/*
Хранит в себе репозиторий с воркером и лонгом (id воркера).
Можно добавить через конструктор
Можно добавить через метод setRepo
Repository<> это не класс, а интерфейс. Благодаря такой ссылке можно в реализации вместо repo подставлять любой класс,
который реализует данные интерфейс
 */

public class WorkerService {
    Repository<Worker, Long> repo;

    public WorkerService(Repository<Worker, Long> repo) {
        this.repo = repo;
    }

    public void addWorker(Worker worker){
        repo.save(worker);

    }
    public void setRepo(Repository<Worker, Long> repo) {
        this.repo = repo;
    }
}
