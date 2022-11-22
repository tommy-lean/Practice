package section05_CycleS;

public class PracticeDoWhile {
    public static void main(String[] args){
//        Программа выводящая числа от 100 до 1
        {int from = 100;
        int to = 1;


        int i = from;
        do{
            System.out.print(i-- + " ");

        }
        while(i>=to);}

        System.out.println();
//        Программа выводящая четные числа от 0 до 50.
        {int from = 0;
         int to = 50;

         int i = from;
         do{
             System.out.print(i + " ");
             i += 2;
         }
         while(i<=to);

            System.out.println("\nEnd");}

//            ПРОГРАММА КОТОРАЯ ПРОВЕРЯЕТ ВСЕ ЧИСЛА ОТ 0 ДО 50 И ВЫВОДИТ ТОЛЬКО ЧЕТНЫЕ ИЗ НИХ
//        int from = 0;
//        int to = 50;
//
//        int i = from;
//        do {
//            if(i%2 == 0) {
//                System.out.print(i + " ");
//                i++;
//            }
//            else{
//                i++;                              ---приплюсовываем единицу, чтобы было четное число
//                System.out.print(i + " ");
//                i++;                              ---прибавление единицы для цикла.
//            }
//        }
//        while (i <= to);
    }


}
