package Seminar2;

public class App {
    public static void main(String[] args) {

        Human father = new Human("Александр","отец");
        Human son = new Human("Юра","сын");

        FlyingAnimal carrot = new FlyingAnimal("Попка","Попка-дурак!");
        SwimmingAnimal catfish = new SwimmingAnimal("Лёва", "(бульк!)");
        WalkingAnimal dog = new WalkingAnimal("Мухтар", "Гаф-гаф, ауууу!");

        father.Call(dog);
        son.Call(carrot);
        father.Call(catfish);

    }
}
