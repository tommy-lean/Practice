package section05_CycleS;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class PracticeRandomNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это игра угадай число от 0 до 10! Я загадал своё число, а ваша задача его отгадать.");
        int number = new Random().nextInt(10);
        
        while(true){
            System.out.println("Введите ваше число: ");
            int UserNumber = scanner.nextInt();
            if(UserNumber>10 || UserNumber<0){
                System.out.println("Упс, ошибка! Введите число от 0 до 10");
            }
            else if(number == UserNumber){
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





        }
    }

