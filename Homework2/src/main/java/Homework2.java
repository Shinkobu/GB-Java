import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);
        int sortedArray[]; // ���������� �������
//     sortedArray = new int[10]; // ��������� ������ ��� �������
        sortedArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("��� ������: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.printf("\n������� ������� �����: ");

        // �������� �� �������� �����
        while (myScan.hasNextInt()==false){
            System.out.printf("������ �����. ��������� ������ ����� �����: ");
            myScan.next();
        }


        int digitToFind = myScan.nextInt();



        Task1(sortedArray,digitToFind,0,sortedArray.length-1);

    }

//    � ��� ���� ��������������� ������
//    ����� ��������� ����������� ���������� ������� ����� ���������� ����� (�������� ��������� ������ )

    public static void Task1(int[] sortedArray, int digitToFind, int firstIndex, int lastIndex ) {

     int targetIndex = (firstIndex+lastIndex) / 2;

     if (firstIndex==lastIndex){
         System.out.println("\n������. ����� �� �������\n");
         return;
     }
     if (sortedArray[targetIndex] == digitToFind) {
         System.out.printf("\n������� ����� �� ������� %d\n", targetIndex+1);
         return;
     }

     if (sortedArray[targetIndex]>digitToFind){
        lastIndex = targetIndex-1;
        Task1(sortedArray, digitToFind, firstIndex,lastIndex);
     }
     else {
        firstIndex = targetIndex+1;
        Task1(sortedArray, digitToFind, firstIndex,lastIndex);
     }


    }

}
