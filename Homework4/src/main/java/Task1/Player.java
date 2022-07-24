package Task1;

public abstract class Player {

    // Класс Player описывает игрока. У каждого игрока есть имя, ловкость....

    private String name;
    private Integer team;
    private Integer agility;

    public Player(String name, Integer team, Integer agility){
        // Это конструктор, с помощью него описывается каждый игрок
        this.name = name;
        this.team = team;
        this.agility = agility;
    }

//    Возвращает имя
    public String getName(){
        return name;
    }

    public Integer getTeam(){
        return team;
    }
    //    Возвращает ловкость
    public Integer getAgility(){
        return agility;
    }

}
