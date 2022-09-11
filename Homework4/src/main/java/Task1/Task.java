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

//        Распределяем игроков по командам

        Player[] team1players = new Player[]{player1,player2,player3,player4};
        Player[] team2players = new Player[]{player5,player6,player7,player8};

        Team team1 = new Team("Wolfs", team1players);
        Team team2 = new Team("Rabbits", team2players);

//        Выводит информацию об игроках команды

        System.out.println(team1.getPlayerInfo());
        System.out.println(team2.getPlayerInfo());

//        Обозначаем препятствия

        Obstacle obs1 = new Obstacle("Тарзанка", 5);
        Obstacle obs2 = new Obstacle("Скользкая лестница", 10);
        Obstacle obs3 = new Obstacle("Дом с призраками", 7);

        Obstacle[] obsArray = new Obstacle[]{obs1,obs2,obs3};

//      Отправляем команды на полосу
        test(team1,obsArray);
        test(team2,obsArray);


    }

    public static void test(Team team, Obstacle[] obsArray) {

        for (int i = 0; i < team.teamPlayers.length; i++) {
            System.out.println("\nИграет " + team.teamPlayers[i].getName());
            System.out.println("Его ловкость " + team.teamPlayers[i].getAgility()+ "\n");
            for (int j = 0; j < obsArray.length; j++) {
                System.out.printf("Испытание " + obsArray[j].obsName + ", сложность "
                        + obsArray[j].difficultCoef + "\n");
                if (team.teamPlayers[i].getAgility() >= obsArray[j].difficultCoef){
                    System.out.printf("Испытание пройдено!\n");
                }else System.out.printf("Испытание не пройдено\n");
            }
        }

    }
}