package Task2;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws InterruptedException {
//        Ќаписать метод, который провер€ет валидность логина и парол€ (где нибудь в переменных сохраните)
//        и при помощи конструкции try-catch рекурсивно принимайте данные (нужно ограничить колиичество попыток
//        до 6 и после 3 попытки должно быть сообщение, мол вы привысили количество попыток, немного пододождите
//        тут можете поток заслипить на некоторое врем€. ј когда попытки кончатс€ - выйти)

        String login = "admin";
        String password = "asdf";
        int attempt = 0;

        Scanner myScanner = new Scanner(System.in);
        passCheck(myScanner,password,login,attempt);
        myScanner.close();
    }

    public static void passCheck (Scanner myScanner, String password, String login, int attempt) throws InterruptedException {

        if (attempt == 3) {
            System.out.println("¬ы ввели логин пароль неверно три раза. ѕовторный ввод возможен через 5 секунд");
            Thread.sleep(5000);
        }
        if (attempt == 6) {
            System.out.println("¬ы превысили число попыток. ѕовторный ввод невозможен");
            return;
        }

        System.out.println("¬ведите логин: ");
        String tempLogin = myScanner.next();

        System.out.println("¬ведите пароль: ");
        String tempPass = myScanner.next();

        if (login.equals(tempLogin) & password.equals(tempPass)){
            System.out.println("Ћогин и пароль верны");
            return;

        }else {
            System.out.println("\nѕара логин + пароль не верна, повторите ввод");
            attempt++;
            passCheck(myScanner, password,login,attempt);
        }
    }
}
