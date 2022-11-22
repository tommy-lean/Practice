package udemy;

public class OperatorPrecedence {
    public static void main(String[] args){
        var a = 4;
        var b = 2 + -4 * 5 - a++ / 4 + --a;
        // при сложных вычислениях лучше ставить скобки
        a = 4;
        var c = 2 + ((-4) * 5) - ((a++) /4) + (--a);

        System.out.println(b);
        System.out.println(c);






        // лучше заносить в скобки 1+1 для упрощенного читания программы другими людьми, также и самому будет проще
        System.out.println("Hello " + 1 + 1); // выведется "Hello 11"
        System.out.println(1 + 1 + " Hello"); // выведется "2 Hello"
    }
}
