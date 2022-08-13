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

       String comeToMe = null;
        if (animal instanceof FlyingAnimal){
            comeToMe = ", лети сюда!";
        }
        if (animal instanceof SwimmingAnimal){
            comeToMe = ", как дела?";
        }
        if (animal instanceof WalkingAnimal){
            comeToMe = ", ко мне!";
        }

        System.out.println(this.name + " зовёт: " + '"'+ animal.name + comeToMe + "\"");
        System.out.println(animal.name+ " отвечает: " + '"'+ animal.reply + "\"");
    }
}
