package udemy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class OutPractice {
    public static void main(String[] args) {
        var a = 4;
        var b = 5;

        var temp = a;
        a = b;
        b = temp;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


//        var a = 0;
//        a++;
//        ++a;
//        System.out.println(a);
//
//        Постфиксная запись
//        var b = a++;
////        b = a;     16 и 17 строчка то же самое что и 15
////        a = a + 1;
//        System.out.println(b);
//        System.out.println(a);
//          Префиксная запись
//        var c = ++a;
////        a = a + 1; то же самое что и строчка сверху
////          c = a;
//        System.out.println(c);
//        System.out.println(a);


//        var a = 0;
//        System.out.println(a);
//        a = 5;
//        System.out.println(a);
//        a = a + 2;  // короче можно записать так: a += 2; то же самое.
//        System.out.println(a);
//        a ++; // это то же самое что и a = a+1; и a += 1; a-- это a-1, a *= 2, a /= 2
//        System.out.println(a);


//        var a = true;
//        var b = false;
//        var c = 2 > 1;
//        var d = 2 == 1;
//
//        System.out.println(!a); // оператор !а означает, "не а". а = тру, и поэтому выведется false
//        System.out.println(!b); // b = false, а в консоли будет true.
//        System.out.println(a && b); // при операторе &&(и) чтобы было тру нужно, чтобы оба значения были тру, остальное false
//        System.out.println(a || b); // при операторе или || наоборот, всегда будет тру, кроме если два значения будет false


//        int a = 2;
//        int b = 5;
//        var c = a == b;       // одно и то же
//        boolean c2 = a == b;  // выражение. операции сравнения относятся к типу boolean


//              Операции с наиболее точным вычислением.
//        {
//            int a = 2;
//            double b = 1.1;
//            System.out.println(a - b);
//        }
//
//        BigDecimal a = new BigDecimal("2");
//        BigDecimal b = new BigDecimal("1.1");
//        BigDecimal c = a.subtract(b);
//        System.out.println(c);
//        {
////            Запись вычисления числа ПИ согласно архимеду 22/7
//            System.out.println(22./7.);
//            System.out.println(new BigDecimal("22").setScale(20).divide(new BigDecimal("7"), RoundingMode.HALF_UP));
//        }


////    var i = Integer.MAX_VALUE;
////        System.out.println(i + 1);
//
//        var i1 = Integer.MIN_VALUE;
//        System.out.println(i1 - 3);


//       String in = String.valueOf(1);
//       int str = Integer.parseInt("12");
//       double str2 = Double.parseDouble("1.2");
//       boolean sb = Boolean.parseBoolean("true");
//       char ch1 = "a".charAt(0);
//        char ch2 = "azrh".charAt(3);
//        System.out.println(ch2);
//
//        char ch = 2;
//        int i = 4;
//        double d = 8;
//
//        d = i;
//        d = ch;
//        i = ch;
//
//        i = (int) d;
//        ch = (char) i;
//        ch = (char) d;


