package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task3 {

    private static ArrayList<int[]> digitsList = new ArrayList<>(); // ���  Task3Ver2();

    public static void main(String[] args) {

//        *+������ ��������� ���� q + w = e, q, w, e >= 0.
//        ��������� ����� ����� ���� �������� ������ �������,
//        �������� 2? + ?5 = 69. ��������� ������������ ��������� �� ������� ���������.
//        ���������� ���� �� ���� ������� ��� ��������, ��� ��� ���.

        // ������� �� ����, ��� � ������ ����� ����� ���� ������ ������ ������ ����� ����� �� "?"
//        Task3();

        // ������ 2. ������� �� ����, ��� ������ ������� ����� ���� ��������� � ������ �����
        Task3Ver2();
        /*
        1) ������ ����� � ?
        2) �������� ������� ���� �������� (������ �������?)
        3) ����������� - �������� �� ����� ��������� � ����� (������� �������� ��� ����)
        ���� ��� �������� ����� ��������� � ��������� �������������, �� ����� ������������ ��� �������� ���������


        * */


    }

    public static void Task3() {

        Scanner MyScan = new Scanner(System.in);
        System.out.println("������ ��������� q + w = e. ������� ����� q = ");
        String q = MyScan.nextLine();
//        System.out.printf("q = %s\n", q);
        System.out.println("������� ����� w = ");
        String w = MyScan.nextLine();
//        System.out.printf("w = %s", w);
        System.out.println("������� ����� e = ");
        int e = MyScan.nextInt();
//        System.out.printf("e = %d", e);

        int[] qArray = questionToDigit(q);
//        System.out.println("����� q � ������ ����� �������" + Arrays.toString(qArray));
        int[] wArray = questionToDigit(w);
//        System.out.println("����� w � ������ ����� �������" + Arrays.toString(wArray));

        equationSolution(qArray,wArray,e);

    }

    public static int[] questionToDigit (String str) {

//      ����������� ������ � ������ ��� �������
        char[] chars = str.toCharArray();
        int newDigit = 0;

        boolean questionMarkSwitch = false; // �������, ��� ���������� ���� �������
        int targetIndex = 0; // ������ �� ������ ?

        // �������� �� ����� �� ������� �������� � �������


        for (int i = chars.length - 1; i >= 0; i--) {
            int ind = chars.length - 1 - i;
//            System.out.println("chars[i] and ind " + chars[i] + " " + ind);
            // ����������� ����� � �����

            if (Character.isDigit(chars[i])) {
                newDigit += (chars[i] - '0') * (Math.pow(10, ind));
//                System.out.println("newDigit = " + newDigit);

            } else if (chars[i] == '?' && questionMarkSwitch == false) {
                targetIndex = ind;
//                System.out.println("targetIndex = " + targetIndex);
                questionMarkSwitch = true;

            } else {
                System.out.println("������������ ��������: " + str + "\n���������� �����");
                break;
            }
        }

        if (questionMarkSwitch == false){
            targetIndex = -1;
        }

        int [] outputArray = new int[]{newDigit, targetIndex};
        return outputArray;

    }

    public static void equationSolution(int[] qArray, int[] wArray, int e) {
        int q = qArray[0];
        int qQuestionIndex = qArray[1];
        int qNoQMark = 1;
        if (qQuestionIndex == -1) qNoQMark = 0; // ���� ��� ����� ������� � �����
        int w = wArray[0];
        int wQuestionIndex = wArray[1];
        int wNoQMark = 1;
        if (wQuestionIndex == -1) wNoQMark = 0;  // ���� ��� ����� ������� � �����

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double qIter = q + ((Math.pow(10, qQuestionIndex))*i*qNoQMark);
                double wIter = w + ((Math.pow(10, wQuestionIndex))*j*wNoQMark);


                if ( (qIter + wIter) == e){
                    System.out.printf("\n������� �������: " + (int)qIter + " + " + (int)wIter + " = " + e );
                    return;
                }
                
            }
        }
        System.out.println("\n������� �� �������");
    }

    public static void Task3Ver2() {

        //  ���� ��������

        Scanner MyScan = new Scanner(System.in);
        System.out.println("������ ��������� q + w = e. ������� ���������: ");
        String formula = MyScan.nextLine();
        formula = formula.replace(" ", "");
        char[] chars = formula.toCharArray();
        int formulaLen = chars.length;
//        System.out.println(formulaLen);

        // ������� ����� ������� � �������� �� ��������� � ������

        List<Integer> questionMarkList = new ArrayList<>();

        for (int i = 0; i < formulaLen; i++) {
//            �������� �� ������������ �����
            if (chars[i] != '?' & chars[i] != '+' & chars[i] != '=' & !Character.isDigit(chars[i])) {
                System.out.println("������ �����. ���������� ��� ���");
                return;
            }
            if (chars[i] == '?') questionMarkList.add(i);

        }
        System.out.println("�������� ����, ��� ������");

        // �������� ������ �������� � ��������� ���� ���������� �� n ��������

        int decade = questionMarkList.size();
        int index = 0;
        int[] comb = new int[decade];

        generate(comb, index);

//        System.out.println(Arrays.deepToString(digitsList.toArray()));
//        System.out.println(digitsList.get(1)[1]);
//        System.out.println((char) digitsList.get(1)[1]);
//        System.out.println((int)(char) digitsList.get(1)[1]);

        // �������� ��������� ����� ������� �� �������� ���� �� ������ ��������

        boolean success = false; // ���������, ������� �� �������

        // �� ���� ���������� ����


        for (int i = 0; i < Math.pow(10,decade) ; i++) {
            // ������ � ������ ? �� �����
            for (int j = 0; j < questionMarkList.size(); j++) {
//                chars[questionMarkList.get(j)] = (char) digitsList.get(i)[j];
                chars[questionMarkList.get(j)] = Character.forDigit(digitsList.get(i)[j],10) ;
            }
//            System.out.println(chars);
//            System.out.println((int) chars[1]);
//            System.out.println((int) chars[2]);

            // ��������� ������� - ������ �� ����� � ����� + =
            String q = "";
            String w = "";;
            String e = "";;
            int k = 0;

            for (k = 0; k < chars.length; k++) {
                if (chars[k] != '+') q = q + chars[k];
                else break;
                }

            for (k = k + 1; k < chars.length; k++) {
                if (chars[k] != '=') w = w + chars[k];
                else break;
                }

            for (k = k + 1; k < chars.length; k++) {
                    e = e + chars[k];
                }
//            System.out.println(q);
//            System.out.println(w);
//            System.out.println(e);
            int qInt = Integer.parseInt(q);
            int wInt = Integer.parseInt(w);
            int eInt = Integer.parseInt(e);


            if ((qInt + wInt) == eInt) {
                System.out.println("������� �������: " + q + " + " + w + " = " + e + "\n");
                success = true;
                return;

            }

        }

    if (success == false) System.out.println("\n������� �� �������");


    }


