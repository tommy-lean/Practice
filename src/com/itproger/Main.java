package com.itproger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        byte[] nums1 = new byte[] {5, 6, 8};
//    }
//
//    public static int summaArray(byte[] arr){
//        int summa = 0;
//        for(byte i = 0; i < arr.length; i++){
//
//
//        }
//    }
    }
}









//        8!!!!  ФУНКЦИИ (методы)((функции)) ДЖАВА !!!
//    public static void main(String[] args) {
////        info("Hello");
////        String java = "Java";
////        info(java);
////        info("");
//
//        short num = 7;
//        int result1 = summa((short) 5, num);
//
//        short num3 = 8;
//
//        int result2 = summa((short) 4, num3);
//        info(String.valueOf(result2));
//
//    }
//
//    public static int summa(short a, short b){
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        return res;
//    }
//
//
//
//    public static void info(String word) {
//        System.out.print(word);
//        System.out.println("!");
//    }




//      7! КОЛЛЕКЦИИ В JAVA !!!!    (ОШИБКА ПОЧЕМУ-ТО ГДЕ СЛОВО INDEX)(ты долбоеб братан, программа сама вводит это слово)
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add( 1, 30);
////        System.out.println(numbers.size());
//        System.out.println(numbers.get(1));
////        удаляет элемент с индексом 1
//        numbers.remove(1);
////        удаляет все элементы
//        numbers.clear();
//
//
//        for(Integer el : numbers){
//            System.out.println(el);
//        }

//        КОЛЛЕКЦИЯ LINKEDLIST!
//        LinkedList<Float> numbers = new LinkedList<>();
//        numbers.add(5.6f);
//        numbers.add(6.3f);
//        numbers.add(7.435f);
//
//        for(Float el: numbers)
//            System.out.println(el);










//        6 МАССИВЫ ДАННЫХ !

//    int[] nums = new int[5];
//       nums[0] = 45;
//       nums[1] = 32;
//       nums[2] = 1;
//       nums[3] = 9;
//       nums[4] = 3;
//       int res = nums[2] + nums[3];
//        System.out.println(res);
////      ЦИКЛЫ С МАССИВАМИ
//       float[] nums2 = new float[] {5.0f, 6.45f, 89.984f };
//        System.out.println(nums2[1]);
//
//        for(int i = 0; i < nums2.length; i++){
//            System.out.println("Element: " + nums2[i]);
//        }
//
//                ПРОГРАММА ДЛЯ ОПРЕДЕЛЕНИЯ МИНИМАЛЬНОГО ЧИСЛА
//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("Введите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < min)
//                min = arr[i];
//
//        }
//        System.out.println("Minimal: " + min);

//        Многомерные массивы данных!=)
//        char[][] syms = new char[2][2];
//        syms[0][0] = 't';
//        System.out.println(syms[0][0]);
//
//        byte[][] nums = new byte[][]{
//                {5, 7},
//                {7, 3},
//                {2, 0}
//        };
//        nums[1][1] = 67;
//        System.out.println(nums[1][1]);




//
//          5 ЦИКЛЫ
//                    FOR
//        for(float i = 100; i <= 1000; i *= 2) {
//            System.out.println("Element: " + i);
//        }
//                   WHILE
//        int i = 1;
//        while(i <= 10){
//            System.out.println("Element: " + i);
//            i++;
//
//        }
//           DO
//              в код в скобках do сто процентов один раз выполнится, даже если условие ниже не выполняется.
//          int i = 100;
////        do {
////            System.out.println("Element: " + i);
////            i *= 2 ;
////        } while(i < 10);
//
//          ОПЕРАТОР CONTINUE
// for(int i = 5; i < 25; i += 2) {
//            if(i % 3 == 0)
//                continue;
//            if(i >= 17)
//                break;
//            System.out.println("Element: " + i);
//        }

//                 ПРОГРАММКА 1000-7
//            for (int i = 1000; i > 0; i -= 7) {
//            System.out.println("Element: " + i);
//
//            if(i==6){
//
//            System.out.println("Я УМЕР ПРОСТИ ;(");}
//       }
//                    ПРОГРАММА ТАБЛИЦА УМНОЖЕНИЯ 1 МНОЖИТЕЛЯ
//    Scanner scanner = new Scanner (System.in);
//        System.out.print("Введите 1 множитель: ");
//        int a = scanner.nextInt();
//         for(int i = 1; i <= 10; i++) {
//             System.out.println("Element: " + a * i);
//        }





















        // Создание калькулятора

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int num2 = scanner.nextInt();
//        int res;
//
//        System.out.println("Введите действие: ");
//        String action = scanner.nextLine();
//        action = scanner.nextLine();
//        switch(action){
//            case "+":
//                res = num1+ num2;
//                System.out.println("Результат: " + res);
//                break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("Результат: " + res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("Результат: " + res);
//                break;
//            case "/":
//                if(num2 == 0){
//                    System.out.println("Error");
//                }
//                else {
//                res = num1 / num2;
//                System.out.println("Результат: " + res);
//                break;}
//            default:
//                System.out.println("Вы что-то не то ввели");













//        // 4 Условные конструкции if else. a == b if a >,<,==,!=,<=,>= b
//        int a = 15, b = 10;
//        boolean isHasCar = false;
//        if (isHasCar && a == b) {
//            System.out.println("Да, верно");
//        }
//        else if (a == b) {
//            System.out.println("Second test");
//        }
//        else if (a > b) {
//            System.out.println("3 test");
//        }
//        else if (a <= b) {
//            System.out.println("4 test");
//        }
//        else if (a == b) {
//            System.out.println("5 test");
//        }
//        else {
//            System.out.println("Нет, неверно");
//
//        }

// Практика
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите роль: ");
//        String role = scanner.nextLine();
//        System.out.print("Введите пароль: ");
//        String pass = scanner.nextLine();
//        if(role.equals("Admin")) && pass.equals("12345")){
//            System.out.println("Все пользователи: ");
//        }
//        else {
//            System.out.println("Привет, как вас зовут?");
//            String name = scanner.nextLine();
//        }

//       Операторы switch-case
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        switch(num) {
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("Number is 2");
//                break;
//            case 5:
//                System.out.println("Number is 5");
//                break;
//            case 10:
//                System.out.println("Number is 10");
//                break;
//            default:
//                System.out.println("Default");
//                break;
//        }
















            // УРОК 3
//    Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//                float num1 = scan.nextFloat();
//
//                System.out.print("Введите второе число: ");
//                float num2 = scan.nextFloat();
//
//                float res1 = num1 + num2;
//                float res2 = num1 - num2;
//                float res3 = num1 * num2;
//                float res4 = num1 / num2;
//
//                System.out.print("Результат: " + res1 + "\n"+ res2 + "\n" + res3 + "\n" + res4);

        /*System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);*/
// разные переменные и их вызов для пользователя
/*        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();*/
