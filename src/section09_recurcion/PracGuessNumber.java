package section09_recurcion;

import java.util.Random;
import java.util.Scanner;

public class PracGuessNumber {
    public static void main(String[] args) {
        System.out.println("Hello!It's game guess number from 1 to 10!");
        System.out.println("Try guess my number!");
        int randomNumber = new Random().nextInt(10);
        guessTheNumber(randomNumber);
    }
    private static void guessTheNumber(int randomNumber){
        System.out.println("Enter your number: ");
       int userNumber = new Scanner(System.in).nextInt();
       if(userNumber < 0 || userNumber > 10){
           System.out.println("Enter number from 0 to 10 please");
           guessTheNumber(randomNumber);
       }
       else if(userNumber > randomNumber ){
           System.out.println("My number < " + userNumber + ". Try again");
           guessTheNumber(randomNumber);
       }
       else if(userNumber < randomNumber){
           System.out.println("My number > " + userNumber + ". Try again");
           guessTheNumber(randomNumber);
       }
       else if(userNumber == randomNumber){
           System.out.println("Congratulations! You guessed the number!");

       }

    }
}
