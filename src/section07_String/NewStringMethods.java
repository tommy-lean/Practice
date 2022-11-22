package section07_String;

import java.util.Arrays;

public class NewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world ";

        System.out.println("s.toUpperCase() - " + s.toUpperCase());
        System.out.println("s.toLowerCase() - " + s.toLowerCase());

        System.out.println("s.repeat(2) - " + s.repeat(2));
        // Только после этого все строки снизу изменятся, а так все методы  не изменяют строку, сами данные в переменной
        s = s.repeat(2);

        System.out.println(s.replace('l', 'j'));
        System.out.println(s.replace("Hello", "Bye"));

        System.out.println("s.substring(6) - " + s.substring(6));
        System.out.println("s.substring(0, 6) - " + s.substring(0, 6));

        System.out.println("s.split(\" \") - " + Arrays.toString(s.split(" ")));

        System.out.println(s.trim());
        // используем strip всегда, она универсальна, вышла позже, работает с символами из любой кодировки
        System.out.println(s.strip());



    }
}
