package section05_CycleS;

public class DoWhile {
    public static void main(String[] args){
        {
            int from = 100;
            int to = 1;

            int i = from;
            while (i >= to) {
                System.out.print(i-- + " ");
            }
        }
        System.out.println();
        {
            int i = 100;
            do{
                System.out.print(i-- + " ");
            }
            while (i>=1);
            System.out.println();
        }
    }
}
