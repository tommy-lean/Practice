package section10_PracticeExercise;

public class BinarySearchRecursive {
    public static void main(String[] args) {
    int[] array = {1, 3, 4, 6, 8, 10, 13, 14};

    int number = 6;
    int startIndex = 0;
    int endIndex = array.length - 1;
    int index = findIndex(array, startIndex, endIndex, number);

        System.out.println("Index: " + index);
    }
    private static int findIndex(int[] array, int startIndex, int endIndex, int number){
        if(startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) >>> 1;
            int middleValue = array[middleIndex];
            if (number < middleValue) {
                endIndex = middleIndex - 1;
                return findIndex(array, startIndex, endIndex, number);
            } else if (number > middleValue) {
                startIndex = middleIndex + 1;
                return findIndex(array, startIndex, endIndex, number);
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}

