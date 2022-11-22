package section08_Functions;

import java.util.Arrays;

public class PercentElementArray {
    public static void main(String[] args){
        int array[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int[] unique = new int[array.length];
        int[] counts = new int[array.length];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if(unique[j] == array[i]){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                int number = 1;
                for (int j = i + 1; j < array.length ; j++) {
                    if(element == array[j]){
                        number++;
                    }
                }
                unique[index] = element;
                counts[index] = number;
                index++;
            }
        }
        int[][] result = new int[index][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " = " + ((double) result[i][1] / array.length*100) + " %");
        }
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

}
