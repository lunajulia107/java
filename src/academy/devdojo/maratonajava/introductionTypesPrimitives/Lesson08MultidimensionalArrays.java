package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson08MultidimensionalArrays {
    static void main() {
        // Arrays de arrays
        // 1,2,3,4,5 Meses
        // 31, 28, 31, 30 dias
        /*int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 31;

        days[2][0] = 31;
        days[2][1] = 28;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("------------------------");
        for(int[] arrBase: days) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }*/

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[1];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[3];

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {4,5,6,7,8,9,10}};

        for (int[] arrayBase: arrayInt2) {
            System.out.println("-------------------");
            for (int num: arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
