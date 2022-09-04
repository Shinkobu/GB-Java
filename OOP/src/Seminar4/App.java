package Seminar4;

/*
    Обобщения. ч1
    Реализовать собственный ArrayList
    Более сложная задача: Реализовать собственный список или двунаправленный список

    Методы, которые должны присутстовать:

    add - добавляет элемент
    get by index - получить элемент
    remove by index and by element - удаляет элемент
    set - ставит элемент в нужную позицию
    indexOf - получить индекс элемента
    contains - проверка наличия элемента
    addAll - добавляет в текущий список другой список
    removeAll - удаляет из списка все элементы другого списка
    sort - сортировка
    clear - очищает список
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        PlusList<Integer> arra1 = new PlusList<>(3);
        arra1.plusAdd(1);
        System.out.println(arra1);
        arra1.plusAdd(2);
        System.out.println(arra1);
        arra1.plusAdd(3);
        System.out.println(arra1);

        String s = arra1.getByIndex(1).toString();
        System.out.println(s);

        arra1.removeByIndex(0);
        System.out.println(arra1);

        arra1.removeByElement(3);
        System.out.println(arra1);

    }
}
