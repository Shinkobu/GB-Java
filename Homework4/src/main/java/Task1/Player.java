package Task1;

public abstract class Player {

    // у человека будет имя, команда, скорость плавания

    private String name;
    private Integer team;
    private Integer swimSpeed;

    public Player(String name, Integer team, Integer swimSpeed){ // Это конструктор
        this.name = name;
        this.team = team;
        this.swimSpeed = swimSpeed;
    }

    public String getName(){
        return name;
    }

    public Integer getTeam(){
        return team;
    }

}
