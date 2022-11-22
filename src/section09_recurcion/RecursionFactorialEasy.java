package section09_recurcion;

public class RecursionFactorialEasy {
    public static void main(String[] args){
        System.out.println(factorial(1, 1, 5));
    }
    private static int factorial(int count, int resultMultiply, int n){
        if(count > n){
            return resultMultiply;
        }
        else{
            return factorial(count + 1, resultMultiply * count, n);
        }
    }
}
