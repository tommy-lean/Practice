package section05_CycleS;

import java.util.Scanner;

public class PracticeCycles0to50 {
    public static void main(String[] args) {
//        int from = 0;
//        int to = 50;
//        int step = 1;
//
//
//        String result;
//        for (int i = from; i <= to; i += step) {
//            if(i % 2 == 0){
//            result = i + " ";
//            System.out.print(i + " ");
//
//            }
//        }
//
//        System.out.println("\nEnd");

//        int from = 0;
//        int to = 50;
//        int step = 1;
//
//        int validFrom = from%2 == 0 ? from : from++;
//
//        for(int i = from; i <= to; i += step){
//            System.out.print(i + " ");
//        }
//        System.out.println("\nEnd");

//        int from = 1;
//        int to = 50;
//        int step = 2;
//
//
//         if(from%2 == 0){
//             from = from;
//         }
//         else{
//             from++;
//         }
//
//
//        for(int i = from; i <= to; i += step){
//            System.out.print(i + " ");
//        }
//        System.out.println("\nEnd");

        int from1 = 1;
        int to1 = 50;
        int step1 = 1;

        for(int i = from1; i <= to1; i+= step1){
            if(from1%2 == 0){

                if(i%2 == 0)
                System.out.print(i + " ");
                else{

                }
            }
            else{
                from1++;
                i = from1;
                System.out.print(i + " ");
            }


        }
        System.out.println("\nEnd");






    }
}
