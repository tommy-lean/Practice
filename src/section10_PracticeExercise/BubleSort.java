package section10_PracticeExercise;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};

        System.out.println(Arrays.toString(bubleSort(array)));
    }

    private static int[] bubleSort(int[] array) {
        int temp;
        int count = 1;
        while (true) {
            if (count != 0) {
                count = 0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        count++;
                    }
                }
            } else {
                break;
            }
        }
        return array;
    }





//    private static void bubbleSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            boolean swap = false;
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    var temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                    swap = true;
//                }
//            }
//            if (!swap) {
//                break;
//            }
//        }
//    }
}