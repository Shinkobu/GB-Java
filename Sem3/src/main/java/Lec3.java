import java.util.*;

public class Lec3 {
    public static void main(String[] args) {
//        ƒан список из 10 - 20 слов с повторами, вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменени€.
//        1) «авести список
//        2) ѕройтись по списку, исключить повтор€ющиес€ элементы, добавить список с количеством повторов
//        3) ¬ывести список без повторов
//        4) ¬ывести список с указанием числа повторов каждого слова.

//        Task1();
//        Task1_fromSeminar();

//        Ќаписать программу перебора n комбинаций из цифр от 0 - 9 (n длина массива)
//        те
//        0 0 0
//        0 0 1
//        0 0 2
//        - - -
//        9 9 9
//        n - длина одной строки

        Task2();
    }

    public static void Task1() {
        String[] myArray = new String[] {"провод", "когорта", "медведь", "медведь", "лютик", "когорта", "виноград", "медведь", "испуг", "провод"};
//        System.out.println(Arrays.toString(myArray));

        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));
        ArrayList<String> newWordList = new ArrayList<>();

//        List<String> wordList = List.of("провод", "когорта", "медведь", "лютик", "лютик", "когорта", "виноград", "медведь", "испуг", "провод");

        System.out.println("»сходный список: \n"+ wordList + "\n");

//      ѕроход по элементам arraylist
        for (int i = 0; i < wordList.size(); i++) {
            String currentElement = wordList.get(i);
//            System.out.println(currentElement);
            int j = 0;

            Iterator<String> wordIter = wordList.iterator(); //создаем итератор
            while (wordIter.hasNext()){ //до тех пор, пока в списке есть элементы
                String currentIter = wordIter.next();
//                System.out.println(currentIter); //получаем следующий элемент и выводим его в консоль

                if (currentIter == currentElement) j++;

                if (currentIter == currentElement && j>1) wordIter.remove();
                }

            newWordList.add(String.valueOf(j));
        }
        System.out.println("—писок без повторов: \n" + wordList + "\n");
//        System.out.println(newWordList);

        System.out.println("—колько раз встречалось слово в списке: \n");
        for (int i = 0; i < wordList.size(); i++) {

            System.out.println(wordList.get(i) + " - " + newWordList.get(i) + " раз");

        }
    }

    public static int count(List <String> start, String element) {
        int counter= 0;

        for (String string : start) {
            if (element.equals(string)) counter++;
        }

        return counter;

    }

    public static Map<String,Integer> transformer(List <String> start) {
        Map<String,Integer> result = new HashMap<>(); // hashmap - это список с уникальными значени€ми ключей (без повторов)
        for (String string : start){
            result.put(string, Collections.frequency(start,string)); // или можно сослатьс€ на написанный метод count
        }
        return result;
    }

    public static void Task1_fromSeminar() {

        String[] myArray = new String[] {"провод", "когорта", "медведь", "медведь", "лютик", "когорта", "виноград", "медведь", "испуг", "провод"};
//        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));

        List<String> wordList = Arrays.asList("провод", "когорта", "медведь", "медведь", "лютик", "когорта", "виноград", "медведь", "испуг", "провод");


        System.out.println("—колько раз встречалось слово в списке: \n");

        // перебор мэпа с помощью entrySet
        for (Map.Entry<String, Integer> buf : transformer(wordList).entrySet()) { // дл€ каждой пары ключ-значение в мэпе
            System.out.println(buf.getKey() +" - " + buf.getValue());
        }
//        System.out.println(transformer(wordList));


    }

    public static void Task2() {
//        задаЄм n, на выходе получаем вывод в консоль всех вариантов сочетани€ цифр в виде массива
        int n = 3;
        int[] myArray = new int[n];
        recDigit(n,myArray);

    }

    public static void recDigit (int n, int[] myArray) {

        if (n==0) {
            System.out.println(Arrays.toString(myArray));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            myArray[myArray.length - n] = i;
            recDigit(n - 1, myArray);
        }

        }

    }



