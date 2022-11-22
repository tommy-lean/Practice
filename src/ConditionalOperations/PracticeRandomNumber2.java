package ConditionalOperations;

import java.util.Random;
import java.util.Scanner;

public class PracticeRandomNumber2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это игра угадай мною загаданное число от 0 до 10!");
        int number = new Random().nextInt(10);
        System.out.print("Число я загадал, введи число от 0 до 10: ");
        int userNumber = scanner.nextInt();

        String result = number == userNumber ?
                        "Вы угадали число! ответ: " + userNumber :
                        "Ха-ха, не угадал! Ответ был: " + number;

        System.out.println(result);
    }
}
