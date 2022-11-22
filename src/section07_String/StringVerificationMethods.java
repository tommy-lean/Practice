package section07_String;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world world";

        // метод проверяет содержится ли в s подстрока "world", ответ будет true;
        System.out.println("s.contains(\"world\") - " + s.contains("world"));
        // тут ответ будет false
        System.out.println("s.contains(\"World\") - " + s.contains("World"));

        // Определяет индекс символа "о" в строке первым
        System.out.println(s.indexOf('o'));
        // Тут определяет индекс последнего символа
        System.out.println(s.lastIndexOf('o'));

        System.out.println("s.indexOf(\"world\") = " + s.indexOf("world"));
        System.out.println("s.lastIndexOf(\"world\") = " + s.lastIndexOf("world"));
        // Определяет начинается ли строка с определенной подстроки и заканчивается ли
        System.out.println("s.startsWith(\"Hello\") = " + s.startsWith("Hello"));
        System.out.println("s.endsWith(\"Hello\") = " + s.endsWith("world!"));
        // проверяет является ли строка пустой
        System.out.println(s.isEmpty());

        System.out.println("".isEmpty());
    }
}
