package Homework5;

// ��������� �����������

public interface Repository<T,K> {
    void enterNewMessage(T t);
    void findMessage();
    void editMessage(K k);
    void deleteMessage(K k);
}
