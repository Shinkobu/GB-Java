public class Homework2 {
    public static void main(String[] args) {


        int sortedArray[]; // ���������� �������
//     sortedArray = new int[10]; // ��������� ������ ��� �������
        sortedArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int digitToFind = 11;

        System.out.println(Task1(sortedArray,digitToFind,0,sortedArray.length-1));

    }

//    � ��� ���� ��������������� ������
//    ����� ��������� ����������� ���������� ������� ����� ���������� ����� (�������� ��������� ������ )

    public static int Task1(int sortedArray[], int digitToFind, int firstIndex, int lastIndex ) {

     int targetIndex = (firstIndex+lastIndex) / 2;

     if (sortedArray[targetIndex] == digitToFind) {
         return targetIndex;
     }

     if (sortedArray[targetIndex]>digitToFind){
        lastIndex = targetIndex-1;
        return Task1(sortedArray, digitToFind, firstIndex,lastIndex);
     }
     else if (sortedArray[targetIndex]<digitToFind){
        firstIndex = targetIndex+1;
        return Task1(sortedArray, digitToFind, firstIndex,lastIndex);
     }
     else
         System.out.println("������. ����� �� �������");
         return -1;

    }

}
