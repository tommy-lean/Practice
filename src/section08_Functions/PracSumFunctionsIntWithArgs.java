package section08_Functions;

public class PracSumFunctionsIntWithArgs {
    public static void main(String[] args){
        System.out.println(sumOf());
        System.out.println(sumOf(1, 2, 3, 7));
        System.out.println(sumOf(1234, 5437, 2));
    }
    private static int sumOf(int... args){
        int sum = 0;
        for(int value : args){
            sum = sum + value;
        }
        return sum;
    }
}
