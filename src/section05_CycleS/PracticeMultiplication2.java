package section05_CycleS;

public class PracticeMultiplication2 {
    public static void main(String[] args){
        int to = 9;

        for(int i = 2; i <= to; i++){
            for (int j = 2; j <= to; j++) {
                int res = i*j;
                System.out.println(i + " * " + j + " = " + res);

            }
            System.out.println();
        }
    }
}
