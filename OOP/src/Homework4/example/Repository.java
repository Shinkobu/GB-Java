package Homework4.example;

// интерфейс репозитория

public interface Repository<T, ID> {
    void save(T t);
    void deleteById(ID id);
    T findById(ID id);
    ID updateById(T t, ID id);
}
