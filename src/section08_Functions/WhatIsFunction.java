package section08_Functions;

public class WhatIsFunction {
    public static void main(String[] args){
        int array[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int number = 2;
        int times = 0;


        times = getTimes(array, number, times);

        System.out.println(times);
    }
    // фрагмент кода занесенный в функцию программы, которая вычисляет количество повторений элемента в массиве
    private static int getTimes(int[] array, int number, int times) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == number){
                times += 1;
            }
        }
        return times;
    }
        // Это как раз код
//    int array[] = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
//    int number = 2;
//    int times = 0;
//
//
//        for (int i = 0; i < array.length ; i++) {
//        if(array[i] == number){
//            times += 1;
//        }
//    }
//
//        System.out.println(times);
}
