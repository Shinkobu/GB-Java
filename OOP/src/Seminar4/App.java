package Seminar4;

/*
    ���������. �1
    ����������� ����������� ArrayList
    ����� ������� ������: ����������� ����������� ������ ��� ��������������� ������

    ������, ������� ������ �������������:

    add - ��������� �������
    get by index - �������� �������
    remove by index and by element - ������� �������
    set - ������ ������� � ������ �������
    indexOf - �������� ������ ��������
    contains - �������� ������� ��������
    addAll - ��������� � ������� ������ ������ ������
    removeAll - ������� �� ������ ��� �������� ������� ������
    sort - ����������
    clear - ������� ������
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        PlusList<Integer> arra1 = new PlusList<>(3);
        arra1.plusAdd(1);
        System.out.println(arra1);
        arra1.plusAdd(2);
        System.out.println(arra1);
        arra1.plusAdd(3);
        System.out.println(arra1);

        String s = arra1.getByIndex(1).toString();
        System.out.println(s);

        arra1.removeByIndex(0);
        System.out.println(arra1);

        arra1.removeByElement(3);
        System.out.println(arra1);

    }
}
