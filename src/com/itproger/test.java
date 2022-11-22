package com.itproger;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        char symbol = '4';
        boolean s = Character.isDigit(symbol);

        String text = "hello,,333 4 5 666 java,. world !java. hello,     I, Hello Java World java";
        StringBuilder wordBuilder = new StringBuilder();
        String[] wordsArray = new String[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                wordBuilder.append(ch);
            } else {
                if (wordBuilder.length() != 0) {
                    wordsArray[count++] = wordBuilder.toString();
                    wordBuilder.setLength(0);

                }
            }
        }
        if (wordBuilder.length() > 0) {
            wordsArray[count] = wordBuilder.toString();
            wordBuilder.setLength(0);
            count++;
        }
        String[] words = Arrays.copyOf(wordsArray,count);


        System.out.println(Arrays.toString(words));
    }

    private static boolean charIsNotSymbol(char ch) {
        boolean charIsNotSymbol = false;

        if (ch != ' ' & ch != '.' & ch != ',' & ch != '-' & ch != '!' & ch != '?' & ch != '/' & ch != '[' & ch != ']'
                & ch != '(' & ch != ')' & ch != ';' & ch != ':' & ch != '@' & ch != '"' & ch != '$' & ch != '%' &
                ch != '^' & ch != '&' & ch != '*' & ch != '_' & ch != '+' & ch != '=' & ch != '`' & ch != '~' &
                ch != '<' & ch != '>' & ch != '{' & ch != '}' & ch != '|' & ch != '\\' & ch != '\t') {
            charIsNotSymbol = true;
        }


        return charIsNotSymbol;
    }
}

//        int[] array = {1, 2, 3, 4, 5};
//        int temp = 0;
//        for (int i = 0; i < array.length/2; i++) {
//            temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//    }
// Программа по вычислению оценки за семестр ученика
//        int schoolMarks[] = {4, 5, 5};
//
//
//        int temp = 0;
//        int sum = 0;
//        for (int i = 0; i < schoolMarks.length; i++) {
//             sum  += schoolMarks[i];
//        }
//        BigDecimal Sum = new BigDecimal(sum);
//        BigDecimal length = new BigDecimal(schoolMarks.length) ;
//        BigDecimal average = Sum.divide(length, 100, RoundingMode.HALF_UP);
//
//        System.out.println("Average equals: " + average);


//                              КОНСТРУКЦИЯ С ТЕРНАРНЫМ ОПЕРАТОРОМ. К ТАКОМУ ЛУЧШЕ НЕ ПРИБЕГАТЬ, НЕ ЧИТАБЕЛЬНО
//                           НО ВСЕ РАВНО ТАК ВЫГЛЯДИТ АНАЛОГ КОДА С ТЕРНАРНЫМ ОПЕРАТОРОМ.
//        System.out.println(
//                (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 1 ? "Monday" :
//                        (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 2 ? "Tuesday" :
//                                (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 3 ? "Wednesday" :
//                                        (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 4 ? "Thursday" :
//                                                (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 5 ? "Friday" :
//                                                        (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 6 ? "Saturday" :
//                                                                (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 7 ? "Sunday" :
//                                                                        "Invalid day: " + day);



