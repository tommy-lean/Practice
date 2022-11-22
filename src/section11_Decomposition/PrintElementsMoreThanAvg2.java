package section11_Decomposition;

import java.util.Arrays;

public class PrintElementsMoreThanAvg2 {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 18};

        int average = getAverage(array);

        int[] results = getNumsThanMoreAvg(array, average);

        System.out.println(Arrays.toString(results));


    }

    private static int getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = (int) Math.round(sum / array.length);
        return average;
    }

    private static int[] getNumsThanMoreAvg(int[] array, int average) {
        int[] results = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                results[count++] = array[i];
            }
        }
        return Arrays.copyOf(results, count);
    }
}

