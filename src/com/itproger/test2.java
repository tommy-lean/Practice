package com.itproger;


import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userMove = 3;
        String stringMove = "3";
        char cell1 = (char) userMove;
        char cell2 = stringMove.charAt(0);
        char ch = '3';
        if(ch == cell1){
            System.out.println("good char int");
        }
        if(ch == cell2){
            System.out.println("good char str");
        }
        System.out.println(userMove);
    }
}


//        {  int fact = 5;
//        int result = 1;
//
//        for (int i = 1; i <= fact; i++) {
//            result = result * i;
//        }
//
//        System.out.println(result);  }
//
//        System.out.println(fact(4, 1, 1));
//    }
//    private static int fact(int n, int result, int i){
//        if( i > n){
//            return result;
//        }
//        else{
//            fact(n, result * i, i+1);
//
//        }
//        return result;
//    }
//        System.out.println("1\t1");
//        System.out.println("1   1");
//        System.out.println("11\t11");
//        System.out.println("11  11");
//        System.out.println("111\t111");
//        System.out.println("111 111");
//        System.out.println("1111\t1111");
//        System.out.println("1111    1111");
//        System.out.println("11111\t11111");
//        System.out.println("111111\t111111");
//        System.out.println("1111111\t1111111");
//        System.out.println("11111111\t11111111");
//        System.out.println("11111111    11111111");
//        System.out.println("111111111111\t111111111111");
//        System.out.println("111111111111    111111111111");


// ПРОГРАММА ОПРЕДЕЛЯЮЩАЯ КОЛИЧЕСТВО ОТРИЦАТЕЛЬНЫХ ЭЛЕМЕНТОВ В МАССИВЕ
//        int array[] = {1, 1, 5, 4, 5};
//
//        int counter = 0;
//        String result;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] < 0){
//            counter += 1;
//            }
//        }
//        if(counter > 0){
//        result = "Количество отрицательных элементов: " + counter;
//        }
//        else{
//        result = "Все элементы положительные";
//        }
//
//        System.out.println(result);






    
    

