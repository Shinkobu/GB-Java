package Homework4;

import Homework4.example.Data;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class TasksRepository implements Repository<Task,Long> {

    @Override
    public void enterNewTask(Task task) {
        App.id++;
        task.setId(App.id);
        Database.putData(task);

    }

    @Override
    public boolean deleteById(Long aLong) {
        List<Task> tempDB = Database.getTaskDatabase();
        boolean isRemoved = false;

        Iterator<Task> taskIterator = tempDB.iterator();
        while(taskIterator.hasNext()){
            Task tempTask = taskIterator.next();
            if(tempTask.getId().equals(aLong)){
                taskIterator.remove();
            }
        }
        return isRemoved;
    }

    @Override
    public Task findById(Long aLong) {
        List<Task> tempDB = Database.getTaskDatabase();
        boolean isFound = false;
        Task tempTask = null;
        Task foundTask = null;

        Iterator<Task> taskIterator = tempDB.iterator();
        while(taskIterator.hasNext() && !isFound){
            tempTask = taskIterator.next();
            if(tempTask.getId().equals(aLong)){
                isFound = true;
                foundTask = tempTask;

            }
        }
        return foundTask;
    }

    @Override
    public Long updateById(Task document, Long aLong) {
        return null;
    }
}
