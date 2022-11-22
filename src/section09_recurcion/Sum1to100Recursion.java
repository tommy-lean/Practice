package section09_recurcion;

public class Sum1to100Recursion {
    public static void main(String[] args) {
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(4));
    }

    private static int sumOf(int current, int sum){
        if(current > 3){
            return sum;
        }
        else{
            int newSum = sum + current;
            return sumOf(current + 1, newSum);
        }
    }


    private static int sumOf(int value){
        if(value == 0){
            return 0;
        }
        else{
            int prevSum = sumOf(value - 1);
            return value + prevSum;
        }
    }
}
