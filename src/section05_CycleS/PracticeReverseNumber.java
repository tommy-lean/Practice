package section05_CycleS;

import java.util.Scanner;

public class PracticeReverseNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

       int number = scanner.nextInt();     // 123456789 например, программа выводит число с обратным порядком

       int result = 0;
       int temp = number;
       while (temp != 0){
           int digit = temp % 10;
           result = result * 10 + digit;
           temp /= 10;
       }

        System.out.println("Reverse number: " + result);


    }
}
