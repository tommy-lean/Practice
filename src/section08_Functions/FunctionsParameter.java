package section08_Functions;

public class FunctionsParameter {
    private static void function1(){

    }
    private static void function2(int a){

    }

    private static void function3(int firstParameter, int secondParameter){

    }

    private static void function4(boolean a, String b, double c){

    }

    private static void function5(int[] array1, double[] array2, boolean[][][] array3){

    }

    public static void main(String[] args){
        int a = 2;
        int b = 7;
        double e = 5.6;

        int[] array2 = new int[2];
        double[] array1 = new double[100];
        boolean[][][] array3 = new boolean[0][0][0];

        function1();
        function2(2);
        function3(a, b);
        function4(true, "Hello", e);
        function5(array2, array1, array3);

    }
}
