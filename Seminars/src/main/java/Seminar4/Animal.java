package Seminar4;

public abstract class Animal {

    private String defaultName = "animal";

    public abstract int weight();

    public abstract int legCount();

    public String name(){
        return defaultName;
    }




}