package Homework4;

public class Entry {

    Task task;
    Long id = null;

    public Entry(Task task) {
        id++;
        this.task = task;

    }
}
