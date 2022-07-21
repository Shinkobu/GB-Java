package Task1;

public class People {

    // у человека будет имя, команда, скорость плавания

    private String name;
    private String team;
    private Integer swimSpeed;

    public People(String name, String team){ // Уточнить, это конструктор????????????
        this.name = name;
        this.team = team;
    }

    public String getName(){
        return name;
    }

    public String getTeam(){
        return team;
    }
}
