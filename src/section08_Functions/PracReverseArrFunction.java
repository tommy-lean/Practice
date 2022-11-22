package section08_Functions;

import java.util.Arrays;

public class PracReverseArrFunction {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        reverse(array);
        reverse(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array));
    }
    private static void reverse(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length-i-1] = temp;
        }
    }
}
