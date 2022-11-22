package ConditionalOperations;

import java.util.Scanner;

public class PracticeLeapDay {
    public static void main(String[] args) {
//        Вариант из видеоролика, в самом низу мой вариант
//        read source data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доброго времени суток! Это программа по определению високосного года");
        System.out.println("Введите год, который вас интересует: ");
        int year = scanner.nextInt();

//        processing 1
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0){
            isLeap = false;
        } else if (year % 4 == 0){
            isLeap = true;
        } else{
            isLeap = false;
        }

//      processing 2    Второй более короткий вариант программы
//        if((year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)))){
//            isLeap = true;
//        } else{
//            isLeap = false;
//        }

//        processing 3
//        isLeap = (year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)));

//        display results
        System.out.println(isLeap ? year + " год является високосным" : year + " год является невисокосным");

    }
}

//            !!!!МОЙ ВАРИАНТ!!!!!
//        System.out.println("Доброго времени суток! Это программа по определению високосного года");
//        System.out.println("Введите год, который вас интересует: ");
//        double year = scanner.nextInt();
//        double leapYear = year % 400;
//        double leapYear2 = year % 4;
//        double normalYear = year % 100;
//
//        String result;
//        if (leapYear == 0) {
//        result = year + " год - является високосным годом";
//        } else if (normalYear == 0) {
//        result = year + " год - является невисокосным";
//        } else if (leapYear2 == 0) {
//        result = year + " год - является високосным";
//        } else {
//        result = year + " год - является невисокосным";
//        }
//
//        System.out.println(result);
