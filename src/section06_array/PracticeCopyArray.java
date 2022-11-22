package section06_array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeCopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source[] = {1, 2, 3, 4, 5};


        int destination[] = new int[source.length];
        System.out.println(Arrays.toString(destination));
        for(int i = 0; i < source.length; i++){
            destination[i] = source[i];
        }
        //System.arraycopy(source, 0, destination, 0, source.length);   метод копирования массивов без цикла

        System.out.println(Arrays.toString(destination));













        // МОЙ ВАРИАНТ РЕШЕНИЯ ИЗЁВЫЙ ДОВОЛЬНО :D
//        int array[] = {1, 2, 3, 4, 5};
//        int NewArray[] = {};
//
//        System.out.println("Введите цифру \"1\", если хотите скопировать и создать новый массив");
//        int choice = scanner.nextInt();
//        if(choice == 1){
//            NewArray = array;
//
//
//
//
//        }
//
//        System.out.println(Arrays.toString(NewArray) + " - Ваш массив");




    }
}
