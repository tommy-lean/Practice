package section05_CycleS;

public class PracticeMultiplicationTable {
    public static void main(String[] args) {

        int to = 20;

        for(int i = 1; i <= to; i++ ){
            for (int j = 1; j <= to ; j++) {
                int res = i * j;
                System.out.print((res == 1 ? "" : res) + "\t");

            }
            System.out.println();
        }
    // СНИЗУ МОЙ ВАРИАНТ РЕШЕНИЯ ЗАДАЧИ, НО ВЕРХНИЙ ПРЕДЕЛЬНО КРАТКИЙ И КЛАССНЫЙ

//        int to = 9;
//
//        System.out.print("\t");
//        for (int i = 2; i <= 9; i++) {
//            System.out.print(i + "\t");
//
//        }
//        System.out.println();
//        for (int i = 2; i <= to; i++) {
//            System.out.print(i + "\t");
//            for (int j = 2; j <= to ; j++) {
//                int res = i * j;
//                System.out.print(res + "\t");
//            }
//            System.out.println();
//        }

        // ВАРИАНТ РЕШЕНИЯ БЕЗ ТЕРНАРНОГО ОПЕРАТОРА С IF ELSE
//        int to = 15;
//
//
//        for (int i = 1; i <= to ; i++) {
//            for (int j = 1; j <= to; j++) {
//
//                int res = i * j;
//                if(res == 1){
//                    System.out.print("\t");
//                }
//                else {
//                    System.out.print(res + "\t");
//                }
//
//            }
//            System.out.println();
//        }



    }
}
