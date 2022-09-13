package Homework4;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private LocalDateTime createdDateTime;
    private Description description;
    private Priority priority;
    private String Author;
    private String deadline;

    public Task() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
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

    public String getCreatedDateTime() {
        return createdDateTime.toString();
    }

    public Description getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDeadline() {
        return deadline;
    }
}
