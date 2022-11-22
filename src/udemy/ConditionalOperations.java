package udemy;

import java.util.Scanner;

public class ConditionalOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b){
            String result = "a > b";
            System.out.println(result);
        }
        else {
            System.out.println("a <= b");
        }

        if(a > b) {
            System.out.println("a > b");
        } else{
            if(a < b){
                System.out.println("a < b");
            }
            else{
                System.out.println("a = b");
            }

            }
//
    if (a > b){
        System.out.println("a > b");
    }
    else if(a < b){
        System.out.println("a < b");
    }
    else {
        System.out.println("a = b");
    }
    //
        boolean condition = a > b;
    if(condition){
        System.out.println("condition = true");
    }
    //
        if(condition || a < b && a > 1 || !(b<7)){
            System.out.println("Условие выполнено");
        }
    }
}
