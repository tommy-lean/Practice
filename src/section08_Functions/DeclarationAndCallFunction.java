package section08_Functions;

public class DeclarationAndCallFunction {
    public static void main(String[] args) {
        int res = sumOf(2, 3);

        System.out.println(res);
    }
    private static int sumOf(int a, int b){
        return a + b;
    }
}
