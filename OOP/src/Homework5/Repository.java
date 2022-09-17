package Homework5;

// интерфейс репозитория

public interface Repository<T> {
    void enterNewMessage(T t);
    T findMessage(String string);
    void updateMessage(T t);
}
