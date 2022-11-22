package ConditionalOperations;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"a\"");
        int a = scanner.nextInt();
        System.out.println("Enter \"b\"");
        int b = scanner.nextInt();
        System.out.println("Enter operator: (+,-,*,/,%)");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result;
        if(operator == '+'){
            result = "a + b = " + (a + b);
        }
        else if(operator == '-'){
            result = "a - b = " + (a - b);
        }
        else if(operator == '*'){
            result = "a * b = " + (a * b);
        }
        else if(operator == '/'){
            result = "a / b = " + (a / b);
        }
        else if(operator == '%'){
            result = "a % b = " + (a % b);
        }
        else{
            result = "Unsupported operator: " + operator;
        }
        System.out.println(result);


    }
}
