package section10_PracticeExercise;

import java.util.Arrays;

public class FindOnlyNumbersFromString {
    public static void main(String[] args) {
        String s = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";

        int[] numbers = new int[s.length() / 2+1];

        System.out.println(Arrays.toString(extracted(s, numbers)));
    }

    private static int[] extracted(String s, int[] numbers) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(" ");
        int j = 0;
        int result = 0;
        numbers[j] = 0;
        for (int i = 0; i < builder.length(); i++) {
            char current = builder.charAt(i);
            if (Character.isDigit(current)) {
                int number = Character.getNumericValue(current);
                result = result * 10 + number;
                numbers[j] = result;
                if (!Character.isDigit(builder.charAt(i + 1))) {
                    j++;
                    result = 0;
                }
            }
        }
        return ArrayClear(numbers, j);
    }
    private static int[] ArrayClear(int[] numbers, int j){
        int[] results = new int[j];
        for (int i = 0; i < j; i++) {
            results[i] = numbers[i];
        }
        return results;
    }

}
