package Homework4;

import Homework4.example.Document;

import java.io.IOException;

public interface Exporter {

    void exportToCSV(String id, String date, String taskName, String priority,String deadline, String author) throws IOException;
}
