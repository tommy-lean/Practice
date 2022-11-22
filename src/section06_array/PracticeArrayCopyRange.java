package section06_array;

import java.util.Arrays;

public class PracticeArrayCopyRange {
    public static void main(String[] args){
        int[] array = {1, -2, 3, -4, 5};
        int startIndex = 1;
        int endIndex = 3;
        int destination[] = new int[endIndex - startIndex];
        System.out.println(Arrays.toString(destination));

        for(int i = 0; i < destination.length; i++) {
            if (i >= startIndex && i < endIndex) {
                destination[i] = array[i];

            }


        }

        System.out.println(Arrays.toString(destination));
        System.out.println();
        System.out.println("End.");
    }
}
