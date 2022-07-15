package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Task2 {

    private static ArrayList<int[]> digitsList = new ArrayList<>(); // ���  Task3Ver2();

    public static void main(String[] args) {


//        �������� �����, ������� ����� ����������� ������ ������������� ������� (��� �������������� ���������),
//        �������������� ����� ��� ������ ������������������ ������������ ����� �� n
//        �����
//        1
//        1 3
//        1 3 6

        Task2();

    }

    public static void Task2() {
        // n - ���������� ��������� �������
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("������� n: ");

        //    �������� �� ������������ ����������� ����
        while (inputScanner.hasNextInt()==false){
            System.out.print("������ �����. ��������� ������ ����� �����: ");
            inputScanner.next();
        }

        int n = inputScanner.nextInt();
//        System.out.println(n);

//      ������ ��������� ������
        int[] tempArray = new int[0];

        for (int i = 0; i < n; i++) {
//          ������ ����� ������� ���������� ������������ �����
            int newElement = triangle(i+1);
//          ��������� ����� ������� � ����� ������
            int[] newArray = addArrayElement(tempArray, newElement, i);

            System.out.println("������������ ������: ");
            System.out.println(Arrays.toString(newArray));
            tempArray = newArray;

        }
        inputScanner.close();
       }

    public static int triangle(int n) {
//      ���������� n-�� ������������ �����.

        int t = (int)(1d/2*n*(n+1));

//        System.out.printf("��������� %d \n", t);
        return t;
    }

    // ��������� ������� � �������
    public static int[] addArrayElement(int[] oldArray, int newElement, int index) {

        int newArray[] = new int[index+1];
        if (index!=0) {
            for (int i = 0; i < index; i++) {
                newArray[i] = oldArray[i];

            }
        }
        newArray[index] = newElement;
        return newArray;

    }



}

