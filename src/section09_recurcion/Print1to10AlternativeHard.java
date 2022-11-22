package section09_recurcion;

public class Print1to10AlternativeHard {
    public static void main(String[] args) {
        printNumbers1to(100, 100);
    }

    // Это аналог программы вывода чисел, тут полезное действие выполняется после выполнения вызова рекурсии
    private static void printNumbers1to(int endNumber, int to) {
        if (endNumber != 0) {
            printNumbers1to(endNumber - 1, to);
            System.out.print(endNumber + "\t");
            if (endNumber == 10) {
                System.out.println(" End.");
            }
        }
    }
}
