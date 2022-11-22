package section06_array;

import java.util.Arrays;

public class PracSwapMaxMin {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            else if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println(Arrays.toString(array));
    }
}
