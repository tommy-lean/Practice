package section05_CycleS;

import java.util.Scanner;

public class PracticeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите увидеть");
        int factorial = scanner.nextInt();
        int from = 1;
        int result = 1;
        String finalResult;

        for (int i = from; i <= factorial; i++) {
            if (result < 0) {
                break;
            }
            result = result * i;
        }

        if (factorial < 0) {
            finalResult = "Value should be >= 0";
        } else if (result < 0) {
            finalResult = "Int overflow.\nYour result > 2147483647";
        } else {
            String.valueOf(result);
            finalResult = "Your factorial = " + result;
        }

        System.out.println(finalResult);

            // Вариант из видеоролика
//        // read source data
//        var value = 5;
//
//        // processing
//        String finalResult;
//        if (value < 0) {
//            finalResult = "Value should be >=0";
//        } else {
//            var result = 1;
//            for (var i = 1; i <= value; i++) {
//                var oldResult = result;
//                result *= i; // result = result * i;
//                if (oldResult != result / i) {
//                    result = 0;
//                    break;
//                }
//            }
//            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
//        }
//
//        // display results
//        System.out.println(finalResult);
    }
}


