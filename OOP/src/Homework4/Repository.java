package Homework4;

// интерфейс репозитория

public interface Repository<T, ID> {
    void enterNewTask(T t);
    boolean deleteById(ID id);
    T findById(ID id);
//    ID updateById(T t, ID id);
}
