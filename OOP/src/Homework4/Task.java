package Homework4;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private LocalDateTime createdDateTime;
    private Description description;
    private Priority priority;
    private String Author;
    private String deadline;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task(LocalDateTime createdDateTime,
                Description description,
                Priority priority,
                String deadline,
                String author) {
        this.createdDateTime = createdDateTime;
        this.description = description;
        this.priority = priority;
        Author = author;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return  "id задачи=" + id +
                ", создана " + createdDateTime +
                ", описание: " + description.toString() +
                ", приоритет: " + priority +
                ", автор:  '" + Author + 
                ", срок исполнения: '" + deadline;
    }
}
