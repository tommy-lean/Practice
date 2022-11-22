package section05_CycleS;

import java.util.Random;
import java.util.Scanner;

public class BreakUsage {
    public static void main(String[] args){
        // Нерациональное использование break, можно выполнить короче, изменив параметры цикла
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if(i == 5){
                break;
            }
        }
        System.out.println();
        // Рациональное использование
        for (int i = 0; i <= 5 ; i++) {
            System.out.print(i + " ");
        }

        // Примеры использований
        // 1. Бесконечные циклы как в PracticeRandomNumber
        // 2:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Это игра угадай число от 0 до 10! Я загадал своё число, а ваша задача его отгадать.");
        int number = new Random().nextInt(10);


        boolean guessed = false;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите ваше число: ");
            int UserNumber = scanner.nextInt();
            if(UserNumber>10 || UserNumber<0){
                System.out.println("Упс, ошибка! Введите число от 0 до 10");
            }
            else if(number == UserNumber){
                guessed = true;
                System.out.println("Ура! Вы угадали число: " + UserNumber + "!");
                break;
            }
            else if(number > UserNumber){
                System.out.println("Упс! Вы не угадали число.");
                System.out.println("Загаданный номер > " + UserNumber + ". Попробуйте снова!");
            }
            else if(number < UserNumber){
                System.out.println("Упс! Вы не угадали число.");
                System.out.println("Загаданный номер < " + UserNumber + ". Попробуйте снова!");
            }
        }
        if(!guessed){
            System.out.println("Вы истратили все 10 попыток. Игра окончена.");
        }

    }
}
