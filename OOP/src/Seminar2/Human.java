package Seminar2;

public class Human implements HumanCalls{
    String name;
    String status;

    public Human(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void Call(Animal animal) {
        System.out.println(this.name + " зовёт: " + '"'+animal.name+ "!\"");
        System.out.println(animal.name+ " отвечает: " + '"'+ animal.reply+ "!\"");
    }
}
