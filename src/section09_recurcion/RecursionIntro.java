package section09_recurcion;

public class RecursionIntro {
    public static void main(String[] args) {
        function1();
    }
        // сложная рекурсия, а простая это когда метод мейн вызывает самого себя
    private static void function1() {
        function2();
    }

    private static void function2() {
        function3();
    }

    private static void function3() {
        function1();
    }
}
