package section06_array;

public class PracticeElementTimes {
    public static void main(String[] args){
        int array[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int number = 2;
        int times = 0;


        for (int i = 0; i < array.length ; i++) {
            if(array[i] == number){
                times += 1;
            }
        }

        System.out.println(times);
        // Вариант с foreach
//        for (int value : array) {
//            if(value == number){
//                times++;
//            }
//        }

//        System.out.println(times2);
    }
}
