package section06_array;

public class PracticeMinElement {
    public static void main(String[] args) {
        int array[] = {3, 4, 123, 5, 2};

        int res = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }

        System.out.println("Your minimal number: " + res);
    }
}
