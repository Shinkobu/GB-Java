package Homework5;

// ��������� �����������

public interface Repository<T> {
    void enterNewMessage(T t);
    T findMessage(String string);
    void updateMessage(T t);
}
