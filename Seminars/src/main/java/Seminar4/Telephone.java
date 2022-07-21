package Seminar4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Telephone{


    private Map<People, String> telephoneMap = new HashMap<>(); // созздать мапу, где ключом будет объект класса people

    public void addNewPeople(People people, String number){ // метод принимает объект People и строку
        telephoneMap.put(people,number); // добавляет записк в мапу
    }

    public List<People> getNumber(String name) throws MyFirstException { // метод принимает строку , возвращает список

        List<People> peopleList = new ArrayList<>(); // создаём новый аррэйлист
        for (People people :  telephoneMap.keySet()) { // для каждого объекта people в наборе ключей мапы

            if(people.getName().equals(name)){ // если имя объекта people равно name (входящая в метод строка)
                peopleList.add(people); // то добавить объект people в аррэйлист
            }

        }
        return peopleList;
    }



}