package section09_recurcion;

public class SUM1to100RECURSIONsout {
    public static void main(String[] args) {
        sumOfFrom1To100(0);
        sumOf(0, 1, 0);

    }

    private static void sumOfFrom1To100(int sum){

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    private static void sumOf(int sum, int from, int first){
        if(from > 100){
            System.out.println(sum);
        }
        else {
        sum = sum + from;
        System.out.println(first + " + " + from + " = " + sum);
        first = sum;
        sumOf(sum, from + 1, first);
        }

    }
}
