package Seminar5_School_DB_Dependency_Injection;

/*
������ � ���� ����������� � �������� � ������ (id �������).
����� �������� ����� �����������
����� �������� ����� ����� setRepo
Repository<> ��� �� �����, � ���������. ��������� ����� ������ ����� � ���������� ������ repo ����������� ����� �����,
������� ��������� ������ ���������
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
