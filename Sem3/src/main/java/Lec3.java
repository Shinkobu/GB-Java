import java.util.*;

public class Lec3 {
    public static void main(String[] args) {
//        ��� ������ �� 10 - 20 ���� � ���������, ������� ���� �� ����� ��� �������� � ������� ������� ��� ��� ����������� �� ���������.
//        1) ������� ������
//        2) �������� �� ������, ��������� ������������� ��������, �������� ������ � ����������� ��������
//        3) ������� ������ ��� ��������
//        4) ������� ������ � ��������� ����� �������� ������� �����.

        Task1();


    }

    public static void Task1() {
        String[] myArray = new String[] {"������", "�������", "�������", "�����", "�����", "�������", "��������", "�������", "�����", "������"};
//        System.out.println(Arrays.toString(myArray));
        ArrayList<String> wordList = new ArrayList<>(List.of(myArray));
        ArrayList<String> newWordList = new ArrayList<>();

//        List<String> wordList = List.of("������", "�������", "�������", "�����", "�����", "�������", "��������", "�������", "�����", "������");

        System.out.println(wordList);

//        wordList.remove(1);

//        for (String i : wordList) {
//            System.out.println(i);
//            if (i == "�������") wordList.remove(i);
//
//        }
//        System.out.println(wordList);
//

//        HashSet<String> mySet = new HashSet<>();
//        mySet.addAll(wordList);
//        System.out.println(mySet);


        Iterator<String> wordIter = wordList.iterator(); //������� ��������

        while (wordIter.hasNext()){ //�� ��� ���, ���� � ������ ���� ��������
            String currentIter = wordIter.next();
            System.out.println(currentIter); //�������� ��������� ������� � ������� ��� � �������

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
