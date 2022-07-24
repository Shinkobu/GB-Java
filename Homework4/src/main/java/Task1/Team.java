package Task1;

import java.util.Arrays;

public class Team {
//  Класс команда, описывает команду. У команды есть название, и массив игроков (массив объектов типа player)
    String teamName;
    Player[] teamPlayers = new Player[3];

    public Team (String teamName, Player[] teamPlayers){
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }
//    Выводит инфо об игроках команды
    public String getPlayerInfo (){

        String toPrint = "Команда " + teamName.toString() + "\n";

        for (int i = 0; i < teamPlayers.length; i++) {
            toPrint += "Имя игрока: " + teamPlayers[i].getName() + ", "
                    + "ловкость: " + teamPlayers[i].getAgility() + "\n";
        }

        return toPrint;


        // вывод должен быть: Игрок1, имя Алекс, скорость 10
    }

}