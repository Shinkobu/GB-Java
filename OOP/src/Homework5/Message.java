package Homework5;

import Homework5.users.AbstractUser;

import java.time.LocalDateTime;

public class Message {
    String text;
    LocalDateTime time;
    AbstractUser author;

    public Message(String text, LocalDateTime time, AbstractUser author) {
        this.text = text;
        this.time = time;
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setAuthor(AbstractUser author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return author.getName() + " в " + time +  ": " + text;
    }

    public AbstractUser getAuthor() {
        return author;
    }
}
