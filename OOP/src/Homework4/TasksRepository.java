package Homework4;

import Homework4.example.Data;

import java.time.LocalDateTime;
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

        for (Task element: tempDB){
            if (element.getId() == aLong){
                tempDB.remove(element);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    @Override
    public Task findById(Long aLong) {
        return null;
    }

    @Override
    public Long updateById(Task document, Long aLong) {
        return null;
    }
}
