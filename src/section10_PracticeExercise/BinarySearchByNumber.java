package section10_PracticeExercise;

public class BinarySearchByNumber {
    public static void main(String[] args) {

    int[] array = {100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
    int number = 50;
    int necessaryIndex = -1;
    int from = 0;
    int to = array.length;
    boolean middle = false;

        if (number < array[array.length / 2]) {
        to = array.length / 2;
    } else if (number > array[array.length / 2]) {
        from = array.length / 2;
    }
        else{
        necessaryIndex = array.length/2;
        middle = true;
    }
        if(!middle) {
        for (int i = from; i < to; i++) {
            if (number == array[i]) {
                necessaryIndex = i;
                break;
            }
        }
    }
            System.out.println(necessaryIndex);
    }
}
