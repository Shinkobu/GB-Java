package Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
//        Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
//        если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
//        будет заменять номер телефона по ключу, нужно подумать как не допустить такого)

//        1) Создаём справочник

        Map<String, ArrayList<String>> PhoneBook = new HashMap<>();

        // ввод данных

        ArrayList<String> MyAL = new ArrayList<>();
        MyAL.add("224488");

        PhoneBook.put("Иванов", (ArrayList<String>) MyAL.clone());

        MyAL.clear();
        MyAL.add("221188");
        MyAL.add("331526");
        MyAL.add("448783");

        PhoneBook.put("Кузнецов", (ArrayList<String>) MyAL.clone());
        MyAL.clear();
        MyAL.add("446622");
        MyAL.add("559988");

        PhoneBook.put("Соколов", (ArrayList<String>) MyAL.clone());
        MyAL.clear();

//        2) Ищем фамилию
        System.out.println("\nИмеем справочник: " + PhoneBook + "\nВведите фамилию для поиска: ");
        Scanner myScanner = new Scanner(System.in);
        String Surname = myScanner.nextLine();
        myScanner.close();
//        проход по map через entryset

//        Iterator myIter = PhoneBook.entrySet().iterator()

        boolean findSuccess = false;

        for (Map.Entry myEntry : PhoneBook.entrySet()) {
            if (Objects.equals(Surname, myEntry.getKey())){
                System.out.println("Найдена запись в справочнике: \n Фамилия: " + myEntry.getKey() + "\n Контакты: " + myEntry.getValue());
                findSuccess = true;
            }
        }
        if (!findSuccess) System.out.println("Запись не найдена");
    }
}
