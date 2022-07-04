import java.util.Arrays;
import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {

//      � ��� ���� ��������������� ������
//      ����� ��������� ����������� ���������� ������� ����� ���������� ����� (�������� ��������� ������)

//        Task1();

//        �������� �����, ������� ����� ����������� ������ ������������� ������� (��� �������������� ���������),
//        �������������� ����� ��� ������ ������������������ ������������ ����� �� n
//        �����
//        1
//        1 3
//        1 3 6

//        Task2();


//        *+������ ��������� ���� q + w = e, q, w, e >= 0.
//        ��������� ����� ����� ���� �������� ������ �������,
//        �������� 2? + ?5 = 69. ��������� ������������ ��������� �� ������� ���������.
//        ���������� ���� �� ���� ������� ��� ��������, ��� ��� ���.

        Task3();


    }


    public static void Task1() {

        Scanner myScan = new Scanner(System.in);
        int rawArray[]; // ���������� �������
        rawArray = new int[10]; // ��������� ������ ��� �������
//        sortedArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        // ��������� ������ ���������� �������
        for (int i = 0; i < rawArray.length ; i++) {
            rawArray[i] = (int) (Math.random()*100); // �������� [0;1) ���������� �� 100. ( Math.random() * (b-a) ) + a, ��� ��������� (a;b]
        }
        System.out.println("������������ ������: ");
        System.out.println(Arrays.toString(rawArray));

        // ����������
        int [] sortedArray = shuttleSort(rawArray);


        System.out.println("\n��������������� ������: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.printf("\n������� ������� �����: ");

        // �������� �� �������� �����
        while (myScan.hasNextInt()==false){
            System.out.printf("������ �����. ��������� ������ ����� �����: ");
            myScan.next();
        }
        int digitToFind = myScan.nextInt();
        myScan.close();

        // ����� ����� ���������
        Task1RecursionSearch(sortedArray,digitToFind,0,sortedArray.length-1);
    }

    public static void Task1RecursionSearch(int[] sortedArray, int digitToFind, int firstIndex, int lastIndex ) {

     int targetIndex = (firstIndex+lastIndex) / 2;

     if (firstIndex==lastIndex){
         System.out.println("\n����� �� �������\n");
         return;
     }
     if (sortedArray[targetIndex] == digitToFind) {
         System.out.printf("\n������� ����� �� ������� %d\n", targetIndex+1);
         return;
     }

     if (sortedArray[targetIndex]>digitToFind){
        lastIndex = targetIndex-1;
         Task1RecursionSearch(sortedArray, digitToFind, firstIndex,lastIndex);
     }
     else {
        firstIndex = targetIndex+1;
         Task1RecursionSearch(sortedArray, digitToFind, firstIndex,lastIndex);
     }


    }

    public static int[] shuttleSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                temp = array[i];
                array[i] = array [i-1];
                array[i-1] = temp;

                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        temp = array[z];
                        array[z] = array [z-1];
                        array[z-1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
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

    public static void Task3() {

        Scanner MyScan = new Scanner(System.in);
        System.out.println("������ ��������� q + w = e. ������� ����� q = ");
        String q = MyScan.nextLine();
        System.out.printf("q = %s\n", q);
        // System.out.println("������ ��������� q + w = e. ������� ����� w = ");
        // String w = MyScan.nextLine();
        // System.out.printf("w = %s", w);
        // System.out.println("������ ��������� q + w = e. ������� ����� e = ");
        // int e = MyScan.nextInt();
        // System.out.printf("e = %d", e);
        char[] chars = q.toCharArray();
        int newQ = 0;
        for (int i = chars.length-1; i>=0 ; i--){
            int ind = chars.length-1-i;
            System.out.println("chars[i] and ind " + chars[i] + " " + ind);
            if (Character.isDigit(chars[i])) {
                newQ += (chars[i]-'0')*(Math.pow(10,ind));

                System.out.println("newQ = " + newQ);

            }else if (chars[i] == '?') {
                int targetIndex = ind;
                System.out.println("oops!");
            }// �������� ������� ������ ? � ������ �����, ������ ��������� �� ������. �������� �������� �� ������ �������


        }

    }

}

