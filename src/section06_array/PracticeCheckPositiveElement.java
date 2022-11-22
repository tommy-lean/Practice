package section06_array;

public class PracticeCheckPositiveElement {
    public static void main(String[] args) {
        int array[] = {0, -1, 2, 1, 4, 2};

        boolean negative = false;
        String result;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative = true;
            }
        }
        if (negative) {
            result = "Array has negative elements";
        } else {
            result = "All elements are positive";
        }

        System.out.println(result);

        System.out.println();

        System.out.println(negative ? "Array has negative elements" : "All elements are positive");
    }
}
