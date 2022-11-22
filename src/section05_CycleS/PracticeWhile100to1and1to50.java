package section05_CycleS;

public class PracticeWhile100to1and1to50 {
    public static void main(String[] args) {
//        int from = 100;
//        int to = 1;
//
//        int i = from;
//        while(i >= to){
//            System.out.print(i-- + " ");
//        }

        int from = 0;
        int to = 50;
        int step = 2;

        int i = from;
        while(i <= 50){
            System.out.print(i + " ");
            i += step;
            }

        System.out.println("\nEnd");

        }
    }

