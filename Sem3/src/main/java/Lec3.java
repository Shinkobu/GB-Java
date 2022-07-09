import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lec3 {
    public static void main(String[] args) {
//        ƒан список из 10 - 20 слов с повторами, вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменени€.
//        1) «авести список
//        2) ѕройтись по списку, исключить повтор€ющиес€ элементы, добавить список с количеством повторов
//        3) ¬ывести список без повторов
//        4) ¬ывести список с указанием числа повторов каждого слова.

        Task1();


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
}
