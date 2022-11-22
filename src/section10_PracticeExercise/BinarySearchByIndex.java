package section10_PracticeExercise;

public class BinarySearchByIndex {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        int number = 30;
        int startIndex = 0;
        int endIndex = array.length - 1;
        int resultIndex = 0;
        while (true) {
            if (startIndex <= endIndex) {
                int middleIndex = (startIndex + endIndex) / 2;
                int middleValue = array[middleIndex];
                if (number > middleValue) {
                    startIndex = middleIndex + 1;
                } else if (number < middleValue) {
                    endIndex = middleIndex - 1;
                } else {
                    resultIndex = middleIndex;
                    break;
                }
            } else {
                break;
            }
        }

        System.out.println("Index of your number: " + resultIndex);
    }
}


     // МОЯ ВАРИАНТ РЕШЕНИЯ, НЕ СОВСЕМ КОРРЕКТНЫЙ
//        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
//        int index = 19;
//        int necessaryEl = -1;
//        int from = 0;
//        int to = array.length;
//        boolean middle = false;
//
//        if (index < array.length / 2) {
//            to = array.length / 2;
//        } else if (index > array.length / 2) {
//            from = array.length / 2;
//        }
//        else{
//            necessaryEl = array[array.length/2];
//            middle = true;
//        }
//        if(!middle) {
//            for (int i = from; i < to; i++) {
//                if (index == i) {
//                    necessaryEl = array[i];
//                    break;
//                }
//            }
//        }
//            System.out.println(necessaryEl);
//    }
