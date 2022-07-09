import java.util.*;

public class Lec3 {
    public static void main(String[] args) {
//        Дан список из 10 - 20 слов с повторами, вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменения.
//        1) Завести список
//        2) Пройтись по списку, исключить повторяющиеся элементы, добавить список с количеством повторов
//        3) Вывести список без повторов
//        4) Вывести список с указанием числа повторов каждого слова.

        Task1();


    }

    public static void Task1() {
        String[] myArray = new String[] {"провод", "когорта", "медведь", "лютик", "лютик", "когорта", "виноград", "медведь", "испуг", "провод"};
//        System.out.println(Arrays.toString(myArray));
        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));
        ArrayList<String> newWordList = new ArrayList<>();

//        List<String> wordList = List.of("провод", "когорта", "медведь", "лютик", "лютик", "когорта", "виноград", "медведь", "испуг", "провод");

        System.out.println(wordList);

//        wordList.remove(1);

//        for (String i : wordList) {
//            System.out.println(i);
//            if (i == "когорта") wordList.remove(i);
//
//        }
//        System.out.println(wordList);
//

//        HashSet<String> mySet = new HashSet<>();
//        mySet.addAll(wordList);
//        System.out.println(mySet);


        Iterator<String> wordIter = wordList.iterator(); //создаем итератор

        while (wordIter.hasNext()){ //до тех пор, пока в списке есть элементы
            String currentIter = wordIter.next();
            System.out.println(currentIter); //получаем следующий элемент и выводим его в консоль

            if (currentIter == "-1") {
                newWordList.add(currentIter);
                wordIter.remove();
            }else {
                newWordList.add(currentIter);
            }


        }
        System.out.println(wordList);
        System.out.println(newWordList);


    }
}
