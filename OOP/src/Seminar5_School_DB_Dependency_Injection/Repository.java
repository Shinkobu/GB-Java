package Seminar5_School_DB_Dependency_Injection;
/*
интерфейс принимает в себя данные типа T и данные типа ID
Имеет 3 метода
 */

public interface Repository <T, ID>{
    public ID save(T t);
    public T findByID (ID id);
    public void deleteByID(ID id);
}
