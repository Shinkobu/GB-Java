package Homework5;

// ��������� �����������

public interface Repository<T,K> {
    void enterNewMessage(T t);
    T findMessage(String string);
    void editMessage(K k);
}
