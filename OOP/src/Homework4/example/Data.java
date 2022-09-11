package Homework4.example;

import java.time.LocalDateTime;

public class Data {
    private long id;
    private LocalDateTime createdData;

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedData(LocalDateTime createdData) {
        this.createdData = createdData;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    private Document document;
}
