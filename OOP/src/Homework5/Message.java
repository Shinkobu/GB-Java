package Homework5;

import Homework5.users.AbstractUser;

import java.time.LocalDateTime;

public class Message {
    String text;
    String time;
    AbstractUser author;
    AbstractUser editor;
    String updatedAtTime;
    String updatedAtTimeString;


    public Message(String text, String time, AbstractUser author) {
        this.text = text;
        this.time = time;
        this.author = author;
    }

    public Message(String text, String time, AbstractUser author, String updatedAtTime, AbstractUser editor) {
        this.text = text;
        this.time = time;
        this.author = author;
        this.updatedAtTime = updatedAtTime;
        this.editor = editor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAuthor(AbstractUser author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        updatedAtTimeString = "";
        if (updatedAtTime != null) {
            updatedAtTimeString = " (отред. " + editor.getName() + " в " + updatedAtTime + ")";
        }
        return author.getName() + " в " + time +  ": " + text + updatedAtTimeString;
    }

    public AbstractUser getAuthor() {
        return author;
    }
}