// ���� ��� ������ ������ � �������� - ����� ��������� ������� � ������� � ���������� �� � ������ �������� digitsList
    public static void generate(int[] comb, int index) {
        if (comb.length == index){
            digitsList.add(comb.clone());
            return;

        }
        for (int i = 0; i < 10; i++) {
            comb[index] = i;
            generate(comb, index +1);

        }
    }


    // �� ������������. ���������� ������ ������� �� n ��������

    public static ArrayList<ArrayList<Integer>> ArrArr (int n) {

        ArrayList<ArrayList<Integer>> MyArrList = new ArrayList<>();
        int k = (int) Math.pow(10,n);
        for (int i = 0; i < k; i++) {
            MyArrList.add(ArrGen(i,n)); // �� ������� c �������� n

        }
//        System.out.println(MyArrList);
        return MyArrList;

    }

    // �� ������������    // ������ ������ ���� �� ����� i/ Y
    public static ArrayList<Integer> ArrGen(int i, int n) {
        ArrayList<Integer> tempAL = new ArrayList<>(n);


        for (int j = n; j >= 1; j--) {
            int tempPow = (int) Math.pow(10,j-1);
            int k = i / (int) Math.pow(10,j-1);
            tempAL.add(k);
            i = i % (int) Math.pow(10,j-1);
//            System.out.println(k);

        }
        System.out.println(tempAL);
        return tempAL;

    }

}

