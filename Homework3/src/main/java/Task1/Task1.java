package Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
//        ������� ����� (Map), ����� ������� � ���� ������ ���������� ����� (������� � ���������� ������),
//        ���� ����� ��������� �������, �� ������ ���������� ��� ������ (���� ������ Map �� ����� ������� ���������,
//        ����� �������� ����� �������� �� �����, ����� �������� ��� �� ��������� ������)

//        1) ������ ����������

        Map<String, ArrayList<String>> PhoneBook = new HashMap<>();

        // ���� ������

        ArrayList<String> MyAL = new ArrayList<>();
        MyAL.add("224488");

        PhoneBook.put("������", (ArrayList<String>) MyAL.clone());

        MyAL.clear();
        MyAL.add("221188");
        MyAL.add("331526");
        MyAL.add("448783");

        PhoneBook.put("��������", (ArrayList<String>) MyAL.clone());
        MyAL.clear();
        MyAL.add("446622");
        MyAL.add("559988");

        PhoneBook.put("�������", (ArrayList<String>) MyAL.clone());
        MyAL.clear();

//        2) ���� �������
        System.out.println("\n����� ����������: " + PhoneBook + "\n������� ������� ��� ������: ");
        Scanner myScanner = new Scanner(System.in);
        String Surname = myScanner.nextLine();
        myScanner.close();
//        ������ �� map ����� entryset

//        Iterator myIter = PhoneBook.entrySet().iterator()

        boolean findSuccess = false;

        for (Map.Entry myEntry : PhoneBook.entrySet()) {
            if (Objects.equals(Surname, myEntry.getKey())){
                System.out.println("������� ������ � �����������: \n �������: " + myEntry.getKey() + "\n ��������: " + myEntry.getValue());
                findSuccess = true;
            }
        }
        if (!findSuccess) System.out.println("������ �� �������");
    }
}
