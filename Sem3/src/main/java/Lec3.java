import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
}
