package Task3;

public class Task3 {
    public static void main(String[] args) {
//        Написать программу, показывающую последовательность действий для игры “Ханойская башня”

        int n = 5; // Количество дисков
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B и C - названия стержней

    }
        static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){

            if (n == 1){
                System.out.println("Переместить диск 1 с башни " +  from_rod + " на башню " + to_rod);
                return;
            }

            towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
            System.out.println("Переместить диск " + n + " с башни " +  from_rod + " на башню " + to_rod);
            towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        }

    }

