package Homework5;

// интерфейс репозитория

public interface Repository<T,K> {
    void enterNewMessage(T t);
    T findMessage(String string);
    void editMessage(K k);
}
