package Task3;

public class Task3 {
    public static void main(String[] args) {
//        �������� ���������, ������������ ������������������ �������� ��� ���� ���������� ������

        int n = 5; // ���������� ������
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B � C - �������� ��������

    }
        static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){

            if (n == 1){
                System.out.println("����������� ���� 1 � ����� " +  from_rod + " �� ����� " + to_rod);
                return;
            }

            towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
            System.out.println("����������� ���� " + n + " � ����� " +  from_rod + " �� ����� " + to_rod);
            towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        }

    }

