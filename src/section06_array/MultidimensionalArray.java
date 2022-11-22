package section06_array;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array1 = new int[3][4];
        int[][] array2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(array2[1][3]);
        System.out.println();
        // Как вывести двумерный массив на консоль при помощи foreach
        for (int[] row : array2) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        // Как вывести именно значения многомерного массива на консоль при помощи array.fori
        for(int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
