package Seminar2;

//Семинар 2
//        Описать логику взаимодействия человека и домашнего питомца. Добавить разных животных.
//        Добавить разные методы взаимодействия питомца и человека. Возможно добавить разных членов семьи?
//        Нужно использовать абстрактные классы и интерфейсы.
//
//        Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.

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
