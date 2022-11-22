package section08_Functions;


public class FunctionExampleFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
        System.out.println(factorial(5));
        System.out.println(factorial(1000));
    }

    private static String factorial(int value) {
        if (value < 0) {
            return "Value should be >= 0";
        } else {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                int oldResult = result;
                result = result * i;
                if (oldResult != result / i) {
                    return "Int overflow. Value > 2147483647";
                }
            }
            return String.valueOf(result);
        }
    }
}
