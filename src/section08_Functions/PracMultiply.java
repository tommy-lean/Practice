package section08_Functions;

public class PracMultiply {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        int result = multiplyOf(a, b);

        System.out.println("a * b = " + result);
    }
    private static int multiplyOf(int a, int b){
        return a * b;
    }
}
