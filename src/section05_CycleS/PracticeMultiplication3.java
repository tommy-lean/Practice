package section05_CycleS;

public class PracticeMultiplication3 {
    public static void main(String[] args){
        int to = 9;
        int cols = 6;

        for (int r = 2; r <= to; r+=cols) {
            for (int i = 2; i <= to ; i++) {
                for (int j = r; j < r + cols && j <= to; j++) {
                    int res = i * j;
                    System.out.print(j + " * " + i + " = " + res + "\t");
                    
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}



        // МОЕ РЕШЕНИЕ ЗАДАЧИ
//        int to = 9;
//        int to2 = 5;
//
//        for(int i = 2; i <= to; i++){
//            for (int j = 2; j <= to2; j++) {
//
//                int res = i*j;
//                System.out.print(j + " * " + i + " = " + res + "\t");
//
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//
//        for(int i = 2; i <= to; i++){
//            for (int j = 6; j <= 9; j++) {
//                int res = i * j;
//                System.out.print(j + " * " + i + " = " + res + "\t");
//
//            }
//            System.out.println();
//        }

