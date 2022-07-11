import java.util.*;

public class Lec3 {
    public static void main(String[] args) {
//        ��� ������ �� 10 - 20 ���� � ���������, ������� ���� �� ����� ��� �������� � ������� ������� ��� ��� ����������� �� ���������.
//        1) ������� ������
//        2) �������� �� ������, ��������� ������������� ��������, �������� ������ � ����������� ��������
//        3) ������� ������ ��� ��������
//        4) ������� ������ � ��������� ����� �������� ������� �����.

//        Task1();
//        Task1_fromSeminar();

//        �������� ��������� �������� n ���������� �� ���� �� 0 - 9 (n ����� �������)
//        ��
//        0 0 0
//        0 0 1
//        0 0 2
//        - - -
//        9 9 9
//        n - ����� ����� ������

        Task2();
    }

    public static void Task1() {
        String[] myArray = new String[] {"������", "�������", "�������", "�������", "�����", "�������", "��������", "�������", "�����", "������"};
//        System.out.println(Arrays.toString(myArray));

        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));
        ArrayList<String> newWordList = new ArrayList<>();

//        List<String> wordList = List.of("������", "�������", "�������", "�����", "�����", "�������", "��������", "�������", "�����", "������");

        System.out.println("�������� ������: \n"+ wordList + "\n");

//      ������ �� ��������� arraylist
        for (int i = 0; i < wordList.size(); i++) {
            String currentElement = wordList.get(i);
//            System.out.println(currentElement);
            int j = 0;

            Iterator<String> wordIter = wordList.iterator(); //������� ��������
            while (wordIter.hasNext()){ //�� ��� ���, ���� � ������ ���� ��������
                String currentIter = wordIter.next();
//                System.out.println(currentIter); //�������� ��������� ������� � ������� ��� � �������

                if (currentIter == currentElement) j++;

                if (currentIter == currentElement && j>1) wordIter.remove();
                }

            newWordList.add(String.valueOf(j));
        }
        System.out.println("������ ��� ��������: \n" + wordList + "\n");
//        System.out.println(newWordList);

        System.out.println("������� ��� ����������� ����� � ������: \n");
        for (int i = 0; i < wordList.size(); i++) {

            System.out.println(wordList.get(i) + " - " + newWordList.get(i) + " ���");

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
        Map<String,Integer> result = new HashMap<>(); // hashmap - ��� ������ � ����������� ���������� ������ (��� ��������)
        for (String string : start){
            result.put(string, Collections.frequency(start,string)); // ��� ����� ��������� �� ���������� ����� count
        }
        return result;
    }

    public static void Task1_fromSeminar() {

        String[] myArray = new String[] {"������", "�������", "�������", "�������", "�����", "�������", "��������", "�������", "�����", "������"};
//        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));

        List<String> wordList = Arrays.asList("������", "�������", "�������", "�������", "�����", "�������", "��������", "�������", "�����", "������");


        System.out.println("������� ��� ����������� ����� � ������: \n");

        // ������� ���� � ������� entrySet
        for (Map.Entry<String, Integer> buf : transformer(wordList).entrySet()) { // ��� ������ ���� ����-�������� � ����
            System.out.println(buf.getKey() +" - " + buf.getValue());
        }
//        System.out.println(transformer(wordList));


    }

    public static void Task2() {
//        ����� n, �� ������ �������� ����� � ������� ���� ��������� ��������� ���� � ���� �������
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



