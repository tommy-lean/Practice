package section05_CycleS;

import java.sql.SQLOutput;

public class CyclesTable1to100 {
    public static void main(String[] args) {
//                         РОЛИК "ПОЭТАПНЫЙ ПОДХОД В РЕШЕНИИ СЛОЖНОЙ ЗАДАЧИ"
//            ПЕРВОЕ РЕШЕНИЕ, НО ДЛИННОЕ
//        int from = 1;
//        int to = 10;
//        int step = 1;
//
//        for(int i = from; i <= to; i += step){
//            System.out.print(i + " ");
//        }
//        from = 11;
//        to = 20;
//        for(int i = from; i <= to; i += step){
//            System.out.print(i + " ");
//        }
//        from = 21;
//        to = 30;
//        for(int i = from; i <= to; i += step) {
//            System.out.print(i + " ");
//        }
//        System.out.println("\nEnd");

//            ВТОРОЕ РЕШЕНИЕ НО РЕЗУЛЬТАТ НЕ СООТВЕТСТВУЕТ ЧУТЬ ЧУТЬ
//        int from = 1;
//        int to = 100;
//        int step = 1;
//
//        for (int i = from; i <= 100; i += step) {
//            if (i % 10 != 0) {
//                System.out.print(i + " ");
//            }
//            else{
//                System.out.print("\n" + i + " ");
//            }
//        }


//        ТРЕТЬЕ РЕШЕНИЕ, ДЛИННОЕ, НО КОРОЧЕ ПЕРВОГО
//        for(int i = 1; i <= 10 ; i++) {
//            System.out.print(i + "  ");
//        }
//        System.out.println();
//        for(int i = 11; i <= 20 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i = 21; i <= 30 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i = 31; i <= 40 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for(int i = 41; i <= 50 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//            МОЁ ГОТОВОЕ ЧЕТВЕРТОЕ РЕШЕНИЕ, КОТОРОЕ ПОЛНОСТЬЮ КАК Я СЧИТАЮ ЯВЛЯЕТСЯ РЕШЕНИЕМ ПРОБЛЕМЫ
//        int from = 1;
//        int to = 100;
//        int step = 1;
//
//        for (int i = from; i <= 100; i += step) {
//            if (i < 11) {
//                System.out.print(i + "  ");
//            } else if (i == 11 || i == 21 || i == 31 || i == 41 || i == 51 || i == 61 || i == 71 || i == 81 || i == 91) {
//
//                System.out.print("\n" + i + " ");
//
//            } else {
//                System.out.print(i + " ");
//            }
//        }
//
//
//            РЕШЕНИЕ КОТОРОЕ БЫЛО В РОЛИКЕ:
        int from = 1;
        int to = 100;
        int cols = 10;

        for(int i = from; i <= to; i++){
            System.out.print(i + "\t");
            if(i%cols == 0){
                System.out.println();
            }
        }
    }
}
