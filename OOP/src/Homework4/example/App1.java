package Homework4.example;

public class App1 {
    public static void main(String[] args) {
        var documentRepository = new DocumentRepository();
        documentRepository.save(new CsvDocument());
    }
}
