package Task1;

import java.util.Arrays;

public class Team {

    String teamName;
    Player[] teamPlayers = new Player[3];

    public Team (String teamName, Player[] teamPlayers){
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }

    public String getPlayerInfo (){

        String toPrint = "";

        for (int i = 0; i < teamPlayers.length; i++) {
            toPrint += "���: " + teamPlayers[i].getName() + "\n";

        }

        return toPrint;


        // ����� ������ ����: �����1, ��� �����, �������� 10
    }

}