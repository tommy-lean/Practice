package ConditionalOperations;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(10);
        System.out.println("Здравствуйте, это игра, угадай число");
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Отлично, " + name + ", Сейчас я загадаю число от 1 до 10, а вам нужно его угадать");
        System.out.println("Число я загадал, теперь попробуйте отгадать его");
        System.out.print("Введите ваше число от 1 до 10: ");
        int UserNumber = scanner.nextInt();


        String result;
        if (UserNumber > 10 || UserNumber < 1) {
            result = "Не, не. Введите число от 1 до 10";
        }
        else if (UserNumber == number) {
            String lucky = String.valueOf(UserNumber);
            result = "Да что ты себе позволяешь, " + name + ", ты попал(а) в точку! Ответ: " + lucky;
        } else {
            String mistake = String.valueOf(number);
            result = "Упс, ты не угадал(а)! Я загадал: " + number;
        }

        System.out.println(result);
    }
}
