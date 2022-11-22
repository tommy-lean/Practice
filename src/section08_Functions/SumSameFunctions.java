package section08_Functions;

public class SumSameFunctions {
    public static void main(String[] args){
        System.out.println("Short - " + sumOf((short)1, (short)2));
        System.out.println("Int - " + sumOf(1, 2));
        System.out.println("Long - " + sumOf( 1L, 2L));
        System.out.println("Float - " + sumOf(1f, 2f));
        System.out.println("Double - " + sumOf(1., 2.));
    }

    private static short sumOf(short a, short b){
        return (short)(a + b);
    }

    private static int sumOf(int a, int b){
        return a + b;
    }

    private static long sumOf(long a, long b){
        return (long)(a + b);
    }

    private static float sumOf(float a, float b){
        return a + b;
    }

    private static double sumOf(double a, double b){
        return a + b;
    }
}
