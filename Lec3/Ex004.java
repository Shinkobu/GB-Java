package Lesson_03;
import java.util.Arrays;
import java.util.List;

// Конструктор ArrayList

public class Ex004 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date); // присвоение массива date списку d
        System.out.println(d); // [29, 9, 1990]
    }
}