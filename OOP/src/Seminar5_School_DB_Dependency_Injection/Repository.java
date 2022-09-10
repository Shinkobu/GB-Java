package Seminar5_School_DB_Dependency_Injection;
/*
��������� ��������� � ���� ������ ���� T � ������ ���� ID
����� 3 ������
 */

public interface Repository <T, ID>{
    public ID save(T t);
    public T findByID (ID id);
    public void deleteByID(ID id);
}
