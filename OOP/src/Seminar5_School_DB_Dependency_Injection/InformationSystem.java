package Seminar5_School_DB_Dependency_Injection;

// Информационная система, для работы с сотрудниками компании (в данном случае, школы)

public class InformationSystem {
    public static void main(String[] args) {

        WorkerService workerService = new WorkerService(new RepositoryWorker());
        workerService.addWorker(new Worker("Slava","Dobrov",1995, Status.STUDENT));

        workerService.setRepo(new FileWorkerRepository());
        workerService.addWorker(new Worker("Slava","Dobrov",1995,Status.STUDENT));

//        Один сервис умеет работать с абстракцией репозиторий и мы ему можем подкладывать какую угодно реализацию. Мы можем внедрить любую зависимость
//        WorkerService - общая абстракция. Это и есть dependency injection.

//        RepositoryWorker workerTable = new RepositoryWorker();
//
//        workerTable.save(new Worker("Slava","Dobrov",1995,Status.STUDENT));
//
//        List<Worker> workers = new ArrayList<>();
//        workers.add(new Worker("Slava","Dobrov",1995,Status.STUDENT));
//        workers.add(new Worker("Nastya","Bumaga",1999,Status.STUDENT));
//        workers.add(new Worker("Oleg","Gorodovoy",1960,Status.CHIEF));
//        workers.add(new Worker("Dima","Dobrov",1990,Status.TEACHER));
//        workers.add(new Worker("Roma","Bobrov",1970,Status.LECTOR));
//
//        List<Link> allLinks = new ArrayList<>();
//        allLinks.add(new Link(workers.get(0), workers.get(2), Relation.SLAVE, Relation.BOSS));
//        allLinks.add(new Link(workers.get(1), workers.get(2), Relation.SLAVE, Relation.BOSS));
//        allLinks.add(new Link(workers.get(2), workers.get(3), Relation.BOSS, Relation.SLAVE));
//        allLinks.add(new Link(workers.get(4), workers.get(1), Relation.BOSS, Relation.SLAVE));
//        allLinks.add(new Link(workers.get(2), workers.get(3), Relation.BOSS, Relation.SLAVE));
    }
}
