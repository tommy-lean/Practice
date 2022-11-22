import java.util.Scanner;

public class VerySimpleCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"a\": ");
        double a = scanner.nextDouble();
        System.out.println("Enter \"b\": ");
        double b = scanner.nextDouble();
        System.out.println("Enter operator: (+,-,*,/,%) ");
        var operator = new Scanner(System.in).nextLine().charAt(0);
        
        double res1 = 0;
        if(operator == '+'){
            res1 = a + b;

        }
        else if(operator == '-'){
            res1 = a - b;

        }
        else if(operator == '*'){
            res1 = a * b;

        }
        else if(operator == '/'){
            res1 = a / b;

        }
        else if(operator == '%'){
            res1 = a % b;

        }
        else{
            System.out.println("Unsupported operator: " + operator);

        }
        System.out.println(a + " " + operator + " " + b + " = " + res1);


    }
}
