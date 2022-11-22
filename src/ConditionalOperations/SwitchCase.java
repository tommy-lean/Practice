package ConditionalOperations;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();

//        a - это переменная, которая будет сравниваться; 1,2,3 - это числа, с которыми будет сравниваться переменная
//        a = 1 ? Если да, тогда фрагмент кода в скобках выполнится и выведется "1".
//        Всегда нужно ставить break в конце, иначе будет выполняться следующий кейз.(можно и убрать, если необходимо)
//                  break можно не ставить в блоке default, ибо default итак подразумевает, что это конец блока кода switch case
//        поэтому программа это понимает и не просит в конце break
//          boolean long short double float нельзя использовать с switch case

        switch(a){
            case 1:{
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            default:{
                System.out.println("default");
                break;
            }
        }

        System.out.println("Enter the number of month: ");
        int month = scanner.nextInt();

        switch(month){
            case 1:
            case 2:
            case 12:{
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5:{
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8:{
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11:{
                System.out.println("Autumn");
                break;
            }
            default:{
                System.out.println("");
            }


//                НОВАЯ ФОРМА ОПЕРАТОРОВ SWITCH CASE, ДОБАВЛЕНА С 14 ВЕРСИИ ДЖАВА.
//                МОЖНО ИСПОЛЬЗОВАТЬ И СТАРУЮ И НОВУЮ ФОРМУ.
//                БОЛЬШИНСТВО ПРОГРАММИСТОВ ПРЕДПОЧИТАЮТ НОВУЮ ФОРМУ, ПОЭТОМУ ОНА БЫЛА ДОБАВЛЕНА В 14 ВЕРСИИ.
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter day of week: ");
//            int month = scanner.nextInt();
//
//            String season = switch(month){
//                case 1, 2, 12 -> "Winter";
//                case 3, 4, 5 -> "Spring";
//                case 6, 7, 8 -> "Summer";
//                case 9, 10, 11 -> "Autumn";
//                default -> "Incorrect number of month";
//
//
//            };
//            System.out.println(season);
        }
    }
}
