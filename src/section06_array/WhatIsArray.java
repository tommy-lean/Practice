package section06_array;

public class WhatIsArray {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // В фигурных скобках записаны значения
        int[] arrayWithValues = {1, 2, 3, 4, 5};
        double[] arrayWithValues2 = {1., 2., 3., 4., 5.};
        boolean[] arrayWithValues3 = {true, false, true, false, true};
        char[] arrayWithValues4 = {'1', '2', '3', '4', '5'};
        String[] arrayWithValues5 = {"1", "2", "3", "4", "5"};

        // Синтаксис с помощью которого можно указать размерность массива
        int[] arrayWithSize = new int[5];           // 0      <----в массиве сохранятся таких 5 штук данных
        double[] arrayWithSize2 = new double[5];   // 0.0
        boolean[] arrayWithSize3 = new boolean[5];// false
        char[] arrayWithSize4 = new char[5];      // \u0000
        String[] arrayWithSize5 = new String[5];  // null

        int[] emptyArray1 = {};
        int[] emptyArray2 = new int[0];
        int[] emptyArray3; // <--так массив не создается.


    }
}
