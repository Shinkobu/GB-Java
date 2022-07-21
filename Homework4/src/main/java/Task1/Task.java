package Task1;

/* 1 Создать класс People который будет содержать характеристики спортсменов (Из абстрактного базового класса, так будет проще)
   2 Создать класс Team, который будет содержать:
        название команды;
        массив из четырех участников — в конструкторе можно сразу всех участников указывать);
        метод для вывода информации о членах команды, прошедших дистанцию;
        метод вывода информации обо всех членах команды.
   3 Создать класс полоса препятсвий, который будет содержать в себе классы препятсвий (тоже рекомендую сделать через базовый класс), в котором будут находиться:
        массив препятствий;
        метод, который будет просить команду пройти всю полосу.
        внутри метода отвечающего за прохождение полосы - добавить проверку возможностей людей на преодаление этой полосы (ну и если хотите, можете проверять хватит ли сил проходить полосу препятсвий у человека)
*/
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

//        Игроки

        Player player1 = new Player("Alex",1,10){};
        Player player2 = new Player("Fedor",1,10){};
        Player player3 = new Player("Jack",1,8){};
        Player player4 = new Player("Finn",1,15){};
        Player player5 = new Player("Lucy",2,5){};
        Player player6 = new Player("Carol",2,11){};
        Player player7 = new Player("Kate",2,9){};
        Player player8 = new Player("Misha",2,16){};

//        Команды

        Player[] team1players = new Player[]{player1,player2,player3,player4};
        Player[] team2players = new Player[]{player5,player6,player7,player8};

        Team team1 = new Team("Wolfs", team1players);
        Team team2 = new Team("Rabbits", team2players);

        System.out.println(team1.teamName.toString());


//        test(player1);

        System.out.println(team1.getPlayerInfo());




    }

    public static void test(Player player) {
        if (player.getName() == "Alex") {
            System.out.println("Победа!");
        }else System.out.println("Поражение");


    }
}
