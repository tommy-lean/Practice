package section11_Decomposition;

import java.util.Arrays;

public class PrintElementsMoreThanAvg {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 18};

        int average = getAverage(array);
        int count = getCount(array, average);

        int[] results = getNumsThanMoreAvg(array, average, count);

        System.out.println(Arrays.toString(results));


    }
    private static int getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = (int) Math.round(sum/ array.length);
        return average;
    }

    private static int getCount(int[] array, int average) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > average){
                count++;
            }
        }
        return count;
    }

    private static int[] getNumsThanMoreAvg(int[] array, int average, int count) {
        int[] results = new int[count];
        for (int i = 0; i < results.length; i++) {
            if(array[i] > average){
                results[i] = array[i];
            }
        }
        return results;
    }


}
